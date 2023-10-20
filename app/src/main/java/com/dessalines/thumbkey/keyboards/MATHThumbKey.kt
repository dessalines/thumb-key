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
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_MATH_THUMBKEY_MAIN = KeyboardC(
    listOf(
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("∀"),
                    action = KeyAction.CommitText("∀"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("⊊"),
                        action = KeyAction.CommitText("⊊"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("⊆"),
                        action = KeyAction.CommitText("⊆"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("⊂"),
                        action = KeyAction.CommitText("⊂"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("∫"),
                    action = KeyAction.CommitText("∫"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("+"),
                        action = KeyAction.CommitText("+"),
                    ),
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("±"),
                        action = KeyAction.CommitText("±"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("!"),
                        action = KeyAction.CommitText("!"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("∋"),
                        action = KeyAction.CommitText("∋"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("∈"),
                        action = KeyAction.CommitText("∈"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("∂"),
                        action = KeyAction.CommitText("∂"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("∃"),
                    action = KeyAction.CommitText("∃"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                swipes = mapOf(
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("⊋"),
                        action = KeyAction.CommitText("⊋"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("⊇"),
                        action = KeyAction.CommitText("⊇"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("⊃"),
                        action = KeyAction.CommitText("⊃"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("="),
                        action = KeyAction.CommitText("="),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("∣"),
                        action = KeyAction.CommitText("∣"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("≡"),
                        action = KeyAction.CommitText("≡"),
                    ),
                ),
            ),
            EMOJI_KEY_ITEM,
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("∅"),
                    action = KeyAction.CommitText("∅"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                swipes = mapOf(
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("∩"),
                        action = KeyAction.CommitText("∩"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("∪"),
                        action = KeyAction.CommitText("∪"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("⊍"),
                        action = KeyAction.CommitText("⊍"),
                    ),
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("{"),
                        action = KeyAction.CommitText("{"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("("),
                        action = KeyAction.CommitText("("),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("𝒫"),
                        action = KeyAction.CommitText("𝒫"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("∎"),
                    action = KeyAction.CommitText("∎"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("⇒"),
                        action = KeyAction.CommitText("⇒"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("⇔"),
                        action = KeyAction.CommitText("⇔"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("⇐"),
                        action = KeyAction.CommitText("⇐"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("¬"),
                    action = KeyAction.CommitText("¬"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("∧"),
                        action = KeyAction.CommitText("∧"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("∨"),
                        action = KeyAction.CommitText("∨"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("⩒"),
                        action = KeyAction.CommitText("⩒"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                        action = KeyAction.ToggleShiftMode(true),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("}"),
                        action = KeyAction.CommitText("}"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay(")"),
                        action = KeyAction.CommitText(")"),
                    ),
                ),
            ),
            NUMERIC_KEY_ITEM,
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("→"),
                    action = KeyAction.CommitText("→"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("~"),
                        action = KeyAction.CommitText("~"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("≤"),
                        action = KeyAction.CommitText("≤"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("<"),
                        action = KeyAction.CommitText("<"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("÷"),
                        action = KeyAction.CommitText("÷"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay(":"),
                        action = KeyAction.CommitText(":"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("↦"),
                        action = KeyAction.CommitText("↦"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("∘"),
                        action = KeyAction.CommitText("∘"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("⋅"),
                        action = KeyAction.CommitText("⋅"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("∑"),
                    action = KeyAction.CommitText("∑"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("⨯"),
                        action = KeyAction.CommitText("⨯"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("'"),
                        action = KeyAction.CommitText("'"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay(","),
                        action = KeyAction.CommitText(","),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("-"),
                        action = KeyAction.CommitText("-"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("."),
                        action = KeyAction.CommitText("."),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("*"),
                        action = KeyAction.CommitText("*"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("∏"),
                        action = KeyAction.CommitText("∏"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("∞"),
                        action = KeyAction.CommitText("∞"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ℕ"),
                    action = KeyAction.CommitText("ℕ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                swipes = mapOf(
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("°"),
                        action = KeyAction.CommitText("°"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("≥"),
                        action = KeyAction.CommitText("≥"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay(">"),
                        action = KeyAction.CommitText(">"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ℂ"),
                        action = KeyAction.CommitText("ℂ"),
                    ),
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ℝ"),
                        action = KeyAction.CommitText("ℝ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ℚ"),
                        action = KeyAction.CommitText("ℚ"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ℙ"),
                        action = KeyAction.CommitText("ℙ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ℤ"),
                        action = KeyAction.CommitText("ℤ"),
                    ),
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

val KB_MATH_THUMBKEY_SLASH = KeyboardC(
    listOf(
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay(""),
                    action = KeyAction.CommitText(""),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("⊈"),
                        action = KeyAction.CommitText("⊈"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("⊄"),
                        action = KeyAction.CommitText("⊄"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("∮"),
                    action = KeyAction.CommitText("∮"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("∓"),
                        action = KeyAction.CommitText("∓"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("∌"),
                        action = KeyAction.CommitText("∌"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("∉"),
                        action = KeyAction.CommitText("∉"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("∄"),
                    action = KeyAction.CommitText("∄"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("⊉"),
                        action = KeyAction.CommitText("⊉"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("⊅"),
                        action = KeyAction.CommitText("⊅"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("≠"),
                        action = KeyAction.CommitText("≠"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("∤"),
                        action = KeyAction.CommitText("∤"),
                    ),
                ),
            ),
            EMOJI_KEY_ITEM,
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("∅"),
                    action = KeyAction.CommitText("∅"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                swipes = mapOf(),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("↯"),
                    action = KeyAction.CommitText("↯"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("⇏"),
                        action = KeyAction.CommitText("⇏"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("⇎"),
                        action = KeyAction.CommitText("⇎"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("⇍"),
                        action = KeyAction.CommitText("⇍"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("¬"),
                    action = KeyAction.CommitText("¬"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                        action = KeyAction.ToggleShiftMode(false),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            NUMERIC_KEY_ITEM,
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("↛"),
                    action = KeyAction.CommitText("↛"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("≁"),
                        action = KeyAction.CommitText("≁"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("≰"),
                        action = KeyAction.CommitText("≰"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("≮"),
                        action = KeyAction.CommitText("≮"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay(""),
                    action = KeyAction.CommitText(""),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipes = mapOf(),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay(""),
                    action = KeyAction.CommitText(""),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("≱"),
                        action = KeyAction.CommitText("≱"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("≯"),
                        action = KeyAction.CommitText("≯"),
                    ),
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

val KB_MATH_THUMBKEY: KeyboardDefinition = KeyboardDefinition(
    title = "MATH Thumb-Key",
    modes = KeyboardDefinitionModes(
        main = KB_MATH_THUMBKEY_MAIN,
        shifted = KB_MATH_THUMBKEY_SLASH,
        numeric = NUMERIC_KEYBOARD,
    ),
)
