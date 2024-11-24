@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_HU_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    right = KeyC("q"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("q"),
                        ),
                    bottom = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    bottom = KeyC("r"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    right = KeyC("z"),
                    left = KeyC("ö"),
                    bottom = KeyC("u"),
                    top = KeyC("ü"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    right = KeyC("ú"),
                    left = KeyC("ő"),
                    bottom = KeyC("p"),
                    top = KeyC("ó"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("f"),
                        ),
                    left = KeyC("f"),
                    bottom = KeyC("d"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("j"),
                        ),
                    right = KeyC("j"),
                    bottom = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    left = KeyC("é"),
                    top = KeyC("á"),
                    right = KeyC("ű"),
                    bottom = KeyC("k"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    right = KeyC("y"),
                    left = KeyC("í"),
                    bottom = KeyC("x"),
                ),
                KeyItemC(
                    center = KeyC("b", size = LARGE),
                    bottom = KeyC("v"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    right = KeyC("?", color = MUTED),
                    left = KeyC("!", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    top = KeyC(";", color = MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_HU_TYPESPLIT_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    right = KeyC("Q"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("Q"),
                        ),
                    bottom = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    bottom = KeyC("R"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    right = KeyC("Z"),
                    left = KeyC("Ö"),
                    bottom = KeyC("U"),
                    top = KeyC("Ü"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    right = KeyC("Ú"),
                    left = KeyC("Ő"),
                    bottom = KeyC("P"),
                    top = KeyC("Ó"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("F"),
                        ),
                    left = KeyC("F"),
                    bottom = KeyC("D"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    right = KeyC("J"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("J"),
                        ),
                    bottom = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    left = KeyC("É"),
                    top = KeyC("Á"),
                    right = KeyC("Ű"),
                    bottom = KeyC("K"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    right = KeyC("Y"),
                    left = KeyC("Í"),
                    bottom = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("B", size = LARGE),
                    bottom = KeyC("V"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    right = KeyC("?", color = MUTED),
                    left = KeyC("!", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    top = KeyC(";", color = MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_HU_TYPESPLIT: KeyboardDefinition =
    KeyboardDefinition(
        title = "magyar type-split",
        modes =
            KeyboardDefinitionModes(
                main = KB_HU_TYPESPLIT_MAIN,
                shifted = KB_HU_TYPESPLIT_SHIFTED,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
