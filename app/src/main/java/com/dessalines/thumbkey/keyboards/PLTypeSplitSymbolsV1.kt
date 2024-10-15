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
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ę", color = ColorVariant.MUTED),
                    left = KeyC("{", color = ColorVariant.MUTED),
                    bottom = KeyC("w"),
                    top = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("\\"),
                    bottom = KeyC("t"),
                    left = KeyC("/"),
                    right = KeyC("®", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("y"),
                    left = KeyC("%", color = ColorVariant.MUTED),
                    bottom = KeyC("u"),
                    top = KeyC("^", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("}", color = ColorVariant.MUTED),
                    left = KeyC("ó", color = ColorVariant.MUTED),
                    bottom = KeyC("p"),
                    top = KeyC("|", color = ColorVariant.MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ą", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    bottom = KeyC("@", color = ColorVariant.MUTED),
                    top = KeyC("#", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("`"),
                    left = KeyC("ś", color = ColorVariant.MUTED),
                    top = KeyC("\"", color = ColorVariant.MUTED),
                    bottom = KeyC("~"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("d", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("h"),
                    bottom = KeyC("g", color = ColorVariant.MUTED),
                    top = KeyC("f", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("k", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottom = KeyC("l"),
                    top = KeyC("ł"),
                    left = KeyC("j", color = ColorVariant.MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("z", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    right = KeyC("ź", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ź"),
                        ),
                    bottom = KeyC("ż", color = ColorVariant.MUTED),
                    top = KeyC("x"),
                    topLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("<", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("c", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("©", color = ColorVariant.MUTED),
                    left = KeyC("ć", color = ColorVariant.MUTED),
                    bottom = KeyC("b"),
                    top = KeyC("v"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("ń", color = ColorVariant.MUTED),
                    left = KeyC("&", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("m", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left = KeyC("!", color = ColorVariant.MUTED),
                    bottom = KeyC(":", color = ColorVariant.MUTED),
                    top = KeyC(";", color = ColorVariant.MUTED),
                    right = KeyC("?", color = ColorVariant.MUTED),
                    topRight = KeyC("]", color = ColorVariant.MUTED),
                    bottomRight = KeyC(">", color = ColorVariant.MUTED),
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
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("Ę", color = ColorVariant.MUTED),
                    left = KeyC("{", color = ColorVariant.MUTED),
                    bottom = KeyC("W"),
                    top = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("\\"),
                    bottom = KeyC("T"),
                    left = KeyC("/"),
                    right = KeyC("®", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("Y"),
                    left = KeyC("%", color = ColorVariant.MUTED),
                    bottom = KeyC("U"),
                    top = KeyC("^", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("}", color = ColorVariant.MUTED),
                    left = KeyC("Ó", color = ColorVariant.MUTED),
                    bottom = KeyC("P"),
                    top = KeyC("|", color = ColorVariant.MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("Ą", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    bottom = KeyC("@", color = ColorVariant.MUTED),
                    top = KeyC("#", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("`"),
                    left = KeyC("Ś", color = ColorVariant.MUTED),
                    top = KeyC("\"", color = ColorVariant.MUTED),
                    bottom = KeyC("~"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("D", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("H"),
                    bottom = KeyC("G", color = ColorVariant.MUTED),
                    top = KeyC("F", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("K", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottom = KeyC("L"),
                    top = KeyC("Ł"),
                    left = KeyC("J", color = ColorVariant.MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Z", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    right = KeyC("Ź", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("Ź"),
                        ),
                    bottom = KeyC("Ż", color = ColorVariant.MUTED),
                    top = KeyC("X"),
                    topLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("<", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("C", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("©", color = ColorVariant.MUTED),
                    left = KeyC("Ć", color = ColorVariant.MUTED),
                    bottom = KeyC("B"),
                    top = KeyC("V"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("Ń", color = ColorVariant.MUTED),
                    left = KeyC("&", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("M", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left = KeyC("!", color = ColorVariant.MUTED),
                    bottom = KeyC(":", color = ColorVariant.MUTED),
                    top = KeyC(";", color = ColorVariant.MUTED),
                    right = KeyC("?", color = ColorVariant.MUTED),
                    topRight = KeyC("]", color = ColorVariant.MUTED),
                    bottomRight = KeyC(">", color = ColorVariant.MUTED),
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
