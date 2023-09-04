package com.dessalines.thumbkey.ui.components.keyboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.dessalines.thumbkey.IMEService
import com.dessalines.thumbkey.db.AppSettingsWithKeyboardLayout
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_HELPER_SPEED
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_SPEED
import com.dessalines.thumbkey.db.DEFAULT_AUTO_CAPITALIZE
import com.dessalines.thumbkey.db.DEFAULT_HIDE_LETTERS
import com.dessalines.thumbkey.db.DEFAULT_HIDE_SYMBOLS
import com.dessalines.thumbkey.db.DEFAULT_KEYBOARD_LAYOUT
import com.dessalines.thumbkey.db.DEFAULT_KEY_BORDERS
import com.dessalines.thumbkey.db.DEFAULT_KEY_SIZE
import com.dessalines.thumbkey.db.DEFAULT_MIN_SWIPE_LENGTH
import com.dessalines.thumbkey.db.DEFAULT_POSITION
import com.dessalines.thumbkey.db.DEFAULT_PUSHUP_SIZE
import com.dessalines.thumbkey.db.DEFAULT_SOUND_ON_TAP
import com.dessalines.thumbkey.db.DEFAULT_SPACEBAR_MULTITAPS
import com.dessalines.thumbkey.db.DEFAULT_SWIPE_ASSIST
import com.dessalines.thumbkey.db.DEFAULT_VIBRATE_ON_TAP
import com.dessalines.thumbkey.keyboards.generateKeyboard
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyboardLayout
import com.dessalines.thumbkey.utils.KeyboardMode
import com.dessalines.thumbkey.utils.KeyboardPosition
import com.dessalines.thumbkey.utils.getKeyboardMode
import com.dessalines.thumbkey.utils.keyboardPositionToAlignment
import com.dessalines.thumbkey.utils.loadInternalKeyboard
import com.dessalines.thumbkey.utils.toBool

@Composable
fun KeyboardScreen(
    settings: AppSettingsWithKeyboardLayout?,
    onSwitchLanguage: () -> Unit,
    onSwitchPosition: () -> Unit,
) {
    val ctx = LocalContext.current as IMEService

    var mode by remember {
        val startMode = getKeyboardMode(
            ime = ctx,
            autoCapitalize = settings?.appSettings?.autoCapitalize?.toBool() ?: false,
        )

        mutableStateOf(startMode)
    }

    var capsLock by remember {
        mutableStateOf(false)
    }

    // TODO get rid of this crap
    val lastAction = remember { mutableStateOf<KeyAction?>(null) }

    val json = settings?.externalKeyboardLayout?.json
        ?: loadInternalKeyboard(settings?.appSettings?.keyboardLayoutInternal ?: DEFAULT_KEYBOARD_LAYOUT).json
    val keyboardGroup = generateKeyboard(json)

    val keyboard = keyboardGroup[mode] ?: error("Missing mode $mode")

    val alignment = keyboardPositionToAlignment(
        KeyboardPosition.values()[
            settings?.appSettings?.position
                ?: DEFAULT_POSITION,
        ],
    )
    val pushupSizeDp = (settings?.appSettings?.pushupSize ?: DEFAULT_PUSHUP_SIZE).dp

    val autoCapitalize = (settings?.appSettings?.autoCapitalize ?: DEFAULT_AUTO_CAPITALIZE).toBool()
    val spacebarMultiTaps = (settings?.appSettings?.spacebarMultiTaps ?: DEFAULT_SPACEBAR_MULTITAPS).toBool()
    val keyBorders = (settings?.appSettings?.keyBorders ?: DEFAULT_KEY_BORDERS).toBool()
    val vibrateOnTap = (settings?.appSettings?.vibrateOnTap ?: DEFAULT_VIBRATE_ON_TAP).toBool()
    val soundOnTap = (settings?.appSettings?.soundOnTap ?: DEFAULT_SOUND_ON_TAP).toBool()
    val hideLetters = (settings?.appSettings?.hideLetters ?: DEFAULT_HIDE_LETTERS).toBool()
    val hideSymbols = (settings?.appSettings?.hideSymbols ?: DEFAULT_HIDE_SYMBOLS).toBool()

    Box(
        contentAlignment = alignment,
        modifier = Modifier
            .padding(bottom = pushupSizeDp),
    ) {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.onBackground),
        ) {
            keyboard.arr.forEach { row ->
                Row {
                    row.forEach { key ->
                        Column {
                            KeyboardKey(
                                key = key,
                                lastAction = lastAction,
                                keySize = settings?.appSettings?.keySize ?: DEFAULT_KEY_SIZE,
                                autoCapitalize = autoCapitalize,
                                spacebarMultiTaps = spacebarMultiTaps,
                                keyBorders = keyBorders,
                                vibrateOnTap = vibrateOnTap,
                                soundOnTap = soundOnTap,
                                hideLetters = hideLetters,
                                hideSymbols = hideSymbols,
                                capsLock = capsLock,
                                animationSpeed = settings?.appSettings?.animationSpeed
                                    ?: DEFAULT_ANIMATION_SPEED,
                                animationHelperSpeed = settings?.appSettings?.animationHelperSpeed
                                    ?: DEFAULT_ANIMATION_HELPER_SPEED,
                                minSwipeLength = settings?.appSettings?.minSwipeLength ?: DEFAULT_MIN_SWIPE_LENGTH,
                                swipeAssist = settings?.appSettings?.swipeAssist ?: DEFAULT_SWIPE_ASSIST,
                                onToggleShiftMode = { enable ->
                                    mode = if (enable) {
                                        KeyboardMode.SHIFTED
                                    } else {
                                        capsLock = false
                                        KeyboardMode.MAIN
                                    }
                                },
                                onToggleNumericMode = { enable ->
                                    mode = if (enable) {
                                        KeyboardMode.NUMERIC
                                    } else {
                                        capsLock = false
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
                                onSwitchPosition = onSwitchPosition,
                            )
                        }
                    }
                }
            }
        }
    }
}
