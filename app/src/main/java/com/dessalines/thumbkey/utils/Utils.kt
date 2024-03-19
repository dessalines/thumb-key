package com.dessalines.thumbkey.utils

import android.content.Context
import android.content.Intent
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.content.res.Resources
import android.net.Uri
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.text.InputType
import android.util.Log
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
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
import androidx.core.os.ConfigurationCompat
import androidx.navigation.NavController
import com.dessalines.thumbkey.IMEService
import com.dessalines.thumbkey.MainActivity
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.DEFAULT_KEYBOARD_LAYOUT
import com.dessalines.thumbkey.keyboards.DUMMY_KEY
import com.dessalines.thumbkey.keyboards.DUMMY_SKIP_KEY
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.text.NumberFormat
import kotlin.math.abs
import kotlin.math.atan2
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt

const val TAG = "com.thumbkey"

const val THUMBKEY_IME_NAME = "com.dessalines.thumbkey/.IMEService"
const val IME_ACTION_CUSTOM_LABEL = EditorInfo.IME_MASK_ACTION + 1

fun accelCurve(
    offset: Float,
    threshold: Float,
    exp: Float,
): Float {
    var x = abs(offset)
    val belowThreshold = min(offset, threshold)
    x = max(0.0f, x - belowThreshold)
    return x.pow(exp) + belowThreshold
}

fun acceleratingCursorDistanceThreshold(
    offsetX: Float,
    timeOfLastAccelerationInput: Long,
    acceleration: Int,
): Int {
    // val exp = 1.0f // Slow and we can cover  1 1/2 full lines, so perfect for most.
    // val exp = 1.5f // Slow and we can cover 2 full lines, so perfect for most.
    // val exp = 2.0f // 2.0 should be the default
    // val exp = 3.0f // 3.0 should be the upper limit for this
    // Convert user's chosen acceleration of 1-50 to the amount we need.
    val exp = 1.0f + ((acceleration * 4) / 100f) // Will give us a range from 1-3
    val threshold = 2.0f // The threshold before acceleration kicks in.

    val timeDifference = System.currentTimeMillis() - timeOfLastAccelerationInput
    // Prevent division by 0 error.
    var distance =
        if (timeDifference == 0L) {
            0f
        } else {
            abs(offsetX) / timeDifference
        }

    distance = accelCurve(distance, threshold, exp)
    if (offsetX < 0) {
        // Set the value back to negative.
        // A distance of -1 will move the cursor left by 1 character
        distance *= -1
    }
    // distance = offsetX / 10
    return distance.toInt()
}

fun slideCursorDistance(
    offsetX: Float,
    timeOfLastAccelerationInput: Long,
    accelerationMode: Int,
    acceleration: Int,
): Int {
    when (accelerationMode) {
        CursorAccelerationMode.CONSTANT.ordinal -> {
            // Do the same speed every time
            val settingsSliderMaxValue = 50

            return if (abs(offsetX) > (settingsSliderMaxValue - acceleration)) {
                if (offsetX > 0) {
                    1
                } else {
                    -1
                }
            } else {
                0
            }
        }

        CursorAccelerationMode.QUADRATIC.ordinal -> return acceleratingCursorDistanceQuadratic(
            offsetX,
            timeOfLastAccelerationInput,
            acceleration,
        )

        CursorAccelerationMode.LINEAR.ordinal -> return acceleratingCursorDistanceLinear(
            offsetX,
            timeOfLastAccelerationInput,
            acceleration,
        )

        CursorAccelerationMode.THRESHOLD.ordinal -> return acceleratingCursorDistanceThreshold(
            offsetX,
            timeOfLastAccelerationInput,
            acceleration,
        )

        else -> {
            // Default to this if there is no match.
            return acceleratingCursorDistanceLinear(
                offsetX,
                timeOfLastAccelerationInput,
                acceleration,
            )
        }
    }
}

