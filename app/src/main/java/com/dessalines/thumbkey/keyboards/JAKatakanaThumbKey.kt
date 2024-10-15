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
                    center = KeyC("マ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("ミ"),
                    left = KeyC("ム"),
                    top = KeyC("メ"),
                    right = KeyC("モ"),
                ),
                KeyItemC(
                    center = KeyC("ハ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("ヒ"),
                    left = KeyC("フ"),
                    top = KeyC("ヘ"),
                    right = KeyC("ホ"),
                ),
                KeyItemC(
                    center = KeyC("サ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("シ"),
                    left = KeyC("ス"),
                    top = KeyC("セ"),
                    right = KeyC("ソ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ヤ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("ユ"),
                    right = KeyC("ヨ"),
                ),
                KeyItemC(
                    center = KeyC("ナ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("ニ"),
                    left = KeyC("ヌ"),
                    top = KeyC("ネ"),
                    right = KeyC("ノ"),
                ),
                KeyItemC(
                    center = KeyC("カ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("キ"),
                    left = KeyC("ク"),
                    top = KeyC("ケ"),
                    right = KeyC("コ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ラ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("リ"),
                    left = KeyC("ル"),
                    top = KeyC("レ"),
                    right = KeyC("ロ"),
                ),
                KeyItemC(
                    center = KeyC("タ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("チ"),
                    left = KeyC("ツ"),
                    top = KeyC("テ"),
                    right = KeyC("ト"),
                ),
                KeyItemC(
                    center = KeyC("ア", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("イ"),
                    left = KeyC("ウ"),
                    top = KeyC("エ"),
                    right = KeyC("オ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ワ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("ヰ"),
                    left = KeyC("ン"),
                    top = KeyC("ヱ"),
                    right = KeyC("ヲ"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("゛"),
                            action = KeyAction.ComposeLastKey("゛"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC("。"),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("？"),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC("、"),
                ),
                KeyItemC(
                    center = KeyC(" "),
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
                    center = KeyC("「", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("【"),
                    left = KeyC("〔"),
                    top = KeyC("〖"),
                    right = KeyC("『"),
                ),
                KeyItemC(
                    center = KeyC("・", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("※"),
                ),
                KeyItemC(
                    center = KeyC("」", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("】"),
                    left = KeyC("』"),
                    top = KeyC("〗"),
                    right = KeyC("〕"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("（", size = FontSizeVariant.LARGE),
                ),
                KeyItemC(
                    center = KeyC("！", size = FontSizeVariant.LARGE),
                ),
                KeyItemC(
                    center = KeyC("）", size = FontSizeVariant.LARGE),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ヿ", size = FontSizeVariant.LARGE),
                ),
                KeyItemC(
                    center = KeyC("？", size = FontSizeVariant.LARGE),
                ),
                KeyItemC(
                    center = KeyC("ヽ", size = FontSizeVariant.LARGE),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ー", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("〜"),
                    top = KeyC("…"),
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
                    center = KeyC(" "),
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
