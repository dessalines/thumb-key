@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val HYPER_NUMERIC_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("!", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    bottomRight = KeyC("?"),
                    top = KeyC(":(", size = SMALL),
                    bottom = KeyC("~"),
                    left = KeyC("{"),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    bottom = KeyC("@"),
                    topLeft = KeyC("`"),
                    topRight = KeyC("´"),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    top = KeyC(":)", size = SMALL),
                    right = KeyC("}"),
                    bottom = KeyC("°"),
                    bottomLeft = KeyC("#"),
                ),
                RETURN_KEY_ITEM
            ),
            listOf(
                KeyItemC(
                    center = KeyC(".", size = LARGE),
                    backgroundColor = SURFACE_VARIANT,
                ),
                KeyItemC(
                    center = KeyC("0", size = LARGE),
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
                    top = KeyC("&"),
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
                    center = KeyC("="),
                    top = KeyC("+"),
                    bottom = KeyC("-"),
                    left = KeyC("*"),
                    right = KeyC("/"),
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
            listOf(
                ABC_KEY_ITEM,
                KeyItemC(
                    center = KeyC(",", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    topLeft = KeyC("["),
                    bottomLeft = KeyC("<"),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    top = KeyC("*"),
                    left = KeyC("/"),
                    right = KeyC("\\"),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    left = KeyC("|"),
                    topRight = KeyC("]"),
                    bottomRight = KeyC(">"),
                ),
                EMOJI_KEY_ITEM
            ),
        ),
    )