fun acceleratingCursorDistanceLinear(
    offsetX: Float,
    timeOfLastAccelerationInput: Long,
    acceleration: Int,
): Int {
    val accelerationCurve = ((acceleration * 6) / 100f) // Will give us a range from 0-3
    val timeDifference = System.currentTimeMillis() - timeOfLastAccelerationInput
    // Prevent division by 0 error.
    var distance =
        if (timeDifference == 0L) {
            0f
        } else {
            abs(offsetX) / timeDifference
        }

    distance *= accelerationCurve
    if (offsetX < 0) {
        // Set the value back to negative.
        // A distance of -1 will move the cursor left by 1 character
        distance *= -1
    }

    return distance.toInt()
}

fun acceleratingCursorDistanceQuadratic(
    offsetX: Float,
    timeOfLastAccelerationInput: Long,
    acceleration: Int,
): Int {
    val accelerationCurve = 0.1f + ((acceleration * 6) / 1000f) // Will give us a range from 0.1-0.4
    val timeDifference = System.currentTimeMillis() - timeOfLastAccelerationInput
    // Prevent division by 0 error.
    var distance =
        if (timeDifference == 0L) {
            0f
        } else {
            abs(offsetX) / timeDifference
        }

    // Quadratic equation to make the swipe acceleration work along a curve.
    // val accelerationCurve = 0.3f // Fast and almost perfect.
    // var accelerationCurve = 0.2f // Fast and almost perfect.
    // var accelerationCurve = 0.1f // Slowish and moves almost a full line at a time.
    // var accelerationCurve = 0.01f // is slow, only 1 char at a time.
    distance = accelerationCurve * distance.pow(2)
    if (offsetX < 0) {
        // Set the value back to negative.
        // A distance of -1 will move the cursor left by 1 character
        distance *= -1
    }

    return distance.toInt()
}

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

fun fontSizeVariantToFontSize(
    fontSizeVariant: FontSizeVariant,
    keySize: Dp,
    isUpperCase: Boolean,
): Dp {
    val divFactor =
        when (fontSizeVariant) {
            FontSizeVariant.LARGE -> 2.5f
            FontSizeVariant.SMALL -> 5f
            FontSizeVariant.SMALLEST -> 8f
        }

    // Make uppercase letters slightly smaller
    val upperCaseFactor =
        if (isUpperCase) {
            0.8f
        } else {
            1f
        }

    return keySize.times(upperCaseFactor).div(divFactor)
}

