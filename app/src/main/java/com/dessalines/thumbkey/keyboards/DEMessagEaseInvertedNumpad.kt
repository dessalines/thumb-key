@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.FontSizeVariant.LARGE
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.getLocalCurrency

val KB_DE_MESSAGEASE_INVERTED_NUMPAD_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    bottomLeft = KeyC("$"),
                    right = KeyC("-"),
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
                    center = KeyC("8", size = LARGE),
                    topLeft = KeyC("`"),
                    top = KeyC("^"),
                    topRight = KeyC("´"),
                    right = KeyC("!"),
                    bottomRight = KeyC("\\"),
                    bottomLeft = KeyC("/"),
                    left = KeyC("+"),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    left = KeyC("?"),
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
                    top = KeyC("¬"),
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
                    center = KeyC("1", size = LARGE),
                    topLeft = KeyC("~"),
                    left = KeyC("<"),
                    right = KeyC("*"),
                    bottomRight = KeyC("\t", displayText = "⇥"),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    topLeft = KeyC("\""),
                    topRight = KeyC("'"),
                    bottomRight = KeyC(":"),
                    bottom = KeyC("."),
                    bottomLeft = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
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

val KB_DE_MESSAGEASE_INVERTED_NUMPAD: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch messagease, inverted numpad",
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_MESSAGEASE_MAIN,
                shifted = KB_DE_MESSAGEASE_SHIFTED,
                numeric = KB_DE_MESSAGEASE_INVERTED_NUMPAD_NUMERIC,
            ),
    )
