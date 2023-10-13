package com.dessalines.thumbkey.utils

import android.content.Context
import android.content.Intent
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.text.InputType
import android.util.Log
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodInfo
import android.view.inputmethod.InputMethodManager
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
import com.dessalines.thumbkey.db.DEFAULT_KEYBOARD_LAYOUT
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
fun swipeDirection(
    x: Float,
    y: Float,
    minSwipeLength: Int,
    swipeType: SwipeNWay = SwipeNWay.EIGHT_WAY,
): SwipeDirection? {
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

        when (swipeType) {
            // 0 degrees = down, increasing counter-clockwise
            SwipeNWay.EIGHT_WAY -> return when (angle) {
                in 22.5..67.5 -> SwipeDirection.BOTTOM_RIGHT
                in 67.5..112.5 -> SwipeDirection.RIGHT
                in 112.5..157.5 -> SwipeDirection.TOP_RIGHT
                in 157.5..202.5 -> SwipeDirection.TOP
                in 202.5..247.5 -> SwipeDirection.TOP_LEFT
                in 247.5..292.5 -> SwipeDirection.LEFT
                in 292.5..337.5 -> SwipeDirection.BOTTOM_LEFT
                else -> SwipeDirection.BOTTOM
            }

            SwipeNWay.FOUR_WAY_CROSS -> return when (angle) {
                in 45.0..135.0 -> SwipeDirection.RIGHT
                in 135.0..225.0 -> SwipeDirection.TOP
                in 225.0..315.0 -> SwipeDirection.LEFT
                else -> SwipeDirection.BOTTOM
            }

            SwipeNWay.FOUR_WAY_DIAGONAL -> return when (angle) {
                in 0.0..90.0 -> SwipeDirection.BOTTOM_RIGHT
                in 90.0..180.0 -> SwipeDirection.TOP_RIGHT
                in 180.0..270.0 -> SwipeDirection.TOP_LEFT
                else -> SwipeDirection.BOTTOM_LEFT
            }

            SwipeNWay.TWO_WAY_HORIZONTAL -> return when (angle) {
                in 0.0..180.0 -> SwipeDirection.RIGHT
                else -> SwipeDirection.LEFT
            }

            SwipeNWay.TWO_WAY_VERTICAL -> return when (angle) {
                in 90.0..270.0 -> SwipeDirection.TOP
                else -> SwipeDirection.BOTTOM
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
    onToggleShiftMode: (enable: Boolean) -> Unit,
    onToggleNumericMode: (enable: Boolean) -> Unit,
    onToggleEmojiMode: (enable: Boolean) -> Unit,
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

        is KeyAction.ToggleEmojiMode -> {
            val enable = action.enable
            Log.d(TAG, "Toggling Emoji: $enable")
            onToggleEmojiMode(enable)
        }

        KeyAction.GotoSettings -> {
            val mainActivityIntent = Intent(ime, MainActivity::class.java)
            mainActivityIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            mainActivityIntent.putExtra("startRoute", "settings")
            ime.startActivity(mainActivityIntent)
        }

        KeyAction.IMECompleteAction -> {
            val imeAction = getImeActionCode(ime)
            // A lot of apps like discord and slack use weird IME actions,
            // so its best to only check the none case
            if (imeAction == EditorInfo.IME_FLAG_NO_ENTER_ACTION) {
                ime.currentInputConnection.sendKeyEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_ENTER,
                    ),
                )
            } else {
                ime.currentInputConnection.performEditorAction(imeAction)
            }
        }

        KeyAction.ToggleCapsLock -> onToggleCapsLock()
        KeyAction.SelectAll -> {
            // Check here for the action #s:
            // https://developer.android.com/reference/android/R.id
            ime.currentInputConnection.performContextMenuAction(android.R.id.selectAll)
        }
        KeyAction.Cut -> {
            ime.currentInputConnection.performContextMenuAction(android.R.id.cut)
        }
        KeyAction.Copy -> {
            ime.currentInputConnection.performContextMenuAction(android.R.id.copy)

            val message = ime.getString(R.string.copy)
            Toast.makeText(ime, message, Toast.LENGTH_SHORT).show()
        }
        KeyAction.Paste -> {
            ime.currentInputConnection.performContextMenuAction(android.R.id.paste)
        }
        KeyAction.Undo -> {
            ime.currentInputConnection.sendKeyEvent(
                KeyEvent(0, 0, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_Z, 0, KeyEvent.META_CTRL_ON),
            )
        }
        KeyAction.Redo -> {
            ime.currentInputConnection.sendKeyEvent(
                KeyEvent(0, 0, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_Z, 0, (KeyEvent.META_CTRL_ON or KeyEvent.META_SHIFT_ON)),
            )
        }

        KeyAction.SwitchLanguage -> onSwitchLanguage()
        KeyAction.SwitchPosition -> onSwitchPosition()
        KeyAction.SwitchIME -> {
            val imeManager =
                ime.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imeManager.showInputMethodPicker()
        }
        KeyAction.SwitchIMEVoice -> {
            val imeManager =
                ime.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            val list: List<InputMethodInfo> = imeManager.enabledInputMethodList
            for (el in list) {
                for (i in 0 until el.subtypeCount) {
                    if (el.getSubtypeAt(i).mode != "voice") continue
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                        ime.switchInputMethod(el.id)
                    } else {
                        ime.window.window?.let { window ->
                            @Suppress("DEPRECATION")
                            imeManager.setInputMethod(window.attributes.token, el.id)
                        }
                    }
                }
            }
        }
    }
}

