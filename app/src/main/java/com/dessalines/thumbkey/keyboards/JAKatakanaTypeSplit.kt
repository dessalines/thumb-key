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
                    center = KeyC("ワ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ン"),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ン"),
                        ),
                    bottom = KeyC("ヲ"),
                ),
                KeyItemC(
                    center = KeyC("タ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("テ"),
                    left = KeyC("チ"),
                    bottom = KeyC("ト"),
                    top = KeyC("ツ"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("ヤ", size = FontSizeVariant.LARGE),
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
                    bottom = KeyC("ヨ"),
                    top = KeyC("ユ"),
                ),
                KeyItemC(
                    center = KeyC("ラ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("レ"),
                    left = KeyC("リ"),
                    bottom = KeyC("ロ"),
                    top = KeyC("ル"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ア", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("イ"),
                    left = KeyC("エ"),
                    bottom = KeyC("オ"),
                    top = KeyC("ウ"),
                ),
                KeyItemC(
                    center = KeyC("サ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("セ"),
                    left = KeyC("シ"),
                    bottom = KeyC("ソ"),
                    top = KeyC("ス"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("ハ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ヒ"),
                    left = KeyC("ヘ"),
                    bottom = KeyC("ホ"),
                    top = KeyC("フ"),
                ),
                KeyItemC(
                    center = KeyC("カ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ケ"),
                    left = KeyC("キ"),
                    bottom = KeyC("コ"),
                    top = KeyC("ク"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("、", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("」", color = ColorVariant.MUTED),
                    left = KeyC("「", color = ColorVariant.MUTED),
                    bottom = KeyC("ー", color = ColorVariant.MUTED),
                    top = KeyC("～", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("。", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("？", color = ColorVariant.MUTED),
                    left = KeyC("！", color = ColorVariant.MUTED),
                    bottom = KeyC("：", color = ColorVariant.MUTED),
                    top = KeyC("…", color = ColorVariant.MUTED),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("ナ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ニ"),
                    left = KeyC("ネ"),
                    bottom = KeyC("ノ"),
                    top = KeyC("ヌ"),
                ),
                KeyItemC(
                    center = KeyC("マ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("メ"),
                    left = KeyC("ミ"),
                    bottom = KeyC("モ"),
                    top = KeyC("ム"),
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
                    center = KeyC("¥", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("※"),
                        ),
                    left = KeyC("※"),
                    bottom = KeyC("ヶ"),
                    top = KeyC("ヵ"),
                ),
                KeyItemC(
                    center = KeyC("ダ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("デ"),
                    left = KeyC("ヂ"),
                    bottom = KeyC("ド"),
                    top = KeyC("ヅ"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("ャ", size = FontSizeVariant.LARGE),
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
                    bottom = KeyC("ョ"),
                    top = KeyC("ュ"),
                ),
                KeyItemC(
                    center = KeyC("ヴ", size = FontSizeVariant.LARGE),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ァ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ィ"),
                    left = KeyC("ェ"),
                    bottom = KeyC("ォ"),
                    top = KeyC("ゥ"),
                ),
                KeyItemC(
                    center = KeyC("ザ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ゼ"),
                    left = KeyC("ジ"),
                    bottom = KeyC("ゾ"),
                    top = KeyC("ズ"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("バ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ビ"),
                    left = KeyC("ベ"),
                    bottom = KeyC("ボ"),
                    top = KeyC("ブ"),
                ),
                KeyItemC(
                    center = KeyC("ガ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ゲ"),
                    left = KeyC("ギ"),
                    bottom = KeyC("ゴ"),
                    top = KeyC("グ"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("・", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("】", color = ColorVariant.MUTED),
                    left = KeyC("【", color = ColorVariant.MUTED),
                    bottom = KeyC("：", color = ColorVariant.MUTED),
                    top = KeyC("〃", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("＝", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("×", color = ColorVariant.MUTED),
                    left = KeyC("÷", color = ColorVariant.MUTED),
                    bottom = KeyC("＋", color = ColorVariant.MUTED),
                    top = KeyC("－", color = ColorVariant.MUTED),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("パ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ピ"),
                    left = KeyC("ペ"),
                    bottom = KeyC("ポ"),
                    top = KeyC("プ"),
                ),
                KeyItemC(
                    center = KeyC("ッ", size = FontSizeVariant.LARGE),
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
