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

val KB_IT_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
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
                            action = KeyAction.CommitText("z"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("v"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("p"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("q"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("u"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ù"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ò"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("qu"),
                            color = ColorVariant.MUTED,
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
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("m"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("l"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("j"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("y"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("x"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("w"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("k"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("h"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("b"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("c"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("à"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ch"),
                            color = ColorVariant.MUTED,
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
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("@"),
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
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ì"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
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
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("è"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("f"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("é"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ə"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("d"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("g"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("gh"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ɜ"),
                            color = ColorVariant.MUTED,
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

val KB_IT_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
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
                            action = KeyAction.CommitText("Z"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("V"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("P"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Q"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ò"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ù"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("U"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Qu"),
                            color = ColorVariant.MUTED,
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
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("M"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("L"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("J"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Y"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("X"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("W"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("K"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("H"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("C"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("B"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("À"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ch"),
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
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
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
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("@"),
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
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ì"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
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
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("È"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("É"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ǝ"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("D"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("F"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("G"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Gh"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("3"),
                            color = ColorVariant.MUTED,
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

val KB_IT_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "italiano thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_IT_THUMBKEY_MAIN,
                shifted = KB_IT_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
