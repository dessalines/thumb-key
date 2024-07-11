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
import com.dessalines.thumbkey.utils.SwipeDirection
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
                            display = KeyDisplay.TextDisplay("o"),
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("k"),
                                    action = KeyAction.CommitText("k"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("m"),
                                    action = KeyAction.CommitText("m"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("'"),
                                    action = KeyAction.CommitText("'"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("@"),
                                    action = KeyAction.CommitText("@"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("s"),
                            action = KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ŝ"),
                                    action = KeyAction.CommitText("ŝ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("p"),
                                    action = KeyAction.CommitText("p"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ϗ"),
                                    action = KeyAction.CommitText("ϗ"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("₷"),
                                    action = KeyAction.CommitText("₷"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("e"),
                            action = KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ĥ"),
                                    action = KeyAction.CommitText("ĥ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("h"),
                                    action = KeyAction.CommitText("h"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("#"),
                                    action = KeyAction.CommitText("#"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(":"),
                                    action = KeyAction.CommitText(":"),
                                ),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("n"),
                            action = KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ĵ"),
                                    action = KeyAction.CommitText("ĵ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("j"),
                                    action = KeyAction.CommitText("j"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("."),
                                    action = KeyAction.CommitText("."),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(","),
                                    action = KeyAction.CommitText(","),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("r"),
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("v"),
                                    action = KeyAction.CommitText("v"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("f"),
                                    action = KeyAction.CommitText("f"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("?"),
                                    action = KeyAction.CommitText("?"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("!"),
                                    action = KeyAction.CommitText("!"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("a"),
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("d"),
                                    action = KeyAction.CommitText("d"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("("),
                                    action = KeyAction.CommitText("("),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(")"),
                                    action = KeyAction.CommitText(")"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                    action = KeyAction.ToggleShiftMode(true),
                                    swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("t"),
                            action = KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ĉ"),
                                    action = KeyAction.CommitText("ĉ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("c"),
                                    action = KeyAction.CommitText("c"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("b"),
                                    action = KeyAction.CommitText("b"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("w"),
                                    action = KeyAction.CommitText("w"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("l"),
                            action = KeyAction.CommitText("l"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ĝ"),
                                    action = KeyAction.CommitText("ĝ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("g"),
                                    action = KeyAction.CommitText("g"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("y"),
                                    action = KeyAction.CommitText("y"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("z"),
                                    action = KeyAction.CommitText("z"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("i"),
                            action = KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ŭ"),
                                    action = KeyAction.CommitText("ŭ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("u"),
                                    action = KeyAction.CommitText("u"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("x"),
                                    action = KeyAction.CommitText("x"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("q"),
                                    action = KeyAction.CommitText("q"),
                                ),
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
                            display = KeyDisplay.TextDisplay("O"),
                            action = KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("K"),
                                    action = KeyAction.CommitText("K"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("M"),
                                    action = KeyAction.CommitText("M"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("'"),
                                    action = KeyAction.CommitText("'"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("@"),
                                    action = KeyAction.CommitText("@"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("S"),
                            action = KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ŝ"),
                                    action = KeyAction.CommitText("Ŝ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("P"),
                                    action = KeyAction.CommitText("P"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ϗ"),
                                    action = KeyAction.CommitText("ϗ"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("₷"),
                                    action = KeyAction.CommitText("₷"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("E"),
                            action = KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ĥ"),
                                    action = KeyAction.CommitText("Ĥ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("H"),
                                    action = KeyAction.CommitText("H"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("#"),
                                    action = KeyAction.CommitText("#"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(":"),
                                    action = KeyAction.CommitText(":"),
                                ),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("N"),
                            action = KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ĵ"),
                                    action = KeyAction.CommitText("Ĵ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("J"),
                                    action = KeyAction.CommitText("J"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("."),
                                    action = KeyAction.CommitText("."),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(","),
                                    action = KeyAction.CommitText(","),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("R"),
                            action = KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("V"),
                                    action = KeyAction.CommitText("V"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("F"),
                                    action = KeyAction.CommitText("F"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("?"),
                                    action = KeyAction.CommitText("?"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("‽"),
                                    action = KeyAction.CommitText("‽"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("A"),
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("D"),
                                    action = KeyAction.CommitText("D"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("("),
                                    action = KeyAction.CommitText("("),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(")"),
                                    action = KeyAction.CommitText(")"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                    action = KeyAction.ToggleShiftMode(false),
                                    swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("T"),
                            action = KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ĉ"),
                                    action = KeyAction.CommitText("Ĉ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("C"),
                                    action = KeyAction.CommitText("C"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("B"),
                                    action = KeyAction.CommitText("B"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("W"),
                                    action = KeyAction.CommitText("W"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("L"),
                            action = KeyAction.CommitText("L"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ĝ"),
                                    action = KeyAction.CommitText("Ĝ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("G"),
                                    action = KeyAction.CommitText("G"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Y"),
                                    action = KeyAction.CommitText("Y"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Z"),
                                    action = KeyAction.CommitText("Z"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("I"),
                            action = KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ŭ"),
                                    action = KeyAction.CommitText("Ŭ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("U"),
                                    action = KeyAction.CommitText("U"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("X"),
                                    action = KeyAction.CommitText("X"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Q"),
                                    action = KeyAction.CommitText("Q"),
                                ),
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
