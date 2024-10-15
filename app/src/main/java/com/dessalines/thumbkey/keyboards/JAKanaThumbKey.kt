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

val KB_JA_KANA_THUMBKEY_HIRAGANA =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ま"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("み")),
                    left = KeyC(KeyAction.CommitText("む")),
                    top = KeyC(KeyAction.CommitText("め")),
                    right = KeyC(KeyAction.CommitText("も")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("は"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ひ")),
                    left = KeyC(KeyAction.CommitText("ふ")),
                    top = KeyC(KeyAction.CommitText("へ")),
                    right = KeyC(KeyAction.CommitText("ほ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("さ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("し")),
                    left = KeyC(KeyAction.CommitText("す")),
                    top = KeyC(KeyAction.CommitText("せ")),
                    right = KeyC(KeyAction.CommitText("そ")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("や"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("）")),
                    left = KeyC(KeyAction.CommitText("ゆ")),
                    top = KeyC(KeyAction.CommitText("（")),
                    right = KeyC(KeyAction.CommitText("よ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("な"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("に")),
                    left = KeyC(KeyAction.CommitText("ぬ")),
                    top = KeyC(KeyAction.CommitText("ね")),
                    right = KeyC(KeyAction.CommitText("の")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("か"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("き")),
                    left = KeyC(KeyAction.CommitText("く")),
                    top = KeyC(KeyAction.CommitText("け")),
                    right = KeyC(KeyAction.CommitText("こ")),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ら"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("り")),
                    left = KeyC(KeyAction.CommitText("る")),
                    top = KeyC(KeyAction.CommitText("れ")),
                    right = KeyC(KeyAction.CommitText("ろ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("た"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ち")),
                    left = KeyC(KeyAction.CommitText("つ")),
                    top = KeyC(KeyAction.CommitText("て")),
                    right = KeyC(KeyAction.CommitText("と")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("あ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("い")),
                    left = KeyC(KeyAction.CommitText("う")),
                    top = KeyC(KeyAction.CommitText("え")),
                    right = KeyC(KeyAction.CommitText("お")),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("わ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ー")),
                    left = KeyC(KeyAction.CommitText("ん")),
                    top = KeyC(KeyAction.CommitText("〜")),
                    right = KeyC(KeyAction.CommitText("を")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ア"),
                            action = KeyAction.ToggleCapsLock,
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.MUTED,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("…")),
                    left = KeyC(KeyAction.CommitText("「")),
                    top = KeyC(KeyAction.CommitText("・")),
                    right = KeyC(KeyAction.CommitText("」")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("゛小"),
                            action = KeyAction.ComposeLastKey("゛"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("！")),
                    left = KeyC(KeyAction.CommitText("。")),
                    top = KeyC(KeyAction.CommitText("？")),
                    right = KeyC(KeyAction.CommitText("、")),
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_JA_KANA_THUMBKEY_KATAKANA =
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
                    bottom = KeyC(KeyAction.CommitText("）")),
                    left = KeyC(KeyAction.CommitText("ユ")),
                    top = KeyC(KeyAction.CommitText("（")),
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
                    bottom = KeyC(KeyAction.CommitText("ー")),
                    left = KeyC(KeyAction.CommitText("ン")),
                    top = KeyC(KeyAction.CommitText("〜")),
                    right = KeyC(KeyAction.CommitText("ヲ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("あ"),
                            action = KeyAction.ToggleCapsLock,
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.MUTED,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("…")),
                    left = KeyC(KeyAction.CommitText("「")),
                    top = KeyC(KeyAction.CommitText("・")),
                    right = KeyC(KeyAction.CommitText("」")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("゛小"),
                            action = KeyAction.ComposeLastKey("゛"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("！")),
                    left = KeyC(KeyAction.CommitText("。")),
                    top = KeyC(KeyAction.CommitText("？")),
                    right = KeyC(KeyAction.CommitText("、")),
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_JA_KANA_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "japanese kana thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_JA_KANA_THUMBKEY_HIRAGANA,
                shifted = KB_JA_KANA_THUMBKEY_KATAKANA,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
