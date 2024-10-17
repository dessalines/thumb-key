@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_HE_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ר", size = LARGE),
                    bottomRight = KeyC("ן"),
                ),
                KeyItemC(
                    center = KeyC("ב", size = LARGE),
                    bottom = KeyC("ג"),
                ),
                KeyItemC(
                    center = KeyC("א", size = LARGE),
                    bottomLeft = KeyC("צ"),
                    left = KeyC("ץ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("מ", size = LARGE),
                    right = KeyC("ם"),
                    bottomRight = KeyC("ך"),
                ),
                KeyItemC(
                    center = KeyC("י", size = LARGE),
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
                    center = KeyC("ו", size = LARGE),
                    topLeft = KeyC("ף"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ת", size = LARGE),
                    topRight = KeyC("ז"),
                ),
                KeyItemC(
                    center = KeyC("ה", size = LARGE),
                    top = KeyC("ס"),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ל", size = LARGE),
                    topLeft = KeyC("ט"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_HE_MESSAGEASE: KeyboardDefinition =
    KeyboardDefinition(
        title = "עברית messagease",
        modes =
            KeyboardDefinitionModes(
                main = KB_HE_MESSAGEASE_MAIN,
                shifted = KB_HE_MESSAGEASE_MAIN,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
    )
