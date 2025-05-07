@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_JA_KANA_THUMBKEY_HIRAGANA =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ま", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("み"),
                    top = KeyC("む"),
                    left = KeyC("め"),
                    bottom = KeyC("も"),
                ),
                KeyItemC(
                    center = KeyC("は", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ひ"),
                    top = KeyC("ふ"),
                    left = KeyC("へ"),
                    bottom = KeyC("ほ"),
                ),
                KeyItemC(
                    center = KeyC("さ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("し"),
                    top = KeyC("す"),
                    left = KeyC("せ"),
                    bottom = KeyC("そ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("や", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("）"),
                    top = KeyC("ゆ"),
                    left = KeyC("（"),
                    bottom = KeyC("よ"),
                ),
                KeyItemC(
                    center = KeyC("な", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("に"),
                    top = KeyC("ぬ"),
                    left = KeyC("ね"),
                    bottom = KeyC("の"),
                ),
                KeyItemC(
                    center = KeyC("か", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("き"),
                    top = KeyC("く"),
                    left = KeyC("け"),
                    bottom = KeyC("こ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ら", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("り"),
                    top = KeyC("る"),
                    left = KeyC("れ"),
                    bottom = KeyC("ろ"),
                ),
                KeyItemC(
                    center = KeyC("た", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ち"),
                    top = KeyC("つ"),
                    left = KeyC("て"),
                    bottom = KeyC("と"),
                ),
                KeyItemC(
                    center = KeyC("あ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("い"),
                    top = KeyC("う"),
                    left = KeyC("え"),
                    bottom = KeyC("お"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("わ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ー"),
                    top = KeyC("ん"),
                    left = KeyC("〜"),
                    bottom = KeyC("を"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ア"),
                            action = ShiftAndCapsLock(true),
                            size = LARGE,
                            color = MUTED,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("␣"),
                            action = CommitText(" "),
                        ),
                    left = KeyC("「"),
                    top = KeyC("・"),
                    right = KeyC("」"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("゛小"),
                            action = ComposeLastKey("゛"),
                            size = LARGE,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("！"),
                    left = KeyC("。"),
                    top = KeyC("？"),
                    right = KeyC("、"),
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
                    center = KeyC("マ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ミ"),
                    top = KeyC("ム"),
                    left = KeyC("メ"),
                    bottom = KeyC("モ"),
                ),
                KeyItemC(
                    center = KeyC("ハ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ヒ"),
                    top = KeyC("フ"),
                    left = KeyC("ヘ"),
                    bottom = KeyC("ホ"),
                ),
                KeyItemC(
                    center = KeyC("サ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("シ"),
                    top = KeyC("ス"),
                    left = KeyC("セ"),
                    bottom = KeyC("ソ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ヤ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("）"),
                    top = KeyC("ユ"),
                    left = KeyC("（"),
                    bottom = KeyC("ヨ"),
                ),
                KeyItemC(
                    center = KeyC("ナ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ニ"),
                    top = KeyC("ヌ"),
                    left = KeyC("ネ"),
                    bottom = KeyC("ノ"),
                ),
                KeyItemC(
                    center = KeyC("カ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("キ"),
                    top = KeyC("ク"),
                    left = KeyC("ケ"),
                    bottom = KeyC("コ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ラ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("リ"),
                    top = KeyC("ル"),
                    left = KeyC("レ"),
                    bottom = KeyC("ロ"),
                ),
                KeyItemC(
                    center = KeyC("タ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("チ"),
                    top = KeyC("ツ"),
                    left = KeyC("テ"),
                    bottom = KeyC("ト"),
                ),
                KeyItemC(
                    center = KeyC("ア", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("イ"),
                    top = KeyC("ウ"),
                    left = KeyC("エ"),
                    bottom = KeyC("オ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ワ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ー"),
                    top = KeyC("ン"),
                    left = KeyC("〜"),
                    bottom = KeyC("ヲ"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("あ"),
                            action = ShiftAndCapsLock(false),
                            size = LARGE,
                            color = MUTED,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("␣"),
                            action = CommitText(" "),
                        ),
                    left = KeyC("「"),
                    top = KeyC("・"),
                    right = KeyC("」"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("゛小"),
                            action = ComposeLastKey("゛"),
                            size = LARGE,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("！"),
                    left = KeyC("。"),
                    top = KeyC("？"),
                    right = KeyC("、"),
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
