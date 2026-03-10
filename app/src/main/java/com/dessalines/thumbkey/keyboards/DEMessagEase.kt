@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_DE_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    bottomRight = KeyC("v"),
                    bottom = KeyC("ä"),
                    right = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    bottom = KeyC("l"),
                    left = KeyC("+", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    right = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    bottomLeft = KeyC("x"),
                    left = KeyC("?", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    right = KeyC("k"),
                    top = KeyC("ü"),
                    bottom = KeyC("ö"),
                    left = KeyC("(", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    topLeft = KeyC("q"),
                    top = KeyC("u"),
                    topRight = KeyC("p"),
                    right = KeyC("b"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("o"),
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
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomLeft = KeyC("@", color = MUTED),
                    right = KeyC(")", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("y"),
                    bottom = KeyC("ß"),
                    right = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("w"),
                    right = KeyC("z"),
                    topLeft =
                        KeyC(
                            display =
                                KeyDisplay.TextDisplay(
                                    "\"",
                                ),
                            action =
                                CommitText(
                                    "\"",
                                ),
                            color = MUTED,
                        ),
                    topRight = KeyC("'", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("f"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DE_MESSAGEASE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    bottomRight = KeyC("V"),
                    bottom = KeyC("Ä"),
                    right = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    bottom = KeyC("L"),
                    left = KeyC("+", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    right = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    bottomLeft = KeyC("X"),
                    left = KeyC("?", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    right = KeyC("K"),
                    bottom = KeyC("Ö"),
                    top = KeyC("Ü"),
                    left = KeyC("(", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    topLeft = KeyC("Q"),
                    top = KeyC("U"),
                    topRight = KeyC("P"),
                    right = KeyC("B"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("O"),
                    bottomLeft = KeyC("G"),
                    left = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    left = KeyC("M"),
                    bottomLeft = KeyC("@", color = MUTED),
                    right = KeyC(")", color = MUTED),
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
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("Y"),
                    bottom = KeyC("ẞ"),
                    right = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("W"),
                    right = KeyC("Z"),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("F"),
                    bottomLeft = KeyC(";", color = MUTED),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DE_MESSAGEASE: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch messagease",
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_MESSAGEASE_MAIN,
                shifted = KB_DE_MESSAGEASE_SHIFTED,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
    )
