package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardBackspace
import androidx.compose.material.icons.outlined.KeyboardCapslock
import androidx.compose.material.icons.outlined.Settings
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardMode
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.SwipeNWay

val FOUR_COLUMNS_EN_V1 = KeyboardC(
    listOf(
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("e"),
                    action = KeyAction.CommitText("e"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("q"),
                        action = KeyAction.CommitText("q"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("q"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("w"),
                        action = KeyAction.CommitText("w"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("t"),
                    action = KeyAction.CommitText("t"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("r"),
                        action = KeyAction.CommitText("r"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay(" "),
                    action = KeyAction.CommitText(" "),
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        action = KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_LEFT,
                            ),
                        ),
                        display = null,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        action = KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_RIGHT,
                            ),
                        ),
                        display = null,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("*"),
                        action = KeyAction.CommitText("*"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                        action = KeyAction.GotoSettings,
                        color = ColorVariant.SECONDARY,
                    ),
                ),
                nextTapActions = listOf(
                    KeyAction.ReplaceLastText(", ", trimCount = 1),
                    KeyAction.ReplaceLastText(". "),
                    KeyAction.ReplaceLastText("? "),
                    KeyAction.ReplaceLastText("! "),
                    KeyAction.ReplaceLastText(": "),
                    KeyAction.ReplaceLastText("; "),
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT,
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("i"),
                    action = KeyAction.CommitText("i"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("y"),
                        action = KeyAction.CommitText("y"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("y"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("u"),
                        action = KeyAction.CommitText("u"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("o"),
                    action = KeyAction.CommitText("o"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("p"),
                        action = KeyAction.CommitText("p"),
                    ),
                ),
            ),
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("a"),
                    action = KeyAction.CommitText("a"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("s"),
                    action = KeyAction.CommitText("s"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
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
                        display = KeyDisplay.TextDisplay("d"),
                        action = KeyAction.CommitText("d"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay(" "),
                    action = KeyAction.CommitText(" "),
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        action = KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_LEFT,
                            ),
                        ),
                        display = null,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        action = KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_RIGHT,
                            ),
                        ),
                        display = null,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay(","),
                        action = KeyAction.CommitText(","),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("'"),
                        action = KeyAction.CommitText("'"),
                        color = ColorVariant.MUTED,
                    ),
                ),
                nextTapActions = listOf(
                    KeyAction.ReplaceLastText(", ", trimCount = 1),
                    KeyAction.ReplaceLastText(". "),
                    KeyAction.ReplaceLastText("? "),
                    KeyAction.ReplaceLastText("! "),
                    KeyAction.ReplaceLastText(": "),
                    KeyAction.ReplaceLastText("; "),
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT,
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("h"),
                    action = KeyAction.CommitText("h"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("g"),
                        action = KeyAction.CommitText("g"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("l"),
                    action = KeyAction.CommitText("l"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = null,
                        action = KeyAction.CommitText("j"),
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("j"),
                        action = KeyAction.CommitText("j"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("k"),
                        action = KeyAction.CommitText("k"),
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
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay(" "),
                    action = KeyAction.CommitText(" "),
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        action = KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_LEFT,
                            ),
                        ),
                        display = null,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        action = KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_RIGHT,
                            ),
                        ),
                        display = null,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("."),
                        action = KeyAction.CommitText("."),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("-"),
                        action = KeyAction.CommitText("-"),
                        color = ColorVariant.MUTED,
                    ),
                ),
                nextTapActions = listOf(
                    KeyAction.ReplaceLastText(", ", trimCount = 1),
                    KeyAction.ReplaceLastText(". "),
                    KeyAction.ReplaceLastText("? "),
                    KeyAction.ReplaceLastText("! "),
                    KeyAction.ReplaceLastText(": "),
                    KeyAction.ReplaceLastText("; "),
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT,
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("n"),
                    action = KeyAction.CommitText("n"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("m"),
                    action = KeyAction.CommitText("m"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
            ),
        ),
        listOf(
            NUMERIC_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardBackspace),
                    action = KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent
                                .KEYCODE_DEL,
                        ),
                    ),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        action = KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent
                                    .KEYCODE_FORWARD_DEL,
                            ),
                        ),
                        display = null,
                        color = ColorVariant.MUTED,
                        size = FontSizeVariant.SMALLEST,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                        action = KeyAction.ToggleShiftMode(true),
                        color = ColorVariant.SECONDARY,
                    ),
                ),
                widthMultiplier = 3,
                backgroundColor = ColorVariant.SURFACE_VARIANT,
            ),
            RETURN_KEY_ITEM,
        ),
    ),
)

