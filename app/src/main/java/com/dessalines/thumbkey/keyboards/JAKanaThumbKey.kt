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
                            action = KeyAction.CommitText("ま"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("み"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("む"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("め"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("も"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("は"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ひ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ふ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("へ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ほ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("さ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("し"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("す"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("せ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("そ"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("や"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("）"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ゆ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("（"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("よ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("な"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("に"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ぬ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ね"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("の"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("か"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("き"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("く"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("け"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("こ"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ら"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("り"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("る"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("れ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ろ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("た"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ち"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("つ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("て"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("と"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("あ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("い"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("う"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("え"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("お"),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("わ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ー"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ん"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("〜"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("を"),
                        ),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("…"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("「"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("・"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("」"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("゛小"),
                            action = KeyAction.ComposeLastKey("゛"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("！"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("。"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("？"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("、"),
                        ),
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
                            action = KeyAction.CommitText("）"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ユ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("（"),
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
                            action = KeyAction.CommitText("ー"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ン"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("〜"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ヲ"),
                        ),
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("…"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("「"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("・"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("」"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("゛小"),
                            action = KeyAction.ComposeLastKey("゛"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("！"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("。"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("？"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("、"),
                        ),
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
