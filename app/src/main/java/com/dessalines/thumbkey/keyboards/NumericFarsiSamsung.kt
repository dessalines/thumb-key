package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC

val FARSI_NUMERIC_SAMSUNG_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("۱"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ـّ"),
                            action = KeyAction.CommitText("ّ"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("٫"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("﷼"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("۲"),
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
                            KeyAction.CommitText("۳"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("؟"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("$"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("="),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("۴"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("{"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("٪"),
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
                            KeyAction.CommitText("۵"),
                            size = FontSizeVariant.LARGE,
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
                            KeyAction.CommitText("۶"),
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
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("۷"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("~"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ـً"),
                            action = KeyAction.CommitText("ً"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(":"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("<"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("«"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("۸"),
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
                            KeyAction.CommitText("،"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("۹"),
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
                    right =
                        KeyC(
                            KeyAction.CommitText("»"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(">"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("؛"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("#"),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("۰"),
                            size = FontSizeVariant.LARGE,
                        ),
                    widthMultiplier = 2,
                ),
                SPACEBAR_FARSI_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
