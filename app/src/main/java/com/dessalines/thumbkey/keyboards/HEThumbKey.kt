@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_HE_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("מ", size = LARGE),
                    bottomRight = KeyC("נ"),
                ),
                KeyItemC(
                    center = KeyC("ב", size = LARGE),
                    bottom = KeyC("ע"),
                ),
                KeyItemC(
                    center = KeyC("א", size = LARGE),
                    bottomLeft = KeyC("כ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ת", size = LARGE),
                    right = KeyC("ם"),
                    left = KeyC("ץ"),
                ),
                KeyItemC(
                    center = KeyC("ל", size = LARGE),
                    topLeft = KeyC("ט"),
                    top = KeyC("ך"),
                    topRight = KeyC("ק"),
                    right = KeyC("צ"),
                    bottomRight = KeyC("ס"),
                    bottom = KeyC("ז"),
                    bottomLeft = KeyC("ג"),
                    left = KeyC("ן"),
                ),
                KeyItemC(
                    center = KeyC("ו", size = LARGE),
                    left = KeyC("פ"),
                    right = KeyC("ף"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ר", size = LARGE),
                    topRight = KeyC("ש"),
                    bottomRight = KeyC("”", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ה", size = LARGE),
                    topLeft = KeyC("״", color = MUTED),
                    top = KeyC("ד"),
                    topRight = KeyC("׳", color = MUTED),
                    right = KeyC("–", color = MUTED),
                    bottomRight = KeyC("…", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("־", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("י", size = LARGE),
                    topLeft = KeyC("ח"),
                    bottomLeft = KeyC("’", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_HE_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "עברית thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_HE_THUMBKEY_MAIN,
                shifted = KB_HE_THUMBKEY_MAIN,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
