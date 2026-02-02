@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_QWERTEASE_TWO_HANDS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    bottomRight = KeyC("t"),
                    right = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    bottom = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    bottomLeft = KeyC("y"),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    bottomRight = KeyC("t"),
                    right = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    bottom = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    bottomLeft = KeyC("y"),
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
                    left = KeyC("l"),
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
                    left = KeyC("l"),
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
                    center = KeyC("s", size = LARGE),
                    topRight = KeyC("x"),
                    right = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    top = KeyC("v"),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    topLeft = KeyC("f"),
                    bottomRight = KeyC("?", color = MUTED),
                    bottom = KeyC("!", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topRight = KeyC("x"),
                    right = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    top = KeyC("v"),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    topLeft = KeyC("f"),
                    bottomRight = KeyC("?", color = MUTED),
                    bottom = KeyC("!", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
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

val KB_EN_QWERTEASE_TWO_HANDS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    bottomRight = KeyC("T"),
                    right = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    bottom = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    bottomLeft = KeyC("Y"),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    bottomRight = KeyC("T"),
                    right = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    bottom = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    bottomLeft = KeyC("Y"),
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
                    left = KeyC("L"),
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
                    left = KeyC("L"),
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
                    center = KeyC("S", size = LARGE),
                    topRight = KeyC("X"),
                    right = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    top = KeyC("V"),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    topLeft = KeyC("F"),
                    bottomRight = KeyC("?", color = MUTED),
                    bottom = KeyC("!", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topRight = KeyC("X"),
                    right = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    top = KeyC("V"),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    topLeft = KeyC("F"),
                    bottomRight = KeyC("?", color = MUTED),
                    bottom = KeyC("!", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
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

val KB_EN_QWERTEASE_TWO_HANDS: KeyboardDefinition =
    KeyboardDefinition(
        title = "english qwertease two-hands",
        locales = listOf("en"),
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_QWERTEASE_TWO_HANDS_MAIN,
                shifted = KB_EN_QWERTEASE_TWO_HANDS_SHIFTED,
                numeric = KB_EN_MESSAGEASE_TWO_HANDS_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
