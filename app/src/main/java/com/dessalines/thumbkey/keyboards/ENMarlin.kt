@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_EN_MARLIN_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                ),
                EMOJI_KEY_ITEM.copy(
                    center = KeyC("m", size = LARGE),
                    right =
                        TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    left = KeyC(".", color = MUTED),
                    right = KeyC(",", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom =
                        RETURN_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                NUMERIC_KEY_ITEM.copy(
                    center = KeyC("n", size = LARGE),
                    right =
                        TOGGLE_NUMERIC_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    top = KeyC("z"),
                    bottom = KeyC("k"),
                    left = KeyC("x"),
                    right = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    top = KeyC("f"),
                    bottom = KeyC("w"),
                    left = KeyC("p"),
                    right = KeyC("g"),
                    topRight = KeyC("b"),
                    bottomRight = KeyC("v"),
                    topLeft = KeyC("y"),
                    bottomLeft = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
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
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
            ),
        ),
    )

val KB_EN_MARLIN_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                ),
                EMOJI_KEY_ITEM.copy(
                    center = KeyC("M", size = LARGE),
                    right =
                        TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    left = KeyC(".", color = MUTED),
                    right = KeyC(",", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom =
                        RETURN_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                NUMERIC_KEY_ITEM.copy(
                    center = KeyC("N", size = LARGE),
                    right =
                        TOGGLE_NUMERIC_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    top = KeyC("Z"),
                    bottom = KeyC("K"),
                    left = KeyC("X"),
                    right = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    top = KeyC("F"),
                    bottom = KeyC("W"),
                    left = KeyC("P"),
                    right = KeyC("G"),
                    topRight = KeyC("B"),
                    bottomRight = KeyC("V"),
                    topLeft = KeyC("Y"),
                    bottomLeft = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
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
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
            ),
        ),
    )

val KB_EN_MARLIN: KeyboardDefinition =
    KeyboardDefinition(
        title = "english marlin",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_MARLIN_MAIN,
                shifted = KB_EN_MARLIN_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
