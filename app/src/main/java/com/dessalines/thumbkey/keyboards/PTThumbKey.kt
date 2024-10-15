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

val KB_PT_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("v"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("m"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            KeyAction.CommitText("h"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("c"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("ç"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ó"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ô"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("õ"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right =
                        KeyC(
                            KeyAction.CommitText("p"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("d"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("x"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("w"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("f"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("b"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("q"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("k"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("z"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("j"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("t"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("é"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ê"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight =
                        KeyC(
                            KeyAction.CommitText("l"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("g"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("í"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("y"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("u"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ú"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("á"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("â"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("à"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ã"),
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

val KB_PT_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("V"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("M"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            KeyAction.CommitText("H"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("C"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("Ç"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("Ó"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Ô"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Õ"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right =
                        KeyC(
                            KeyAction.CommitText("P"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("D"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("X"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("W"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("F"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("B"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("Q"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("K"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("Z"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("J"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("T"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Ê"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("É"),
                            color = ColorVariant.MUTED,
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
                            KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight =
                        KeyC(
                            KeyAction.CommitText("L"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("G"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("Í"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Y"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("U"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Ú"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("Á"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Â"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("À"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Ã"),
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

val KB_PT_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "português thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_PT_THUMBKEY_MAIN,
                shifted = KB_PT_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