/**
 * Returns the current IME action, or IME_FLAG_NO_ENTER_ACTION if there is none.
 */
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

    return if (listOf(
            InputType.TYPE_CLASS_NUMBER,
            InputType.TYPE_CLASS_PHONE,
        ).contains(inputType)
    ) {
        KeyboardMode.NUMERIC
    } else {
        if (autoCapitalize && autoCapitalizeCheck(ime)) {
            KeyboardMode.SHIFTED
        } else {
            KeyboardMode.MAIN
        }
    }
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
    val lastWords = ime.currentInputConnection.getTextBeforeCursor(9999, 0)

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

fun keyboardLayoutsSetFromString(layouts: String?): Set<Int> {
    return layouts?.split(",")?.map { it.trim().toInt() }?.toSet()
        ?: setOf(
            DEFAULT_KEYBOARD_LAYOUT,
        )
}

fun keyboardLayoutsSetFromTitleIndex(layouts: String?): Set<Int> {
    return layouts?.split(",")?.map { keyboardTitleIndexFromRealIndex(it.trim().toInt()) }?.toSet()
        ?: setOf(
            keyboardTitleIndexFromRealIndex(DEFAULT_KEYBOARD_LAYOUT),
        )
}

fun keyboardRealIndexFromTitleIndex(index: Int): Int {
    return KeyboardLayout.entries.sortedBy { it.title }[index].index
}

fun keyboardTitleIndexFromRealIndex(index: Int): Int {
    val keyboard = KeyboardLayout.entries.find { it.index == index } ?: KeyboardLayout.ThumbKeyENv4
    return KeyboardLayout.entries.sortedBy { it.title }.indexOf(keyboard)
}

fun Context.getPackageInfo(): PackageInfo {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0))
    } else {
        packageManager.getPackageInfo(packageName, 0)
    }
}

fun Context.getVersionCode(): Int = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
    getPackageInfo().longVersionCode.toInt()
} else {
    @Suppress("DEPRECATION")
    getPackageInfo().versionCode
}

fun startSelection(ime: IMEService): Selection {
    val cursorPosition =
        ime.currentInputConnection.getTextBeforeCursor(
            1000, // Higher value mens slower execution
            0,
        )?.length
    cursorPosition?.let {
        return Selection(it, it, true)
    }
    return Selection()
}
