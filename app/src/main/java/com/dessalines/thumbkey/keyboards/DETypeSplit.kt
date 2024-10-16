@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_DE_TYPESPLIT_MAIN =
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
                    center = KeyC("r", size = LARGE),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    right = KeyC("z"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("z"),
                        ),
                    bottom = KeyC("u"),
                    top = KeyC("ü", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("p"),
                        ),
                    left = KeyC("p"),
                    bottom = KeyC("o"),
                    top = KeyC("ö", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    bottom =
                        KeyC(
                            display = null,
                            action = CommitText("ä"),
                        ),
                    top = KeyC("ä", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottom = KeyC("ß", color = MUTED),
                    top =
                        KeyC(
                            display = null,
                            action = CommitText("ß"),
                        ),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    right = KeyC("f"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("f"),
                        ),
                    bottom = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("k"),
                        ),
                    left = KeyC("k"),
                    bottom = KeyC("l"),
                    top = KeyC("j"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    right = KeyC("x"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("x"),
                        ),
                    bottom = KeyC("y"),
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

val KB_DE_TYPESPLIT_SHIFTED =
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
                    center = KeyC("R", size = LARGE),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    right = KeyC("Z"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("Z"),
                        ),
                    bottom = KeyC("U"),
                    top = KeyC("Ü", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("P"),
                        ),
                    left = KeyC("P"),
                    bottom = KeyC("O"),
                    top = KeyC("Ö", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    bottom =
                        KeyC(
                            display = null,
                            action = CommitText("Ä"),
                        ),
                    top = KeyC("Ä", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottom = KeyC("ẞ", color = MUTED),
                    top =
                        KeyC(
                            display = null,
                            action = CommitText("ẞ"),
                        ),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    right = KeyC("F"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("F"),
                        ),
                    bottom = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("K"),
                        ),
                    left = KeyC("K"),
                    bottom = KeyC("L"),
                    top = KeyC("J"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    right = KeyC("X"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("X"),
                        ),
                    bottom = KeyC("Y"),
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

val KB_DE_TYPESPLIT: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch type-split",
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_TYPESPLIT_MAIN,
                shifted = KB_DE_TYPESPLIT_SHIFTED,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
