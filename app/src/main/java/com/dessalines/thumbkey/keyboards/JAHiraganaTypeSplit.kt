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

val KB_JA_HIRAGANA_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("わ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ん"),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ん"),
                        ),
                    bottom = KeyC("を"),
                ),
                KeyItemC(
                    center = KeyC("た", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("て"),
                    left = KeyC("ち"),
                    bottom = KeyC("と"),
                    top = KeyC("つ"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("や", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ゆ"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("よ"),
                        ),
                    bottom = KeyC("よ"),
                    top = KeyC("ゆ"),
                ),
                KeyItemC(
                    center = KeyC("ら", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("れ"),
                    left = KeyC("り"),
                    bottom = KeyC("ろ"),
                    top = KeyC("る"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("あ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("い"),
                    left = KeyC("え"),
                    bottom = KeyC("お"),
                    top = KeyC("う"),
                ),
                KeyItemC(
                    center = KeyC("さ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("せ"),
                    left = KeyC("し"),
                    bottom = KeyC("そ"),
                    top = KeyC("す"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("は", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ひ"),
                    left = KeyC("へ"),
                    bottom = KeyC("ほ"),
                    top = KeyC("ふ"),
                ),
                KeyItemC(
                    center = KeyC("か", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("け"),
                    left = KeyC("き"),
                    bottom = KeyC("こ"),
                    top = KeyC("く"),
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
                    center = KeyC("な", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("に"),
                    left = KeyC("ね"),
                    bottom = KeyC("の"),
                    top = KeyC("ぬ"),
                ),
                KeyItemC(
                    center = KeyC("ま", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("め"),
                    left = KeyC("み"),
                    bottom = KeyC("も"),
                    top = KeyC("む"),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_JA_HIRAGANA_TYPESPLIT_SHIFTED =
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
                    center = KeyC("だ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("で"),
                    left = KeyC("ぢ"),
                    bottom = KeyC("ど"),
                    top = KeyC("づ"),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("ゃ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ゅ"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ょ"),
                        ),
                    bottom = KeyC("ょ"),
                    top = KeyC("ゅ"),
                ),
                KeyItemC(
                    center = KeyC("ゔ", size = FontSizeVariant.LARGE),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ぁ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ぃ"),
                    left = KeyC("ぇ"),
                    bottom = KeyC("ぉ"),
                    top = KeyC("ぅ"),
                ),
                KeyItemC(
                    center = KeyC("ざ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ぜ"),
                    left = KeyC("じ"),
                    bottom = KeyC("ぞ"),
                    top = KeyC("ず"),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("ば", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("び"),
                    left = KeyC("べ"),
                    bottom = KeyC("ぼ"),
                    top = KeyC("ぶ"),
                ),
                KeyItemC(
                    center = KeyC("が", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("げ"),
                    left = KeyC("ぎ"),
                    bottom = KeyC("ご"),
                    top = KeyC("ぐ"),
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
                    center = KeyC("ぱ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("ぴ"),
                    left = KeyC("ぺ"),
                    bottom = KeyC("ぽ"),
                    top = KeyC("ぷ"),
                ),
                KeyItemC(
                    center = KeyC("っ", size = FontSizeVariant.LARGE),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_JA_HIRAGANA_TYPESPLIT: KeyboardDefinition =
    KeyboardDefinition(
        title = "japanese hiragana type-split",
        modes =
            KeyboardDefinitionModes(
                main = KB_JA_HIRAGANA_TYPESPLIT_MAIN,
                shifted = KB_JA_HIRAGANA_TYPESPLIT_SHIFTED,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
