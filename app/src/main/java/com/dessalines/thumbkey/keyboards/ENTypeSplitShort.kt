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
import com.dessalines.thumbkey.utils.SwipeNWay
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe
import com.dessalines.thumbkey.utils.getLocalCurrency

val EN_TYPESPLIT_SHORT_SPACEBAR_SHIFT_KEY_ITEM =
    KeyItemC(
        center = KeyC(" "),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left =
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
        right =
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
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                action = KeyAction.ToggleShiftMode(true),
                swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                color = ColorVariant.MUTED,
            ),
        bottom =
            KeyC(
                KeyAction.ToggleShiftMode(false),
                swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
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
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                action = KeyAction.CommitText("\t"),
                color = ColorVariant.MUTED,
            ),
    )

val EN_TYPESPLIT_SHORT_SPACEBAR_SHIFT_KEY_SHIFTED_ITEM =
    KeyItemC(
        center = KeyC(" "),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left =
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
        right =
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
        bottom =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                action = KeyAction.ToggleShiftMode(false),
                swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                color = ColorVariant.MUTED,
            ),
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                action = KeyAction.ToggleCapsLock,
                swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                color = ColorVariant.MUTED,
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        widthMultiplier = 3,
    )

val EN_TYPESPLIT_SHORT_SPACEBAR_ARROWS_KEY_ITEM =
    KeyItemC(
        center = KeyC(" "),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left =
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
        right =
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
        top =
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
        bottom =
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
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        widthMultiplier = 3,
    )

val KB_EN_TYPESPLIT_SHORT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC( // A
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("x"),
                    left = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC("z"),
                    top = KeyC("'", color = ColorVariant.MUTED),
                ), // done
                KeyItemC( // E
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(".", color = ColorVariant.MUTED),
                    left = KeyC("g"),
                    bottom = KeyC("u"),
                    top = KeyC("y"),
                ), // done
                EMOJI_KEY_ITEM,
                KeyItemC( // T
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("d"),
                    left = KeyC(",", color = ColorVariant.MUTED),
                    bottom = KeyC("r"),
                    top = KeyC("l"),
                ), // done
                KeyItemC( // S
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("*", color = ColorVariant.MUTED),
                    left = KeyC("b"),
                    bottom = KeyC("c"),
                    top = KeyC("\"", color = ColorVariant.MUTED),
                ), // done
            ),
            listOf(
                KeyItemC( // i
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(":", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    top = KeyC("q"),
                    bottom = KeyC("9", color = ColorVariant.MUTED),
                ), // done
                KeyItemC( // o
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("!", color = ColorVariant.MUTED),
                    left = KeyC("j"),
                    bottom = KeyC("k"),
                    top = KeyC("p"),
                ), // done
                NUMERIC_KEY_ITEM,
                KeyItemC( // n
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("f"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottom = KeyC("w"),
                    top = KeyC("m"),
                ), // done
                KeyItemC( // h
                    center = KeyC("h", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC(";", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    top = KeyC("v"),
                    bottom = KeyC("0", color = ColorVariant.MUTED),
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
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("X"),
                    left = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC("Z"),
                    top = KeyC("'", color = ColorVariant.MUTED),
                ), // done
                KeyItemC( // E
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(".", color = ColorVariant.MUTED),
                    left = KeyC("G"),
                    bottom = KeyC("U"),
                    top = KeyC("Y"),
                ), // done
                EMOJI_KEY_ITEM,
                KeyItemC( // T
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("D"),
                    left = KeyC(",", color = ColorVariant.MUTED),
                    bottom = KeyC("R"),
                    top = KeyC("L"),
                ), // done
                KeyItemC( // S
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("*", color = ColorVariant.MUTED),
                    left = KeyC("B"),
                    bottom = KeyC("C"),
                    top = KeyC("\"", color = ColorVariant.MUTED),
                ), // done
            ),
            listOf(
                KeyItemC( // i
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(":", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    top = KeyC("Q"),
                    bottom = KeyC("9", color = ColorVariant.MUTED),
                ), // done
                KeyItemC( // o
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("!", color = ColorVariant.MUTED),
                    left = KeyC("J"),
                    bottom = KeyC("K"),
                    top = KeyC("P"),
                ), // done
                NUMERIC_KEY_ITEM,
                KeyItemC( // n
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("F"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottom = KeyC("W"),
                    top = KeyC("M"),
                ), // done
                KeyItemC( // h
                    center = KeyC("H", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC(";", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    top = KeyC("V"),
                    bottom = KeyC("0", color = ColorVariant.MUTED),
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
                    center = KeyC("1", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("#", color = ColorVariant.MUTED),
                    top = KeyC("'", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    left = KeyC("-", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("<", color = ColorVariant.MUTED),
                    bottomRight = KeyC("@", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("2", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("\\", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                    right = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("=", color = ColorVariant.MUTED),
                    bottomRight = KeyC("+", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("3", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    topRight = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC(",", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("_", color = ColorVariant.MUTED),
                    bottomRight = KeyC("|", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("4", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("^", color = ColorVariant.MUTED),
                    top = KeyC("\"", color = ColorVariant.MUTED),
                    topRight = KeyC("~", color = ColorVariant.MUTED),
                    right = KeyC("*", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("&", color = ColorVariant.MUTED),
                    bottomRight = KeyC(">", color = ColorVariant.MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("5", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    right = KeyC(":", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottom = KeyC("9"),
                ),
                KeyItemC(
                    center = KeyC("6", size = FontSizeVariant.LARGE),
                    right = KeyC("!", color = ColorVariant.MUTED),
                ),
                ABC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("7", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("$", color = ColorVariant.MUTED),
                    topRight = KeyC("€", color = ColorVariant.MUTED),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("£", color = ColorVariant.MUTED),
                    bottomRight =
                        getLocalCurrency()?.let {
                            if (it !in setOf("$", "£", "€")) {
                                KeyC(it, color = ColorVariant.MUTED)
                            } else {
                                null
                            }
                        },
                ),
                KeyItemC(
                    center = KeyC("8", size = FontSizeVariant.LARGE),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    topLeft = KeyC("°", color = ColorVariant.MUTED),
                    left = KeyC(";", color = ColorVariant.MUTED),
                    bottom = KeyC("0"),
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
