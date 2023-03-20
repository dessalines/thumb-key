package com.dessalines.thumbkey.utils

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.text.InputType
import android.util.Log
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
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
import com.dessalines.thumbkey.keyboards.THUMBKEY_EN_V4_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_FI_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_RU_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_UK_V1_KEYBOARD_MODES
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.atan2
import kotlin.math.pow
import kotlin.math.sqrt

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
        KeyboardLayout.ThumbKeyENv4 -> THUMBKEY_EN_V4_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyFIv4 -> THUMBKEY_FI_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbkeyRUv1 -> THUMBKEY_RU_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbkeyUKv1 -> THUMBKEY_UK_V1_KEYBOARD_MODES
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

/**
 * If this doesn't meet the minimum swipe length, it returns null
 */
fun swipeDirection(x: Float, y: Float, minSwipeLength: Int): SwipeDirection? {
    val xD = x.toDouble()
    val yD = y.toDouble()

    val swipeLength = sqrt(xD.pow(2) + yD.pow(2))

    if (swipeLength > minSwipeLength) {
        val angleDir = (atan2(xD, yD) / Math.PI * 180)
        val angle = if (angleDir < 0) {
            360 + angleDir
        } else {
            angleDir
        }

        return when (angle) {
            in 22.5..67.5 -> {
                SwipeDirection.BOTTOM_RIGHT
            }

            in 67.5..112.5 -> {
                SwipeDirection.RIGHT
            }

            in 112.5..157.5 -> {
                SwipeDirection.TOP_RIGHT
            }

            in 157.5..202.5 -> {
                SwipeDirection.TOP
            }

            in 202.5..247.5 -> {
                SwipeDirection.TOP_LEFT
            }

            in 247.5..292.5 -> {
                SwipeDirection.LEFT
            }

            in 292.5..337.5 -> {
                SwipeDirection.BOTTOM_LEFT
            }

            else -> {
                SwipeDirection.BOTTOM
            }
        }
    } else {
        return null
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
        KeyAction.IMECompleteAction -> {
            val imeAction = getImeActionCode(ime)
            if (arrayOf(
                    EditorInfo.IME_ACTION_DONE,
                    EditorInfo.IME_ACTION_GO,
                    EditorInfo.IME_ACTION_NEXT,
                    EditorInfo.IME_ACTION_SEARCH,
                    EditorInfo.IME_ACTION_SEND
                ).contains(imeAction)
            ) {
                ime.currentInputConnection.performEditorAction(imeAction)
            } else {
                ime.currentInputConnection.sendKeyEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ENTER))
            }
        }
    }
}

fun getImeActionCode(ime: IMEService): Int {
    return (
        ime.currentInputEditorInfo.imeOptions and (
            EditorInfo
                .IME_MASK_ACTION or
                EditorInfo.IME_FLAG_NO_ENTER_ACTION
            )
        )
}

/**
 * Returns the correct keyboard mode
 */
fun getKeyboardMode(ime: IMEService): KeyboardMode {
    val inputType = ime.currentInputEditorInfo.inputType and (InputType.TYPE_MASK_CLASS)

    return if (arrayOf(InputType.TYPE_CLASS_NUMBER, InputType.TYPE_CLASS_PHONE).contains(inputType)) {
        KeyboardMode.NUMERIC
    } else {
        KeyboardMode.SHIFTED
    }
}

fun getImeActionText(ime: IMEService): String? {
    val action = getImeActionCode(ime)
    val text = ime.getTextForImeAction(action).toString()
    return text
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

    // Toggles shift after punctuation and space
    val beforeSpace = textBefore?.substring(1)
    if (arrayOf(". ", "? ", "! ").contains(beforeSpace)) {
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

fun Int.toBool() = this == 1
fun Boolean.toInt() = this.compareTo(false)
