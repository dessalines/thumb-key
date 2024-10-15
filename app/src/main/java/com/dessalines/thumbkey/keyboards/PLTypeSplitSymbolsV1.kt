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

val KB_PL_TYPESPLIT_SYMBOLS_V1_MAIN =
    KeyboardC(
        listOf(
            listOf(
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
                            action = KeyAction.CommitText("ę"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("{"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("w"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("q"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            action = KeyAction.CommitText("\\"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("t"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("/"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("®"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
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
                            action = KeyAction.CommitText("y"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("%"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("u"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("^"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("}"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ó"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("p"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("|"),
                            color = ColorVariant.MUTED,
                        ),
                ),
            ),
            listOf(
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
                            action = KeyAction.CommitText("ą"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("#"),
                            color = ColorVariant.MUTED,
                        ),
                ),
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
                            action = KeyAction.CommitText("`"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ś"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("~"),
                        ),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("d"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("h"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("g"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("f"),
                            color = ColorVariant.MUTED,
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
                            action = KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("l"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ł"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("j"),
                            color = ColorVariant.MUTED,
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("z"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ź"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ź"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ż"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("x"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("["),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("<"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("c"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("©"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ć"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("b"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("v"),
                        ),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ń"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("&"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("m"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("]"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(">"),
                            color = ColorVariant.MUTED,
                        ),
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
                    center =
                        KeyC(
                            action = KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ę"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("{"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("W"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Q"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            action = KeyAction.CommitText("\\"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("T"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("/"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("®"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
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
                            action = KeyAction.CommitText("Y"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("%"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("U"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("^"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("}"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ó"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("P"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("|"),
                            color = ColorVariant.MUTED,
                        ),
                ),
            ),
            listOf(
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
                            action = KeyAction.CommitText("Ą"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("#"),
                            color = ColorVariant.MUTED,
                        ),
                ),
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
                            action = KeyAction.CommitText("`"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ś"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("~"),
                        ),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("D"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("H"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("G"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("F"),
                            color = ColorVariant.MUTED,
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
                            action = KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("L"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ł"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("J"),
                            color = ColorVariant.MUTED,
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("Z"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ź"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("Ź"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ż"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("X"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("["),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("<"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("C"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("©"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ć"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("B"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("V"),
                        ),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ń"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("&"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("M"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("]"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(">"),
                            color = ColorVariant.MUTED,
                        ),
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
