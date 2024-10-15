@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_DE_THUMBKEY_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    top = KeyC("ä"),
                    topLeft = KeyC("ö"),
                    left = KeyC("ü"),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottomRight = KeyC("c"),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("-"), // mi
                            action = CommitText("-"),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¿¡"), // mi
                            action = ComposeLastKey("!"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottom = KeyC("f"),
                    bottomRight = KeyC("\\", color = MUTED),
                    right = KeyC("=", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("˘"), // mi
                            action = CommitText("˘"),
                            color = MUTED,
                        ),
                    left = KeyC("?", color = MUTED),
                    bottomLeft = KeyC("l"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ä"), // mi
                            action = CommitText("ä"),
                            color = MUTED,
                        ),
                    bottomRight = KeyC("€", color = MUTED),
                    right = KeyC("!", color = MUTED),
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
                    bottomLeft = KeyC("@", color = MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ö"), // mi
                            action = CommitText("ö"),
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
                    center = KeyC("n", size = LARGE),
                    topLeft = KeyC("~", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ß"), // mi
                            action = CommitText("ß"),
                        ),
                    right = KeyC("*", color = MUTED),
                    topRight = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    top = KeyC("b"),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("ß", color = MUTED),
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
                    bottom = KeyC("ü", color = MUTED),
                    right = KeyC(">", color = MUTED),
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

val KB_DE_THUMBKEY_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    top = KeyC("Ä", color = MUTED),
                    topLeft = KeyC("Ö", color = MUTED),
                    left = KeyC("Ü", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("Ä"), // mi
                            action = CommitText("Ä"),
                        ),
                    bottomRight = KeyC("C"),
                    right = KeyC("-", color = MUTED),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¿¡"), // mi
                            action = CommitText("!"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottom = KeyC("F"),
                    bottomRight = KeyC("\\", color = MUTED),
                    right = KeyC("=", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("˘"), // mi
                            action = CommitText("˘"),
                            color = MUTED,
                        ),
                    left = KeyC("?", color = MUTED),
                    bottomLeft = KeyC("L"),
                    bottom = KeyC("!", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
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
                    bottomLeft = KeyC("@", color = MUTED),
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
                    topLeft = KeyC("~", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ẞ"), // mi
                            action = CommitText("ẞ"),
                        ),
                    right = KeyC("*", color = MUTED),
                    topRight = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    top = KeyC("B"),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("ẞ", color = MUTED),
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
                    right = KeyC(">", color = MUTED),
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

val KB_DE_THUMBKEY_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch thumb-key symbols",
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_THUMBKEY_SYMBOLS_MAIN,
                shifted = KB_DE_THUMBKEY_SYMBOLS_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
