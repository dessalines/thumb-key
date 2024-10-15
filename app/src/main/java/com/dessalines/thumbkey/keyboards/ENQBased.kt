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
                            KeyAction.CommitText("w"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("q"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("e"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("1"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("2"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("3"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("r"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("u"),
                            color = ColorVariant.PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("y"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("4"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("5"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("6"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("i"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("p"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("7"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("8"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("9"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("0"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    left =
                        KeyC(
                            KeyAction.CommitText("a"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("d"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("g"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    left =
                        KeyC(
                            KeyAction.CommitText("f"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("h"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("k"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            KeyAction.CommitText("j"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("l"),
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("\""),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("'"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("z"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right =
                        KeyC(
                            KeyAction.CommitText("x"),
                            color = ColorVariant.PRIMARY,
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("v"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            KeyAction.CommitText("c"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("b"),
                            color = ColorVariant.PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText(","),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("m"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("?"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("!"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("n"),
                            color = ColorVariant.PRIMARY,
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
                            KeyAction.CommitText("W"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("Q"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("E"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("!"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("@"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("#"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("R"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("U"),
                            color = ColorVariant.PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Y"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("$"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("%"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("^"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("I"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("P"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("&"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("*"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("("),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(")"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    left =
                        KeyC(
                            KeyAction.CommitText("A"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("D"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("G"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    left =
                        KeyC(
                            KeyAction.CommitText("F"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("H"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("K"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    left =
                        KeyC(
                            KeyAction.CommitText("J"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("L"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Z"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("X"),
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("V"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    left =
                        KeyC(
                            KeyAction.CommitText("C"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("B"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("M"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right =
                        KeyC(
                            KeyAction.CommitText("/"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("N"),
                            color = ColorVariant.PRIMARY,
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
        title = "english qbased",
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
