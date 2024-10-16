@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

// Adds more punctuation options to the main screen to reduce switches to the numeric keyboard
val KB_ID_THUMBKEY_SYMBOLS_V1_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    bottomRight = KeyC("h"),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    bottom = KeyC("g"),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    bottomLeft = KeyC("m"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    right = KeyC("b"),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("x"),
                    top = KeyC("f"),
                    topRight = KeyC("c"),
                    right = KeyC("j"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("w"),
                    bottomLeft = KeyC("v"),
                    left = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    left = KeyC("k"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    topRight = KeyC("p"),
                    topLeft = KeyC("~", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    top = KeyC("l"),
                    right = KeyC("q"),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    topLeft = KeyC("o"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    bottomRight = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("#", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ID_THUMBKEY_SYMBOLS_V1_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    bottomRight = KeyC("H"),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    bottom = KeyC("G"),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    bottomLeft = KeyC("M"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    right = KeyC("B"),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("X"),
                    top = KeyC("F"),
                    topRight = KeyC("C"),
                    right = KeyC("J"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("W"),
                    bottomLeft = KeyC("V"),
                    left = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    left = KeyC("K"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    topRight = KeyC("P"),
                    topLeft = KeyC("~", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    top = KeyC("L"),
                    right = KeyC("Q"),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    topLeft = KeyC("O"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    bottomRight = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("#", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ID_THUMBKEY_SYMBOLS_V1: KeyboardDefinition =
    KeyboardDefinition(
        title = "bahasa indonesia thumb-key symbols v1",
        modes =
            KeyboardDefinitionModes(
                main = KB_ID_THUMBKEY_SYMBOLS_V1_MAIN,
                shifted = KB_ID_THUMBKEY_SYMBOLS_V1_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
