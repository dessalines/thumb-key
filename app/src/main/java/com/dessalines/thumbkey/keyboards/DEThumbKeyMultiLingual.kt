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

val KB_DE_THUMBKEY_MULTILINGUAL_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("@", color = ColorVariant.MUTED),
                    topRight = KeyC("#", color = ColorVariant.MUTED),
                    right = KeyC("ç", color = ColorVariant.MUTED),
                    bottom = KeyC("…", color = ColorVariant.MUTED),
                    bottomRight = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("d", size = FontSizeVariant.LARGE),
                    bottom = KeyC("f"),
                    bottomRight = KeyC("l"),
                ),
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("ä"),
                    bottomRight = KeyC("â", color = ColorVariant.MUTED),
                    bottom = KeyC("à", color = ColorVariant.MUTED),
                    left = KeyC("å", color = ColorVariant.MUTED),
                    right = KeyC("æ", color = ColorVariant.MUTED),
                    topLeft = KeyC("€", color = ColorVariant.MUTED),
                    top = KeyC("|", color = ColorVariant.MUTED),
                    topRight = KeyC("&", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    right = KeyC("m"),
                    bottomLeft = KeyC("ó", color = ColorVariant.MUTED),
                    bottomRight = KeyC("ø", color = ColorVariant.MUTED),
                    left = KeyC("ò", color = ColorVariant.MUTED),
                    topLeft = KeyC("ö"),
                    top = KeyC("ô", color = ColorVariant.MUTED),
                    topRight = KeyC("o"),
                ),
                KeyItemC(
                    center = KeyC("h", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("j"),
                    top = KeyC("q"),
                    topRight = KeyC("z"),
                    right = KeyC("k"),
                    bottomRight = KeyC("w"),
                    bottom = KeyC("x"),
                    bottomLeft = KeyC("v"),
                    left = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ï", color = ColorVariant.MUTED),
                    right = KeyC("ì", color = ColorVariant.MUTED),
                    bottomRight = KeyC("î", color = ColorVariant.MUTED),
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
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    right = KeyC("g"),
                    topRight = KeyC("u"),
                    top = KeyC("û", color = ColorVariant.MUTED),
                    topLeft = KeyC("ü"),
                    left = KeyC("ù", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("(", color = ColorVariant.MUTED),
                    bottom = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    top = KeyC("b"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    right = KeyC("y"),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    left = KeyC("ß"),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    left = KeyC("œ", color = ColorVariant.MUTED),
                    topLeft = KeyC("ë", color = ColorVariant.MUTED),
                    top = KeyC("ê", color = ColorVariant.MUTED),
                    topRight = KeyC("è", color = ColorVariant.MUTED),
                    right = KeyC("é", color = ColorVariant.MUTED),
                    bottomRight = KeyC(")", color = ColorVariant.MUTED),
                    bottom = KeyC("~", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("?", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DE_THUMBKEY_MULTILINGUAL_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("@", color = ColorVariant.MUTED),
                    topRight = KeyC("#", color = ColorVariant.MUTED),
                    right = KeyC("Ç", color = ColorVariant.MUTED),
                    bottom = KeyC("…", color = ColorVariant.MUTED),
                    bottomRight = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("D", size = FontSizeVariant.LARGE),
                    bottom = KeyC("F"),
                    bottomRight = KeyC("L"),
                ),
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("Ä"),
                    bottomRight = KeyC("Â", color = ColorVariant.MUTED),
                    bottom = KeyC("À", color = ColorVariant.MUTED),
                    left = KeyC("Å", color = ColorVariant.MUTED),
                    right = KeyC("Æ", color = ColorVariant.MUTED),
                    topLeft = KeyC("€", color = ColorVariant.MUTED),
                    top = KeyC("|", color = ColorVariant.MUTED),
                    topRight = KeyC("&", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    right = KeyC("M"),
                    bottomLeft = KeyC("Ó", color = ColorVariant.MUTED),
                    bottomRight = KeyC("Ø", color = ColorVariant.MUTED),
                    left = KeyC("Ò", color = ColorVariant.MUTED),
                    topLeft = KeyC("Ö"),
                    top = KeyC("Ô", color = ColorVariant.MUTED),
                    topRight = KeyC("O"),
                ),
                KeyItemC(
                    center = KeyC("H", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("J"),
                    top = KeyC("Q"),
                    topRight = KeyC("Z"),
                    right = KeyC("K"),
                    bottomRight = KeyC("W"),
                    bottom = KeyC("X"),
                    bottomLeft = KeyC("V"),
                    left = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("Ï", color = ColorVariant.MUTED),
                    right = KeyC("Ì", color = ColorVariant.MUTED),
                    bottomRight = KeyC("Î", color = ColorVariant.MUTED),
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
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    right = KeyC("G"),
                    topRight = KeyC("U"),
                    top = KeyC("Û", color = ColorVariant.MUTED),
                    topLeft = KeyC("Ü"),
                    left = KeyC("Ù", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("(", color = ColorVariant.MUTED),
                    bottom = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    top = KeyC("B"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    right = KeyC("Y"),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    left = KeyC("ẞ"),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    left = KeyC("Œ", color = ColorVariant.MUTED),
                    topLeft = KeyC("Ë", color = ColorVariant.MUTED),
                    top = KeyC("Ê", color = ColorVariant.MUTED),
                    topRight = KeyC("È", color = ColorVariant.MUTED),
                    right = KeyC("É", color = ColorVariant.MUTED),
                    bottomRight = KeyC(")", color = ColorVariant.MUTED),
                    bottom = KeyC("~", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("?", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

// TODO this needs fixing, which languages are here?
val KB_DE_THUMBKEY_MULTILINGUAL: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch multilingual thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_THUMBKEY_MULTILINGUAL_MAIN,
                shifted = KB_DE_THUMBKEY_MULTILINGUAL_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
