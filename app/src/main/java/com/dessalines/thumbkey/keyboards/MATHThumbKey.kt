package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_MATH_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("∀", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC("⊊"),
                    left = KeyC("⊆"),
                    bottomLeft = KeyC("⊂"),
                ),
                KeyItemC(
                    center = KeyC("∫", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left = KeyC("+"),
                    topLeft = KeyC("±"),
                    right = KeyC("!"),
                    bottomLeft = KeyC("∋"),
                    bottomRight = KeyC("∈"),
                    bottom = KeyC("∂"),
                ),
                KeyItemC(
                    center = KeyC("∃", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topRight = KeyC("⊋"),
                    right = KeyC("⊇"),
                    bottomRight = KeyC("⊃"),
                    bottom = KeyC("="),
                    bottomLeft = KeyC("∣"),
                    left = KeyC("≡"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("∅", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topRight = KeyC("∩"),
                    right = KeyC("∪"),
                    bottomRight = KeyC("⊍"),
                    topLeft = KeyC("{"),
                    left = KeyC("("),
                    bottom = KeyC("𝒫"),
                ),
                KeyItemC(
                    center = KeyC("∎", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("⇒"),
                    bottom = KeyC("⇔"),
                    bottomLeft = KeyC("⇐"),
                ),
                KeyItemC(
                    center = KeyC("¬", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC("∧"),
                    left = KeyC("∨"),
                    bottomLeft = KeyC("⩒"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topRight = KeyC("}"),
                    right = KeyC(")"),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("→", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC("~"),
                    left = KeyC("≤"),
                    bottomLeft = KeyC("<"),
                    bottom = KeyC("÷"),
                    bottomRight = KeyC(":"),
                    right = KeyC("↦"),
                    top = KeyC("∘"),
                    topRight = KeyC("⋅"),
                ),
                KeyItemC(
                    center = KeyC("∑", size = FontSizeVariant.LARGE),
                    top = KeyC("⨯"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    left = KeyC(","),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    right = KeyC("∏", color = ColorVariant.MUTED),
                    topLeft = KeyC("∞", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("ℕ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topRight = KeyC("°"),
                    right = KeyC("≥"),
                    bottomRight = KeyC(">"),
                    top = KeyC("ℂ"),
                    topLeft = KeyC("ℝ"),
                    left = KeyC("ℚ"),
                    bottomLeft = KeyC("ℙ"),
                    bottom = KeyC("ℤ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_MATH_THUMBKEY_SLASH =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left = KeyC("⊈"),
                    bottomLeft = KeyC("⊄"),
                ),
                KeyItemC(
                    center = KeyC("∮", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC("∓"),
                    bottomLeft = KeyC("∌"),
                    bottomRight = KeyC("∉"),
                ),
                KeyItemC(
                    center = KeyC("∄", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    right = KeyC("⊉"),
                    bottomRight = KeyC("⊅"),
                    bottom = KeyC("≠"),
                    bottomLeft = KeyC("∤"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("∅", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                ),
                KeyItemC(
                    center = KeyC("↯", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("⇏"),
                    bottom = KeyC("⇎"),
                    bottomLeft = KeyC("⇍"),
                ),
                KeyItemC(
                    center = KeyC("¬", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("↛", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC("≁"),
                    left = KeyC("≰"),
                    bottomLeft = KeyC("≮"),
                ),
                KeyItemC(
                    center = KeyC("", size = FontSizeVariant.LARGE),
                ),
                KeyItemC(
                    center = KeyC("", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left = KeyC("≱"),
                    bottomLeft = KeyC("≯"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_MATH_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "math thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_MATH_THUMBKEY_MAIN,
                shifted = KB_MATH_THUMBKEY_SLASH,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
