package com.dessalines.thumbkey.utils

import android.view.KeyEvent
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontFamily
import arrow.optics.optics
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.textprocessors.TextProcessor

@optics
data class KeyboardDefinitionModes(
    val main: KeyboardC,
    val shifted: KeyboardC,
    val numeric: KeyboardC,
    val ctrled: KeyboardC? = null,
    val alted: KeyboardC? = null,
) {
    companion object
}

@optics
data class KeyboardDefinitionSettings(
    val autoCapitalizers: AutoCapitalizers = arrayOf(),
    val autoShift: Boolean = true,
    val textProcessor: TextProcessor? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as KeyboardDefinitionSettings

        return autoCapitalizers.contentEquals(other.autoCapitalizers)
    }

    override fun hashCode(): Int = autoCapitalizers.contentHashCode()

    companion object
}

@optics
data class KeyboardDefinition(
    val title: String,
    val modes: KeyboardDefinitionModes,
    val settings: KeyboardDefinitionSettings = KeyboardDefinitionSettings(),
) {
    companion object
}

@optics
// Almost a 4x4 grid, but the bottom is mostly spacebar
data class KeyboardC(
    val arr: List<List<KeyItemC>>,
) {
    companion object
}

@optics
data class KeyItemC(
    val center: KeyC,
    val left: KeyC? = null,
    val topLeft: KeyC? = null,
    val top: KeyC? = null,
    val topRight: KeyC? = null,
    val right: KeyC? = null,
    val bottomRight: KeyC? = null,
    val bottom: KeyC? = null,
    val bottomLeft: KeyC? = null,
    val nextTapActions: List<KeyAction>? = null,
    val widthMultiplier: Int = 1,
    val backgroundColor: ColorVariant = ColorVariant.SURFACE,
    val swipeType: SwipeNWay = SwipeNWay.EIGHT_WAY,
    val slideType: SlideType = SlideType.NONE,
    val longPress: KeyAction? = null,
) {
    companion object

    fun getSwipe(dir: SwipeDirection?) =
        when (dir) {
            null -> null
            SwipeDirection.LEFT -> left
            SwipeDirection.TOP_LEFT -> topLeft
            SwipeDirection.TOP -> top
            SwipeDirection.TOP_RIGHT -> topRight
            SwipeDirection.RIGHT -> right
            SwipeDirection.BOTTOM_RIGHT -> bottomRight
            SwipeDirection.BOTTOM -> bottom
            SwipeDirection.BOTTOM_LEFT -> bottomLeft
        }
}

fun KeyboardC.alterKey(
    row: Int,
    col: Int,
    modifier: (KeyItemC) -> KeyItemC,
): KeyboardC =
    this.copy(
        arr =
            this.arr.toMutableList().apply {
                if (row < this.size) {
                    this[row] =
                        this[row].toMutableList().apply {
                            if (col < this.size) {
                                this[col] = modifier(this[col])
                            }
                        }
                }
            },
    )

fun KeyboardC.alterKeys(vararg modifications: Triple<Int, Int, (KeyItemC) -> KeyItemC>): KeyboardC {
    var result = this
    for ((row, col, modifier) in modifications) {
        result = result.alterKey(row, col, modifier)
    }
    return result
}

@optics
data class KeyC(
    val action: KeyAction,
    val swipeReturnAction: KeyAction? = null,
    val display: KeyDisplay? =
        when (action) {
            is KeyAction.CommitText -> KeyDisplay.TextDisplay(action.text)
            else -> null
        },
    val capsModeDisplay: KeyDisplay? = null,
    val size: FontSizeVariant = FontSizeVariant.SMALL,
    val color: ColorVariant =
        when (size) {
            FontSizeVariant.LARGE -> ColorVariant.PRIMARY
            else -> ColorVariant.SECONDARY
        },
) {
    constructor(
        text: String,
        displayText: String = text,
        displayFont: FontFamily? = null,
        swipeReturnAction: KeyAction? = null,
        display: KeyDisplay = KeyDisplay.TextDisplay(displayText, fontFamily = displayFont),
        capsModeDisplay: KeyDisplay? = null,
        size: FontSizeVariant = FontSizeVariant.SMALL,
        color: ColorVariant =
            when (size) {
                FontSizeVariant.LARGE -> ColorVariant.PRIMARY
                else -> ColorVariant.SECONDARY
            },
    ) : this(
        KeyAction.CommitText(text),
        swipeReturnAction,
        display,
        capsModeDisplay,
        size,
        color,
    )

    companion object
}

sealed class KeyDisplay {
    class TextDisplay(
        val text: String,
        val fontFamily: FontFamily? = null,
    ) : KeyDisplay()

    class IconDisplay(
        val icon: ImageVector,
    ) : KeyDisplay()
}

sealed class KeyAction {
    class CommitText(
        val text: String,
    ) : KeyAction()

    class SendEvent(
        val event: KeyEvent,
    ) : KeyAction()

    class ReplaceLastText(
        val text: String,
        val trimCount: Int = 2,
    ) : KeyAction()

