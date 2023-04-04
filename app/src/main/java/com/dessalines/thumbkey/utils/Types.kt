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
    LARGE, SMALL
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

enum class KeyboardLayout(val title: String) {
    ThumbKeyENv4("Thumb-Key English v4"),
    ThumbKeyDEv2("Thumb-Key Deutsch v2"),
    ThumbKeyEUv1("Thumb-Key euskara v1"),
    ThumbKeyFAv1("Thumb-Key فارسیv1"),
    ThumbKeyFIv1("Thumb-Key suomi v1"),
    ThumbKeyFRv1("Thumb-Key Français v1"),
    ThumbKeyITv1("Thumb-Key italiano v1"),
    ThumbKeyPTv1("Thumb-Key português v1"),
    ThumbkeyRUv1("Thumb-Key русский v1"),
    ThumbkeyUKv1("Thumb-Key українська v1"),
    MessageEaseEN("MessageEase English"),
    MessageEaseHE("MessageEase עברית")
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
