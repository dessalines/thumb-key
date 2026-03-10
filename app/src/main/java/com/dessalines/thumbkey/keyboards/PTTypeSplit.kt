@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_PT_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("é", color = MUTED),
                    left = KeyC("ê", color = MUTED),
                    bottom = KeyC("q"),
                    top = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("y"),
                        ),
                    left = KeyC("y"),
                    bottom = KeyC("t"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("í", color = MUTED),
                    left = KeyC("ú", color = MUTED),
                    bottom = KeyC("u"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ô", color = MUTED),
                    left = KeyC("ó", color = MUTED),
                    bottom = KeyC("p"),
                    top = KeyC("õ", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("á", color = MUTED),
                    left = KeyC("â", color = MUTED),
                    bottom = KeyC("ã", color = MUTED),
                    top = KeyC("à", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("f"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("f"),
                        ),
                    bottom = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("j"),
                        ),
                    left = KeyC("j"),
                    bottom = KeyC("h"),
                    top = KeyC("k"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("z"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("z"),
                        ),
                    bottom = KeyC("ç", color = MUTED),
                    top = KeyC("x"),
                ),
                KeyItemC(
                    center = KeyC("v", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("b"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
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

val KB_PT_TYPESPLIT_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("É", color = MUTED),
                    left = KeyC("Ê", color = MUTED),
                    bottom = KeyC("Q"),
                    top = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("Y"),
                        ),
                    left = KeyC("Y"),
                    bottom = KeyC("T"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Í", color = MUTED),
                    left = KeyC("Ú", color = MUTED),
                    bottom = KeyC("U"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Ô", color = MUTED),
                    left = KeyC("Ó", color = MUTED),
                    bottom = KeyC("P"),
                    top = KeyC("Õ", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Á", color = MUTED),
                    left = KeyC("Â", color = MUTED),
                    bottom = KeyC("Ã", color = MUTED),
                    top = KeyC("À", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("F"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("F"),
                        ),
                    bottom = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("J"),
                        ),
                    left = KeyC("J"),
                    bottom = KeyC("H"),
                    top = KeyC("K"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Z"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("Z"),
                        ),
                    bottom = KeyC("Ç", color = MUTED),
                    top = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("V", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("B"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
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

val KB_PT_TYPESPLIT: KeyboardDefinition =
    KeyboardDefinition(
        title = "português type-split",
        modes =
            KeyboardDefinitionModes(
                main = KB_PT_TYPESPLIT_MAIN,
                shifted = KB_PT_TYPESPLIT_SHIFTED,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
