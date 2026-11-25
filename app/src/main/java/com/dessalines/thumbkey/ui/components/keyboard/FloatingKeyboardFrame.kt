package com.dessalines.thumbkey.ui.components.keyboard

import android.os.Build
import android.view.HapticFeedbackConstants
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.awaitTouchSlopOrCancellation
import androidx.compose.foundation.gestures.drag
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.IntState
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.changedToDownIgnoreConsumed
import androidx.compose.ui.input.pointer.changedToUpIgnoreConsumed
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.positionChange
import androidx.compose.ui.input.pointer.util.VelocityTracker
import androidx.compose.ui.layout.layout
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInWindow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.MAX_KEYBOARD_OPACITY
import com.dessalines.thumbkey.db.MIN_KEYBOARD_OPACITY
import com.dessalines.thumbkey.utils.FloatingHandlePosition
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlin.math.abs
import kotlin.math.roundToInt

private const val SNAP_EDGE_THRESHOLD_DP = 28f
private const val FLING_VELOCITY_THRESHOLD_DP_PER_SEC = 550f
private const val SNAP_ANIMATION_MS = 160
private const val HANDLE_IDLE_TIMEOUT_MS = 2500L
private const val HANDLE_ALPHA_IDLE = 0.15f
private const val HANDLE_ALPHA_ACTIVE = 0.55f
private const val HANDLE_ALPHA_HELD = 1.0f
private val HANDLE_TOUCH_HEIGHT = 22.dp
private val HANDLE_PILL_GAP = 4.dp
private val HANDLE_PILL_HEIGHT = 4.dp

internal enum class FloatingSnapEdge {
    LEFT,
    RIGHT,
}

internal fun resolveSnapTargetX(
    rawX: Float,
    slackX: Float,
    velocityX: Float,
    velocityY: Float,
    snapThresholdPx: Float,
    flingVelocityThresholdPx: Float,
): Pair<Float, FloatingSnapEdge?> {
    if (slackX <= 0f) return 0f to null
    if (abs(velocityX) >= flingVelocityThresholdPx && abs(velocityX) > abs(velocityY) * 1.2f) {
        return if (velocityX < 0f) {
            0f to FloatingSnapEdge.LEFT
        } else {
            slackX to FloatingSnapEdge.RIGHT
        }
    }
    return when {
        rawX <= snapThresholdPx -> 0f to FloatingSnapEdge.LEFT
        slackX - rawX <= snapThresholdPx -> slackX to FloatingSnapEdge.RIGHT
        else -> rawX.coerceIn(0f, slackX) to null
    }
}

internal fun resolveFlipTargetX(
    currentX: Float,
    slackX: Float,
): Float {
    if (slackX <= 0f) return 0f
    return if (currentX < slackX * 0.5f) slackX else 0f
}

private data class FloatingPin(
    val offset: Offset,
    val boxWidthPx: Int,
    val panelWidthPx: Int,
)

private class FloatingGestureState {
    var active = false
    var animating = false
    var panelSize = IntSize.Zero
    var frameOriginInWindow = IntOffset.Zero
    var bounds: IntRect? = null
    var pendingPosition: Offset? = null
    var snapJob: Job? = null
}

