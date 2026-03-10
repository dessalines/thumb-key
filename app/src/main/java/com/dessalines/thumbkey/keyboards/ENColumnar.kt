@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_COLUMNAR_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("q"),
                    bottom = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("w"),
                    bottom = KeyC("x"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("e"),
                    bottom = KeyC("c"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("f", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("r"),
                    bottom = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("g", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("t"),
                    bottom = KeyC("b"),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction =
                                ToggleCurrentWordCapitalization(
                                    false,
                                ),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction =
                                ToggleCurrentWordCapitalization(
                                    true,
                                ),
                            color = MUTED,
                        ),
                    top = KeyC("y"),
                    bottom = KeyC("n"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("j", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("u"),
                    bottom = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("k", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("i"),
                    bottom = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("o"),
                    bottom = KeyC("p"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_COLUMNAR_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("Q"),
                    bottom = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("W"),
                    bottom = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("E"),
                    bottom = KeyC("C"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("F", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("R"),
                    bottom = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("G", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("T"),
                    bottom = KeyC("B"),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction =
                                ToggleCurrentWordCapitalization(
                                    false,
                                ),
                            color = MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction =
                                ToggleCurrentWordCapitalization(
                                    true,
                                ),
                            color = MUTED,
                        ),
                    top = KeyC("Y"),
                    bottom = KeyC("N"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("J", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("U"),
                    bottom = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("K", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("I"),
                    bottom = KeyC("."),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("O"),
                    bottom = KeyC("P"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_COLUMNAR: KeyboardDefinition =
    KeyboardDefinition(
        title = "english qwerty-columnar",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_COLUMNAR_MAIN,
                shifted = KB_EN_COLUMNAR_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
