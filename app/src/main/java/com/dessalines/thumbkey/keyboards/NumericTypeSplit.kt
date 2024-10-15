package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC

val TYPESPLIT_NUMERIC_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                textEditKeyItem(
                    center =
                        KeyC(
                            action = KeyAction.CommitText(" "),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("1"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("¯\\_(ツ)_/¯"),
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("~"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("{"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("2"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("`"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("´"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("3"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("}"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("°"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("#"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText(" "),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("+"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("="),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("_"),
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("4"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("\""),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("("),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("$"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("5"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("€"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("£"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("%"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("6"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText(";"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("^"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
            ),
            listOf(
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("7"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("["),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("&"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("<"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("8"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("*"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("/"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("\\"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("9"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("|"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("]"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(">"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("0"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
            ),
            listOf(
                ABC_KEY_ITEM_ALT,
                BACKSPACE_WIDE_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
