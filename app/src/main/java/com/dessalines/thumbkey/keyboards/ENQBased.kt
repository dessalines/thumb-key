package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardCapslock
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

val KB_EN_QBASED_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("w"),
                        action = KeyAction.CommitText("w"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("q"),
                                    action = KeyAction.CommitText("q"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("e"),
                                    action = KeyAction.CommitText("e"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("1"),
                                    action = KeyAction.CommitText("1"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("2"),
                                    action = KeyAction.CommitText("2"),
                                ),
                        SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("3"),
                                    action = KeyAction.CommitText("3"),
                                ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("t"),
                        action = KeyAction.CommitText("t"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("r"),
                                    action = KeyAction.CommitText("r"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("u"),
                                    action = KeyAction.CommitText("u"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("y"),
                                    action = KeyAction.CommitText("y"),
                                    color=ColorVariant.PRIMARY
                                ),
                        SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("4"),
                                    action = KeyAction.CommitText("4"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("5"),
                                    action = KeyAction.CommitText("5"),
                                ),
                        SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("6"),
                                    action = KeyAction.CommitText("6"),
                                ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("o"),
                        action = KeyAction.CommitText("o"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("i"),
                                    action = KeyAction.CommitText("i"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("p"),
                                    action = KeyAction.CommitText("p"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("7"),
                                    action = KeyAction.CommitText("7"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("8"),
                                    action = KeyAction.CommitText("8"),
                                ),
                        SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("9"),
                                    action = KeyAction.CommitText("9"),
                                ),
                        SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("0"),
                                    action = KeyAction.CommitText("0"),
                                ),
                    ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("s"),
                        action = KeyAction.CommitText("s"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("a"),
                                    action = KeyAction.CommitText("a"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("d"),
                                    action = KeyAction.CommitText("d"),
                                    color = ColorVariant.PRIMARY,
                                ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("g"),
                        action = KeyAction.CommitText("g"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("f"),
                                    action = KeyAction.CommitText("f"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("h"),
                                    action = KeyAction.CommitText("h"),
                                    color = ColorVariant.PRIMARY,
                                ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("k"),
                        action = KeyAction.CommitText("k"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("j"),
                                    action = KeyAction.CommitText("j"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("l"),
                                    action = KeyAction.CommitText("l"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\""),
                                    action = KeyAction.CommitText("\""),
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("'"),
                                    action = KeyAction.CommitText("'"),
                                ),
                    ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("z"),
                        action = KeyAction.CommitText("z"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("x"),
                                    action = KeyAction.CommitText("x"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.LEFT to
                                    KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                        action = KeyAction.ToggleShiftMode(true),
                                    ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("v"),
                        action = KeyAction.CommitText("v"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("c"),
                                    action = KeyAction.CommitText("c"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("b"),
                                    action = KeyAction.CommitText("b"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(","),
                                    action = KeyAction.CommitText(",")
                                )
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("m"),
                        action = KeyAction.CommitText("m"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("?"),
                                    action = KeyAction.CommitText("?"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("!"),
                                    action = KeyAction.CommitText("!"),
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("."),
                                    action = KeyAction.CommitText("."),
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("n"),
                                    action = KeyAction.CommitText("n"),
                                    color = ColorVariant.PRIMARY,
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

val KB_EN_QBASED_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("W"),
                        action = KeyAction.CommitText("W"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Q"),
                                    action = KeyAction.CommitText("Q"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("E"),
                                    action = KeyAction.CommitText("E"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("!"),
                                    action = KeyAction.CommitText("!"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("@"),
                                    action = KeyAction.CommitText("@"),
                                ),
                        SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("#"),
                                    action = KeyAction.CommitText("#"),
                                ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("T"),
                        action = KeyAction.CommitText("T"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("R"),
                                    action = KeyAction.CommitText("R"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("U"),
                                    action = KeyAction.CommitText("U"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Y"),
                                    action = KeyAction.CommitText("Y"),
                                    color=ColorVariant.PRIMARY
                                ),
                        SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("$"),
                                    action = KeyAction.CommitText("$"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("%"),
                                    action = KeyAction.CommitText("%"),
                                ),
                        SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("^"),
                                    action = KeyAction.CommitText("^"),
                                ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("O"),
                        action = KeyAction.CommitText("O"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("I"),
                                    action = KeyAction.CommitText("I"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("P"),
                                    action = KeyAction.CommitText("P"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("&"),
                                    action = KeyAction.CommitText("&"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("*"),
                                    action = KeyAction.CommitText("*"),
                                ),
                        SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("("),
                                    action = KeyAction.CommitText("("),
                                ),
                        SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(")"),
                                    action = KeyAction.CommitText(")"),
                                ),
                    ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("S"),
                        action = KeyAction.CommitText("S"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("A"),
                                    action = KeyAction.CommitText("A"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("D"),
                                    action = KeyAction.CommitText("D"),
                                    color = ColorVariant.PRIMARY,
                                ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("G"),
                        action = KeyAction.CommitText("G"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("F"),
                                    action = KeyAction.CommitText("F"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("H"),
                                    action = KeyAction.CommitText("H"),
                                    color = ColorVariant.PRIMARY,
                                ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("K"),
                        action = KeyAction.CommitText("K"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("J"),
                                    action = KeyAction.CommitText("J"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("L"),
                                    action = KeyAction.CommitText("L"),
                                    color = ColorVariant.PRIMARY,
                                ),
                    ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("Z"),
                        action = KeyAction.CommitText("Z"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("X"),
                                    action = KeyAction.CommitText("X"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                                    capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                                    action = KeyAction.ToggleCapsLock,
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                                    action = KeyAction.ToggleShiftMode(false),
                                ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("V"),
                        action = KeyAction.CommitText("V"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("C"),
                                    action = KeyAction.CommitText("C"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("B"),
                                    action = KeyAction.CommitText("B"),
                                    color = ColorVariant.PRIMARY,
                                ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("M"),
                        action = KeyAction.CommitText("M"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("/"),
                                    action = KeyAction.CommitText("/"),
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("N"),
                                    action = KeyAction.CommitText("N"),
                                    color = ColorVariant.PRIMARY,
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

val KB_EN_QBASED: KeyboardDefinition =
    KeyboardDefinition(
        title = "English QBased",
        modes =
        KeyboardDefinitionModes(
            main = KB_EN_QBASED_MAIN,
            shifted = KB_EN_QBASED_SHIFTED,
            numeric = NUMERIC_KEYBOARD,
        ),
        settings =
        KeyboardDefinitionSettings(
            autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
        ),
        )
