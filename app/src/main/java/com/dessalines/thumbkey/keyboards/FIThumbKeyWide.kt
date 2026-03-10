@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_FI_THUMBKEY_WIDE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("r"),
                    topLeft = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("k", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("ö"),
                    topRight = KeyC("å"),
                ),
                SPACEBAR_ALL_SYMBOLS,
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    topLeft = KeyC("p"),
                    top = KeyC("q"),
                    topRight = KeyC("b"),
                    right = KeyC("f"),
                    bottomRight = KeyC("g"),
                    bottom = KeyC("x"),
                    bottomLeft = KeyC("d"),
                    left = KeyC("h"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ä"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                ),
                SPACEBAR_ALL_DIRECTIONS,
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("v"),
                    bottomLeft = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("y"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("c"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("u"),
                ),
                RETURN_KEY_ITEM,
                BACKSPACE_KEY_ITEM,
            ),
        ),
    )

val KB_FI_THUMBKEY_WIDE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("R"),
                    topLeft = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("K", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("Ö"),
                    topRight = KeyC("Å"),
                ),
                SPACEBAR_ALL_SYMBOLS,
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    topLeft = KeyC("P"),
                    top = KeyC("Q"),
                    topRight = KeyC("B"),
                    right = KeyC("F"),
                    bottomRight = KeyC("G"),
                    bottom = KeyC("X"),
                    bottomLeft = KeyC("D"),
                    left = KeyC("H"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("Ä"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                ),
                SPACEBAR_ALL_DIRECTIONS,
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("V"),
                    bottomLeft = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("Y"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("C"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("U"),
                ),
                RETURN_KEY_ITEM,
                BACKSPACE_KEY_ITEM,
            ),
        ),
    )

val KB_FI_THUMBKEY_WIDE: KeyboardDefinition =
    KeyboardDefinition(
        title = "suomi thumb-key wide",
        modes =
            KeyboardDefinitionModes(
                main = KB_FI_THUMBKEY_WIDE_MAIN,
                shifted = KB_FI_THUMBKEY_WIDE_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
