package com.dessalines.thumbkey.utils

import android.view.KeyEvent
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.dessalines.thumbkey.R

data class KeyboardDefinitionModes(
    val main: KeyboardC,
    val shifted: KeyboardC,
    val numeric: KeyboardC,
)

data class KeyboardDefinitionSettings(
    val autoCapitalizers: AutoCapitalizers = arrayOf(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as KeyboardDefinitionSettings

        return autoCapitalizers.contentEquals(other.autoCapitalizers)
    }

    override fun hashCode(): Int {
        return autoCapitalizers.contentHashCode()
    }
}

data class KeyboardDefinition(
    val title: String,
    val modes: KeyboardDefinitionModes,
    val settings: KeyboardDefinitionSettings = KeyboardDefinitionSettings(),
)

// Almost a 4x4 grid, but the bottom is mostly spacebar
data class KeyboardC(
    val arr: List<List<KeyItemC>>,
)

data class KeyItemC(
    val center: KeyC,
    val swipes: Map<SwipeDirection, KeyC>? = null,
    val nextTapActions: List<KeyAction>? = null,
    val widthMultiplier: Int = 1,
    val backgroundColor: ColorVariant = ColorVariant.PRIMARY_KEY,
    val swipeType: SwipeNWay = SwipeNWay.EIGHT_WAY,
    val slideType: SlideType = SlideType.NONE,
)

data class KeyC(
    val display: KeyDisplay?,
    val capsModeDisplay: KeyDisplay? = null,
    val action: KeyAction,
    val color: ColorVariant = ColorVariant.SECONDARY_LEGENDS,
    val size: FontSizeVariant = FontSizeVariant.SMALL,
)

sealed class KeyDisplay {
    class TextDisplay(val text: String) : KeyDisplay()
    class IconDisplay(val icon: ImageVector) : KeyDisplay()
}

sealed class KeyAction {
    class CommitText(val text: String) : KeyAction()
    class SendEvent(val event: KeyEvent) : KeyAction()
    class ReplaceLastText(val text: String, val trimCount: Int = 2) : KeyAction()
    class ToggleShiftMode(val enable: Boolean) : KeyAction()
    class ToggleNumericMode(val enable: Boolean) : KeyAction()
    class ToggleEmojiMode(val enable: Boolean) : KeyAction()
    class ComposeLastKey(val text: String) : KeyAction()
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
    data object SwitchPosition : KeyAction()
    data object SwitchIME : KeyAction()
    data object SwitchIMEVoice : KeyAction()
}

enum class CursorAccelerationMode(private val stringId: Int) {
    LINEAR(R.string.slide_cursor_acceleration_linear),
    QUADRATIC(R.string.slide_cursor_acceleration_quadratic),
    THRESHOLD(R.string.slide_cursor_acceleration_threshold_acceleration),
    CONSTANT(R.string.slide_cursor_acceleration_constant),
    ;

    @Composable
    fun title(): String {
        return stringResource(this.stringId)
    }
}

enum class KeyboardMode {
    MAIN, SHIFTED, NUMERIC, EMOJI
}

enum class SwipeDirection {
    LEFT, TOP_LEFT, TOP, TOP_RIGHT, RIGHT, BOTTOM_RIGHT, BOTTOM, BOTTOM_LEFT,
}

enum class ColorVariant {
    PRIMARY_LEGENDS, SECONDARY_LEGENDS, PRIMARY_KEY, SECONDARY_KEY, SECONDARY_SWIPES,
}

enum class FontSizeVariant {
    LARGE, SMALL, SMALLEST
}

enum class ThemeMode(private val stringId: Int) {
    System(R.string.system),
    Light(R.string.light),
    Dark(R.string.dark),
    ;

    @Composable
    fun title(): String {
        return stringResource(this.stringId)
    }
}

enum class ThemeColor(private val stringId: Int) {
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
    ;

    @Composable
    fun title(): String {
        return stringResource(this.stringId)
    }
}

enum class KeyboardPosition(private val stringId: Int) {
    Center(R.string.center),
    Right(R.string.right),
    Left(R.string.left),
    ;

    @Composable
    fun title(): String {
        return stringResource(this.stringId)
    }
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
    constructor() : this (0, 0, false)
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
