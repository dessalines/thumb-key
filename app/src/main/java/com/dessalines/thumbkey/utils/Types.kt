package com.dessalines.thumbkey.utils

import android.view.KeyEvent
import androidx.compose.ui.graphics.vector.ImageVector

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

enum class ThemeMode {
    System,
    Light,
    Dark
}

enum class ThemeColor {
    Dynamic,
    Green,
    Pink
}

enum class KeyboardLayout(val title: String) {
    ThumbKeyENv4("Thumb-Key English v4"),
    ThumbKeyFIv4("Thumb-Key suomi v1"),
    ThumbkeyRUv1("Thumb-Key русский v1"),
    ThumbkeyUKv1("Thumb-Key українська v1"),
    MessageEase("MessageEase")
}

enum class KeyboardPosition {
    Center,
    Right,
    Left
}
