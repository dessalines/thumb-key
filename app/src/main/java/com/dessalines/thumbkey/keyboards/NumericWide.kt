@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val WIDE_NUMERIC_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("¬"),
                    topRight =
                        KeyC(
                            // secret! (to avoid excessive visual noise)
                            display = KeyDisplay.TextDisplay(""),
                            action = CommitText("¹"),
                        ),
                    bottom = KeyC("_"),
                    bottomRight = KeyC("|"),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("°"),
                    topRight =
                        KeyC(
                            // secret! (to avoid excessive visual noise)
                            display = KeyDisplay.TextDisplay(""),
                            action = CommitText("²"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("^"),
                    topRight =
                        KeyC(
                            // secret! (to avoid excessive visual noise)
                            display = KeyDisplay.TextDisplay(""),
                            action = CommitText("³"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("(", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("<"),
                    topLeft = KeyC("{"),
                    left =
                        KeyC(
                            // secret! (to avoid excessive visual noise)
                            display = KeyDisplay.TextDisplay(""),
                            action = CommitText("("),
                        ),
                    bottomLeft = KeyC("["),
                    bottom = KeyC(":"),
                ),
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("€"),
                    bottomLeft = KeyC("$"),
                    bottomRight =
                        getLocalCurrency()?.let {
                            if (it !in setOf("$", "£", "€")) {
                                KeyC(it)
                            } else {
                                KeyC("£")
                            }
                        },
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("!"),
                    topRight = KeyC("?"),
                    bottomRight = KeyC("."),
                    bottomLeft = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("`"),
                    topRight = KeyC("´"),
                    bottomLeft = KeyC("\""),
                    bottomRight = KeyC("'"),
                ),
                KeyItemC(
                    center = KeyC(")", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC(">"),
                    topRight = KeyC("}"),
                    right =
                        KeyC(
                            // secret! (to avoid excessive visual noise)
                            display = KeyDisplay.TextDisplay(""),
                            action = CommitText(")"),
                        ),
                    bottomRight = KeyC("]"),
                    bottom = KeyC(";"),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.Abc),
                            action = ToggleNumericMode(false),
                            size = LARGE,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                ),
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    swipeType = EIGHT_WAY,
                    left = KeyC("@"),
                    top = KeyC("&"),
                    topRight = KeyC("%"),
                    bottomLeft = KeyC("-"),
                    bottom = KeyC("="),
                    bottomRight = KeyC("+"),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("*"),
                    bottomRight = KeyC("#"),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("~"),
                    bottomLeft = KeyC("\\"),
                    bottomRight = KeyC("/"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.Abc),
                            action = ToggleNumericMode(false),
                            size = LARGE,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
