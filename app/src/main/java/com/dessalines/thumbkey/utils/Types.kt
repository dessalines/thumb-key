package com.dessalines.thumbkey.utils

import android.view.KeyEvent
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontFamily
import com.dessalines.thumbkey.R

data class KeyboardDefinitionModes(
    val main: KeyboardC,
    val shifted: KeyboardC,
    val numeric: KeyboardC,
    val ctrled: KeyboardC? = null,
    val alted: KeyboardC? = null,
) {
    fun deepCopy(): KeyboardDefinitionModes {
        // In some keyboards, the main and shifted reference the same KeyboardC object
        // so only one deep copy is needed for the two of them
        val deepCopies =
            listOf(
                main,
                shifted,
                numeric,
                ctrled,
                alted,
            ).toSet().associate { it to it?.deepCopy() }

        return KeyboardDefinitionModes(
            main = deepCopies[main]!!,
            shifted = deepCopies[shifted]!!,
            numeric = deepCopies[numeric]!!,
            ctrled = deepCopies[ctrled],
            alted = deepCopies[alted],
        )
    }
}

data class KeyboardDefinitionSettings(
    val autoCapitalizers: AutoCapitalizers = arrayOf(),
    val autoShift: Boolean = true,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as KeyboardDefinitionSettings

        return autoCapitalizers.contentEquals(other.autoCapitalizers)
    }

    override fun hashCode(): Int = autoCapitalizers.contentHashCode()

    fun deepCopy(): KeyboardDefinitionSettings =
        KeyboardDefinitionSettings(
            autoCapitalizers = autoCapitalizers.copyOf(),
            autoShift = autoShift,
        )
}

data class KeyboardDefinition(
    val title: String,
    val modes: KeyboardDefinitionModes,
    val settings: KeyboardDefinitionSettings = KeyboardDefinitionSettings(),
) {
    fun deepCopy(): KeyboardDefinition =
        KeyboardDefinition(
            title = title,
            modes = modes.deepCopy(),
            settings = settings.deepCopy(),
        )
}

// Almost a 4x4 grid, but the bottom is mostly spacebar
data class KeyboardC(
    val arr: List<List<KeyItemC>>,
) {
    fun deepCopy(): KeyboardC =
        KeyboardC(
            arr = arr.map { row -> row.map { it.deepCopy() } },
        )
}

