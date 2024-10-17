@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_JA_KANA_THUMBKEY_HIRAGANA =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ま", size = LARGE),
                    bottom = KeyC("み"),
                    left = KeyC("む"),
                    top = KeyC("め"),
                    right = KeyC("も"),
                ),
                KeyItemC(
                    center = KeyC("は", size = LARGE),
                    bottom = KeyC("ひ"),
                    left = KeyC("ふ"),
                    top = KeyC("へ"),
                    right = KeyC("ほ"),
                ),
                KeyItemC(
                    center = KeyC("さ", size = LARGE),
                    bottom = KeyC("し"),
                    left = KeyC("す"),
                    top = KeyC("せ"),
                    right = KeyC("そ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("や", size = LARGE),
                    bottom = KeyC("）"),
                    left = KeyC("ゆ"),
                    top = KeyC("（"),
                    right = KeyC("よ"),
                ),
                KeyItemC(
                    center = KeyC("な", size = LARGE),
                    bottom = KeyC("に"),
                    left = KeyC("ぬ"),
                    top = KeyC("ね"),
                    right = KeyC("の"),
                ),
                KeyItemC(
                    center = KeyC("か", size = LARGE),
                    bottom = KeyC("き"),
                    left = KeyC("く"),
                    top = KeyC("け"),
                    right = KeyC("こ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ら", size = LARGE),
                    bottom = KeyC("り"),
                    left = KeyC("る"),
                    top = KeyC("れ"),
                    right = KeyC("ろ"),
                ),
                KeyItemC(
                    center = KeyC("た", size = LARGE),
                    bottom = KeyC("ち"),
                    left = KeyC("つ"),
                    top = KeyC("て"),
                    right = KeyC("と"),
                ),
                KeyItemC(
                    center = KeyC("あ", size = LARGE),
                    bottom = KeyC("い"),
                    left = KeyC("う"),
                    top = KeyC("え"),
                    right = KeyC("お"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("わ", size = LARGE),
                    bottom = KeyC("ー"),
                    left = KeyC("ん"),
                    top = KeyC("〜"),
                    right = KeyC("を"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ア"),
                            action = ToggleCapsLock,
                            size = LARGE,
                            color = MUTED,
                        ),
                    bottom = KeyC("…"),
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
                    bottom = KeyC("ミ"),
                    left = KeyC("ム"),
                    top = KeyC("メ"),
                    right = KeyC("モ"),
                ),
                KeyItemC(
                    center = KeyC("ハ", size = LARGE),
                    bottom = KeyC("ヒ"),
                    left = KeyC("フ"),
                    top = KeyC("ヘ"),
                    right = KeyC("ホ"),
                ),
                KeyItemC(
                    center = KeyC("サ", size = LARGE),
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
                    bottom = KeyC("）"),
                    left = KeyC("ユ"),
                    top = KeyC("（"),
                    right = KeyC("ヨ"),
                ),
                KeyItemC(
                    center = KeyC("ナ", size = LARGE),
                    bottom = KeyC("ニ"),
                    left = KeyC("ヌ"),
                    top = KeyC("ネ"),
                    right = KeyC("ノ"),
                ),
                KeyItemC(
                    center = KeyC("カ", size = LARGE),
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
                    bottom = KeyC("リ"),
                    left = KeyC("ル"),
                    top = KeyC("レ"),
                    right = KeyC("ロ"),
                ),
                KeyItemC(
                    center = KeyC("タ", size = LARGE),
                    bottom = KeyC("チ"),
                    left = KeyC("ツ"),
                    top = KeyC("テ"),
                    right = KeyC("ト"),
                ),
                KeyItemC(
                    center = KeyC("ア", size = LARGE),
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
                    bottom = KeyC("ー"),
                    left = KeyC("ン"),
                    top = KeyC("〜"),
                    right = KeyC("ヲ"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("あ"),
                            action = ToggleCapsLock,
                            size = LARGE,
                            color = MUTED,
                        ),
                    bottom = KeyC("…"),
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
