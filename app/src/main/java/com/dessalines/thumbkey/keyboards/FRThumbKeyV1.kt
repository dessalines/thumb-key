@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_FR_THUMBKEY_V1_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    bottomRight = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    topRight = KeyC("ü"),
                    right = KeyC("û"),
                    bottomRight = KeyC("ù"),
                    bottom = KeyC("f"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    topRight = KeyC("ï"),
                    right = KeyC("î"),
                    bottomLeft = KeyC("c"),
                    left = KeyC("ç"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    topLeft = KeyC("z"),
                    top = KeyC("w"),
                    topRight = KeyC("x"),
                    right = KeyC("g"),
                    bottomRight = KeyC("b"),
                    bottom = KeyC("y"),
                    bottomLeft = KeyC("h"),
                    left = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    right = KeyC("â"),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("à"),
                    left = KeyC("d"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topRight = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    top = KeyC("q"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("k"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("o"),
                    topRight = KeyC("ë"),
                    right = KeyC("ê"),
                    bottomRight = KeyC("è"),
                    bottom = KeyC("é"),
                    bottomLeft = KeyC("œ"),
                    left = KeyC("ô"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_THUMBKEY_V1_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    bottomRight = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    topRight = KeyC("Ü"),
                    right = KeyC("Û"),
                    bottomRight = KeyC("Ù"),
                    bottom = KeyC("F"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    topRight = KeyC("Ï"),
                    right = KeyC("Î"),
                    bottomLeft = KeyC("C"),
                    left = KeyC("Ç"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    topLeft = KeyC("Z"),
                    top = KeyC("W"),
                    topRight = KeyC("X"),
                    right = KeyC("G"),
                    bottomRight = KeyC("B"),
                    bottom = KeyC("Y"),
                    bottomLeft = KeyC("H"),
                    left = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    right = KeyC("Â"),
                    bottomRight = KeyC("À"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    left = KeyC("D"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topRight = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    top = KeyC("Q"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("K"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("O"),
                    topRight = KeyC("Ë"),
                    right = KeyC("Ê"),
                    bottomRight = KeyC("È"),
                    bottom = KeyC("É"),
                    bottomLeft = KeyC("Œ"),
                    left = KeyC("Ô"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_THUMBKEY_V1: KeyboardDefinition =
    KeyboardDefinition(
        title = "français thumb-key v1",
        modes =
            KeyboardDefinitionModes(
                main = KB_FR_THUMBKEY_V1_MAIN,
                shifted = KB_FR_THUMBKEY_V1_SHIFTED,
                numeric = FRENCH_NUMERIC_KEYBOARD,
            ),
    )
