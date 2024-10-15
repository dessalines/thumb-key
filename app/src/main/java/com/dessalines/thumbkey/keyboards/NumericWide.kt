package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Abc
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.SwipeNWay
import com.dessalines.thumbkey.utils.getLocalCurrency

val WIDE_NUMERIC_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("1", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("¬"),
                    topRight =
                        KeyC(
                            // secret! (to avoid excessive visual noise)
                            display = KeyDisplay.TextDisplay(""),
                            action = KeyAction.CommitText("¹"),
                        ),
                    bottomLeft = KeyC("_"),
                    bottomRight = KeyC("|"),
                ),
                KeyItemC(
                    center = KeyC("2", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("°"),
                    topRight =
                        KeyC(
                            // secret! (to avoid excessive visual noise)
                            display = KeyDisplay.TextDisplay(""),
                            action = KeyAction.CommitText("²"),
                        ),
                    bottomLeft = KeyC(":"),
                    bottomRight = KeyC(";"),
                ),
                KeyItemC(
                    center = KeyC("3", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("^"),
                    topRight =
                        KeyC(
                            // secret! (to avoid excessive visual noise)
                            display = KeyDisplay.TextDisplay(""),
                            action = KeyAction.CommitText("³"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("(", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("<"),
                    left = KeyC("{"),
                    right = KeyC("["),
                ),
                KeyItemC(
                    center = KeyC("4", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
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
                    center = KeyC("5", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("!"),
                    topRight = KeyC("?"),
                    bottomRight = KeyC("."),
                    bottomLeft = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("6", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("`"),
                    topRight = KeyC("´"),
                    bottomLeft = KeyC("\""),
                    bottomRight = KeyC("'"),
                ),
                KeyItemC(
                    center = KeyC(")", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC(">"),
                    left = KeyC("]"),
                    right = KeyC("}"),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.Abc),
                            action = KeyAction.ToggleNumericMode(false),
                            size = FontSizeVariant.LARGE,
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
                KeyItemC(
                    center = KeyC("7", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("="),
                    topRight = KeyC("%"),
                    bottomLeft = KeyC("-"),
                    bottomRight = KeyC("+"),
                ),
                KeyItemC(
                    center = KeyC("8", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("@"),
                    topRight = KeyC("&"),
                    bottomLeft = KeyC("*"),
                    bottomRight = KeyC("#"),
                ),
                KeyItemC(
                    center = KeyC("9", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("~"),
                    bottomLeft = KeyC("\\"),
                    bottomRight = KeyC("/"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.Abc),
                            action = KeyAction.ToggleNumericMode(false),
                            size = FontSizeVariant.LARGE,
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("0", size = FontSizeVariant.LARGE),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
