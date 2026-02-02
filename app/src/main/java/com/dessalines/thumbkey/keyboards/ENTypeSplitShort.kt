@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val EN_TYPESPLIT_SHORT_SPACEBAR_SHIFT_KEY_ITEM =
    KeyItemC(
        center = KeyC(" "),
        swipeType = FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left =
            KeyC(
                action =
                    SendEvent(
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
                    SendEvent(
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
                action = ToggleShiftMode(true),
                swipeReturnAction = ToggleCurrentWordCapitalization(true),
                color = MUTED,
            ),
        bottom =
            KeyC(
                ToggleShiftMode(false),
                swipeReturnAction = ToggleCurrentWordCapitalization(false),
            ),
        backgroundColor = SURFACE_VARIANT,
        widthMultiplier = 3,
    )

val EN_TYPESPLIT_SHORT_RETURN_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                action = IMECompleteAction,
                size = LARGE,
                color = SECONDARY,
            ),
        backgroundColor = SURFACE_VARIANT,
        longPress = CommitText("\n"),
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                action = CommitText("\t"),
                color = MUTED,
            ),
    )

val EN_TYPESPLIT_SHORT_SPACEBAR_SHIFT_KEY_SHIFTED_ITEM =
    KeyItemC(
        center = KeyC(" "),
        swipeType = FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left =
            KeyC(
                action =
                    SendEvent(
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
                    SendEvent(
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
                action = ToggleShiftMode(false),
                swipeReturnAction = ToggleCurrentWordCapitalization(false),
                color = MUTED,
            ),
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                action = ToggleCapsLock,
                swipeReturnAction = ToggleCurrentWordCapitalization(true),
                color = MUTED,
            ),
        backgroundColor = SURFACE_VARIANT,
        widthMultiplier = 3,
    )

val EN_TYPESPLIT_SHORT_SPACEBAR_ARROWS_KEY_ITEM =
    KeyItemC(
        center = KeyC(" "),
        swipeType = FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_LEFT,
                        ),
                    ),
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.ArrowBack),
                color = MUTED,
            ),
        right =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_RIGHT,
                        ),
                    ),
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.ArrowForward),
                color = MUTED,
            ),
        top =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_UP,
                        ),
                    ),
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowUpward),
                color = MUTED,
            ),
        bottom =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_DOWN,
                        ),
                    ),
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDownward),
                color = MUTED,
            ),
        backgroundColor = SURFACE_VARIANT,
        widthMultiplier = 3,
    )

val KB_EN_TYPESPLIT_SHORT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC( // A
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("x"),
                    left = KeyC("-", color = MUTED),
                    bottom = KeyC("z"),
                    top = KeyC("'", color = MUTED),
                ), // done
                KeyItemC( // E
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC(".", color = MUTED),
                    left = KeyC("g"),
                    bottom = KeyC("u"),
                    top = KeyC("y"),
                ), // done
                EMOJI_KEY_ITEM,
                KeyItemC( // T
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("d"),
                    left = KeyC(",", color = MUTED),
                    bottom = KeyC("r"),
                    top = KeyC("l"),
                ), // done
                KeyItemC( // S
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("*", color = MUTED),
                    left = KeyC("b"),
                    bottom = KeyC("c"),
                    top = KeyC("\"", color = MUTED),
                ), // done
            ),
            listOf(
                KeyItemC( // i
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC(":", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    top = KeyC("q"),
                    bottom = KeyC("9", color = MUTED),
                ), // done
                KeyItemC( // o
                    center = KeyC("o", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("!", color = MUTED),
                    left = KeyC("j"),
                    bottom = KeyC("k"),
                    top = KeyC("p"),
                ), // done
                NUMERIC_KEY_ITEM,
                KeyItemC( // n
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("f"),
                    left = KeyC("?", color = MUTED),
                    bottom = KeyC("w"),
                    top = KeyC("m"),
                ), // done
                KeyItemC( // h
                    center = KeyC("h", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC(";", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    top = KeyC("v"),
                    bottom = KeyC("0", color = MUTED),
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
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("X"),
                    left = KeyC("-", color = MUTED),
                    bottom = KeyC("Z"),
                    top = KeyC("'", color = MUTED),
                ), // done
                KeyItemC( // E
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC(".", color = MUTED),
                    left = KeyC("G"),
                    bottom = KeyC("U"),
                    top = KeyC("Y"),
                ), // done
                EMOJI_KEY_ITEM,
                KeyItemC( // T
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("D"),
                    left = KeyC(",", color = MUTED),
                    bottom = KeyC("R"),
                    top = KeyC("L"),
                ), // done
                KeyItemC( // S
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("*", color = MUTED),
                    left = KeyC("B"),
                    bottom = KeyC("C"),
                    top = KeyC("\"", color = MUTED),
                ), // done
            ),
            listOf(
                KeyItemC( // i
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC(":", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    top = KeyC("Q"),
                    bottom = KeyC("9", color = MUTED),
                ), // done
                KeyItemC( // o
                    center = KeyC("O", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("!", color = MUTED),
                    left = KeyC("J"),
                    bottom = KeyC("K"),
                    top = KeyC("P"),
                ), // done
                NUMERIC_KEY_ITEM,
                KeyItemC( // n
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("F"),
                    left = KeyC("?", color = MUTED),
                    bottom = KeyC("W"),
                    top = KeyC("M"),
                ), // done
                KeyItemC( // h
                    center = KeyC("H", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC(";", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    top = KeyC("V"),
                    bottom = KeyC("0", color = MUTED),
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
                    center = KeyC("1", size = LARGE),
                    topLeft = KeyC("#", color = MUTED),
                    top = KeyC("'", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    left = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                    bottomRight = KeyC("@", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    topLeft = KeyC("\\", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                    right = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("=", color = MUTED),
                    bottomRight = KeyC("+", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    topLeft = KeyC("`", color = MUTED),
                    topRight = KeyC("/", color = MUTED),
                    left = KeyC(",", color = MUTED),
                    bottomLeft = KeyC("_", color = MUTED),
                    bottomRight = KeyC("|", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    topLeft = KeyC("^", color = MUTED),
                    top = KeyC("\"", color = MUTED),
                    topRight = KeyC("~", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    bottomLeft = KeyC("&", color = MUTED),
                    bottomRight = KeyC(">", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    right = KeyC(":", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom = KeyC("9"),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    right = KeyC("!", color = MUTED),
                ),
                ABC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    topLeft = KeyC("$", color = MUTED),
                    topRight = KeyC("€", color = MUTED),
                    left = KeyC("?", color = MUTED),
                    bottomLeft = KeyC("£", color = MUTED),
                    bottomRight =
                        getLocalCurrency()?.let {
                            if (it !in setOf("$", "£", "€")) {
                                KeyC(it, color = MUTED)
                            } else {
                                null
                            }
                        },
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    topLeft = KeyC("°", color = MUTED),
                    left = KeyC(";", color = MUTED),
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
        locales = listOf("en"),
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
