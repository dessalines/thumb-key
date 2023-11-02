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
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_JA_TYPESPLIT_KATAKANA_MAIN = KeyboardC(
    listOf(
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ワ"),
                    action = KeyAction.CommitText("ワ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ン"),
                        action = KeyAction.CommitText("ン"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("ン"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ヲ"),
                        action = KeyAction.CommitText("ヲ"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("タ"),
                    action = KeyAction.CommitText("タ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("テ"),
                        action = KeyAction.CommitText("テ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("チ"),
                        action = KeyAction.CommitText("チ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("オ"),
                        action = KeyAction.CommitText("オ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ウ"),
                        action = KeyAction.CommitText("ウ"),
                    ),
                ),
            ),
            EMOJI_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ヤ"),
                    action = KeyAction.CommitText("ヤ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ユ"),
                        action = KeyAction.CommitText("ユ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("ユ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ヨ"),
                        action = KeyAction.CommitText("ヨ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = null,
                        action = KeyAction.CommitText("ユ"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ラ"),
                    action = KeyAction.CommitText("ラ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("レ"),
                        action = KeyAction.CommitText("レ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("リ"),
                        action = KeyAction.CommitText("リ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ロ"),
                        action = KeyAction.CommitText("ロ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ル"),
                        action = KeyAction.CommitText("ル"),
                    ),
                ),
            ),
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ア"),
                    action = KeyAction.CommitText("ア"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("イ"),
                        action = KeyAction.CommitText("イ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("エ"),
                        action = KeyAction.CommitText("エ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("オ"),
                        action = KeyAction.CommitText("オ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ウ"),
                        action = KeyAction.CommitText("ウ"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("サ"),
                    action = KeyAction.CommitText("サ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("セ"),
                        action = KeyAction.CommitText("セ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("シ"),
                        action = KeyAction.CommitText("シ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ソ"),
                        action = KeyAction.CommitText("ソ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ス"),
                        action = KeyAction.CommitText("ス"),
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ハ"),
                    action = KeyAction.CommitText("ハ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ヒ"),
                        action = KeyAction.CommitText("ヒ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ヘ"),
                        action = KeyAction.CommitText("ヘ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ホ"),
                        action = KeyAction.CommitText("ホ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("フ"),
                        action = KeyAction.CommitText("フ"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("カ"),
                    action = KeyAction.CommitText("カ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ケ"),
                        action = KeyAction.CommitText("ケ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("キ"),
                        action = KeyAction.CommitText("キ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("コ"),
                        action = KeyAction.CommitText("コ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ク"),
                        action = KeyAction.CommitText("ク"),
                    ),
                ),
            ),
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("、"),
                    action = KeyAction.CommitText("、"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("」"),
                        action = KeyAction.CommitText("」"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("「"),
                        action = KeyAction.CommitText("「"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ー"),
                        action = KeyAction.CommitText("ー"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("～"),
                        action = KeyAction.CommitText("～"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("。"),
                    action = KeyAction.CommitText("。"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("？"),
                        action = KeyAction.CommitText("？"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("！"),
                        action = KeyAction.CommitText("！"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("："),
                        action = KeyAction.CommitText("："),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("…"),
                        action = KeyAction.CommitText("…"),
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ナ"),
                    action = KeyAction.CommitText("ナ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ニ"),
                        action = KeyAction.CommitText("ニ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ネ"),
                        action = KeyAction.CommitText("ネ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ノ"),
                        action = KeyAction.CommitText("ノ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ヌ"),
                        action = KeyAction.CommitText("ヌ"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("マ"),
                    action = KeyAction.CommitText("マ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("メ"),
                        action = KeyAction.CommitText("メ"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ミ"),
                        action = KeyAction.CommitText("ミ"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("モ"),
                        action = KeyAction.CommitText("モ"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ム"),
                        action = KeyAction.CommitText("ム"),
                        color = ColorVariant.MUTED,
                    ),
                ),
            ),
        ),
        listOf(
            NUMERIC_KEY_ITEM,
            BACKSPACE_TYPESPLIT_KEY_ITEM,
            RETURN_KEY_ITEM,
        ),
    ),
)

val KB_JA_TYPESPLIT_KATAKANA_SHIFTED = KeyboardC(
    listOf(
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ゔ"),
                    action = KeyAction.CommitText("ゔ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ッ"),
                    action = KeyAction.CommitText("ッ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
            ),
            EMOJI_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ャ"),
                    action = KeyAction.CommitText("ャ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ュ"),
                        action = KeyAction.CommitText("ュ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("ュ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ョ"),
                        action = KeyAction.CommitText("ョ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = null,
                        action = KeyAction.CommitText("ュ"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("パ"),
                    action = KeyAction.CommitText("パ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ペ"),
                        action = KeyAction.CommitText("ペ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ピ"),
                        action = KeyAction.CommitText("ピ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ポ"),
                        action = KeyAction.CommitText("ポ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("プ"),
                        action = KeyAction.CommitText("プ"),
                    ),
                ),
            ),
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ァ"),
                    action = KeyAction.CommitText("ァ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ィ"),
                        action = KeyAction.CommitText("ィ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ェ"),
                        action = KeyAction.CommitText("ェ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ォ"),
                        action = KeyAction.CommitText("ォ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ゥ"),
                        action = KeyAction.CommitText("ゥ"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ダ"),
                    action = KeyAction.CommitText("ダ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("デ"),
                        action = KeyAction.CommitText("デ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ヂ"),
                        action = KeyAction.CommitText("ヂ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ド"),
                        action = KeyAction.CommitText("ド"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ヅ"),
                        action = KeyAction.CommitText("ヅ"),
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ガ"),
                    action = KeyAction.CommitText("ガ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ギ"),
                        action = KeyAction.CommitText("ギ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ゲ"),
                        action = KeyAction.CommitText("ゲ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ゴ"),
                        action = KeyAction.CommitText("ゴ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("グ"),
                        action = KeyAction.CommitText("グ"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("・"),
                    action = KeyAction.CommitText("・"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("】"),
                        action = KeyAction.CommitText("】"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("【"),
                        action = KeyAction.CommitText("【"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("："),
                        action = KeyAction.CommitText("："),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("〃"),
                        action = KeyAction.CommitText("〃"),
                    ),
                ),
            ),
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ザ"),
                    action = KeyAction.CommitText("ザ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ジ"),
                        action = KeyAction.CommitText("ジ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ゼ"),
                        action = KeyAction.CommitText("ゼ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ゾ"),
                        action = KeyAction.CommitText("ゾ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ズ"),
                        action = KeyAction.CommitText("ズ"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("バ"),
                    action = KeyAction.CommitText("バ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ベ"),
                        action = KeyAction.CommitText("ベ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ビ"),
                        action = KeyAction.CommitText("ビ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ボ"),
                        action = KeyAction.CommitText("ボ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ブ"),
                        action = KeyAction.CommitText("ブ"),
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("¥"),
                    action = KeyAction.CommitText("¥"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("※"),
                        action = KeyAction.CommitText("※"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("※"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ヶ"),
                        action = KeyAction.CommitText("ヶ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ヵ"),
                        action = KeyAction.CommitText("ヵ"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("＝"),
                    action = KeyAction.CommitText("＝"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("÷"),
                        action = KeyAction.CommitText("÷"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("×"),
                        action = KeyAction.CommitText("×"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("＋"),
                        action = KeyAction.CommitText("＋"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("－"),
                        action = KeyAction.CommitText("－"),
                        color = ColorVariant.MUTED,
                    ),
                ),
            ),
        ),
        listOf(
            NUMERIC_KEY_ITEM,
            BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM,
            RETURN_KEY_ITEM,
        ),
    ),
)

val KB_JA_TYPESPLIT_KATAKANA: KeyboardDefinition = KeyboardDefinition(
    title = "japanese katakana type-split",
    modes = KeyboardDefinitionModes(
        main = KB_JA_TYPESPLIT_KATAKANA_MAIN,
        shifted = KB_JA_TYPESPLIT_KATAKANA_SHIFTED,
        numeric = TYPESPLIT_NUMERIC_KEYBOARD,
    ),
)