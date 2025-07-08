@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_FR_EN_FRAPPE_FLUIDE_V1_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    left = KeyC("û", color = MUTED),
                    right = KeyC("ù", color = MUTED),
                    bottomLeft = KeyC("ll", color = MUTED),
                    bottom = KeyC("b"),
                    bottomRight = KeyC("qu", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    left = KeyC("ü"),
                    right = KeyC("=", color = MUTED),
                    bottomLeft = KeyC("d"),
                    bottom = KeyC("m"),
                    bottomRight = KeyC("f"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    left = KeyC("ï", color = MUTED),
                    right = KeyC("æ", color = MUTED),
                    bottomLeft = KeyC("c"),
                    bottom = KeyC("î", color = MUTED),
                    bottomRight = KeyC("ô", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("œ", color = MUTED),
                    top = KeyC("ë", color = MUTED),
                    topRight = KeyC("ê", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    right = KeyC("é", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom = KeyC("z"),
                    bottomRight = KeyC("è", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    topLeft = KeyC("k"),
                    top = KeyC("o"),
                    topRight = KeyC("â", color = MUTED),
                    left = KeyC("v"),
                    right = KeyC("y"),
                    bottomLeft = KeyC("g"),
                    bottom = KeyC("x"),
                    bottomRight = KeyC("à", color = MUTED),
                ),
                KeyItemC(
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    center = KeyC("t", size = LARGE),
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("/", color = MUTED),
                    left = KeyC("@", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomLeft = KeyC("p"),
                    bottomRight = KeyC("]", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    topLeft = KeyC("·", color = MUTED),
                    top = KeyC("j"),
                    topRight = KeyC("ç", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    bottomLeft = KeyC("«", color = MUTED),
                    bottom = KeyC("!", color = MUTED),
                    bottomRight = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("+", color = MUTED),
                    top = KeyC("h"),
                    topRight = KeyC("-", color = MUTED),
                    left = KeyC("^", color = MUTED),
                    right = KeyC(":", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC(";", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    topLeft = KeyC("’", color = MUTED),
                    top = KeyC("w"),
                    topRight = KeyC("\"", color = MUTED),
                    left = KeyC("'", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC("…", color = MUTED),
                    bottom = KeyC("_", color = MUTED),
                    bottomRight = KeyC("»", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_EN_FRAPPE_FLUIDE_V1_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    left = KeyC("Û", color = MUTED),
                    right = KeyC("Ù", color = MUTED),
                    bottomLeft = KeyC("LL", color = MUTED),
                    bottom = KeyC("B"),
                    bottomRight = KeyC("Qu", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    left = KeyC("Ü"),
                    right = KeyC("=", color = MUTED),
                    bottomLeft = KeyC("D"),
                    bottom = KeyC("M"),
                    bottomRight = KeyC("F"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    left = KeyC("Ï", color = MUTED),
                    right = KeyC("Æ", color = MUTED),
                    bottomLeft = KeyC("C"),
                    bottom = KeyC("Î", color = MUTED),
                    bottomRight = KeyC("Ô", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("Œ", color = MUTED),
                    top = KeyC("Ë", color = MUTED),
                    topRight = KeyC("Ê", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    right = KeyC("É", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom = KeyC("Z"),
                    bottomRight = KeyC("È", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    topLeft = KeyC("K"),
                    top = KeyC("O"),
                    topRight = KeyC("Â", color = MUTED),
                    left = KeyC("V"),
                    right = KeyC("Y"),
                    bottomLeft = KeyC("G"),
                    bottom = KeyC("X"),
                    bottomRight = KeyC("À", color = MUTED),
                ),
                KeyItemC(
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = PRIMARY,
                        ),
                    center = KeyC("T", size = LARGE),
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("/", color = MUTED),
                    left = KeyC("@", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomLeft = KeyC("P"),
                    bottomRight = KeyC("]", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    topLeft = KeyC("·", color = MUTED),
                    top = KeyC("J"),
                    topRight = KeyC("Ç", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    bottomLeft = KeyC("«", color = MUTED),
                    bottom = KeyC("!", color = MUTED),
                    bottomRight = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("+", color = MUTED),
                    top = KeyC("H"),
                    topRight = KeyC("-", color = MUTED),
                    left = KeyC("^", color = MUTED),
                    right = KeyC(":", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC(";", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    topLeft = KeyC("’", color = MUTED),
                    top = KeyC("W"),
                    topRight = KeyC("\"", color = MUTED),
                    left = KeyC("'", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC("…", color = MUTED),
                    bottom = KeyC("_", color = MUTED),
                    bottomRight = KeyC("»", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val FRENCH_FLUID_NUMERIC_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    right = KeyC("±"),
                    bottomLeft = KeyC("≤"),
                    bottom = KeyC("¬"),
                    bottomRight = KeyC("≥"),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    left = KeyC("×"),
                    right = KeyC("="),
                    bottomLeft = KeyC("÷"),
                    bottom = KeyC("m"),
                    bottomRight = KeyC("≠"),
                ),
                KeyItemC(
                    left = KeyC("≈"),
                    center = KeyC("9", size = LARGE),
                    bottomLeft = KeyC("~"),
                    bottom = KeyC("&"),
                    bottomRight = KeyC("#"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    topLeft = KeyC("\\"),
                    left = KeyC("("),
                    right = KeyC("„"),
                    bottomLeft = KeyC("["),
                    bottom = KeyC("{"),
                    bottomRight = KeyC("“"),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    topLeft = KeyC("`"),
                    top = KeyC("´"),
                    topRight = KeyC("¥"),
                    left = KeyC("‰"),
                    right = KeyC("$"),
                    bottomLeft = KeyC("%"),
                    bottom = KeyC("€"),
                    bottomRight = KeyC("£"),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    topLeft = KeyC("|"),
                    top = KeyC("°"),
                    topRight = KeyC("/"),
                    left = KeyC("@"),
                    right = KeyC(")"),
                    bottomLeft = KeyC("”"),
                    bottom = KeyC("}"),
                    bottomRight = KeyC("]"),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    topLeft = KeyC("·"),
                    left = KeyC("<"),
                    right = KeyC("*"),
                    bottomLeft = KeyC("«"),
                    bottom = KeyC("!"),
                    bottomRight = KeyC("?"),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    topLeft = KeyC("+"),
                    top = KeyC("h"),
                    topRight = KeyC("-"),
                    left = KeyC("^"),
                    right = KeyC(":"),
                    bottomLeft = KeyC(","),
                    bottom = KeyC("."),
                    bottomRight = KeyC(";"),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    topLeft = KeyC("’"),
                    topRight = KeyC("\""),
                    left = KeyC("'"),
                    right = KeyC(">"),
                    bottomLeft = KeyC("…"),
                    bottom = KeyC("_"),
                    bottomRight = KeyC("»"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                ),
                SPACEBAR_FRENCH_KEY_ITEM.copy(widthMultiplier = 2),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_EN_FRAPPE_FLUIDE_V1: KeyboardDefinition =
    KeyboardDefinition(
        title = "français frappefluide (optim fr+en+text_emojis) v1",
        modes =
            KeyboardDefinitionModes(
                main = KB_FR_EN_FRAPPE_FLUIDE_V1_MAIN,
                shifted = KB_FR_EN_FRAPPE_FLUIDE_V1_SHIFTED,
                numeric = FRENCH_FLUID_NUMERIC_KEYBOARD,
            ),
    )
