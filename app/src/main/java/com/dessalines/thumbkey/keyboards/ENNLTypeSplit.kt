@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_NL_TYPESPLIT_MAIN =
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
                    center = KeyC("o", size = LARGE),
                    bottomRight = KeyC("ò", color = MUTED),
                    right = KeyC("ö", color = MUTED),
                    topRight = KeyC("ó", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    bottom = KeyC("j"),
                    bottomLeft = KeyC("f")
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    bottomLeft = KeyC("í", color = MUTED),
                    right = KeyC("y"),
                    topLeft = KeyC("ì", color = MUTED),
                    left = KeyC("ï", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    bottomRight = KeyC("è", color = MUTED),
                    topRight = KeyC("é", color = MUTED),
                    right = KeyC("ë", color = MUTED),
                ),
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    top = KeyC("h"),
                    right = KeyC("m"),
                    bottom = KeyC("p"),
                    topRight = KeyC("b"),
                    bottomRight = KeyC("w")
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    left = KeyC("g"),
                    top = KeyC("z"),
                    bottomLeft = KeyC("v"),
                    topLeft = KeyC("k"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("q", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
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
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("x"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_NL_TYPESPLIT_SHIFTED =
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
                    center = KeyC("O", size = LARGE),
                    bottomRight = KeyC("Ò", color = MUTED),
                    right = KeyC("Ö", color = MUTED),
                    topRight = KeyC("Ó", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    bottom = KeyC("J"),
                    bottomLeft = KeyC("F")
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    bottomLeft = KeyC("Í", color = MUTED),
                    right = KeyC("Y"),
                    topLeft = KeyC("Ì", color = MUTED),
                    left = KeyC("Ï", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    bottomRight = KeyC("È", color = MUTED),
                    topRight = KeyC("É", color = MUTED),
                    right = KeyC("Ë", color = MUTED),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    top = KeyC("H"),
                    right = KeyC("M"),
                    bottom = KeyC("P"),
                    topRight = KeyC("B"),
                    bottomRight = KeyC("W")
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    left = KeyC("G"),
                    top = KeyC("Z"),
                    bottomLeft = KeyC("V"),
                    topLeft = KeyC("K"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Q", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
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
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_NL_TYPESPLIT: KeyboardDefinition =
    KeyboardDefinition(
        title = "english nederlands type-split",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_NL_TYPESPLIT_MAIN,
                shifted = KB_EN_NL_TYPESPLIT_SHIFTED,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
