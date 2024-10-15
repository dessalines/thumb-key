package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropUp
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.KeyboardDefinitionSettings
import com.dessalines.thumbkey.utils.SwipeNWay
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe

val KB_EN_EO_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("k")),
                    top = KeyC(KeyAction.CommitText("m")),
                    left = KeyC(KeyAction.CommitText("'")),
                    right = KeyC(KeyAction.CommitText("@")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ŝ")),
                    top = KeyC(KeyAction.CommitText("p")),
                    left = KeyC(KeyAction.CommitText("ϗ")),
                    right = KeyC(KeyAction.CommitText("₷")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ĥ")),
                    top = KeyC(KeyAction.CommitText("h")),
                    left = KeyC(KeyAction.CommitText("#")),
                    right = KeyC(KeyAction.CommitText(":")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ĵ")),
                    top = KeyC(KeyAction.CommitText("j")),
                    left = KeyC(KeyAction.CommitText(".")),
                    right = KeyC(KeyAction.CommitText(",")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("v")),
                    top = KeyC(KeyAction.CommitText("f")),
                    left = KeyC(KeyAction.CommitText("?")),
                    right = KeyC(KeyAction.CommitText("!")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("d")),
                    left = KeyC(KeyAction.CommitText("(")),
                    right = KeyC(KeyAction.CommitText(")")),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ĉ")),
                    top = KeyC(KeyAction.CommitText("c")),
                    left = KeyC(KeyAction.CommitText("b")),
                    right = KeyC(KeyAction.CommitText("w")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("l"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ĝ")),
                    top = KeyC(KeyAction.CommitText("g")),
                    left = KeyC(KeyAction.CommitText("y")),
                    right = KeyC(KeyAction.CommitText("z")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ŭ")),
                    top = KeyC(KeyAction.CommitText("u")),
                    left = KeyC(KeyAction.CommitText("x")),
                    right = KeyC(KeyAction.CommitText("q")),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_EO_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("K")),
                    top = KeyC(KeyAction.CommitText("M")),
                    left = KeyC(KeyAction.CommitText("'")),
                    right = KeyC(KeyAction.CommitText("@")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("Ŝ")),
                    top = KeyC(KeyAction.CommitText("P")),
                    left = KeyC(KeyAction.CommitText("ϗ")),
                    right = KeyC(KeyAction.CommitText("₷")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("Ĥ")),
                    top = KeyC(KeyAction.CommitText("H")),
                    left = KeyC(KeyAction.CommitText("#")),
                    right = KeyC(KeyAction.CommitText(":")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("Ĵ")),
                    top = KeyC(KeyAction.CommitText("J")),
                    left = KeyC(KeyAction.CommitText(".")),
                    right = KeyC(KeyAction.CommitText(",")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("V")),
                    top = KeyC(KeyAction.CommitText("F")),
                    left = KeyC(KeyAction.CommitText("?")),
                    right = KeyC(KeyAction.CommitText("‽")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("D")),
                    left = KeyC(KeyAction.CommitText("(")),
                    right = KeyC(KeyAction.CommitText(")")),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("Ĉ")),
                    top = KeyC(KeyAction.CommitText("C")),
                    left = KeyC(KeyAction.CommitText("B")),
                    right = KeyC(KeyAction.CommitText("W")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("L"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("Ĝ")),
                    top = KeyC(KeyAction.CommitText("G")),
                    left = KeyC(KeyAction.CommitText("Y")),
                    right = KeyC(KeyAction.CommitText("Z")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("Ŭ")),
                    top = KeyC(KeyAction.CommitText("U")),
                    left = KeyC(KeyAction.CommitText("X")),
                    right = KeyC(KeyAction.CommitText("Q")),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_EO_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "english esperanto thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_EO_THUMBKEY_MAIN,
                shifted = KB_EN_EO_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
