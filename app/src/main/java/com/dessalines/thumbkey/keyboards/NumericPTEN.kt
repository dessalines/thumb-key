package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.getLocalCurrency

val NUMERIC_PT_EN_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("1", size = FontSizeVariant.LARGE),
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
                    center = KeyC("2", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("`"),
                    top = KeyC("^"),
                    topRight = KeyC("´"),
                    right = KeyC("!"),
                    bottomRight = KeyC("\\"),
                    bottomLeft = KeyC("/"),
                    left = KeyC("+"),
                ),
                KeyItemC(
                    center = KeyC("3", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("ù", color = ColorVariant.MUTED),
                    top = KeyC("ü", color = ColorVariant.MUTED),
                    topRight = KeyC("ũ", color = ColorVariant.MUTED),
                    left = KeyC("?"),
                    right = KeyC("ò", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("£"),
                    bottom = KeyC("="),
                    bottomRight = KeyC("€"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("{"),
                    topRight = KeyC("%"),
                    left = KeyC("("),
                    bottomLeft = KeyC("["),
                    bottom = KeyC("@", color = ColorVariant.MUTED),
                    bottomRight = KeyC("_"),
                ),
                KeyItemC(
                    center = KeyC("5", size = FontSizeVariant.LARGE),
                ),
                KeyItemC(
                    center = KeyC("6", size = FontSizeVariant.LARGE),
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
                    center = KeyC("7", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("~"),
                    bottomRight = KeyC(":"),
                    bottomLeft = KeyC("<"),
                ),
                KeyItemC(
                    center = KeyC("8", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("\""),
                    top = KeyC("ì", color = ColorVariant.MUTED),
                    topRight = KeyC("'"),
                    left = KeyC(","),
                    right = KeyC("î", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*"),
                    bottom = KeyC("."),
                    bottomRight = KeyC("-"),
                ),
                KeyItemC(
                    center = KeyC("9", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("è", color = ColorVariant.MUTED),
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
                    center = KeyC("0", size = FontSizeVariant.LARGE),
                    widthMultiplier = 2,
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
