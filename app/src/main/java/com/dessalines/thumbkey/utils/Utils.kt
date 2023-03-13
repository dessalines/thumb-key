package com.dessalines.thumbkey.utils

import android.util.Log
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.core.text.trimmedLength
import com.dessalines.thumbkey.IMEService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

const val TAG = "com.thumbkey"

const val THUMBKEY_IME_NAME = "com.dessalines.thumbkey/.IMEService"

@Composable
fun colorVariantToColor(colorVariant: ColorVariant): Color {
    return when (colorVariant) {
        ColorVariant.SURFACE -> MaterialTheme.colorScheme.surface
        ColorVariant.SURFACE_VARIANT -> MaterialTheme.colorScheme.surfaceVariant
        ColorVariant.PRIMARY -> MaterialTheme.colorScheme.primary
        ColorVariant.SECONDARY -> MaterialTheme.colorScheme.secondary
        ColorVariant.MUTED -> MaterialTheme.colorScheme.secondary.copy(alpha = 0.5F)
    }
}

@OptIn(ExperimentalUnitApi::class)
fun fontSizeVariantToFontSize(fontSizeVariant: FontSizeVariant, keySize: Dp): TextUnit {
    val divFactor = when (fontSizeVariant) {
        FontSizeVariant.LARGE -> 2.5f
        FontSizeVariant.SMALL -> 5f
    }
    return TextUnit(keySize.value / divFactor, TextUnitType.Sp)
}

fun swipeDirection(x: Float, y: Float, leeway: Float): SwipeDirection? {
    return if (x > leeway) {
        if (y > leeway) {
            SwipeDirection.BOTTOM_RIGHT
        } else if (y < -leeway) {
            SwipeDirection.TOP_RIGHT
        } else {
            SwipeDirection.RIGHT
        }
    } else if (x < -leeway) {
        if (y > leeway) {
            SwipeDirection.BOTTOM_LEFT
        } else if (y < -leeway) {
            SwipeDirection.TOP_LEFT
        } else {
            SwipeDirection.LEFT
        }
    } else {
        if (y > leeway) {
            SwipeDirection.BOTTOM
        } else if (y < -leeway) {
            SwipeDirection.TOP
        } else {
            null
        }
    }
}

fun performKeyAction(
    action: KeyAction,
    ime: IMEService,
    onToggleShiftMode: (enable: Boolean) -> Unit,
    onToggleNumericMode: (enable: Boolean) -> Unit,
    mode: KeyboardMode
) {
    when (action) {
        is KeyAction.CommitText -> {
            val text = action.text
            Log.d(TAG, "committing key text: $text")
            ime.currentInputConnection.commitText(
                text,
                text.length
            )

            if (mode !== KeyboardMode.NUMERIC) {
                autoCapitalize(ime, onToggleShiftMode)
            }
        }
        is KeyAction.SendEvent -> {
            val ev = action.event
            Log.d(TAG, "sending key event: $ev")
            ime.currentInputConnection.sendKeyEvent(ev)
        }
        is KeyAction.DeleteLastWord -> {
            Log.d(TAG, "deleting last word")
            deleteLastWord(ime)
        }
        is KeyAction.ReplaceLastText -> {
            // TODO auto-shift doesn't work with this unfortunately
            Log.d(TAG, "replacing last word")
            val text = action.text

            ime.currentInputConnection.deleteSurroundingText(action.trimCount, 0)
            ime.currentInputConnection.commitText(
                text,
                text.length
            )
        }
        is KeyAction.ToggleShiftMode -> {
            val enable = action.enable
            Log.d(TAG, "Toggling Shifted: $enable")
            onToggleShiftMode(enable)
        }
        is KeyAction.ToggleNumericMode -> {
            val enable = action.enable
            Log.d(TAG, "Toggling Numeric: $enable")
            onToggleNumericMode(enable)
        }
    }
}

private fun autoCapitalize(
    ime: IMEService,
    onToggleShiftMode: (enable: Boolean) -> Unit
) {
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(1, 0)

    if (arrayOf(".", "?", "!").contains(textBefore)) {
        onToggleShiftMode(true)
    } else {
        onToggleShiftMode(false)
    }
}

fun deleteLastWord(ime: IMEService) {
    val lastWords = ime.currentInputConnection.getTextBeforeCursor(100, 0)

    val trimmedLength = lastWords?.length?.minus(lastWords.trimmedLength()) ?: 0
    val trimmed = lastWords?.trim()
    val lastWordLength = trimmed?.split(" ")?.lastOrNull()?.length ?: 1
    val minDelete = if (lastWordLength > 0) {
        lastWordLength + trimmedLength
    } else {
        1
    }

    ime.currentInputConnection.deleteSurroundingText(minDelete, 0)
}

fun buildTapActions(
    keyItem: KeyItemC
): List<KeyAction> {
    return listOf(keyItem.center.action, *keyItem.nextTapActions.orEmpty())
}

fun doneKeyAction(
    scope: CoroutineScope,
    action: KeyAction,
    pressed: MutableState<Boolean>,
    releasedKey: MutableState<String?>
) {
    pressed.value = false
    scope.launch {
        delay(350)
        releasedKey.value = null
    }
    releasedKey.value = when (action) {
        is KeyAction.CommitText -> {
            action.text
        }
        else -> {
            null
        }
    }
}