@Composable
fun FloatingKeyboardFrame(
    keyWidth: Float,
    keyHeight: Float,
    columns: Int,
    keyboardOpacity: Int,
    handlePosition: FloatingHandlePosition,
    floatingXFraction: Float,
    floatingYFraction: Float,
    vibrateOnTap: Boolean,
    onMoved: (Float, Float) -> Unit,
    onBounds: (IntRect) -> Unit,
    overlay: @Composable BoxScope.() -> Unit = {},
    content: @Composable (keyWidth: Float, keyHeight: Float) -> Unit,
) {
    val density = LocalDensity.current
    val view = LocalView.current
    val coroutineScope = rememberCoroutineScope()
    val slideHapticConstant =
        if (Build.VERSION.SDK_INT >= 27) {
            HapticFeedbackConstants.TEXT_HANDLE_MOVE
        } else {
            HapticFeedbackConstants.KEYBOARD_TAP
        }

    val gesture = remember { FloatingGestureState() }
    val dragPin = remember { mutableStateOf<FloatingPin?>(null) }
    val dragShift = remember { mutableStateOf(Offset.Zero) }
    val snapIndicatorEdge = remember { mutableStateOf<FloatingSnapEdge?>(null) }
    val isDragging = remember { mutableStateOf(false) }
    val isHandlePressed = remember { mutableStateOf(false) }
    val lastActivityTick = remember { mutableIntStateOf(0) }

    val storedPosition = Offset(floatingXFraction.coerceIn(0f, 1f), floatingYFraction.coerceIn(0f, 1f))
    LaunchedEffect(storedPosition) {
        val pending = gesture.pendingPosition
        when {
            pending != null && abs(pending.x - storedPosition.x) < 0.002f && abs(pending.y - storedPosition.y) < 0.002f -> {
                gesture.pendingPosition = null
            }

            pending == null && !gesture.active && !gesture.animating -> {
                dragPin.value = null
            }
        }
    }

    BoxWithConstraints(
        modifier =
            Modifier
                .fillMaxSize()
                .safeDrawingPadding()
                .onGloballyPositioned { coords ->
                    val pos = coords.positionInWindow()
                    gesture.frameOriginInWindow = IntOffset(pos.x.roundToInt(), pos.y.roundToInt())
                },
    ) {
        val boxWidthPx = constraints.maxWidth
        val boxHeightPx = constraints.maxHeight
        val boxWidthDp = with(density) { boxWidthPx.toDp().value }.coerceAtLeast(1f)
        val safeColumns = columns.coerceAtLeast(1)
        val maxKeyWidthDp = (boxWidthDp / safeColumns).coerceAtLeast(1f)
        val effectiveKeyWidth = keyWidth.coerceIn(1f, maxKeyWidthDp)
        val effectiveKeyHeight = keyHeight.coerceAtLeast(1f)
        val panelWidthDp = (effectiveKeyWidth * safeColumns).coerceAtMost(boxWidthDp)
        val panelWidthPx = with(density) { panelWidthDp.dp.roundToPx() }.coerceIn(1, boxWidthPx.coerceAtLeast(1))
        val snapThresholdPx = with(density) { SNAP_EDGE_THRESHOLD_DP.dp.toPx() }
        val flingVelocityThresholdPx = with(density) { FLING_VELOCITY_THRESHOLD_DP_PER_SEC.dp.toPx() }

        fun slackX(panelWidth: Int = gesture.panelSize.width): Float = (boxWidthPx - panelWidth).coerceAtLeast(0).toFloat()

        fun slackY(panelHeight: Int = gesture.panelSize.height): Float = (boxHeightPx - panelHeight).coerceAtLeast(0).toFloat()

        fun pinned(): Offset? =
            dragPin.value
                ?.takeIf { it.boxWidthPx == boxWidthPx && it.panelWidthPx == panelWidthPx }
                ?.offset

        fun pin(offset: Offset) {
            dragPin.value =
                FloatingPin(
                    offset = offset,
                    boxWidthPx = boxWidthPx,
                    panelWidthPx = panelWidthPx,
                )
        }

        fun currentOffset(
            panelWidth: Int = gesture.panelSize.width,
            panelHeight: Int = gesture.panelSize.height,
        ): Offset {
            val sx = slackX(panelWidth)
            val sy = slackY(panelHeight)
            val raw =
                pinned() ?: Offset(
                    storedPosition.x * sx,
                    storedPosition.y * sy,
                )
            return Offset(raw.x.coerceIn(0f, sx), raw.y.coerceIn(0f, sy))
        }

        fun publishBounds() {
            gesture.bounds?.let(onBounds)
        }

        fun persistPosition(
            end: Offset,
            sx: Float,
            sy: Float,
        ) {
            val moved =
                Offset(
                    if (sx > 0f) (end.x / sx).coerceIn(0f, 1f) else 0.5f,
                    if (sy > 0f) (end.y / sy).coerceIn(0f, 1f) else 1.0f,
                )
            if (moved != storedPosition) {
                gesture.pendingPosition = moved
            }
            onMoved(moved.x, moved.y)
        }

        fun settleAt(
            target: Offset,
            sx: Float,
            sy: Float,
        ) {
            pin(target)
            dragShift.value = Offset.Zero
            gesture.bounds =
                IntRect(
                    offset = gesture.frameOriginInWindow + IntOffset(target.x.roundToInt(), target.y.roundToInt()),
                    size = gesture.panelSize,
                )
            publishBounds()
            persistPosition(target, sx, sy)
        }

        fun animateToOffset(
            base: Offset,
            startShift: Offset,
            target: Offset,
            sx: Float,
            sy: Float,
        ) {
            val currentPos = base + startShift
            if ((target - currentPos).getDistance() < 1f) {
                settleAt(target, sx, sy)
                return
            }
            gesture.snapJob?.cancel()
            gesture.snapJob =
                coroutineScope.launch {
                    gesture.animating = true
                    try {
                        val anim = Animatable(0f)
                        anim.animateTo(
                            targetValue = 1f,
                            animationSpec = tween(durationMillis = SNAP_ANIMATION_MS, easing = FastOutSlowInEasing),
                        ) {
                            val f = value
                            dragShift.value =
                                Offset(
                                    startShift.x + (target.x - base.x - startShift.x) * f,
                                    startShift.y + (target.y - base.y - startShift.y) * f,
                                )
                        }
                        settleAt(target, sx, sy)
                    } finally {
                        gesture.animating = false
                    }
                }
        }

        fun flipSide() {
            if (gesture.active) return
            val sx = slackX()
            val sy = slackY()
            if (sx <= 0f) return
            gesture.snapJob?.cancel()
            val currentPos = currentOffset() + dragShift.value
            val clamped = Offset(currentPos.x.coerceIn(0f, sx), currentPos.y.coerceIn(0f, sy))
            val targetX = resolveFlipTargetX(clamped.x, sx)
            pin(clamped)
            dragShift.value = Offset.Zero
            if (vibrateOnTap) {
                view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP)
            }
            animateToOffset(
                base = clamped,
                startShift = Offset.Zero,
                target = Offset(targetX, clamped.y),
                sx = sx,
                sy = sy,
            )
        }

        val snapEdge = snapIndicatorEdge.value
        if (snapEdge != null && gesture.panelSize.height > 0) {
            val indicatorHeightDp = with(density) { gesture.panelSize.height.toDp() }
            val alignment = if (snapEdge == FloatingSnapEdge.LEFT) Alignment.TopStart else Alignment.TopEnd
            Box(
                modifier =
                    Modifier
                        .align(alignment)
                        .offset {
                            val indicatorTopPx = (currentOffset().y + dragShift.value.y).roundToInt().coerceAtLeast(0)
                            IntOffset(0, indicatorTopPx)
                        }.padding(horizontal = 2.dp, vertical = 12.dp)
                        .width(4.dp)
                        .height((indicatorHeightDp - 24.dp).coerceAtLeast(24.dp))
                        .clip(RoundedCornerShape(2.dp))
                        .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.75f)),
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier =
                Modifier
                    .layout { measurable, constraints ->
                        val measuredWidthPx = panelWidthPx.coerceIn(1, constraints.maxWidth.coerceAtLeast(1))
                        val placeable =
                            measurable.measure(
                                constraints.copy(
                                    minWidth = measuredWidthPx,
                                    maxWidth = measuredWidthPx,
                                ),
                            )
                        gesture.panelSize = IntSize(placeable.width, placeable.height)
                        layout(placeable.width, placeable.height) {
                            val pos = currentOffset(placeable.width, placeable.height)
                            placeable.place(pos.x.roundToInt(), pos.y.roundToInt())
                        }
                    }.graphicsLayer {
                        val shift = dragShift.value
                        translationX = shift.x
                        translationY = shift.y
                    }.onGloballyPositioned { coords ->
                        if (!gesture.active && !gesture.animating) {
                            val pos = coords.positionInWindow()
                            gesture.bounds =
                                IntRect(
                                    offset = IntOffset(pos.x.roundToInt(), pos.y.roundToInt()),
                                    size = coords.size,
                                )
                            publishBounds()
                        }
                    },
        ) {
            val dragHandle = @Composable { atTop: Boolean ->
                FloatingDragHandle(
                    atTop = atTop,
                    panelWidthDp = panelWidthDp,
                    isPressed = isHandlePressed.value,
                    isDragging = isDragging.value,
                    activityTick = lastActivityTick,
                    onPressChanged = { pressed ->
                        isHandlePressed.value = pressed
                        if (pressed) {
                            lastActivityTick.intValue += 1
                        }
                    },
                    onDoubleTap = { flipSide() },
                    onDragStart = {
                        gesture.snapJob?.cancel()
                        gesture.snapJob = null
                        gesture.animating = false
                        val sx = slackX()
                        val sy = slackY()
                        val currentPos = currentOffset() + dragShift.value
                        val clamped = Offset(currentPos.x.coerceIn(0f, sx), currentPos.y.coerceIn(0f, sy))
                        pin(clamped)
                        dragShift.value = Offset.Zero
                        gesture.active = true
                        isDragging.value = true
                    },
                    onDragBy = { delta ->
                        val base = pinned() ?: return@FloatingDragHandle
                        val sx = slackX()
                        val sy = slackY()
                        val shift = dragShift.value
                        val nextX = (base.x + shift.x + delta.x).coerceIn(0f, sx)
                        val nextY = (base.y + shift.y + delta.y).coerceIn(0f, sy)
                        dragShift.value = Offset(nextX - base.x, nextY - base.y)
                        val edge =
                            when {
                                sx <= 0f -> null
                                nextX <= snapThresholdPx -> FloatingSnapEdge.LEFT
                                sx - nextX <= snapThresholdPx -> FloatingSnapEdge.RIGHT
                                else -> null
                            }
                        if (edge != snapIndicatorEdge.value) {
                            if (edge != null && vibrateOnTap) {
                                view.performHapticFeedback(slideHapticConstant)
                            }
                            snapIndicatorEdge.value = edge
                        }
                    },
                    onDragEnd = { velocity ->
                        gesture.active = false
                        isDragging.value = false
                        snapIndicatorEdge.value = null
                        val base = pinned() ?: return@FloatingDragHandle
                        val shift = dragShift.value
                        val sx = slackX()
                        val sy = slackY()
                        val rawX = (base.x + shift.x).coerceIn(0f, sx)
                        val endY = (base.y + shift.y).coerceIn(0f, sy)
                        val (targetX, snappedEdge) =
                            resolveSnapTargetX(
                                rawX = rawX,
                                slackX = sx,
                                velocityX = velocity.x,
                                velocityY = velocity.y,
                                snapThresholdPx = snapThresholdPx,
                                flingVelocityThresholdPx = flingVelocityThresholdPx,
                            )
                        if (snappedEdge != null && vibrateOnTap) {
                            view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP)
                        }
                        animateToOffset(
                            base = base,
                            startShift = shift,
                            target = Offset(targetX, endY),
                            sx = sx,
                            sy = sy,
                        )
                    },
                )
            }

            if (handlePosition == FloatingHandlePosition.Top) {
                dragHandle(true)
            }

            val bodyOpacityModifier =
                if (keyboardOpacity < MAX_KEYBOARD_OPACITY) {
                    Modifier.graphicsLayer {
                        alpha = (keyboardOpacity / 100f).coerceIn(MIN_KEYBOARD_OPACITY / 100f, 1f)
                        compositingStrategy = CompositingStrategy.Offscreen
                    }
                } else {
                    Modifier
                }
            Box(
                modifier =
                    Modifier
                        .pointerInput(Unit) {
                            awaitPointerEventScope {
                                while (true) {
                                    val event = awaitPointerEvent(PointerEventPass.Initial)
                                    if (event.changes.any { it.changedToDownIgnoreConsumed() || it.changedToUpIgnoreConsumed() }) {
                                        lastActivityTick.intValue += 1
                                    }
                                }
                            }
                        },
            ) {
                Box(modifier = bodyOpacityModifier) {
                    content(effectiveKeyWidth, effectiveKeyHeight)
                }
                overlay()
            }

            if (handlePosition == FloatingHandlePosition.Bottom) {
                dragHandle(false)
            }
        }
    }
}

