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

val KB_ES_THUMBKEY_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight = KeyC(KeyAction.CommitText("ª")),
                    left = KeyC(KeyAction.CommitText("ñ")),
                    bottomLeft = KeyC(KeyAction.CommitText("$")),
                    bottomRight = KeyC(KeyAction.CommitText("b")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("l"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    topLeft = KeyC(KeyAction.CommitText("`")),
                    top = KeyC(KeyAction.CommitText("^")),
                    topRight = KeyC(KeyAction.CommitText("´")),
                    left = KeyC(KeyAction.CommitText("+")),
                    right = KeyC(KeyAction.CommitText("!")),
                    bottomLeft = KeyC(KeyAction.CommitText("/")),
                    bottom = KeyC(KeyAction.CommitText("v")),
                    bottomRight = KeyC(KeyAction.CommitText("\\")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight = KeyC(KeyAction.CommitText("€")),
                    top = KeyC(KeyAction.CommitText("=")),
                    topLeft = KeyC(KeyAction.CommitText("£")),
                    left = KeyC(KeyAction.CommitText("?")),
                    right = KeyC(KeyAction.CommitText("ó")),
                    bottomLeft = KeyC(KeyAction.CommitText("u")),
                    bottom = KeyC(KeyAction.CommitText("ü")),
                    bottomRight = KeyC(KeyAction.CommitText("ú")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    topLeft = KeyC(KeyAction.CommitText("{")),
                    topRight = KeyC(KeyAction.CommitText("%")),
                    right = KeyC(KeyAction.CommitText("p")),
                    bottomLeft = KeyC(KeyAction.CommitText("[")),
                    bottom = KeyC(KeyAction.CommitText("(")),
                    bottomRight = KeyC(KeyAction.CommitText("_")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("d"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("j")),
                    top = KeyC(KeyAction.CommitText("k")),
                    topRight = KeyC(KeyAction.CommitText("h")),
                    left = KeyC(KeyAction.CommitText("z")),
                    right = KeyC(KeyAction.CommitText("q")),
                    bottomLeft = KeyC(KeyAction.CommitText("f")),
                    bottom = KeyC(KeyAction.CommitText("x")),
                    bottomRight = KeyC(KeyAction.CommitText("y")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    topLeft = KeyC(KeyAction.CommitText("|")),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topRight = KeyC(KeyAction.CommitText("}")),
                    left = KeyC(KeyAction.CommitText("t")),
                    right = KeyC(KeyAction.CommitText("á")),
                    bottomLeft = KeyC(KeyAction.CommitText("@")),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC(KeyAction.CommitText("]")),
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
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC(KeyAction.CommitText("~")),
                    topRight = KeyC(KeyAction.CommitText("m")),
                    bottomLeft = KeyC(KeyAction.CommitText("<")),
                    bottomRight = KeyC(KeyAction.CommitText(":")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("\"")),
                    top = KeyC(KeyAction.CommitText("g")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC(KeyAction.CommitText("w")),
                    right = KeyC(KeyAction.CommitText("í")),
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
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("c")),
                    top = KeyC(KeyAction.CommitText("&")),
                    topRight = KeyC(KeyAction.CommitText("°")),
                    left = KeyC(KeyAction.CommitText("#")),
                    right = KeyC(KeyAction.CommitText("é")),
                    bottomLeft = KeyC(KeyAction.CommitText(";")),
                    bottom = KeyC(KeyAction.CommitText(",")),
                    bottomRight = KeyC(KeyAction.CommitText(">")),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ES_THUMBKEY_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left = KeyC(KeyAction.CommitText("Ñ")),
                    bottomRight = KeyC(KeyAction.CommitText("B")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("L"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("¡"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom = KeyC(KeyAction.CommitText("V")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("¿"),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC(KeyAction.CommitText("Ó")),
                    bottomLeft = KeyC(KeyAction.CommitText("U")),
                    bottom = KeyC(KeyAction.CommitText("Ü")),
                    bottomRight = KeyC(KeyAction.CommitText("Ú")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC(KeyAction.CommitText("P")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("D"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("J")),
                    top = KeyC(KeyAction.CommitText("K")),
                    topRight = KeyC(KeyAction.CommitText("H")),
                    left = KeyC(KeyAction.CommitText("Z")),
                    right = KeyC(KeyAction.CommitText("Q")),
                    bottomLeft = KeyC(KeyAction.CommitText("F")),
                    bottom = KeyC(KeyAction.CommitText("X")),
                    bottomRight = KeyC(KeyAction.CommitText("Y")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC(KeyAction.CommitText("T")),
                    right = KeyC(KeyAction.CommitText("Á")),
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
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight = KeyC(KeyAction.CommitText("M")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("G")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC(KeyAction.CommitText("W")),
                    right = KeyC(KeyAction.CommitText("Í")),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("C")),
                    right = KeyC(KeyAction.CommitText("É")),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ES_THUMBKEY_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "español thumb-key symbols",
        modes =
            KeyboardDefinitionModes(
                main = KB_ES_THUMBKEY_SYMBOLS_MAIN,
                shifted = KB_ES_THUMBKEY_SYMBOLS_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
