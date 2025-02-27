@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_BR_FR_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    topLeft = KeyC("«", color = MUTED),
                    top = KeyC("»", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("^", color = MUTED),
                    bottomRight = KeyC("q"),
                    bottom = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("·", color = MUTED),
                    left = KeyC("\"", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    top = KeyC("ü", color = MUTED),
                    right = KeyC("û", color = MUTED),
                    bottomRight = KeyC("ù", color = MUTED),
                    bottom = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    topLeft = KeyC("ꝃ", color = MUTED),
                    top = KeyC("ï", color = MUTED),
                    right = KeyC("î", color = MUTED),
                    bottomRight = KeyC("k"),
                    bottomLeft = KeyC("y"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    right = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    topLeft = KeyC("w"),
                    top = KeyC("j"),
                    topRight = KeyC("g"),
                    right = KeyC("b"),
                    bottomRight = KeyC("f"),
                    bottom = KeyC("h"),
                    bottomLeft = KeyC("x"),
                    left = KeyC("ñ"),
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
                    topRight = KeyC("@", color = MUTED),
                    right = KeyC("â", color = MUTED),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("à", color = MUTED),
                    bottomLeft = KeyC("æ", color = MUTED),
                    left = KeyC("d"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("m"),
                    bottomRight = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("ç", color = MUTED),
                    top = KeyC("c"),
                    topRight = KeyC("c'h"),
                    right = KeyC("ch"),
                    bottomRight = KeyC("*", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("o"),
                    top = KeyC("ë", color = MUTED),
                    topRight = KeyC("é", color = MUTED),
                    right = KeyC("ê", color = MUTED),
                    bottomRight = KeyC("è", color = MUTED),
                    bottomLeft = KeyC("œ", color = MUTED),
                    left = KeyC("ô", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_BR_FR_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    topLeft = KeyC("«", color = MUTED),
                    top = KeyC("»", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("^", color = MUTED),
                    bottomRight = KeyC("Q"),
                    bottom = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("·", color = MUTED),
                    left = KeyC("\"", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    top = KeyC("Ü", color = MUTED),
                    right = KeyC("Û", color = MUTED),
                    bottomRight = KeyC("Ù", color = MUTED),
                    bottom = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    topLeft = KeyC("Ꝃ", color = MUTED),
                    top = KeyC("Ï", color = MUTED),
                    right = KeyC("Î", color = MUTED),
                    bottomRight = KeyC("K"),
                    bottomLeft = KeyC("Y"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    right = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    topLeft = KeyC("W"),
                    top = KeyC("J"),
                    topRight = KeyC("G"),
                    right = KeyC("B"),
                    bottomRight = KeyC("F"),
                    bottom = KeyC("H"),
                    bottomLeft = KeyC("X"),
                    left = KeyC("Ñ"),
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
                    topRight = KeyC("@", color = MUTED),
                    right = KeyC("Â", color = MUTED),
                    bottomRight = KeyC("À", color = MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    bottomLeft = KeyC("Æ", color = MUTED),
                    left = KeyC("D"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("M"),
                    bottomRight = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("Ç", color = MUTED),
                    top = KeyC("C"),
                    topRight = KeyC("C'H"),
                    right = KeyC("CH"),
                    bottomRight = KeyC("*", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("O"),
                    top = KeyC("Ë", color = MUTED),
                    topRight = KeyC("É", color = MUTED),
                    right = KeyC("Ê", color = MUTED),
                    bottomRight = KeyC("È", color = MUTED),
                    bottomLeft = KeyC("Œ", color = MUTED),
                    left = KeyC("Ô", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_BR_FR_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "brezhoneg français thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_BR_FR_THUMBKEY_MAIN,
                shifted = KB_BR_FR_THUMBKEY_SHIFTED,
                numeric = FRENCH_NUMERIC_KEYBOARD,
            ),
    )
