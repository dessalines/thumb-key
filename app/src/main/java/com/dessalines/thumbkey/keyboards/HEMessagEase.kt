@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_HE_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ר", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("ן", swipeReturnAction = CommitText("נ")),
                ),
                KeyItemC(
                    center = KeyC("ב", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("ג"),
                ),
                KeyItemC(
                    center = KeyC("א", size = LARGE),
                    bottomLeft = KeyC("צ", swipeReturnAction = CommitText("ץ")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("מ", size = LARGE),
                    right = KeyC("ם", swipeReturnAction = CommitText("מ")),
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
                    swipeType = FOUR_WAY_DIAGONAL,
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ת", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
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
                    swipeType = FOUR_WAY_DIAGONAL,
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
        locales = listOf("he"),
        modes =
            KeyboardDefinitionModes(
                main = KB_HE_MESSAGEASE_MAIN,
                shifted = KB_HE_MESSAGEASE_MAIN,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
    )
