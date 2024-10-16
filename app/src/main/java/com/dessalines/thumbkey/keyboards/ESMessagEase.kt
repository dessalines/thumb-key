@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_ES_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    bottomLeft = KeyC(KB_ES_MESSAGEASE_CURRENCY_SYMBOL, color = MUTED),
                    bottomRight = KeyC("v"),
                    bottom = KeyC("á"),
                    right = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    left = KeyC("+", color = MUTED),
                    top = KeyC("ñ"),
                    right = KeyC("!", color = MUTED),
                    bottom = KeyC("l"),
                    bottomLeft = KeyC("/", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    topLeft = KeyC("í"),
                    bottomLeft = KeyC("x"),
                    topRight = KeyC("¡", color = MUTED),
                    left = KeyC("?", color = MUTED),
                    right = KeyC("¿", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    left = KeyC("(", color = MUTED),
                    top = KeyC("ü"),
                    right = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topLeft = KeyC("q"),
                    top = KeyC("u"),
                    topRight = KeyC("p"),
                    right = KeyC("b"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("h"),
                    bottomLeft = KeyC("g"),
                    left = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    left = KeyC("m"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    right = KeyC(")", color = MUTED),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomLeft = KeyC("@", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("y"),
                    top = KeyC("ú"),
                    bottom = KeyC("ó"),
                    right = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("w"),
                    topRight = KeyC("'", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("é"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("f"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(SPACEBAR_KEY_ITEM, RETURN_KEY_ITEM),
        ),
    )

val KB_ES_MESSAGEASE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    bottomLeft = KeyC(KB_ES_MESSAGEASE_CURRENCY_SYMBOL, color = MUTED),
                    bottomRight = KeyC("V"),
                    bottom = KeyC("Á"),
                    right = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    left = KeyC("+", color = MUTED),
                    top = KeyC("Ñ"),
                    right = KeyC("!", color = MUTED),
                    bottom = KeyC("L"),
                    bottomLeft = KeyC("/", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    topLeft = KeyC("Í"),
                    bottomLeft = KeyC("X"),
                    topRight = KeyC("¡", color = MUTED),
                    left = KeyC("?", color = MUTED),
                    right = KeyC("¿", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    left = KeyC("(", color = MUTED),
                    top = KeyC("Ü"),
                    right = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topLeft = KeyC("Q"),
                    top = KeyC("U"),
                    topRight = KeyC("P"),
                    right = KeyC("B"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("H"),
                    bottomLeft = KeyC("G"),
                    left = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    left = KeyC("M"),
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
                    right = KeyC(")", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("Y"),
                    top = KeyC("Ú"),
                    bottom = KeyC("Ó"),
                    right = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("W"),
                    topRight = KeyC("'", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("É"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("F"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ES_MESSAGEASE: KeyboardDefinition =
    KeyboardDefinition(
        title = "español messagease",
        modes =
            KeyboardDefinitionModes(
                main = KB_ES_MESSAGEASE_MAIN,
                shifted = KB_ES_MESSAGEASE_SHIFTED,
                numeric = KB_ES_MESSAGEASE_NUMERIC,
            ),
    )
