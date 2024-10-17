package com.dessalines.thumbkey.ui.components.keyboard

import android.content.Context
import android.media.AudioManager
import android.util.Log
import android.view.HapticFeedbackConstants
import android.view.inputmethod.InputConnection.CURSOR_UPDATE_MONITOR
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.emoji2.emojipicker.EmojiPickerView
import com.dessalines.thumbkey.IMEService
import com.dessalines.thumbkey.db.AppSettings
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_HELPER_SPEED
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_SPEED
import com.dessalines.thumbkey.db.DEFAULT_AUTO_CAPITALIZE
import com.dessalines.thumbkey.db.DEFAULT_BACKDROP_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_CIRCULAR_DRAG_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_CLOCKWISE_DRAG_ACTION
import com.dessalines.thumbkey.db.DEFAULT_COUNTERCLOCKWISE_DRAG_ACTION
import com.dessalines.thumbkey.db.DEFAULT_DRAG_RETURN_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_GHOST_KEYS_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_HIDE_LETTERS
import com.dessalines.thumbkey.db.DEFAULT_HIDE_SYMBOLS
import com.dessalines.thumbkey.db.DEFAULT_KEYBOARD_LAYOUT
import com.dessalines.thumbkey.db.DEFAULT_KEY_BORDER_WIDTH
import com.dessalines.thumbkey.db.DEFAULT_KEY_PADDING
import com.dessalines.thumbkey.db.DEFAULT_KEY_RADIUS
import com.dessalines.thumbkey.db.DEFAULT_KEY_SIZE
import com.dessalines.thumbkey.db.DEFAULT_MIN_SWIPE_LENGTH
import com.dessalines.thumbkey.db.DEFAULT_POSITION
import com.dessalines.thumbkey.db.DEFAULT_PUSHUP_SIZE
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_BACKSPACE_DEADZONE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_CURSOR_MOVEMENT_MODE
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_SENSITIVITY
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_SPACEBAR_DEADZONE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SOUND_ON_TAP
import com.dessalines.thumbkey.db.DEFAULT_SPACEBAR_MULTITAPS
import com.dessalines.thumbkey.db.DEFAULT_VIBRATE_ON_TAP
import com.dessalines.thumbkey.keyboards.BACKSPACE_KEY_ITEM
import com.dessalines.thumbkey.keyboards.EMOJI_BACK_KEY_ITEM
import com.dessalines.thumbkey.keyboards.KB_EN_THUMBKEY_MAIN
import com.dessalines.thumbkey.keyboards.NUMERIC_KEY_ITEM
import com.dessalines.thumbkey.keyboards.RETURN_KEY_ITEM
import com.dessalines.thumbkey.utils.CircularDragAction
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyboardLayout
import com.dessalines.thumbkey.utils.KeyboardMode
import com.dessalines.thumbkey.utils.KeyboardPosition
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.getKeyboardMode
import com.dessalines.thumbkey.utils.keyboardPositionToAlignment
import com.dessalines.thumbkey.utils.toBool
import kotlin.time.TimeMark

