package com.dessalines.thumbkey.utils

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.core.text.trimmedLength
import androidx.navigation.NavController
import com.dessalines.thumbkey.IMEService
import com.dessalines.thumbkey.MainActivity
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_V4_KEYBOARD_MODES
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

fun keyboardLayoutToModes(layout: KeyboardLayout): Map<KeyboardMode, KeyboardC> {
    return when (layout) {
        KeyboardLayout.ThumbKeyV4 -> THUMBKEY_V4_KEYBOARD_MODES
        KeyboardLayout.MessageEase -> MESSAGEEASE_KEYBOARD_MODES
    }
}

fun keyboardPositionToAlignment(position: KeyboardPosition): Alignment {
    return when (position) {
        KeyboardPosition.Right -> Alignment.BottomEnd
        KeyboardPosition.Center -> Alignment.BottomCenter
        KeyboardPosition.Left -> Alignment.BottomStart
    }
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
    autoCapitalize: Boolean,
    ctx: IMEService,
    onToggleShiftMode: (enable: Boolean) -> Unit,
    onToggleNumericMode: (enable: Boolean) -> Unit
) {
    when (action) {
        is KeyAction.CommitText -> {
            val text = action.text
            Log.d(TAG, "committing key text: $text")
            ime.currentInputConnection.commitText(
                text,
                text.length
            )

            // TODO  this broke
            if (autoCapitalize) {
                autoCapitalize(
                    ime = ime,
                    onToggleShiftMode = onToggleShiftMode
                )
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
            Log.d(TAG, "replacing last word")
            val text = action.text

            ime.currentInputConnection.deleteSurroundingText(action.trimCount, 0)
            ime.currentInputConnection.commitText(
                text,
                text.length
            )
            if (autoCapitalize) {
                autoCapitalize(
                    ime = ime,
                    onToggleShiftMode = onToggleShiftMode
                )
            }
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
        KeyAction.GotoSettings -> {
            val mainActivityIntent = Intent(ctx, MainActivity::class.java)
            mainActivityIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            ctx.startActivity(mainActivityIntent)
        }
    }
}

private fun autoCapitalize(
    ime: IMEService,
    onToggleShiftMode: (enable: Boolean) -> Unit
) {
    // Capitalizes 'i'
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(3, 0)
    if (textBefore == " i ") {
        ime.currentInputConnection.deleteSurroundingText(2, 0)
        ime.currentInputConnection.commitText(
            "I ",
            2
        )
    }

    // Toggles shift after punctuation
    val beforeSpace: Char = textBefore?.getOrNull(1) ?: ' '
    if (arrayOf('.', '?', '!').contains(beforeSpace)) {
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
    releasedKey: MutableState<String?>,
    animationHelperSpeed: Int
) {
    pressed.value = false
    scope.launch {
        delay(animationHelperSpeed.toLong())
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleTopAppBar(
    text: String,
    navController: NavController,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    showBack: Boolean = true
) {
    TopAppBar(
        scrollBehavior = scrollBehavior,
        title = {
            Text(
                text = text
            )
        },
        navigationIcon = {
            if (showBack) {
                IconButton(onClick = { navController.navigate("settings") }) {
                    Icon(
                        Icons.Outlined.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            }
        }
    )
}

fun openLink(url: String, ctx: Context) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    ctx.startActivity(intent)
}
