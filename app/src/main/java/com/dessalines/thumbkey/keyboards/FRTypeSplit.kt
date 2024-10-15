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
                    center =
                        KeyC(
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("à"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("à"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("z"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("â"),
                            color = ColorVariant.MUTED,
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
                            action = KeyAction.CommitText("é"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("è"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("r"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ê"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM_ALT,
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
                            action = KeyAction.CommitText("y"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ù"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("u"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("û"),
                            color = ColorVariant.MUTED,
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
                            action = KeyAction.CommitText("ô"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("p"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("o"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("î"),
                            color = ColorVariant.MUTED,
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("q"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("œ"),
                            color = ColorVariant.MUTED,
                        ),
                ),
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
                            display = null,
                            action = KeyAction.CommitText("f"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("f"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("g"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ë"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                SPACEBAR_FRENCH_TYPESPLIT_MIDDLE_KEY_ITEM,
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
                            action = KeyAction.CommitText("j"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("k"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("h"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ü"),
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
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ï"),
                            color = ColorVariant.MUTED,
                        ),
                ),
            ),
            listOf(
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
                            action = KeyAction.CommitText("w"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("w"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("x"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ç"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("v"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                SPACEBAR_FRENCH_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("b"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
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
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
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
                    center =
                        KeyC(
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("À"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("À"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Z"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Â"),
                            color = ColorVariant.MUTED,
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
                            action = KeyAction.CommitText("É"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("È"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("R"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ê"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM_ALT,
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
                            action = KeyAction.CommitText("Y"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ù"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("U"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Û"),
                            color = ColorVariant.MUTED,
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
                            action = KeyAction.CommitText("Ô"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("P"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("O"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Î"),
                            color = ColorVariant.MUTED,
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Q"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Œ"),
                            color = ColorVariant.MUTED,
                        ),
                ),
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
                            display = null,
                            action = KeyAction.CommitText("F"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("F"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("G"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ë"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                SPACEBAR_FRENCH_TYPESPLIT_MIDDLE_KEY_ITEM,
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
                            action = KeyAction.CommitText("J"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("K"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("H"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ü"),
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
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ï"),
                            color = ColorVariant.MUTED,
                        ),
                ),
            ),
            listOf(
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
                            action = KeyAction.CommitText("W"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("W"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("X"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ç"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("V"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                SPACEBAR_FRENCH_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("B"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
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
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
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
