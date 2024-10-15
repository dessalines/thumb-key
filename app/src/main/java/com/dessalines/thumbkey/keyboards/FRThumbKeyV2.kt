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

val KB_FR_THUMBKEY_V2_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("l", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("«", color = ColorVariant.MUTED),
                    top = KeyC("»", color = ColorVariant.MUTED),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    right = KeyC("^", color = ColorVariant.MUTED),
                    bottomRight = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("u", size = FontSizeVariant.LARGE),
                    top = KeyC("ü", color = ColorVariant.MUTED),
                    right = KeyC("û", color = ColorVariant.MUTED),
                    bottomRight = KeyC("ù", color = ColorVariant.MUTED),
                    bottom = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    top = KeyC("ï", color = ColorVariant.MUTED),
                    right = KeyC("î", color = ColorVariant.MUTED),
                    bottomRight = KeyC("k"),
                    bottomLeft = KeyC("y"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    left = KeyC("-", color = ColorVariant.MUTED),
                    right = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("w"),
                    top = KeyC("j"),
                    topRight = KeyC("g"),
                    right = KeyC("b"),
                    bottomRight = KeyC("f"),
                    bottom = KeyC("h"),
                    bottomLeft = KeyC("x"),
                    left = KeyC("z"),
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
                    topRight = KeyC("@", color = ColorVariant.MUTED),
                    right = KeyC("â", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("à", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("æ", color = ColorVariant.MUTED),
                    left = KeyC("d"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    topRight = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("ç", color = ColorVariant.MUTED),
                    top = KeyC("c"),
                    bottomRight = KeyC("*", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("o"),
                    top = KeyC("ë", color = ColorVariant.MUTED),
                    topRight = KeyC("é", color = ColorVariant.MUTED),
                    right = KeyC("ê", color = ColorVariant.MUTED),
                    bottomRight = KeyC("è", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("œ", color = ColorVariant.MUTED),
                    left = KeyC("ô", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_THUMBKEY_V2_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("L", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("«", color = ColorVariant.MUTED),
                    top = KeyC("»", color = ColorVariant.MUTED),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    right = KeyC("^", color = ColorVariant.MUTED),
                    bottomRight = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("U", size = FontSizeVariant.LARGE),
                    top = KeyC("Ü", color = ColorVariant.MUTED),
                    right = KeyC("Û", color = ColorVariant.MUTED),
                    bottomRight = KeyC("Ù", color = ColorVariant.MUTED),
                    bottom = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    top = KeyC("Ï", color = ColorVariant.MUTED),
                    right = KeyC("Î", color = ColorVariant.MUTED),
                    bottomRight = KeyC("K"),
                    bottomLeft = KeyC("Y"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    left = KeyC("-", color = ColorVariant.MUTED),
                    right = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("W"),
                    top = KeyC("J"),
                    topRight = KeyC("G"),
                    right = KeyC("B"),
                    bottomRight = KeyC("F"),
                    bottom = KeyC("H"),
                    bottomLeft = KeyC("X"),
                    left = KeyC("Z"),
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
                    topRight = KeyC("@", color = ColorVariant.MUTED),
                    right = KeyC("Â", color = ColorVariant.MUTED),
                    bottomRight = KeyC("À", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft = KeyC("Æ", color = ColorVariant.MUTED),
                    left = KeyC("D"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    topRight = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("Ç", color = ColorVariant.MUTED),
                    top = KeyC("C"),
                    bottomRight = KeyC("*", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("O"),
                    top = KeyC("Ë", color = ColorVariant.MUTED),
                    topRight = KeyC("É", color = ColorVariant.MUTED),
                    right = KeyC("Ê", color = ColorVariant.MUTED),
                    bottomRight = KeyC("È", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("Œ", color = ColorVariant.MUTED),
                    left = KeyC("Ô", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_THUMBKEY_V2: KeyboardDefinition =
    KeyboardDefinition(
        title = "français thumb-key v2",
        modes =
            KeyboardDefinitionModes(
                main = KB_FR_THUMBKEY_V2_MAIN,
                shifted = KB_FR_THUMBKEY_V2_SHIFTED,
                numeric = FRENCH_NUMERIC_KEYBOARD,
            ),
    )
