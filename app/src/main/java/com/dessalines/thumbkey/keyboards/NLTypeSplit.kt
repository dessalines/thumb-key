package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_NL_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("u", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("ú", color = ColorVariant.MUTED),
                    left = KeyC("ü", color = ColorVariant.MUTED),
                    topLeft = KeyC("ù", color = ColorVariant.MUTED),
                    bottom = KeyC(";", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("ì", color = ColorVariant.MUTED),
                    right = KeyC("ï", color = ColorVariant.MUTED),
                    topRight = KeyC("í", color = ColorVariant.MUTED),
                    bottom = KeyC(":", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("h"),
                ),
                KeyItemC(
                    center = KeyC("l", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("z"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    top = KeyC("q"),
                    bottomLeft = KeyC("ó", color = ColorVariant.MUTED),
                    right = KeyC("f"),
                    topLeft = KeyC("ò", color = ColorVariant.MUTED),
                    left = KeyC("ö", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    top = KeyC("y"),
                    bottomRight = KeyC("è", color = ColorVariant.MUTED),
                    left = KeyC("x"),
                    topRight = KeyC("é", color = ColorVariant.MUTED),
                    bottom = KeyC("c"),
                    right = KeyC("ë", color = ColorVariant.MUTED),
                ),
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("v"),
                    right = KeyC("m"),
                    bottom = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("g"),
                    left = KeyC("j"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("p", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top = KeyC("!", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    top = KeyC("?", color = ColorVariant.MUTED),
                    bottomRight = KeyC("à", color = ColorVariant.MUTED),
                    right = KeyC("ä", color = ColorVariant.MUTED),
                    topRight = KeyC("á", color = ColorVariant.MUTED),
                ),
                SPACEBAR_ALL_SYMBOLS,
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("d", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
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
                    center = KeyC("U", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("Ú", color = ColorVariant.MUTED),
                    left = KeyC("Ü", color = ColorVariant.MUTED),
                    topLeft = KeyC("Ù", color = ColorVariant.MUTED),
                    bottom = KeyC(";", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("Ì", color = ColorVariant.MUTED),
                    right = KeyC("Ï", color = ColorVariant.MUTED),
                    topRight = KeyC("Í", color = ColorVariant.MUTED),
                    bottom = KeyC(":", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("H"),
                ),
                KeyItemC(
                    center = KeyC("L", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("Z"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    top = KeyC("Q"),
                    bottomLeft = KeyC("Ó", color = ColorVariant.MUTED),
                    right = KeyC("F"),
                    topLeft = KeyC("Ò", color = ColorVariant.MUTED),
                    left = KeyC("Ö", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    top = KeyC("Y"),
                    bottomRight = KeyC("È", color = ColorVariant.MUTED),
                    left = KeyC("X"),
                    topRight = KeyC("É", color = ColorVariant.MUTED),
                    bottom = KeyC("C"),
                    right = KeyC("Ë", color = ColorVariant.MUTED),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("V"),
                    right = KeyC("M"),
                    bottom = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("G"),
                    left = KeyC("J"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("P", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top = KeyC("!", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    top = KeyC("?", color = ColorVariant.MUTED),
                    bottomRight = KeyC("À", color = ColorVariant.MUTED),
                    right = KeyC("Ä", color = ColorVariant.MUTED),
                    topRight = KeyC("Á", color = ColorVariant.MUTED),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("D", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
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
