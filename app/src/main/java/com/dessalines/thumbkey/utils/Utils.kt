package com.dessalines.thumbkey.utils

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.text.InputType
import android.util.Log
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.Toast
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.navigation.NavController
import com.dessalines.thumbkey.IMEService
import com.dessalines.thumbkey.MainActivity
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.AppSettingsWithKeyboardLayout
import com.dessalines.thumbkey.db.EnabledInternalKeyboardLayout
import com.dessalines.thumbkey.db.ExternalKeyboardLayout
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.abs
import kotlin.math.atan2
import kotlin.math.min
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

fun fontSizeVariantToFontSize(fontSizeVariant: FontSizeVariant, keySize: Dp): TextUnit {
    val divFactor = when (fontSizeVariant) {
        FontSizeVariant.LARGE -> 2.5f
        FontSizeVariant.SMALL -> 5f
        FontSizeVariant.SMALLEST -> 8f
    }
    return TextUnit(keySize.value / divFactor, TextUnitType.Sp)
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
fun swipeDirection(x: Float, y: Float, minSwipeLength: Int, possible: Collection<SwipeDirection>): SwipeDirection? {
    val xD = x.toDouble()
    val yD = y.toDouble()

    val swipeLength = sqrt(xD.pow(2) + yD.pow(2))

    if (swipeLength < minSwipeLength) {
        return null
    }

    val angle = atan2(yD, xD)

    return possible.minByOrNull { min(abs((it.angle - angle).mod(Math.PI * 2)), abs((angle - it.angle).mod(Math.PI * 2))) }
}

fun performKeyAction(
    action: KeyAction,
    ime: IMEService,
    autoCapitalize: Boolean,
    onToggleShiftMode: (enable: Boolean) -> Unit,
    onToggleNumericMode: (enable: Boolean) -> Unit,
    onToggleCapsLock: () -> Unit,
    onAutoCapitalize: (enable: Boolean) -> Unit,
    onSwitchLanguage: () -> Unit,
    onSwitchPosition: () -> Unit,
) {
    when (action) {
        is KeyAction.CommitText -> {
            val text = action.text
            Log.d(TAG, "committing key text: $text")
            ime.currentInputConnection.commitText(
                text,
                1,
            )

            if (autoCapitalize) {
                autoCapitalize(
                    ime = ime,
                    onAutoCapitalize = onAutoCapitalize,
                )
            } else { // To return to MAIN mode after a shifted key action.
                onAutoCapitalize(false)
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
                1,
            )
            if (autoCapitalize) {
                autoCapitalize(
                    ime = ime,
                    onAutoCapitalize = onAutoCapitalize,
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
            val mainActivityIntent = Intent(ime, MainActivity::class.java)
            mainActivityIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            mainActivityIntent.putExtra("startRoute", "lookAndFeel")
            ime.startActivity(mainActivityIntent)
        }
        KeyAction.IMECompleteAction -> {
            val imeAction = getImeActionCode(ime)
            if (listOf(
                    EditorInfo.IME_ACTION_DONE,
                    EditorInfo.IME_ACTION_GO,
                    EditorInfo.IME_ACTION_NEXT,
                    EditorInfo.IME_ACTION_SEARCH,
                    EditorInfo.IME_ACTION_SEND,
                ).contains(imeAction)
            ) {
                ime.currentInputConnection.performEditorAction(imeAction)
            } else {
                ime.currentInputConnection.sendKeyEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ENTER))
            }
        }
        KeyAction.ToggleCapsLock -> onToggleCapsLock()
        KeyAction.SelectAndCopyAll -> {
            // Check here for the action #s:
            // https://developer.android.com/reference/android/R.id

            // Select all
            ime.currentInputConnection.performContextMenuAction(16908319)

            // Copy all
            ime.currentInputConnection.performContextMenuAction(16908321)

            val copyAllStr = ime.getString(R.string.copy_all)
            Toast.makeText(ime, copyAllStr, Toast.LENGTH_SHORT).show()
        }
        KeyAction.Paste -> {
            ime.currentInputConnection.performContextMenuAction(16908322)
        }
        KeyAction.SwitchLanguage -> onSwitchLanguage()
        KeyAction.SwitchPosition -> onSwitchPosition()
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
fun getKeyboardMode(ime: IMEService, autoCapitalize: Boolean): KeyboardMode {
    val inputType = ime.currentInputEditorInfo.inputType and (InputType.TYPE_MASK_CLASS)

    return if (listOf(InputType.TYPE_CLASS_NUMBER, InputType.TYPE_CLASS_PHONE).contains(inputType)) {
        KeyboardMode.NUMERIC
    } else {
        if (autoCapitalize && autoCapitalizeCheck(ime)) {
            KeyboardMode.SHIFTED
        } else {
            KeyboardMode.MAIN
        }
    }
}

fun getImeActionText(ime: IMEService): String {
    val action = getImeActionCode(ime)
    return ime.getTextForImeAction(action).toString()
}

private fun autoCapitalize(
    ime: IMEService,
    onAutoCapitalize: (enable: Boolean) -> Unit,
) {
    autoCapitalizeI(ime)

    if (autoCapitalizeCheck(ime)) {
        onAutoCapitalize(true)
    } else {
        onAutoCapitalize(false)
    }
}

fun autoCapitalizeI(
    ime: IMEService,
) {
    // Capitalizes 'i'
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(3, 0)
    if (!textBefore.isNullOrEmpty()) {
        if (textBefore == " i ") {
            ime.currentInputConnection.deleteSurroundingText(2, 0)
            ime.currentInputConnection.commitText(
                "I ",
                1,
            )
        }
    }
}

fun autoCapitalizeCheck(
    ime: IMEService,
): Boolean {
    // Knows if its an empty field
    val empty = ime.currentInputConnection.getTextBeforeCursor(1, 0).isNullOrEmpty()

    // For punctuation ending
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(2, 0)
    return (listOf(". ", "? ", "! ").contains(textBefore)) || empty
}

fun deleteLastWord(ime: IMEService) {
    val lastWords = ime.currentInputConnection.getTextBeforeCursor(100, 0)

    val trailingSpacesLength = lastWords?.length?.minus(lastWords.trimEnd().length) ?: 0
    val trimmed = lastWords?.trim()
    val lastWordLength = trimmed?.split("\\s".toRegex())?.lastOrNull()?.length ?: 1
    val minDelete = lastWordLength + trailingSpacesLength

    ime.currentInputConnection.deleteSurroundingText(minDelete, 0)
}

fun buildTapActions(
    keyItem: KeyItemC,
): List<KeyAction> {
    val mutable = mutableListOf(keyItem.center.action)
    mutable.addAll(keyItem.nextTapActions.orEmpty())
    return mutable.toList()
}

fun doneKeyAction(
    scope: CoroutineScope,
    action: KeyAction,
    pressed: MutableState<Boolean>,
    releasedKey: MutableState<String?>,
    animationHelperSpeed: Int,
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
    showBack: Boolean = true,
) {
    TopAppBar(
        scrollBehavior = scrollBehavior,
        title = {
            Text(
                text = text,
            )
        },
        navigationIcon = {
            if (showBack) {
                IconButton(onClick = { navController.navigate("settings") }) {
                    Icon(
                        Icons.Outlined.ArrowBack,
                        contentDescription = stringResource(R.string.settings),
                    )
                }
            }
        },
    )
}

fun openLink(url: String, ctx: Context) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    ctx.startActivity(intent)
}

fun Int.toBool() = this == 1
fun Boolean.toInt() = this.compareTo(false)


val internalKeyboardLayouts = mapOf(
    "ThumbKeyENv4" to KeyboardLayout("ThumbKey English v4", "{\"MAIN\":{\"arr\":[[{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"s\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"s\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"BOTTOM_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"w\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"w\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"r\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"r\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"BOTTOM\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"g\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"g\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"o\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"o\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"BOTTOM_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"u\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"u\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"Settings\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.GotoSettings\"},\"size\":\"LARGE\"},\"backgroundColor\":\"SURFACE_VARIANT\"}],[{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"n\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"n\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"m\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"m\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"h\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"h\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"TOP\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"q\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"q\"}},\"TOP_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"b\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"b\"}},\"RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"p\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"p\"}},\"BOTTOM_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"y\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"y\"}},\"BOTTOM\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"x\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"x\"}},\"BOTTOM_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"v\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"v\"}},\"LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"k\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"k\"}},\"TOP_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"j\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"j\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"a\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"a\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"l\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"l\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"Numbers\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ToggleNumericMode\",\"enable\":true},\"size\":\"LARGE\"},\"swipes\":{\"TOP\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"SelectAll\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SelectAndCopyAll\"},\"color\":\"MUTED\"},\"BOTTOM\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"ContentPaste\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.Paste\"},\"color\":\"MUTED\"},\"LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"Language\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SwitchLanguage\"},\"color\":\"MUTED\"},\"RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"LinearScale\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SwitchPosition\"},\"color\":\"MUTED\"}},\"backgroundColor\":\"SURFACE_VARIANT\"}],[{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"t\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"t\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"TOP_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"c\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"c\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"i\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"i\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"TOP\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"f\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"f\"}},\"RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"z\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"z\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"e\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"e\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"TOP_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"d\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"d\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"KeyboardBackspace\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SendEvent\",\"event\":{\"action\":0,\"code\":67}},\"size\":\"LARGE\"},\"swipes\":{\"LEFT\":{\"display\":null,\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.DeleteLastWord\"}},\"RIGHT\":{\"display\":null,\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SendEvent\",\"event\":{\"action\":0,\"code\":112}},\"color\":\"MUTED\",\"size\":\"SMALLEST\"}},\"backgroundColor\":\"SURFACE_VARIANT\"}],[{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\" \"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\" \"}},\"swipes\":{\"LEFT\":{\"display\":null,\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SendEvent\",\"event\":{\"action\":0,\"code\":21}}},\"RIGHT\":{\"display\":null,\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SendEvent\",\"event\":{\"action\":0,\"code\":22}}}},\"nextTapActions\":[{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\", \",\"trimCount\":1},{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\". \"},{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\"? \"},{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\"! \"},{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\": \"},{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\"; \"}],\"widthMultiplier\":3,\"backgroundColor\":\"SURFACE_VARIANT\"},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"KeyboardReturn\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.IMECompleteAction\"},\"size\":\"LARGE\"},\"backgroundColor\":\"SURFACE_VARIANT\"}]]},\"SHIFTED\":{\"arr\":[[{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"S\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"S\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"BOTTOM_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"W\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"W\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"R\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"R\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"BOTTOM\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"G\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"G\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"O\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"O\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"BOTTOM_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"U\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"U\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"Settings\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.GotoSettings\"},\"size\":\"LARGE\"},\"backgroundColor\":\"SURFACE_VARIANT\"}],[{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"N\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"N\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"M\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"M\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"H\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"H\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"TOP\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"Q\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"Q\"}},\"TOP_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"B\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"B\"}},\"RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"P\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"P\"}},\"BOTTOM_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"Y\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"Y\"}},\"BOTTOM\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"X\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"X\"}},\"BOTTOM_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"V\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"V\"}},\"LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"K\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"K\"}},\"TOP_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"J\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"J\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"A\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"A\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"L\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"L\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"Numbers\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ToggleNumericMode\",\"enable\":true},\"size\":\"LARGE\"},\"swipes\":{\"TOP\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"SelectAll\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SelectAndCopyAll\"},\"color\":\"MUTED\"},\"BOTTOM\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"ContentPaste\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.Paste\"},\"color\":\"MUTED\"},\"LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"Language\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SwitchLanguage\"},\"color\":\"MUTED\"},\"RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"LinearScale\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SwitchPosition\"},\"color\":\"MUTED\"}},\"backgroundColor\":\"SURFACE_VARIANT\"}],[{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"T\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"T\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"TOP_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"C\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"C\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"I\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"I\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"TOP\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"F\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"F\"}},\"RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"Z\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"Z\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"E\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"E\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"TOP_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"D\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"D\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"KeyboardBackspace\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SendEvent\",\"event\":{\"action\":0,\"code\":67}},\"size\":\"LARGE\"},\"swipes\":{\"LEFT\":{\"display\":null,\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.DeleteLastWord\"}},\"RIGHT\":{\"display\":null,\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SendEvent\",\"event\":{\"action\":0,\"code\":112}},\"color\":\"MUTED\",\"size\":\"SMALLEST\"}},\"backgroundColor\":\"SURFACE_VARIANT\"}],[{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\" \"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\" \"}},\"swipes\":{\"LEFT\":{\"display\":null,\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SendEvent\",\"event\":{\"action\":0,\"code\":21}}},\"RIGHT\":{\"display\":null,\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SendEvent\",\"event\":{\"action\":0,\"code\":22}}}},\"nextTapActions\":[{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\", \",\"trimCount\":1},{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\". \"},{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\"? \"},{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\"! \"},{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\": \"},{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\"; \"}],\"widthMultiplier\":3,\"backgroundColor\":\"SURFACE_VARIANT\"},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"KeyboardReturn\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.IMECompleteAction\"},\"size\":\"LARGE\"},\"backgroundColor\":\"SURFACE_VARIANT\"}]]},\"NUMERIC\":{\"arr\":[[{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"1\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"1\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"BOTTOM_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"\$\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"\$\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"2\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"2\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"TOP_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"`\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"`\"}},\"TOP\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"^\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"^\"}},\"TOP_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"\\u00b4\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"\\u00b4\"}},\"RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"!\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"!\"}},\"BOTTOM_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"\\\\\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"\\\\\"}},\"BOTTOM_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"/\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"/\"}},\"LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"+\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"+\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"3\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"3\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"?\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"?\"}},\"BOTTOM_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"\\u20ac\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"\\u20ac\"}},\"BOTTOM_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"\\u00a3\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"\\u00a3\"}},\"BOTTOM\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"=\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"=\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"Settings\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.GotoSettings\"},\"size\":\"LARGE\"},\"backgroundColor\":\"SURFACE_VARIANT\"}],[{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"4\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"4\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"TOP_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"{\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"{\"}},\"TOP_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"%\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"%\"}},\"BOTTOM_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"_\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"_\"}},\"BOTTOM_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"[\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"[\"}},\"LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"(\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"(\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"5\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"5\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"6\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"6\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"TOP_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"|\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"|\"}},\"TOP_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"}\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"}\"}},\"RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\")\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\")\"}},\"BOTTOM_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"]\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"]\"}},\"BOTTOM_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"@\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"@\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"Abc\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ToggleNumericMode\",\"enable\":false},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"backgroundColor\":\"SURFACE_VARIANT\"}],[{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"7\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"7\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"TOP_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"~\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"~\"}},\"BOTTOM_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\":\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\":\"}},\"BOTTOM_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"<\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"<\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"8\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"8\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"TOP_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"\\\"\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"\\\"\"}},\"TOP_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"'\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"'\"}},\"BOTTOM_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"-\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"-\"}},\"BOTTOM\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\".\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\".\"}},\"BOTTOM_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"*\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"*\"}},\"LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\",\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\",\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"9\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"9\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"swipes\":{\"TOP\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"&\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"&\"}},\"TOP_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"\\u00b0\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"\\u00b0\"}},\"BOTTOM_RIGHT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\">\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\">\"}},\"BOTTOM_LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\";\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\";\"}},\"LEFT\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"#\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"#\"}}}},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"KeyboardBackspace\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SendEvent\",\"event\":{\"action\":0,\"code\":67}},\"size\":\"LARGE\"},\"swipes\":{\"LEFT\":{\"display\":null,\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.DeleteLastWord\"}},\"RIGHT\":{\"display\":null,\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.SendEvent\",\"event\":{\"action\":0,\"code\":112}},\"color\":\"MUTED\",\"size\":\"SMALLEST\"}},\"backgroundColor\":\"SURFACE_VARIANT\"}],[{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\"0\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\"0\"},\"color\":\"PRIMARY\",\"size\":\"LARGE\"},\"widthMultiplier\":2},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay\",\"text\":\" \"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.CommitText\",\"text\":\" \"}},\"nextTapActions\":[{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\". \",\"trimCount\":1},{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\", \"},{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\"? \"},{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\"! \"},{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.ReplaceLastText\",\"text\":\": \"}],\"backgroundColor\":\"SURFACE_VARIANT\"},{\"center\":{\"display\":{\"type\":\"com.dessalines.thumbkey.utils.KeyDisplay.IconDisplay\",\"iconType\":\"Outlined\",\"iconName\":\"KeyboardReturn\"},\"action\":{\"type\":\"com.dessalines.thumbkey.utils.KeyAction.IMECompleteAction\"},\"size\":\"LARGE\"},\"backgroundColor\":\"SURFACE_VARIANT\"}]]}}"),
)

fun loadInternalKeyboard(layout: String): KeyboardLayout {
    return internalKeyboardLayouts.getValue(layout)
}

fun getEnabledKeyboardLayouts(
    settings: AppSettingsWithKeyboardLayout?,
    externalKeyboardLayouts: List<ExternalKeyboardLayout>?,
    enabledInternalKeyboardLayouts: List<EnabledInternalKeyboardLayout>?,
) = buildSet {
        settings?.externalKeyboardLayout?.let {
            add(it.id to KeyboardLayout(it.title, it.json))
        }
        settings?.appSettings?.keyboardLayoutInternal?.let {
            add(it to loadInternalKeyboard(it))
        }
        externalKeyboardLayouts?.let {
            addAll(it.mapNotNull { layout ->
                if (layout.enabled) layout.id to KeyboardLayout(layout.title, layout.json) else null
            })
        }
        enabledInternalKeyboardLayouts?.let {
            addAll(it.map { layout ->
                layout to loadInternalKeyboard(layout.internalId)
            })
        }
    }

fun getEnabledKeyboardLayoutIndices(
    settings: AppSettingsWithKeyboardLayout?,
    externalKeyboardLayouts: List<ExternalKeyboardLayout>?,
    enabledInternalKeyboardLayouts: List<EnabledInternalKeyboardLayout>?,
    allKeyboardLayouts: List<KeyboardLayout>
): Set<Int> {
    val layouts = getEnabledKeyboardLayouts(settings, externalKeyboardLayouts, enabledInternalKeyboardLayouts)
    return layouts.map { allKeyboardLayouts.indexOf(it.second) }.toSet()
}
