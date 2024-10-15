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

val KB_EN_QWERTEASE_TWO_HANDS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("t"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    bottom = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("y"),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("t"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    bottom = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("y"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("h", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("q"),
                    top = KeyC("u"),
                    topRight = KeyC("p"),
                    right = KeyC("b"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("d"),
                    bottomLeft = KeyC("g"),
                    left = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC("l"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("h", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("q"),
                    top = KeyC("u"),
                    topRight = KeyC("p"),
                    right = KeyC("b"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("d"),
                    bottomLeft = KeyC("g"),
                    left = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC("l"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    topRight = KeyC("x"),
                    right = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    top = KeyC("v"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("m", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("f"),
                    bottomRight = KeyC("?", color = ColorVariant.MUTED),
                    bottom = KeyC("!", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    topRight = KeyC("x"),
                    right = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    top = KeyC("v"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("m", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("f"),
                    bottomRight = KeyC("?", color = ColorVariant.MUTED),
                    bottom = KeyC("!", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                ),
            ),
            listOf(
                RETURN_KEY_ITEM,
                BACKSPACE_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                BACKSPACE_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_QWERTEASE_TWO_HANDS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("T"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    bottom = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("Y"),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("T"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    bottom = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("Y"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("H", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("Q"),
                    top = KeyC("U"),
                    topRight = KeyC("P"),
                    right = KeyC("B"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("D"),
                    bottomLeft = KeyC("G"),
                    left = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC("L"),
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
                KeyItemC(
                    center = KeyC("H", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("Q"),
                    top = KeyC("U"),
                    topRight = KeyC("P"),
                    right = KeyC("B"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("D"),
                    bottomLeft = KeyC("G"),
                    left = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC("L"),
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
            ),
            listOf(
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    topRight = KeyC("X"),
                    right = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    top = KeyC("V"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("M", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("F"),
                    bottomRight = KeyC("?", color = ColorVariant.MUTED),
                    bottom = KeyC("!", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    topRight = KeyC("X"),
                    right = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    top = KeyC("V"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("M", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("F"),
                    bottomRight = KeyC("?", color = ColorVariant.MUTED),
                    bottom = KeyC("!", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                ),
            ),
            listOf(
                RETURN_KEY_ITEM,
                BACKSPACE_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                BACKSPACE_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_QWERTEASE_TWO_HANDS: KeyboardDefinition =
    KeyboardDefinition(
        title = "english qwertease two-hands",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_QWERTEASE_TWO_HANDS_MAIN,
                shifted = KB_EN_QWERTEASE_TWO_HANDS_SHIFTED,
                numeric = KB_EN_MESSAGEASE_TWO_HANDS_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
