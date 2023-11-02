package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
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

val KB_FR_THUMBKEY_V2_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("l"),
                        action = KeyAction.CommitText("l"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("«"),
                                action = KeyAction.CommitText("«"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("»"),
                                action = KeyAction.CommitText("»"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("'"),
                                action = KeyAction.CommitText("'"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("^"),
                                action = KeyAction.CommitText("^"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("q"),
                                action = KeyAction.CommitText("q"),
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
                                display = KeyDisplay.TextDisplay("ü"),
                                action = KeyAction.CommitText("ü"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("û"),
                                action = KeyAction.CommitText("û"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ù"),
                                action = KeyAction.CommitText("ù"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("p"),
                                action = KeyAction.CommitText("p"),
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
                                display = KeyDisplay.TextDisplay("ï"),
                                action = KeyAction.CommitText("ï"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("î"),
                                action = KeyAction.CommitText("î"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("k"),
                                action = KeyAction.CommitText("k"),
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("y"),
                                action = KeyAction.CommitText("y"),
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
                                display = KeyDisplay.TextDisplay("v"),
                                action = KeyAction.CommitText("v"),
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
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("w"),
                                action = KeyAction.CommitText("w"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("j"),
                                action = KeyAction.CommitText("j"),
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("g"),
                                action = KeyAction.CommitText("g"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("b"),
                                action = KeyAction.CommitText("b"),
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("f"),
                                action = KeyAction.CommitText("f"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("h"),
                                action = KeyAction.CommitText("h"),
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("x"),
                                action = KeyAction.CommitText("x"),
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
                        display = KeyDisplay.TextDisplay("a"),
                        action = KeyAction.CommitText("a"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                action = KeyAction.ToggleShiftMode(true),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("@"),
                                action = KeyAction.CommitText("@"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("â"),
                                action = KeyAction.CommitText("â"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("à"),
                                action = KeyAction.CommitText("à"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("æ"),
                                action = KeyAction.CommitText("æ"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("d"),
                                action = KeyAction.CommitText("d"),
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
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("m"),
                                action = KeyAction.CommitText("m"),
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
                                display = KeyDisplay.TextDisplay("ç"),
                                action = KeyAction.CommitText("ç"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("c"),
                                action = KeyAction.CommitText("c"),
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("*"),
                                action = KeyAction.CommitText("*"),
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
                        display = KeyDisplay.TextDisplay("e"),
                        action = KeyAction.CommitText("e"),
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
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ë"),
                                action = KeyAction.CommitText("ë"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("é"),
                                action = KeyAction.CommitText("é"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ê"),
                                action = KeyAction.CommitText("ê"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("è"),
                                action = KeyAction.CommitText("è"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("œ"),
                                action = KeyAction.CommitText("œ"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ô"),
                                action = KeyAction.CommitText("ô"),
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

val KB_FR_THUMBKEY_V2_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("L"),
                        action = KeyAction.CommitText("L"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("«"),
                                action = KeyAction.CommitText("«"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("»"),
                                action = KeyAction.CommitText("»"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("'"),
                                action = KeyAction.CommitText("'"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("^"),
                                action = KeyAction.CommitText("^"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Q"),
                                action = KeyAction.CommitText("Q"),
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
                                display = KeyDisplay.TextDisplay("Ü"),
                                action = KeyAction.CommitText("Ü"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Û"),
                                action = KeyAction.CommitText("Û"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ù"),
                                action = KeyAction.CommitText("Ù"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("P"),
                                action = KeyAction.CommitText("P"),
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
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ï"),
                                action = KeyAction.CommitText("Ï"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Î"),
                                action = KeyAction.CommitText("Î"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("K"),
                                action = KeyAction.CommitText("K"),
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Y"),
                                action = KeyAction.CommitText("Y"),
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
                                display = KeyDisplay.TextDisplay("V"),
                                action = KeyAction.CommitText("V"),
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
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("W"),
                                action = KeyAction.CommitText("W"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("J"),
                                action = KeyAction.CommitText("J"),
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("G"),
                                action = KeyAction.CommitText("G"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("B"),
                                action = KeyAction.CommitText("B"),
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("F"),
                                action = KeyAction.CommitText("F"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("H"),
                                action = KeyAction.CommitText("H"),
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("X"),
                                action = KeyAction.CommitText("X"),
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
                        display = KeyDisplay.TextDisplay("A"),
                        action = KeyAction.CommitText("A"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                                action = KeyAction.ToggleCapsLock,
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("@"),
                                action = KeyAction.CommitText("@"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Â"),
                                action = KeyAction.CommitText("Â"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("À"),
                                action = KeyAction.CommitText("À"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                                action = KeyAction.ToggleShiftMode(false),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Æ"),
                                action = KeyAction.CommitText("Æ"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("D"),
                                action = KeyAction.CommitText("D"),
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
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("M"),
                                action = KeyAction.CommitText("M"),
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
                                display = KeyDisplay.TextDisplay("Ç"),
                                action = KeyAction.CommitText("Ç"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("C"),
                                action = KeyAction.CommitText("C"),
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("*"),
                                action = KeyAction.CommitText("*"),
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
                        display = KeyDisplay.TextDisplay("E"),
                        action = KeyAction.CommitText("E"),
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
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ë"),
                                action = KeyAction.CommitText("Ë"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("É"),
                                action = KeyAction.CommitText("É"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ê"),
                                action = KeyAction.CommitText("Ê"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("È"),
                                action = KeyAction.CommitText("È"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Œ"),
                                action = KeyAction.CommitText("Œ"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ô"),
                                action = KeyAction.CommitText("Ô"),
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

val KB_FR_THUMBKEY_V2: KeyboardDefinition =
    KeyboardDefinition(
        title = "français v2 thumb-key",
        modes =
        KeyboardDefinitionModes(
            main = KB_FR_THUMBKEY_V2_MAIN,
            shifted = KB_FR_THUMBKEY_V2_SHIFTED,
            numeric = NUMERIC_KEYBOARD,
        ),
    )
