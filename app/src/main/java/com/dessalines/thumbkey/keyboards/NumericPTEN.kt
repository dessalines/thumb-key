@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val NUMERIC_PT_EN_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    bottomLeft = KeyC("$"),
                    bottomRight =
                        getLocalCurrency()?.let {
                            if (it !in setOf("$", "£", "€")) {
                                KeyC(it)
                            } else {
                                null
                            }
                        },
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
                    topLeft = KeyC("ù", color = MUTED),
                    top = KeyC("ü", color = MUTED),
                    topRight = KeyC("ũ", color = MUTED),
                    left = KeyC("?"),
                    right = KeyC("ò", color = MUTED),
                    bottomLeft = KeyC("£"),
                    bottom = KeyC("="),
                    bottomRight = KeyC("€"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    topLeft = KeyC("{"),
                    topRight = KeyC("%"),
                    left = KeyC("("),
                    bottomLeft = KeyC("["),
                    bottom = KeyC("@", color = MUTED),
                    bottomRight = KeyC("_"),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    topLeft = KeyC("|"),
                    topRight = KeyC("}"),
                    right = KeyC(")"),
                    bottomLeft = KeyC("@"),
                    bottomRight = KeyC("]"),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    topLeft = KeyC("~"),
                    bottomRight = KeyC(":"),
                    bottomLeft = KeyC("<"),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    topLeft = KeyC("\""),
                    top = KeyC("ì", color = MUTED),
                    topRight = KeyC("'"),
                    left = KeyC(","),
                    right = KeyC("î", color = MUTED),
                    bottomLeft = KeyC("*"),
                    bottom = KeyC("."),
                    bottomRight = KeyC("-"),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    topLeft = KeyC("è", color = MUTED),
                    top = KeyC("&"),
                    topRight = KeyC("°"),
                    bottomRight = KeyC(">"),
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
