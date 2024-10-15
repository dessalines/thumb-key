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
                            KeyAction.CommitText("მ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right = KeyC(KeyAction.CommitText("ხ")),
                    bottomRight = KeyC(KeyAction.CommitText("ვ")),
                    bottom = KeyC(KeyAction.CommitText("ც")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ბ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC(KeyAction.CommitText("ლ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ე"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC(KeyAction.CommitText("გ")),
                    bottomRight = KeyC(KeyAction.CommitText("ჰ")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ს"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("თ")),
                    bottom = KeyC(KeyAction.CommitText("ნ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("დ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("ძ")),
                    top = KeyC(KeyAction.CommitText("ჩ")),
                    topRight = KeyC(KeyAction.CommitText("ღ")),
                    right = KeyC(KeyAction.CommitText("პ")),
                    bottomRight = KeyC(KeyAction.CommitText("ქ")),
                    bottom = KeyC(KeyAction.CommitText("ფ")),
                    bottomLeft = KeyC(KeyAction.CommitText("ყ")),
                    left = KeyC(KeyAction.CommitText("ზ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ი"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC(KeyAction.CommitText("კ")),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("რ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight = KeyC(KeyAction.CommitText("წ")),
                    top = KeyC(KeyAction.CommitText("შ")),
                    right = KeyC(KeyAction.CommitText("ჟ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ო"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("ტ")),
                    right = KeyC(KeyAction.CommitText("ჯ")),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ა"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("უ")),
                    top = KeyC(KeyAction.CommitText("ჭ")),
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
