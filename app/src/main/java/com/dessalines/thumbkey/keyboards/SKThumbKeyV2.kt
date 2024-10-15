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
                            KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                        ),
                    // swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC(KeyAction.CommitText("q")),
                    top = KeyC(KeyAction.CommitText("ť")),
                    topRight = KeyC(KeyAction.CommitText("č")),
                    bottomRight = KeyC(KeyAction.CommitText("c")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("v"),
                            size = FontSizeVariant.LARGE,
                        ),
                    // swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top = KeyC(KeyAction.CommitText("w")),
                    bottom = KeyC(KeyAction.CommitText("z")),
                    bottomRight = KeyC(KeyAction.CommitText("ž")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                        ),
                    // swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC(KeyAction.CommitText("ú")),
                    top = KeyC(KeyAction.CommitText("é")),
                    topRight = KeyC(KeyAction.CommitText("x")),
                    bottomLeft = KeyC(KeyAction.CommitText("u")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                        ),
                    // swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    top = KeyC(KeyAction.CommitText("ň")),
                    right = KeyC(KeyAction.CommitText("m")),
                    left =
                        KeyC(
                            KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("b")),
                    top = KeyC(KeyAction.CommitText("ŕ")),
                    topRight = KeyC(KeyAction.CommitText("j")),
                    right = KeyC(KeyAction.CommitText("h")),
                    bottomRight = KeyC(KeyAction.CommitText("y")),
                    bottom = KeyC(KeyAction.CommitText("ý")),
                    bottomLeft = KeyC(KeyAction.CommitText("g")),
                    left = KeyC(KeyAction.CommitText("f")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                        ),
                    // swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    // eng.: you have to turn off this in case to allow 8-way swiping, obvious, but new and tricki to me
                    topRight = KeyC(KeyAction.CommitText("ó")),
                    right =
                        KeyC(
                            KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight = KeyC(KeyAction.CommitText("ô")),
                    left = KeyC(KeyAction.CommitText("k")),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
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
                            KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("š")),
                    topRight = KeyC(KeyAction.CommitText("d")),
                    right =
                        KeyC(
                            KeyAction.CommitText("%"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight = KeyC(KeyAction.CommitText("ď")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("/"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("p")),
                    topRight = KeyC(KeyAction.CommitText("í")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("l")),
                    topRight = KeyC(KeyAction.CommitText("á")),
                    bottomRight = KeyC(KeyAction.CommitText("ä")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft = KeyC(KeyAction.CommitText("ĺ")),
                    left = KeyC(KeyAction.CommitText("ľ")),
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
                            KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                        ),
                    // swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC(KeyAction.CommitText("Q")),
                    top = KeyC(KeyAction.CommitText("Ť")),
                    topRight = KeyC(KeyAction.CommitText("Č")),
                    bottomRight = KeyC(KeyAction.CommitText("C")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("V"),
                            size = FontSizeVariant.LARGE,
                        ),
                    // swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top = KeyC(KeyAction.CommitText("W")),
                    bottom = KeyC(KeyAction.CommitText("Z")),
                    bottomRight = KeyC(KeyAction.CommitText("Ž")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                        ),
                    // swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC(KeyAction.CommitText("Ú")),
                    top = KeyC(KeyAction.CommitText("É")),
                    topRight = KeyC(KeyAction.CommitText("X")),
                    bottomLeft = KeyC(KeyAction.CommitText("U")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                        ),
                    // swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    top = KeyC(KeyAction.CommitText("Ň")),
                    right = KeyC(KeyAction.CommitText("M")),
                    left =
                        KeyC(
                            KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("B")),
                    top = KeyC(KeyAction.CommitText("Ŕ")),
                    topRight = KeyC(KeyAction.CommitText("J")),
                    right = KeyC(KeyAction.CommitText("H")),
                    bottomRight = KeyC(KeyAction.CommitText("Y")),
                    bottom = KeyC(KeyAction.CommitText("Ý")),
                    bottomLeft = KeyC(KeyAction.CommitText("G")),
                    left = KeyC(KeyAction.CommitText("F")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight = KeyC(KeyAction.CommitText("Ó")),
                    right =
                        KeyC(
                            KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight = KeyC(KeyAction.CommitText("Ô")),
                    left = KeyC(KeyAction.CommitText("K")),
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
                            KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("Š")),
                    topRight = KeyC(KeyAction.CommitText("D")),
                    right =
                        KeyC(
                            KeyAction.CommitText("%"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight = KeyC(KeyAction.CommitText("Ď")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("/"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("P")),
                    topRight = KeyC(KeyAction.CommitText("Í")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC(KeyAction.CommitText("L")),
                    topRight = KeyC(KeyAction.CommitText("Á")),
                    bottomRight = KeyC(KeyAction.CommitText("Ä")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft = KeyC(KeyAction.CommitText("Ĺ")),
                    left = KeyC(KeyAction.CommitText("Ľ")),
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
