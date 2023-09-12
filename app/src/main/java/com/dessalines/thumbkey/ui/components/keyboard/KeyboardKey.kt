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
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.dessalines.thumbkey.IMEService
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.SlideType
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.buildTapActions
import com.dessalines.thumbkey.utils.colorVariantToColor
import com.dessalines.thumbkey.utils.doneKeyAction
import com.dessalines.thumbkey.utils.fontSizeVariantToFontSize
import com.dessalines.thumbkey.utils.performKeyAction
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
    keyBorders: Boolean,
    vibrateOnTap: Boolean,
    soundOnTap: Boolean,
    hideLetters: Boolean,
    hideSymbols: Boolean,
    capsLock: Boolean,
    keySize: Int,
    minSwipeLength: Int,
    slideSensitivity: Int,
    slideEnabled: Boolean,
    onToggleShiftMode: (enable: Boolean) -> Unit,
    onToggleNumericMode: (enable: Boolean) -> Unit,
    onToggleCapsLock: () -> Unit,
    onAutoCapitalize: (enable: Boolean) -> Unit,
    onSwitchLanguage: () -> Unit,
    onSwitchPosition: () -> Unit,
) {
    // Necessary for swipe settings to get updated correctly
    val id = key.toString() + animationHelperSpeed + animationSpeed + autoCapitalize + vibrateOnTap + soundOnTap + keySize + minSwipeLength + slideSensitivity + slideEnabled

    val ctx = LocalContext.current
    val ime = ctx as IMEService
    val scope = rememberCoroutineScope()

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    val isDragged = remember { mutableStateOf(false) }
    val releasedKey = remember { mutableStateOf<String?>(null) }

    var tapCount by remember { mutableStateOf(0) }
    val tapActions = if (spacebarMultiTaps) {
        buildTapActions(key)
    } else {
        listOf(key.center.action)
    }

    var offsetX by remember { mutableStateOf(0f) }
    var offsetY by remember { mutableStateOf(0f) }

    val backgroundColor = if (!(isDragged.value || isPressed)) {
        colorVariantToColor(colorVariant = key.backgroundColor)
    } else {
        MaterialTheme.colorScheme.inversePrimary
    }

    val keySizeDp = keySize.dp
    val keyPadding = 4.dp

    val keyBorderSize = if (keyBorders) {
        0.5.dp
    } else {
        0.dp
    }

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
            .height(keySizeDp)
            .width(keySizeDp * key.widthMultiplier)
            .padding(keyBorderSize)
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
                            if (abs(offsetX) > slideSensitivity) {
                                var direction = 0
                                var shouldMove = false
                                if (offsetX < 0.00) {
                                    // move left
                                    if (ime.currentInputConnection.getTextBeforeCursor(1, 0)?.length != 0) {
                                        shouldMove = true
                                    }
                                    direction = KeyEvent.KEYCODE_DPAD_LEFT
                                } else {
                                    // move right
                                    if (ime.currentInputConnection.getTextAfterCursor(1, 0)?.length != 0) {
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
                                        onToggleCapsLock = onToggleCapsLock,
                                        onAutoCapitalize = onAutoCapitalize,
                                        onSwitchLanguage = onSwitchLanguage,
                                        onSwitchPosition = onSwitchPosition,
                                    )
                                }
                                offsetX = 0f
                                offsetY = 0f
                            }
                        }
                    },
                    onDragEnd = {
                        if (key.slideType == SlideType.NONE || !slideEnabled) {
                            val swipeDirection = swipeDirection(offsetX, offsetY, minSwipeLength, key.swipeType)
                            val action = key.swipes?.get(swipeDirection)?.action ?: key.center.action

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
                            )
                            tapCount = 0
                            lastAction.value = action

                            // Reset the drags
                            offsetX = 0f
                            offsetY = 0f

                            doneKeyAction(scope, action, isDragged, releasedKey, animationHelperSpeed)
                        } else {
                            doneKeyAction(
                                scope,
                                KeyAction.SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_UP,
                                        KeyEvent.KEYCODE_DPAD_RIGHT,
                                    ),
                                ),
                                isDragged,
                                releasedKey,
                                animationHelperSpeed,
                            )
                        }
                    },
                )
            }

    // a 3x3 grid
    // Use box so they can overlap
    Box(
        modifier = keyboardKeyModifier,
    ) {
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = keyPadding),
        ) {
            key.swipes?.get(SwipeDirection.TOP_LEFT)?.let {
                KeyText(it, keySizeDp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = keyPadding),
        ) {
            key.swipes?.get(SwipeDirection.TOP)?.let {
                KeyText(it, keySizeDp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.TopEnd,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = keyPadding),
        ) {
            key.swipes?.get(SwipeDirection.TOP_RIGHT)?.let {
                KeyText(it, keySizeDp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.CenterStart,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = keyPadding),
        ) {
            key.swipes?.get(SwipeDirection.LEFT)?.let {
                KeyText(it, keySizeDp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = keyPadding),
        ) {
            KeyText(key.center, keySizeDp, hideLetters, hideSymbols, capsLock)
        }

        Box(
            contentAlignment = Alignment.CenterEnd,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = keyPadding),
        ) {
            key.swipes?.get(SwipeDirection.RIGHT)?.let {
                KeyText(it, keySizeDp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.BottomStart,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = keyPadding),
        ) {
            key.swipes?.get(SwipeDirection.BOTTOM_LEFT)?.let {
                KeyText(it, keySizeDp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.BottomCenter,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = keyPadding),
        ) {
            key.swipes?.get(SwipeDirection.BOTTOM)?.let {
                KeyText(it, keySizeDp, hideLetters, hideSymbols, capsLock)
            }
        }
        Box(
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = keyPadding),
        ) {
            key.swipes?.get(SwipeDirection.BOTTOM_RIGHT)?.let {
                KeyText(it, keySizeDp, hideLetters, hideSymbols, capsLock)
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
                modifier = Modifier.fillMaxSize()
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
                    keySize = keySizeDp,
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
