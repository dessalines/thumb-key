package com.dessalines.thumbkey.utils

import android.view.KeyEvent
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.dessalines.thumbkey.R

// Almost a 4x4 grid, but the bottom is mostly spacebar
data class KeyboardC(
    val arr: Array<Array<KeyItemC>>
)

data class KeyItemC(
    val center: KeyC,
    val swipes: Map<SwipeDirection, KeyC>? = null,
    val nextTapActions: Array<KeyAction>? = null,
    val widthMultiplier: Int = 1,
    val backgroundColor: ColorVariant = ColorVariant.SURFACE
)

data class KeyC(
    val display: KeyDisplay?,
    val capsModeDisplay: KeyDisplay? = null,
    val action: KeyAction,
    val color: ColorVariant = ColorVariant.SECONDARY,
    val size: FontSizeVariant = FontSizeVariant.SMALL
)

sealed class KeyDisplay {
    class TextDisplay(val text: String) : KeyDisplay()
    class IconDisplay(val icon: ImageVector) : KeyDisplay()
}

sealed class KeyAction {
    class CommitText(val text: String) : KeyAction()
    class SendEvent(val event: KeyEvent) : KeyAction()
    object DeleteLastWord : KeyAction()
    class ReplaceLastText(val text: String, val trimCount: Int = 2) : KeyAction()
    class ToggleShiftMode(val enable: Boolean) : KeyAction()
    class ToggleNumericMode(val enable: Boolean) : KeyAction()
    object GotoSettings : KeyAction()
    object IMECompleteAction : KeyAction()
    object ToggleCapsLock : KeyAction()
    object SelectAndCopyAll : KeyAction()
    object Paste : KeyAction()
    object SwitchLanguage : KeyAction()
    object SwitchPosition : KeyAction()
}

enum class KeyboardMode {
    MAIN, SHIFTED, NUMERIC
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
    Dark(R.string.dark);

    @Composable
    fun title(): String {
        return stringResource(this.stringId)
    }
}

enum class ThemeColor(private val stringId: Int) {
    Dynamic(R.string.dynamic),
    Green(R.string.green),
    Pink(R.string.pink);

    @Composable
    fun title(): String {
        return stringResource(this.stringId)
    }
}

// Make sure new keyboards have a new index, even if they are in the middle
enum class KeyboardLayout(val title: String, val index: Int) {
    ThumbKeyENv4("Thumb-Key English v4", 0),
    ThumbKeyENv4Programmer("Thumb-Key English v4 (Programmer)", 1),
    ThumbKeyDEv2("Thumb-Key Deutsch v2", 2),
    ThumbKeyDKv1("Thumb-Key dansk v1", 3),
    ThumbKeyESv1("Thumb-Key español v1", 4),
    ThumbKeyEUv1("Thumb-Key euskara v1", 5),
    ThumbKeyFAv1("Thumb-Key فارسیv1", 6),
    ThumbKeyFIv1("Thumb-Key suomi v1", 7),
    ThumbKeyFRv1("Thumb-Key Français v1", 8),
    ThumbKeyITv1("Thumb-Key italiano v1", 9),
    ThumbKeyNLv1("Thumb-Key Nederlands v1", 10),
    ThumbKeyPLv2("Thumb-Key polski v2", 11),
    ThumbKeyPTv1("Thumb-Key português v1", 12),
    ThumbKeyRUv1("Thumb-Key русский v1", 13),
    ThumbKeyUKv1("Thumb-Key українська v1", 14),
    MessageEaseEN("MessageEase English", 15),
    MessageEaseENSymbols("MessageEase English w/ Symbols", 16),
    MessageEaseHE("MessageEase עברית", 17)
}

enum class KeyboardPosition(private val stringId: Int) {
    Center(R.string.center),
    Right(R.string.right),
    Left(R.string.left);

    @Composable
    fun title(): String {
        return stringResource(this.stringId)
    }
}
