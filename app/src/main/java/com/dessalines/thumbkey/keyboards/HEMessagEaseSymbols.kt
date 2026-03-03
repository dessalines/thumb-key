@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_HE_MESSAGEASE_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ר", size = LARGE),
                    bottomRight = KeyC("ן", swipeReturnAction = CommitText("נ")),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ב", size = LARGE),
                    bottom = KeyC("ג"),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("א", size = LARGE),
                    bottomLeft = KeyC("צ", swipeReturnAction = CommitText("ץ")),
                    left = KeyC("?"),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("מ", size = LARGE),
                    right = KeyC("ם", swipeReturnAction = CommitText("מ")),
                    topLeft = KeyC("}", displayText = "{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("ך"),
                    bottomLeft = KeyC("]", displayText = "[", color = MUTED),
                    left = KeyC(")", displayText = "(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("י", size = LARGE),
                    topLeft = KeyC("ק"),
                    top = KeyC("ח"),
                    topRight = KeyC("פ", swipeReturnAction = CommitText("ף")),
                    right = KeyC("ד"),
                    bottomRight = KeyC("ש"),
                    bottom = KeyC("נ", swipeReturnAction = CommitText("ן")),
                    bottomLeft = KeyC("כ", swipeReturnAction = CommitText("ך")),
                    left = KeyC("ע"),
                ),
                KeyItemC(
                    center = KeyC("ו", size = LARGE),
                    topRight = KeyC("{", displayText = "}", color = MUTED),
                    right = KeyC("(", displayText = ")", color = MUTED),
                    bottomRight = KeyC("[", displayText = "]", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ת", size = LARGE),
                    topRight = KeyC("ז"),
                    topLeft = KeyC("~", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = MUTED),
                    left = KeyC("<", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ה", size = LARGE),
                    topLeft = KeyC("\"", color = MUTED),
                    top = KeyC("ס"),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ל", size = LARGE),
                    topLeft = KeyC("ט"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("#", color = MUTED),
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
        locales = listOf("he"),
        modes =
            KeyboardDefinitionModes(
                main = KB_HE_MESSAGEASE_SYMBOLS_MAIN,
                shifted = KB_HE_MESSAGEASE_SYMBOLS_MAIN,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
    )