data class KeyItemC(
    var center: KeyC,
    var left: KeyC? = null,
    var topLeft: KeyC? = null,
    var top: KeyC? = null,
    var topRight: KeyC? = null,
    var right: KeyC? = null,
    var bottomRight: KeyC? = null,
    var bottom: KeyC? = null,
    var bottomLeft: KeyC? = null,
    var nextTapActions: List<KeyAction>? = null,
    var widthMultiplier: Int = 1,
    var backgroundColor: ColorVariant = ColorVariant.SURFACE,
    var swipeType: SwipeNWay = SwipeNWay.EIGHT_WAY,
    var slideType: SlideType = SlideType.NONE,
    var longPress: KeyAction? = null,
) {
    fun deepCopy(): KeyItemC =
        KeyItemC(
            center = center.deepCopy(),
            left = left?.deepCopy(),
            topLeft = topLeft?.deepCopy(),
            top = top?.deepCopy(),
            topRight = topRight?.deepCopy(),
            right = right?.deepCopy(),
            bottomRight = bottomRight?.deepCopy(),
            bottom = bottom?.deepCopy(),
            bottomLeft = bottomLeft?.deepCopy(),
            nextTapActions = nextTapActions?.map { it.deepCopy() }?.toList(),
            widthMultiplier = widthMultiplier,
            backgroundColor = backgroundColor,
            swipeType = swipeType,
            slideType = slideType,
            longPress = longPress,
        )

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

data class KeyC(
    var action: KeyAction,
    var swipeReturnAction: KeyAction? = null,
    var display: KeyDisplay? =
        when (action) {
            is KeyAction.CommitText -> KeyDisplay.TextDisplay(action.text)
            else -> null
        },
    var capsModeDisplay: KeyDisplay? = null,
    var size: FontSizeVariant = FontSizeVariant.SMALL,
    var color: ColorVariant =
        when (size) {
            FontSizeVariant.LARGE -> ColorVariant.PRIMARY
            else -> ColorVariant.SECONDARY
        },
) {
    fun deepCopy(): KeyC =
        KeyC(
            action = action.deepCopy(),
            swipeReturnAction = swipeReturnAction?.deepCopy(),
            display = display?.deepCopy(),
            capsModeDisplay = capsModeDisplay?.deepCopy(),
            size = size,
            color = color,
        )

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
}

sealed class KeyDisplay {
    class TextDisplay(
        var text: String,
        var fontFamily: FontFamily? = null,
    ) : KeyDisplay() {
        override fun deepCopy(): TextDisplay =
            TextDisplay(
                text = text,
                fontFamily = fontFamily,
            )
    }

    class IconDisplay(
        val icon: ImageVector,
    ) : KeyDisplay() {
        override fun deepCopy(): IconDisplay =
            IconDisplay(
                icon = icon,
            )
    }

    open fun deepCopy(): KeyDisplay = this
}

sealed class KeyAction {
    open fun deepCopy(): KeyAction = this

    class CommitText(
        val text: String,
    ) : KeyAction() {
        override fun deepCopy(): CommitText =
            CommitText(
                text = text,
            )
    }

    class SendEvent(
        val event: KeyEvent,
    ) : KeyAction() {
        override fun deepCopy(): SendEvent =
            SendEvent(
                event = event,
            )
    }

    class ReplaceLastText(
        val text: String,
        val trimCount: Int = 2,
    ) : KeyAction() {
        override fun deepCopy(): ReplaceLastText =
            ReplaceLastText(
                text = text,
                trimCount = trimCount,
            )
    }

    class ReplaceTrailingWhitespace(
        val text: String,
        val distanceBack: Int,
    ) : KeyAction() {
        override fun deepCopy(): ReplaceTrailingWhitespace =
            ReplaceTrailingWhitespace(
                text = text,
                distanceBack = distanceBack,
            )
    }

    class ToggleShiftMode(
        val enable: Boolean,
    ) : KeyAction() {
        override fun deepCopy(): ToggleShiftMode =
            ToggleShiftMode(
                enable = enable,
            )
    }

    class ToggleCtrlMode(
        val enable: Boolean,
    ) : KeyAction() {
        override fun deepCopy(): ToggleCtrlMode =
            ToggleCtrlMode(
                enable = enable,
            )
    }

    class ToggleAltMode(
        val enable: Boolean,
    ) : KeyAction() {
        override fun deepCopy(): ToggleAltMode =
            ToggleAltMode(
                enable = enable,
            )
    }

    class ShiftAndCapsLock(
        val enable: Boolean,
    ) : KeyAction() {
        override fun deepCopy(): ShiftAndCapsLock =
            ShiftAndCapsLock(
                enable = enable,
            )
    }

    class ToggleCurrentWordCapitalization(
        val toggleUp: Boolean,
    ) : KeyAction() {
        override fun deepCopy(): ToggleCurrentWordCapitalization =
            ToggleCurrentWordCapitalization(
                toggleUp = toggleUp,
            )
    }

    class ToggleNumericMode(
        val enable: Boolean,
    ) : KeyAction() {
        override fun deepCopy(): ToggleNumericMode =
            ToggleNumericMode(
                enable = enable,
            )
    }

    class ToggleEmojiMode(
        val enable: Boolean,
    ) : KeyAction() {
        override fun deepCopy(): ToggleEmojiMode =
            ToggleEmojiMode(
                enable = enable,
            )
    }

    class ComposeLastKey(
        val text: String,
    ) : KeyAction() {
        override fun deepCopy(): ComposeLastKey =
            ComposeLastKey(
                text = text,
            )
    }

    class SmartQuotes(
        val start: String,
        val end: String,
    ) : KeyAction() {
        override fun deepCopy(): SmartQuotes =
            SmartQuotes(
                start = start,
                end = end,
            )
    }

    sealed class MoveKeyboard : KeyAction() {
        class ToPosition(
            val position: KeyboardPosition,
        ) : MoveKeyboard() {
            override fun deepCopy(): ToPosition =
                ToPosition(
                    position = position,
                )
        }

        data object Left : KeyAction()

        data object Right : KeyAction()

        data object CycleLeft : KeyAction()

        data object CycleRight : KeyAction()
    }

    data object DeleteKeyAction : KeyAction()

    data object DeleteWordBeforeCursor : KeyAction()

    data object DeleteWordAfterCursor : KeyAction()

    data object GotoSettings : KeyAction()

    data object IMECompleteAction : KeyAction()

    data object ToggleCapsLock : KeyAction()

    data object SelectAll : KeyAction()

    data object Cut : KeyAction()

    data object Copy : KeyAction()

    data object Paste : KeyAction()

    data object Undo : KeyAction()

    data object Redo : KeyAction()

    data object SwitchLanguage : KeyAction()

    data object SwitchIME : KeyAction()

    data object SwitchIMEVoice : KeyAction()

    data object Noop : KeyAction()
}

enum class CursorAccelerationMode(
    @StringRes val resId: Int,
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
    @StringRes val resId: Int,
) {
    System(R.string.system),
    Light(R.string.light),
    Dark(R.string.dark),
}

enum class ThemeColor(
    @StringRes val resId: Int,
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
    @StringRes val resId: Int,
) {
    Center(R.string.center),
    Right(R.string.right),
    Left(R.string.left),
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
    @StringRes val resId: Int,
) {
    OppositeCase(R.string.send_oppsite_case),
    Numeric(R.string.send_numeric),
}
