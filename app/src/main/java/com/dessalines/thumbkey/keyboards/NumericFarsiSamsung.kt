package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC

val FARSI_NUMERIC_SAMSUNG_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("۱", size = FontSizeVariant.LARGE),
                    right = KeyC("ّ", displayText = "ـّ"),
                    bottom = KeyC("٫"),
                    bottomLeft = KeyC("﷼"),
                ),
                KeyItemC(
                    center = KeyC("۲", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("`"),
                    top = KeyC("^"),
                    topRight = KeyC("´"),
                    right = KeyC("!"),
                    bottomRight = KeyC("\\"),
                    bottomLeft = KeyC("/"),
                    left = KeyC("+"),
                ),
                KeyItemC(
                    center = KeyC("۳", size = FontSizeVariant.LARGE),
                    left = KeyC("؟"),
                    bottomRight = KeyC("$"),
                    bottom = KeyC("="),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("۴", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("{"),
                    topRight = KeyC("٪"),
                    bottomRight = KeyC("_"),
                    bottomLeft = KeyC("["),
                    left = KeyC("("),
                ),
                KeyItemC(
                    center = KeyC("۵", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("ُ", displayText = "ـُ"),
                    topRight = KeyC("َ", displayText = "ـَ"),
                    bottom = KeyC("ِ", displayText = "ـِ"),
                ),
                KeyItemC(
                    center = KeyC("۶", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("|"),
                    topRight = KeyC("}"),
                    right = KeyC(")"),
                    bottomRight = KeyC("]"),
                    bottomLeft = KeyC("@"),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("۷", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("~"),
                    topRight = KeyC("ً", displayText = "ـً"),
                    bottomRight = KeyC(":"),
                    bottomLeft = KeyC("<"),
                    left = KeyC("«"),
                ),
                KeyItemC(
                    center = KeyC("۸", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("\""),
                    topRight = KeyC("'"),
                    bottomRight = KeyC("-"),
                    bottom = KeyC("."),
                    bottomLeft = KeyC("*"),
                    left = KeyC("،"),
                ),
                KeyItemC(
                    center = KeyC("۹", size = FontSizeVariant.LARGE),
                    top = KeyC("&"),
                    topRight = KeyC("°"),
                    right = KeyC("»"),
                    bottomRight = KeyC(">"),
                    bottomLeft = KeyC("؛"),
                    left = KeyC("#"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("۰", size = FontSizeVariant.LARGE),
                    widthMultiplier = 2,
                ),
                SPACEBAR_FARSI_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
