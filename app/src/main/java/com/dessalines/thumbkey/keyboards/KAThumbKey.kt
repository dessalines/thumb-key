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

val KB_KA_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("მ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ხ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ვ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ც"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ბ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ლ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ე"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("გ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ჰ"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ს"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("თ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ნ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("დ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ძ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ჩ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ღ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("პ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ქ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ფ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ყ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ზ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ი"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            action = KeyAction.CommitText("კ"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("რ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("წ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("შ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ჟ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ო"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ტ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ჯ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
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
                            action = KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ა"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("უ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ჭ"),
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

val KB_KA_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "kartuli ena thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_KA_THUMBKEY_MAIN,
                shifted = KB_KA_THUMBKEY_MAIN,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
