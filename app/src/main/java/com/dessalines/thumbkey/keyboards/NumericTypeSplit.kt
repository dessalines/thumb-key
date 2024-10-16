@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val TYPESPLIT_NUMERIC_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                textEditKeyItem(
                    center = KeyC(" "),
                ),
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    bottomRight = KeyC("!"),
                    top = KeyC("¯\\_(ツ)_/¯", size = SMALLEST),
                    bottom = KeyC("~"),
                    left = KeyC("{"),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    bottom = KeyC("@"),
                    topLeft = KeyC("`"),
                    topRight = KeyC("´"),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    right = KeyC("}"),
                    topRight = KeyC("°"),
                    bottomLeft = KeyC("#"),
                ),
                KeyItemC(
                    center = KeyC(".", size = LARGE),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC(" "),
                    top = KeyC("+"),
                    bottom = KeyC("="),
                    left = KeyC("-"),
                    right = KeyC("_"),
                    backgroundColor = SURFACE_VARIANT,
                ),
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    top = KeyC("\""),
                    bottom = KeyC(":"),
                    left = KeyC("("),
                    right = KeyC("$"),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    left = KeyC("€"),
                    right = KeyC("£"),
                    bottom = KeyC("%"),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    top = KeyC("'"),
                    bottom = KeyC(";"),
                    left = KeyC("^"),
                    right = KeyC(")"),
                ),
                KeyItemC(
                    center = KeyC(",", size = LARGE),
                ),
            ),
            listOf(
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    topLeft = KeyC("["),
                    topRight = KeyC("&"),
                    bottomLeft = KeyC("<"),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    top = KeyC("*"),
                    bottom = KeyC("?"),
                    left = KeyC("/"),
                    right = KeyC("\\"),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    left = KeyC("|"),
                    topRight = KeyC("]"),
                    bottomRight = KeyC(">"),
                ),
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                ),
            ),
            listOf(
                ABC_KEY_ITEM_ALT,
                BACKSPACE_WIDE_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
