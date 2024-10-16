@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val FARSI_NUMERIC_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("۱", size = LARGE),
                    right = KeyC("ّ", displayText = "ـّ"),
                    bottom = KeyC("٫"),
                    bottomLeft = KeyC("﷼"),
                ),
                KeyItemC(
                    center = KeyC("۲", size = LARGE),
                    topLeft = KeyC("`"),
                    top = KeyC("^"),
                    topRight = KeyC("´"),
                    right = KeyC("!"),
                    bottomRight = KeyC("\\"),
                    bottomLeft = KeyC("/"),
                    left = KeyC("+"),
                ),
                KeyItemC(
                    center = KeyC("۳", size = LARGE),
                    left = KeyC("؟"),
                    bottomRight = KeyC("$"),
                    bottom = KeyC("="),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("۴", size = LARGE),
                    topLeft = KeyC("}", displayText = "{"),
                    topRight = KeyC("٪"),
                    bottomRight = KeyC("_"),
                    bottomLeft = KeyC("]", displayText = "["),
                    left = KeyC(")", displayText = "("),
                ),
                KeyItemC(
                    center = KeyC("۵", size = LARGE),
                    topLeft = KeyC("ُ", displayText = "ـُ"),
                    topRight = KeyC("َ", displayText = "ـَ"),
                    bottom = KeyC("ِ", displayText = "ـِ"),
                ),
                KeyItemC(
                    center = KeyC("۶", size = LARGE),
                    topLeft = KeyC("|"),
                    topRight = KeyC("{", displayText = "}"),
                    right = KeyC("(", displayText = ")"),
                    bottomRight = KeyC("[", displayText = "]"),
                    bottomLeft = KeyC("@"),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("۷", size = LARGE),
                    topLeft = KeyC("~"),
                    topRight = KeyC("ً", displayText = "ـً"),
                    bottomRight = KeyC(":"),
                    bottomLeft = KeyC(">", displayText = "<"),
                    left = KeyC("»", displayText = "«"),
                ),
                KeyItemC(
                    center = KeyC("۸", size = LARGE),
                    topLeft = KeyC("\""),
                    topRight = KeyC("'"),
                    bottomRight = KeyC("-"),
                    bottom = KeyC("."),
                    bottomLeft = KeyC("*"),
                    left = KeyC("،"),
                ),
                KeyItemC(
                    center = KeyC("۹", size = LARGE),
                    top = KeyC("&"),
                    topRight = KeyC("°"),
                    right = KeyC("«", displayText = "»"),
                    bottomRight = KeyC("<", displayText = ">"),
                    bottomLeft = KeyC("؛"),
                    left = KeyC("#"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("۰", size = LARGE),
                    widthMultiplier = 2,
                ),
                SPACEBAR_FARSI_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
