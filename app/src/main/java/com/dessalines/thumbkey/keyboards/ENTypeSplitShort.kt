package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.ArrowForward
import androidx.compose.material.icons.automirrored.outlined.KeyboardReturn
import androidx.compose.material.icons.automirrored.outlined.KeyboardTab
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.ArrowDownward
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.ArrowUpward
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardCapslock
import androidx.compose.material.icons.outlined.Settings
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
import com.dessalines.thumbkey.utils.SlideType
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.SwipeNWay
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe
import com.dessalines.thumbkey.utils.getLocalCurrency

val EN_TYPESPLIT_SHORT_SPACEBAR_SHIFT_KEY_ITEM =
    KeyItemC(
        center =
        KeyC(
            display = KeyDisplay.TextDisplay(" "),
            action = KeyAction.CommitText(" "),
        ),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        swipes =
        mapOf(
            SwipeDirection.LEFT to
                    KeyC(
                        action =
                        KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_LEFT,
                            ),
                        ),
                        display = null,
                    ),
            SwipeDirection.RIGHT to
                    KeyC(
                        action =
                        KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_RIGHT,
                            ),
                        ),
                        display = null,
                    ),
            SwipeDirection.TOP to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                        action = KeyAction.ToggleShiftMode(true),
                        swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                        color = ColorVariant.MUTED,
                    ),
            SwipeDirection.BOTTOM to
                    KeyC(
                        action = KeyAction.ToggleShiftMode(false),
                        swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                    ),
        ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        widthMultiplier = 3,
    )

val EN_TYPESPLIT_SHORT_RETURN_KEY_ITEM =
    KeyItemC(
        center =
        KeyC(
            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
            action = KeyAction.IMECompleteAction,
            size = FontSizeVariant.LARGE,
            color = ColorVariant.SECONDARY,
        ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        longPress = KeyAction.CommitText("\n"),
        swipes =
        mapOf(
            SwipeDirection.TOP to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                        action = KeyAction.CommitText("\t"),
                        color = ColorVariant.MUTED,
                    ),
        )
    )

val EN_TYPESPLIT_SHORT_SPACEBAR_SHIFT_KEY_SHIFTED_ITEM =
    KeyItemC(
        center =
        KeyC(
            display = KeyDisplay.TextDisplay(" "),
            action = KeyAction.CommitText(" "),
        ),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        swipes =
        mapOf(
            SwipeDirection.LEFT to
                    KeyC(
                        action =
                        KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_LEFT,
                            ),
                        ),
                        display = null,
                    ),
            SwipeDirection.RIGHT to
                    KeyC(
                        action =
                        KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_RIGHT,
                            ),
                        ),
                        display = null,
                    ),
            SwipeDirection.BOTTOM to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                        action = KeyAction.ToggleShiftMode(false),
                        swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        color = ColorVariant.MUTED,
                    ),
            SwipeDirection.TOP to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                        capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                        action = KeyAction.ToggleCapsLock,
                        swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                        color = ColorVariant.MUTED,
                    ),
        ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        widthMultiplier = 3,
    )

val EN_TYPESPLIT_SHORT_SPACEBAR_ARROWS_KEY_ITEM =
    KeyItemC(
        center =
        KeyC(
            display = KeyDisplay.TextDisplay(" "),
            action = KeyAction.CommitText(" "),
        ),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        swipes =
        mapOf(
            SwipeDirection.LEFT to
                    KeyC(
                        action =
                        KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_LEFT,
                            ),
                        ),
                        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.ArrowBack),
                        color = ColorVariant.MUTED,
                    ),
            SwipeDirection.RIGHT to
                    KeyC(
                        action =
                        KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_RIGHT,
                            ),
                        ),
                        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.ArrowForward),
                        color = ColorVariant.MUTED,
                    ),
            SwipeDirection.TOP to
                    KeyC(
                        action =
                        KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_UP,
                            ),
                        ),
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowUpward),
                        color = ColorVariant.MUTED,
                    ),
            SwipeDirection.BOTTOM to
                    KeyC(
                        action =
                        KeyAction.SendEvent(
                            KeyEvent(
                                KeyEvent.ACTION_DOWN,
                                KeyEvent.KEYCODE_DPAD_DOWN,
                            ),
                        ),
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDownward),
                        color = ColorVariant.MUTED,
                    ),
        ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        widthMultiplier = 3,
    )

