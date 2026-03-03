@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_DE_THUMBKEY_AE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("1", color = MUTED),
                    top = KeyC("•", color = MUTED),
                    topRight = KeyC("ch"),
                    left = KeyC("♥️", color = MUTED),
                    right = KeyC("ß"),
                    bottomLeft = KeyC("✓", color = MUTED),
                    bottom = KeyC("z"),
                    bottomRight = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    topLeft = KeyC("+", color = MUTED),
                    top = KeyC("2", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    left = KeyC("~", color = MUTED),
                    right = KeyC("=", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                    bottom = KeyC("l"),
                    bottomRight = KeyC(">", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    top = KeyC("ø"),
                    topRight = KeyC("3", color = MUTED),
                    left = KeyC("ö"),
                    bottomLeft = KeyC("u"),
                    bottom = KeyC("ü"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    topLeft = KeyC("4", color = MUTED),
                    top = KeyC("#", color = MUTED),
                    left = KeyC("↑", color = MUTED),
                    right = KeyC("m"),
                    bottomLeft = KeyC("↓", color = MUTED),
                    bottom = KeyC("←", color = MUTED),
                    bottomRight = KeyC("→", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    topLeft = KeyC("5", color = MUTED),
                    top = KeyC("f"),
                    topRight = KeyC("q"),
                    right = KeyC("b"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("k"),
                    bottomLeft = KeyC("v"),
                    left = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    topRight = KeyC("6", color = MUTED),
                    left = KeyC("ä"),
                    right = KeyC("å"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction =
                                ToggleCurrentWordCapitalization(
                                    true,
                                ),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("w"),
                    left = KeyC("(", color = MUTED),
                    right = KeyC("/", color = MUTED),
                    bottomLeft = KeyC("7", color = MUTED),
                    bottom = KeyC("?", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    topLeft = KeyC("x"),
                    top = KeyC("g"),
                    topRight = KeyC("j"),
                    left = KeyC("*", color = MUTED),
                    right = KeyC("'", color = MUTED),
                    bottomLeft = KeyC("8", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("æ"),
                    topLeft = KeyC("d"),
                    topRight = KeyC("€", color = MUTED),
                    left = KeyC("@", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("0", color = MUTED),
                    bottom = KeyC("!", color = MUTED),
                    bottomLeft = KeyC("9", color = MUTED),
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
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("1", color = MUTED),
                    top = KeyC("·", color = MUTED),
                    topRight = KeyC("sch"),
                    left = KeyC("★", color = MUTED),
                    right = KeyC("ẞ"),
                    bottomLeft = KeyC("×", color = MUTED),
                    bottom = KeyC("Z"),
                    bottomRight = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    topLeft = KeyC("±", color = MUTED),
                    top = KeyC("2", color = MUTED),
                    topRight = KeyC("√", color = MUTED),
                    left = KeyC("", color = MUTED),
                    right = KeyC("=", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                    bottom = KeyC("L"),
                    bottomRight = KeyC(">", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    top = KeyC("Ø"),
                    topRight = KeyC("3", color = MUTED),
                    left = KeyC("Ö"),
                    bottomLeft = KeyC("U"),
                    bottom = KeyC("Ü"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    topLeft = KeyC("4", color = MUTED),
                    top = KeyC("∆", color = MUTED),
                    left = KeyC("^", color = MUTED),
                    right = KeyC("M"),
                    bottomLeft = KeyC("|", color = MUTED),
                    bottom = KeyC("‹", color = MUTED),
                    bottomRight = KeyC("›", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
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
                    center = KeyC("A", size = LARGE),
                    right = KeyC("Å", color = MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction =
                                ToggleCurrentWordCapitalization(
                                    false,
                                ),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            action = ToggleCapsLock,
                            swipeReturnAction =
                                ToggleCurrentWordCapitalization(
                                    true,
                                ),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    top = KeyC("‽", color = MUTED),
                    topRight = KeyC("W"),
                    left = KeyC("[", color = MUTED),
                    right = KeyC("", color = MUTED),
                    bottomLeft = KeyC("7", color = MUTED),
                    bottom = KeyC("¿", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    topLeft = KeyC("X"),
                    top = KeyC("G"),
                    topRight = KeyC("J"),
                    left = KeyC("°", color = MUTED),
                    right = KeyC("\"", color = MUTED),
                    bottomLeft = KeyC("8", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    bottomRight = KeyC(";", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("Æ"),
                    topLeft = KeyC("D"),
                    topRight = KeyC("$", color = MUTED),
                    left = KeyC("™", color = MUTED),
                    right = KeyC("]", color = MUTED),
                    bottomRight = KeyC("0", color = MUTED),
                    bottom = KeyC("¡", color = MUTED),
                    bottomLeft = KeyC("9", color = MUTED),
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
        locales = listOf("en", "de"),
    )
