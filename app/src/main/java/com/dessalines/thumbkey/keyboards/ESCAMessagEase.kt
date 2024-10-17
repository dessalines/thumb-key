@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_ES_CA_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottomRight = KeyC("v"),
                    top = KeyC("à"),
                    right = KeyC("-", color = MUTED),
                    left = KeyC("¡", color = MUTED),
                    bottom = KeyC("á"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    topLeft = KeyC("\u0300", displayText = "ˋ", color = MUTED),
                    top = KeyC("ñ"),
                    topRight = KeyC("\u0301", displayText = "ˊ", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottom = KeyC("l"),
                    bottomRight = KeyC("\\", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("\u0308", displayText = "¨", color = MUTED),
                    topRight = KeyC("ï"),
                    topLeft = KeyC("í"),
                    left = KeyC("?", color = MUTED),
                    right = KeyC("¿", color = MUTED),
                    bottomLeft = KeyC("x"),
                    bottom = KeyC("=", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    top = KeyC("ü"),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    right = KeyC("k"),
                    bottom = KeyC("ç"),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
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
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    left = KeyC("m"),
                    right = KeyC(")", color = MUTED),
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
                    bottomLeft = KeyC("@", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    right = KeyC("*", color = MUTED),
                    topLeft = KeyC("~", color = MUTED),
                    topRight = KeyC("y"),
                    left = KeyC("<", color = MUTED),
                    top = KeyC("ú"),
                    bottom = KeyC("ó"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("w"),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("z"),
                    left = KeyC("é"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("f"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    left = KeyC("#", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottomRight = KeyC("·", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ES_CA_MESSAGEASE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottomRight = KeyC("V"),
                    bottom = KeyC("Á"),
                    top = KeyC("À"),
                    right = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    topLeft = KeyC("\u0300", displayText = "ˋ", color = MUTED),
                    top = KeyC("Ñ"),
                    topRight = KeyC("\u0301", displayText = "ˊ", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottom = KeyC("L"),
                    bottomRight = KeyC("\\", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("\u0308", displayText = "¨"),
                    topRight = KeyC("Ï"),
                    topLeft = KeyC("Í"),
                    left = KeyC("?", color = MUTED),
                    right = KeyC("¿", color = MUTED),
                    bottomLeft = KeyC("X"),
                    bottom = KeyC("=", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    right = KeyC("K"),
                    top = KeyC("Ü"),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom = KeyC("Ç"),
                    bottomRight = KeyC("_", color = MUTED),
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
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    left = KeyC("M"),
                    right = KeyC(")", color = MUTED),
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
                    bottomLeft = KeyC("@", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topLeft = KeyC("~", color = MUTED),
                    topRight = KeyC("Y"),
                    right = KeyC("*", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    top = KeyC("Ú"),
                    bottom = KeyC("Ó"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("W"),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    left = KeyC("É"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("F"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    left = KeyC("#", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottomRight = KeyC("·", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ES_CA_MESSAGEASE: KeyboardDefinition =
    KeyboardDefinition(
        title = "español català messagease",
        modes =
            KeyboardDefinitionModes(
                main = KB_ES_CA_MESSAGEASE_MAIN,
                shifted = KB_ES_CA_MESSAGEASE_SHIFTED,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
    )
