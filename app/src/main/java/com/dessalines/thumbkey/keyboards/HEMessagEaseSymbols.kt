package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes

val KB_HE_MESSAGEASE_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ר", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("ן"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                    bottom = KeyC("ץ"),
                ),
                KeyItemC(
                    center = KeyC("ב", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ג"),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("א", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("צ"),
                    left = KeyC("?"),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("מ", size = FontSizeVariant.LARGE),
                    right = KeyC("ם"),
                    topLeft = KeyC("}", displayText = "{", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    bottomRight = KeyC("ך"),
                    bottomLeft = KeyC("]", displayText = "[", color = ColorVariant.MUTED),
                    left = KeyC(")", displayText = "(", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("י", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("ק"),
                    top = KeyC("ח"),
                    topRight = KeyC("פ"),
                    right = KeyC("ד"),
                    bottomRight = KeyC("ש"),
                    bottom = KeyC("נ"),
                    bottomLeft = KeyC("כ"),
                    left = KeyC("ע"),
                ),
                KeyItemC(
                    center = KeyC("ו", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("ף"),
                    topRight = KeyC("{", displayText = "}", color = ColorVariant.MUTED),
                    right = KeyC("(", displayText = ")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("[", displayText = "]", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ת", size = FontSizeVariant.LARGE),
                    topRight = KeyC("ז"),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    right = KeyC("*", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = ColorVariant.MUTED),
                    left = KeyC("<", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("ה", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    top = KeyC("ס"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("ל", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("ט"),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    left = KeyC("#", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_HE_MESSAGEASE_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "עברית messagease symbols",
        modes =
            KeyboardDefinitionModes(
                main = KB_HE_MESSAGEASE_SYMBOLS_MAIN,
                shifted = KB_HE_MESSAGEASE_SYMBOLS_MAIN,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
    )
