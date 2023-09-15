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
import com.dessalines.thumbkey.utils.KeyboardMode
import com.dessalines.thumbkey.utils.SwipeDirection

val THUMBKEY_LV_LTG_V1_MAIN = KeyboardC(
    listOf(
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("r"),
                    action = KeyAction.CommitText("r"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("d"),
                        action = KeyAction.CommitText("d"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("k"),
                    action = KeyAction.CommitText("k"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ķ"),
                        action = KeyAction.CommitText("ķ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("v"),
                        action = KeyAction.CommitText("v"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("e"),
                    action = KeyAction.CommitText("e"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ē"),
                        action = KeyAction.CommitText("ē"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("j"),
                        action = KeyAction.CommitText("j"),
                    ),
                ),
            ),
            SETTINGS_KEY_ITEM,
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("t"),
                    action = KeyAction.CommitText("t"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ļ"),
                        action = KeyAction.CommitText("ļ"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("l"),
                        action = KeyAction.CommitText("l"),
                    ),

                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("n"),
                    action = KeyAction.CommitText("n"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("c"),
                        action = KeyAction.CommitText("c"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("h"),
                        action = KeyAction.CommitText("h"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("č"),
                        action = KeyAction.CommitText("č"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ģ"),
                        action = KeyAction.CommitText("ģ"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ņ"),
                        action = KeyAction.CommitText("ņ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("f"),
                        action = KeyAction.CommitText("f"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("b"),
                        action = KeyAction.CommitText("b"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("g"),
                        action = KeyAction.CommitText("g"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("i"),
                    action = KeyAction.CommitText("i"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ī"),
                        action = KeyAction.CommitText("ī"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                        action = KeyAction.ToggleShiftMode(true),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ž"),
                        action = KeyAction.CommitText("ž"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("y"),
                        action = KeyAction.CommitText("y"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("z"),
                        action = KeyAction.CommitText("z"),
                    ),
                ),
            ),
            NUMERIC_KEY_ITEM,
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("s"),
                    action = KeyAction.CommitText("s"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("š"),
                        action = KeyAction.CommitText("š"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("m"),
                        action = KeyAction.CommitText("m"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("u"),
                    action = KeyAction.CommitText("u"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("p"),
                        action = KeyAction.CommitText("p"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("'"),
                        action = KeyAction.CommitText("'"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("-"),
                        action = KeyAction.CommitText("-"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("."),
                        action = KeyAction.CommitText("."),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("*"),
                        action = KeyAction.CommitText("*"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ū"),
                        action = KeyAction.CommitText("ū"),
                        color = ColorVariant.MUTED,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("a"),
                    action = KeyAction.CommitText("a"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("o"),
                        action = KeyAction.CommitText("o"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ā"),
                        action = KeyAction.CommitText("ā"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ō"),
                        action = KeyAction.CommitText("ō"),
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

val THUMBKEY_LV_LTG_V1_SHIFTED = KeyboardC(
    listOf(
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("R"),
                    action = KeyAction.CommitText("R"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("D"),
                        action = KeyAction.CommitText("D"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("K"),
                    action = KeyAction.CommitText("K"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Ķ"),
                        action = KeyAction.CommitText("Ķ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("V"),
                        action = KeyAction.CommitText("V"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("E"),
                    action = KeyAction.CommitText("E"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Ē"),
                        action = KeyAction.CommitText("Ē"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("J"),
                        action = KeyAction.CommitText("J"),
                    ),
                ),
            ),
            SETTINGS_KEY_ITEM,
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("T"),
                    action = KeyAction.CommitText("T"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Ļ"),
                        action = KeyAction.CommitText("Ļ"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("L"),
                        action = KeyAction.CommitText("L"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("N"),
                    action = KeyAction.CommitText("N"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("C"),
                        action = KeyAction.CommitText("C"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("H"),
                        action = KeyAction.CommitText("H"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Č"),
                        action = KeyAction.CommitText("Č"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Ģ"),
                        action = KeyAction.CommitText("Ģ"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Ņ"),
                        action = KeyAction.CommitText("Ņ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("F"),
                        action = KeyAction.CommitText("F"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("B"),
                        action = KeyAction.CommitText("B"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("G"),
                        action = KeyAction.CommitText("G"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("I"),
                    action = KeyAction.CommitText("I"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("Ī"),
                        action = KeyAction.CommitText("Ī"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                        capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                        action = KeyAction.ToggleCapsLock,
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Ž"),
                        action = KeyAction.CommitText("Ž"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                        action = KeyAction.ToggleShiftMode(false),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("Y"),
                        action = KeyAction.CommitText("Y"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("Z"),
                        action = KeyAction.CommitText("Z"),
                    ),
                ),
            ),
            NUMERIC_KEY_ITEM,
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("S"),
                    action = KeyAction.CommitText("S"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Š"),
                        action = KeyAction.CommitText("Š"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("M"),
                        action = KeyAction.CommitText("M"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("U"),
                    action = KeyAction.CommitText("U"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("P"),
                        action = KeyAction.CommitText("P"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("'"),
                        action = KeyAction.CommitText("'"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("-"),
                        action = KeyAction.CommitText("-"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("."),
                        action = KeyAction.CommitText("."),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("*"),
                        action = KeyAction.CommitText("*"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("Ū"),
                        action = KeyAction.CommitText("Ū"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("A"),
                    action = KeyAction.CommitText("A"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("O"),
                        action = KeyAction.CommitText("O"),
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Ā"),
                        action = KeyAction.CommitText("Ā"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("Ō"),
                        action = KeyAction.CommitText("Ō"),
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

val THUMBKEY_LV_LTG_V1_KEYBOARD_MODES: Map<KeyboardMode, KeyboardC> = mapOf(
    KeyboardMode.MAIN to THUMBKEY_LV_LTG_V1_MAIN,
    KeyboardMode.SHIFTED to THUMBKEY_LV_LTG_V1_SHIFTED,
    KeyboardMode.NUMERIC to NUMERIC_KEYBOARD,
)
