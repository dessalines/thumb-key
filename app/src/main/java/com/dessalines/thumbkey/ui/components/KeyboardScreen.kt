package com.dessalines.thumbkey.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.dessalines.thumbkey.keyboards.THUMBKEY_V4_KEYBOARD_MODES
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyboardMode

@Composable
fun KeyboardScreen() {
    var mode by remember {
        mutableStateOf(KeyboardMode.SHIFTED)
    }
    val lastAction = remember { mutableStateOf<KeyAction?>(null) }
    val keyboard = THUMBKEY_V4_KEYBOARD_MODES[mode]!!

    Box(
        contentAlignment = Alignment.BottomEnd
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
