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
                            action = KeyAction.CommitText("わ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ん"),
                        ),
                    left =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("ん"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("を"),
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
                    right =
                        KeyC(
                            action = KeyAction.CommitText("て"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ち"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("と"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("つ"),
                        ),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("や"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("よ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ゆ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ら"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("れ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("り"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ろ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("る"),
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("あ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("い"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("え"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("お"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("う"),
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
                    right =
                        KeyC(
                            action = KeyAction.CommitText("せ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("し"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("そ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("す"),
                        ),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("は"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ひ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("へ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ほ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ふ"),
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
                    right =
                        KeyC(
                            action = KeyAction.CommitText("け"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("き"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("こ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("く"),
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("、"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("」"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("「"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ー"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("～"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("。"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("？"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("！"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("："),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("…"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("な"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("に"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ね"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("の"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ぬ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ま"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("め"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("み"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("も"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("む"),
                        ),
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
                            action = KeyAction.CommitText("¥"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = KeyAction.CommitText("※"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("※"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ヶ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ヵ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("だ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("で"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ぢ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ど"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("づ"),
                        ),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ゃ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
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
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ょ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ゅ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ゔ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ぁ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ぃ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ぇ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ぉ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ぅ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ざ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ぜ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("じ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ぞ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ず"),
                        ),
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ば"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("び"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("べ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ぼ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ぶ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("が"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("げ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ぎ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ご"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ぐ"),
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("・"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("】"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("【"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("："),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("〃"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("＝"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("×"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("÷"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("＋"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("－"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ぱ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ぴ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ぺ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ぽ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ぷ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("っ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
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