@Composable
fun KeyboardScreen(
    settings: AppSettings?,
    onSwitchLanguage: () -> Unit,
    onChangePosition: ((old: KeyboardPosition) -> KeyboardPosition) -> Unit,
) {
    val ctx = LocalContext.current as IMEService

    var mode by remember {
        val startMode =
            getKeyboardMode(
                ime = ctx,
                autoCapitalize = settings?.autoCapitalize?.toBool() ?: false,
            )

        mutableStateOf(startMode)
    }

    var capsLock by remember {
        mutableStateOf(false)
    }

    // TODO get rid of this crap
    val lastAction = remember { mutableStateOf<Pair<KeyAction, TimeMark>?>(null) }

    val keyboardDefinition =
        KeyboardLayout.entries.sortedBy { it.ordinal }[
            settings?.keyboardLayout
                ?: DEFAULT_KEYBOARD_LAYOUT,
        ].keyboardDefinition

    val keyboard =
        when (mode) {
            KeyboardMode.MAIN -> keyboardDefinition.modes.main
            KeyboardMode.SHIFTED -> keyboardDefinition.modes.shifted
            KeyboardMode.NUMERIC -> keyboardDefinition.modes.numeric
            else -> KB_EN_THUMBKEY_MAIN
        }

    val alignment =
        keyboardPositionToAlignment(
            KeyboardPosition.entries[
                settings?.position
                    ?: DEFAULT_POSITION,
            ],
        )
    val pushupSizeDp = (settings?.pushupSize ?: DEFAULT_PUSHUP_SIZE).dp

    val autoCapitalize = (settings?.autoCapitalize ?: DEFAULT_AUTO_CAPITALIZE).toBool()
    val spacebarMultiTaps = (settings?.spacebarMultiTaps ?: DEFAULT_SPACEBAR_MULTITAPS).toBool()
    val slideEnabled = (settings?.slideEnabled ?: DEFAULT_SLIDE_ENABLED).toBool()
    val slideCursorMovementMode = (settings?.slideCursorMovementMode ?: DEFAULT_SLIDE_CURSOR_MOVEMENT_MODE)
    val slideSpacebarDeadzoneEnabled = (settings?.slideSpacebarDeadzoneEnabled ?: DEFAULT_SLIDE_SPACEBAR_DEADZONE_ENABLED).toBool()
    val slideBackspaceDeadzoneEnabled = (settings?.slideBackspaceDeadzoneEnabled ?: DEFAULT_SLIDE_BACKSPACE_DEADZONE_ENABLED).toBool()
    val keyBorderWidth = (settings?.keyBorderWidth ?: DEFAULT_KEY_BORDER_WIDTH)
    val vibrateOnTap = (settings?.vibrateOnTap ?: DEFAULT_VIBRATE_ON_TAP).toBool()
    val soundOnTap = (settings?.soundOnTap ?: DEFAULT_SOUND_ON_TAP).toBool()
    val hideLetters = (settings?.hideLetters ?: DEFAULT_HIDE_LETTERS).toBool()
    val hideSymbols = (settings?.hideSymbols ?: DEFAULT_HIDE_SYMBOLS).toBool()
    val backdropEnabled = (settings?.backdropEnabled ?: DEFAULT_BACKDROP_ENABLED).toBool()
    val backdropColor = MaterialTheme.colorScheme.background
    val backdropPadding = 6.dp
    val keyPadding = settings?.keyPadding ?: DEFAULT_KEY_PADDING
    val legendHeight = settings?.keySize ?: DEFAULT_KEY_SIZE
    val legendWidth = settings?.keyWidth ?: legendHeight
    val keyRadius = settings?.keyRadius ?: DEFAULT_KEY_RADIUS
    val dragReturnEnabled = (settings?.dragReturnEnabled ?: DEFAULT_DRAG_RETURN_ENABLED).toBool()
    val circularDragEnabled = (settings?.circularDragEnabled ?: DEFAULT_CIRCULAR_DRAG_ENABLED).toBool()
    val clockwiseDragAction = CircularDragAction.entries[settings?.clockwiseDragAction ?: DEFAULT_CLOCKWISE_DRAG_ACTION]
    val counterclockwiseDragAction =
        CircularDragAction.entries[settings?.counterclockwiseDragAction ?: DEFAULT_COUNTERCLOCKWISE_DRAG_ACTION]
    val ghostKeysEnabled = (settings?.ghostKeysEnabled ?: DEFAULT_GHOST_KEYS_ENABLED).toBool()

    val keyBorderWidthFloat = keyBorderWidth / 10.0f
    val keyBorderColour = MaterialTheme.colorScheme.outline
    val keyHeight = legendHeight.toFloat()
    val keyWidth = legendWidth.toFloat()
    val cornerRadius = (keyRadius / 100.0f) * ((keyWidth + keyHeight) / 4.0f)

    if (mode == KeyboardMode.EMOJI) {
        val controllerKeys = listOf(EMOJI_BACK_KEY_ITEM, NUMERIC_KEY_ITEM, BACKSPACE_KEY_ITEM, RETURN_KEY_ITEM)
        val keyboardHeight = Dp((keyHeight * controllerKeys.size) - (keyPadding * 2))

        ctx.currentInputConnection.requestCursorUpdates(0)

        Box(
            modifier =
                Modifier
                    .then(
                        if (backdropEnabled) {
                            Modifier.background(backdropColor)
                        } else {
                            (Modifier)
                        },
                    ),
        ) {
            // adds a pretty line if you're using the backdrop
            if (backdropEnabled) {
                Box(
                    modifier =
                        Modifier
                            .align(Alignment.TopCenter)
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(color = MaterialTheme.colorScheme.surfaceVariant),
                )
            }
            Row(
                modifier =
                    Modifier
                        .padding(bottom = pushupSizeDp)
                        .fillMaxWidth()
                        .then(
                            if (backdropEnabled) {
                                Modifier.padding(top = backdropPadding)
                            } else {
                                (Modifier)
                            },
                        ),
            ) {
                Box(
                    modifier =
                        Modifier
                            .weight(1f) // Take up available space equally
                            .padding(keyPadding.dp)
                            .clip(RoundedCornerShape(cornerRadius.dp))
                            .then(
                                if (keyBorderWidthFloat > 0.0) {
                                    Modifier.border(
                                        keyBorderWidthFloat.dp,
                                        keyBorderColour,
                                        shape = RoundedCornerShape(cornerRadius.dp),
                                    )
                                } else {
                                    (Modifier)
                                },
                            ).background(MaterialTheme.colorScheme.surface),
                ) {
                    val view = LocalView.current
                    val audioManager = ctx.getSystemService(Context.AUDIO_SERVICE) as AudioManager
                    AndroidView(
                        // Write the emoji to our text box when we tap one.
                        factory = { context ->
                            val emojiPicker = EmojiPickerView(context)
                            emojiPicker.setOnEmojiPickedListener {
                                if (vibrateOnTap) {
                                    view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP)
                                }
                                if (soundOnTap) {
                                    audioManager.playSoundEffect(AudioManager.FX_KEY_CLICK, .1f)
                                }
                                ctx.currentInputConnection.commitText(
                                    it.emoji,
                                    1,
                                )
                            }
                            emojiPicker
                        },
                        modifier =
                            Modifier
                                .fillMaxWidth()
                                .height(keyboardHeight),
                    )
                }
                Column {
                    controllerKeys.forEach { key ->
                        Column {
                            KeyboardKey(
                                key = key,
                                lastAction = lastAction,
                                legendHeight = legendHeight,
                                legendWidth = legendWidth,
                                keyHeight = keyHeight,
                                keyWidth = keyWidth,
                                keyPadding = keyPadding,
                                keyBorderWidth = keyBorderWidthFloat,
                                keyRadius = cornerRadius,
                                autoCapitalize = autoCapitalize,
                                keyboardSettings = keyboardDefinition.settings,
                                spacebarMultiTaps = spacebarMultiTaps,
                                vibrateOnTap = vibrateOnTap,
                                soundOnTap = soundOnTap,
                                hideLetters = hideLetters,
                                hideSymbols = hideSymbols,
                                capsLock = capsLock,
                                animationSpeed =
                                    settings?.animationSpeed
                                        ?: DEFAULT_ANIMATION_SPEED,
                                animationHelperSpeed =
                                    settings?.animationHelperSpeed
                                        ?: DEFAULT_ANIMATION_HELPER_SPEED,
                                minSwipeLength = settings?.minSwipeLength ?: DEFAULT_MIN_SWIPE_LENGTH,
                                slideSensitivity = settings?.slideSensitivity ?: DEFAULT_SLIDE_SENSITIVITY,
                                slideEnabled = slideEnabled,
                                slideCursorMovementMode = slideCursorMovementMode,
                                slideSpacebarDeadzoneEnabled = slideSpacebarDeadzoneEnabled,
                                slideBackspaceDeadzoneEnabled = slideBackspaceDeadzoneEnabled,
                                onToggleShiftMode = { enable ->
                                    mode =
                                        if (enable) {
                                            KeyboardMode.SHIFTED
                                        } else {
                                            capsLock = false
                                            KeyboardMode.MAIN
                                        }
                                },
                                onToggleNumericMode = { enable ->
                                    mode =
                                        if (enable) {
                                            KeyboardMode.NUMERIC
                                        } else {
                                            capsLock = false
                                            KeyboardMode.MAIN
                                        }
                                },
                                onToggleEmojiMode = { enable ->
                                    mode =
                                        if (enable) {
                                            KeyboardMode.EMOJI
                                        } else {
                                            KeyboardMode.MAIN
                                        }
                                },
                                onToggleCapsLock = {
                                    capsLock = !capsLock
                                },
                                onAutoCapitalize = { enable ->
                                    if (mode !== KeyboardMode.NUMERIC) {
                                        if (enable) {
                                            mode = KeyboardMode.SHIFTED
                                        } else if (!capsLock) {
                                            mode = KeyboardMode.MAIN
                                        }
                                    }
                                },
                                onSwitchLanguage = onSwitchLanguage,
                                onChangePosition = onChangePosition,
                                dragReturnEnabled = dragReturnEnabled,
                                circularDragEnabled = circularDragEnabled,
                                clockwiseDragAction = clockwiseDragAction,
                                counterclockwiseDragAction = counterclockwiseDragAction,
                            )
                        }
                    }
                }
            }
        }
    } else {
        // NOTE, this should use or CURSOR_UPDATE_FILTER_INSERTION_MARKER , but it doesn't work on
        // non-compose textfields.
        // This also requires jetpack compose >= 1.6
        // See https://github.com/dessalines/thumb-key/issues/242
        if (ctx.currentInputConnection.requestCursorUpdates(CURSOR_UPDATE_MONITOR)) {
            Log.d(TAG, "request for cursor updates succeeded, cursor updates will be provided")
        } else {
            Log.d(TAG, "request for cursor updates failed, cursor updates will not be provided")
        }

        Box(
            contentAlignment = alignment,
            modifier =
                Modifier
                    .then(if (backdropEnabled) Modifier.background(backdropColor) else (Modifier))
                    .padding(bottom = pushupSizeDp),
        ) {
            // adds a pretty line if you're using the backdrop
            if (backdropEnabled) {
                Box(
                    modifier =
                        Modifier
                            .align(Alignment.TopCenter)
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(color = MaterialTheme.colorScheme.surfaceVariant),
                )
            }
            Column(
                modifier =
                    Modifier
                        .then(
                            if (backdropEnabled) {
                                Modifier.padding(top = backdropPadding)
                            } else {
                                (Modifier)
                            },
                        ),
            ) {
                keyboard.arr.forEachIndexed { i, row ->
                    Row {
                        row.forEachIndexed { j, key ->
                            Column {
                                val ghostKey =
                                    if (ghostKeysEnabled) {
                                        when (mode) {
                                            KeyboardMode.MAIN -> keyboardDefinition.modes.numeric
                                            KeyboardMode.SHIFTED -> keyboardDefinition.modes.numeric
                                            else -> null
                                        }?.arr?.getOrNull(i)?.getOrNull(j)
                                    } else {
                                        null
                                    }
                                KeyboardKey(
                                    key = key,
                                    ghostKey = ghostKey,
                                    lastAction = lastAction,
                                    legendHeight = legendHeight,
                                    legendWidth = legendWidth,
                                    keyHeight = keyHeight,
                                    keyWidth = keyWidth,
                                    keyPadding = keyPadding,
                                    keyBorderWidth = keyBorderWidthFloat,
                                    keyRadius = cornerRadius,
                                    autoCapitalize = autoCapitalize,
                                    keyboardSettings = keyboardDefinition.settings,
                                    spacebarMultiTaps = spacebarMultiTaps,
                                    vibrateOnTap = vibrateOnTap,
                                    soundOnTap = soundOnTap,
                                    hideLetters = hideLetters,
                                    hideSymbols = hideSymbols,
                                    capsLock = capsLock,
                                    animationSpeed =
                                        settings?.animationSpeed
                                            ?: DEFAULT_ANIMATION_SPEED,
                                    animationHelperSpeed =
                                        settings?.animationHelperSpeed
                                            ?: DEFAULT_ANIMATION_HELPER_SPEED,
                                    minSwipeLength = settings?.minSwipeLength ?: DEFAULT_MIN_SWIPE_LENGTH,
                                    slideSensitivity = settings?.slideSensitivity ?: DEFAULT_SLIDE_SENSITIVITY,
                                    slideEnabled = slideEnabled,
                                    slideCursorMovementMode = slideCursorMovementMode,
                                    slideSpacebarDeadzoneEnabled = slideSpacebarDeadzoneEnabled,
                                    slideBackspaceDeadzoneEnabled = slideBackspaceDeadzoneEnabled,
                                    onToggleShiftMode = { enable ->
                                        mode =
                                            if (enable) {
                                                KeyboardMode.SHIFTED
                                            } else {
                                                capsLock = false
                                                KeyboardMode.MAIN
                                            }
                                    },
                                    onToggleNumericMode = { enable ->
                                        mode =
                                            if (enable) {
                                                KeyboardMode.NUMERIC
                                            } else {
                                                capsLock = false
                                                KeyboardMode.MAIN
                                            }
                                    },
                                    onToggleEmojiMode = { enable ->
                                        mode =
                                            if (enable) {
                                                KeyboardMode.EMOJI
                                            } else {
                                                KeyboardMode.MAIN
                                            }
                                    },
                                    onToggleCapsLock = {
                                        capsLock = !capsLock
                                    },
                                    onAutoCapitalize = { enable ->
                                        if (mode !== KeyboardMode.NUMERIC) {
                                            if (enable) {
                                                mode = KeyboardMode.SHIFTED
                                            } else if (!capsLock) {
                                                mode = KeyboardMode.MAIN
                                            }
                                        }
                                    },
                                    onSwitchLanguage = onSwitchLanguage,
                                    onChangePosition = onChangePosition,
                                    oppositeCaseKey =
                                        when (mode) {
                                            KeyboardMode.MAIN -> keyboardDefinition.modes.shifted
                                            KeyboardMode.SHIFTED -> keyboardDefinition.modes.main
                                            else -> null
                                        }?.arr?.getOrNull(i)?.getOrNull(j),
                                    numericKey =
                                        when (mode) {
                                            KeyboardMode.MAIN, KeyboardMode.SHIFTED ->
                                                keyboardDefinition.modes.numeric.arr
                                                    .getOrNull(i)
                                                    ?.getOrNull(j)
                                            else -> null
                                        },
                                    dragReturnEnabled = dragReturnEnabled,
                                    circularDragEnabled = circularDragEnabled,
                                    clockwiseDragAction = clockwiseDragAction,
                                    counterclockwiseDragAction = counterclockwiseDragAction,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
