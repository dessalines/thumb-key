@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardCapslock
import androidx.compose.material.icons.outlined.KeyboardControlKey
import androidx.compose.material.icons.outlined.KeyboardDoubleArrowDown
import androidx.compose.material.icons.outlined.KeyboardOptionKey
import com.dessalines.thumbkey.utils.ColorVariant.MUTED
import com.dessalines.thumbkey.utils.FontSizeVariant.LARGE
import com.dessalines.thumbkey.utils.KeyAction.ToggleAltMode
import com.dessalines.thumbkey.utils.KeyAction.ToggleCapsLock
import com.dessalines.thumbkey.utils.KeyAction.ToggleCtrlMode
import com.dessalines.thumbkey.utils.KeyAction.ToggleCurrentWordCapitalization
import com.dessalines.thumbkey.utils.KeyAction.ToggleShiftMode
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.KeyboardDefinitionSettings
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe

val KB_EN_MESSAGEASE_SYMBOLS_MODIFIERS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    bottomRight = KeyC("v"),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    bottom = KeyC("l"),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    bottomLeft = KeyC("x"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    right = KeyC("k"),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topLeft = KeyC("q"),
                    top = KeyC("u"),
                    topRight = KeyC("p"),
                    right = KeyC("b"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("d"),
                    bottomLeft = KeyC("g"),
                    left = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    left = KeyC("m"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("]", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("y"),
                    topLeft = KeyC("~", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardControlKey),
                            action = ToggleCtrlMode(true),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("\"", color = MUTED),
                    top = KeyC("w"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("f"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("#", color = MUTED),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardOptionKey),
                            action = ToggleAltMode(true),
                            color = MUTED,
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

val KB_EN_MESSAGEASE_SYMBOLS_MODIFIERS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    bottomRight = KeyC("V"),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    bottom = KeyC("L"),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    bottomLeft = KeyC("X"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    right = KeyC("K"),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topLeft = KeyC("Q"),
                    top = KeyC("U"),
                    topRight = KeyC("P"),
                    right = KeyC("B"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("D"),
                    bottomLeft = KeyC("G"),
                    left = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    left = KeyC("M"),
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
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("Y"),
                    topLeft = KeyC("~", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("\"", color = MUTED),
                    top = KeyC("W"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("F"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("#", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_MESSAGEASE_SYMBOLS_MODIFIERS_CTRLED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_A, "a", size = LARGE),
                    bottomRight = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_V, "v"),
                    right = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_MINUS, "-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_N, "n", size = LARGE),
                    bottom = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_L, "l"),
                    topLeft = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_GRAVE, "`", color = MUTED),
                    bottomRight = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_BACKSLASH, "\\", color = MUTED),
                    bottomLeft = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_SLASH, "/", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_I, "i", size = LARGE),
                    bottomLeft = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_X, "x"),
                    bottom = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_EQUALS, "=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_H, "h", size = LARGE),
                    right = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_K, "k"),
                    bottomLeft = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_LEFT_BRACKET, "[", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_O, "o", size = LARGE),
                    topLeft = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_Q, "q"),
                    top = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_U, "u"),
                    topRight = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_P, "p"),
                    right = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_B, "b"),
                    bottomRight = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_J, "j"),
                    bottom = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_D, "d"),
                    bottomLeft = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_G, "g"),
                    left = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_C, "c"),
                ),
                KeyItemC(
                    center = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_R, "r", size = LARGE),
                    left = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_M, "m"),
                    bottomRight = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_RIGHT_BRACKET, "]", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_T, "t", size = LARGE),
                    topRight = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_Y, "y"),
                    bottomRight = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_TAB, displayText = "⇥", color = MUTED),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardDoubleArrowDown),
                            action = ToggleCtrlMode(false),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_E, "e", size = LARGE),
                    top = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_W, "w"),
                    topRight = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_APOSTROPHE, "'", color = MUTED),
                    right = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_Z, "z"),
                    bottom = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_PERIOD, ".", color = MUTED),
                    bottomLeft = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_COMMA, ",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_S, "s", size = LARGE),
                    topLeft = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_F, "f"),
                    bottomLeft = KeyC(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_SEMICOLON, ";", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_MESSAGEASE_SYMBOLS_MODIFIERS_ALTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_A, "a", size = LARGE),
                    bottomRight = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_V, "v"),
                    right = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_MINUS, "-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_N, "n", size = LARGE),
                    bottom = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_L, "l"),
                    topLeft = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_GRAVE, "`", color = MUTED),
                    bottomRight = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_BACKSLASH, "\\", color = MUTED),
                    bottomLeft = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_SLASH, "/", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_I, "i", size = LARGE),
                    bottomLeft = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_X, "x"),
                    bottom = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_EQUALS, "=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_H, "h", size = LARGE),
                    right = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_K, "k"),
                    bottomLeft = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_LEFT_BRACKET, "[", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_O, "o", size = LARGE),
                    topLeft = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_Q, "q"),
                    top = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_U, "u"),
                    topRight = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_P, "p"),
                    right = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_B, "b"),
                    bottomRight = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_J, "j"),
                    bottom = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_D, "d"),
                    bottomLeft = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_G, "g"),
                    left = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_C, "c"),
                ),
                KeyItemC(
                    center = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_R, "r", size = LARGE),
                    left = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_M, "m"),
                    bottomRight = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_RIGHT_BRACKET, "]", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_T, "t", size = LARGE),
                    topRight = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_Y, "y"),
                    bottomRight = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_TAB, displayText = "⇥", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_E, "e", size = LARGE),
                    top = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_W, "w"),
                    topRight = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_APOSTROPHE, "'", color = MUTED),
                    right = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_Z, "z"),
                    bottom = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_PERIOD, ".", color = MUTED),
                    bottomLeft = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_COMMA, ",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_S, "s", size = LARGE),
                    topLeft = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_F, "f"),
                    bottomLeft = KeyC(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_SEMICOLON, ";", color = MUTED),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardDoubleArrowDown),
                            action = ToggleAltMode(false),
                            color = MUTED,
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

val KB_EN_MESSAGEASE_SYMBOLS_MODIFIERS: KeyboardDefinition =
    KeyboardDefinition(
        title = "english messagease symbols modifiers",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_MESSAGEASE_SYMBOLS_MODIFIERS_MAIN,
                shifted = KB_EN_MESSAGEASE_SYMBOLS_MODIFIERS_SHIFTED,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
                ctrled = KB_EN_MESSAGEASE_SYMBOLS_MODIFIERS_CTRLED,
                alted = KB_EN_MESSAGEASE_SYMBOLS_MODIFIERS_ALTED,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