val FOUR_COLUMNS_EN_V1_SHIFTED = KeyboardC(
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
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay(" "),
                    action = KeyAction.CommitText(" "),
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        action = KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_LEFT,
                            ),
                        ),
                        display = null,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        action = KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_RIGHT,
                            ),
                        ),
                        display = null,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("*"),
                        action = KeyAction.CommitText("*"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                        action = KeyAction.GotoSettings,
                        color = ColorVariant.SECONDARY,
                    ),
                ),
                nextTapActions = listOf(
                    KeyAction.ReplaceLastText(", ", trimCount = 1),
                    KeyAction.ReplaceLastText(". "),
                    KeyAction.ReplaceLastText("? "),
                    KeyAction.ReplaceLastText("! "),
                    KeyAction.ReplaceLastText(": "),
                    KeyAction.ReplaceLastText("; "),
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT,
            ),
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
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay(" "),
                    action = KeyAction.CommitText(" "),
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        action = KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_LEFT,
                            ),
                        ),
                        display = null,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        action = KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_RIGHT,
                            ),
                        ),
                        display = null,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay(","),
                        action = KeyAction.CommitText(","),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("'"),
                        action = KeyAction.CommitText("'"),
                        color = ColorVariant.MUTED,
                    ),
                ),
                nextTapActions = listOf(
                    KeyAction.ReplaceLastText(", ", trimCount = 1),
                    KeyAction.ReplaceLastText(". "),
                    KeyAction.ReplaceLastText("? "),
                    KeyAction.ReplaceLastText("! "),
                    KeyAction.ReplaceLastText(": "),
                    KeyAction.ReplaceLastText("; "),
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT,
            ),
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
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay(" "),
                    action = KeyAction.CommitText(" "),
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        action = KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_LEFT,
                            ),
                        ),
                        display = null,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        action = KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_RIGHT,
                            ),
                        ),
                        display = null,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("."),
                        action = KeyAction.CommitText("."),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("-"),
                        action = KeyAction.CommitText("-"),
                        color = ColorVariant.MUTED,
                    ),
                ),
                nextTapActions = listOf(
                    KeyAction.ReplaceLastText(", ", trimCount = 1),
                    KeyAction.ReplaceLastText(". "),
                    KeyAction.ReplaceLastText("? "),
                    KeyAction.ReplaceLastText("! "),
                    KeyAction.ReplaceLastText(": "),
                    KeyAction.ReplaceLastText("; "),
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT,
            ),
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
            ),
        ),
        listOf(
            NUMERIC_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardBackspace),
                    action = KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent
                                .KEYCODE_DEL,
                        ),
                    ),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        action = KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent
                                    .KEYCODE_FORWARD_DEL,
                            ),
                        ),
                        display = null,
                        color = ColorVariant.MUTED,
                        size = FontSizeVariant.SMALLEST,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                        capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                        action = KeyAction.ToggleCapsLock,
                        color = ColorVariant.SECONDARY,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                        action = KeyAction.ToggleShiftMode(false),
                        color = ColorVariant.SECONDARY,
                    ),
                ),
                widthMultiplier = 3,
                backgroundColor = ColorVariant.SURFACE_VARIANT,
            ),
            RETURN_KEY_ITEM,
        ),
    ),
)

val FOUR_COLUMNS_EN_V1_KEYBOARD_MODES: Map<KeyboardMode, KeyboardC> = mapOf(
    KeyboardMode.MAIN to FOUR_COLUMNS_EN_V1,
    KeyboardMode.SHIFTED to FOUR_COLUMNS_EN_V1_SHIFTED,
    KeyboardMode.NUMERIC to NUMERIC_KEYBOARD,
)