    class ReplaceTrailingWhitespace(
        val text: String,
        val distanceBack: Int,
    ) : KeyAction()

    class ToggleShiftMode(
        val enable: Boolean,
    ) : KeyAction()

    class ToggleCtrlMode(
        val enable: Boolean,
    ) : KeyAction()

    class ToggleAltMode(
        val enable: Boolean,
    ) : KeyAction()

    class ShiftAndCapsLock(
        val enable: Boolean,
    ) : KeyAction()

    class ToggleCurrentWordCapitalization(
        val toggleUp: Boolean,
    ) : KeyAction()

    class ToggleNumericMode(
        val enable: Boolean,
    ) : KeyAction()

    class ToggleEmojiMode(
        val enable: Boolean,
    ) : KeyAction()

    class ToggleClipboardMode(
        val enable: Boolean,
    ) : KeyAction()

    class ComposeLastKey(
        val text: String,
    ) : KeyAction()

    class SmartQuotes(
        val start: String,
        val end: String,
    ) : KeyAction()

    sealed class MoveKeyboard : KeyAction() {
        class ToPosition(
            val position: KeyboardPosition,
        ) : KeyAction()

        data object Left : KeyAction()

        data object Right : KeyAction()

        data object CycleLeft : KeyAction()

        data object CycleRight : KeyAction()
    }

    data object DeleteKeyAction : KeyAction()

    data object DeleteWordBeforeCursor : KeyAction()

    data object DeleteWordAfterCursor : KeyAction()

    data object PreviousWordBeforeCursor : KeyAction()

    data object NextWordAfterCursor : KeyAction()

    data object GotoSettings : KeyAction()

    data object IMECompleteAction : KeyAction()

    data object ToggleCapsLock : KeyAction()

    data object ToggleHideLetters : KeyAction()

    data object SelectAll : KeyAction()

    data object Cut : KeyAction()

    data object Copy : KeyAction()

    data object Paste : KeyAction()

    data object Undo : KeyAction()

    data object Redo : KeyAction()

    data object SwitchLanguage : KeyAction()

    data object SwitchIME : KeyAction()

    data object SwitchIMEVoice : KeyAction()

    data object HideKeyboard : KeyAction()

    data object Noop : KeyAction()
}

enum class CursorAccelerationMode(
    @param:StringRes val resId: Int,
) {
    LINEAR(R.string.slide_cursor_acceleration_linear),
    QUADRATIC(R.string.slide_cursor_acceleration_quadratic),
    THRESHOLD(R.string.slide_cursor_acceleration_threshold_acceleration),
    CONSTANT(R.string.slide_cursor_acceleration_constant),
}

enum class KeyboardMode {
    MAIN,
    SHIFTED,
    NUMERIC,
    EMOJI,
    CTRLED,
    ALTED,
    CLIPBOARD,
}

enum class SwipeDirection {
    LEFT,
    TOP_LEFT,
    TOP,
    TOP_RIGHT,
    RIGHT,
    BOTTOM_RIGHT,
    BOTTOM,
    BOTTOM_LEFT,
}

enum class ColorVariant {
    PRIMARY,
    SECONDARY,
    SURFACE,
    SURFACE_VARIANT,
    MUTED,
}

enum class FontSizeVariant {
    LARGE,
    SMALL,
    SMALLEST,
}

enum class ThemeMode(
    @param:StringRes val resId: Int,
) {
    System(R.string.system),
    Light(R.string.light),
    Dark(R.string.dark),
}

enum class ThemeColor(
    @param:StringRes val resId: Int,
) {
    Dynamic(R.string.dynamic),
    Green(R.string.green),
    Pink(R.string.pink),
    Srcery(R.string.srcery),
    Blue(R.string.blue),
    Dracula(R.string.dracula),
    Twilight(R.string.twilight),
    HighContrast(R.string.high_contrast),
    HighContrastColorful(R.string.high_contrast_colorful),
    Ancom(R.string.ancom),
    Matrix(R.string.matrix),
    Neon(R.string.neon),
}

enum class KeyboardPosition(
    @param:StringRes val resId: Int,
) {
    Center(R.string.center),
    Right(R.string.right),
    Left(R.string.left),
    Dual(R.string.dual),
}

enum class SwipeNWay {
    EIGHT_WAY,
    FOUR_WAY_CROSS,
    FOUR_WAY_DIAGONAL,
    TWO_WAY_VERTICAL,
    TWO_WAY_HORIZONTAL,
}

enum class SlideType {
    NONE,
    MOVE_CURSOR,
    DELETE,
}

data class Selection(
    var start: Int,
    var end: Int,
    var active: Boolean,
) {
    constructor() : this(0, 0, false)

    fun left() {
        end -= 1
    }

    fun left(index: Int) {
        end -= index
    }

    fun right() {
        end += 1
    }

    fun right(index: Int) {
        end += index
    }
}

enum class CircularDirection {
    Clockwise,
    Counterclockwise,
}

enum class CircularDragAction(
    @param:StringRes val resId: Int,
) {
    OppositeCase(R.string.send_oppsite_case),
    Numeric(R.string.send_numeric),
}
