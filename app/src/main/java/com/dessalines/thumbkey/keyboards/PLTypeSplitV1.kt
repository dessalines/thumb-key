package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_PL_TYPESPLIT_V1_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ę", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ę"),
                        ),
                    bottom = KeyC("w"),
                    top = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("t"),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("y"),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("y"),
                        ),
                    bottom = KeyC("u"),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ó"),
                        ),
                    left = KeyC("ó", color = ColorVariant.MUTED),
                    bottom = KeyC("p"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("ą", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ą"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ś"),
                        ),
                    left = KeyC("ś", color = ColorVariant.MUTED),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("d", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("h"),
                    top = KeyC("f"),
                    bottom = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("k", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("l"),
                    top = KeyC("ł"),
                    left = KeyC("j"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("z", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ź", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ź"),
                        ),
                    bottom = KeyC("ż", color = ColorVariant.MUTED),
                    top = KeyC("x"),
                ),
                KeyItemC(
                    center = KeyC("c", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ć"),
                        ),
                    left = KeyC("ć", color = ColorVariant.MUTED),
                    bottom = KeyC("b"),
                    top = KeyC("v"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("ń", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ń"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("m", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("?", color = ColorVariant.MUTED),
                    left = KeyC("!", color = ColorVariant.MUTED),
                    bottom = KeyC(":", color = ColorVariant.MUTED),
                    top = KeyC(";", color = ColorVariant.MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                BACKSPACE_TYPESPLIT_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PL_TYPESPLIT_V1_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("Ę", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("Ę"),
                        ),
                    bottom = KeyC("W"),
                    top = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("T"),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("Y"),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("Y"),
                        ),
                    bottom = KeyC("U"),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("Ó"),
                        ),
                    left = KeyC("Ó", color = ColorVariant.MUTED),
                    bottom = KeyC("P"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("Ą", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("Ą"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("Ś"),
                        ),
                    left = KeyC("Ś", color = ColorVariant.MUTED),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("D", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("H"),
                    top = KeyC("F"),
                    bottom = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("K", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("L"),
                    top = KeyC("Ł"),
                    left = KeyC("J"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Z", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("Ź", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("Ź"),
                        ),
                    bottom = KeyC("Ż", color = ColorVariant.MUTED),
                    top = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("C", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("Ć"),
                        ),
                    left = KeyC("Ć", color = ColorVariant.MUTED),
                    bottom = KeyC("B"),
                    top = KeyC("V"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("Ń", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("Ń"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("M", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("?", color = ColorVariant.MUTED),
                    left = KeyC("!", color = ColorVariant.MUTED),
                    bottom = KeyC(":", color = ColorVariant.MUTED),
                    top = KeyC(";", color = ColorVariant.MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PL_TYPESPLIT_V1: KeyboardDefinition =
    KeyboardDefinition(
        title = "polski type-split v1",
        modes =
            KeyboardDefinitionModes(
                main = KB_PL_TYPESPLIT_V1_MAIN,
                shifted = KB_PL_TYPESPLIT_V1_SHIFTED,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
