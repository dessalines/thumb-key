package com.dessalines.thumbkey.utils

import android.view.KeyEvent
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.dessalines.thumbkey.R

// Almost a 4x4 grid, but the bottom is mostly spacebar
data class KeyboardC(
    val arr: List<List<KeyItemC>>,
)

data class KeyItemC(
    val center: KeyC,
    val swipes: Map<SwipeDirection, KeyC>? = null,
    val nextTapActions: List<KeyAction>? = null,
    val widthMultiplier: Int = 1,
    val backgroundColor: ColorVariant = ColorVariant.SURFACE,
    val swipeType: SwipeNWay = SwipeNWay.EIGHT_WAY,
    val slideType: SlideType = SlideType.NONE,
)

data class KeyC(
    val display: KeyDisplay?,
    val capsModeDisplay: KeyDisplay? = null,
    val action: KeyAction,
    val color: ColorVariant = ColorVariant.SECONDARY,
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
    data object DeleteLastWord : KeyAction()
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
}

enum class KeyboardMode {
    MAIN, SHIFTED, NUMERIC, EMOJI
}

enum class SwipeDirection {
    LEFT, TOP_LEFT, TOP, TOP_RIGHT, RIGHT, BOTTOM_RIGHT, BOTTOM, BOTTOM_LEFT,
}

enum class ColorVariant {
    PRIMARY, SECONDARY, SURFACE, SURFACE_VARIANT, MUTED,
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
    ;

    @Composable
    fun title(): String {
        return stringResource(this.stringId)
    }
}

// Make sure new keyboards have a new index, even if they are in the middle
enum class KeyboardLayout(val title: String, val index: Int) {
    ThumbKeyENv4("Thumb-Key english v4", 0),
    ThumbKeyENv4Programmer("Thumb-Key english v4 (programmer)", 1),
    ThumbKeyDEv2("Thumb-Key deutsch v2", 2),
    ThumbKeyDAv1("Thumb-Key dansk v1", 3),
    ThumbKeyESv1("Thumb-Key español v1", 4),
    ThumbKeyEUv1("Thumb-Key euskara v1", 5),
    ThumbKeyFAv1("Thumb-Key فارسیv1", 6),
    ThumbKeyFIv1("Thumb-Key suomi v1", 7),
    ThumbKeyFRv1("Thumb-Key français v1", 8),
    ThumbKeyITv1("Thumb-Key italiano v1", 9),
    ThumbKeyNLv1("Thumb-Key nederlands v1", 10),
    ThumbKeyPLv2("Thumb-Key polski v2", 11),
    ThumbKeyPTv1("Thumb-Key português v1", 12),
    ThumbKeyRUv2("Thumb-Key русский v2", 13),
    ThumbKeyUKv1("Thumb-Key українська v1", 14),
    MessageEaseEN("MessageEase english", 15),
    MessageEaseENSymbols("MessageEase english with symbols", 16),
    MessageEaseHE("MessageEase עברית", 17),
    ThumbKeyRUv2Symbols("Thumb-Key русский v2 с символами", 18),
    ThumbKeyBYv1("Thumb-Key беларуская v1", 19),
    ThumbKeyBYv1Symbols("Thumb-Key беларуская v1 з сімваламі", 20),
    ThumbKeyENv4Symbols("Thumb-Key english v4 with symbols", 21),
    ThumbKeyFIv1Wide("Thumb-Key suomi v1 wide", 22),
    MessageEaseDE("MessageEase deutsch", 23),
    ThumbKeyNOv1("Thumb-Key norsk v1", 24),
    ThumbKeyDEv2MultiLingual("Thumb-Key deutsch v2 multilingual", 25),
    ThumbKeyKAv1("Thumb-Key kartuli ena v1", 26),
    ThumbKeyIDv1("Thumb-Key bahasa indonesia with symbols v1", 27),
    MessageEaseFR("MessageEase français", 28),
    MessageEaseRUSymbols("MessageEase русский with Symbols", 29),
    T9v1("T9 v1", 30),
    ThumbKeyJAv1Hiragana("Thumb-Key japanese Hiragana v1", 31),
    ThumbKeyJAv1Katakana("Thumb-Key japanese Katakana v1", 32),
    ThumbKeyFRv2("Thumb-Key français v2", 33),
    ThumbKeySVv1("Thumb-Key svenska v1", 34),
    ThumbKeyTRv1("Thumb-Key Türkçe v1", 35),
    TypeSplitENv2("Type-Split english v2", 36),
    TypeSplitESv1("Type-Split español v1", 37),
    TypeSplitDEv1("Type-Split deutsch v1", 38),
    TypeSplitFRv1("Type-Split français v1", 39),
    TypeSplitITv1("Type-Split italiano v1", 40),
    TypeSplitPTv1("Type-Split português v1", 41),
    TypeSplitPLv1("Type-Split polski v1", 42),
    TwoHandsENv1("Two Hands english v1", 43),
    WideLayoutENProgrammer("Wide Layout English Programmer", 44),
    ThumbKeyHUv1("Thumb-Key magyar nyelv v1", 45),
    ThumbKeyESEOv1("Thumb-Key español esperanto v1", 46),
    MessageEaseIT("MessageEase italiano", 47),
    ThumbKeyENv4Multi("Thumb-Key english v4 (EN+SK multi)", 48),
    ThumbKeyHEv1("Thumb-Key עברית v1", 49),
    ThumbKeyEOENDEv1("Thumb-Key EO/EN/DE", 50),
    ThumbKeyGRv1("Thumb-Key ελληνικά v1", 51),
    ThumbKeyCZv1("Thumb-Key čeština v1", 52),
    MessageEaseES("MessageEase español", 53),
    MessageEaseRU("MessageEase русский", 54),
    ThumbKeyBGv1Symbols("Thumb-Key български v1 със символи", 55),
    TwoHandsHRv1("Two hands hrvatski v1", 56),
    ThumbKeyHRv1("Thumb-Key hrvatski v1", 57),
    ThumbKeyHRv1Symbols("Thumb-Key hrvatski v1 with symbols", 58),
    TypeSplitFIv1("Type-Split suomi v1", 59),
    ThumbKeyLVLTGv1("Thumb-Key latviešu valoda v1", 60),
    ThumbKeyLTv1("Thumb-Key lietuvių kalba v1", 61),
    ThumbKeyIDv2("Thumb-Key Bahasa Indonesia with Symbols v2", 62),
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
}
