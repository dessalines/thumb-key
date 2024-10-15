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
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("k"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("m"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("@"),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ŝ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("p"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ϗ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("₷"),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ĥ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("h"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("#"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                        ),
                ),
                EMOJI_KEY_ITEM,
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ĵ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("j"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("."),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(","),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("v"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("f"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("!"),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("d"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("("),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                        ),
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
                            action = KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ĉ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("c"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("b"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("w"),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ĝ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("g"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("y"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("z"),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ŭ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("u"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("x"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("q"),
                        ),
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
                            action = KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("K"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("M"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("@"),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ŝ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("P"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ϗ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("₷"),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ĥ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("H"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("#"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                        ),
                ),
                EMOJI_KEY_ITEM,
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ĵ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("J"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("."),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(","),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("V"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("F"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("‽"),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("D"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("("),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                        ),
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
                            action = KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ĉ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("C"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("B"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("W"),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ĝ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("G"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Y"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Z"),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ŭ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("U"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("X"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Q"),
                        ),
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
