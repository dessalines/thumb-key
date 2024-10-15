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

val KB_SK_THUMBKEY_V1_MAIN =
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
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("w"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("š"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("g"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ŕ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("u"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ó"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ú"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ô"),
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
                    right =
                        KeyC(
                            action = KeyAction.CommitText("m"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ň"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("h"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("j"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("q"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("b"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("p"),
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
                            action = KeyAction.CommitText("v"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("k"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    // swipeType = SwipeNWay.FOUR_WAY_CROSS,    <<<<--- four-w-cross musí byť vypatý ak chceš 8-smerné swajpovanie
                    // eng.: you have to turn off this in case to allow 8-way swiping, obvious, but new and tricki to me
                    left =
                        KeyC(
                            action = KeyAction.CommitText("l"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ĺ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ľ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("á"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ä"),
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
                            action = KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("c"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("č"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ť"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("f"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("í"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ý"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("z"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ž"),
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
                            action = KeyAction.CommitText("*"),
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
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("d"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("é"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ď"),
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

val KB_SK_THUMBKEY_V1_SHIFTED =
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
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("W"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Š"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("G"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ŕ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("U"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Ó"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ú"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ô"),
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
                    right =
                        KeyC(
                            action = KeyAction.CommitText("M"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ň"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("H"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("J"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Q"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("B"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("P"),
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
                            action = KeyAction.CommitText("V"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("K"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("L"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ĺ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ľ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Á"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ä"),
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
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("C"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Č"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ť"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("F"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Í"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ý"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Z"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ž"),
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
                            action = KeyAction.CommitText("*"),
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
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("D"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("É"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ď"),
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

val KB_SK_THUMBKEY_V1: KeyboardDefinition =
    KeyboardDefinition(
        title = "slovenčina thumb-key v1",
        modes =
            KeyboardDefinitionModes(
                main = KB_SK_THUMBKEY_V1_MAIN,
                shifted = KB_SK_THUMBKEY_V1_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
