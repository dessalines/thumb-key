package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.SwipeDirection

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
                    swipes =
                        mapOf(
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ـّ"),
                                    action = KeyAction.CommitText("ّ"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("٫"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("﷼"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۲"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("`"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("^"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("´"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("!"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("\\"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("/"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("+"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۳"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("؟"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("$"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("="),
                                ),
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
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("{"),
                                    action = KeyAction.CommitText("}"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("٪"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("_"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("["),
                                    action = KeyAction.CommitText("]"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("("),
                                    action = KeyAction.CommitText(")"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۵"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ـُ"),
                                    action = KeyAction.CommitText("ُ"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ـَ"),
                                    action = KeyAction.CommitText("َ"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ـِ"),
                                    action = KeyAction.CommitText("ِ"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۶"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("|"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("}"),
                                    action = KeyAction.CommitText("{"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(")"),
                                    action = KeyAction.CommitText("("),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("]"),
                                    action = KeyAction.CommitText("["),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("@"),
                                ),
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
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("~"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ـً"),
                                    action = KeyAction.CommitText("ً"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText(":"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("<"),
                                    action = KeyAction.CommitText(">"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("«"),
                                    action = KeyAction.CommitText("»"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۸"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("\""),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("'"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("-"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("."),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("*"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("،"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("۹"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("&"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("°"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("»"),
                                    action = KeyAction.CommitText("«"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(">"),
                                    action = KeyAction.CommitText("<"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("؛"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("#"),
                                ),
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
