@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_TR_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("y", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("h"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("v"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("v"),
                        ),
                    bottom = KeyC("z"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("b"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("b"),
                        ),
                    bottom = KeyC("r"),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("s"),
                    top = KeyC("ş"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("j"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("j"),
                        ),
                    bottom = KeyC("f"),
                ),
                KeyItemC(
                    center = KeyC("k", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("p"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("p"),
                        ),
                    bottom = KeyC("g"),
                    top = KeyC("ğ"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("ı"),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ü"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("o"),
                    top = KeyC("ö"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
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

val KB_TR_TYPESPLIT_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("Y", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("H"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("V"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("V"),
                        ),
                    bottom = KeyC("Z"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("B"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("B"),
                        ),
                    bottom = KeyC("R"),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("S"),
                    top = KeyC("Ş"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("J"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("J"),
                        ),
                    bottom = KeyC("F"),
                ),
                KeyItemC(
                    center = KeyC("K", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("P"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("P"),
                        ),
                    bottom = KeyC("G"),
                    top = KeyC("Ğ"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("İ", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("I"),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Ü"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("O"),
                    top = KeyC("Ö"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
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

val KB_TR_TYPESPLIT: KeyboardDefinition =
    KeyboardDefinition(
        title = "türkçe type-split",
        modes =
            KeyboardDefinitionModes(
                main = KB_TR_TYPESPLIT_MAIN,
                shifted = KB_TR_TYPESPLIT_SHIFTED,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
