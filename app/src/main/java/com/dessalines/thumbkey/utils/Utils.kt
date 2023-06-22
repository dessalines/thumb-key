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
import androidx.core.text.trimmedLength
import androidx.navigation.NavController
import com.dessalines.thumbkey.IMEService
import com.dessalines.thumbkey.MainActivity
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.DEFAULT_KEYBOARD_LAYOUT
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_DE_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_EN_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_EN_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_FR_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_HE_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_RU_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.T9_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_BY_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_BY_V1_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_DA_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_DE_V2_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_DE_V2_MULTILINGUAL_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_EN_V4_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_EN_V4_PROGRAMMER_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_EN_V4_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_ES_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_EU_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_FA_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_FI_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_FI_V1_WIDE_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_FR_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_FR_V2_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_ID_V1_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_IT_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_JA_V1_HIRAGANA_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_JA_V1_KATAKANA_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_KA_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_NL_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_NO_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_PL_V2_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_PT_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_RU_V2_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_RU_V2_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_SV_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_TR_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_UK_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TYPESPLIT_DE_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TYPESPLIT_EN_V2_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TYPESPLIT_ES_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TYPESPLIT_FR_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TYPESPLIT_IT_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TYPESPLIT_PT_V1_KEYBOARD_MODES
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

fun keyboardLayoutToModes(layout: KeyboardLayout): Map<KeyboardMode, KeyboardC> {
    return when (layout) {
        KeyboardLayout.ThumbKeyENv4 -> THUMBKEY_EN_V4_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyENv4Programmer -> THUMBKEY_EN_V4_PROGRAMMER_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyDEv2 -> THUMBKEY_DE_V2_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyDAv1 -> THUMBKEY_DA_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyESv1 -> THUMBKEY_ES_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyEUv1 -> THUMBKEY_EU_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyFAv1 -> THUMBKEY_FA_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyFIv1 -> THUMBKEY_FI_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyFIv1Wide -> THUMBKEY_FI_V1_WIDE_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyFRv1 -> THUMBKEY_FR_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyITv1 -> THUMBKEY_IT_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyNLv1 -> THUMBKEY_NL_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyPLv2 -> THUMBKEY_PL_V2_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyPTv1 -> THUMBKEY_PT_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyRUv2 -> THUMBKEY_RU_V2_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyUKv1 -> THUMBKEY_UK_V1_KEYBOARD_MODES
        KeyboardLayout.MessageEaseEN -> MESSAGEEASE_EN_KEYBOARD_MODES
        KeyboardLayout.MessageEaseENSymbols -> MESSAGEEASE_EN_SYMBOLS_KEYBOARD_MODES
        KeyboardLayout.MessageEaseHE -> MESSAGEEASE_HE_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyENv4Symbols -> THUMBKEY_EN_V4_SYMBOLS_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyRUv2Symbols -> THUMBKEY_RU_V2_SYMBOLS_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyBYv1 -> THUMBKEY_BY_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyBYv1Symbols -> THUMBKEY_BY_V1_SYMBOLS_KEYBOARD_MODES
        KeyboardLayout.MessageEaseDE -> MESSAGEEASE_DE_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyNOv1 -> THUMBKEY_NO_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyDEv2MultiLingual -> THUMBKEY_DE_V2_MULTILINGUAL_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyKAv1 -> THUMBKEY_KA_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyIDv1 -> THUMBKEY_ID_V1_SYMBOLS_KEYBOARD_MODES
        KeyboardLayout.MessageEaseFR -> MESSAGEEASE_FR_KEYBOARD_MODES
        KeyboardLayout.MessageEaseRUSymbols -> MESSAGEEASE_RU_SYMBOLS_KEYBOARD_MODES
        KeyboardLayout.T9v1 -> T9_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyJAv1Hiragana -> THUMBKEY_JA_V1_HIRAGANA_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyJAv1Katakana -> THUMBKEY_JA_V1_KATAKANA_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyFRv2 -> THUMBKEY_FR_V2_KEYBOARD_MODES
        KeyboardLayout.ThumbKeySVv1 -> THUMBKEY_SV_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyTRv1 -> THUMBKEY_TR_V1_KEYBOARD_MODES
        KeyboardLayout.TypeSplitENv2 -> TYPESPLIT_EN_V2_KEYBOARD_MODES
        KeyboardLayout.TypeSplitESv1 -> TYPESPLIT_ES_V1_KEYBOARD_MODES
        KeyboardLayout.TypeSplitDEv1 -> TYPESPLIT_DE_V1_KEYBOARD_MODES
        KeyboardLayout.TypeSplitITv1 -> TYPESPLIT_IT_V1_KEYBOARD_MODES
        KeyboardLayout.TypeSplitFRv1 -> TYPESPLIT_FR_V1_KEYBOARD_MODES
        KeyboardLayout.TypeSplitPTv1 -> TYPESPLIT_PT_V1_KEYBOARD_MODES
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
fun swipeDirection(x: Float, y: Float, minSwipeLength: Int, swipeType: SwipeNWay = SwipeNWay.EIGHT_WAY): SwipeDirection? {
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

    val trimmedLength = lastWords?.length?.minus(lastWords.trimmedLength()) ?: 0
    val trimmed = lastWords?.trim()
    val lastWordLength = trimmed?.split("\\s".toRegex())?.lastOrNull()?.length ?: 1
    val minDelete = if (lastWordLength > 0) {
        lastWordLength + trimmedLength
    } else {
        1
    }

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
    return KeyboardLayout.values().sortedBy { it.title }[index].index
}

fun keyboardTitleIndexFromRealIndex(index: Int): Int {
    val keyboard = KeyboardLayout.values().find { it.index == index } ?: KeyboardLayout.ThumbKeyENv4
    return KeyboardLayout.values().sortedBy { it.title }.indexOf(keyboard)
}
