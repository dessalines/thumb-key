@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_IT_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    right = KeyC("g"),
                    left = KeyC("h"),
                    bottom = KeyC("gh", color = MUTED),
                    top = KeyC("f"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    right = KeyC("ò", color = MUTED),
                    left = KeyC("@", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    right = KeyC("è", color = MUTED),
                    left = KeyC("é", color = MUTED),
                    top = KeyC("ə", color = MUTED),
                    bottom = KeyC("ɜ", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
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
                    right = KeyC("ù", color = MUTED),
                    left = KeyC("qu", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    right = KeyC("à", color = MUTED),
                    left = KeyC(";", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    right = KeyC("j"),
                    bottom = KeyC("y"),
                    top = KeyC("x"),
                ),
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    right = KeyC("d"),
                    left = KeyC("b"),
                    bottom = KeyC("ch", color = MUTED),
                    top = KeyC("k"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("p", size = LARGE),
                    top = KeyC("q"),
                    right = KeyC("?", color = MUTED),
                    left = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
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
                    right = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    right = KeyC("G"),
                    left = KeyC("H"),
                    bottom = KeyC("Gh", color = MUTED),
                    top = KeyC("F"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    right = KeyC("Ò", color = MUTED),
                    left = KeyC("@", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    right = KeyC("È", color = MUTED),
                    left = KeyC("É", color = MUTED),
                    top = KeyC("3", color = MUTED),
                    bottom = KeyC("Ǝ", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
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
                    right = KeyC("Ù", color = MUTED),
                    left = KeyC("Qu", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    right = KeyC("À", color = MUTED),
                    left = KeyC(";", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    right = KeyC("J"),
                    bottom = KeyC("Y"),
                    top = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    right = KeyC("D"),
                    left = KeyC("B"),
                    bottom = KeyC("Ch", color = MUTED),
                    top = KeyC("K"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("P", size = LARGE),
                    top = KeyC("Q"),
                    right = KeyC("?", color = MUTED),
                    left = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
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
        modes =
            KeyboardDefinitionModes(
                main = KB_IT_TYPESPLIT_MAIN,
                shifted = KB_IT_TYPESPLIT_SHIFTED,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
