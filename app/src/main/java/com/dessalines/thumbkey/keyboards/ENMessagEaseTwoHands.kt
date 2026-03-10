@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_MESSAGEASE_TWO_HANDS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("l"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("x"),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("l"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("x"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topLeft = KeyC("q"),
                    top = KeyC("u"),
                    topRight = KeyC("p"),
                    right = KeyC("b"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("d"),
                    bottomLeft = KeyC("g"),
                    left = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("m"),
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
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topLeft = KeyC("q"),
                    top = KeyC("u"),
                    topRight = KeyC("p"),
                    right = KeyC("b"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("d"),
                    bottomLeft = KeyC("g"),
                    left = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("m"),
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
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("y"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("w"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("f"),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("y"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("w"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("f"),
                ),
            ),
            listOf(
                RETURN_KEY_ITEM,
                BACKSPACE_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                BACKSPACE_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_MESSAGEASE_TWO_HANDS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("L"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("X"),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("L"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("X"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topLeft = KeyC("Q"),
                    top = KeyC("U"),
                    topRight = KeyC("P"),
                    right = KeyC("B"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("D"),
                    bottomLeft = KeyC("G"),
                    left = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("M"),
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
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topLeft = KeyC("Q"),
                    top = KeyC("U"),
                    topRight = KeyC("P"),
                    right = KeyC("B"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("D"),
                    bottomLeft = KeyC("G"),
                    left = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("M"),
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
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("Y"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("W"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("F"),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("Y"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("W"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("F"),
                ),
            ),
            listOf(
                RETURN_KEY_ITEM,
                BACKSPACE_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                BACKSPACE_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_MESSAGEASE_TWO_HANDS: KeyboardDefinition =
    KeyboardDefinition(
        title = "english messagease two-hands",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_MESSAGEASE_TWO_HANDS_MAIN,
                shifted = KB_EN_MESSAGEASE_TWO_HANDS_SHIFTED,
                numeric = KB_EN_MESSAGEASE_TWO_HANDS_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
