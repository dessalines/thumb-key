@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_CZ_MESSAGEASE_PROGRAMMING_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    longPress = CommitText("1"),
                    topRight = KeyC("á"),
                    right = KeyC("-", color = MUTED),
                    bottomRight = KeyC("v"),
                    bottomLeft = KeyC("$", color = MUTED),
                    top = KeyC("°", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    left = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    longPress = CommitText("2"),
                    topLeft = KeyC("ó"),
                    top = KeyC("ů"),
                    topRight = KeyC("ú"),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottom = KeyC("l"),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    longPress = CommitText("3"),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("í"),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ˇ"),
                            action = ComposeLastKey("ˇ"),
                            color = MUTED,
                        ),
                    left = KeyC("?", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¨"),
                            action = ComposeLastKey("\""),
                            color = MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("´"),
                            action = ComposeLastKey("'"),
                            color = MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    longPress = CommitText("4"),
                    top = KeyC("x"),
                    right = KeyC("k"),
                    bottom = KeyC("'", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    longPress = CommitText("5"),
                    top = KeyC("u"),
                    topRight = KeyC("p"),
                    right = KeyC("b"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("d"),
                    bottomLeft = KeyC("g"),
                    left = KeyC("c"),
                    topLeft = KeyC("č"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    longPress = CommitText("6"),
                    topLeft = KeyC("ř"),
                    left = KeyC("m"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topRight = KeyC("}", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
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
                    longPress = CommitText("7"),
                    top = KeyC("ý"),
                    topRight = KeyC("y"),
                    left = KeyC("<", color = MUTED),
                    topLeft = KeyC("~", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    bottom = KeyC("|", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    longPress = CommitText("8"),
                    topLeft = KeyC("\"", color = MUTED),
                    top = KeyC("ě"),
                    topRight = KeyC("é"),
                    right = KeyC("z"),
                    left = KeyC("w"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    longPress = CommitText("9"),
                    top = KeyC("š"),
                    topLeft = KeyC("f"),
                    topRight = KeyC("&", color = MUTED),
                    left = KeyC("ž"),
                    bottomLeft = KeyC(";", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottom = KeyC("#", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ZERO_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_CZ_MESSAGEASE_PROGRAMMING_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    longPress = CommitText("1"),
                    topRight = KeyC("Á"),
                    right = KeyC("-", color = MUTED),
                    bottomRight = KeyC("V"),
                    bottomLeft = KeyC("$", color = MUTED),
                    top = KeyC("°", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    left = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    longPress = CommitText("2"),
                    topLeft = KeyC("Ó"),
                    top = KeyC("Ů"),
                    topRight = KeyC("Ú"),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottom = KeyC("L"),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    longPress = CommitText("3"),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("Í"),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ˇ"),
                            action = ComposeLastKey("ˇ"),
                            color = MUTED,
                        ),
                    left = KeyC("?", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¨"),
                            action = ComposeLastKey("\""),
                            color = MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("´"),
                            action = ComposeLastKey("'"),
                            color = MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    longPress = CommitText("4"),
                    top = KeyC("X"),
                    right = KeyC("K"),
                    bottom = KeyC("'", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    longPress = CommitText("5"),
                    top = KeyC("U"),
                    topRight = KeyC("P"),
                    right = KeyC("B"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("D"),
                    bottomLeft = KeyC("G"),
                    left = KeyC("C"),
                    topLeft = KeyC("Č"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    longPress = CommitText("6"),
                    topLeft = KeyC("Ř"),
                    left = KeyC("M"),
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
                    topRight = KeyC("}", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    longPress = CommitText("7"),
                    top = KeyC("Ý"),
                    topRight = KeyC("Y"),
                    left = KeyC("<", color = MUTED),
                    topLeft = KeyC("~", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    bottom = KeyC("|", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    longPress = CommitText("8"),
                    top = KeyC("Ě"),
                    topRight = KeyC("É"),
                    right = KeyC("Z"),
                    left = KeyC("W"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    longPress = CommitText("9"),
                    top = KeyC("Š"),
                    topLeft = KeyC("F"),
                    topRight = KeyC("&", color = MUTED),
                    left = KeyC("Ž"),
                    bottomLeft = KeyC(";", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottom = KeyC("#", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ZERO_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_CZ_MESSAGEASE_PROGRAMMING: KeyboardDefinition =
    KeyboardDefinition(
        title = "čeština messagease programming",
        modes =
            KeyboardDefinitionModes(
                main = KB_CZ_MESSAGEASE_PROGRAMMING_MAIN,
                shifted = KB_CZ_MESSAGEASE_PROGRAMMING_SHIFTED,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
        locales = listOf("cs"),
    )