val Dp.toPx get() = (this * Resources.getSystem().displayMetrics.density).value
val Float.pxToSp get() = TextUnit(this / Resources.getSystem().displayMetrics.scaledDensity, TextUnitType.Sp)

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
        val angle =
            if (angleDir < 0) {
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
    keyboardSettings: KeyboardDefinitionSettings,
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
                    autocapitalizers = keyboardSettings.autoCapitalizers,
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

        is KeyAction.DeleteWordBeforeCursor -> {
            Log.d(TAG, "deleting last word")
            deleteWordBeforeCursor(ime)
        }

        is KeyAction.DeleteWordAfterCursor -> {
            Log.d(TAG, "deleting next word")
            deleteWordAfterCursor(ime)
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
                    autocapitalizers = keyboardSettings.autoCapitalizers,
                )
            }
        }

        is KeyAction.ComposeLastKey -> {
            Log.d(TAG, "composing last key")
            val text = action.text
            val textBefore = ime.currentInputConnection.getTextBeforeCursor(1, 0)

            val textNew =
                when (text) {
                    "\"" ->
                        when (textBefore) {
                            "a" -> "ä"
                            "A" -> "Ä"
                            "e" -> "ë"
                            "E" -> "Ë"
                            "h" -> "ḧ"
                            "H" -> "Ḧ"
                            "i" -> "ï"
                            "I" -> "Ï"
                            "o" -> "ö"
                            "O" -> "Ö"
                            "t" -> "ẗ"
                            "u" -> "ü"
                            "U" -> "Ü"
                            "w" -> "ẅ"
                            "W" -> "Ẅ"
                            "x" -> "ẍ"
                            "X" -> "Ẍ"
                            "y" -> "ÿ"
                            "Y" -> "Ÿ"
                            " " -> "\""
                            else -> textBefore
                        }
                    "'" ->
                        when (textBefore) {
                            "a" -> "á"
                            "A" -> "Á"
                            "c" -> "ć"
                            "C" -> "Ć"
                            "e" -> "é"
                            "E" -> "É"
                            "g" -> "ǵ"
                            "G" -> "Ǵ"
                            "i" -> "í"
                            "I" -> "Í"
                            "j" -> "j́"
                            "J" -> "J́"
                            "k" -> "ḱ"
                            "K" -> "Ḱ"
                            "l" -> "ĺ"
                            "L" -> "Ĺ"
                            "m" -> "ḿ"
                            "M" -> "Ḿ"
                            "n" -> "ń"
                            "N" -> "Ń"
                            "o" -> "ó"
                            "O" -> "Ó"
                            "p" -> "ṕ"
                            "P" -> "Ṕ"
                            "r" -> "ŕ"
                            "R" -> "Ŕ"
                            "s" -> "ś"
                            "S" -> "Ś"
                            "u" -> "ú"
                            "U" -> "Ú"
                            "w" -> "ẃ"
                            "W" -> "Ẃ"
                            "y" -> "ý"
                            "Y" -> "Ý"
                            "z" -> "ź"
                            "Z" -> "Ź"
                            "'" -> "”"
                            " " -> "'"
                            else -> textBefore
                        }
                    "`" ->
                        when (textBefore) {
                            "a" -> "à"
                            "A" -> "À"
                            "e" -> "è"
                            "E" -> "È"
                            "i" -> "ì"
                            "I" -> "Ì"
                            "n" -> "ǹ"
                            "N" -> "Ǹ"
                            "o" -> "ò"
                            "O" -> "Ò"
                            "u" -> "ù"
                            "U" -> "Ù"
                            "ü" -> "ǜ"
                            "Ü" -> "Ǜ"
                            "w" -> "ẁ"
                            "W" -> "Ẁ"
                            "y" -> "ỳ"
                            "Y" -> "Ỳ"
                            "`" -> "“"
                            " " -> "`"
                            else -> textBefore
                        }
                    "^" ->
                        when (textBefore) {
                            "a" -> "â"
                            "A" -> "Â"
                            "c" -> "ĉ"
                            "C" -> "Ĉ"
                            "e" -> "ê"
                            "E" -> "Ê"
                            "g" -> "ĝ"
                            "G" -> "Ĝ"
                            "h" -> "ĥ"
                            "H" -> "Ĥ"
                            "i" -> "î"
                            "I" -> "Î"
                            "j" -> "ĵ"
                            "J" -> "Ĵ"
                            "o" -> "ô"
                            "O" -> "Ô"
                            "s" -> "ŝ"
                            "S" -> "Ŝ"
                            "u" -> "û"
                            "U" -> "Û"
                            "w" -> "ŵ"
                            "W" -> "Ŵ"
                            "y" -> "ŷ"
                            "Y" -> "Ŷ"
                            "z" -> "ẑ"
                            "Z" -> "Ẑ"
                            " " -> "^"
                            else -> textBefore
                        }
                    "~" ->
                        when (textBefore) {
                            "a" -> "ã"
                            "A" -> "Ã"
                            "c" -> "ç"
                            "C" -> "Ç"
                            "e" -> "ẽ"
                            "E" -> "Ẽ"
                            "i" -> "ĩ"
                            "I" -> "Ĩ"
                            "n" -> "ñ"
                            "N" -> "Ñ"
                            "o" -> "õ"
                            "O" -> "Õ"
                            "u" -> "ũ"
                            "U" -> "Ũ"
                            "v" -> "ṽ"
                            "V" -> "Ṽ"
                            "y" -> "ỹ"
                            "Y" -> "Ỹ"
                            " " -> "~"
                            else -> textBefore
                        }
                    "°" ->
                        when (textBefore) {
                            "a" -> "å"
                            "A" -> "Å"
                            "o" -> "ø"
                            "O" -> "Ø"
                            "u" -> "ů"
                            "U" -> "Ů"
                            " " -> "°"
                            else -> textBefore
                        }
                    "!" ->
                        when (textBefore) {
                            "a" -> "æ"
                            "A" -> "Æ"
                            "c" -> "ç"
                            "C" -> "Ç"
                            "e" -> "æ"
                            "E" -> "Æ"
                            "o" -> "œ"
                            "O" -> "Œ"
                            "s" -> "ß"
                            "S" -> "ẞ"
                            "!" -> "¡"
                            "?" -> "¿"
                            "`" -> "“"
                            "´" -> "”"
                            "\"" -> "“"
                            "'" -> "”"
                            "<" -> "«"
                            ">" -> "»"
                            " " -> "!"
                            else -> textBefore
                        }
                    "\$" ->
                        when (textBefore) {
                            "c" -> "¢"
                            "C" -> "¢"
                            "e" -> "€"
                            "E" -> "€"
                            "f" -> "₣"
                            "F" -> "₣"
                            "l" -> "£"
                            "L" -> "£"
                            "y" -> "¥"
                            "Y" -> "¥"
                            "w" -> "₩"
                            "W" -> "₩"
                            " " -> "\$"
                            else -> textBefore
                        }
                    "゛" ->
                        when (textBefore) {
                            "あ" -> "ぁ"
                            "い" -> "ぃ"
                            "う" -> "ぅ"
                            "え" -> "ぇ"
                            "お" -> "ぉ"
                            "ぅ" -> "ゔ"
                            "か" -> "が"
                            "き" -> "ぎ"
                            "く" -> "ぐ"
                            "け" -> "げ"
                            "こ" -> "ご"
                            "が" -> "ゕ"
                            "げ" -> "ゖ"
                            "さ" -> "ざ"
                            "し" -> "じ"
                            "す" -> "ず"
                            "せ" -> "ぜ"
                            "そ" -> "ぞ"
                            "た" -> "だ"
                            "ち" -> "ぢ"
                            "つ" -> "づ"
                            "て" -> "で"
                            "と" -> "ど"
                            "づ" -> "っ"
                            "は" -> "ば"
                            "ひ" -> "び"
                            "ふ" -> "ぶ"
                            "へ" -> "べ"
                            "ほ" -> "ぼ"
                            "ば" -> "ぱ"
                            "び" -> "ぴ"
                            "ぶ" -> "ぷ"
                            "べ" -> "ぺ"
                            "ぼ" -> "ぽ"
                            "や" -> "ゃ"
                            "ゆ" -> "ゅ"
                            "よ" -> "ょ"
                            "わ" -> "ゎ"
                            "ゝ" -> "ゞ"
                            "ア" -> "ァ"
                            "イ" -> "ィ"
                            "ウ" -> "ゥ"
                            "エ" -> "ェ"
                            "オ" -> "ォ"
                            "ゥ" -> "ヴ"
                            "カ" -> "ガ"
                            "キ" -> "ギ"
                            "ク" -> "グ"
                            "ケ" -> "ゲ"
                            "コ" -> "ゴ"
                            "ガ" -> "ヵ"
                            "ゲ" -> "ヶ"
                            "サ" -> "ザ"
                            "シ" -> "ジ"
                            "ス" -> "ズ"
                            "セ" -> "ゼ"
                            "ソ" -> "ゾ"
                            "タ" -> "ダ"
                            "チ" -> "ヂ"
                            "ツ" -> "ヅ"
                            "テ" -> "デ"
                            "ト" -> "ド"
                            "ヅ" -> "ッ"
                            "ハ" -> "バ"
                            "ヒ" -> "ビ"
                            "フ" -> "ブ"
                            "ヘ" -> "ベ"
                            "ホ" -> "ボ"
                            "バ" -> "パ"
                            "ビ" -> "ピ"
                            "ブ" -> "プ"
                            "ベ" -> "ペ"
                            "ボ" -> "ポ"
                            "ヤ" -> "ャ"
                            "ユ" -> "ュ"
                            "ヨ" -> "ョ"
                            "ワ" -> "ヷ"
                            "ヰ" -> "ヸ"
                            "ヱ" -> "ヹ"
                            "ヲ" -> "ヺ"
                            "ヷ" -> "ヮ"
                            "ヽ" -> "ヾ"
                            else -> textBefore
                        }
                    else -> throw IllegalStateException("Invalid key modifier")
                }

            if (textNew != textBefore) {
                ime.currentInputConnection.deleteSurroundingText(1, 0)
                ime.currentInputConnection.commitText(textNew, 1)
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
            // A lot of apps like discord and slack use weird IME actions,
            // so its best to only check the none case
            when (val imeAction = getImeActionCode(ime)) {
                IME_ACTION_CUSTOM_LABEL -> {
                    ime.currentInputConnection.performEditorAction(ime.currentInputEditorInfo.actionId)
                }
                EditorInfo.IME_ACTION_NONE -> {
                    ime.currentInputConnection.sendKeyEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_ENTER,
                        ),
                    )
                }
                else -> {
                    ime.currentInputConnection.performEditorAction(imeAction)
                }
            }
        }

        KeyAction.ToggleCapsLock -> onToggleCapsLock()
        KeyAction.SelectAll -> {
            // Check here for the action #s:
            // https://developer.android.com/reference/android/R.id
            ime.currentInputConnection.performContextMenuAction(android.R.id.selectAll)
        }
        KeyAction.Cut -> {
            if (ime.currentInputConnection.getSelectedText(0).isNullOrEmpty()) {
                // Nothing selected, so cut all the text
                ime.currentInputConnection.performContextMenuAction(android.R.id.selectAll)
                // Wait a bit for the select all to complete.
                val delayInMillis = 100L
                Handler(Looper.getMainLooper()).postDelayed({
                    ime.currentInputConnection.performContextMenuAction(android.R.id.cut)
                }, delayInMillis)
            } else {
                ime.currentInputConnection.performContextMenuAction(android.R.id.cut)
            }
        }
        KeyAction.Copy -> {
            if (ime.currentInputConnection.getSelectedText(0).isNullOrEmpty()) {
                // Nothing selected, so copy all the text
                ime.currentInputConnection.performContextMenuAction(android.R.id.selectAll)
                // Wait a bit for the select all to complete.
                val delayInMillis = 100L
                Handler(Looper.getMainLooper()).postDelayed({
                    ime.currentInputConnection.performContextMenuAction(android.R.id.copy)
                }, delayInMillis)
            } else {
                ime.currentInputConnection.performContextMenuAction(android.R.id.copy)
            }

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
    val ei = ime.currentInputEditorInfo

    return if ((ei.imeOptions and EditorInfo.IME_FLAG_NO_ENTER_ACTION) != 0) {
        EditorInfo.IME_ACTION_NONE
    } else if (ei.actionLabel != null) {
        IME_ACTION_CUSTOM_LABEL
    } else {
        // Note: this is different from editorInfo.actionId, hence "ImeOptionsActionId"
        ei.imeOptions and EditorInfo.IME_MASK_ACTION
    }
}

