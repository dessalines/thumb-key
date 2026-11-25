package com.dessalines.thumbkey.ui.components.keyboard

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.neverEqualPolicy
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.changedToDownIgnoreConsumed
import androidx.compose.ui.input.pointer.changedToUpIgnoreConsumed
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInWindow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import kotlin.math.ceil
import kotlin.math.log
import kotlin.math.pow

private const val FADE_PER_POINT = 0.95f
private val POINTS_WORTH_KEEPING = ceil(log(1f / 256f, FADE_PER_POINT)).toInt()
private const val TRAIL_PEAK_ALPHA = 0.85f
private const val TRAIL_MIN_STROKE_DP = 2f
private const val TRAIL_MAX_STROKE_DP = 8f
private const val TRAIL_MOVE_THRESHOLD_DP = 4f
private const val TRAIL_MIN_POINT_SPACING_PX = 1.5f
private const val TRAIL_FADE_OUT_MS = 250

internal class OffsetRingBuffer(
    capacity: Int,
) {
    private val slots = capacity + 1
    private val coords = FloatArray(slots * 2)
    private var readIndex = 0
    private var writeIndex = 0

    val size: Int
        get() = (writeIndex - readIndex).mod(slots)

    fun push(point: Offset) {
        val base = writeIndex * 2
        coords[base] = point.x
        coords[base + 1] = point.y
        writeIndex = (writeIndex + 1) % slots
        if (writeIndex == readIndex) {
            readIndex = (writeIndex + 1) % slots
        }
    }

    fun lastOrNull(): Offset? {
        if (readIndex == writeIndex) return null
        val prev = (writeIndex - 1).mod(slots) * 2
        return Offset(coords[prev], coords[prev + 1])
    }

    inline fun forEachIndexed(block: (index: Int, point: Offset) -> Unit) {
        var idx = readIndex
        var count = 0
        while (idx != writeIndex) {
            val base = idx * 2
            block(count++, Offset(coords[base], coords[base + 1]))
            idx = (idx + 1) % slots
        }
    }
}

class SwipeTrailState {
    var overlayOriginInWindow: Offset = Offset.Zero

    private val _trails = mutableStateListOf<Trail>()
    val trails: List<Trail> get() = _trails

    private val activeByPointer = HashMap<Long, Trail>()
    private var nextTrailId = 0L

    class Trail(
        val id: Long,
        val origin: Offset,
    ) {
        internal val points = OffsetRingBuffer(POINTS_WORTH_KEEPING)
        var movedPastThreshold: Boolean = false
        var isActive: Boolean by mutableStateOf(true)
        val fadeAnimatable = Animatable(1f)
        var needRedraw by mutableStateOf(Unit, neverEqualPolicy())
    }

    fun onPointerDown(
        pointerId: Long,
        posInOverlay: Offset,
    ) {
        activeByPointer.remove(pointerId)?.let { stale ->
            if (stale.movedPastThreshold) {
                stale.isActive = false
            } else {
                _trails.remove(stale)
            }
        }
        val trail = Trail(id = ++nextTrailId, origin = posInOverlay)
        trail.points.push(posInOverlay)
        activeByPointer[pointerId] = trail
        _trails.add(trail)
    }

    fun onPointerMove(
        pointerId: Long,
        posInOverlay: Offset,
        moveThresholdSq: Float,
    ) {
        val trail = activeByPointer[pointerId] ?: return
        if (!trail.movedPastThreshold && (posInOverlay - trail.origin).getDistanceSquared() >= moveThresholdSq) {
            trail.movedPastThreshold = true
        }
        val last = trail.points.lastOrNull()
        val minSpacingSq = TRAIL_MIN_POINT_SPACING_PX * TRAIL_MIN_POINT_SPACING_PX
        if (last == null || (posInOverlay - last).getDistanceSquared() >= minSpacingSq) {
            trail.points.push(posInOverlay)
            trail.needRedraw = Unit
        }
    }

