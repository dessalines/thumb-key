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

val KB_SL_MESSAGEASE_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    top = KeyC("đ", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                    bottom = KeyC("š"),
                    bottomRight = KeyC("v"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    bottom = KeyC("l"),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("x"),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("h", size = FontSizeVariant.LARGE),
                    top = KeyC("ć"),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottom = KeyC("č"),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    right = KeyC("k"),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
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
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    left = KeyC("m"),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    top = KeyC("ž"),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    right = KeyC("*", color = ColorVariant.MUTED),
                    topRight = KeyC("y"),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    top = KeyC("w"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    right = KeyC("z"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topLeft = KeyC("f"),
                    left = KeyC("#", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
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
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    top = KeyC("Đ", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                    bottom = KeyC("Š"),
                    bottomRight = KeyC("V"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    bottom = KeyC("L"),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("X"),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("H", size = FontSizeVariant.LARGE),
                    top = KeyC("Ć"),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottom = KeyC("Č"),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    right = KeyC("K"),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
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
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    left = KeyC("M"),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    top = KeyC("ž"),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    right = KeyC("*", color = ColorVariant.MUTED),
                    topRight = KeyC("Y"),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    top = KeyC("W"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    right = KeyC("Z"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topLeft = KeyC("F"),
                    left = KeyC("#", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
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