/**
 * Returns the correct keyboard mode
 */
fun getKeyboardMode(
    ime: IMEService,
    autoCapitalize: Boolean,
): KeyboardMode {
    val inputType = ime.currentInputEditorInfo.inputType and (InputType.TYPE_MASK_CLASS)

    return if (listOf(
            InputType.TYPE_CLASS_NUMBER,
            InputType.TYPE_CLASS_PHONE,
        ).contains(inputType)
    ) {
        KeyboardMode.NUMERIC
    } else {
        if (autoCapitalize && !isUriOrEmailOrPasswordField(ime) && autoCapitalizeCheck(ime)) {
            KeyboardMode.SHIFTED
        } else {
            KeyboardMode.MAIN
        }
    }
}

private fun autoCapitalize(
    ime: IMEService,
    onAutoCapitalize: (enable: Boolean) -> Unit,
    autocapitalizers: AutoCapitalizers,
) {
    // Run language specific autocapitalizers
    autocapitalizers.forEach { fn ->
        fn(ime)
    }

    if (autoCapitalizeCheck(ime)) {
        onAutoCapitalize(true)
    } else {
        onAutoCapitalize(false)
    }
}

fun autoCapitalizeCheck(ime: IMEService): Boolean {
    return isEmptyField(ime) || isPunctuationEnd(ime)
}

