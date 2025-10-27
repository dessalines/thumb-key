@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_JA_KANA_STANDARD_HIRAGANA =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("あ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("い"),
                    top = KeyC("う"),
                    right = KeyC("え"),
                    bottom = KeyC("お"),
                ),
                KeyItemC(
                    center = KeyC("か", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("き"),
                    top = KeyC("く"),
                    right = KeyC("け"),
                    bottom = KeyC("こ"),
                ),
                KeyItemC(
                    center = KeyC("さ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("し"),
                    top = KeyC("す"),
                    right = KeyC("せ"),
                    bottom = KeyC("そ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("た", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ち"),
                    top = KeyC("つ"),
                    right = KeyC("て"),
                    bottom = KeyC("と"),
                ),
                KeyItemC(
                    center = KeyC("な", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("に"),
                    top = KeyC("ぬ"),
                    right = KeyC("ね"),
                    bottom = KeyC("の"),
                ),
                KeyItemC(
                    center = KeyC("は", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ひ"),
                    top = KeyC("ふ"),
                    right = KeyC("へ"),
                    bottom = KeyC("ほ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ま", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("み"),
                    top = KeyC("む"),
                    right = KeyC("め"),
                    bottom = KeyC("も"),
                ),
                KeyItemC(
                    center = KeyC("や", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("（"),
                    top = KeyC("ゆ"),
                    right = KeyC("）"),
                    bottom = KeyC("よ"),
                ),
                KeyItemC(
                    center = KeyC("ら", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("り"),
                    top = KeyC("る"),
                    right = KeyC("れ"),
                    bottom = KeyC("ろ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("゛゜小"),
                            action = ComposeLastKey("゛"),
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("「"),
                    top = KeyC("・"),
                    right = KeyC("」"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("␣"),
                            action = CommitText(" "),
                        ),
                ),
                KeyItemC(
                    center = KeyC("わ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("〜"),
                    top = KeyC("ん"),
                    right = KeyC("ー"),
                    bottom = KeyC("を"),
                ),
                KeyItemC(
                    center = KeyC("、", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("。"),
                    top = KeyC("？"),
                    right = KeyC("！"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ア"),
                            action = ShiftAndCapsLock(true),
                        ),
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_JA_KANA_STANDARD_KATAKANA =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ア", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("イ"),
                    top = KeyC("ウ"),
                    right = KeyC("エ"),
                    bottom = KeyC("オ"),
                ),
                KeyItemC(
                    center = KeyC("カ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("キ"),
                    top = KeyC("ク"),
                    right = KeyC("ケ"),
                    bottom = KeyC("コ"),
                ),
                KeyItemC(
                    center = KeyC("サ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ソ"),
                    top = KeyC("ス"),
                    right = KeyC("セ"),
                    bottom = KeyC("ソ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("タ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("チ"),
                    top = KeyC("ツ"),
                    right = KeyC("テ"),
                    bottom = KeyC("ト"),
                ),
                KeyItemC(
                    center = KeyC("ナ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ニ"),
                    top = KeyC("ヌ"),
                    right = KeyC("ネ"),
                    bottom = KeyC("ノ"),
                ),
                KeyItemC(
                    center = KeyC("ハ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ヒ"),
                    top = KeyC("フ"),
                    right = KeyC("ヘ"),
                    bottom = KeyC("ホ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("マ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ミ"),
                    top = KeyC("ム"),
                    right = KeyC("メ"),
                    bottom = KeyC("モ"),
                ),
                KeyItemC(
                    center = KeyC("ヤ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("（"),
                    top = KeyC("ユ"),
                    right = KeyC("）"),
                    bottom = KeyC("ヨ"),
                ),
                KeyItemC(
                    center = KeyC("ラ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("リ"),
                    top = KeyC("ル"),
                    right = KeyC("レ"),
                    bottom = KeyC("ロ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("゛゜小"),
                            action = ComposeLastKey("゛"),
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("「"),
                    top = KeyC("・"),
                    right = KeyC("」"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("␣"),
                            action = CommitText(" "),
                        ),
                ),
                KeyItemC(
                    center = KeyC("ワ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("〜"),
                    top = KeyC("ン"),
                    right = KeyC("ー"),
                    bottom = KeyC("ヲ"),
                ),
                KeyItemC(
                    center = KeyC("、", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("。"),
                    top = KeyC("？"),
                    right = KeyC("！"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("あ"),
                            action = ShiftAndCapsLock(false),
                        ),
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_JA_KANA_STANDARD: KeyboardDefinition =
    KeyboardDefinition(
        title = "japanese standard kana keyboard",
        modes =
            KeyboardDefinitionModes(
                main = KB_JA_KANA_STANDARD_HIRAGANA,
                shifted = KB_JA_KANA_STANDARD_KATAKANA,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
