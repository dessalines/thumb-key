@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val DotKeyItemC =
    KeyItemC(
        center = KeyC(".", size = LARGE),
        left = KeyC(",", color = MUTED),
        topLeft = KeyC("'", color = MUTED),
        bottomRight = KeyC("-", color = MUTED),
        bottom =
            RETURN_KEYC.copy(
                size = SMALL,
                color = MUTED,
            ),
        bottomLeft = KeyC("*", color = MUTED),
        backgroundColor = SURFACE_VARIANT,
    )

val KB_EN_WHALE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("f", size = LARGE),
                    bottom = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("w", size = LARGE),
                    bottom = KeyC("x"),
                ),
                KeyItemC(
                    center = KeyC("v", size = LARGE),
                    bottom = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("p", size = LARGE),
                    bottom = KeyC("z"),
                ),
                EMOJI_KEY_ITEM.copy(
                    center = KeyC("b", size = LARGE),
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
                    center = KeyC("m", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("k", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("g", size = LARGE),
                ),
                NUMERIC_KEY_ITEM.copy(
                    center = KeyC("y", size = LARGE),
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
                    center = KeyC("c", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
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
                DotKeyItemC,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
            ),
        ),
    )

val KB_EN_WHALE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("F", size = LARGE),
                    bottom = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("W", size = LARGE),
                    bottom = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("V", size = LARGE),
                    bottom = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("P", size = LARGE),
                    bottom = KeyC("Z"),
                ),
                EMOJI_KEY_ITEM.copy(
                    center = KeyC("B", size = LARGE),
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
                    center = KeyC("M", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("K", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("G", size = LARGE),
                ),
                NUMERIC_KEY_ITEM.copy(
                    center = KeyC("Y", size = LARGE),
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
                    center = KeyC("C", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
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
                DotKeyItemC,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
            ),
        ),
    )

val KB_EN_WHALE: KeyboardDefinition =
    KeyboardDefinition(
        title = "english whale",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_WHALE_MAIN,
                shifted = KB_EN_WHALE_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
