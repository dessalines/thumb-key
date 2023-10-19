package com.dessalines.thumbkey.ui.components.keyboard
import android.content.Context
import android.media.AudioManager
import android.view.KeyEvent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.lerp
import com.dessalines.thumbkey.IMEService
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.Selection
import com.dessalines.thumbkey.utils.SlideType
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.buildTapActions
import com.dessalines.thumbkey.utils.colorVariantToColor
import com.dessalines.thumbkey.utils.doneKeyAction
import com.dessalines.thumbkey.utils.fontSizeVariantToFontSize
import com.dessalines.thumbkey.utils.performKeyAction
import com.dessalines.thumbkey.utils.slideCursorDistance
import com.dessalines.thumbkey.utils.startSelection
import com.dessalines.thumbkey.utils.swipeDirection
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

@Composable
fun KeyboardKey(
    key: KeyItemC,
    lastAction: MutableState<KeyAction?>,
    animationHelperSpeed: Int,
    animationSpeed: Int,
    autoCapitalize: Boolean,
    spacebarMultiTaps: Boolean,
    vibrateOnTap: Boolean,
    soundOnTap: Boolean,
    hideLetters: Boolean,
    hideSymbols: Boolean,
    capsLock: Boolean,
    legendSize: Int,
    keyPadding: Int,
    keyBorderWidth: Int,
    keyRadius: Int,
    minSwipeLength: Int,
    slideSensitivity: Int,
    slideEnabled: Boolean,
    slideCursorMovementMode: Int,
    slideSpacebarDeadzoneEnabled: Boolean,
    slideBackspaceDeadzoneEnabled: Boolean,
    onToggleShiftMode: (enable: Boolean) -> Unit,
    onToggleNumericMode: (enable: Boolean) -> Unit,
    onToggleEmojiMode: (enable: Boolean) -> Unit,
    onToggleCapsLock: () -> Unit,
    onAutoCapitalize: (enable: Boolean) -> Unit,
    onSwitchLanguage: () -> Unit,
    onSwitchPosition: () -> Unit,
) {
    // Necessary for swipe settings to get updated correctly
    val id = key.toString() + animationHelperSpeed + animationSpeed + autoCapitalize + vibrateOnTap + soundOnTap + legendSize + minSwipeLength + slideSensitivity + slideEnabled + slideCursorMovementMode + slideSpacebarDeadzoneEnabled + slideBackspaceDeadzoneEnabled

    val ctx = LocalContext.current
    val ime = ctx as IMEService
    val scope = rememberCoroutineScope()

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    val isDragged = remember { mutableStateOf(false) }
    val releasedKey = remember { mutableStateOf<String?>(null) }

    var tapCount by remember { mutableIntStateOf(0) }
    val tapActions = if (spacebarMultiTaps) {
        buildTapActions(key)
    } else {
        listOf(key.center.action)
    }

    var offsetX by remember { mutableFloatStateOf(0f) }
    var offsetY by remember { mutableFloatStateOf(0f) }
    var hasSlideMoveCursorTriggered by remember { mutableStateOf(false) }
    var timeOfLastAccelerationInput by remember { mutableLongStateOf(0L) }

    var selection by remember { mutableStateOf(Selection()) }

    val backgroundColor = if (!(isDragged.value || isPressed)) {
        colorVariantToColor(colorVariant = key.backgroundColor)
    } else {
        MaterialTheme.colorScheme.inversePrimary
    }

    val borderWidth = keyBorderWidth / 10.0
    val keyBorderColour = MaterialTheme.colorScheme.outline
    val keySize = legendSize + (keyPadding * 2.0) + (borderWidth * 2.0)
    val cornerRadius = (keyRadius / 100.0) * (keySize / 2.0)
    val legendPadding = 4.dp + borderWidth.dp

    val haptic = LocalHapticFeedback.current
    val audioManager = ctx.getSystemService(Context.AUDIO_SERVICE) as AudioManager

    LaunchedEffect(key1 = isPressed) {
        if (isPressed) {
            if (vibrateOnTap) {
                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
            }
            if (soundOnTap) {
                audioManager.playSoundEffect(AudioManager.FX_KEY_CLICK, .1f)
            }
        }
    }

    val keyboardKeyModifier =
        Modifier
            .height(keySize.dp)
            .width(keySize.dp * key.widthMultiplier)
            .padding(keyPadding.dp)
            .clip(RoundedCornerShape(cornerRadius.dp))
            .then(
                if (borderWidth > 0.0) {
                    Modifier.border(
                        borderWidth.dp,
                        keyBorderColour,
                        shape = RoundedCornerShape(cornerRadius.dp),
                    )
                } else {
                    (Modifier)
                },
            )
            .background(color = backgroundColor)
            // Note: pointerInput has a delay when switching keyboards, so you must use this
            .clickable(interactionSource = interactionSource, indication = null) {
                // Set the last key info, and the tap count
                val cAction = key.center.action
                lastAction.value?.let { lastAction ->
                    if (lastAction == cAction) {
                        tapCount += 1
                    } else {
                        tapCount = 0
                    }
                }
                lastAction.value = cAction

                // Set the correct action
                val action = tapActions[tapCount % tapActions.size]

                performKeyAction(
                    action = action,
                    ime = ime,
                    autoCapitalize = autoCapitalize,
                    onToggleShiftMode = onToggleShiftMode,
                    onToggleNumericMode = onToggleNumericMode,
                    onToggleEmojiMode = onToggleEmojiMode,
                    onToggleCapsLock = onToggleCapsLock,
                    onAutoCapitalize = onAutoCapitalize,
                    onSwitchLanguage = onSwitchLanguage,
                    onSwitchPosition = onSwitchPosition,
                )
                doneKeyAction(scope, action, isDragged, releasedKey, animationHelperSpeed)
            }
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

                        // First detection is large enough to preserve swipe actions.
                        val slideOffsetTrigger = (keySize.dp.toPx() * 0.75) + minSwipeLength

                        // These keys have a lot of functionality.
                        // We can tap; swipe; slide the cursor left/right; select and delete text
                        // Spacebar:
                        //      Swipe up/down/left/right
                        //      Slide gesture
                        //          Wtih slide gesture deadzone to allow normal swipes
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

                                val cursorMovement = slideCursorDistance(offsetX, timeOfLastAccelerationInput, slideCursorMovementMode, slideSensitivity)
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
                                }
                            } else if ((slideSpacebarDeadzoneEnabled && (abs(offsetX) > slideOffsetTrigger) && (!hasSlideMoveCursorTriggered)) || // if we've gone past the deadzone
                                ((!hasSlideMoveCursorTriggered) && (!slideSpacebarDeadzoneEnabled)) || // OR we don't use the deadzone
                                hasSlideMoveCursorTriggered // OR we have already started slide gesture mode.
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
                                    val location = if (offsetX < 0) {
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
                                    if ((!selectedText.isNullOrEmpty()) && selectedText.length > 0) {
                                        lengthOfSelectedText = selectedText.length
                                    }
                                }

                                var cursorMovement = slideCursorDistance(offsetX, timeOfLastAccelerationInput, slideCursorMovementMode, slideSensitivity)
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
                                }
                            }
                        } else if (key.slideType == SlideType.DELETE && slideEnabled) {
                            if (!selection.active) {
                                timeOfLastAccelerationInput = System.currentTimeMillis()
                                // Activate selection, first detection is large enough to preserve swipe actions.
                                if (slideBackspaceDeadzoneEnabled && (abs(offsetX) > slideOffsetTrigger) ||
                                    !slideBackspaceDeadzoneEnabled
                                ) {
                                    // reset offsetX, do not reset offsetY when sliding, it will break selecting
                                    offsetX = 0f
                                    selection = startSelection(ime)
                                }
                            } else {
                                val cursorMovement = slideCursorDistance(offsetX, timeOfLastAccelerationInput, slideCursorMovementMode, slideSensitivity)
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
                            val swipeDirection =
                                swipeDirection(offsetX, offsetY, minSwipeLength, key.swipeType)
                            action = key.swipes?.get(swipeDirection)?.action ?: key.center.action

                            performKeyAction(
                                action = action,
                                ime = ime,
                                autoCapitalize = autoCapitalize,
                                onToggleShiftMode = onToggleShiftMode,
                                onToggleNumericMode = onToggleNumericMode,
                                onToggleEmojiMode = onToggleEmojiMode,
                                onToggleCapsLock = onToggleCapsLock,
                                onAutoCapitalize = onAutoCapitalize,
                                onSwitchLanguage = onSwitchLanguage,
                                onSwitchPosition = onSwitchPosition,
                            )
                            doneKeyAction(
                                scope,
                                action,
                                isDragged,
                                releasedKey,
                                animationHelperSpeed,
                            )
                        } else if (key.slideType == SlideType.DELETE) {
                            action = KeyAction.SendEvent(
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
                                        onToggleShiftMode = onToggleShiftMode,
                                        onToggleNumericMode = onToggleNumericMode,
                                        onToggleCapsLock = onToggleCapsLock,
                                        onAutoCapitalize = onAutoCapitalize,
                                        onSwitchLanguage = onSwitchLanguage,
                                        onSwitchPosition = onSwitchPosition,
                                        onToggleEmojiMode = onToggleEmojiMode,
                                    )
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
                            action = KeyAction.SendEvent(
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
                        lastAction.value = action

                        // Reset the drags
                        offsetX = 0f
                        offsetY = 0f

                        // Reset selection
                        selection = Selection()
                    },
                )
            }

    // a 3x3 grid
    // Use box so they can overlap
    // Some magic padding numbers so that large radii don't obscure the legends
    val radiusPercent = keyRadius.toFloat() / 100.toFloat()
    val yPadding = 0.dp + borderWidth.dp
    val diagonalXPadding = lerp(legendPadding, 11.dp + borderWidth.dp, radiusPercent)
    val diagonalYPadding = lerp(yPadding, 6.dp + borderWidth.dp, radiusPercent)

    Box(
        modifier = keyboardKeyModifier,
    ) {
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = diagonalXPadding,
                    vertical = diagonalYPadding,
                ),
        ) {
            key.swipes?.get(SwipeDirection.TOP_LEFT)?.let {
                KeyText(it, (legendSize - borderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = yPadding),
        ) {
            key.swipes?.get(SwipeDirection.TOP)?.let {
                KeyText(it, (legendSize - borderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.TopEnd,
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = diagonalXPadding,
                    vertical = diagonalYPadding,
                ),
        ) {
            key.swipes?.get(SwipeDirection.TOP_RIGHT)?.let {
                KeyText(it, (legendSize - borderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.CenterStart,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = legendPadding),
        ) {
            key.swipes?.get(SwipeDirection.LEFT)?.let {
                KeyText(it, (legendSize - borderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(legendPadding),
        ) {
            KeyText(key.center, (legendSize - borderWidth).dp, hideLetters, hideSymbols, capsLock)
        }

        Box(
            contentAlignment = Alignment.CenterEnd,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = legendPadding),
        ) {
            key.swipes?.get(SwipeDirection.RIGHT)?.let {
                KeyText(it, (legendSize - borderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.BottomStart,
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = diagonalXPadding,
                    vertical = diagonalYPadding,
                ),
        ) {
            key.swipes?.get(SwipeDirection.BOTTOM_LEFT)?.let {
                KeyText(it, (legendSize - borderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.BottomCenter,
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = yPadding),
        ) {
            key.swipes?.get(SwipeDirection.BOTTOM)?.let {
                KeyText(it, (legendSize - borderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = diagonalXPadding,
                    vertical = diagonalYPadding,
                ),
        ) {
            key.swipes?.get(SwipeDirection.BOTTOM_RIGHT)?.let {
                KeyText(it, (legendSize - borderWidth).dp, hideLetters, hideSymbols, capsLock)
            }
        }

        // The animated box that fades out.
        AnimatedVisibility(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0, 0, 0, 0)),
            visible = releasedKey.value != null,
            enter = EnterTransition.None,
            exit = fadeOut(tween(animationSpeed)),
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = MaterialTheme.colorScheme.tertiaryContainer),
            ) {}
        }

        // The animated key letter that falls downwards and then fades out.
        AnimatedVisibility(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0, 0, 0, 0)),
            visible = releasedKey.value != null,
            enter = slideInVertically(tween(animationSpeed)),
            exit = fadeOut(tween(animationSpeed)),
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize(),
            ) {
                val fontSize = fontSizeVariantToFontSize(
                    fontSizeVariant = FontSizeVariant.LARGE,
                    keySize = legendSize.dp,
                )
                releasedKey.value?.let { text ->
                    Text(
                        text = text,
                        fontWeight = FontWeight.Bold,
                        fontSize = fontSize,
                        color = MaterialTheme.colorScheme.tertiary,
                    )
                }
            }
        }
    }
}

@Composable
fun KeyText(key: KeyC, keySize: Dp, hideLetters: Boolean, hideSymbols: Boolean, capsLock: Boolean) {
    val color = colorVariantToColor(colorVariant = key.color)
    val fontSize = fontSizeVariantToFontSize(fontSizeVariant = key.size, keySize = keySize)

    val display = if (capsLock) {
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
                modifier = Modifier.size(fontSize.value.dp),
            )
        }
        is KeyDisplay.TextDisplay -> {
            // Only  hide the letters for text, not symbols
            val containsLetters = display.text.any { it.isLetter() }

            // If its a letter key, use the hide letter setting
            val showKey = if (containsLetters) {
                !hideLetters
            } else {
                !hideSymbols
            }
            if (showKey) {
                Text(
                    text = display.text,
                    fontWeight = FontWeight.Bold,
                    fontSize = fontSize,
                    color = color,
                )
            }
        }
        null -> {}
    }
}
