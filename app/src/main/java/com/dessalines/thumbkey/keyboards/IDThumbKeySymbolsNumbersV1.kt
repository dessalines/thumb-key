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

// Adds more punctuation options to the main screen to reduce switches to the numeric keyboard
val KB_ID_THUMBKEY_SYMBOLS_NUMBERS_V1_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("h"),
                    right = KeyC("1"),
                    bottom = KeyC("2"),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("d", size = FontSizeVariant.LARGE),
                    bottom = KeyC("g"),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("m"),
                    right = KeyC("3"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    right = KeyC("b"),
                    top = KeyC("4"),
                    bottom = KeyC("5"),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("x"),
                    top = KeyC("f"),
                    topRight = KeyC("c"),
                    right = KeyC("j"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("w"),
                    bottomLeft = KeyC("v"),
                    left = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    left = KeyC("k"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    topRight = KeyC("p"),
                    top = KeyC("6"),
                    right = KeyC("7"),
                    bottom = KeyC("8"),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("<", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("u", size = FontSizeVariant.LARGE),
                    top = KeyC("l"),
                    right = KeyC("q"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    left = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("o"),
                    right = KeyC("9"),
                    bottom = KeyC("0"),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                    bottomRight = KeyC(">", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    left = KeyC("#", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ID_THUMBKEY_SYMBOLS_NUMBERS_V1_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("H"),
                    right = KeyC("1"),
                    bottom = KeyC("2"),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("D", size = FontSizeVariant.LARGE),
                    bottom = KeyC("G"),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("M"),
                    right = KeyC("3"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    right = KeyC("B"),
                    top = KeyC("4"),
                    bottom = KeyC("5"),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("X"),
                    top = KeyC("F"),
                    topRight = KeyC("C"),
                    right = KeyC("J"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("W"),
                    bottomLeft = KeyC("V"),
                    left = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    left = KeyC("K"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    topRight = KeyC("P"),
                    top = KeyC("6"),
                    right = KeyC("7"),
                    bottom = KeyC("8"),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("<", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("U", size = FontSizeVariant.LARGE),
                    top = KeyC("L"),
                    right = KeyC("Q"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    left = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("O"),
                    right = KeyC("9"),
                    bottom = KeyC("0"),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                    bottomRight = KeyC(">", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    left = KeyC("#", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ID_THUMBKEY_SYMBOLS_NUMBERS_V1: KeyboardDefinition =
    KeyboardDefinition(
        title = "bahasa indonesia thumb-key symbols-numbers v1",
        modes =
            KeyboardDefinitionModes(
                main = KB_ID_THUMBKEY_SYMBOLS_NUMBERS_V1_MAIN,
                shifted = KB_ID_THUMBKEY_SYMBOLS_NUMBERS_V1_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
