package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
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

val KB_EN_DE_THUMBKEY_AE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("1", color = ColorVariant.MUTED),
                    top = KeyC("•", color = ColorVariant.MUTED),
                    topRight = KeyC("ch"),
                    left = KeyC("♥️", color = ColorVariant.MUTED),
                    right = KeyC("ß"),
                    bottomLeft = KeyC("✓", color = ColorVariant.MUTED),
                    bottom = KeyC("z"),
                    bottomRight = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("+", color = ColorVariant.MUTED),
                    top = KeyC("2", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    left = KeyC("~", color = ColorVariant.MUTED),
                    right = KeyC("=", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("<", color = ColorVariant.MUTED),
                    bottom = KeyC("l"),
                    bottomRight = KeyC(">", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    top = KeyC("ø"),
                    topRight = KeyC("3", color = ColorVariant.MUTED),
                    left = KeyC("ö"),
                    bottomLeft = KeyC("u"),
                    bottom = KeyC("ü"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("4", color = ColorVariant.MUTED),
                    top = KeyC("#", color = ColorVariant.MUTED),
                    left = KeyC("↑", color = ColorVariant.MUTED),
                    right = KeyC("m"),
                    bottomLeft = KeyC("↓", color = ColorVariant.MUTED),
                    bottom = KeyC("←", color = ColorVariant.MUTED),
                    bottomRight = KeyC("→", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("h", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("5", color = ColorVariant.MUTED),
                    top = KeyC("f"),
                    topRight = KeyC("q"),
                    right = KeyC("b"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("k"),
                    bottomLeft = KeyC("v"),
                    left = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    topRight = KeyC("6", color = ColorVariant.MUTED),
                    left = KeyC("ä"),
                    right = KeyC("å"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction =
                                KeyAction.ToggleCurrentWordCapitalization(
                                    true,
                                ),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("w"),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    right = KeyC("/", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("7", color = ColorVariant.MUTED),
                    bottom = KeyC("?", color = ColorVariant.MUTED),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("x"),
                    top = KeyC("g"),
                    topRight = KeyC("j"),
                    left = KeyC("*", color = ColorVariant.MUTED),
                    right = KeyC("'", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("8", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomRight = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    top = KeyC("œ"),
                    topLeft = KeyC("d"),
                    topRight = KeyC("€", color = ColorVariant.MUTED),
                    left = KeyC("@", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("0", color = ColorVariant.MUTED),
                    bottom = KeyC("!", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("9", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_DE_THUMBKEY_AE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("1", color = ColorVariant.MUTED),
                    top = KeyC("·", color = ColorVariant.MUTED),
                    topRight = KeyC("sch"),
                    left = KeyC("★", color = ColorVariant.MUTED),
                    right = KeyC("ẞ"),
                    bottomLeft = KeyC("×", color = ColorVariant.MUTED),
                    bottom = KeyC("Z"),
                    bottomRight = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("±", color = ColorVariant.MUTED),
                    top = KeyC("2", color = ColorVariant.MUTED),
                    topRight = KeyC("√", color = ColorVariant.MUTED),
                    left = KeyC("", color = ColorVariant.MUTED),
                    right = KeyC("=", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("<", color = ColorVariant.MUTED),
                    bottom = KeyC("l"),
                    bottomRight = KeyC(">", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    top = KeyC("Ø"),
                    topRight = KeyC("3", color = ColorVariant.MUTED),
                    left = KeyC("Ö"),
                    bottomLeft = KeyC("U"),
                    bottom = KeyC("Ü"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("4", color = ColorVariant.MUTED),
                    top = KeyC("∆", color = ColorVariant.MUTED),
                    left = KeyC("^", color = ColorVariant.MUTED),
                    right = KeyC("M"),
                    bottomLeft = KeyC("|", color = ColorVariant.MUTED),
                    bottom = KeyC("‹", color = ColorVariant.MUTED),
                    bottomRight = KeyC("›", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("H", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("5"),
                    top = KeyC("F"),
                    topRight = KeyC("Q"),
                    right = KeyC("B"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("K"),
                    bottomLeft = KeyC("V"),
                    left = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    right = KeyC("Å", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction =
                                KeyAction.ToggleCurrentWordCapitalization(
                                    false,
                                ),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction =
                                KeyAction.ToggleCurrentWordCapitalization(
                                    true,
                                ),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    top = KeyC("‽", color = ColorVariant.MUTED),
                    topRight = KeyC("W"),
                    left = KeyC("[", color = ColorVariant.MUTED),
                    right = KeyC("", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("7", color = ColorVariant.MUTED),
                    bottom = KeyC("¿", color = ColorVariant.MUTED),
                    bottomRight = KeyC("", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("X"),
                    top = KeyC("G"),
                    topRight = KeyC("J"),
                    left = KeyC("°", color = ColorVariant.MUTED),
                    right = KeyC("\"", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("8", color = ColorVariant.MUTED),
                    bottom = KeyC(":", color = ColorVariant.MUTED),
                    bottomRight = KeyC(";", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    top = KeyC("Æ"),
                    topLeft = KeyC("D"),
                    topRight = KeyC("$", color = ColorVariant.MUTED),
                    left = KeyC("™", color = ColorVariant.MUTED),
                    right = KeyC("]", color = ColorVariant.MUTED),
                    bottomRight = KeyC("0", color = ColorVariant.MUTED),
                    bottom = KeyC("¡", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("9", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_DE_THUMBKEY_AE =
    KeyboardDefinition(
        title = "english deutsch thumb-key +æ",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_DE_THUMBKEY_AE_MAIN,
                shifted = KB_EN_DE_THUMBKEY_AE_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
