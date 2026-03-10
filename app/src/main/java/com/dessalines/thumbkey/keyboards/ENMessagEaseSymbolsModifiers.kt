@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardReturn
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardCapslock
import androidx.compose.material.icons.outlined.KeyboardControlKey
import androidx.compose.material.icons.outlined.KeyboardDoubleArrowDown
import androidx.compose.material.icons.outlined.KeyboardOptionKey
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.ColorVariant.MUTED
import com.dessalines.thumbkey.utils.ColorVariant.SECONDARY
import com.dessalines.thumbkey.utils.ColorVariant.SURFACE_VARIANT
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.FontSizeVariant.LARGE
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyAction.CommitText
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

fun keyCModifier(
    flagCode: Int,
    keyCode: Int,
    displayText: String,
    swipeReturnAction: KeyAction? = null,
    display: KeyDisplay = KeyDisplay.TextDisplay(displayText),
    capsModeDisplay: KeyDisplay? = null,
    size: FontSizeVariant = FontSizeVariant.SMALL,
    color: ColorVariant =
        when (size) {
            LARGE -> ColorVariant.PRIMARY
            else -> ColorVariant.SECONDARY
        },
): KeyC =
    KeyC(
        KeyAction.SendEvent(KeyEvent(0, 0, KeyEvent.ACTION_DOWN, keyCode, 0, flagCode)),
        swipeReturnAction,
        display,
        capsModeDisplay,
        size,
        color,
    )

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
                    bottomRight = keyCModifier(0, KeyEvent.KEYCODE_TAB, displayText = "⇥", color = MUTED),
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
                SPACEBAR_PROGRAMMING_KEY_ITEM,
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
                    bottomRight = keyCModifier(KeyEvent.META_SHIFT_ON, KeyEvent.KEYCODE_TAB, displayText = "⇥", color = MUTED),
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
                SPACEBAR_PROGRAMMING_KEY_ITEM,
                KeyItemC(
                    center =
                        keyCModifier(
                            KeyEvent.META_SHIFT_ON,
                            KeyEvent.KEYCODE_ENTER,
                            "",
                            size = LARGE,
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                            color = SECONDARY,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                    longPress = CommitText("\n"),
                ),
            ),
        ),
    )

val KB_EN_MESSAGEASE_SYMBOLS_MODIFIERS_CTRLED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_A, "a", size = LARGE),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_V, "v"),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_MINUS, "-", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_N, "n", size = LARGE),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_L, "l"),
                    topLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_GRAVE, "`", color = MUTED),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_BACKSLASH, "\\", color = MUTED),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_SLASH, "/", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_I, "i", size = LARGE),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_X, "x"),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_EQUALS, "=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_H, "h", size = LARGE),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_K, "k"),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_LEFT_BRACKET, "[", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_O, "o", size = LARGE),
                    topLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_Q, "q"),
                    top = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_U, "u"),
                    topRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_P, "p"),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_B, "b"),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_J, "j"),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_D, "d"),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_G, "g"),
                    left = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_C, "c"),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_R, "r", size = LARGE),
                    left = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_M, "m"),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_RIGHT_BRACKET, "]", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_T, "t", size = LARGE),
                    topRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_Y, "y"),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_TAB, displayText = "⇥", color = MUTED),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardDoubleArrowDown),
                            action = ToggleCtrlMode(false),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_E, "e", size = LARGE),
                    top = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_W, "w"),
                    topRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_APOSTROPHE, "'", color = MUTED),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_Z, "z"),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_PERIOD, ".", color = MUTED),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_COMMA, ",", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_S, "s", size = LARGE),
                    topLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_F, "f"),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_SEMICOLON, ";", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_PROGRAMMING_KEY_ITEM,
                KeyItemC(
                    center =
                        keyCModifier(
                            KeyEvent.META_CTRL_ON,
                            KeyEvent.KEYCODE_ENTER,
                            "",
                            size = LARGE,
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                            color = SECONDARY,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                    longPress = CommitText("\n"),
                ),
            ),
        ),
    )

val KB_EN_MESSAGEASE_SYMBOLS_MODIFIERS_ALTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_A, "a", size = LARGE),
                    bottomRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_V, "v"),
                    right = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_MINUS, "-", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_N, "n", size = LARGE),
                    bottom = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_L, "l"),
                    topLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_GRAVE, "`", color = MUTED),
                    bottomRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_BACKSLASH, "\\", color = MUTED),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_SLASH, "/", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_I, "i", size = LARGE),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_X, "x"),
                    bottom = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_EQUALS, "=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_H, "h", size = LARGE),
                    right = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_K, "k"),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_LEFT_BRACKET, "[", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_O, "o", size = LARGE),
                    topLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_Q, "q"),
                    top = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_U, "u"),
                    topRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_P, "p"),
                    right = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_B, "b"),
                    bottomRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_J, "j"),
                    bottom = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_D, "d"),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_G, "g"),
                    left = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_C, "c"),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_R, "r", size = LARGE),
                    left = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_M, "m"),
                    bottomRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_RIGHT_BRACKET, "]", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_T, "t", size = LARGE),
                    topRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_Y, "y"),
                    bottomRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_TAB, displayText = "⇥", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_E, "e", size = LARGE),
                    top = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_W, "w"),
                    topRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_APOSTROPHE, "'", color = MUTED),
                    right = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_Z, "z"),
                    bottom = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_PERIOD, ".", color = MUTED),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_COMMA, ",", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_S, "s", size = LARGE),
                    topLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_F, "f"),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_SEMICOLON, ";", color = MUTED),
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
                SPACEBAR_PROGRAMMING_KEY_ITEM,
                KeyItemC(
                    center =
                        keyCModifier(
                            KeyEvent.META_ALT_ON,
                            KeyEvent.KEYCODE_ENTER,
                            "",
                            size = LARGE,
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                            color = SECONDARY,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                    longPress = CommitText("\n"),
                ),
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
