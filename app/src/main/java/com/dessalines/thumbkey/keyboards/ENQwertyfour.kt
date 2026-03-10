@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_QWERTYFOUR_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\"", color = MUTED),
                    right = KeyC("w"),
                    bottom = KeyC("q"),
                    left = KeyC(":", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("'", color = MUTED),
                    right = KeyC("u"),
                    bottom = KeyC("y"),
                    left = KeyC("r"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC(".", color = MUTED),
                    right = KeyC(",", color = MUTED),
                    bottom = KeyC("p"),
                    left = KeyC("i"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("d"),
                    right = KeyC("s"),
                    bottom = KeyC("f"),
                    left = KeyC(";", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("j"),
                    bottom = KeyC("v"),
                    left = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    right = KeyC("/", color = MUTED),
                    left = KeyC("k"),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("z"),
                    right = KeyC("x"),
                    bottom = KeyC("@", color = MUTED),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("m"),
                    right = KeyC("?", color = MUTED),
                    bottom = KeyC("!", color = MUTED),
                    left = KeyC("b"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_QWERTYFOUR_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\"", color = MUTED),
                    right = KeyC("W"),
                    bottom = KeyC("Q"),
                    left = KeyC(":", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("'", color = MUTED),
                    right = KeyC("U"),
                    bottom = KeyC("Y"),
                    left = KeyC("R"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC(".", color = MUTED),
                    right = KeyC(",", color = MUTED),
                    bottom = KeyC("P"),
                    left = KeyC("I"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("D"),
                    right = KeyC("S"),
                    bottom = KeyC("F"),
                    left = KeyC(";", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("J"),
                    bottom = KeyC("V"),
                    left = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    right = KeyC("/", color = MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    left = KeyC("K"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Z"),
                    right = KeyC("X"),
                    bottom = KeyC("@", color = MUTED),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("M"),
                    right = KeyC("?", color = MUTED),
                    bottom = KeyC("!", color = MUTED),
                    left = KeyC("B"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_QWERTYFOUR: KeyboardDefinition =
    KeyboardDefinition(
        title = "english qwertyfour",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_QWERTYFOUR_MAIN,
                shifted = KB_EN_QWERTYFOUR_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
