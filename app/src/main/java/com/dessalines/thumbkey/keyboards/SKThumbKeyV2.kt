package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardCapslock
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

val KB_SK_THUMBKEY_V2_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    // swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("q"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ť"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("č"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("c"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("v"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    // swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top =
                        KeyC(
                            action = KeyAction.CommitText("w"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("z"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ž"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    // swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ú"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("é"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("x"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("u"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    // swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ň"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("m"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("b"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ŕ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("j"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("h"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("y"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ý"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("g"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("f"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    // swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    // eng.: you have to turn off this in case to allow 8-way swiping, obvious, but new and tricki to me
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ó"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ô"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("k"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
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
                            action = KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("š"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("d"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("%"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ď"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("/"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("p"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("í"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("l"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("á"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ä"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ĺ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ľ"),
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

val KB_SK_THUMBKEY_V2_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    // swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Q"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ť"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Č"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("C"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("V"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    // swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top =
                        KeyC(
                            action = KeyAction.CommitText("W"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Z"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ž"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    // swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ú"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("É"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("X"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("U"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    // swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ň"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("M"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("B"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ŕ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("J"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("H"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Y"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ý"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("G"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("F"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Ó"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ô"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("K"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
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
                            action = KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Š"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("D"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("%"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ď"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("/"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("P"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Í"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("L"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Á"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ä"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ĺ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ľ"),
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

val KB_SK_THUMBKEY_V2: KeyboardDefinition =
    KeyboardDefinition(
        title = "slovenčina thumb-key v2",
        modes =
            KeyboardDefinitionModes(
                main = KB_SK_THUMBKEY_V2_MAIN,
                shifted = KB_SK_THUMBKEY_V2_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