/**
 * Checks if the field is empty
 */
fun isEmptyField(ime: IMEService): Boolean {
    return ime.currentInputConnection.getTextBeforeCursor(1, 0).isNullOrEmpty()
}

/**
 * Checks if the field ends with a punctuation
 */
fun isPunctuationEnd(ime: IMEService): Boolean {
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(2, 0)
    return (listOf(". ", "? ", "! ").contains(textBefore))
}

/**
 * Avoid capitalizing or switching to shifted mode in certain edit boxes
 */
fun isUriOrEmailOrPasswordField(ime: IMEService): Boolean {
    val inputType = ime.currentInputEditorInfo.inputType and (InputType.TYPE_MASK_VARIATION)
    return listOf(
        InputType.TYPE_TEXT_VARIATION_URI,
        InputType.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS,
        InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS,
        InputType.TYPE_TEXT_VARIATION_PASSWORD,
        InputType.TYPE_TEXT_VARIATION_WEB_PASSWORD,
        InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD,
        InputType.TYPE_NUMBER_VARIATION_PASSWORD,
    ).contains(inputType) || ime.currentInputEditorInfo.inputType == EditorInfo.TYPE_NULL
}

fun deleteWordBeforeCursor(ime: IMEService) {
    val wordsBeforeCursor = ime.currentInputConnection.getTextBeforeCursor(9999, 0)

    val pattern = Regex("(\\w+\\W?|[^\\s\\w]+)?\\s*$")
    val lastWordLength = wordsBeforeCursor?.let { pattern.find(it)?.value?.length } ?: 0

    ime.currentInputConnection.deleteSurroundingText(lastWordLength, 0)
}

