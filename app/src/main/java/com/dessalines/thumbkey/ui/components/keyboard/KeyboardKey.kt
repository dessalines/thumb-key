package com.dessalines.thumbkey.ui.components.keyboard
import android.content.Context
import android.media.AudioManager
import android.os.Build
import android.view.HapticFeedbackConstants
import android.view.KeyEvent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.lerp
import com.dessalines.thumbkey.IMEService
import com.dessalines.thumbkey.utils.CircularDirection
import com.dessalines.thumbkey.utils.CircularDragAction
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardDefinitionSettings
import com.dessalines.thumbkey.utils.KeyboardPosition
import com.dessalines.thumbkey.utils.Selection
import com.dessalines.thumbkey.utils.SlideType
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.SwipeNWay
import com.dessalines.thumbkey.utils.buildTapActions
import com.dessalines.thumbkey.utils.circularDirection
import com.dessalines.thumbkey.utils.colorVariantToColor
import com.dessalines.thumbkey.utils.doneKeyAction
import com.dessalines.thumbkey.utils.fontSizeVariantToFontSize
import com.dessalines.thumbkey.utils.isPasswordField
import com.dessalines.thumbkey.utils.performKeyAction
import com.dessalines.thumbkey.utils.pxToSp
import com.dessalines.thumbkey.utils.slideCursorDistance
import com.dessalines.thumbkey.utils.startSelection
import com.dessalines.thumbkey.utils.swipeDirection
import com.dessalines.thumbkey.utils.toPx
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min
import kotlin.time.Duration.Companion.seconds
import kotlin.time.TimeMark
import kotlin.time.TimeSource

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun KeyboardKey(
    key: KeyItemC,
    // Hidden background key to detect swipes for. When a swipe isn't captured by the key, the ghost
    // key will attempt to capture it instead. This is derived automatically from the keyboard
    // layout, and should not be set directly in the keyboard definition.
    ghostKey: KeyItemC? = null,
    lastAction: MutableState<Pair<KeyAction, TimeMark>?>,
    animationHelperSpeed: Int,
    animationSpeed: Int,
    autoCapitalize: Boolean,
    keyboardSettings: KeyboardDefinitionSettings,
    spacebarMultiTaps: Boolean,
    vibrateOnTap: Boolean,
    vibrateOnSlide: Boolean,
    soundOnTap: Boolean,
    hideLetters: Boolean,
    hideSymbols: Boolean,
    capsLock: Boolean,
    legendHeight: Int,
    legendWidth: Int,
    keyPadding: Int,
    keyHeight: Float,
    keyWidth: Float,
    keyBorderWidth: Float,
    keyRadius: Float,
    minSwipeLength: Int,
    slideSensitivity: Int,
    slideEnabled: Boolean,
    slideCursorMovementMode: Int,
    slideSpacebarDeadzoneEnabled: Boolean,
    slideBackspaceDeadzoneEnabled: Boolean,
    onToggleShiftMode: (enable: Boolean) -> Unit,
    onToggleCtrlMode: (enable: Boolean) -> Unit,
    onToggleAltMode: (enable: Boolean) -> Unit,
    onToggleNumericMode: (enable: Boolean) -> Unit,
    onToggleEmojiMode: (enable: Boolean) -> Unit,
    onToggleClipboardMode: (enable: Boolean) -> Unit,
    onToggleCapsLock: () -> Unit,
    onToggleHideLetters: () -> Unit,
    onAutoCapitalize: (enable: Boolean) -> Unit,
    onSwitchLanguage: () -> Unit,
    onChangePosition: ((old: KeyboardPosition) -> KeyboardPosition) -> Unit,
    onKeyEvent: () -> Unit,
    oppositeCaseKey: KeyItemC? = null,
    numericKey: KeyItemC? = null,
    dragReturnEnabled: Boolean,
    circularDragEnabled: Boolean,
    clockwiseDragAction: CircularDragAction,
    counterclockwiseDragAction: CircularDragAction,
) {
    // Necessary for swipe settings to get updated correctly
    val id =
        key.toString() + ghostKey.toString() + animationHelperSpeed + animationSpeed + autoCapitalize +
            vibrateOnTap + vibrateOnSlide + soundOnTap + legendHeight + legendWidth + minSwipeLength +
            slideSensitivity + slideEnabled + slideCursorMovementMode + slideSpacebarDeadzoneEnabled +
            slideBackspaceDeadzoneEnabled + dragReturnEnabled + circularDragEnabled +
            clockwiseDragAction.ordinal + counterclockwiseDragAction.ordinal

    val ctx = LocalContext.current
    val ime = ctx as IMEService
    val scope = rememberCoroutineScope()

    // Don't show animations for password fields
    val isPasswordField by remember { mutableStateOf(isPasswordField(ime)) }

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    val isDragged = remember { mutableStateOf(false) }
    val releasedKey = remember { mutableStateOf<String?>(null) }

    var tapCount by remember { mutableIntStateOf(0) }
    val tapActions =
        if (spacebarMultiTaps) {
            buildTapActions(key)
        } else {
            listOf(key.center.action)
        }

    var offsetX by remember { mutableFloatStateOf(0f) }
    var offsetY by remember { mutableFloatStateOf(0f) }
    var hasSlideMoveCursorTriggered by remember { mutableStateOf(false) }
    var timeOfLastAccelerationInput by remember { mutableLongStateOf(0L) }
    var positions by remember { mutableStateOf(listOf<Offset>()) }
    var maxOffset by remember { mutableStateOf(Offset(0f, 0f)) }

    var selection by remember { mutableStateOf(Selection()) }

    val backgroundColor =
        if (!(isDragged.value || isPressed)) {
            colorVariantToColor(colorVariant = key.backgroundColor)
        } else {
            MaterialTheme.colorScheme.inversePrimary
        }

    val keyBorderColour = MaterialTheme.colorScheme.outline
    val keySize = (keyHeight + keyWidth) / 2.0
    val view = LocalView.current
    val audioManager = ctx.getSystemService(Context.AUDIO_SERVICE) as AudioManager

    LaunchedEffect(key1 = isPressed) {
        if (isPressed) {
            if (vibrateOnTap) {
                // This is a workaround for only having LongPress
                // https://stackoverflow.com/questions/68333741/how-to-perform-a-haptic-feedback-in-jetpack-compose
                view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP)
            }
            if (soundOnTap) {
                audioManager.playSoundEffect(AudioManager.FX_KEY_CLICK, .1f)
            }
        }
    }

    val keyboardKeyModifier =
        Modifier
            .height(keyHeight.dp)
            .width(keyWidth.dp * key.widthMultiplier)
            .padding(keyPadding.dp)
            .clip(RoundedCornerShape(keyRadius.dp))
            .then(
                if (keyBorderWidth > 0.0) {
                    Modifier.border(
                        keyBorderWidth.dp,
                        keyBorderColour,
                        shape = RoundedCornerShape(keyRadius.dp),
                    )
                } else {
                    (Modifier)
                },
            ).background(color = backgroundColor)
            // Note: pointerInput has a delay when switching keyboards, so you must use this
            .combinedClickable(
                interactionSource = interactionSource,
                indication = null,
                hapticFeedbackEnabled = false, // We manually trigger haptics instead
                onClick = {
                    // Set the last key info, and the tap count
                    val cAction = key.center.action
                    lastAction.value?.let { (lastAction, time) ->
                        if (time.elapsedNow() < 1.seconds && lastAction == cAction && !ime.didCursorMove()) {
                            tapCount += 1
                        } else {
                            tapCount = 0
                        }
                    }
                    lastAction.value = Pair(cAction, TimeSource.Monotonic.markNow())

                    // Set the correct action
                    val action = tapActions[tapCount % tapActions.size]
                    performKeyAction(
                        action = action,
                        ime = ime,
                        autoCapitalize = autoCapitalize,
                        keyboardSettings = keyboardSettings,
                        onToggleShiftMode = onToggleShiftMode,
                        onToggleCtrlMode = onToggleCtrlMode,
                        onToggleAltMode = onToggleAltMode,
                        onToggleNumericMode = onToggleNumericMode,
                        onToggleEmojiMode = onToggleEmojiMode,
                        onToggleClipboardMode = onToggleClipboardMode,
                        onToggleCapsLock = onToggleCapsLock,
                        onToggleHideLetters = onToggleHideLetters,
                        onAutoCapitalize = onAutoCapitalize,
                        onSwitchLanguage = onSwitchLanguage,
                        onChangePosition = onChangePosition,
                        onKeyEvent = onKeyEvent,
                    )
                    doneKeyAction(scope, action, isDragged, releasedKey, animationHelperSpeed)
                },
                onLongClick = {
                    key.longPress?.let { action ->
                        performKeyAction(
                            action = action,
                            ime = ime,
                            autoCapitalize = autoCapitalize,
                            keyboardSettings = keyboardSettings,
                            onToggleShiftMode = onToggleShiftMode,
                            onToggleCtrlMode = onToggleCtrlMode,
                            onToggleAltMode = onToggleAltMode,
                            onToggleNumericMode = onToggleNumericMode,
                            onToggleEmojiMode = onToggleEmojiMode,
                            onToggleClipboardMode = onToggleClipboardMode,
                            onToggleCapsLock = onToggleCapsLock,
                            onToggleHideLetters = onToggleHideLetters,
                            onAutoCapitalize = onAutoCapitalize,
                            onSwitchLanguage = onSwitchLanguage,
                            onChangePosition = onChangePosition,
                            onKeyEvent = onKeyEvent,
                        )
                        doneKeyAction(scope, action, isDragged, releasedKey, animationHelperSpeed)
                        if (vibrateOnTap) {
                            view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP)
                        }
                        if (soundOnTap) {
                            audioManager.playSoundEffect(AudioManager.FX_KEY_CLICK, .1f)
                        }
                    }
                },
            )
            // The key1 is necessary, otherwise new swipes wont work
            .pointerInput(key1 = id) {
                detectDragGestures(
                    onDragStart = {
                        isDragged.value = true
                    },
                    onDrag = { change, dragAmount ->
                        change.consume()
                        val (x, y) = dragAmount
                        offsetX += x
                        offsetY += y
                        val offset = Offset(offsetX, offsetY)
                        positions += offset
                        if (offset.getDistanceSquared() > maxOffset.getDistanceSquared()) maxOffset = offset

                        // First detection is large enough to preserve swipe actions.
                        val slideOffsetTrigger = (keySize.dp.toPx() * 0.75) + minSwipeLength

                        /**
                         * The type of haptic feedback to use when moving the cursor with slide
                         * gestures, based on the device's supported API.
                         */
                        val slideHapticConstant =
                            if (Build.VERSION.SDK_INT >= 27) {
                                HapticFeedbackConstants.TEXT_HANDLE_MOVE
                            } else {
                                // Compatible with API 24, but vibration will not distinguish between tap and slide
                                HapticFeedbackConstants.KEYBOARD_TAP
                            }

                        // These keys have a lot of functionality.
                        // We can tap; swipe; slide the cursor left/right; select and delete text
                        // Spacebar:
                        //      Swipe up/down/left/right
                        //      Slide gesture
                        //          With slide gesture deadzone to allow normal swipes
                        //          Without deadzone
                        //      Slide up to enter selection mode.
                        // Backspace key:
                        //      Swipe left and right to delete whole word
                        //      Slide gesture delete
                        //          Wtih slide gesture deadzone to allow normal swipes
                        //          Without deadzone
                        if (key.slideType == SlideType.MOVE_CURSOR && slideEnabled) {
                            val slideSelectionOffsetTrigger = (keySize.dp.toPx() * 1.25) + minSwipeLength
                            if (abs(offsetY) > slideSelectionOffsetTrigger) {
                                // If user slides upwards, enable selection
                                hasSlideMoveCursorTriggered = true
                                if (!selection.active) {
                                    // Activate selection
                                    selection = startSelection(ime)
                                }

                                val cursorMovement =
                                    slideCursorDistance(offsetX, timeOfLastAccelerationInput, slideCursorMovementMode, slideSensitivity)
                                timeOfLastAccelerationInput = System.currentTimeMillis()
                                if (cursorMovement >= 1 || cursorMovement <= -1) {
                                    if (cursorMovement < 0.00) {
                                        selection.left(abs(cursorMovement))
                                    } else {
                                        selection.right(abs(cursorMovement))
                                    }
                                    ime.currentInputConnection.setSelection(
                                        selection.start,
                                        selection.end,
                                    )
                                    // reset offsetX, do not reset offsetY when sliding, it will break selecting
                                    offsetX = 0f
                                    // selection has changed; give feedback
                                    if (vibrateOnSlide) view.performHapticFeedback(slideHapticConstant)
                                }
                            } else if ((
                                    slideSpacebarDeadzoneEnabled &&
                                        (abs(offsetX) > slideOffsetTrigger) &&
                                        // if we've gone past the deadzone
                                        (!hasSlideMoveCursorTriggered)
                                ) ||
                                // OR we don't use the deadzone
                                ((!hasSlideMoveCursorTriggered) && (!slideSpacebarDeadzoneEnabled)) ||
                                // OR we have already started slide gesture mode.
                                hasSlideMoveCursorTriggered
                            ) {
                                // If user slides horizontally only, move cursor

                                // The first time we enter this, reset offsetX, because of the slideOffsetTrigger
                                if (!hasSlideMoveCursorTriggered) {
                                    // reset offsetX, do not reset offsetY when sliding, it will break selecting
                                    offsetX = 0f
                                    hasSlideMoveCursorTriggered = true
                                }

                                var lengthOfSelectedText = 0
                                if (selection.active) {
                                    // Move the cursor to the beginning or end of the selection and exit selection.
                                    val location =
                                        if (offsetX < 0) {
                                            min(selection.start, selection.end)
                                        } else {
                                            max(selection.start, selection.end)
                                        }

                                    selection = Selection(location, location, false)
                                    ime.currentInputConnection.setSelection(
                                        selection.start,
                                        selection.end,
                                    )
                                } else {
                                    // Check if any text has been selected, but the selection wasn't done by this keyboard.
                                    val selectedText = ime.currentInputConnection.getSelectedText(0)
                                    if ((!selectedText.isNullOrEmpty()) && selectedText.isNotEmpty()) {
                                        lengthOfSelectedText = selectedText.length
                                    }
                                }

                                var cursorMovement =
                                    slideCursorDistance(offsetX, timeOfLastAccelerationInput, slideCursorMovementMode, slideSensitivity)
                                timeOfLastAccelerationInput = System.currentTimeMillis()
                                if (cursorMovement > 0) {
                                    // Increment distance by one, because a value of 2 moves the cursor by 1 character.
                                    cursorMovement += 1
                                }

                                // Move the cursor
                                // For some reason, '2' moves the cursor to the right by 1 character.
                                //                 '-1' moves the cursor to the left  by 1 character.
                                if (cursorMovement >= 2 || cursorMovement <= -1) {
                                    if (lengthOfSelectedText > 0) {
                                        // Deselect text that has been selected, but the selection wasn't done by this keyboard.
                                        selection = startSelection(ime)
                                        ime.currentInputConnection.setSelection(
                                            selection.start,
                                            selection.end,
                                        )
                                        // Reset the selection
                                        selection = Selection()

                                        // Move the cursor to the end of the selection if we swipe right.
                                        if (cursorMovement >= 2) {
                                            cursorMovement += lengthOfSelectedText
                                        }
                                    }
                                    ime.currentInputConnection.commitText("", cursorMovement)
                                    // reset offsetX, do not reset offsetY when sliding, it will break selecting
                                    offsetX = 0f
                                    // selection has changed; give feedback
                                    if (vibrateOnSlide) view.performHapticFeedback(slideHapticConstant)
                                }
                            }
                        } else if (key.slideType == SlideType.DELETE && slideEnabled) {
                            if (!selection.active) {
                                timeOfLastAccelerationInput = System.currentTimeMillis()
                                // Activate selection, first detection is large enough to preserve swipe actions.
                                if ((
                                        slideBackspaceDeadzoneEnabled &&
                                            (abs(offsetX) > slideOffsetTrigger)
                                    ) ||
                                    !slideBackspaceDeadzoneEnabled
                                ) {
                                    // reset offsetX, do not reset offsetY when sliding, it will break selecting
                                    offsetX = 0f
                                    selection = startSelection(ime)
                                }
                            } else {
                                val cursorMovement =
                                    slideCursorDistance(offsetX, timeOfLastAccelerationInput, slideCursorMovementMode, slideSensitivity)
                                timeOfLastAccelerationInput = System.currentTimeMillis()
                                if (cursorMovement >= 1 || cursorMovement <= -1) {
                                    if (cursorMovement < 0.00) {
                                        selection.left(abs(cursorMovement))
                                    } else {
                                        selection.right(abs(cursorMovement))
                                    }
                                    ime.currentInputConnection.setSelection(
                                        selection.start,
                                        selection.end,
                                    )
                                    // reset offsetX, do not reset offsetY when sliding, it will break selecting
                                    offsetX = 0f
                                    // selection has changed; give feedback
                                    if (vibrateOnSlide) view.performHapticFeedback(slideHapticConstant)
                                }
                            }
                        }
                    },
                    onDragEnd = {
                        lateinit var action: KeyAction

                        if (key.slideType == SlideType.NONE ||
                            !slideEnabled ||
                            ((key.slideType == SlideType.DELETE) && !selection.active) ||
                            ((key.slideType == SlideType.MOVE_CURSOR) && !hasSlideMoveCursorTriggered)
                        ) {
                            hasSlideMoveCursorTriggered = false

                            // offset where we recognize if the swipe is back to the initial key
                            // this offset needs to take the minSwipeLength into consideration. Otherwise
                            // just a little (1px) swipe back would trigger the DragReturn action
                            val finalOffsetThreshold = minSwipeLength * 0.71f // magic number found from trial and error

                            // offset needed, at which the swipe qualifies for DragReturn or Circular
                            // depending on minSwipeLength setting to have consistent swipe lengths or circle sizes
                            val maxOffsetThreshold = minSwipeLength

                            val finalOffset = positions.last()
                            // we also consider the final offset small enough if it's kinda big, but
                            // in a different direction than the max offset. This ensures better
                            // swipe-and-return recognition
                            val finalOffsetSmallEnough =
                                finalOffset.getDistance() <= finalOffsetThreshold ||
                                    (
                                        swipeDirection(finalOffset.x, finalOffset.y, minSwipeLength, key.swipeType)?.equals(
                                            swipeDirection(maxOffset.x, maxOffset.y, minSwipeLength, key.swipeType),
                                        ) != true
                                    )

                            val maxOffsetDistance = maxOffset.getDistance().toDouble()
                            val maxOffsetBigEnough = maxOffsetDistance >= maxOffsetThreshold
                            action =
                                (
                                    if (maxOffsetBigEnough && finalOffsetSmallEnough) {
                                        (
                                            if (circularDragEnabled) {
                                                val circularDragActions =
                                                    mapOf(
                                                        CircularDragAction.OppositeCase to oppositeCaseKey?.center?.action,
                                                        CircularDragAction.Numeric to numericKey?.center?.action,
                                                    )
                                                circularDirection(positions, finalOffsetThreshold, minSwipeLength)?.let {
                                                    when (it) {
                                                        CircularDirection.Clockwise -> {
                                                            circularDragActions[clockwiseDragAction]
                                                        }

                                                        CircularDirection.Counterclockwise -> {
                                                            circularDragActions[counterclockwiseDragAction]
                                                        }
                                                    }
                                                }
                                            } else {
                                                null
                                            }
                                        ) ?: (
                                            if (dragReturnEnabled) {
                                                val swipeDirection =
                                                    swipeDirection(
                                                        maxOffset.x,
                                                        maxOffset.y,
                                                        minSwipeLength,
                                                        if (ghostKey == null) key.swipeType else SwipeNWay.EIGHT_WAY,
                                                    )
                                                key.getSwipe(swipeDirection)?.swipeReturnAction
                                                    ?: oppositeCaseKey?.getSwipe(swipeDirection)?.action
                                                    ?: ghostKey?.getSwipe(swipeDirection)?.swipeReturnAction
                                            } else {
                                                null
                                            }
                                        )
                                    } else {
                                        val swipeDirection =
                                            swipeDirection(
                                                offsetX,
                                                offsetY,
                                                minSwipeLength,
                                                if (ghostKey == null) key.swipeType else SwipeNWay.EIGHT_WAY,
                                            )
                                        key.getSwipe(swipeDirection)?.action ?: (
                                            ghostKey?.getSwipe(swipeDirection)?.action
                                        )
                                    }
                                ) ?: key.center.action

                            performKeyAction(
                                action = action,
                                ime = ime,
                                autoCapitalize = autoCapitalize,
                                keyboardSettings = keyboardSettings,
                                onToggleShiftMode = onToggleShiftMode,
                                onToggleCtrlMode = onToggleCtrlMode,
                                onToggleAltMode = onToggleAltMode,
                                onToggleNumericMode = onToggleNumericMode,
                                onToggleEmojiMode = onToggleEmojiMode,
                                onToggleClipboardMode = onToggleClipboardMode,
                                onToggleCapsLock = onToggleCapsLock,
                                onToggleHideLetters = onToggleHideLetters,
                                onAutoCapitalize = onAutoCapitalize,
                                onSwitchLanguage = onSwitchLanguage,
                                onChangePosition = onChangePosition,
                                onKeyEvent = onKeyEvent,
                            )
                            doneKeyAction(
                                scope,
                                action,
                                isDragged,
                                releasedKey,
                                animationHelperSpeed,
                            )
                        } else if (key.slideType == SlideType.DELETE) {
                            action =
                                KeyAction.SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent
                                            .KEYCODE_DEL,
                                    ),
                                )
                            // only delete if valid selection
                            val sel = ime.currentInputConnection.getSelectedText(0)
                            sel?.let {
                                if (it.isNotEmpty()) {
                                    performKeyAction(
                                        action = action,
                                        ime = ime,
                                        autoCapitalize = autoCapitalize,
                                        keyboardSettings = keyboardSettings,
                                        onToggleShiftMode = onToggleShiftMode,
                                        onToggleCtrlMode = onToggleCtrlMode,
                                        onToggleAltMode = onToggleAltMode,
                                        onToggleNumericMode = onToggleNumericMode,
                                        onToggleEmojiMode = onToggleEmojiMode,
                                        onToggleClipboardMode = onToggleClipboardMode,
                                        onToggleCapsLock = onToggleCapsLock,
                                        onToggleHideLetters = onToggleHideLetters,
                                        onAutoCapitalize = onAutoCapitalize,
                                        onSwitchLanguage = onSwitchLanguage,
                                        onChangePosition = onChangePosition,
                                        onKeyEvent = onKeyEvent,
                                    )
                                }
                                // Play an extra haptic effect on supported devices when slide deleting text
                                if (vibrateOnSlide && Build.VERSION.SDK_INT >= 30) {
                                    view.performHapticFeedback(HapticFeedbackConstants.REJECT)
                                }
                            }
                            doneKeyAction(
                                scope,
                                action,
                                isDragged,
                                releasedKey,
                                animationHelperSpeed,
                            )
                        } else {
                            hasSlideMoveCursorTriggered = false
                            action =
                                KeyAction.SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_UP,
                                        KeyEvent.KEYCODE_DPAD_RIGHT,
                                    ),
                                )
                            doneKeyAction(
                                scope,
                                action,
                                isDragged,
                                releasedKey,
                                animationHelperSpeed,
                            )
                        }

                        // Set tapCount and lastAction to avoid issues with multitap after slide
                        tapCount = 0
                        lastAction.value = Pair(action, TimeSource.Monotonic.markNow())

                        // Reset the drags
                        offsetX = 0f
                        offsetY = 0f
                        maxOffset = Offset(0f, 0f)
                        positions = listOf()

                        // Reset selection
                        selection = Selection()
                    },
                )
            }

    // a 3x3 grid
    // Use box so they can overlap
    // Some magic padding numbers so that large radii don't obscure the legends
    val radiusPercent = keyRadius / 100F
    val keyRadiusAdd = 20.dp
    val xPadding = (2 + keyBorderWidth).dp
    val yPadding = (0 + keyBorderWidth).dp

    val diagonalXPadding =
        lerp(
            xPadding,
            xPadding +
                keyRadiusAdd,
            radiusPercent,
        )
    val diagonalYPadding =
        lerp(
            yPadding,
            yPadding + keyRadiusAdd,
            radiusPercent,
        )

    Box(
        modifier = keyboardKeyModifier,
    ) {
        Box(
            contentAlignment = Alignment.TopStart,
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(
                        horizontal = diagonalXPadding,
                        vertical = diagonalYPadding,
                    ),
        ) {
            key.getSwipe(SwipeDirection.TOP_LEFT)?.let {
                KeyText(it, (keySize - keyBorderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(vertical = yPadding),
        ) {
            key.getSwipe(SwipeDirection.TOP)?.let {
                KeyText(it, (keySize - keyBorderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.TopEnd,
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(
                        horizontal = diagonalXPadding,
                        vertical = diagonalYPadding,
                    ),
        ) {
            key.getSwipe(SwipeDirection.TOP_RIGHT)?.let {
                KeyText(it, (keySize - keyBorderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.CenterStart,
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(horizontal = xPadding),
        ) {
            key.getSwipe(SwipeDirection.LEFT)?.let {
                KeyText(it, (keySize - keyBorderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier =
                Modifier
                    .fillMaxSize(),
        ) {
            KeyText(key.center, (keySize - keyBorderWidth).dp, hideLetters, hideSymbols, capsLock)
        }

        Box(
            contentAlignment = Alignment.CenterEnd,
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(horizontal = xPadding),
        ) {
            key.getSwipe(SwipeDirection.RIGHT)?.let {
                KeyText(it, (keySize - keyBorderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.BottomStart,
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(
                        horizontal = diagonalXPadding,
                        vertical = diagonalYPadding,
                    ),
        ) {
            key.getSwipe(SwipeDirection.BOTTOM_LEFT)?.let {
                KeyText(it, (keySize - keyBorderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.BottomCenter,
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(vertical = yPadding),
        ) {
            key.getSwipe(SwipeDirection.BOTTOM)?.let {
                KeyText(it, (keySize - keyBorderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.BottomEnd,
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(
                        horizontal = diagonalXPadding,
                        vertical = diagonalYPadding,
                    ),
        ) {
            key.getSwipe(SwipeDirection.BOTTOM_RIGHT)?.let {
                KeyText(it, (keySize - keyBorderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }

        // The animated box that fades out.
        AnimatedVisibility(
            modifier =
                Modifier
                    .fillMaxSize()
                    .background(color = Color(0, 0, 0, 0)),
            visible = releasedKey.value != null && !isPasswordField,
            enter = EnterTransition.None,
            exit = fadeOut(tween(animationSpeed)),
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier =
                    Modifier
                        .fillMaxSize()
                        .background(color = MaterialTheme.colorScheme.tertiaryContainer),
            ) {}
        }

        // The animated key letter that falls downwards and then fades out.
        AnimatedVisibility(
            modifier =
                Modifier
                    .fillMaxSize()
                    .background(color = Color(0, 0, 0, 0)),
            visible = releasedKey.value != null && !isPasswordField,
            enter = slideInVertically(tween(animationSpeed)),
            exit = fadeOut(tween(animationSpeed)),
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize(),
            ) {
                val spSize =
                    fontSizeVariantToFontSize(
                        fontSizeVariant = FontSizeVariant.LARGE,
                        keySize = keySize.dp,
                        isUpperCase = false,
                    ).toPx.pxToSp
                releasedKey.value?.let { text ->
                    Text(
                        text = text,
                        fontWeight = FontWeight.Bold,
                        fontSize = spSize,
                        lineHeight = spSize,
                        color = MaterialTheme.colorScheme.tertiary,
                    )
                }
            }
        }
    }
}

@Composable
fun KeyText(
    key: KeyC,
    keySize: Dp,
    hideLetters: Boolean,
    hideSymbols: Boolean,
    capsLock: Boolean,
) {
    val color = colorVariantToColor(colorVariant = key.color)
    val isUpperCase =
        when (key.display) {
            is KeyDisplay.TextDisplay -> {
                key.display.text
                    .firstOrNull()
                    ?.isUpperCase() == true
            }

            else -> {
                false
            }
        }
    val fontSize =
        fontSizeVariantToFontSize(
            fontSizeVariant = key.size,
            keySize = keySize,
            isUpperCase = isUpperCase,
        )

    val display =
        if (capsLock) {
            key.capsModeDisplay ?: key.display
        } else {
            key.display
        }

    when (display) {
        is KeyDisplay.IconDisplay -> {
            Icon(
                imageVector = display.icon,
                contentDescription = display.icon.name,
                tint = color,
                modifier = Modifier.size(fontSize),
            )
        }

        is KeyDisplay.TextDisplay -> {
            // Only  hide the letters for text, not symbols
            val containsLetters = display.text.any { it.isLetter() }
            val containsNumbers = display.text.any { it.isDigit() }

            // If its a letter key, use the hide letter setting
            val hideKey =
                if (containsLetters) {
                    hideLetters
                } else {
                    if (containsNumbers) {
                        false
                    } else {
                        hideSymbols
                    }
                }
            if (!hideKey) {
                val spSize = fontSize.toPx.pxToSp
                Text(
                    text = display.text,
                    fontWeight = FontWeight.Bold,
                    fontFamily = display.fontFamily,
                    fontSize = spSize,
                    lineHeight = spSize,
                    color = color,
                )
            }
        }

        null -> {}
    }
}
