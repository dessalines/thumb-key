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
                            action = KeyAction.CommitText("מ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("נ"),
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ב"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ע"),
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("א"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("כ"),
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ת"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ם"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ץ"),
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ל"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ט"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ך"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ק"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("צ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ס"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ז"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ג"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ן"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ו"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("פ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ף"),
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ר"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ש"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("”"),
                            color = ColorVariant.MUTED,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ה"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("״"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ד"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("׳"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("–"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("…"),
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
                    left =
                        KeyC(
                            action = KeyAction.CommitText("־"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("י"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ח"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("’"),
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
