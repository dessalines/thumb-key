@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_PL_TYPESPLIT_V2_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    right = KeyC("ę", color = MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("ę"),
                        ),
                    bottom = KeyC("w"),
                    top = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    bottom = KeyC("t"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    right = KeyC("y"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("y"),
                        ),
                    bottom = KeyC("u"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("ó"),
                        ),
                    left = KeyC("ó", color = MUTED),
                    bottom = KeyC("p"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    right = KeyC("ą", color = MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("ą"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    right = KeyC("f"),
                    left = KeyC("ś", color = MUTED),
                    top =
                        KeyC(
                            display = null,
                            action = CommitText("g"),
                        ),
                    bottom = KeyC("g"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    right = KeyC("h"),
                    left = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("k", size = LARGE),
                    bottom = KeyC("l"),
                    top = KeyC("ł"),
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
                ),
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("ć"),
                        ),
                    left = KeyC("ć", color = MUTED),
                    bottom = KeyC("b"),
                    top = KeyC("v"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("ń", color = MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("ń"),
                        ),
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

val KB_PL_TYPESPLIT_V2_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    right = KeyC("Ę", color = MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("Ę"),
                        ),
                    bottom = KeyC("W"),
                    top = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    bottom = KeyC("T"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    right = KeyC("Y"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("Y"),
                        ),
                    bottom = KeyC("U"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("Ó"),
                        ),
                    left = KeyC("Ó", color = MUTED),
                    bottom = KeyC("P"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    right = KeyC("Ą", color = MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("Ą"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    right = KeyC("F"),
                    left = KeyC("Ś", color = MUTED),
                    top =
                        KeyC(
                            display = null,
                            action = CommitText("G"),
                        ),
                    bottom = KeyC("G"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    right = KeyC("H"),
                    left = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("K", size = LARGE),
                    bottom = KeyC("L"),
                    top = KeyC("Ł"),
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
                ),
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("Ć"),
                        ),
                    left = KeyC("Ć", color = MUTED),
                    bottom = KeyC("B"),
                    top = KeyC("V"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("Ń", color = MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("Ń"),
                        ),
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

val KB_PL_TYPESPLIT_V2: KeyboardDefinition =
    KeyboardDefinition(
        title = "polski type-split v2",
        modes =
            KeyboardDefinitionModes(
                main = KB_PL_TYPESPLIT_V2_MAIN,
                shifted = KB_PL_TYPESPLIT_V2_SHIFTED,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
