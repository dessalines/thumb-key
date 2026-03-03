@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_KA_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("მ", size = LARGE),
                    right = KeyC("ხ"),
                    bottomRight = KeyC("ვ"),
                    bottom = KeyC("ც"),
                ),
                KeyItemC(
                    center = KeyC("ბ", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("ლ"),
                ),
                KeyItemC(
                    center = KeyC("ე", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("გ"),
                    bottomRight = KeyC("ჰ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ს", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("თ"),
                    bottom = KeyC("ნ"),
                ),
                KeyItemC(
                    center = KeyC("დ", size = LARGE),
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
                    center = KeyC("ი", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("კ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("რ", size = LARGE),
                    topRight = KeyC("წ"),
                    top = KeyC("შ"),
                    right = KeyC("ჟ"),
                ),
                KeyItemC(
                    center = KeyC("ო", size = LARGE),
                    top = KeyC("ტ"),
                    right = KeyC("ჯ"),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ა", size = LARGE),
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
        locales = listOf("ka"),
    )
