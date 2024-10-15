package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardCapslock
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes

val KB_PL_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottomRight = KeyC("v"),
                    bottom = KeyC("ą"),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    top = KeyC("ń"),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottom = KeyC("l"),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("x"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    topLeft = KeyC("ł"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("w", size = FontSizeVariant.LARGE),
                    top = KeyC("ó"),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    right = KeyC("k"),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    bottom = KeyC("ć"),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
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
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                    left = KeyC("m"),
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("z", size = FontSizeVariant.LARGE),
                    topRight = KeyC("y"),
                    right = KeyC("ź"),
                    bottom = KeyC("ę"),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    top = KeyC("h"),
                    topRight = KeyC("\'", color = ColorVariant.MUTED),
                    right = KeyC("t"),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    left = KeyC("ż"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
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
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottomRight = KeyC("V"),
                    bottom = KeyC("Ą"),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    top = KeyC("Ń"),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottom = KeyC("L"),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    topRight = KeyC("´"),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("X"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    topLeft = KeyC("Ł"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("W", size = FontSizeVariant.LARGE),
                    top = KeyC("Ó"),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    right = KeyC("K"),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    bottom = KeyC("Ć"),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
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
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                    left = KeyC("M"),
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Z", size = FontSizeVariant.LARGE),
                    topRight = KeyC("Y"),
                    right = KeyC("Ź"),
                    bottom = KeyC("Ę"),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    top = KeyC("H"),
                    topRight = KeyC("\'", color = ColorVariant.MUTED),
                    right = KeyC("T"),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    left = KeyC("Ż"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("°"),
                    right = KeyC(">", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
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
                    center = KeyC("1", size = FontSizeVariant.LARGE),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("2", size = FontSizeVariant.LARGE),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    topRight = KeyC("´"),
                ),
                KeyItemC(
                    center = KeyC("3", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                    left = KeyC("?", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = FontSizeVariant.LARGE),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("5", size = FontSizeVariant.LARGE),
                ),
                KeyItemC(
                    center = KeyC("6", size = FontSizeVariant.LARGE),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("7", size = FontSizeVariant.LARGE),
                    right = KeyC("*", color = ColorVariant.MUTED),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("8", size = FontSizeVariant.LARGE),
                    topRight = KeyC("\'", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("9", size = FontSizeVariant.LARGE),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("°"),
                    right = KeyC(">", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    left = KeyC("#", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("0", size = FontSizeVariant.LARGE),
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
        modes =
            KeyboardDefinitionModes(
                main = KB_PL_MESSAGEASE_MAIN,
                shifted = KB_PL_MESSAGEASE_SHIFTED,
                numeric = KB_PL_MESSAGEASE_NUMERIC,
            ),
    )
