package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
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
import com.dessalines.thumbkey.utils.SwipeNWay
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe
import com.dessalines.thumbkey.utils.capitaliseKeyboardLetters
import com.dessalines.thumbkey.utils.makeVariant

// Adds more punctuation options to the main screen to reduce switches to the numeric keyboard
val KB_EN_THUMBKEY_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("s"),
                            action = KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("w"),
                                    action = KeyAction.CommitText("w"),
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
                            display = KeyDisplay.TextDisplay("r"),
                            action = KeyAction.CommitText("r"),
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
                            display = KeyDisplay.TextDisplay("o"),
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("u"),
                                    action = KeyAction.CommitText("u"),
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
                            display = KeyDisplay.TextDisplay("n"),
                            action = KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("m"),
                                    action = KeyAction.CommitText("m"),
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
                            display = KeyDisplay.TextDisplay("h"),
                            action = KeyAction.CommitText("h"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("j"),
                                    action = KeyAction.CommitText("j"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("q"),
                                    action = KeyAction.CommitText("q"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("b"),
                                    action = KeyAction.CommitText("b"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("p"),
                                    action = KeyAction.CommitText("p"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("y"),
                                    action = KeyAction.CommitText("y"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("x"),
                                    action = KeyAction.CommitText("x"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("v"),
                                    action = KeyAction.CommitText("v"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("k"),
                                    action = KeyAction.CommitText("k"),
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
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("l"),
                                    action = KeyAction.CommitText("l"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                    action = KeyAction.ToggleShiftMode(true),
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
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("c"),
                                    action = KeyAction.CommitText("c"),
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
                            display = KeyDisplay.TextDisplay("i"),
                            action = KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("f"),
                                    action = KeyAction.CommitText("f"),
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
                            display = KeyDisplay.TextDisplay("e"),
                            action = KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("d"),
                                    action = KeyAction.CommitText("d"),
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

val KB_EN_THUMBKEY_SYMBOLS_SHIFTED =
    makeVariant(
        capitaliseKeyboardLetters(KB_EN_THUMBKEY_SYMBOLS_MAIN),
        KeyboardC(
            listOf(
                DUMMY_ROW,
                listOf(
                    DUMMY_KEYITEM,
                    DUMMY_KEYITEM,
                    SHIFTED_OVERRIDE_KEYITEM,
                    DUMMY_KEYITEM,
                ),
                DUMMY_ROW,
                listOf(
                    DUMMY_KEYITEM,
                    DUMMY_KEYITEM,
                ),
            ),
        ),
    )

val KB_EN_THUMBKEY_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "english symbols thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_SYMBOLS_MAIN,
                shifted = KB_EN_THUMBKEY_SYMBOLS_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
