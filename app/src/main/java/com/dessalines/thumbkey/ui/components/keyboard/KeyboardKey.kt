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
import com.dessalines.thumbkey.utils.startSelection
import com.dessalines.thumbkey.utils.swipeDirection
import kotlin.math.abs

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
    onToggleShiftMode: (enable: Boolean) -> Unit,
    onToggleNumericMode: (enable: Boolean) -> Unit,
    onToggleEmojiMode: (enable: Boolean) -> Unit,
    onToggleCapsLock: () -> Unit,
    onAutoCapitalize: (enable: Boolean) -> Unit,
    onSwitchLanguage: () -> Unit,
    onSwitchPosition: () -> Unit,
) {
    // Necessary for swipe settings to get updated correctly
    val id = key.toString() + animationHelperSpeed + animationSpeed + autoCapitalize + vibrateOnTap + soundOnTap + legendSize + minSwipeLength + slideSensitivity + slideEnabled

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
                if (borderWidth > 0.0) Modifier.border(
                    borderWidth.dp,
                    keyBorderColour,
                    shape = RoundedCornerShape(cornerRadius.dp),
                ) else (Modifier)
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
                        if (key.slideType == SlideType.MOVE_CURSOR && slideEnabled) {
                            if (abs(offsetY) > slideSensitivity * 5) {
                                // If user slides upwards, enable selection
                                if (!selection.active) {
                                    // Activate selection
                                    selection = startSelection(ime)
                                }
                                if (abs(offsetX) > slideSensitivity) {
                                    if (offsetX < 0.00) {
                                        selection.left()
                                    } else {
                                        selection.right()
                                    }
                                    ime.currentInputConnection.setSelection(
                                        selection.start,
                                        selection.end,
                                    )
                                    offsetX = 0f
                                }
                            } else if (abs(offsetX) > slideSensitivity) {
                                // If user slides horizontally only, move cursor
                                if (selection.active) selection = Selection(0, 0, false)
                                val direction: Int
                                var shouldMove = false
                                if (offsetX < 0.00) {
                                    // move left
                                    if (ime.currentInputConnection.getTextBeforeCursor(
                                            1,
                                            0,
                                        )?.length != 0
                                    ) {
                                        shouldMove = true
                                    }
                                    direction = KeyEvent.KEYCODE_DPAD_LEFT
                                } else {
                                    // move right
                                    if (ime.currentInputConnection.getTextAfterCursor(
                                            1,
                                            0,
                                        )?.length != 0
                                    ) {
                                        shouldMove = true
                                    }
                                    direction = KeyEvent.KEYCODE_DPAD_RIGHT
                                }
                                if (shouldMove) {
                                    val action = KeyAction.SendEvent(
                                        KeyEvent(
                                            KeyEvent.ACTION_DOWN,
                                            direction,
                                        ),
                                    )
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
                                }
                                // reset offsetX, do not reset offsetY when sliding, it will break selecting
                                offsetX = 0f
                            }
                        } else if (key.slideType == SlideType.DELETE && slideEnabled) {
                            if (!selection.active) {
                                // Activate selection, first detection is longer to preserve swipe actions
                                if (abs(offsetX) > slideSensitivity * 10) {
                                    selection = startSelection(ime)
                                }
                            } else {
                                if (abs(offsetX) > slideSensitivity) {
                                    if (offsetX < 0.00) {
                                        selection.left()
                                    } else {
                                        selection.right()
                                    }
                                    ime.currentInputConnection.setSelection(
                                        selection.start,
                                        selection.end,
                                    )
                                    offsetX = 0f
                                }
                            }
                        }
                    },
                    onDragEnd = {
                        lateinit var action: KeyAction
                        if (key.slideType == SlideType.NONE || !slideEnabled || (key.slideType == SlideType.DELETE && !selection.active)) {
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
    // Some magic padding numbers so that large radii don'g obscure the ledends
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
                .padding(horizontal = diagonalXPadding, vertical = diagonalYPadding),
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
                .padding(horizontal = diagonalXPadding, vertical = diagonalYPadding),
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
                .padding(horizontal = diagonalXPadding, vertical = diagonalYPadding),
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
                .padding(horizontal = diagonalXPadding, vertical = diagonalYPadding),
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
