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

val KB_FR_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("à", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("à"),
                        ),
                    bottom = KeyC("z"),
                    top = KeyC("â", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("é", color = ColorVariant.MUTED),
                    left = KeyC("è", color = ColorVariant.MUTED),
                    bottom = KeyC("r"),
                    top = KeyC("ê", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("y"),
                    left = KeyC("ù", color = ColorVariant.MUTED),
                    bottom = KeyC("u"),
                    top = KeyC("û", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ô", color = ColorVariant.MUTED),
                    left = KeyC("p"),
                    bottom = KeyC("o"),
                    top = KeyC("î", color = ColorVariant.MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("q"),
                    top = KeyC("œ", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("d", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("f"),
                        ),
                    left = KeyC("f"),
                    bottom = KeyC("g"),
                    top = KeyC("ë", color = ColorVariant.MUTED),
                ),
                SPACEBAR_FRENCH_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("l", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("j"),
                    left = KeyC("k"),
                    bottom = KeyC("h"),
                    top = KeyC("ü", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("m", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top = KeyC("ï", color = ColorVariant.MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("c", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("w"),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("w"),
                        ),
                    bottom = KeyC("x"),
                    top = KeyC("ç", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("v", size = FontSizeVariant.LARGE),
                ),
                SPACEBAR_FRENCH_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("b", size = FontSizeVariant.LARGE),
                ),
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("?", color = ColorVariant.MUTED),
                    left = KeyC("!", color = ColorVariant.MUTED),
                    bottom = KeyC(":", color = ColorVariant.MUTED),
                    top = KeyC(";", color = ColorVariant.MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_TYPESPLIT_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("À", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("À"),
                        ),
                    bottom = KeyC("Z"),
                    top = KeyC("Â", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("É", color = ColorVariant.MUTED),
                    left = KeyC("È", color = ColorVariant.MUTED),
                    bottom = KeyC("R"),
                    top = KeyC("Ê", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("Y"),
                    left = KeyC("Ù", color = ColorVariant.MUTED),
                    bottom = KeyC("U"),
                    top = KeyC("Û", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("Ô", color = ColorVariant.MUTED),
                    left = KeyC("P"),
                    bottom = KeyC("O"),
                    top = KeyC("Î", color = ColorVariant.MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("Q"),
                    top = KeyC("Œ", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("D", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("F"),
                        ),
                    left = KeyC("F"),
                    bottom = KeyC("G"),
                    top = KeyC("Ë", color = ColorVariant.MUTED),
                ),
                SPACEBAR_FRENCH_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("L", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("J"),
                    left = KeyC("K"),
                    bottom = KeyC("H"),
                    top = KeyC("Ü", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("M", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top = KeyC("Ï", color = ColorVariant.MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("C", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("W"),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("W"),
                        ),
                    bottom = KeyC("X"),
                    top = KeyC("Ç", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("V", size = FontSizeVariant.LARGE),
                ),
                SPACEBAR_FRENCH_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("B", size = FontSizeVariant.LARGE),
                ),
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("?", color = ColorVariant.MUTED),
                    left = KeyC("!", color = ColorVariant.MUTED),
                    bottom = KeyC(":", color = ColorVariant.MUTED),
                    top = KeyC(";", color = ColorVariant.MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_TYPESPLIT: KeyboardDefinition =
    KeyboardDefinition(
        title = "français type-split",
        modes =
            KeyboardDefinitionModes(
                main = KB_FR_TYPESPLIT_MAIN,
                shifted = KB_FR_TYPESPLIT_SHIFTED,
                numeric = FRENCH_TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
