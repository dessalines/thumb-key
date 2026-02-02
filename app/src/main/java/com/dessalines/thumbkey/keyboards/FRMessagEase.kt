@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_FR_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottomRight =
                        KeyC(
                            CommitText("v"),
                        ),
                    topRight =
                        KeyC(
                            CommitText("à"),
                        ),
                    right = KeyC("-", color = MUTED),
                    bottom =
                        KeyC(
                            CommitText("â"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    topLeft = KeyC("\u0300", displayText = "ˋ", color = MUTED),
                    top = KeyC("\u0302", displayText = "^", color = MUTED),
                    topRight = KeyC("\u0301", displayText = "ˊ", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottom =
                        KeyC(
                            CommitText("l"),
                        ),
                    bottomRight = KeyC("\\", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    left = KeyC("?", color = MUTED),
                    bottomLeft =
                        KeyC(
                            CommitText("x"),
                        ),
                    bottom = KeyC("=", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    right =
                        KeyC(
                            CommitText("k"),
                        ),
                    top =
                        KeyC(
                            CommitText("û"),
                        ),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom =
                        KeyC(
                            CommitText("ç"),
                        ),
                    bottomRight = KeyC("_", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topLeft =
                        KeyC(
                            CommitText("q"),
                        ),
                    top =
                        KeyC(
                            CommitText("h"),
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
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    left =
                        KeyC(
                            CommitText("m"),
                        ),
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
                    topLeft = KeyC("~", color = MUTED),
                    topRight =
                        KeyC(
                            CommitText("y"),
                        ),
                    left = KeyC("<", color = MUTED),
                    right =
                        KeyC(
                            CommitText("è"),
                        ),
                    top =
                        KeyC(
                            CommitText("ê"),
                        ),
                    bottomRight = KeyC("\u0009", displayText = "␉", color = MUTED),
                    bottom =
                        KeyC(
                            CommitText("ù"),
                        ),
                    bottomLeft = KeyC("\u0303", displayText = "ñ", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top =
                        KeyC(
                            CommitText("w"),
                        ),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    right =
                        KeyC(
                            CommitText("z"),
                        ),
                    left =
                        KeyC(
                            CommitText("é"),
                        ),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft =
                        KeyC(
                            CommitText("f"),
                        ),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    left = KeyC("#", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC("\u0308", displayText = "¨", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_MESSAGEASE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottomRight =
                        KeyC(
                            CommitText("V"),
                        ),
                    topRight =
                        KeyC(
                            CommitText("À"),
                        ),
                    right = KeyC("-", color = MUTED),
                    bottom =
                        KeyC(
                            CommitText("Â"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    topLeft = KeyC("\u0300", displayText = "ˋ", color = MUTED),
                    top = KeyC("\u0302", displayText = "^", color = MUTED),
                    topRight = KeyC("\u0301", displayText = "ˊ", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottom =
                        KeyC(
                            CommitText("L"),
                        ),
                    bottomRight = KeyC("\\", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    left = KeyC("?", color = MUTED),
                    bottomLeft =
                        KeyC(
                            CommitText("X"),
                        ),
                    bottom = KeyC("=", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    right =
                        KeyC(
                            CommitText("K"),
                        ),
                    top =
                        KeyC(
                            CommitText("Û"),
                        ),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom =
                        KeyC(
                            CommitText("Ç"),
                        ),
                    bottomRight = KeyC("_", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topLeft =
                        KeyC(
                            CommitText("Q"),
                        ),
                    top =
                        KeyC(
                            CommitText("H"),
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
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    left =
                        KeyC(
                            CommitText("M"),
                        ),
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
                    topRight =
                        KeyC(
                            CommitText("Y"),
                        ),
                    left = KeyC("<", color = MUTED),
                    right =
                        KeyC(
                            CommitText("È"),
                        ),
                    top =
                        KeyC(
                            CommitText("Ê"),
                        ),
                    bottomRight = KeyC("\u0009", displayText = "␉", color = MUTED),
                    bottom =
                        KeyC(
                            CommitText("Ù"),
                        ),
                    bottomLeft = KeyC("\u0303", displayText = "ñ", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top =
                        KeyC(
                            CommitText("W"),
                        ),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    right =
                        KeyC(
                            CommitText("Z"),
                        ),
                    left =
                        KeyC(
                            CommitText("É"),
                        ),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft =
                        KeyC(
                            CommitText("F"),
                        ),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    left = KeyC("#", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC("\u0308", displayText = "¨", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_MESSAGEASE: KeyboardDefinition =
    KeyboardDefinition(
        title = "français messagease",
        locales = listOf("fr"),
        modes =
            KeyboardDefinitionModes(
                main = KB_FR_MESSAGEASE_MAIN,
                shifted = KB_FR_MESSAGEASE_SHIFTED,
                numeric = FRENCH_NUMERIC_KEYBOARD,
            ),
    )
