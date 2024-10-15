package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_HE_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("מ", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("נ"),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                ),
                KeyItemC(
                    center = KeyC("ב", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ע"),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                ),
                KeyItemC(
                    center = KeyC("א", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("כ"),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ת", size = FontSizeVariant.LARGE),
                    right = KeyC("ם"),
                    left = KeyC("ץ"),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                ),
                KeyItemC(
                    center = KeyC("ל", size = FontSizeVariant.LARGE),
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
                    center = KeyC("ו", size = FontSizeVariant.LARGE),
                    left = KeyC("פ"),
                    right = KeyC("ף"),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ר", size = FontSizeVariant.LARGE),
                    topRight = KeyC("ש"),
                    bottomRight = KeyC("”", color = ColorVariant.MUTED),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                ),
                KeyItemC(
                    center = KeyC("ה", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("״", color = ColorVariant.MUTED),
                    top = KeyC("ד"),
                    topRight = KeyC("׳", color = ColorVariant.MUTED),
                    right = KeyC("–", color = ColorVariant.MUTED),
                    bottomRight = KeyC("…", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    left = KeyC("־", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("י", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("ח"),
                    bottomLeft = KeyC("’", color = ColorVariant.MUTED),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
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
