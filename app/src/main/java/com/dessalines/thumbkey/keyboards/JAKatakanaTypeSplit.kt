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
                            action = KeyAction.CommitText("ワ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ン"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ン"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ヲ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("タ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("テ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("チ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ト"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ツ"),
                        ),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ヤ"),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ヨ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ユ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ラ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("レ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("リ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ロ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ル"),
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ア"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("イ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("エ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("オ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ウ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("サ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("セ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("シ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ソ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ス"),
                        ),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ハ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ヒ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ヘ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ホ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("フ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("カ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ケ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("キ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("コ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ク"),
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("、"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("」"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("「"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ー"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("～"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("。"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("？"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("！"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("："),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("…"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ナ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ニ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ネ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ノ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ヌ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("マ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("メ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ミ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("モ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ム"),
                        ),
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
                            action = KeyAction.CommitText("¥"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("※"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("※"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ヶ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ヵ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ダ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("デ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ヂ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ド"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ヅ"),
                        ),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ャ"),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ョ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ュ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ヴ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ァ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ィ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ェ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ォ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ゥ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ザ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ゼ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ジ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ゾ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ズ"),
                        ),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("バ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ビ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ベ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ボ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ブ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ガ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ゲ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ギ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ゴ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("グ"),
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("・"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("】"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("【"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("："),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("〃"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("＝"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("×"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("÷"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("＋"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("－"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("パ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ピ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ペ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ポ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("プ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ッ"),
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
