@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*

val ARABIC_NUMERIC_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    bottomLeft = KeyC("$"),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    topLeft = KeyC("`"),
                    top = KeyC("^"),
                    topRight = KeyC("´"),
                    right = KeyC("!"),
                    bottomRight = KeyC("\\"),
                    bottomLeft = KeyC("/"),
                    left = KeyC("+"),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    bottomRight = KeyC("€"),
                    bottomLeft = KeyC("£"),
                    bottom = KeyC("="),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    topLeft = KeyC("{"),
                    topRight = KeyC("%"),
                    bottomRight = KeyC("_"),
                    bottomLeft = KeyC("["),
                    left = KeyC("("),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    topLeft = KeyC("ً"),
                    top = KeyC("ّ"),
                    topRight = KeyC("َ"),
                    right = KeyC("ُ"),
                    bottomRight = KeyC("ِ"),
                    bottom = KeyC("ْ"),
                    bottomLeft = KeyC("ٍ"),
                    left = KeyC("ٌ"),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
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
                    center = KeyC("7", size = LARGE),
                    topLeft = KeyC("~"),
                    topRight = KeyC("-"),
                    bottomRight = KeyC(":"),
                    bottomLeft = KeyC("!"),
                    left = KeyC("<"),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    topLeft = KeyC("\""),
                    top = KeyC("*"),
                    topRight = KeyC("'"),
                    right = KeyC("؛"),
                    bottomRight = KeyC("،"),
                    bottom = KeyC("."),
                    bottomLeft = KeyC("؟"),
                    left = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    top = KeyC("&"),
                    topRight = KeyC("°"),
                    right = KeyC(">"),
                    bottomLeft = KeyC(";"),
                    left = KeyC("#"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                    widthMultiplier = 2,
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
