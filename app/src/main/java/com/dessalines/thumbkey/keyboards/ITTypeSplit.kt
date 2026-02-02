@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_IT_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("g"),
                    left = KeyC("h"),
                    bottom = KeyC("gh", color = MUTED),
                    top = KeyC("f"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("ò", color = MUTED),
                    left = KeyC("@", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("è", color = MUTED),
                    left = KeyC("é", color = MUTED),
                    top = KeyC("ə", color = MUTED),
                    bottom = KeyC("ɜ", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("v"),
                    top = KeyC("w"),
                    bottom = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("ù", color = MUTED),
                    left = KeyC("qu", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("à", color = MUTED),
                    left = KeyC(";", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("j"),
                    bottom = KeyC("y"),
                    top = KeyC("x"),
                ),
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("d"),
                    left = KeyC("b"),
                    bottom = KeyC("ch", color = MUTED),
                    top = KeyC("k"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("p", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("q"),
                    right = KeyC("?", color = MUTED),
                    left = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("ì", color = MUTED),
                    left = KeyC(":", color = MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_IT_TYPESPLIT_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("G"),
                    left = KeyC("H"),
                    bottom = KeyC("Gh", color = MUTED),
                    top = KeyC("F"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("Ò", color = MUTED),
                    left = KeyC("@", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("È", color = MUTED),
                    left = KeyC("É", color = MUTED),
                    top = KeyC("3", color = MUTED),
                    bottom = KeyC("Ǝ", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("V"),
                    top = KeyC("W"),
                    bottom = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("Ù", color = MUTED),
                    left = KeyC("Qu", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("À", color = MUTED),
                    left = KeyC(";", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("J"),
                    bottom = KeyC("Y"),
                    top = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("D"),
                    left = KeyC("B"),
                    bottom = KeyC("Ch", color = MUTED),
                    top = KeyC("K"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("P", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Q"),
                    right = KeyC("?", color = MUTED),
                    left = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("Ì", color = MUTED),
                    left = KeyC(":", color = MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_IT_TYPESPLIT: KeyboardDefinition =
    KeyboardDefinition(
        title = "italiano type-split",
        locales = listOf("it"),
        modes =
            KeyboardDefinitionModes(
                main = KB_IT_TYPESPLIT_MAIN,
                shifted = KB_IT_TYPESPLIT_SHIFTED,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
