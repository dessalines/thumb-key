package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_HE_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ר"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ן"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ב"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ג"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("א"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("צ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ץ"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("מ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ם"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ך"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("י"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ק"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ח"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("פ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ד"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ש"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("נ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("כ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ע"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ו"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ף"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ת"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ז"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ה"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ס"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ל"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ט"),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_HE_MESSAGEASE: KeyboardDefinition =
    KeyboardDefinition(
        title = "עברית messagease",
        modes =
            KeyboardDefinitionModes(
                main = KB_HE_MESSAGEASE_MAIN,
                shifted = KB_HE_MESSAGEASE_MAIN,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
    )
