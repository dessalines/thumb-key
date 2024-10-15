@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_SL_MESSAGEASE_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    top = KeyC("đ", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottom = KeyC("š"),
                    bottomRight = KeyC("v"),
                    right = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottom = KeyC("l"),
                    bottomRight = KeyC("\\", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
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
                    top = KeyC("ć"),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom = KeyC("č"),
                    bottomRight = KeyC("_", color = MUTED),
                    right = KeyC("k"),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topLeft = KeyC("q"),
                    top = KeyC("u"),
                    topRight = KeyC("p"),
                    left = KeyC("c"),
                    right = KeyC("b"),
                    bottomLeft = KeyC("g"),
                    bottom = KeyC("d"),
                    bottomRight = KeyC("j"),
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
                    bottomLeft = KeyC("@", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topLeft = KeyC("~", color = MUTED),
                    top = KeyC("ž"),
                    left = KeyC("<", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    topRight = KeyC("y"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("w"),
                    topLeft = KeyC("\"", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    right = KeyC("z"),
                    topRight = KeyC("'", color = MUTED),
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

val KB_SL_MESSAGEASE_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    top = KeyC("Đ", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottom = KeyC("Š"),
                    bottomRight = KeyC("V"),
                    right = KeyC("-", color = MUTED),
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
                    top = KeyC("Ć"),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom = KeyC("Č"),
                    bottomRight = KeyC("_", color = MUTED),
                    right = KeyC("K"),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topLeft = KeyC("Q"),
                    top = KeyC("U"),
                    topRight = KeyC("P"),
                    left = KeyC("C"),
                    right = KeyC("B"),
                    bottomLeft = KeyC("G"),
                    bottom = KeyC("D"),
                    bottomRight = KeyC("J"),
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
                    topLeft = KeyC("~", color = MUTED),
                    top = KeyC("ž"),
                    left = KeyC("<", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    topRight = KeyC("Y"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("W"),
                    topLeft = KeyC("\"", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
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

val KB_SL_MESSAGEASE_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "slovenščina messagease symbols",
        modes =
            KeyboardDefinitionModes(
                main = KB_SL_MESSAGEASE_SYMBOLS_MAIN,
                shifted = KB_SL_MESSAGEASE_SYMBOLS_SHIFTED,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
    )
