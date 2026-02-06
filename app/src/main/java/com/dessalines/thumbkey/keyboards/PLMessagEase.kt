@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_PL_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    right = KeyC("-", color = MUTED),
                    bottomRight = KeyC("v"),
                    bottom = KeyC("ą"),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    top = KeyC("ń"),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottom = KeyC("l"),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                    bottomLeft = KeyC("x"),
                    left = KeyC("?", color = MUTED),
                    topLeft = KeyC("ł"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("w", size = LARGE),
                    top = KeyC("ó"),
                    topRight = KeyC("%", color = MUTED),
                    right = KeyC("k"),
                    bottomRight = KeyC("_", color = MUTED),
                    bottom = KeyC("ć"),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    top = KeyC("u"),
                    topRight = KeyC("p"),
                    right = KeyC("b"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("d"),
                    bottomLeft = KeyC("g"),
                    left = KeyC("c"),
                    topLeft = KeyC("q"),
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
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("]", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                    left = KeyC("m"),
                    topLeft = KeyC("|", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("z", size = LARGE),
                    topRight = KeyC("y"),
                    right = KeyC("ź"),
                    bottom = KeyC("ę"),
                    left = KeyC("<", color = MUTED),
                    topLeft = KeyC("~", color = MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("h"),
                    topRight = KeyC("\'", color = MUTED),
                    right = KeyC("t"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("ż"),
                    topLeft = KeyC("\"", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("ś"),
                    topLeft = KeyC("f"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PL_MESSAGEASE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    right = KeyC("-", color = MUTED),
                    bottomRight = KeyC("V"),
                    bottom = KeyC("Ą"),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    top = KeyC("Ń"),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottom = KeyC("L"),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    topRight = KeyC("´"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                    bottomLeft = KeyC("X"),
                    left = KeyC("?", color = MUTED),
                    topLeft = KeyC("Ł"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("W", size = LARGE),
                    top = KeyC("Ó"),
                    topRight = KeyC("%", color = MUTED),
                    right = KeyC("K"),
                    bottomRight = KeyC("_", color = MUTED),
                    bottom = KeyC("Ć"),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    top = KeyC("U"),
                    topRight = KeyC("P"),
                    right = KeyC("B"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("D"),
                    bottomLeft = KeyC("G"),
                    left = KeyC("C"),
                    topLeft = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
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
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                    left = KeyC("M"),
                    topLeft = KeyC("|", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Z", size = LARGE),
                    topRight = KeyC("Y"),
                    right = KeyC("Ź"),
                    bottom = KeyC("Ę"),
                    left = KeyC("<", color = MUTED),
                    topLeft = KeyC("~", color = MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("H"),
                    topRight = KeyC("\'", color = MUTED),
                    right = KeyC("T"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("Ż"),
                    topLeft = KeyC("\"", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°"),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("Ś"),
                    topLeft = KeyC("F"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PL_MESSAGEASE_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    topRight = KeyC("´"),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                    left = KeyC("?", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                    topLeft = KeyC("|", color = MUTED),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    right = KeyC("*", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    topLeft = KeyC("~", color = MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    topRight = KeyC("\'", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°"),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("#", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                    widthMultiplier = 2,
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PL_MESSAGEASE: KeyboardDefinition =
    KeyboardDefinition(
        title = "polski messagease",
        locales = listOf("pl"),
        modes =
            KeyboardDefinitionModes(
                main = KB_PL_MESSAGEASE_MAIN,
                shifted = KB_PL_MESSAGEASE_SHIFTED,
                numeric = KB_PL_MESSAGEASE_NUMERIC,
            ),
    )
