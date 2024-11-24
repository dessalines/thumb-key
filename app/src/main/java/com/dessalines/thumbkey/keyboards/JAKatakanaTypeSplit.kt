@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_JA_KATAKANA_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ワ", size = LARGE),
                    right = KeyC("ン"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("ン"),
                        ),
                    bottom = KeyC("ヲ"),
                ),
                KeyItemC(
                    center = KeyC("タ", size = LARGE),
                    right = KeyC("テ"),
                    left = KeyC("チ"),
                    bottom = KeyC("ト"),
                    top = KeyC("ツ"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("ヤ", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("ユ"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("ヨ"),
                        ),
                    bottom = KeyC("ヨ"),
                    top = KeyC("ユ"),
                ),
                KeyItemC(
                    center = KeyC("ラ", size = LARGE),
                    right = KeyC("レ"),
                    left = KeyC("リ"),
                    bottom = KeyC("ロ"),
                    top = KeyC("ル"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ア", size = LARGE),
                    right = KeyC("イ"),
                    left = KeyC("エ"),
                    bottom = KeyC("オ"),
                    top = KeyC("ウ"),
                ),
                KeyItemC(
                    center = KeyC("サ", size = LARGE),
                    right = KeyC("セ"),
                    left = KeyC("シ"),
                    bottom = KeyC("ソ"),
                    top = KeyC("ス"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("ハ", size = LARGE),
                    right = KeyC("ヒ"),
                    left = KeyC("ヘ"),
                    bottom = KeyC("ホ"),
                    top = KeyC("フ"),
                ),
                KeyItemC(
                    center = KeyC("カ", size = LARGE),
                    right = KeyC("ケ"),
                    left = KeyC("キ"),
                    bottom = KeyC("コ"),
                    top = KeyC("ク"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("、", size = LARGE),
                    right = KeyC("」", color = MUTED),
                    left = KeyC("「", color = MUTED),
                    bottom = KeyC("ー", color = MUTED),
                    top = KeyC("～", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("。", size = LARGE),
                    right = KeyC("？", color = MUTED),
                    left = KeyC("！", color = MUTED),
                    bottom = KeyC("：", color = MUTED),
                    top = KeyC("…", color = MUTED),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("ナ", size = LARGE),
                    right = KeyC("ニ"),
                    left = KeyC("ネ"),
                    bottom = KeyC("ノ"),
                    top = KeyC("ヌ"),
                ),
                KeyItemC(
                    center = KeyC("マ", size = LARGE),
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
                    center = KeyC("¥", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("※"),
                        ),
                    left = KeyC("※"),
                    bottom = KeyC("ヶ"),
                    top = KeyC("ヵ"),
                ),
                KeyItemC(
                    center = KeyC("ダ", size = LARGE),
                    right = KeyC("デ"),
                    left = KeyC("ヂ"),
                    bottom = KeyC("ド"),
                    top = KeyC("ヅ"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("ャ", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("ュ"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("ョ"),
                        ),
                    bottom = KeyC("ョ"),
                    top = KeyC("ュ"),
                ),
                KeyItemC(
                    center = KeyC("ヴ", size = LARGE),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ァ", size = LARGE),
                    right = KeyC("ィ"),
                    left = KeyC("ェ"),
                    bottom = KeyC("ォ"),
                    top = KeyC("ゥ"),
                ),
                KeyItemC(
                    center = KeyC("ザ", size = LARGE),
                    right = KeyC("ゼ"),
                    left = KeyC("ジ"),
                    bottom = KeyC("ゾ"),
                    top = KeyC("ズ"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("バ", size = LARGE),
                    right = KeyC("ビ"),
                    left = KeyC("ベ"),
                    bottom = KeyC("ボ"),
                    top = KeyC("ブ"),
                ),
                KeyItemC(
                    center = KeyC("ガ", size = LARGE),
                    right = KeyC("ゲ"),
                    left = KeyC("ギ"),
                    bottom = KeyC("ゴ"),
                    top = KeyC("グ"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("・", size = LARGE),
                    right = KeyC("】", color = MUTED),
                    left = KeyC("【", color = MUTED),
                    bottom = KeyC("：", color = MUTED),
                    top = KeyC("〃", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("＝", size = LARGE),
                    right = KeyC("×", color = MUTED),
                    left = KeyC("÷", color = MUTED),
                    bottom = KeyC("＋", color = MUTED),
                    top = KeyC("－", color = MUTED),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("パ", size = LARGE),
                    right = KeyC("ピ"),
                    left = KeyC("ペ"),
                    bottom = KeyC("ポ"),
                    top = KeyC("プ"),
                ),
                KeyItemC(
                    center = KeyC("ッ", size = LARGE),
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
