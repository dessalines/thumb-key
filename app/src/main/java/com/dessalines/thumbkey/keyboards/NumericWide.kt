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
                    center =
                        KeyC(
                            action = KeyAction.CommitText("1"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("¬"),
                        ),
                    topRight =
                        KeyC(
                            // secret! (to avoid excessive visual noise)
                            display = KeyDisplay.TextDisplay(""),
                            action = KeyAction.CommitText("¹"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("_"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("|"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("2"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("°"),
                        ),
                    topRight =
                        KeyC(
                            // secret! (to avoid excessive visual noise)
                            display = KeyDisplay.TextDisplay(""),
                            action = KeyAction.CommitText("²"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(";"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("3"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("^"),
                        ),
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
                    center =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            action = KeyAction.CommitText("<"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("{"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("["),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("4"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("€"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("$"),
                        ),
                    bottomRight =
                        getLocalCurrency()?.let {
                            if (it !in setOf("$", "£", "€")) {
                                KeyC(
                                    action = KeyAction.CommitText(it),
                                )
                            } else {
                                KeyC(
                                    action = KeyAction.CommitText("£"),
                                )
                            }
                        },
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("5"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("."),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(","),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("6"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("`"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("´"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("\""),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            action = KeyAction.CommitText(">"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("]"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("}"),
                        ),
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
                    center =
                        KeyC(
                            action = KeyAction.CommitText("7"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("="),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("%"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("+"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("8"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("&"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("*"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("#"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("9"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("~"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("\\"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("/"),
                        ),
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
                    center =
                        KeyC(
                            action = KeyAction.CommitText("0"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
