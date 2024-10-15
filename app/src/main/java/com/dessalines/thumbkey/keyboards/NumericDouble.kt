package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC

val DOUBLE_NUMERIC_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("1"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("$"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("2"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("`"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("^"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("´"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("!"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("\\"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("/"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("+"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("3"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("?"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("€"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("£"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("="),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("1"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("$"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("2"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("`"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("^"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("´"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("!"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("\\"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("/"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("+"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("3"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("?"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("€"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("£"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("="),
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("4"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("{"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("%"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("_"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("["),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("("),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("5"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("6"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("|"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("}"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText(")"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("]"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("@"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("4"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("{"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("%"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("_"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("["),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("("),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("5"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("6"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("|"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("}"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText(")"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("]"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("@"),
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("7"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("~"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(":"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("<"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("8"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("\""),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText(","),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("9"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("&"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("°"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(">"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText(";"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("#"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("7"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("~"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(":"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("<"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("8"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("\""),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText(","),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("9"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("&"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("°"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(">"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText(";"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("#"),
                        ),
                ),
            ),
            listOf(
                ABC_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("0"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                // EMOJI_KEY_ITEM,
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText(" "),
                        ),
                    nextTapActions =
                        listOf(
                            KeyAction.ReplaceLastText(". ", trimCount = 1),
                            KeyAction.ReplaceLastText(", "),
                            KeyAction.ReplaceLastText("? "),
                            KeyAction.ReplaceLastText("! "),
                            KeyAction.ReplaceLastText(": "),
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("0"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )
