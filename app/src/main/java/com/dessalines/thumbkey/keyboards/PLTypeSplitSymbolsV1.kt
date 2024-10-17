@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_PL_TYPESPLIT_SYMBOLS_V1_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    right = KeyC("ę", color = MUTED),
                    left = KeyC("{", color = MUTED),
                    bottom = KeyC("w"),
                    top = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    top = KeyC("\\"),
                    bottom = KeyC("t"),
                    left = KeyC("/"),
                    right = KeyC("®", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    right = KeyC("y"),
                    left = KeyC("%", color = MUTED),
                    bottom = KeyC("u"),
                    top = KeyC("^", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    right = KeyC("}", color = MUTED),
                    left = KeyC("ó", color = MUTED),
                    bottom = KeyC("p"),
                    top = KeyC("|", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    right = KeyC("ą", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottom = KeyC("@", color = MUTED),
                    top = KeyC("#", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    right = KeyC("`"),
                    left = KeyC("ś", color = MUTED),
                    top = KeyC("\"", color = MUTED),
                    bottom = KeyC("~"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    right = KeyC("h"),
                    bottom = KeyC("g", color = MUTED),
                    top = KeyC("f", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("k", size = LARGE),
                    right = KeyC(")", color = MUTED),
                    bottom = KeyC("l"),
                    top = KeyC("ł"),
                    left = KeyC("j", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("z", size = LARGE),
                    right = KeyC("ź", color = MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("ź"),
                        ),
                    bottom = KeyC("ż", color = MUTED),
                    top = KeyC("x"),
                    topLeft = KeyC("[", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    right = KeyC("©", color = MUTED),
                    left = KeyC("ć", color = MUTED),
                    bottom = KeyC("b"),
                    top = KeyC("v"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("ń", color = MUTED),
                    left = KeyC("&", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    left = KeyC("!", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    top = KeyC(";", color = MUTED),
                    right = KeyC("?", color = MUTED),
                    topRight = KeyC("]", color = MUTED),
                    bottomRight = KeyC(">", color = MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                BACKSPACE_TYPESPLIT_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PL_TYPESPLIT_SYMBOLS_V1_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    right = KeyC("Ę", color = MUTED),
                    left = KeyC("{", color = MUTED),
                    bottom = KeyC("W"),
                    top = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    top = KeyC("\\"),
                    bottom = KeyC("T"),
                    left = KeyC("/"),
                    right = KeyC("®", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    right = KeyC("Y"),
                    left = KeyC("%", color = MUTED),
                    bottom = KeyC("U"),
                    top = KeyC("^", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    right = KeyC("}", color = MUTED),
                    left = KeyC("Ó", color = MUTED),
                    bottom = KeyC("P"),
                    top = KeyC("|", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    right = KeyC("Ą", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottom = KeyC("@", color = MUTED),
                    top = KeyC("#", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    right = KeyC("`"),
                    left = KeyC("Ś", color = MUTED),
                    top = KeyC("\"", color = MUTED),
                    bottom = KeyC("~"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    right = KeyC("H"),
                    bottom = KeyC("G", color = MUTED),
                    top = KeyC("F", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("K", size = LARGE),
                    right = KeyC(")", color = MUTED),
                    bottom = KeyC("L"),
                    top = KeyC("Ł"),
                    left = KeyC("J", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Z", size = LARGE),
                    right = KeyC("Ź", color = MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("Ź"),
                        ),
                    bottom = KeyC("Ż", color = MUTED),
                    top = KeyC("X"),
                    topLeft = KeyC("[", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    right = KeyC("©", color = MUTED),
                    left = KeyC("Ć", color = MUTED),
                    bottom = KeyC("B"),
                    top = KeyC("V"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("Ń", color = MUTED),
                    left = KeyC("&", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    left = KeyC("!", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    top = KeyC(";", color = MUTED),
                    right = KeyC("?", color = MUTED),
                    topRight = KeyC("]", color = MUTED),
                    bottomRight = KeyC(">", color = MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PL_TYPESPLIT_SYMBOLS_V1: KeyboardDefinition =
    KeyboardDefinition(
        title = "polski symbols type-split v1",
        modes =
            KeyboardDefinitionModes(
                main = KB_PL_TYPESPLIT_SYMBOLS_V1_MAIN,
                shifted = KB_PL_TYPESPLIT_SYMBOLS_V1_SHIFTED,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
