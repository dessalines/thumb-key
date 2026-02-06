@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_DE_NORDIC_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottom = KeyC("ä"),
                    bottomRight = KeyC("v"),
                    right = KeyC("-", color = MUTED),
                    top = KeyC("å"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    top = KeyC("\u0302", displayText = "^", color = MUTED),
                    topLeft = KeyC("\u0300", displayText = "`", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottom = KeyC("l"),
                    bottomRight = KeyC("\\", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    topRight = KeyC("\u0301", displayText = "´", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    left = KeyC("?", color = MUTED),
                    bottomLeft = KeyC("x"),
                    bottom = KeyC("=", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    top = KeyC("ü"),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom = KeyC("ö"),
                    bottomRight = KeyC("_", color = MUTED),
                    right = KeyC("k"),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    top = KeyC("u"),
                    topLeft = KeyC("q"),
                    left = KeyC("c"),
                    bottomLeft = KeyC("g"),
                    bottom = KeyC("o"),
                    bottomRight = KeyC("j"),
                    right = KeyC("b"),
                    topRight = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topLeft = KeyC("|", color = MUTED),
                    left = KeyC("m"),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomLeft = KeyC("@", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topLeft = KeyC("\u0303", displayText = "~", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    topRight = KeyC("y"),
                    top = KeyC("ø"),
                    bottom = KeyC("ß"),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = CommitText("\t"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("w"),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("æ"),
                    bottomLeft = KeyC(",", color = SECONDARY),
                    bottom = KeyC(".", color = SECONDARY),
                    bottomRight = KeyC(":", color = SECONDARY),
                    right = KeyC("z"),
                    topRight = KeyC("'", color = SECONDARY),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    top = KeyC("&", color = MUTED),
                    topLeft = KeyC("f"),
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

val KB_DE_NORDIC_MESSAGEASE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottom = KeyC("Ä"),
                    bottomRight = KeyC("V"),
                    right = KeyC("-", color = MUTED),
                    top = KeyC("Å"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottom = KeyC("L"),
                    bottomRight = KeyC("\\", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    left = KeyC("?", color = MUTED),
                    bottomLeft = KeyC("X"),
                    bottom = KeyC("=", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    top = KeyC("Ü"),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom = KeyC("Ö"),
                    bottomRight = KeyC("_", color = MUTED),
                    right = KeyC("K"),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    top = KeyC("U"),
                    topLeft = KeyC("Q"),
                    left = KeyC("C"),
                    bottomLeft = KeyC("G"),
                    bottom = KeyC("O"),
                    bottomRight = KeyC("J"),
                    right = KeyC("B"),
                    topRight = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topLeft = KeyC("|", color = MUTED),
                    left = KeyC("M"),
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
                    center = KeyC("T", size = LARGE),
                    topLeft = KeyC("\u0303", displayText = "~", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    topRight = KeyC("Y"),
                    top = KeyC("Ø"),
                    bottom = KeyC("ẞ"),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = CommitText("\t"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("W"),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("Æ"),
                    bottomLeft = KeyC(",", color = SECONDARY),
                    bottom = KeyC(".", color = SECONDARY),
                    bottomRight = KeyC(":", color = SECONDARY),
                    right = KeyC("Z"),
                    topRight = KeyC("'", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    top = KeyC("&", color = MUTED),
                    topLeft = KeyC("F"),
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

val KB_DE_NORDIC_MESSAGEASE: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch messagease +åæø",
        locales = listOf("de"),
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_NORDIC_MESSAGEASE_MAIN,
                shifted = KB_DE_NORDIC_MESSAGEASE_SHIFTED,
                numeric = KB_NORDIC_MESSAGEASE_NUMERIC,
            ),
    )
