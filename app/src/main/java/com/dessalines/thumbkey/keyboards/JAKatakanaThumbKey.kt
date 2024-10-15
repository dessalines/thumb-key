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
                            action = KeyAction.CommitText("マ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ミ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ム"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("メ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("モ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ハ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ヒ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("フ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ヘ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ホ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("サ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("シ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ス"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("セ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ソ"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ヤ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ユ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ヨ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ナ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ニ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ヌ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ネ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ノ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("カ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("キ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ク"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ケ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("コ"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ラ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("リ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ル"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("レ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ロ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("タ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("チ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ツ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("テ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ト"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ア"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("イ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ウ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("エ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("オ"),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ワ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ヰ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ン"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ヱ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ヲ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("゛"),
                            action = KeyAction.ComposeLastKey("゛"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            action = KeyAction.CommitText("。"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("？"),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("、"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText(" "),
                        ),
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
                            action = KeyAction.CommitText("「"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("【"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("〔"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("〖"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("『"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("・"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("※"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("」"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("】"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("』"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("〗"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("〕"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("（"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("！"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("）"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ヿ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("？"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ヽ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ー"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("〜"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("…"),
                        ),
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
                    center =
                        KeyC(
                            action = KeyAction.CommitText(" "),
                        ),
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