    fun onPointerUp(
        pointerId: Long,
        posInOverlay: Offset?,
    ) {
        val trail = activeByPointer.remove(pointerId) ?: return
        if (!trail.movedPastThreshold) {
            _trails.remove(trail)
            return
        }
        if (posInOverlay != null) {
            val last = trail.points.lastOrNull()
            val minSpacingSq = TRAIL_MIN_POINT_SPACING_PX * TRAIL_MIN_POINT_SPACING_PX
            if (last == null || (posInOverlay - last).getDistanceSquared() >= minSpacingSq) {
                trail.points.push(posInOverlay)
                trail.needRedraw = Unit
            }
        }
        trail.isActive = false
    }

    fun removeTrail(trail: Trail) {
        _trails.remove(trail)
    }

    fun clear() {
        activeByPointer.clear()
        _trails.clear()
    }
}

@Composable
fun rememberSwipeTrailState(): SwipeTrailState = remember { SwipeTrailState() }

@Composable
fun Modifier.captureSwipeTrail(
    state: SwipeTrailState,
    enabled: Boolean,
): Modifier {
    if (!enabled) return this
    val density = LocalDensity.current
    val moveThresholdSq =
        with(density) {
            val px = TRAIL_MOVE_THRESHOLD_DP.dp.toPx()
            px * px
        }
    val captureOriginState = remember { mutableStateOf(Offset.Zero) }
    return this
        .onGloballyPositioned { coords ->
            captureOriginState.value = coords.positionInWindow()
        }.pointerInput(state, moveThresholdSq) {
            awaitPointerEventScope {
                while (true) {
                    val event = awaitPointerEvent(PointerEventPass.Initial)
                    val coordOffset = captureOriginState.value - state.overlayOriginInWindow
                    for (change in event.changes) {
                        val pos = change.position + coordOffset
                        when {
                            change.changedToDownIgnoreConsumed() -> state.onPointerDown(change.id.value, pos)
                            change.changedToUpIgnoreConsumed() || !change.pressed -> state.onPointerUp(change.id.value, pos)
                            else -> state.onPointerMove(change.id.value, pos, moveThresholdSq)
                        }
                    }
                }
            }
        }
}

@Composable
fun SwipeTrailOverlay(
    state: SwipeTrailState,
    modifier: Modifier = Modifier,
) {
    val trailColor = MaterialTheme.colorScheme.primary
    val trailTint = remember(trailColor) { ColorFilter.tint(trailColor) }
    val trailPaint =
        remember {
            Paint().apply {
                color = Color.Black
                strokeCap = StrokeCap.Round
                blendMode = BlendMode.Src
            }
        }

    for (trail in state.trails) {
        key(trail.id) {
            if (!trail.isActive) {
                LaunchedEffect(trail) {
                    trail.fadeAnimatable.animateTo(0f, tween(durationMillis = TRAIL_FADE_OUT_MS))
                    state.removeTrail(trail)
                }
            }
        }
    }

    Canvas(
        modifier =
            modifier
                .onGloballyPositioned { coords ->
                    state.overlayOriginInWindow = coords.positionInWindow()
                }.graphicsLayer(
                    compositingStrategy = CompositingStrategy.Offscreen,
                    colorFilter = trailTint,
                ),
    ) {
        val minStrokePx = TRAIL_MIN_STROKE_DP.dp.toPx()
        val maxStrokePx = TRAIL_MAX_STROKE_DP.dp.toPx()
        for (trail in state.trails) {
            trail.needRedraw
            val liftAlpha = trail.fadeAnimatable.value
            val count = trail.points.size
            if (!trail.movedPastThreshold || liftAlpha <= 0f || count < 2) continue
            drawIntoCanvas { canvas ->
                var previousPoint: Offset? = null
                trail.points.forEachIndexed { idx, pos ->
                    val headFactor = FADE_PER_POINT.pow((count - 1) - idx)
                    trailPaint.alpha = (TRAIL_PEAK_ALPHA * headFactor * liftAlpha).coerceIn(0f, 1f)
                    trailPaint.strokeWidth = minStrokePx + (maxStrokePx - minStrokePx) * headFactor
                    canvas.drawLine(
                        p1 = previousPoint ?: pos,
                        p2 = pos,
                        paint = trailPaint,
                    )
                    previousPoint = pos
                }
            }
        }
    }
}
