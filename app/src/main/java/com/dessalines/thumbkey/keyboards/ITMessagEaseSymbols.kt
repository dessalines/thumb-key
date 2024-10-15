@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_IT_MESSAGEASE_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    bottomRight =
                        KeyC(
                            CommitText("v"),
                        ),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                    topRight =
                        KeyC(
                            CommitText("à"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    bottom =
                        KeyC(
                            CommitText("h"),
                        ),
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
                    bottomLeft =
                        KeyC(
                            CommitText("x"),
                        ),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                    topLeft =
                        KeyC(
                            CommitText("ì"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    right =
                        KeyC(
                            CommitText("k"),
                        ),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    top =
                        KeyC(
                            CommitText("ù"),
                        ),
                    bottom =
                        KeyC(
                            CommitText("ò"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topLeft =
                        KeyC(
                            CommitText("q"),
                        ),
                    top =
                        KeyC(
                            CommitText("u"),
                        ),
                    topRight =
                        KeyC(
                            CommitText("p"),
                        ),
                    right =
                        KeyC(
                            CommitText("b"),
                        ),
                    bottomRight =
                        KeyC(
                            CommitText("j"),
                        ),
                    bottom =
                        KeyC(
                            CommitText("d"),
                        ),
                    bottomLeft =
                        KeyC(
                            CommitText("g"),
                        ),
                    left =
                        KeyC(
                            CommitText("c"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    left =
                        KeyC(
                            CommitText("m"),
                        ),
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
                    topRight =
                        KeyC(
                            CommitText("y"),
                        ),
                    topLeft = KeyC("~", color = MUTED),
                    right =
                        KeyC(
                            CommitText("è"),
                        ),
                    bottomRight = KeyC("\t", displayText = "⇥", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    top = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("\"", color = MUTED),
                    top =
                        KeyC(
                            CommitText("w"),
                        ),
                    topRight = KeyC("'", color = MUTED),
                    right =
                        KeyC(
                            CommitText("z"),
                        ),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left =
                        KeyC(
                            CommitText("é"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft =
                        KeyC(
                            CommitText("f"),
                        ),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
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

val KB_IT_MESSAGEASE_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    bottomRight =
                        KeyC(
                            CommitText("V"),
                        ),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                    topRight =
                        KeyC(
                            CommitText("À"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    bottom =
                        KeyC(
                            CommitText("H"),
                        ),
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
                    bottomLeft =
                        KeyC(
                            CommitText("X"),
                        ),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                    topLeft =
                        KeyC(
                            CommitText("Ì"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    right =
                        KeyC(
                            CommitText("K"),
                        ),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    top =
                        KeyC(
                            CommitText("Ù"),
                        ),
                    bottom =
                        KeyC(
                            CommitText("Ò"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topLeft =
                        KeyC(
                            CommitText("Q"),
                        ),
                    top =
                        KeyC(
                            CommitText("U"),
                        ),
                    topRight =
                        KeyC(
                            CommitText("P"),
                        ),
                    right =
                        KeyC(
                            CommitText("B"),
                        ),
                    bottomRight =
                        KeyC(
                            CommitText("J"),
                        ),
                    bottom =
                        KeyC(
                            CommitText("D"),
                        ),
                    bottomLeft =
                        KeyC(
                            CommitText("G"),
                        ),
                    left =
                        KeyC(
                            CommitText("C"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    left =
                        KeyC(
                            CommitText("M"),
                        ),
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
                    topRight =
                        KeyC(
                            CommitText("Y"),
                        ),
                    topLeft = KeyC("~", color = MUTED),
                    right =
                        KeyC(
                            CommitText("È"),
                        ),
                    left = KeyC("<", color = MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = MUTED),
                    top = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("\"", color = MUTED),
                    top =
                        KeyC(
                            CommitText("W"),
                        ),
                    topRight = KeyC("'", color = MUTED),
                    right =
                        KeyC(
                            CommitText("Z"),
                        ),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left =
                        KeyC(
                            CommitText("É"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft =
                        KeyC(
                            CommitText("F"),
                        ),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
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

val KB_IT_MESSAGEASE_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "italiano messagease symbols",
        modes =
            KeyboardDefinitionModes(
                main = KB_IT_MESSAGEASE_SYMBOLS_MAIN,
                shifted = KB_IT_MESSAGEASE_SYMBOLS_SHIFTED,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
    )
