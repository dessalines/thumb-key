@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_DVORAK_WIDE_PUNCT_KEY =
    KeyItemC(
        center = KeyC("'", size = LARGE),
        swipeType = FOUR_WAY_DIAGONAL,
        topLeft = KeyC("!", color = MUTED),
        topRight = KeyC("?", color = MUTED),
        bottomRight = KeyC(".", color = MUTED),
        bottomLeft = KeyC(",", color = MUTED),
    )

val KB_EN_DVORAK_WIDE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                ),
                KeyItemC(
                    center = KeyC("y", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("p"),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("f"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("g"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    left = KeyC("k"),
                ),
                KB_EN_DVORAK_WIDE_PUNCT_KEY,
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    left = KeyC("v"),
                    right = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("l"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("x"),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("m"),
                    topLeft = KeyC("b"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("w"),
                    bottomRight = KeyC("z"),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM.copy(
                    swipeType = TWO_WAY_VERTICAL,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = SECONDARY,
                        ),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                ),
            ),
        ),
    )

val KB_EN_DVORAK_WIDE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                ),
                KeyItemC(
                    center = KeyC("Y", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("P"),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("F"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("G"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    left = KeyC("K"),
                ),
                KB_EN_DVORAK_WIDE_PUNCT_KEY,
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    left = KeyC("V"),
                    right = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("L"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("X"),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("M"),
                    topLeft = KeyC("B"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("W"),
                    bottomRight = KeyC("Z"),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM.copy(
                    swipeType = TWO_WAY_VERTICAL,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = SECONDARY,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = SECONDARY,
                        ),
                ),
            ),
        ),
    )

val KB_EN_DVORAK_WIDE: KeyboardDefinition =
    KeyboardDefinition(
        title = "english dvorak wide",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_DVORAK_WIDE_MAIN,
                shifted = KB_EN_DVORAK_WIDE_SHIFTED,
                numeric = WIDE_NUMERIC_KEYBOARD,
            ),
    )
