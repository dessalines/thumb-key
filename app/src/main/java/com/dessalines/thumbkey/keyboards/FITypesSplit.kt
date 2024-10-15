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

val KB_FI_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("c"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("c"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("j"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("m"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("z"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("z"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("d"),
                        ),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("y"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText(";"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText(";"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("b"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("q"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("v"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("k"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("w"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("w"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("p"),
                        ),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("u"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("!"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("g"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("x"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("r"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("l"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("f"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("f"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("h"),
                        ),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ö"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("å"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("å"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ä"),
                            color = ColorVariant.MUTED,
                        ),
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
                    center =
                        KeyC(
                            action = KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("C"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("C"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("J"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("M"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Z"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("Z"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("D"),
                        ),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("Y"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText(";"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText(";"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("B"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Q"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("V"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("K"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("W"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("W"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("P"),
                        ),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("U"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("!"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("G"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("X"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("R"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("L"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("F"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("F"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("H"),
                        ),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ö"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("Å"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Å"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ä"),
                            color = ColorVariant.MUTED,
                        ),
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
