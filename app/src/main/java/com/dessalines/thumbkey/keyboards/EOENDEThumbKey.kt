@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_EO_EN_DE_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("ŝ"),
                    topRight = KeyC("ß"),
                    bottomLeft = KeyC("x"),
                    bottomRight = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    top = KeyC("y"),
                    bottom = KeyC("d"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topLeft = KeyC("ö"),
                    topRight = KeyC("ü"),
                    bottomLeft = KeyC("u"),
                    bottomRight = KeyC("ŭ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    left = KeyC("ĵ"),
                    right = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    topLeft = KeyC("f"),
                    top = KeyC("b"),
                    topRight = KeyC("c"),
                    right = KeyC("w"),
                    bottomRight = KeyC("v"),
                    bottom = KeyC("z"),
                    bottomLeft = KeyC("ĉ"),
                    left = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    left = KeyC("m"),
                    right = KeyC("ä"),
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
                    center = KeyC("r", size = LARGE),
                    topRight = KeyC("g"),
                    bottomLeft = KeyC("ĝ"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("p"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC(",", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("h"),
                    bottomRight = KeyC("ĥ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EO_EN_DE_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("Ŝ"),
                    topRight = KeyC("ẞ"),
                    bottomRight = KeyC("K"),
                    bottomLeft = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    top = KeyC("Y"),
                    bottom = KeyC("D"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topLeft = KeyC("Ö"),
                    topRight = KeyC("Ü"),
                    bottomLeft = KeyC("U"),
                    bottomRight = KeyC("Ŭ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    left = KeyC("Ĵ"),
                    right = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    topLeft = KeyC("F"),
                    top = KeyC("B"),
                    topRight = KeyC("C"),
                    right = KeyC("W"),
                    bottomRight = KeyC("V"),
                    bottom = KeyC("Z"),
                    bottomLeft = KeyC("Ĉ"),
                    left = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    left = KeyC("M"),
                    right = KeyC("Ä"),
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
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    topRight = KeyC("G"),
                    bottomLeft = KeyC("Ĝ"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("P"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC(",", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("H"),
                    bottomRight = KeyC("Ĥ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EO_EN_DE_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "esperanto english deutsch thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_EO_EN_DE_THUMBKEY_MAIN,
                shifted = KB_EO_EN_DE_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
