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

val KB_EN_RSINOA_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("v"),
                                ),
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
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("k"),
                                ),
                            SwipeDirection.RIGHT to
                                    KeyC(
                                        action = KeyAction.CommitText("z"),
                                    ),
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
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                    KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                        action = KeyAction.ToggleShiftMode(true),
                                        swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                                        color = ColorVariant.MUTED,
                                    ),
                            SwipeDirection.BOTTOM to
                                    KeyC(
                                        action = KeyAction.ToggleShiftMode(false),
                                        swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                                    ),
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
                    swipes =
                        mapOf(
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("l"),
                                ),
                            SwipeDirection.BOTTOM to
                                    KeyC(
                                        action = KeyAction.CommitText("x"),
                                    ),
                            SwipeDirection.TOP to
                                    KeyC(
                                        action = KeyAction.CommitText("j"),
                                    ),
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
                    swipes =
                        mapOf(
                            SwipeDirection.RIGHT to
                                    KeyC(
                                        action = KeyAction.CommitText("f"),
                                    ),
                            SwipeDirection.BOTTOM to
                                    KeyC(
                                        action = KeyAction.CommitText("g"),
                                    ),
                            SwipeDirection.TOP to
                                    KeyC(
                                        action = KeyAction.CommitText("p"),
                                    ),
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
                    swipes =
                        mapOf(
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("u"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("y"),
                                ),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("h"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("c"),
                                ),
                            SwipeDirection.RIGHT to
                                    KeyC(
                                        action = KeyAction.CommitText("m"),
                                    ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_RIGHT to
                                    KeyC(
                                        action = KeyAction.CommitText("w"),
                                        color = ColorVariant.MUTED,
                                    ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("b"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("d"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
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
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("q"),
                                ),
                            SwipeDirection.LEFT to
                                    KeyC(
                                        action = KeyAction.CommitText("'"),
                                    ),
                            SwipeDirection.BOTTOM to
                                    KeyC(
                                        action = KeyAction.CommitText(","),
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

val KB_EN_RSINOA_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        action = KeyAction.CommitText("R"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    swipes =
                    mapOf(
                        SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("V"),
                                ),
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
                    swipes =
                    mapOf(
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("K"),
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("Z"),
                                ),
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
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                    action = KeyAction.ToggleShiftMode(true),
                                    swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.ToggleShiftMode(false),
                                    swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                                ),
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
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("L"),
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("X"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("J"),
                                ),
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
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("F"),
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("G"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("P"),
                                ),
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
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("U"),
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("Y"),
                                ),
                    ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        action = KeyAction.CommitText("H"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("C"),
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("M"),
                                ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        action = KeyAction.CommitText("T"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("W"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("B"),
                                ),
                        SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("D"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
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
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("Q"),
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("'"),
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText(","),
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

val KB_EN_RSINOA: KeyboardDefinition =
    KeyboardDefinition(
        title = "english rsinoa",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_RSINOA_MAIN,
                shifted = KB_EN_RSINOA_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
