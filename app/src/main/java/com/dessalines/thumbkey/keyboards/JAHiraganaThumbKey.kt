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

val KB_JA_HIRAGANA_THUMBKEY_MAIN =
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
                    bottom =
                        KeyC(
                            KeyAction.CommitText("み"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("む"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("め"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("も"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("は"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ひ"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("ふ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("へ"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ほ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("さ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            KeyAction.CommitText("し"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("す"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("せ"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("そ"),
                        ),
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
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ゆ"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("よ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("な"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            KeyAction.CommitText("に"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("ぬ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ね"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("の"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("か"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            KeyAction.CommitText("き"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("く"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("け"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("こ"),
                        ),
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
                    bottom =
                        KeyC(
                            KeyAction.CommitText("り"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("る"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("れ"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ろ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("た"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ち"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("つ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("て"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("と"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("あ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            KeyAction.CommitText("い"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("う"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("え"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("お"),
                        ),
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
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ゐ"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("ん"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ゑ"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("を"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("゛"),
                            action = KeyAction.ComposeLastKey("゛"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            KeyAction.CommitText("。"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("？"),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("、"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText(" "),
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_JA_HIRAGANA_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("「"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            KeyAction.CommitText("【"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("〔"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("〖"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("『"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("・"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            KeyAction.CommitText("※"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("」"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom =
                        KeyC(
                            KeyAction.CommitText("】"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("』"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("〗"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("〕"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("（"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("！"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("）"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ゟ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("？"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ゝ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ー"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("〜"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("…"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("あ"),
                            action = KeyAction.ToggleShiftMode(false),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText(" "),
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_JA_HIRAGANA_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "japanese hiragana thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_JA_HIRAGANA_THUMBKEY_MAIN,
                shifted = KB_JA_HIRAGANA_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
