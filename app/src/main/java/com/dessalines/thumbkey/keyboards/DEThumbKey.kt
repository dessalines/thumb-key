@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_DE_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    bottomRight = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    right = KeyC("!", color = MUTED),
                    bottom = KeyC("f"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    left = KeyC("?", color = MUTED),
                    bottomLeft = KeyC("l"),
                    right = KeyC("ä"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    right = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    topLeft = KeyC("j"),
                    top = KeyC("q"),
                    topRight = KeyC("z"),
                    right = KeyC("k"),
                    bottomRight = KeyC("w"),
                    bottom = KeyC("x"),
                    bottomLeft = KeyC("v"),
                    left = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    left = KeyC("o"),
                    right = KeyC("ö"),
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
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    topRight = KeyC("g"),
                    bottomRight = KeyC(":", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("\"", color = MUTED),
                    top = KeyC("b"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("y"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("ß"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("u"),
                    topRight = KeyC("ü"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DE_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    bottomRight = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    right = KeyC("!", color = MUTED),
                    bottom = KeyC("F"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    left = KeyC("?", color = MUTED),
                    bottomLeft = KeyC("L"),
                    right = KeyC("Ä"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    right = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    topLeft = KeyC("J"),
                    top = KeyC("Q"),
                    topRight = KeyC("Z"),
                    right = KeyC("K"),
                    bottomRight = KeyC("W"),
                    bottom = KeyC("X"),
                    bottomLeft = KeyC("V"),
                    left = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    left = KeyC("O"),
                    right = KeyC("Ö"),
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
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    bottomRight = KeyC(":", color = MUTED),
                    topRight = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("\"", color = MUTED),
                    top = KeyC("B"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Y"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("ẞ"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("U"),
                    topRight = KeyC("Ü"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DE_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_THUMBKEY_MAIN,
                shifted = KB_DE_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
