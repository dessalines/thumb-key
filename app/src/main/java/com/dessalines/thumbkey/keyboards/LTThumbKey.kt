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
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_LT_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("h"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("d"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("g"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("l"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("f"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("q"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("v"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("x"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("w"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("u"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("č"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("c"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("y"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ų"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ž"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("z"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("b"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ū"),
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
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ą"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("m"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("p"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("š"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("j"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ę"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ė"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("k"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("į"),
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

val KB_LT_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("H"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("D"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("G"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("L"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("F"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Q"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("V"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("X"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("W"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("U"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Č"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("C"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Y"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ų"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ž"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Z"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("B"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ū"),
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
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ą"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("M"),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
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
                            action = KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("P"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Š"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("J"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ę"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ė"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("K"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Į"),
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

val KB_LT_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "lietuvių kalba thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_LT_THUMBKEY_MAIN,
                shifted = KB_LT_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
