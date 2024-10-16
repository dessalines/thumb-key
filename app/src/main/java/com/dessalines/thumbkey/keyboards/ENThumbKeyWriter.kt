@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

// Adds more punctuation options to the main screen to reduce switches to the numeric keyboard
val KB_EN_THUMBKEY_WRITER_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottomRight = KeyC("w"),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
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
                    center = KeyC("o", size = LARGE),
                    bottomLeft = KeyC("u"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("m"),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottom = KeyC("…", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    topLeft = KeyC("j"),
                    top = KeyC("q"),
                    topRight = KeyC("b"),
                    right = KeyC("p"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("x"),
                    bottomLeft = KeyC("v"),
                    left = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    left = KeyC("l"),
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
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("c"),
                    top = KeyC("–", color = MUTED),
                    topLeft = KeyC("“", color = MUTED),
                    left = KeyC("‘", color = MUTED),
                    right = KeyC("~", color = MUTED),
                    bottom = KeyC("—", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("f"),
                    right = KeyC("z"),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("d"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("”", color = MUTED),
                    right = KeyC("’", color = MUTED),
                    bottom = KeyC("°", color = MUTED),
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

val KB_EN_THUMBKEY_WRITER_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottomRight = KeyC("W"),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
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
                    center = KeyC("O", size = LARGE),
                    bottomLeft = KeyC("U"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("M"),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottom = KeyC("…", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    topLeft = KeyC("J"),
                    top = KeyC("Q"),
                    topRight = KeyC("B"),
                    right = KeyC("P"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("X"),
                    bottomLeft = KeyC("V"),
                    left = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    left = KeyC("L"),
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
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("C"),
                    top = KeyC("–", color = MUTED),
                    topLeft = KeyC("“", color = MUTED),
                    left = KeyC("‘", color = MUTED),
                    right = KeyC("~", color = MUTED),
                    bottom = KeyC("—", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("F"),
                    right = KeyC("Z"),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("D"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("”", color = MUTED),
                    right = KeyC("’", color = MUTED),
                    bottom = KeyC("°", color = MUTED),
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

val KB_EN_THUMBKEY_WRITER: KeyboardDefinition =
    KeyboardDefinition(
        title = "english thumb-key writer",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_WRITER_MAIN,
                shifted = KB_EN_THUMBKEY_WRITER_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
