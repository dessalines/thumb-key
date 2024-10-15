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
                            action = KeyAction.CommitText("∀"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("⊊"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("⊆"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("⊂"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("∫"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left =
                        KeyC(
                            action = KeyAction.CommitText("+"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("±"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("∋"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("∈"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("∂"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("∃"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("⊋"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("⊇"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("⊃"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("="),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("∣"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("≡"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("∅"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("∩"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("∪"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("⊍"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("{"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("("),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("𝒫"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("∎"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("⇒"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("⇔"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("⇐"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("¬"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("∧"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("∨"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("⩒"),
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
                            action = KeyAction.CommitText("}"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("→"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("~"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("≤"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("<"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("÷"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("↦"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("∘"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("⋅"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("∑"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("⨯"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText(","),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("∏"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("∞"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ℕ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("°"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("≥"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(">"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ℂ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ℝ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ℚ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ℙ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ℤ"),
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
                            action = KeyAction.CommitText(""),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left =
                        KeyC(
                            action = KeyAction.CommitText("⊈"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("⊄"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("∮"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("∓"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("∌"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("∉"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("∄"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("⊉"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("⊅"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("≠"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("∤"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("∅"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("↯"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("⇏"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("⇎"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("⇍"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("¬"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
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
                            action = KeyAction.CommitText("↛"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("≁"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("≰"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("≮"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText(""),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText(""),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left =
                        KeyC(
                            action = KeyAction.CommitText("≱"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("≯"),
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
