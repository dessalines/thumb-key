package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC

val FARSI_NUMERIC_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۱"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ـّ"),
                            action = KeyAction.CommitText("ّ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("٫"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("﷼"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۲"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("`"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("^"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("´"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("\\"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("/"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("+"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۳"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("؟"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("$"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("="),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۴"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("{"),
                            action = KeyAction.CommitText("}"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("٪"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("_"),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("["),
                            action = KeyAction.CommitText("]"),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("("),
                            action = KeyAction.CommitText(")"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۵"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ـُ"),
                            action = KeyAction.CommitText("ُ"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ـَ"),
                            action = KeyAction.CommitText("َ"),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ـِ"),
                            action = KeyAction.CommitText("ِ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۶"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("|"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("}"),
                            action = KeyAction.CommitText("{"),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay(")"),
                            action = KeyAction.CommitText("("),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("]"),
                            action = KeyAction.CommitText("["),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                        ),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۷"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("~"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ـً"),
                            action = KeyAction.CommitText("ً"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("<"),
                            action = KeyAction.CommitText(">"),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("«"),
                            action = KeyAction.CommitText("»"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۸"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("\""),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("*"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("،"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۹"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("&"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("°"),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("»"),
                            action = KeyAction.CommitText("«"),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay(">"),
                            action = KeyAction.CommitText("<"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("؛"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("#"),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۰"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    widthMultiplier = 2,
                ),
                SPACEBAR_FARSI_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
