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
                    center =
                        KeyC(
                            KeyAction.CommitText("∀"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("⊊"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("⊆"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("⊂"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("∫"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left =
                        KeyC(
                            KeyAction.CommitText("+"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("±"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("!"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("∋"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("∈"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("∂"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("∃"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topRight =
                        KeyC(
                            KeyAction.CommitText("⊋"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("⊇"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("⊃"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("="),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("∣"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("≡"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("∅"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topRight =
                        KeyC(
                            KeyAction.CommitText("∩"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("∪"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("⊍"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("{"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("("),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("𝒫"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("∎"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("⇒"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("⇔"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("⇐"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("¬"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("∧"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("∨"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("⩒"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("}"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText(")"),
                        ),
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
                    center =
                        KeyC(
                            KeyAction.CommitText("→"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("~"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("≤"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("<"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("÷"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(":"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("↦"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("∘"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("⋅"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("∑"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("⨯"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText(","),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("∏"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("∞"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ℕ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topRight =
                        KeyC(
                            KeyAction.CommitText("°"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("≥"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(">"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ℂ"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ℝ"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("ℚ"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ℙ"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ℤ"),
                        ),
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
                    center =
                        KeyC(
                            KeyAction.CommitText(""),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left =
                        KeyC(
                            KeyAction.CommitText("⊈"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("⊄"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("∮"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("∓"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("∌"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("∉"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("∄"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    right =
                        KeyC(
                            KeyAction.CommitText("⊉"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("⊅"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("≠"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("∤"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("∅"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("↯"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("⇏"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("⇎"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("⇍"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("¬"),
                            size = FontSizeVariant.LARGE,
                        ),
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
                    center =
                        KeyC(
                            KeyAction.CommitText("↛"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("≁"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("≰"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("≮"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText(""),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText(""),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left =
                        KeyC(
                            KeyAction.CommitText("≱"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("≯"),
                        ),
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
