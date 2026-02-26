@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_DE_THUMBKEY_SYMNUM_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topLeft = KeyC("1"),
                    top = KeyC("2"),
                    topRight = KeyC("3"),
                    bottom = KeyC("0"),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottomRight = KeyC("c"),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("-"), // mi
                            action = CommitText("-"),
                            color = MUTED,
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("„“"), // mi
                            action = SmartQuotes("„", "“"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    topLeft = KeyC("4"),
                    top = KeyC("5"),
                    topRight = KeyC("6"),
                    left = KeyC("+", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottom = KeyC("f"),
                    bottomRight = KeyC("\\", color = MUTED),
                    right = KeyC("=", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    topLeft = KeyC("7"),
                    top = KeyC("8"),
                    topRight = KeyC("9"),
                    left = KeyC("?", color = MUTED),
                    bottomLeft = KeyC("l"),
                    bottom = KeyC("ä"),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("@", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("sch"), // mi
                            action = CommitText("sch"),
                        ),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ch"), // mi
                            action = CommitText("ch"),
                        ),
                    bottomRight = KeyC("_", color = MUTED),
                    right = KeyC("m"),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    top = KeyC("q"),
                    topLeft = KeyC("j"),
                    left = KeyC("p"),
                    bottomLeft = KeyC("v"),
                    bottom = KeyC("x"),
                    bottomRight = KeyC("w"),
                    right = KeyC("k"),
                    topRight = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topLeft = KeyC("|", color = MUTED),
                    left = KeyC("o"),
                    bottom = KeyC("ö"),
                    bottomRight = KeyC("]", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    bottom = KeyC("^", color = MUTED),
                    topLeft = KeyC("~", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    top = KeyC("ſ", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    topRight = KeyC("g"),
                    bottomLeft = KeyC("`", color = MUTED),
                    bottomRight = KeyC("´", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    top = KeyC("b"),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("ß"),
                    bottomLeft = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    right = KeyC("y"),
                    topRight = KeyC("'", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("&", color = MUTED),
                    topLeft = KeyC("u"),
                    left = KeyC("#", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC("ü"),
                    right = KeyC(">", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DE_THUMBKEY_SYMNUM_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topLeft = KeyC("1"),
                    top = KeyC("2"),
                    topRight = KeyC("3"),
                    bottom = KeyC("0"),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottomRight = KeyC("C"),
                    right = KeyC("-", color = MUTED),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("„“"), // mi
                            action = SmartQuotes("„", "“"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    topLeft = KeyC("4"),
                    top = KeyC("5"),
                    topRight = KeyC("6"),
                    left = KeyC("+", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottom = KeyC("F"),
                    bottomRight = KeyC("\\", color = MUTED),
                    right = KeyC("=", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    topLeft = KeyC("7"),
                    top = KeyC("8"),
                    topRight = KeyC("9"),
                    left = KeyC("?", color = MUTED),
                    bottomLeft = KeyC("L"),
                    bottom = KeyC("Ä"),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("@", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    top = KeyC("Sch"),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom = KeyC("Ch"),
                    bottomRight = KeyC("_", color = MUTED),
                    right = KeyC("M"),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    top = KeyC("Q"),
                    topLeft = KeyC("J"),
                    left = KeyC("P"),
                    bottomLeft = KeyC("V"),
                    bottom = KeyC("X"),
                    bottomRight = KeyC("W"),
                    right = KeyC("K"),
                    topRight = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topLeft = KeyC("|", color = MUTED),
                    left = KeyC("O"),
                    bottomLeft = KeyC("Ö"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    bottomRight = KeyC("]", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    bottom = KeyC("^", color = MUTED),
                    topLeft = KeyC("~", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    top = KeyC("ſ", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    topRight = KeyC("G"),
                    bottomLeft = KeyC("`", color = MUTED),
                    bottomRight = KeyC("´", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    top = KeyC("B"),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("ẞ"),
                    bottomLeft = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    right = KeyC("Y"),
                    topRight = KeyC("'", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("&", color = MUTED),
                    topLeft = KeyC("U"),
                    left = KeyC("#", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC("Ü"),
                    right = KeyC(">", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DE_THUMBKEY_SYMNUM: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch thumb-key symnum",
        locales = listOf("de"),
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_THUMBKEY_SYMNUM_MAIN,
                shifted = KB_DE_THUMBKEY_SYMNUM_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
