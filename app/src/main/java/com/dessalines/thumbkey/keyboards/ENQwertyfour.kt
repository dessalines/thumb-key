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

val KB_EN_QWERTYFOUR_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("\"", color = ColorVariant.MUTED),
                    right = KeyC("w"),
                    bottom = KeyC("q"),
                    left = KeyC(":", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("'", color = ColorVariant.MUTED),
                    right = KeyC("u"),
                    bottom = KeyC("y"),
                    left = KeyC("r"),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC(".", color = ColorVariant.MUTED),
                    right = KeyC(",", color = ColorVariant.MUTED),
                    bottom = KeyC("p"),
                    left = KeyC("i"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("d"),
                    right = KeyC("s"),
                    bottom = KeyC("f"),
                    left = KeyC(";", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("h", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("j"),
                    bottom = KeyC("v"),
                    left = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("l", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("k"),
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
                    center = KeyC("c", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("z"),
                    right = KeyC("x"),
                    bottom = KeyC("@", color = ColorVariant.MUTED),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("m"),
                    right = KeyC("?", color = ColorVariant.MUTED),
                    bottom = KeyC("!", color = ColorVariant.MUTED),
                    left = KeyC("b"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_QWERTYFOUR_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("\"", color = ColorVariant.MUTED),
                    right = KeyC("W"),
                    bottom = KeyC("Q"),
                    left = KeyC(":", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("'", color = ColorVariant.MUTED),
                    right = KeyC("U"),
                    bottom = KeyC("Y"),
                    left = KeyC("R"),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC(".", color = ColorVariant.MUTED),
                    right = KeyC(",", color = ColorVariant.MUTED),
                    bottom = KeyC("P"),
                    left = KeyC("I"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("D"),
                    right = KeyC("S"),
                    bottom = KeyC("F"),
                    left = KeyC(";", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("H", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("J"),
                    bottom = KeyC("V"),
                    left = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("L", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC("/", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC("K"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("C", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("Z"),
                    right = KeyC("X"),
                    bottom = KeyC("@", color = ColorVariant.MUTED),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("M"),
                    right = KeyC("?", color = ColorVariant.MUTED),
                    bottom = KeyC("!", color = ColorVariant.MUTED),
                    left = KeyC("B"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_QWERTYFOUR: KeyboardDefinition =
    KeyboardDefinition(
        title = "english qwertyfour",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_QWERTYFOUR_MAIN,
                shifted = KB_EN_QWERTYFOUR_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
