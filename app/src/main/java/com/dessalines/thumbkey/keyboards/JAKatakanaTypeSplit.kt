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

val KB_JA_KATAKANA_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ワ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("ン")),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ン"),
                        ),
                    bottom = KeyC(KeyAction.CommitText("ヲ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("タ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("テ")),
                    left = KeyC(KeyAction.CommitText("チ")),
                    bottom = KeyC(KeyAction.CommitText("ト")),
                    top = KeyC(KeyAction.CommitText("ツ")),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ヤ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ユ"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ヨ"),
                        ),
                    bottom = KeyC(KeyAction.CommitText("ヨ")),
                    top = KeyC(KeyAction.CommitText("ユ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ラ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("レ")),
                    left = KeyC(KeyAction.CommitText("リ")),
                    bottom = KeyC(KeyAction.CommitText("ロ")),
                    top = KeyC(KeyAction.CommitText("ル")),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ア"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("イ")),
                    left = KeyC(KeyAction.CommitText("エ")),
                    bottom = KeyC(KeyAction.CommitText("オ")),
                    top = KeyC(KeyAction.CommitText("ウ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("サ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("セ")),
                    left = KeyC(KeyAction.CommitText("シ")),
                    bottom = KeyC(KeyAction.CommitText("ソ")),
                    top = KeyC(KeyAction.CommitText("ス")),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ハ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("ヒ")),
                    left = KeyC(KeyAction.CommitText("ヘ")),
                    bottom = KeyC(KeyAction.CommitText("ホ")),
                    top = KeyC(KeyAction.CommitText("フ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("カ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("ケ")),
                    left = KeyC(KeyAction.CommitText("キ")),
                    bottom = KeyC(KeyAction.CommitText("コ")),
                    top = KeyC(KeyAction.CommitText("ク")),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("、"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("」"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("「"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ー"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("～"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("。"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("？"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("！"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("："),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("…"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ナ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("ニ")),
                    left = KeyC(KeyAction.CommitText("ネ")),
                    bottom = KeyC(KeyAction.CommitText("ノ")),
                    top = KeyC(KeyAction.CommitText("ヌ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("マ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("メ")),
                    left = KeyC(KeyAction.CommitText("ミ")),
                    bottom = KeyC(KeyAction.CommitText("モ")),
                    top = KeyC(KeyAction.CommitText("ム")),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_JA_KATAKANA_TYPESPLIT_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("¥"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("※"),
                        ),
                    left = KeyC(KeyAction.CommitText("※")),
                    bottom = KeyC(KeyAction.CommitText("ヶ")),
                    top = KeyC(KeyAction.CommitText("ヵ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ダ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("デ")),
                    left = KeyC(KeyAction.CommitText("ヂ")),
                    bottom = KeyC(KeyAction.CommitText("ド")),
                    top = KeyC(KeyAction.CommitText("ヅ")),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ャ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ュ"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ョ"),
                        ),
                    bottom = KeyC(KeyAction.CommitText("ョ")),
                    top = KeyC(KeyAction.CommitText("ュ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ヴ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ァ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("ィ")),
                    left = KeyC(KeyAction.CommitText("ェ")),
                    bottom = KeyC(KeyAction.CommitText("ォ")),
                    top = KeyC(KeyAction.CommitText("ゥ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ザ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("ゼ")),
                    left = KeyC(KeyAction.CommitText("ジ")),
                    bottom = KeyC(KeyAction.CommitText("ゾ")),
                    top = KeyC(KeyAction.CommitText("ズ")),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("バ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("ビ")),
                    left = KeyC(KeyAction.CommitText("ベ")),
                    bottom = KeyC(KeyAction.CommitText("ボ")),
                    top = KeyC(KeyAction.CommitText("ブ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ガ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("ゲ")),
                    left = KeyC(KeyAction.CommitText("ギ")),
                    bottom = KeyC(KeyAction.CommitText("ゴ")),
                    top = KeyC(KeyAction.CommitText("グ")),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("・"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("】"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("【"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("："),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("〃"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("＝"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("×"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("÷"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("＋"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("－"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("パ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("ピ")),
                    left = KeyC(KeyAction.CommitText("ペ")),
                    bottom = KeyC(KeyAction.CommitText("ポ")),
                    top = KeyC(KeyAction.CommitText("プ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ッ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_JA_KATAKANA_TYPESPLIT: KeyboardDefinition =
    KeyboardDefinition(
        title = "japanese katakana type-split",
        modes =
            KeyboardDefinitionModes(
                main = KB_JA_KATAKANA_TYPESPLIT_MAIN,
                shifted = KB_JA_KATAKANA_TYPESPLIT_SHIFTED,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
