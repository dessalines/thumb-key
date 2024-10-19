@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_FI_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    right = KeyC("c"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("c"),
                        ),
                    bottom = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    right = KeyC("z"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("z"),
                        ),
                    bottom = KeyC("d"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("y", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText(";"),
                        ),
                    left = KeyC(";"),
                    bottom = KeyC(":"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    right = KeyC("b"),
                    left = KeyC("q"),
                    bottom = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("k", size = LARGE),
                    right = KeyC("w"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("w"),
                        ),
                    bottom = KeyC("p"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("!"),
                        ),
                    left = KeyC("!"),
                    bottom = KeyC("?"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("g"),
                    left = KeyC("x"),
                    bottom = KeyC("r"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    right = KeyC("f"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("f"),
                        ),
                    bottom = KeyC("h"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    bottom = KeyC("ö"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("å"),
                            color = MUTED,
                        ),
                    left = KeyC("å", color = MUTED),
                    bottom = KeyC("ä", color = MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FI_TYPESPLIT_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    right = KeyC("C"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("C"),
                        ),
                    bottom = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    right = KeyC("Z"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("Z"),
                        ),
                    bottom = KeyC("D"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("Y", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText(";"),
                        ),
                    left = KeyC(";"),
                    bottom = KeyC(":"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    right = KeyC("B"),
                    left = KeyC("Q"),
                    bottom = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("K", size = LARGE),
                    right = KeyC("W"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("W"),
                        ),
                    bottom = KeyC("P"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("!"),
                        ),
                    left = KeyC("!"),
                    bottom = KeyC("?"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("G"),
                    left = KeyC("X"),
                    bottom = KeyC("R"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    right = KeyC("F"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("F"),
                        ),
                    bottom = KeyC("H"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    bottom = KeyC("Ö"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("Å"),
                            color = MUTED,
                        ),
                    left = KeyC("Å", color = MUTED),
                    bottom = KeyC("Ä", color = MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FI_TYPESPLIT: KeyboardDefinition =
    KeyboardDefinition(
        title = "suomi type-split",
        modes =
            KeyboardDefinitionModes(
                main = KB_FI_TYPESPLIT_MAIN,
                shifted = KB_FI_TYPESPLIT_SHIFTED,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
