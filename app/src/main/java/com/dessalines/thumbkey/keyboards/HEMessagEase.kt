package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_HE_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ר", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("ן"),
                ),
                KeyItemC(
                    center = KeyC("ב", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("ג"),
                ),
                KeyItemC(
                    center = KeyC("א", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("צ"),
                    left = KeyC("ץ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("מ", size = FontSizeVariant.LARGE),
                    right = KeyC("ם"),
                    bottomRight = KeyC("ך"),
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
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("ף"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ת", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight = KeyC("ז"),
                ),
                KeyItemC(
                    center = KeyC("ה", size = FontSizeVariant.LARGE),
                    top = KeyC("ס"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("ל", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
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
