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
                    center =
                        KeyC(
                            KeyAction.CommitText("わ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("ん")),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ん"),
                        ),
                    bottom = KeyC(KeyAction.CommitText("を")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("た"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("て")),
                    left = KeyC(KeyAction.CommitText("ち")),
                    bottom = KeyC(KeyAction.CommitText("と")),
                    top = KeyC(KeyAction.CommitText("つ")),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("や"),
                            size = FontSizeVariant.LARGE,
                        ),
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
                    bottom = KeyC(KeyAction.CommitText("よ")),
                    top = KeyC(KeyAction.CommitText("ゆ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ら"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("れ")),
                    left = KeyC(KeyAction.CommitText("り")),
                    bottom = KeyC(KeyAction.CommitText("ろ")),
                    top = KeyC(KeyAction.CommitText("る")),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("あ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("い")),
                    left = KeyC(KeyAction.CommitText("え")),
                    bottom = KeyC(KeyAction.CommitText("お")),
                    top = KeyC(KeyAction.CommitText("う")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("さ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("せ")),
                    left = KeyC(KeyAction.CommitText("し")),
                    bottom = KeyC(KeyAction.CommitText("そ")),
                    top = KeyC(KeyAction.CommitText("す")),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("は"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("ひ")),
                    left = KeyC(KeyAction.CommitText("へ")),
                    bottom = KeyC(KeyAction.CommitText("ほ")),
                    top = KeyC(KeyAction.CommitText("ふ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("か"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("け")),
                    left = KeyC(KeyAction.CommitText("き")),
                    bottom = KeyC(KeyAction.CommitText("こ")),
                    top = KeyC(KeyAction.CommitText("く")),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("、"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("」"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("「"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ー"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("～"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("。"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("？"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("！"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("："),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("…"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("な"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("に")),
                    left = KeyC(KeyAction.CommitText("ね")),
                    bottom = KeyC(KeyAction.CommitText("の")),
                    top = KeyC(KeyAction.CommitText("ぬ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ま"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("め")),
                    left = KeyC(KeyAction.CommitText("み")),
                    bottom = KeyC(KeyAction.CommitText("も")),
                    top = KeyC(KeyAction.CommitText("む")),
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
                    center =
                        KeyC(
                            KeyAction.CommitText("¥"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("※"),
                        ),
                    left = KeyC(KeyAction.CommitText("※")),
                    bottom = KeyC(KeyAction.CommitText("ヶ")),
                    top = KeyC(KeyAction.CommitText("ヵ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("だ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("で")),
                    left = KeyC(KeyAction.CommitText("ぢ")),
                    bottom = KeyC(KeyAction.CommitText("ど")),
                    top = KeyC(KeyAction.CommitText("づ")),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ゃ"),
                            size = FontSizeVariant.LARGE,
                        ),
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
                    bottom = KeyC(KeyAction.CommitText("ょ")),
                    top = KeyC(KeyAction.CommitText("ゅ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ゔ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ぁ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("ぃ")),
                    left = KeyC(KeyAction.CommitText("ぇ")),
                    bottom = KeyC(KeyAction.CommitText("ぉ")),
                    top = KeyC(KeyAction.CommitText("ぅ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ざ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("ぜ")),
                    left = KeyC(KeyAction.CommitText("じ")),
                    bottom = KeyC(KeyAction.CommitText("ぞ")),
                    top = KeyC(KeyAction.CommitText("ず")),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ば"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("び")),
                    left = KeyC(KeyAction.CommitText("べ")),
                    bottom = KeyC(KeyAction.CommitText("ぼ")),
                    top = KeyC(KeyAction.CommitText("ぶ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("が"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("げ")),
                    left = KeyC(KeyAction.CommitText("ぎ")),
                    bottom = KeyC(KeyAction.CommitText("ご")),
                    top = KeyC(KeyAction.CommitText("ぐ")),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("・"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("】"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("【"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("："),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("〃"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("＝"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("×"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("÷"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("＋"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("－"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ぱ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("ぴ")),
                    left = KeyC(KeyAction.CommitText("ぺ")),
                    bottom = KeyC(KeyAction.CommitText("ぽ")),
                    top = KeyC(KeyAction.CommitText("ぷ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("っ"),
                            size = FontSizeVariant.LARGE,
                        ),
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
