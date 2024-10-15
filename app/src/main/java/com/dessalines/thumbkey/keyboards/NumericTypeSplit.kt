package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC

val TYPESPLIT_NUMERIC_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                textEditKeyItem(
                    center = KeyC(" "),
                ),
                KeyItemC(
                    center = KeyC("1", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("!"),
                    top = KeyC("¯\\_(ツ)_/¯", size = FontSizeVariant.SMALLEST),
                    bottom = KeyC("~"),
                    left = KeyC("{"),
                ),
                KeyItemC(
                    center = KeyC("2", size = FontSizeVariant.LARGE),
                    bottom = KeyC("@"),
                    topLeft = KeyC("`"),
                    topRight = KeyC("´"),
                ),
                KeyItemC(
                    center = KeyC("3", size = FontSizeVariant.LARGE),
                    right = KeyC("}"),
                    topRight = KeyC("°"),
                    bottomLeft = KeyC("#"),
                ),
                KeyItemC(
                    center = KeyC(".", size = FontSizeVariant.LARGE),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC(" "),
                    top = KeyC("+"),
                    bottom = KeyC("="),
                    left = KeyC("-"),
                    right = KeyC("_"),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
                KeyItemC(
                    center = KeyC("4", size = FontSizeVariant.LARGE),
                    top = KeyC("\""),
                    bottom = KeyC(":"),
                    left = KeyC("("),
                    right = KeyC("$"),
                ),
                KeyItemC(
                    center = KeyC("5", size = FontSizeVariant.LARGE),
                    left = KeyC("€"),
                    right = KeyC("£"),
                    bottom = KeyC("%"),
                ),
                KeyItemC(
                    center = KeyC("6", size = FontSizeVariant.LARGE),
                    top = KeyC("'"),
                    bottom = KeyC(";"),
                    left = KeyC("^"),
                    right = KeyC(")"),
                ),
                KeyItemC(
                    center = KeyC(",", size = FontSizeVariant.LARGE),
                ),
            ),
            listOf(
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("7", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("["),
                    topRight = KeyC("&"),
                    bottomLeft = KeyC("<"),
                ),
                KeyItemC(
                    center = KeyC("8", size = FontSizeVariant.LARGE),
                    top = KeyC("*"),
                    bottom = KeyC("?"),
                    left = KeyC("/"),
                    right = KeyC("\\"),
                ),
                KeyItemC(
                    center = KeyC("9", size = FontSizeVariant.LARGE),
                    left = KeyC("|"),
                    topRight = KeyC("]"),
                    bottomRight = KeyC(">"),
                ),
                KeyItemC(
                    center = KeyC("0", size = FontSizeVariant.LARGE),
                ),
            ),
            listOf(
                ABC_KEY_ITEM_ALT,
                BACKSPACE_WIDE_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
