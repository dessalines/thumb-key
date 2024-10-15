package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_JA_KATAKANA_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("マ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ミ")),
                    left = KeyC(KeyAction.CommitText("ム")),
                    top = KeyC(KeyAction.CommitText("メ")),
                    right = KeyC(KeyAction.CommitText("モ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ハ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ヒ")),
                    left = KeyC(KeyAction.CommitText("フ")),
                    top = KeyC(KeyAction.CommitText("ヘ")),
                    right = KeyC(KeyAction.CommitText("ホ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("サ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("シ")),
                    left = KeyC(KeyAction.CommitText("ス")),
                    top = KeyC(KeyAction.CommitText("セ")),
                    right = KeyC(KeyAction.CommitText("ソ")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ヤ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ユ")),
                    right = KeyC(KeyAction.CommitText("ヨ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ナ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ニ")),
                    left = KeyC(KeyAction.CommitText("ヌ")),
                    top = KeyC(KeyAction.CommitText("ネ")),
                    right = KeyC(KeyAction.CommitText("ノ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("カ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("キ")),
                    left = KeyC(KeyAction.CommitText("ク")),
                    top = KeyC(KeyAction.CommitText("ケ")),
                    right = KeyC(KeyAction.CommitText("コ")),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ラ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("リ")),
                    left = KeyC(KeyAction.CommitText("ル")),
                    top = KeyC(KeyAction.CommitText("レ")),
                    right = KeyC(KeyAction.CommitText("ロ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("タ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("チ")),
                    left = KeyC(KeyAction.CommitText("ツ")),
                    top = KeyC(KeyAction.CommitText("テ")),
                    right = KeyC(KeyAction.CommitText("ト")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ア"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("イ")),
                    left = KeyC(KeyAction.CommitText("ウ")),
                    top = KeyC(KeyAction.CommitText("エ")),
                    right = KeyC(KeyAction.CommitText("オ")),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ワ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ヰ")),
                    left = KeyC(KeyAction.CommitText("ン")),
                    top = KeyC(KeyAction.CommitText("ヱ")),
                    right = KeyC(KeyAction.CommitText("ヲ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("゛"),
                            action = KeyAction.ComposeLastKey("゛"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC(KeyAction.CommitText("。")),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("？"),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC(KeyAction.CommitText("、")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText(" ")),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_JA_KATAKANA_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("「"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("【")),
                    left = KeyC(KeyAction.CommitText("〔")),
                    top = KeyC(KeyAction.CommitText("〖")),
                    right = KeyC(KeyAction.CommitText("『")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("・"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC(KeyAction.CommitText("※")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("」"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("】")),
                    left = KeyC(KeyAction.CommitText("』")),
                    top = KeyC(KeyAction.CommitText("〗")),
                    right = KeyC(KeyAction.CommitText("〕")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("（"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("！"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("）"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ヿ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("？"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ヽ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ー"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("〜")),
                    top = KeyC(KeyAction.CommitText("…")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ア"),
                            action = KeyAction.ToggleShiftMode(false),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText(" ")),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_JA_KATAKANA_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "japanese katakana thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_JA_KATAKANA_THUMBKEY_MAIN,
                shifted = KB_JA_KATAKANA_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