fun deleteWordAfterCursor(ime: IMEService) {
    val wordsAfterCursor = ime.currentInputConnection.getTextAfterCursor(9999, 0)

    val pattern = Regex("^\\s?(\\w+\\W?|[^\\s\\w]+|\\s+)")
    val nextWordLength = wordsAfterCursor?.let { pattern.find(it)?.value?.length } ?: 0

    ime.currentInputConnection.deleteSurroundingText(0, nextWordLength)
}

fun buildTapActions(keyItem: KeyItemC): List<KeyAction> {
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
    releasedKey.value =
        when (action) {
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
                        Icons.AutoMirrored.Outlined.ArrowBack,
                        contentDescription = stringResource(R.string.settings),
                    )
                }
            }
        },
    )
}

fun openLink(
    url: String,
    ctx: Context,
) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    ctx.startActivity(intent)
}

fun Int.toBool() = this == 1

fun Boolean.toInt() = this.compareTo(false)

/**
 * The layouts there are whats stored in the DB, a string comma set of title index numbers
 */
fun keyboardLayoutsSetFromDbIndexString(layouts: String?): Set<KeyboardLayout> {
    return layouts?.split(",")?.map { KeyboardLayout.entries[it.trim().toInt()] }?.toSet()
        ?: setOf(
            KeyboardLayout.entries[DEFAULT_KEYBOARD_LAYOUT],
        )
}

fun Context.getPackageInfo(): PackageInfo {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0))
    } else {
        packageManager.getPackageInfo(packageName, 0)
    }
}

fun Context.getVersionCode(): Int =
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
        getPackageInfo().longVersionCode.toInt()
    } else {
        @Suppress("DEPRECATION")
        getPackageInfo().versionCode
    }

fun startSelection(ime: IMEService): Selection {
    val cursorPosition =
        ime.currentInputConnection.getTextBeforeCursor(
            Integer.MAX_VALUE,
            0,
        )?.length
    cursorPosition?.let {
        return Selection(it, it, true)
    }
    return Selection()
}

fun getLocalCurrency(): String? {
    return ConfigurationCompat.getLocales(Resources.getSystem().configuration)[0]?.let {
        NumberFormat.getCurrencyInstance(
            it,
        ).currency?.symbol
    }
}

