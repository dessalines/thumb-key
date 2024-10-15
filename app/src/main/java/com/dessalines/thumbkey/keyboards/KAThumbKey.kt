package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_KA_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("მ", size = FontSizeVariant.LARGE),
                    right = KeyC("ხ"),
                    bottomRight = KeyC("ვ"),
                    bottom = KeyC("ც"),
                ),
                KeyItemC(
                    center = KeyC("ბ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("ლ"),
                ),
                KeyItemC(
                    center = KeyC("ე", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("გ"),
                    bottomRight = KeyC("ჰ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ს", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("თ"),
                    bottom = KeyC("ნ"),
                ),
                KeyItemC(
                    center = KeyC("დ", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("ძ"),
                    top = KeyC("ჩ"),
                    topRight = KeyC("ღ"),
                    right = KeyC("პ"),
                    bottomRight = KeyC("ქ"),
                    bottom = KeyC("ფ"),
                    bottomLeft = KeyC("ყ"),
                    left = KeyC("ზ"),
                ),
                KeyItemC(
                    center = KeyC("ი", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC("კ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("რ", size = FontSizeVariant.LARGE),
                    topRight = KeyC("წ"),
                    top = KeyC("შ"),
                    right = KeyC("ჟ"),
                ),
                KeyItemC(
                    center = KeyC("ო", size = FontSizeVariant.LARGE),
                    top = KeyC("ტ"),
                    right = KeyC("ჯ"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    left = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("ა", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("უ"),
                    top = KeyC("ჭ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_KA_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "kartuli ena thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_KA_THUMBKEY_MAIN,
                shifted = KB_KA_THUMBKEY_MAIN,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