val KB_EN_TYPESPLIT_SHORT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC( // A
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("a"),
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.RIGHT to
                                    KeyC(
                                        display = KeyDisplay.TextDisplay("x"),
                                        action = KeyAction.CommitText("x"),
                                    ),
                            SwipeDirection.LEFT to
                                    KeyC(
                                        display = KeyDisplay.TextDisplay("-"),
                                        action = KeyAction.CommitText("-"),
                                        color = ColorVariant.MUTED,
                                    ),
                            SwipeDirection.BOTTOM to
                                    KeyC(
                                        display = KeyDisplay.TextDisplay("z"),
                                        action = KeyAction.CommitText("z"),
                                    ),
                            SwipeDirection.TOP to
                                    KeyC(
                                        display = KeyDisplay.TextDisplay("'"),
                                        action = KeyAction.CommitText("'"),
                                        color = ColorVariant.MUTED,
                                    ),
                        ),
                ), // done
                KeyItemC( // E
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("e"),
                            action = KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("."),
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("g"),
                                    action = KeyAction.CommitText("g"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("u"),
                                    action = KeyAction.CommitText("u"),
                                ),
                            SwipeDirection.TOP to
                                    KeyC(
                                        display = KeyDisplay.TextDisplay("y"),
                                        action = KeyAction.CommitText("y"),
                                    ),
                        ),
                ), // done
                EMOJI_KEY_ITEM,
                KeyItemC( // T
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("t"),
                        action = KeyAction.CommitText("t"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("d"),
                                    action = KeyAction.CommitText("d"),
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(","),
                                    action = KeyAction.CommitText(","),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("r"),
                                    action = KeyAction.CommitText("r"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("l"),
                                    action = KeyAction.CommitText("l"),
                                ),
                    ),
                ), // done
                KeyItemC( // S
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("s"),
                        action = KeyAction.CommitText("s"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("*"),
                                    action = KeyAction.CommitText("*"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("b"),
                                    action = KeyAction.CommitText("b"),
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("c"),
                                    action = KeyAction.CommitText("c"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\""),
                                    action = KeyAction.CommitText("\""),
                                    color = ColorVariant.MUTED,
                                ),
                    ),
                ), // done
            ),
            listOf(
                KeyItemC( // i
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("i"),
                        action = KeyAction.CommitText("i"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(":"),
                                    action = KeyAction.CommitText(":"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("("),
                                    action = KeyAction.CommitText("("),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("q"),
                                    action = KeyAction.CommitText("q"),
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("9"),
                                    action = KeyAction.CommitText("9"),
                                    color = ColorVariant.MUTED,
                                ),
                    ),
                ), // done
                KeyItemC( // o
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("o"),
                        action = KeyAction.CommitText("o"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("!"),
                                    action = KeyAction.CommitText("!"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("j"),
                                    action = KeyAction.CommitText("j"),
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("k"),
                                    action = KeyAction.CommitText("k"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("p"),
                                    action = KeyAction.CommitText("p"),
                                ),
                    ),
                ), // done
                NUMERIC_KEY_ITEM,
                KeyItemC( // n
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("n"),
                        action = KeyAction.CommitText("n"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("f"),
                                    action = KeyAction.CommitText("f"),
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("?"),
                                    action = KeyAction.CommitText("?"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("w"),
                                    action = KeyAction.CommitText("w"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("m"),
                                    action = KeyAction.CommitText("m"),
                                ),
                    ),
                ), // done
                KeyItemC( // h
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("h"),
                        action = KeyAction.CommitText("h"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(";"),
                                    action = KeyAction.CommitText(";"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(")"),
                                    action = KeyAction.CommitText(")"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("v"),
                                    action = KeyAction.CommitText("v"),
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("0"),
                                    action = KeyAction.CommitText("0"),
                                    color = ColorVariant.MUTED,
                                ),
                    ),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                EN_TYPESPLIT_SHORT_SPACEBAR_SHIFT_KEY_ITEM,
                EN_TYPESPLIT_SHORT_RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_TYPESPLIT_SHORT_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC( // A
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("A"),
                        action = KeyAction.CommitText("A"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("X"),
                                    action = KeyAction.CommitText("X"),
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("-"),
                                    action = KeyAction.CommitText("-"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Z"),
                                    action = KeyAction.CommitText("Z"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("'"),
                                    action = KeyAction.CommitText("'"),
                                    color = ColorVariant.MUTED,
                                ),
                    ),
                ), // done
                KeyItemC( // E
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("E"),
                        action = KeyAction.CommitText("E"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("."),
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("G"),
                                    action = KeyAction.CommitText("G"),
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("U"),
                                    action = KeyAction.CommitText("U"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Y"),
                                    action = KeyAction.CommitText("Y"),
                                ),
                    ),
                ), // done
                EMOJI_KEY_ITEM,
                KeyItemC( // T
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("T"),
                        action = KeyAction.CommitText("T"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("D"),
                                    action = KeyAction.CommitText("D"),
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(","),
                                    action = KeyAction.CommitText(","),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("R"),
                                    action = KeyAction.CommitText("R"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("L"),
                                    action = KeyAction.CommitText("L"),
                                ),
                    ),
                ), // done
                KeyItemC( // S
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("S"),
                        action = KeyAction.CommitText("S"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("*"),
                                    action = KeyAction.CommitText("*"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("B"),
                                    action = KeyAction.CommitText("B"),
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("C"),
                                    action = KeyAction.CommitText("C"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\""),
                                    action = KeyAction.CommitText("\""),
                                    color = ColorVariant.MUTED,
                                ),
                    ),
                ), // done
            ),
            listOf(
                KeyItemC( // i
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("I"),
                        action = KeyAction.CommitText("I"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(":"),
                                    action = KeyAction.CommitText(":"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("("),
                                    action = KeyAction.CommitText("("),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Q"),
                                    action = KeyAction.CommitText("Q"),
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("9"),
                                    action = KeyAction.CommitText("9"),
                                    color = ColorVariant.MUTED,
                                ),
                    ),
                ), // done
                KeyItemC( // o
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("O"),
                        action = KeyAction.CommitText("O"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("!"),
                                    action = KeyAction.CommitText("!"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("J"),
                                    action = KeyAction.CommitText("J"),
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("K"),
                                    action = KeyAction.CommitText("K"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("P"),
                                    action = KeyAction.CommitText("P"),
                                ),
                    ),
                ), // done
                NUMERIC_KEY_ITEM,
                KeyItemC( // n
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("N"),
                        action = KeyAction.CommitText("N"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("F"),
                                    action = KeyAction.CommitText("F"),
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("?"),
                                    action = KeyAction.CommitText("?"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("W"),
                                    action = KeyAction.CommitText("W"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("M"),
                                    action = KeyAction.CommitText("M"),
                                ),
                    ),
                ), // done
                KeyItemC( // h
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("H"),
                        action = KeyAction.CommitText("H"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(";"),
                                    action = KeyAction.CommitText(";"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(")"),
                                    action = KeyAction.CommitText(")"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("V"),
                                    action = KeyAction.CommitText("V"),
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("0"),
                                    action = KeyAction.CommitText("0"),
                                    color = ColorVariant.MUTED,
                                ),
                    ),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                EN_TYPESPLIT_SHORT_SPACEBAR_SHIFT_KEY_SHIFTED_ITEM,
                EN_TYPESPLIT_SHORT_RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_TYPESPLIT_SHORT_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("1"),
                        action = KeyAction.CommitText("1"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("#"),
                                    action = KeyAction.CommitText("#"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("'"),
                                    action = KeyAction.CommitText("'"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("%"),
                                    action = KeyAction.CommitText("%"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("-"),
                                    action = KeyAction.CommitText("-"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("<"),
                                    action = KeyAction.CommitText("<"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("@"),
                                    action = KeyAction.CommitText("@"),
                                    color = ColorVariant.MUTED,
                                ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("2"),
                        action = KeyAction.CommitText("2"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\\"),
                                    action = KeyAction.CommitText("\\"),
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
                                    display = KeyDisplay.TextDisplay("."),
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("="),
                                    action = KeyAction.CommitText("="),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("+"),
                                    action = KeyAction.CommitText("+"),
                                    color = ColorVariant.MUTED,
                                ),
                    ),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("3"),
                        action = KeyAction.CommitText("3"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("`"),
                                    action = KeyAction.CommitText("`"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("/"),
                                    action = KeyAction.CommitText("/"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(","),
                                    action = KeyAction.CommitText(","),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("_"),
                                    action = KeyAction.CommitText("_"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("|"),
                                    action = KeyAction.CommitText("|"),
                                    color = ColorVariant.MUTED,
                                ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("4"),
                        action = KeyAction.CommitText("4"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("^"),
                                    action = KeyAction.CommitText("^"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\""),
                                    action = KeyAction.CommitText("\""),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.TOP_RIGHT to
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
                        SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("&"),
                                    action = KeyAction.CommitText("&"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(">"),
                                    action = KeyAction.CommitText(">"),
                                    color = ColorVariant.MUTED,
                                ),
                    ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("5"),
                        action = KeyAction.CommitText("5"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("{"),
                                    action = KeyAction.CommitText("{"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("("),
                                    action = KeyAction.CommitText("("),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(":"),
                                    action = KeyAction.CommitText(":"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("["),
                                    action = KeyAction.CommitText("["),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("9"),
                                    action = KeyAction.CommitText("9"),
                                ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("6"),
                        action = KeyAction.CommitText("6"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    mapOf(
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("!"),
                                    action = KeyAction.CommitText("!"),
                                    color = ColorVariant.MUTED,
                                ),
                    ),
                ),
                ABC_KEY_ITEM,
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("7"),
                        action = KeyAction.CommitText("7"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    buildMap {
                        put(
                            SwipeDirection.TOP_LEFT,
                            KeyC(
                                display = KeyDisplay.TextDisplay("$"),
                                action = KeyAction.CommitText("$"),
                                color = ColorVariant.MUTED,
                            ),
                        )
                        put(
                            SwipeDirection.TOP_RIGHT,
                            KeyC(
                                display = KeyDisplay.TextDisplay("€"),
                                action = KeyAction.CommitText("€"),
                                color = ColorVariant.MUTED,
                            ),
                        )
                        put(
                            SwipeDirection.LEFT,
                            KeyC(
                                display = KeyDisplay.TextDisplay("?"),
                                action = KeyAction.CommitText("?"),
                                color = ColorVariant.MUTED,
                            ),
                        )
                        put(
                            SwipeDirection.BOTTOM_LEFT,
                            KeyC(
                                display = KeyDisplay.TextDisplay("£"),
                                action = KeyAction.CommitText("£"),
                                color = ColorVariant.MUTED,
                            ),
                        )
                        getLocalCurrency()?.let {
                            if (it !in setOf("$", "£", "€")) {
                                put(
                                    SwipeDirection.BOTTOM_RIGHT,
                                    KeyC(
                                        display = KeyDisplay.TextDisplay(it),
                                        action = KeyAction.CommitText(it),
                                        color = ColorVariant.MUTED,
                                    ),
                                )
                            }
                        }
                    },
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("8"),
                        action = KeyAction.CommitText("8"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
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
                        SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("°"),
                                    action = KeyAction.CommitText("°"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(";"),
                                    action = KeyAction.CommitText(";"),
                                    color = ColorVariant.MUTED,
                                ),
                        SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("0"),
                                    action = KeyAction.CommitText("0"),
                                ),
                    ),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                EN_TYPESPLIT_SHORT_SPACEBAR_ARROWS_KEY_ITEM,
                EN_TYPESPLIT_SHORT_RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_TYPESPLIT_SHORT: KeyboardDefinition =
    KeyboardDefinition(
        title = "english type-split short",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_TYPESPLIT_SHORT_MAIN,
                shifted = KB_EN_TYPESPLIT_SHORT_SHIFTED,
                numeric = KB_EN_TYPESPLIT_SHORT_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
