package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.KeyboardDefinitionSettings
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe

val KB_ENEO_MESSAGEEASE_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("a"),
                        action = KeyAction.CommitText("a"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("v"),
                                action = KeyAction.CommitText("v"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("👍"),
                                action = KeyAction.CommitText("👍"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("🙁"),
                                action = KeyAction.CommitText("🙁"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("🙂"),
                                action = KeyAction.CommitText("🙂"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ŭ"),
                                action = KeyAction.CommitText("ŭ"),
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("♥"),
                                action = KeyAction.CommitText("♥"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("-"),
                                action = KeyAction.CommitText("-"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("$"),
                                action = KeyAction.CommitText("$"),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("n"),
                        action = KeyAction.CommitText("n"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("l"),
                                action = KeyAction.CommitText("l"),
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("`"),
                                action = KeyAction.CommitText("`"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("^"),
                                action = KeyAction.CommitText("^"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("´"),
                                action = KeyAction.CommitText("´"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("!"),
                                action = KeyAction.CommitText("!"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("\\"),
                                action = KeyAction.CommitText("\\"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("/"),
                                action = KeyAction.CommitText("/"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("+"),
                                action = KeyAction.CommitText("+"),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("i"),
                        action = KeyAction.CommitText("i"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("x"),
                                action = KeyAction.CommitText("x"),
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("?"),
                                action = KeyAction.CommitText("?"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("€"),
                                action = KeyAction.CommitText("€"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("👎"),
                                action = KeyAction.CommitText("👎"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("😂"),
                                action = KeyAction.CommitText("😂"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("🤣"),
                                action = KeyAction.CommitText("🤣"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("🔥"),
                                action = KeyAction.CommitText("🔥"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("="),
                                action = KeyAction.CommitText("="),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("h"),
                        action = KeyAction.CommitText("h"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("k"),
                                action = KeyAction.CommitText("k"),
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("{"),
                                action = KeyAction.CommitText("{"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("%"),
                                action = KeyAction.CommitText("%"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("_"),
                                action = KeyAction.CommitText("_"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("["),
                                action = KeyAction.CommitText("["),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ĥ"),
                                action = KeyAction.CommitText("ĥ"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ĉ"),
                                action = KeyAction.CommitText("ĉ"),
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("("),
                                action = KeyAction.CommitText("("),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("o"),
                        action = KeyAction.CommitText("o"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("q"),
                                action = KeyAction.CommitText("q"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("u"),
                                action = KeyAction.CommitText("u"),
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("p"),
                                action = KeyAction.CommitText("p"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("b"),
                                action = KeyAction.CommitText("b"),
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("j"),
                                action = KeyAction.CommitText("j"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("d"),
                                action = KeyAction.CommitText("d"),
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("g"),
                                action = KeyAction.CommitText("g"),
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("c"),
                                action = KeyAction.CommitText("c"),
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("r"),
                        action = KeyAction.CommitText("r"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("m"),
                                action = KeyAction.CommitText("m"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                action = KeyAction.ToggleShiftMode(true),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                                action = KeyAction.ToggleShiftMode(false),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("|"),
                                action = KeyAction.CommitText("|"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("}"),
                                action = KeyAction.CommitText("}"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(")"),
                                action = KeyAction.CommitText(")"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("]"),
                                action = KeyAction.CommitText("]"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("@"),
                                action = KeyAction.CommitText("@"),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("t"),
                        action = KeyAction.CommitText("t"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
//                swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("y"),
                                action = KeyAction.CommitText("y"),
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("~"),
                                action = KeyAction.CommitText("~"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("*"),
                                action = KeyAction.CommitText("*"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(":"),
                                action = KeyAction.CommitText(":"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("😍"),
                                action = KeyAction.CommitText("😍"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("✨"),
                                action = KeyAction.CommitText("✨"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ĵ"),
                                action = KeyAction.CommitText("ĵ"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("<"),
                                action = KeyAction.CommitText("<"),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("e"),
                        action = KeyAction.CommitText("e"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("w"),
                                action = KeyAction.CommitText("w"),
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("'"),
                                action = KeyAction.CommitText("'"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("z"),
                                action = KeyAction.CommitText("z"),
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("\""),
                                action = KeyAction.CommitText("\""),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(":"),
                                action = KeyAction.CommitText(":"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("."),
                                action = KeyAction.CommitText("."),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ĝ"),
                                action = KeyAction.CommitText("ĝ"),
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(","),
                                action = KeyAction.CommitText(","),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("s"),
                        action = KeyAction.CommitText("s"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("f"),
                                action = KeyAction.CommitText("f"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("&"),
                                action = KeyAction.CommitText("&"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("°"),
                                action = KeyAction.CommitText("°"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(">"),
                                action = KeyAction.CommitText(">"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(";"),
                                action = KeyAction.CommitText(";"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ŝ"),
                                action = KeyAction.CommitText("ŝ"),
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("🇦🇺"),
                                action = KeyAction.CommitText("🇦🇺"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("#"),
                                action = KeyAction.CommitText("#"),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ENEO_MESSAGEEASE_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("A"),
                        action = KeyAction.CommitText("A"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("V"),
                                action = KeyAction.CommitText("V"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("👍"),
                                action = KeyAction.CommitText("👍"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("🙁"),
                                action = KeyAction.CommitText("🙁"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("🙂"),
                                action = KeyAction.CommitText("🙂"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ŭ"),
                                action = KeyAction.CommitText("Ŭ"),
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("♥"),
                                action = KeyAction.CommitText("♥"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("-"),
                                action = KeyAction.CommitText("-"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("$"),
                                action = KeyAction.CommitText("$"),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("N"),
                        action = KeyAction.CommitText("N"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("L"),
                                action = KeyAction.CommitText("L"),
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("`"),
                                action = KeyAction.CommitText("`"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("^"),
                                action = KeyAction.CommitText("^"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("´"),
                                action = KeyAction.CommitText("´"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("!"),
                                action = KeyAction.CommitText("!"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("\\"),
                                action = KeyAction.CommitText("\\"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("/"),
                                action = KeyAction.CommitText("/"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("+"),
                                action = KeyAction.CommitText("+"),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("I"),
                        action = KeyAction.CommitText("I"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("X"),
                                action = KeyAction.CommitText("X"),
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("?"),
                                action = KeyAction.CommitText("?"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("€"),
                                action = KeyAction.CommitText("€"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("👎"),
                                action = KeyAction.CommitText("👎"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("😂"),
                                action = KeyAction.CommitText("😂"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("🤣"),
                                action = KeyAction.CommitText("🤣"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("🔥"),
                                action = KeyAction.CommitText("🔥"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("="),
                                action = KeyAction.CommitText("="),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("H"),
                        action = KeyAction.CommitText("H"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("K"),
                                action = KeyAction.CommitText("K"),
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("{"),
                                action = KeyAction.CommitText("{"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("%"),
                                action = KeyAction.CommitText("%"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("_"),
                                action = KeyAction.CommitText("_"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("["),
                                action = KeyAction.CommitText("["),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ĥ"),
                                action = KeyAction.CommitText("Ĥ"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ĉ"),
                                action = KeyAction.CommitText("Ĉ"),
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("("),
                                action = KeyAction.CommitText("("),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("O"),
                        action = KeyAction.CommitText("O"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Q"),
                                action = KeyAction.CommitText("Q"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("U"),
                                action = KeyAction.CommitText("U"),
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("P"),
                                action = KeyAction.CommitText("P"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("B"),
                                action = KeyAction.CommitText("B"),
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("J"),
                                action = KeyAction.CommitText("J"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("D"),
                                action = KeyAction.CommitText("D"),
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("G"),
                                action = KeyAction.CommitText("G"),
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("C"),
                                action = KeyAction.CommitText("C"),
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("R"),
                        action = KeyAction.CommitText("R"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("M"),
                                action = KeyAction.CommitText("M"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                action = KeyAction.ToggleShiftMode(true),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                                action = KeyAction.ToggleShiftMode(false),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("|"),
                                action = KeyAction.CommitText("|"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("}"),
                                action = KeyAction.CommitText("}"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(")"),
                                action = KeyAction.CommitText(")"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("]"),
                                action = KeyAction.CommitText("]"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("@"),
                                action = KeyAction.CommitText("@"),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("T"),
                        action = KeyAction.CommitText("T"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
//                swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Y"),
                                action = KeyAction.CommitText("Y"),
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("~"),
                                action = KeyAction.CommitText("~"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("*"),
                                action = KeyAction.CommitText("*"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("😍"),
                                action = KeyAction.CommitText("😍"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("✨"),
                                action = KeyAction.CommitText("✨"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ĵ"),
                                action = KeyAction.CommitText("Ĵ"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(":"),
                                action = KeyAction.CommitText(":"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("<"),
                                action = KeyAction.CommitText("<"),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("E"),
                        action = KeyAction.CommitText("E"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("W"),
                                action = KeyAction.CommitText("W"),
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("'"),
                                action = KeyAction.CommitText("'"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Z"),
                                action = KeyAction.CommitText("Z"),
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ĝ"),
                                action = KeyAction.CommitText("Ĝ"),
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("\""),
                                action = KeyAction.CommitText("\""),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(":"),
                                action = KeyAction.CommitText(":"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("."),
                                action = KeyAction.CommitText("."),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(","),
                                action = KeyAction.CommitText(","),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("S"),
                        action = KeyAction.CommitText("S"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("F"),
                                action = KeyAction.CommitText("F"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ŝ"),
                                action = KeyAction.CommitText("Ŝ"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("&"),
                                action = KeyAction.CommitText("&"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("°"),
                                action = KeyAction.CommitText("°"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(">"),
                                action = KeyAction.CommitText(">"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(";"),
                                action = KeyAction.CommitText(";"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("#"),
                                action = KeyAction.CommitText("#"),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ENEO_MESSAGEEASE_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "english esperanto symbols messageease",
        modes =
        KeyboardDefinitionModes(
            main = KB_ENEO_MESSAGEEASE_SYMBOLS_MAIN,
            shifted = KB_ENEO_MESSAGEEASE_SYMBOLS_SHIFTED,
            numeric = NUMERIC_KEYBOARD,
        ),
        settings =
        KeyboardDefinitionSettings(
            autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
        ),
    )
