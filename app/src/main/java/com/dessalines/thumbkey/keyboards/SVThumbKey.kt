@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_SV_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottomRight = KeyC("h"),
                    top = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    bottom = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    bottomLeft = KeyC("u"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("m"),
                    top = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    topLeft = KeyC("j"),
                    top = KeyC("ö"),
                    topRight = KeyC("b"),
                    right = KeyC("p"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("å"),
                    bottomLeft = KeyC("ä"),
                    left = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    left = KeyC("o"),
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
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("k"),
                    top = KeyC("x"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("f"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("v"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_SV_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottomRight = KeyC("H"),
                    top = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    bottom = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    bottomLeft = KeyC("U"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("M"),
                    top = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    topLeft = KeyC("J"),
                    top = KeyC("Ö"),
                    topRight = KeyC("B"),
                    right = KeyC("P"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("Å"),
                    bottomLeft = KeyC("Ä"),
                    left = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    left = KeyC("O"),
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
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("K"),
                    top = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("F"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("V"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_SV_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "svenska thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_SV_THUMBKEY_MAIN,
                shifted = KB_SV_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
