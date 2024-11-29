@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_FR_THUMBKEY_V3_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    topLeft = KeyC("æ"),
                    top = KeyC("â"),
                    topRight = KeyC("v"),
                    left = KeyC("μ", color = MUTED),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottom = KeyC("q"),
                    bottomRight = KeyC("à"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    topLeft = KeyC("\u0300", displayText = "ˋ", color = MUTED),
                    top = KeyC("\u0302", displayText = "^", color = MUTED),
                    topRight = KeyC("\u0301", displayText = "ˊ", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottom = KeyC("l"),
                    bottomRight = KeyC("\\", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    topLeft = KeyC("ï"),
                    top = KeyC("î"),
                    topRight = KeyC("\"", color = MUTED),
                    left = KeyC("k"),
                    right = KeyC("?", color = MUTED),
                    bottomLeft = KeyC("x"),
                    bottom = KeyC("=", color = MUTED),
                    bottomRight = KeyC("%", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    topLeft = KeyC("{", color = MUTED),
                    top = KeyC("û"),
                    topRight = KeyC("ü"),
                    left = KeyC("(", color = MUTED),
                    right = KeyC("h"),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom = KeyC("ç"),
                    bottomRight = KeyC("ù"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topLeft = KeyC("œ"),
                    top = KeyC("ô"),
                    topRight = KeyC("p"),
                    left = KeyC("c"),
                    right = KeyC("b"),
                    bottomLeft = KeyC("g"),
                    bottom = KeyC("d"),
                    bottomRight = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    topLeft = KeyC("|", color = MUTED),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topRight = KeyC("}", color = MUTED),
                    left = KeyC("m"),
                    right = KeyC(")", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("]", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topLeft = KeyC("~", color = MUTED),
                    top = KeyC("w"),
                    topRight = KeyC("y"),
                    left = KeyC("<", color = MUTED),
                    right = KeyC(":", color = MUTED),
                    bottomLeft = KeyC("\u0303", displayText = "ñ", color = MUTED),
                    bottom = KeyC("_", color = MUTED),
                    bottomRight = KeyC("\u0009", displayText = "\u2b7e", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("ë"),
                    top = KeyC("ê"),
                    topRight = KeyC("é"),
                    left = KeyC("'", color = MUTED),
                    right = KeyC("z"),
                    bottomLeft = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC("è"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("f"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("ÿ"),
                    left = KeyC("#", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC("\u0308", displayText = "¨", color = MUTED),
                    bottomRight = KeyC("ö"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_THUMBKEY_V3_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    topLeft = KeyC("Æ"),
                    top = KeyC("Â"),
                    topRight = KeyC("V"),
                    left = KeyC("μ", color = MUTED),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottom = KeyC("Q"),
                    bottomRight = KeyC("À"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    topLeft = KeyC("\u0300", displayText = "ˋ", color = MUTED),
                    top = KeyC("\u0302", displayText = "^", color = MUTED),
                    topRight = KeyC("\u0301", displayText = "ˊ", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottom = KeyC("L"),
                    bottomRight = KeyC("\\", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    topLeft = KeyC("Ï"),
                    top = KeyC("Î"),
                    topRight = KeyC("\"", color = MUTED),
                    left = KeyC("K"),
                    right = KeyC("?", color = MUTED),
                    bottomLeft = KeyC("X"),
                    bottom = KeyC("=", color = MUTED),
                    bottomRight = KeyC("%", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    topLeft = KeyC("{", color = MUTED),
                    top = KeyC("Û"),
                    topRight = KeyC("Ü"),
                    left = KeyC("(", color = MUTED),
                    right = KeyC("H"),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom = KeyC("Ç"),
                    bottomRight = KeyC("Ù"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topLeft = KeyC("Œ"),
                    top = KeyC("Ô"),
                    topRight = KeyC("P"),
                    left = KeyC("C"),
                    right = KeyC("B"),
                    bottomLeft = KeyC("G"),
                    bottom = KeyC("D"),
                    bottomRight = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    topLeft = KeyC("|", color = MUTED),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topRight = KeyC("}", color = MUTED),
                    left = KeyC("M"),
                    right = KeyC(")", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    bottomRight = KeyC("]", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topLeft = KeyC("~", color = MUTED),
                    top = KeyC("W"),
                    topRight = KeyC("Y"),
                    left = KeyC("<", color = MUTED),
                    right = KeyC(":", color = MUTED),
                    bottomLeft = KeyC("\u0303", displayText = "ñ", color = MUTED),
                    bottom = KeyC("_", color = MUTED),
                    bottomRight = KeyC("\u0009", displayText = "\u2b7e", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("Ë"),
                    top = KeyC("Ê"),
                    topRight = KeyC("É"),
                    left = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottomLeft = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC("È"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("F"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("Ÿ"),
                    left = KeyC("#", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC("\u0308", displayText = "¨", color = MUTED),
                    bottomRight = KeyC("Ö"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_THUMBKEY_V3: KeyboardDefinition =
    KeyboardDefinition(
        title = "Français thumb-key v3",
        modes =
            KeyboardDefinitionModes(
                main = KB_FR_THUMBKEY_V3_MAIN,
                shifted = KB_FR_THUMBKEY_V3_SHIFTED,
                numeric = FRENCH_NUMERIC_KEYBOARD,
            ),
    )
