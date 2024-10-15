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

val KB_HE_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("מ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("נ"),
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ב"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ע"),
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("א"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("כ"),
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ת"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ם"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("ץ"),
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ל"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ט"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ך"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ק"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("צ"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ס"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ז"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ג"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("ן"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ו"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("פ"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ף"),
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ר"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ש"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("”"),
                            color = ColorVariant.MUTED,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ה"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("״"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ד"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("׳"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("–"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("…"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("־"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("י"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ח"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("’"),
                            color = ColorVariant.MUTED,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_HE_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "עברית thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_HE_THUMBKEY_MAIN,
                shifted = KB_HE_THUMBKEY_MAIN,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
