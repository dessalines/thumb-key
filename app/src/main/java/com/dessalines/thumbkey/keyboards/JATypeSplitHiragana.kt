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

val KB_JA_TYPESPLIT_MAIN = KeyboardC(
    listOf(
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("わ"),
                    action = KeyAction.CommitText("わ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ん"),
                        action = KeyAction.CommitText("ん"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("ん"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("を"),
                        action = KeyAction.CommitText("を"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("た"),
                    action = KeyAction.CommitText("た"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("て"),
                        action = KeyAction.CommitText("て"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ち"),
                        action = KeyAction.CommitText("ち"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("お"),
                        action = KeyAction.CommitText("お"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("う"),
                        action = KeyAction.CommitText("う"),
                    ),
                ),
            ),
            EMOJI_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("や"),
                    action = KeyAction.CommitText("や"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ゆ"),
                        action = KeyAction.CommitText("ゆ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("ゆ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("よ"),
                        action = KeyAction.CommitText("よ"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = null,
                        action = KeyAction.CommitText("ゆ"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ら"),
                    action = KeyAction.CommitText("ら"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("れ"),
                        action = KeyAction.CommitText("れ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("り"),
                        action = KeyAction.CommitText("り"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ろ"),
                        action = KeyAction.CommitText("ろ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("る"),
                        action = KeyAction.CommitText("る"),
                    ),
                ),
            ),
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("あ"),
                    action = KeyAction.CommitText("あ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("い"),
                        action = KeyAction.CommitText("い"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("え"),
                        action = KeyAction.CommitText("え"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("お"),
                        action = KeyAction.CommitText("お"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("う"),
                        action = KeyAction.CommitText("う"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("さ"),
                    action = KeyAction.CommitText("さ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("せ"),
                        action = KeyAction.CommitText("せ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("し"),
                        action = KeyAction.CommitText("し"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("そ"),
                        action = KeyAction.CommitText("そ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("す"),
                        action = KeyAction.CommitText("す"),
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("は"),
                    action = KeyAction.CommitText("は"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ひ"),
                        action = KeyAction.CommitText("ひ"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("へ"),
                        action = KeyAction.CommitText("へ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ほ"),
                        action = KeyAction.CommitText("ほ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ふ"),
                        action = KeyAction.CommitText("ふ"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("か"),
                    action = KeyAction.CommitText("か"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("け"),
                        action = KeyAction.CommitText("け"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("き"),
                        action = KeyAction.CommitText("き"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("こ"),
                        action = KeyAction.CommitText("こ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("く"),
                        action = KeyAction.CommitText("く"),
                    ),
                ),
            ),
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("c"),
                    action = KeyAction.CommitText("c"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("z"),
                        action = KeyAction.CommitText("z"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("z"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("x"),
                        action = KeyAction.CommitText("x"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("b"),
                    action = KeyAction.CommitText("b"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("v"),
                        action = KeyAction.CommitText("v"),
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("な"),
                    action = KeyAction.CommitText("な"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("に"),
                        action = KeyAction.CommitText("に"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ね"),
                        action = KeyAction.CommitText("ね"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("の"),
                        action = KeyAction.CommitText("の"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ぬ"),
                        action = KeyAction.CommitText("ぬ"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ま"),
                    action = KeyAction.CommitText("ま"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("め"),
                        action = KeyAction.CommitText("め"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("み"),
                        action = KeyAction.CommitText("み"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("も"),
                        action = KeyAction.CommitText("も"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("む"),
                        action = KeyAction.CommitText("む"),
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

val KB_EN_TYPESPLIT_SHIFTED = KeyboardC(
    listOf(
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("E"),
                    action = KeyAction.CommitText("E"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Q"),
                        action = KeyAction.CommitText("Q"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("Q"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("W"),
                        action = KeyAction.CommitText("W"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("T"),
                    action = KeyAction.CommitText("T"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("R"),
                        action = KeyAction.CommitText("R"),
                    ),
                ),
            ),
            EMOJI_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("I"),
                    action = KeyAction.CommitText("I"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Y"),
                        action = KeyAction.CommitText("Y"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("Y"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("U"),
                        action = KeyAction.CommitText("U"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("O"),
                    action = KeyAction.CommitText("O"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("P"),
                        action = KeyAction.CommitText("P"),
                    ),
                ),
            ),
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("A"),
                    action = KeyAction.CommitText("A"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("S"),
                    action = KeyAction.CommitText("S"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("F"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("F"),
                        action = KeyAction.CommitText("F"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("D"),
                        action = KeyAction.CommitText("D"),
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("H"),
                    action = KeyAction.CommitText("H"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("G"),
                        action = KeyAction.CommitText("G"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("L"),
                    action = KeyAction.CommitText("L"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("J"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("J"),
                        action = KeyAction.CommitText("J"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("K"),
                        action = KeyAction.CommitText("K"),
                    ),
                ),
            ),
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("C"),
                    action = KeyAction.CommitText("C"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Z"),
                        action = KeyAction.CommitText("Z"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("Z"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("X"),
                        action = KeyAction.CommitText("X"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("B"),
                    action = KeyAction.CommitText("B"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("V"),
                        action = KeyAction.CommitText("V"),
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("N"),
                    action = KeyAction.CommitText("N"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("M"),
                    action = KeyAction.CommitText("M"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("?"),
                        action = KeyAction.CommitText("?"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("!"),
                        action = KeyAction.CommitText("!"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay(":"),
                        action = KeyAction.CommitText(":"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay(";"),
                        action = KeyAction.CommitText(";"),
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

val KB_EN_TYPESPLIT: KeyboardDefinition = KeyboardDefinition(
    title = "english type-split",
    modes = KeyboardDefinitionModes(
        main = KB_EN_TYPESPLIT_MAIN,
        shifted = KB_EN_TYPESPLIT_SHIFTED,
        numeric = TYPESPLIT_NUMERIC_KEYBOARD,
    ),
)
