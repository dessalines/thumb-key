@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_JA_KATAKANA_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("マ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ミ"),
                    left = KeyC("ム"),
                    top = KeyC("メ"),
                    right = KeyC("モ"),
                ),
                KeyItemC(
                    center = KeyC("ハ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ヒ"),
                    left = KeyC("フ"),
                    top = KeyC("ヘ"),
                    right = KeyC("ホ"),
                ),
                KeyItemC(
                    center = KeyC("サ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("シ"),
                    left = KeyC("ス"),
                    top = KeyC("セ"),
                    right = KeyC("ソ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ヤ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ユ"),
                    right = KeyC("ヨ"),
                ),
                KeyItemC(
                    center = KeyC("ナ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ニ"),
                    left = KeyC("ヌ"),
                    top = KeyC("ネ"),
                    right = KeyC("ノ"),
                ),
                KeyItemC(
                    center = KeyC("カ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("キ"),
                    left = KeyC("ク"),
                    top = KeyC("ケ"),
                    right = KeyC("コ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ラ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("リ"),
                    left = KeyC("ル"),
                    top = KeyC("レ"),
                    right = KeyC("ロ"),
                ),
                KeyItemC(
                    center = KeyC("タ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("チ"),
                    left = KeyC("ツ"),
                    top = KeyC("テ"),
                    right = KeyC("ト"),
                ),
                KeyItemC(
                    center = KeyC("ア", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("イ"),
                    left = KeyC("ウ"),
                    top = KeyC("エ"),
                    right = KeyC("オ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ワ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ヰ"),
                    left = KeyC("ン"),
                    top = KeyC("ヱ"),
                    right = KeyC("ヲ"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("゛"),
                            action = ComposeLastKey("゛"),
                            size = LARGE,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("。"),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("？"),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    right = KeyC("、"),
                ),
                KeyItemC(
                    center = KeyC(" "),
                    backgroundColor = SURFACE_VARIANT,
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
                    center = KeyC("「", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("【"),
                    left = KeyC("〔"),
                    top = KeyC("〖"),
                    right = KeyC("『"),
                ),
                KeyItemC(
                    center = KeyC("・", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("※"),
                ),
                KeyItemC(
                    center = KeyC("」", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("】"),
                    left = KeyC("』"),
                    top = KeyC("〗"),
                    right = KeyC("〕"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("（", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("！", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("）", size = LARGE),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ヿ", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("？", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("ヽ", size = LARGE),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ー", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("〜"),
                    top = KeyC("…"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ア"),
                            action = ToggleShiftMode(false),
                            size = LARGE,
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC(" "),
                    backgroundColor = SURFACE_VARIANT,
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
