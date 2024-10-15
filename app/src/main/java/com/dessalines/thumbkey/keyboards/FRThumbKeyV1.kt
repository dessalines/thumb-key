package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
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

val KB_FR_THUMBKEY_V1_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("u", size = FontSizeVariant.LARGE),
                    topRight = KeyC("ü"),
                    right = KeyC("û"),
                    bottomRight = KeyC("ù"),
                    bottom = KeyC("f"),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    topRight = KeyC("ï"),
                    right = KeyC("î"),
                    bottomLeft = KeyC("c"),
                    left = KeyC("ç"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("l", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("z"),
                    top = KeyC("w"),
                    topRight = KeyC("x"),
                    right = KeyC("g"),
                    bottomRight = KeyC("b"),
                    bottom = KeyC("y"),
                    bottomLeft = KeyC("h"),
                    left = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC("â"),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("à"),
                    left = KeyC("d"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    top = KeyC("q"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    right = KeyC("k"),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    left = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("o"),
                    topRight = KeyC("ë"),
                    right = KeyC("ê"),
                    bottomRight = KeyC("è"),
                    bottom = KeyC("é"),
                    bottomLeft = KeyC("œ"),
                    left = KeyC("ô"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_THUMBKEY_V1_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("U", size = FontSizeVariant.LARGE),
                    topRight = KeyC("Ü"),
                    right = KeyC("Û"),
                    bottomRight = KeyC("Ù"),
                    bottom = KeyC("F"),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    topRight = KeyC("Ï"),
                    right = KeyC("Î"),
                    bottomLeft = KeyC("C"),
                    left = KeyC("Ç"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("L", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("Z"),
                    top = KeyC("W"),
                    topRight = KeyC("X"),
                    right = KeyC("G"),
                    bottomRight = KeyC("B"),
                    bottom = KeyC("Y"),
                    bottomLeft = KeyC("H"),
                    left = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC("Â"),
                    bottomRight = KeyC("À"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC("D"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    top = KeyC("Q"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    right = KeyC("K"),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    left = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("O"),
                    topRight = KeyC("Ë"),
                    right = KeyC("Ê"),
                    bottomRight = KeyC("È"),
                    bottom = KeyC("É"),
                    bottomLeft = KeyC("Œ"),
                    left = KeyC("Ô"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_THUMBKEY_V1: KeyboardDefinition =
    KeyboardDefinition(
        title = "français thumb-key v1",
        modes =
            KeyboardDefinitionModes(
                main = KB_FR_THUMBKEY_V1_MAIN,
                shifted = KB_FR_THUMBKEY_V1_SHIFTED,
                numeric = FRENCH_NUMERIC_KEYBOARD,
            ),
    )
