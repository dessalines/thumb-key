@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_ES_CA_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    bottomRight = KeyC("b"),
                    left = KeyC("ñ"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    bottom = KeyC("v"),
                    right = KeyC("l·l"),
                    topRight = KeyC("!"),
                    topLeft = KeyC("¡"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    bottomLeft = KeyC("u"),
                    right = KeyC("ó"),
                    bottomRight = KeyC("ú"),
                    bottom = KeyC("ü"),
                    left = KeyC("ò"),
                    topLeft = KeyC("¿"),
                    topRight = KeyC("?"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    right = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    topLeft = KeyC("j"),
                    top = KeyC("k"),
                    topRight = KeyC("h"),
                    right = KeyC("q"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("x"),
                    bottomLeft = KeyC("f"),
                    left = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    left = KeyC("à"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    right = KeyC("á"),
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
                    center = KeyC("s", size = LARGE),
                    topRight = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("g"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("í"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("c"),
                    right = KeyC("é"),
                    left = KeyC("è"),
                    topRight = KeyC("ç"),
                    top = KeyC("t"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ES_CA_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    bottomRight = KeyC("B"),
                    left = KeyC("Ñ"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    bottom = KeyC("V"),
                    right = KeyC("L·L"),
                    topRight = KeyC("!"),
                    topLeft = KeyC("¡"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    bottomLeft = KeyC("U"),
                    right = KeyC("Ó"),
                    bottomRight = KeyC("Ú"),
                    bottom = KeyC("Ü"),
                    left = KeyC("Ò"),
                    topLeft = KeyC("¿"),
                    topRight = KeyC("?"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    right = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    topLeft = KeyC("J"),
                    top = KeyC("K"),
                    topRight = KeyC("H"),
                    right = KeyC("Q"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("X"),
                    bottomLeft = KeyC("F"),
                    left = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    left = KeyC("À"),
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
                    right = KeyC("Á"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topRight = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("G"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Í"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("C"),
                    topRight = KeyC("Ç"),
                    left = KeyC("È"),
                    right = KeyC("É"),
                    top = KeyC("T"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ES_CA_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "español català thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_ES_CA_THUMBKEY_MAIN,
                shifted = KB_ES_CA_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
