@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_EN_THUMBKEY_WIDE_PUNCT_KEY =
    KeyItemC(
        center = KeyC("'", size = LARGE),
        topLeft = KeyC("!", color = MUTED),
        topRight = KeyC("?", color = MUTED),
        bottomRight = KeyC(".", color = MUTED),
        bottomLeft = KeyC(",", color = MUTED),
    )

val KB_EN_THUMBKEY_WIDE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottomRight = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    bottomLeft = KeyC("b"),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    bottomRight = KeyC("x"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    bottomLeft = KeyC("y"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    left = KeyC("p"),
                    right = KeyC("q"),
                ),
                KB_EN_THUMBKEY_WIDE_PUNCT_KEY,
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    left = KeyC("z"),
                    right = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    left = KeyC("g"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    topLeft = KeyC("f"),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    topRight = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("k"),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM.copy(
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

val KB_EN_THUMBKEY_WIDE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottomRight = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    bottomLeft = KeyC("B"),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    bottomRight = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    bottomLeft = KeyC("Y"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    left = KeyC("P"),
                    right = KeyC("Q"),
                ),
                KB_EN_THUMBKEY_WIDE_PUNCT_KEY,
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    left = KeyC("Z"),
                    right = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    left = KeyC("G"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    topLeft = KeyC("F"),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    topRight = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("K"),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM.copy(
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

val KB_EN_THUMBKEY_WIDE: KeyboardDefinition =
    KeyboardDefinition(
        title = "english thumb-key wide",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_WIDE_MAIN,
                shifted = KB_EN_THUMBKEY_WIDE_SHIFTED,
                numeric = WIDE_NUMERIC_KEYBOARD,
            ),
    )
