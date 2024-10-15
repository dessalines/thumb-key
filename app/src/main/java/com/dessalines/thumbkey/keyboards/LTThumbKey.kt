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
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    right = KeyC("h"),
                    bottomRight = KeyC("d"),
                ),
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("l"),
                    left = KeyC("f"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("q", color = ColorVariant.MUTED),
                    right = KeyC("v"),
                    bottomLeft = KeyC("x", color = ColorVariant.MUTED),
                    left = KeyC("w", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("u", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("č"),
                    top = KeyC("c"),
                    topRight = KeyC("y"),
                    right = KeyC("ų"),
                    bottomRight = KeyC("ž"),
                    bottom = KeyC("z"),
                    bottomLeft = KeyC("b"),
                    left = KeyC("ū"),
                ),
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ą"),
                    left = KeyC("m"),
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
            ),
            listOf(
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    topRight = KeyC("p"),
                    right = KeyC("š"),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    top = KeyC("j"),
                    topRight = KeyC("?", color = ColorVariant.MUTED),
                    right = KeyC("ę"),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    left = KeyC("ė"),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("k"),
                    left = KeyC("į"),
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
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    right = KeyC("H"),
                    bottomRight = KeyC("D"),
                ),
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("L"),
                    left = KeyC("F"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("Q", color = ColorVariant.MUTED),
                    right = KeyC("V"),
                    bottomLeft = KeyC("X", color = ColorVariant.MUTED),
                    left = KeyC("W", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("U", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("Č"),
                    top = KeyC("C"),
                    topRight = KeyC("Y"),
                    right = KeyC("Ų"),
                    bottomRight = KeyC("Ž"),
                    bottom = KeyC("Z"),
                    bottomLeft = KeyC("B"),
                    left = KeyC("Ū"),
                ),
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("Ą"),
                    left = KeyC("M"),
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
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    topRight = KeyC("P"),
                    right = KeyC("Š"),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    top = KeyC("J"),
                    topRight = KeyC("?", color = ColorVariant.MUTED),
                    right = KeyC("Ę"),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    left = KeyC("Ė"),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("K"),
                    left = KeyC("Į"),
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