@Composable
private fun FloatingDragHandle(
    atTop: Boolean,
    panelWidthDp: Float,
    isPressed: Boolean,
    isDragging: Boolean,
    activityTick: IntState,
    onPressChanged: (Boolean) -> Unit,
    onDoubleTap: () -> Unit,
    onDragStart: () -> Unit,
    onDragBy: (Offset) -> Unit,
    onDragEnd: (Offset) -> Unit,
) {
    val pressChanged by rememberUpdatedState(onPressChanged)
    val dragStart by rememberUpdatedState(onDragStart)
    val dragBy by rememberUpdatedState(onDragBy)
    val dragEnd by rememberUpdatedState(onDragEnd)
    val doubleTap by rememberUpdatedState(onDoubleTap)

    var isKeyboardActive by remember { mutableStateOf(true) }
    LaunchedEffect(activityTick, isPressed, isDragging) {
        snapshotFlow { Triple(activityTick.intValue, isPressed, isDragging) }
            .collectLatest { (_, pressed, dragging) ->
                isKeyboardActive = true
                if (!pressed && !dragging) {
                    delay(HANDLE_IDLE_TIMEOUT_MS)
                    isKeyboardActive = false
                }
            }
    }

    val highlighted = isPressed || isDragging
    val targetAlpha =
        when {
            highlighted -> HANDLE_ALPHA_HELD
            isKeyboardActive -> HANDLE_ALPHA_ACTIVE
            else -> HANDLE_ALPHA_IDLE
        }
    val pillAlpha by animateFloatAsState(
        targetValue = targetAlpha,
        animationSpec = tween(durationMillis = if (highlighted || isKeyboardActive) 150 else 400),
        label = "floatingHandleAlpha",
    )
    val targetWidthDp =
        if (highlighted) {
            minOf(54f, (panelWidthDp * 0.85f).coerceAtLeast(20f))
        } else {
            minOf(44f, (panelWidthDp * 0.65f).coerceAtLeast(16f))
        }.coerceAtMost(panelWidthDp)
    val pillWidth by animateDpAsState(
        targetValue = targetWidthDp.dp,
        animationSpec = tween(durationMillis = 150),
        label = "floatingHandleWidth",
    )
    val pillColor by animateColorAsState(
        targetValue = if (highlighted) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary,
        animationSpec = tween(durationMillis = 150),
        label = "floatingHandleColor",
    )
    val dragDescription = stringResource(R.string.floating_drag_handle)

    Box(
        modifier =
            Modifier
                .fillMaxWidth()
                .height(HANDLE_TOUCH_HEIGHT)
                .semantics { contentDescription = dragDescription }
                .pointerInput(Unit) {
                    val doubleTapTimeout = viewConfiguration.doubleTapTimeoutMillis
                    var lastTapUpTime = 0L
                    awaitEachGesture {
                        val down = awaitFirstDown(requireUnconsumed = false)
                        pressChanged(true)
                        try {
                            val velocityTracker = VelocityTracker()
                            var cumulative = Offset.Zero
                            var dragStarted = false
                            var pointerCancelled = false

                            val afterSlop =
                                awaitTouchSlopOrCancellation(down.id) { change, over ->
                                    change.consume()
                                    if (!dragStarted) {
                                        dragStarted = true
                                        lastTapUpTime = 0L
                                        dragStart()
                                    }
                                    cumulative += over
                                    velocityTracker.addPosition(change.uptimeMillis, cumulative)
                                    dragBy(over)
                                }

                            if (dragStarted) {
                                if (afterSlop != null) {
                                    val finished =
                                        drag(afterSlop.id) { change ->
                                            val delta = change.positionChange()
                                            change.consume()
                                            cumulative += delta
                                            velocityTracker.addPosition(change.uptimeMillis, cumulative)
                                            dragBy(delta)
                                        }
                                    if (!finished) {
                                        pointerCancelled = true
                                    }
                                }
                                val vel =
                                    if (pointerCancelled) {
                                        Offset.Zero
                                    } else {
                                        val v = velocityTracker.calculateVelocity()
                                        Offset(v.x, v.y)
                                    }
                                dragEnd(vel)
                            } else if (afterSlop == null) {
                                val upChange = currentEvent.changes.firstOrNull { it.id == down.id }
                                if (upChange != null && !upChange.pressed) {
                                    val now = upChange.uptimeMillis
                                    if (lastTapUpTime != 0L && now - lastTapUpTime <= doubleTapTimeout) {
                                        lastTapUpTime = 0L
                                        doubleTap()
                                    } else {
                                        lastTapUpTime = now
                                    }
                                }
                            }
                        } finally {
                            pressChanged(false)
                        }
                    }
                },
        contentAlignment = if (atTop) Alignment.BottomCenter else Alignment.TopCenter,
    ) {
        Box(
            modifier =
                Modifier
                    .padding(
                        top = if (atTop) 0.dp else HANDLE_PILL_GAP,
                        bottom = if (atTop) HANDLE_PILL_GAP else 0.dp,
                    ).width(pillWidth)
                    .height(HANDLE_PILL_HEIGHT)
                    .graphicsLayer { alpha = pillAlpha }
                    .clip(RoundedCornerShape(HANDLE_PILL_HEIGHT / 2))
                    .background(pillColor),
        )
    }
}
