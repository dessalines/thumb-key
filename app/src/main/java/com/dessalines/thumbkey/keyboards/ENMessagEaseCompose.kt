@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_EN_MESSAGEASE_COMPOSED_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¿¡"),
                            action = ComposeLastKey("!"),
                            color = MUTED,
                        ),
                    bottomRight = KeyC("v"),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    bottom = KeyC("l"),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("`"),
                            action = ComposeLastKey("`"),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("^"),
                            action = ComposeLastKey("^"),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("´"),
                            action = ComposeLastKey("'"),
                            color = MUTED,
                        ),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("˘"),
                            action = ComposeLastKey("˘"),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\$"),
                            action = ComposeLastKey("\$"),
                            color = MUTED,
                        ),
                    bottomLeft = KeyC("x"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    right = KeyC("k"),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topLeft = KeyC("q"),
                    top = KeyC("u"),
                    topRight = KeyC("p"),
                    right = KeyC("b"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("d"),
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
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("]", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("y"),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("~"),
                            action = ComposeLastKey("~"),
                            color = MUTED,
                        ),
                    right = KeyC("*", color = MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = MUTED),
                    left = KeyC("<", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\""),
                            action = ComposeLastKey("\""),
                            color = MUTED,
                        ),
                    top = KeyC("w"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("f"),
                    top = KeyC("&", color = MUTED),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("°"),
                            action = ComposeLastKey("°"),
                            color = MUTED,
                        ),
                    right = KeyC(">", color = MUTED),
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

val KB_EN_MESSAGEASE_COMPOSED_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¿¡"),
                            action = ComposeLastKey("!"),
                            color = MUTED,
                        ),
                    bottomRight = KeyC("V"),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    bottom = KeyC("L"),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("`"),
                            action = ComposeLastKey("`"),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("^"),
                            action = ComposeLastKey("^"),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("´"),
                            action = ComposeLastKey("'"),
                            color = MUTED,
                        ),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("˘"),
                            action = ComposeLastKey("˘"),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\$"),
                            action = ComposeLastKey("\$"),
                            color = MUTED,
                        ),
                    bottomLeft = KeyC("X"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    right = KeyC("K"),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topLeft = KeyC("Q"),
                    top = KeyC("U"),
                    topRight = KeyC("P"),
                    right = KeyC("B"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("D"),
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
                    topRight = KeyC("Y"),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("~"),
                            action = ComposeLastKey("~"),
                            color = MUTED,
                        ),
                    right = KeyC("*", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\""),
                            action = ComposeLastKey("\""),
                            color = MUTED,
                        ),
                    top = KeyC("W"),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("'"),
                            action = ComposeLastKey("'"),
                            color = MUTED,
                        ),
                    right = KeyC("Z"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("F"),
                    top = KeyC("&", color = MUTED),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("°"),
                            action = ComposeLastKey("°"),
                            color = MUTED,
                        ),
                    right = KeyC(">", color = MUTED),
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

val KB_EN_MESSAGEASE_COMPOSE: KeyboardDefinition =
    KeyboardDefinition(
        title = "english messagease compose",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_MESSAGEASE_COMPOSED_MAIN,
                shifted = KB_EN_MESSAGEASE_COMPOSED_SHIFTED,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
