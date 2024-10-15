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

val KB_SK_THUMBKEY_V2_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    // swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("q"),
                    top = KeyC("ť"),
                    topRight = KeyC("č"),
                    bottomRight = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("v", size = FontSizeVariant.LARGE),
                    // swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top = KeyC("w"),
                    bottom = KeyC("z"),
                    bottomRight = KeyC("ž"),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    // swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("ú"),
                    top = KeyC("é"),
                    topRight = KeyC("x"),
                    bottomLeft = KeyC("u"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    // swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    top = KeyC("ň"),
                    right = KeyC("m"),
                    left = KeyC("(", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("b"),
                    top = KeyC("ŕ"),
                    topRight = KeyC("j"),
                    right = KeyC("h"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("ý"),
                    bottomLeft = KeyC("g"),
                    left = KeyC("f"),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    // swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    // eng.: you have to turn off this in case to allow 8-way swiping, obvious, but new and tricki to me
                    topRight = KeyC("ó"),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("ô"),
                    left = KeyC("k"),
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
                    top = KeyC("š"),
                    topRight = KeyC("d"),
                    right = KeyC("%", color = ColorVariant.MUTED),
                    bottomRight = KeyC("ď"),
                    bottom = KeyC("-", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    top = KeyC("p"),
                    topRight = KeyC("í"),
                    bottomRight = KeyC("?", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("!", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("l"),
                    topRight = KeyC("á"),
                    bottomRight = KeyC("ä"),
                    bottom = KeyC("@", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("ĺ"),
                    left = KeyC("ľ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_SK_THUMBKEY_V2_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    // swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("Q"),
                    top = KeyC("Ť"),
                    topRight = KeyC("Č"),
                    bottomRight = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("V", size = FontSizeVariant.LARGE),
                    // swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top = KeyC("W"),
                    bottom = KeyC("Z"),
                    bottomRight = KeyC("Ž"),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    // swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("Ú"),
                    top = KeyC("É"),
                    topRight = KeyC("X"),
                    bottomLeft = KeyC("U"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    // swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    top = KeyC("Ň"),
                    right = KeyC("M"),
                    left = KeyC("(", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("B"),
                    top = KeyC("Ŕ"),
                    topRight = KeyC("J"),
                    right = KeyC("H"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("Ý"),
                    bottomLeft = KeyC("G"),
                    left = KeyC("F"),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    topRight = KeyC("Ó"),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("Ô"),
                    left = KeyC("K"),
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
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    top = KeyC("Š"),
                    topRight = KeyC("D"),
                    right = KeyC("%", color = ColorVariant.MUTED),
                    bottomRight = KeyC("Ď"),
                    bottom = KeyC("-", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    top = KeyC("P"),
                    topRight = KeyC("Í"),
                    bottomRight = KeyC("?", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("!", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC("L"),
                    topRight = KeyC("Á"),
                    bottomRight = KeyC("Ä"),
                    bottom = KeyC("@", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("Ĺ"),
                    left = KeyC("Ľ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_SK_THUMBKEY_V2: KeyboardDefinition =
    KeyboardDefinition(
        title = "slovenčina thumb-key v2",
        modes =
            KeyboardDefinitionModes(
                main = KB_SK_THUMBKEY_V2_MAIN,
                shifted = KB_SK_THUMBKEY_V2_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
