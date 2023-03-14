package com.dessalines.thumbkey.ui.components.keyboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.dessalines.thumbkey.db.AppSettings
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_HELPER_SPEED
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_SPEED
import com.dessalines.thumbkey.db.DEFAULT_AUTO_CAPITALIZE
import com.dessalines.thumbkey.db.DEFAULT_KEYBOARD_LAYOUT
import com.dessalines.thumbkey.db.DEFAULT_KEY_SIZE
import com.dessalines.thumbkey.db.DEFAULT_POSITION
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyboardLayout
import com.dessalines.thumbkey.utils.KeyboardMode
import com.dessalines.thumbkey.utils.KeyboardPosition
import com.dessalines.thumbkey.utils.keyboardLayoutToModes
import com.dessalines.thumbkey.utils.keyboardPositionToAlignment

@Composable
fun KeyboardScreen(settings: AppSettings?) {
    var mode by remember {
        mutableStateOf(KeyboardMode.SHIFTED)
    }
    val lastAction = remember { mutableStateOf<KeyAction?>(null) }

    val keyboard = keyboardLayoutToModes(KeyboardLayout.values()[settings?.keyboardLayout ?: DEFAULT_KEYBOARD_LAYOUT])[mode]!!

    val alignment = keyboardPositionToAlignment(
        KeyboardPosition.values()[
            settings?.position
                ?: DEFAULT_POSITION
        ]
    )

    val autoCapitalize = (settings?.autoCapitalize ?: DEFAULT_AUTO_CAPITALIZE) == 1

    // TODO Cache these keyboards somehow, because the shifted to non-shifted delay is slow

    Box(
        contentAlignment = alignment
    ) {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.onBackground)
        ) {
            keyboard.arr.forEach { row ->
                Row {
                    row.forEach { key ->
                        Column {
                            KeyboardKey(
                                key = key,
                                lastAction = lastAction,
                                mode = mode,
                                keySize = settings?.keySize ?: DEFAULT_KEY_SIZE,
                                autoCapitalize = autoCapitalize,
                                animationSpeed = settings?.animationSpeed
                                    ?: DEFAULT_ANIMATION_SPEED,
                                animationHelperSpeed = settings?.animationHelperSpeed
                                    ?: DEFAULT_ANIMATION_HELPER_SPEED,
                                onToggleShiftMode = { enable ->
                                    mode = if (enable) {
                                        KeyboardMode.SHIFTED
                                    } else {
                                        KeyboardMode.MAIN
                                    }
                                },
                                onToggleNumericMode = { numeric ->
                                    mode = if (numeric) {
                                        KeyboardMode.NUMERIC
                                    } else {
                                        KeyboardMode.MAIN
                                    }
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}
