@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_EN_COLUMNAR_QUICK_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    top = KeyC("q"),
                    bottom = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    top = KeyC("w"),
                    bottom = KeyC("x"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("d"),
                    bottom = KeyC("c"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    top = KeyC("f"),
                    bottom = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    top = KeyC("g"),
                    bottom = KeyC("b"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
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
                    bottom = KeyC("h"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    top = KeyC("j"),
                    bottom = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("k"),
                    bottom = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    top = KeyC("l"),
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

val KB_EN_COLUMNAR_QUICK_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    top = KeyC("Q"),
                    bottom = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    top = KeyC("W"),
                    bottom = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("D"),
                    bottom = KeyC("C"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    top = KeyC("F"),
                    bottom = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    top = KeyC("G"),
                    bottom = KeyC("B"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
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
                    bottom = KeyC("H"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    top = KeyC("J"),
                    bottom = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("K"),
                    bottom = KeyC("."),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    top = KeyC("L"),
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

val KB_EN_COLUMNAR_QUICK: KeyboardDefinition =
    KeyboardDefinition(
        title = "english qwerty-columnar quick",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_COLUMNAR_QUICK_MAIN,
                shifted = KB_EN_COLUMNAR_QUICK_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
