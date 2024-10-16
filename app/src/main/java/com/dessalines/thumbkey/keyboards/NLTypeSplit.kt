@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_NL_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    bottomLeft = KeyC("ú", color = MUTED),
                    left = KeyC("ü", color = MUTED),
                    topLeft = KeyC("ù", color = MUTED),
                    bottom = KeyC(";", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    bottomRight = KeyC("ì", color = MUTED),
                    right = KeyC("ï", color = MUTED),
                    topRight = KeyC("í", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottom = KeyC("h"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    bottom = KeyC("z"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    top = KeyC("q"),
                    bottomLeft = KeyC("ó", color = MUTED),
                    right = KeyC("f"),
                    topLeft = KeyC("ò", color = MUTED),
                    left = KeyC("ö", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("y"),
                    bottomRight = KeyC("è", color = MUTED),
                    left = KeyC("x"),
                    topRight = KeyC("é", color = MUTED),
                    bottom = KeyC("c"),
                    right = KeyC("ë", color = MUTED),
                ),
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    top = KeyC("v"),
                    right = KeyC("m"),
                    bottom = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    bottom = KeyC("g"),
                    left = KeyC("j"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("p", size = LARGE),
                    top = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    top = KeyC("?", color = MUTED),
                    bottomRight = KeyC("à", color = MUTED),
                    right = KeyC("ä", color = MUTED),
                    topRight = KeyC("á", color = MUTED),
                ),
                SPACEBAR_ALL_SYMBOLS,
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    top = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    top = KeyC("b"),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_NL_TYPESPLIT_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    bottomLeft = KeyC("Ú", color = MUTED),
                    left = KeyC("Ü", color = MUTED),
                    topLeft = KeyC("Ù", color = MUTED),
                    bottom = KeyC(";", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    bottomRight = KeyC("Ì", color = MUTED),
                    right = KeyC("Ï", color = MUTED),
                    topRight = KeyC("Í", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottom = KeyC("H"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    bottom = KeyC("Z"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    top = KeyC("Q"),
                    bottomLeft = KeyC("Ó", color = MUTED),
                    right = KeyC("F"),
                    topLeft = KeyC("Ò", color = MUTED),
                    left = KeyC("Ö", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("Y"),
                    bottomRight = KeyC("È", color = MUTED),
                    left = KeyC("X"),
                    topRight = KeyC("É", color = MUTED),
                    bottom = KeyC("C"),
                    right = KeyC("Ë", color = MUTED),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    top = KeyC("V"),
                    right = KeyC("M"),
                    bottom = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    bottom = KeyC("G"),
                    left = KeyC("J"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("P", size = LARGE),
                    top = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    top = KeyC("?", color = MUTED),
                    bottomRight = KeyC("À", color = MUTED),
                    right = KeyC("Ä", color = MUTED),
                    topRight = KeyC("Á", color = MUTED),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    top = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    top = KeyC("B"),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_NL_TYPESPLIT: KeyboardDefinition =
    KeyboardDefinition(
        title = "nederlands type-split",
        modes =
            KeyboardDefinitionModes(
                main = KB_NL_TYPESPLIT_MAIN,
                shifted = KB_NL_TYPESPLIT_SHIFTED,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