fun lastColKeysToFirst(board: KeyboardC): KeyboardC {
    val newArr =
        board.arr.map { row ->
            if (row.isNotEmpty()) {
                listOf(row.last()) + row.dropLast(1)
            } else {
                row
            }
        }
    return KeyboardC(newArr)
}

fun mergeKeyItems(
    source: KeyItemC,
    variant: KeyItemC,
): KeyItemC {
    // Returns merge of keyItems.
    // If source has swipes of same direction as variant, they'll be replaced.
    // Same with center, unless it's a dummy key (since a centre key is
    // mandatory).
    // DUMMY_SKIP_KEYs will be removed (if you want to blank a spot). Not supported for
    // center keys, only for swipes.

    // Determine the new center. If the variant's center is a 'dummy', keep the source's center.
    val newCenter = if (variant.center == DUMMY_KEY) source.center else variant.center

    // Merge swipes, with variant's swipes overriding source's swipes for the same SwipeDirection
    val newSwipes =
        source.swipes.orEmpty().toMutableMap().apply {
            variant.swipes?.forEach { (direction, keyC) ->
                if (keyC == DUMMY_SKIP_KEY) {
                    this.remove(direction)
                } else {
                    this[direction] = keyC
                }
            }
        }

    return source.copy(
        center = newCenter,
        // if newSwipes is empty, it means all swipes were removed from source.
        swipes = if (newSwipes.isNotEmpty()) newSwipes else null,
    )
}

fun getKeyItemCFromTextLayoutSquare(
    textLayout: Array<String>,
    startX: Int,
    startY: Int,
): KeyItemC {
    // Always return 3x3 string - worst case scenario its full of spaces
    val ourSquare =
        (startY..startY + 3).map {
            val currentRow = textLayout.getOrElse(it) { "|   |   |   |" }
            (startX..startX + 3).map { currentRow.getOrElse(it) { ' ' } }
        }

    return KeyItemC(
        center =
            if (ourSquare[1][1] == ' ') {
                DUMMY_KEY
            } else {
                KeyC(
                    display = KeyDisplay.TextDisplay(ourSquare[1][1].toString()),
                    action = KeyAction.CommitText(ourSquare[1][1].toString()),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                )
            },
        swipes =
            mapOf(
                SwipeDirection.LEFT to ourSquare[1][0],
                SwipeDirection.TOP_LEFT to ourSquare[0][0],
                SwipeDirection.TOP to ourSquare[0][1],
                SwipeDirection.TOP_RIGHT to ourSquare[0][2],
                SwipeDirection.RIGHT to ourSquare[1][2],
                SwipeDirection.BOTTOM_RIGHT to ourSquare[2][2],
                SwipeDirection.BOTTOM to ourSquare[2][1],
                SwipeDirection.BOTTOM_LEFT to ourSquare[2][0],
            )
                .filter { (_, letter) -> letter != ' ' }
                .map { (direction, letter) ->
                    direction to
                        KeyC(
                            display = KeyDisplay.TextDisplay(letter.toString()),
                            action = KeyAction.CommitText(letter.toString()),
                            color = if (letter.isLetter()) ColorVariant.SECONDARY else ColorVariant.MUTED,
                        )
                }
                .toMap(),
    )
}

fun getKeyboardFromTextLayout(textLayout: String): KeyboardC {
    val lines = textLayout.split("\n").toTypedArray<String>()

    return KeyboardC(
        listOf(
            listOf(
                getKeyItemCFromTextLayoutSquare(lines, 1, 1),
                getKeyItemCFromTextLayoutSquare(lines, 5, 1),
                getKeyItemCFromTextLayoutSquare(lines, 9, 1),
            ),
            listOf(
                getKeyItemCFromTextLayoutSquare(lines, 1, 5),
                getKeyItemCFromTextLayoutSquare(lines, 5, 5),
                getKeyItemCFromTextLayoutSquare(lines, 9, 5),
            ),
            listOf(
                getKeyItemCFromTextLayoutSquare(lines, 1, 9),
                getKeyItemCFromTextLayoutSquare(lines, 5, 9),
                getKeyItemCFromTextLayoutSquare(lines, 9, 9),
            ),
        ),
    )
}
