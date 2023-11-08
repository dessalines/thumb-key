package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardCapslock
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

// Adds more punctuation options to the main screen to reduce switches to the numeric keyboard
val KB_ID_THUMBKEY_SYMBOLS_NUMERIC_V1_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("t"),
                        action = KeyAction.CommitText("t"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("h"),
                                action = KeyAction.CommitText("h"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("1"),
                                action = KeyAction.CommitText("1"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("2"),
                                action = KeyAction.CommitText("2"),
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
                        display = KeyDisplay.TextDisplay("d"),
                        action = KeyAction.CommitText("d"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("g"),
                                action = KeyAction.CommitText("g"),
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
                                display = KeyDisplay.TextDisplay("m"),
                                action = KeyAction.CommitText("m"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("3"),
                                action = KeyAction.CommitText("3"),
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
                        display = KeyDisplay.TextDisplay("r"),
                        action = KeyAction.CommitText("r"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("b"),
                                action = KeyAction.CommitText("b"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("4"),
                                action = KeyAction.CommitText("4"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("5"),
                                action = KeyAction.CommitText("5"),
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
                        display = KeyDisplay.TextDisplay("s"),
                        action = KeyAction.CommitText("s"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("x"),
                                action = KeyAction.CommitText("x"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("f"),
                                action = KeyAction.CommitText("f"),
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("c"),
                                action = KeyAction.CommitText("c"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("j"),
                                action = KeyAction.CommitText("j"),
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("y"),
                                action = KeyAction.CommitText("y"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("w"),
                                action = KeyAction.CommitText("w"),
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("v"),
                                action = KeyAction.CommitText("v"),
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("z"),
                                action = KeyAction.CommitText("z"),
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
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("k"),
                                action = KeyAction.CommitText("k"),
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
                        display = KeyDisplay.TextDisplay("n"),
                        action = KeyAction.CommitText("n"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("p"),
                                action = KeyAction.CommitText("p"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("6"),
                                action = KeyAction.CommitText("6"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("7"),
                                action = KeyAction.CommitText("7"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("8"),
                                action = KeyAction.CommitText("8"),
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("~"),
                                action = KeyAction.CommitText("~"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(":"),
                                action = KeyAction.CommitText(":"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
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
                        display = KeyDisplay.TextDisplay("u"),
                        action = KeyAction.CommitText("u"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("l"),
                                action = KeyAction.CommitText("l"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("q"),
                                action = KeyAction.CommitText("q"),
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("\""),
                                action = KeyAction.CommitText("\""),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("'"),
                                action = KeyAction.CommitText("'"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("-"),
                                action = KeyAction.CommitText("-"),
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
                                display = KeyDisplay.TextDisplay("*"),
                                action = KeyAction.CommitText("*"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.LEFT to
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
                        display = KeyDisplay.TextDisplay("a"),
                        action = KeyAction.CommitText("a"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("o"),
                                action = KeyAction.CommitText("o"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("9"),
                                action = KeyAction.CommitText("9"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("0"),
                                action = KeyAction.CommitText("0"),
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
                        SwipeDirection.BOTTOM_RIGHT to
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

val KB_ID_THUMBKEY_SYMBOLS_NUMERIC_V1_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("T"),
                        action = KeyAction.CommitText("T"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("H"),
                                action = KeyAction.CommitText("H"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("1"),
                                action = KeyAction.CommitText("1"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("2"),
                                action = KeyAction.CommitText("2"),
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
                        display = KeyDisplay.TextDisplay("D"),
                        action = KeyAction.CommitText("D"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("G"),
                                action = KeyAction.CommitText("G"),
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
                                display = KeyDisplay.TextDisplay("M"),
                                action = KeyAction.CommitText("M"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("3"),
                                action = KeyAction.CommitText("3"),
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
                        display = KeyDisplay.TextDisplay("R"),
                        action = KeyAction.CommitText("R"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("B"),
                                action = KeyAction.CommitText("B"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("4"),
                                action = KeyAction.CommitText("4"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("5"),
                                action = KeyAction.CommitText("5"),
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
                        display = KeyDisplay.TextDisplay("S"),
                        action = KeyAction.CommitText("S"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("X"),
                                action = KeyAction.CommitText("X"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("F"),
                                action = KeyAction.CommitText("F"),
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("C"),
                                action = KeyAction.CommitText("C"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("J"),
                                action = KeyAction.CommitText("J"),
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Y"),
                                action = KeyAction.CommitText("Y"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("W"),
                                action = KeyAction.CommitText("W"),
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("V"),
                                action = KeyAction.CommitText("V"),
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Z"),
                                action = KeyAction.CommitText("Z"),
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
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("K"),
                                action = KeyAction.CommitText("K"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                                capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                                action = KeyAction.ToggleCapsLock,
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
                        display = KeyDisplay.TextDisplay("N"),
                        action = KeyAction.CommitText("N"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("P"),
                                action = KeyAction.CommitText("P"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("6"),
                                action = KeyAction.CommitText("6"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("7"),
                                action = KeyAction.CommitText("7"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("8"),
                                action = KeyAction.CommitText("8"),
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("~"),
                                action = KeyAction.CommitText("~"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(":"),
                                action = KeyAction.CommitText(":"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
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
                        display = KeyDisplay.TextDisplay("U"),
                        action = KeyAction.CommitText("U"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("L"),
                                action = KeyAction.CommitText("L"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Q"),
                                action = KeyAction.CommitText("Q"),
                            ),
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("\""),
                                action = KeyAction.CommitText("\""),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("'"),
                                action = KeyAction.CommitText("'"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("-"),
                                action = KeyAction.CommitText("-"),
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
                                display = KeyDisplay.TextDisplay("*"),
                                action = KeyAction.CommitText("*"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.LEFT to
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
                        display = KeyDisplay.TextDisplay("A"),
                        action = KeyAction.CommitText("A"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("O"),
                                action = KeyAction.CommitText("O"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("9"),
                                action = KeyAction.CommitText("9"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("0"),
                                action = KeyAction.CommitText("0"),
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
                        SwipeDirection.BOTTOM_RIGHT to
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

val KB_ID_THUMBKEY_SYMBOLS_NUMERIC_V1: KeyboardDefinition =
    KeyboardDefinition(
        title = "bahasa indonesia symbols numeric v1 thumb-key",
        modes =
        KeyboardDefinitionModes(
            main = KB_ID_THUMBKEY_SYMBOLS_NUMERIC_V1_MAIN,
            shifted = KB_ID_THUMBKEY_SYMBOLS_NUMERIC_V1_SHIFTED,
            numeric = NUMERIC_KEYBOARD,
        ),
    )
