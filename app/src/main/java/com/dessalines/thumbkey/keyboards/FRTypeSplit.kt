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

val KB_FR_TYPESPLIT_MAIN = KeyboardC(
    listOf(
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("a"),
                    action = KeyAction.CommitText("a"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("à"),
                        action = KeyAction.CommitText("à"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("à"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("z"),
                        action = KeyAction.CommitText("z"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("â"),
                        action = KeyAction.CommitText("â"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("e"),
                    action = KeyAction.CommitText("e"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("é"),
                        action = KeyAction.CommitText("é"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("è"),
                        action = KeyAction.CommitText("è"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("r"),
                        action = KeyAction.CommitText("r"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ê"),
                        action = KeyAction.CommitText("ê"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_TOP_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("t"),
                    action = KeyAction.CommitText("t"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("y"),
                        action = KeyAction.CommitText("y"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ù"),
                        action = KeyAction.CommitText("ù"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("u"),
                        action = KeyAction.CommitText("u"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("û"),
                        action = KeyAction.CommitText("û"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("i"),
                    action = KeyAction.CommitText("i"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ô"),
                        action = KeyAction.CommitText("ô"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("p"),
                        action = KeyAction.CommitText("p"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("o"),
                        action = KeyAction.CommitText("o"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("î"),
                        action = KeyAction.CommitText("î"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("s"),
                    action = KeyAction.CommitText("s"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("q"),
                        action = KeyAction.CommitText("q"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("œ"),
                        action = KeyAction.CommitText("œ"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("d"),
                    action = KeyAction.CommitText("d"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("f"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("f"),
                        action = KeyAction.CommitText("f"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("g"),
                        action = KeyAction.CommitText("g"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ë"),
                        action = KeyAction.CommitText("ë"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("l"),
                    action = KeyAction.CommitText("l"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("j"),
                        action = KeyAction.CommitText("j"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("k"),
                        action = KeyAction.CommitText("k"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("h"),
                        action = KeyAction.CommitText("h"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ü"),
                        action = KeyAction.CommitText("ü"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("m"),
                    action = KeyAction.CommitText("m"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ï"),
                        action = KeyAction.CommitText("ï"),
                        color = ColorVariant.SECONDARY_SWIPES,
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
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("w"),
                        action = KeyAction.CommitText("w"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("w"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("x"),
                        action = KeyAction.CommitText("x"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ç"),
                        action = KeyAction.CommitText("ç"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("v"),
                    action = KeyAction.CommitText("v"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
            ),
            SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("b"),
                    action = KeyAction.CommitText("b"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("n"),
                    action = KeyAction.CommitText("n"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("?"),
                        action = KeyAction.CommitText("?"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("!"),
                        action = KeyAction.CommitText("!"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay(":"),
                        action = KeyAction.CommitText(":"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay(";"),
                        action = KeyAction.CommitText(";"),
                        color = ColorVariant.SECONDARY_SWIPES,
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

val KB_FR_TYPESPLIT_SHIFTED = KeyboardC(
    listOf(
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("A"),
                    action = KeyAction.CommitText("A"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("À"),
                        action = KeyAction.CommitText("À"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("À"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("Z"),
                        action = KeyAction.CommitText("Z"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Â"),
                        action = KeyAction.CommitText("Â"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("E"),
                    action = KeyAction.CommitText("E"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("É"),
                        action = KeyAction.CommitText("É"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("È"),
                        action = KeyAction.CommitText("È"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("R"),
                        action = KeyAction.CommitText("R"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Ê"),
                        action = KeyAction.CommitText("Ê"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_TOP_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("T"),
                    action = KeyAction.CommitText("T"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Y"),
                        action = KeyAction.CommitText("Y"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("Ù"),
                        action = KeyAction.CommitText("Ù"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("U"),
                        action = KeyAction.CommitText("U"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Û"),
                        action = KeyAction.CommitText("Û"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("I"),
                    action = KeyAction.CommitText("I"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Ô"),
                        action = KeyAction.CommitText("Ô"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("P"),
                        action = KeyAction.CommitText("P"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("O"),
                        action = KeyAction.CommitText("O"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Î"),
                        action = KeyAction.CommitText("Î"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("S"),
                    action = KeyAction.CommitText("S"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("Q"),
                        action = KeyAction.CommitText("Q"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Œ"),
                        action = KeyAction.CommitText("Œ"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("D"),
                    action = KeyAction.CommitText("D"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
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
                        display = KeyDisplay.TextDisplay("G"),
                        action = KeyAction.CommitText("G"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Ë"),
                        action = KeyAction.CommitText("Ë"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("L"),
                    action = KeyAction.CommitText("L"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("J"),
                        action = KeyAction.CommitText("J"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("K"),
                        action = KeyAction.CommitText("K"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("H"),
                        action = KeyAction.CommitText("H"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Ü"),
                        action = KeyAction.CommitText("Ü"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("M"),
                    action = KeyAction.CommitText("M"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Ï"),
                        action = KeyAction.CommitText("Ï"),
                        color = ColorVariant.SECONDARY_SWIPES,
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
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("W"),
                        action = KeyAction.CommitText("W"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("W"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("X"),
                        action = KeyAction.CommitText("X"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Ç"),
                        action = KeyAction.CommitText("Ç"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("V"),
                    action = KeyAction.CommitText("V"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
            ),
            SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("B"),
                    action = KeyAction.CommitText("B"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("N"),
                    action = KeyAction.CommitText("N"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY_LEGENDS,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("?"),
                        action = KeyAction.CommitText("?"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("!"),
                        action = KeyAction.CommitText("!"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay(":"),
                        action = KeyAction.CommitText(":"),
                        color = ColorVariant.SECONDARY_SWIPES,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay(";"),
                        action = KeyAction.CommitText(";"),
                        color = ColorVariant.SECONDARY_SWIPES,
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

val KB_FR_TYPESPLIT: KeyboardDefinition = KeyboardDefinition(
    title = "ES Type-Split français",
    modes = KeyboardDefinitionModes(
        main = KB_FR_TYPESPLIT_MAIN,
        shifted = KB_FR_TYPESPLIT_SHIFTED,
        numeric = TYPESPLIT_NUMERIC_KEYBOARD,
    ),
)
