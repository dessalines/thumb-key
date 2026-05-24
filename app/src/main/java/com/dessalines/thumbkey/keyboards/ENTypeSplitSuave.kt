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


val SUAVE_MODIFIER_KEY = KeyItemC(
    center =
        KeyC(
            display = KeyDisplay.TextDisplay("Ctrl"),
            action = ToggleCtrlMode(true),
            color = SECONDARY,
        ),
    right =
        KeyC(
            display = KeyDisplay.TextDisplay("Alt"),
            action = ToggleAltMode(true),
            color = MUTED,
        ),
    top =
        KeyC(
            display = KeyDisplay.TextDisplay("ESC"),
            action =
                SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_ESCAPE,
                    ),
                ),
            color = MUTED,
        ),
    swipeType = FOUR_WAY_CROSS,
    backgroundColor = SURFACE_VARIANT,
)

val SUAVE_BACKSPACE = KeyItemC(
    center =
        KeyC(
            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardBackspace),
            action = DeleteKeyAction,
            size = LARGE,
            color = SECONDARY,
        ),
    swipeType = EIGHT_WAY,
    slideType = SlideType.DELETE,
    top = KeyC("'", color = MUTED),
    topLeft = KeyC("?", color = MUTED),
    topRight = KeyC("!", color = MUTED),
    bottom = KeyC("\"", color = MUTED),
    bottomLeft = KeyC(",", color = MUTED),
    bottomRight = KeyC(".", color = MUTED),
    backgroundColor = SURFACE_VARIANT,
    longPress = DeleteWordBeforeCursor,
)

val SUAVE_SPACE = KeyItemC(
    center = KeyC(" "),
    swipeType = FOUR_WAY_CROSS,
    slideType = SlideType.MOVE_CURSOR,
    left =
        KeyC(
            display = KeyDisplay.TextDisplay("←"),
            action =
                SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_DPAD_LEFT,
                    ),
                ),
            color = MUTED,
        ),
    right =
        KeyC(
            display = KeyDisplay.TextDisplay("→"),
            action =
                SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_DPAD_RIGHT,
                    ),
                ),
            color = MUTED,
        ),
    top =
        KeyC(
            display = KeyDisplay.TextDisplay("↑"),
            action =
                SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_DPAD_UP,
                    ),
                ),
            color = MUTED,
        ),
    bottom =
        KeyC(
            display = KeyDisplay.TextDisplay("↓"),
            action =
                SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_DPAD_DOWN,
                    ),
                ),
            color = MUTED,
        ),
    nextTapActions =
        listOf(
            ReplaceLastText(", ", trimCount = 1),
            ReplaceLastText(". "),
            ReplaceLastText("? "),
            ReplaceLastText("! "),
            ReplaceLastText(": "),
            ReplaceLastText("; "),
        ),
    backgroundColor = SURFACE_VARIANT,
    widthMultiplier = 1,
)

val SUAVE_RETURN = KeyItemC(
    center =
        KeyC(
            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
            action = IMECompleteAction,
            size = LARGE,
            color = SECONDARY,
        ),
    swipeType = FOUR_WAY_CROSS,
    left =
        KeyC(
            display = null,
            action = CommitText("\n")
        ),
    top =
        KeyC(
            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
            action = CommitText("\t"),
            color = SECONDARY,
        ),
    backgroundColor = SURFACE_VARIANT,
    longPress = CommitText("\n"),
    widthMultiplier = 2
)
val SUAVE_BOTTOM_ROW = listOf(
    SUAVE_MODIFIER_KEY,
    EMOJI_KEY_ITEM,
    NUMERIC_KEY_ITEM,
    SUAVE_RETURN,
)

val SUAVE_BOTTOM_ROW_CTRLED = listOf(
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.TextDisplay("Ctrl"),
                action = ToggleCtrlMode(false),
                color = SECONDARY,
            ),
        right =
            KeyC(
                display = KeyDisplay.TextDisplay("Alt"),
                action = ToggleAltMode(true),
                color = MUTED,
            ),
        top =
            KeyC(
                display = KeyDisplay.TextDisplay("ESC"),
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_ESCAPE,
                        ),
                    ),
                color = MUTED,
            ),
        swipeType = FOUR_WAY_CROSS,
        backgroundColor = SURFACE_VARIANT,
    ),
    EMOJI_KEY_ITEM,
    NUMERIC_KEY_ITEM,
    SUAVE_RETURN,
)

val KB_EN_TYPESPLIT_SUAVE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("1", color = MUTED),
                    right = KeyC("2", color = MUTED),
                    bottom = KeyC("ö"),
                    left = KeyC(""),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("4", color = MUTED),
                    right = KeyC("5", color = MUTED),
                    bottom = KeyC("w"),
                    left = KeyC("3", color = MUTED),
                ),
                SUAVE_BACKSPACE,
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("7", color = MUTED),
                    right = KeyC("8", color = MUTED),
                    bottom = KeyC("p"),
                    left = KeyC("6", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("0", color = MUTED),
                    bottom = KeyC("q"),
                    left = KeyC("9", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ä"),
                    bottom = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("v"),
                    topRight = KeyC("€", color = MUTED),
                    right = KeyC("c"),
                    bottom = KeyC("f"),
                    bottomRight = KeyC("ch", color = MUTED),
                    left = KeyC("z"),
                ),
                SUAVE_SPACE,
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("b"),
                    right = KeyC("k"),
                    bottom = KeyC("m"),
                    left = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("~", color = MUTED),
                    topLeft = KeyC("$", color = MUTED),
                    bottom = KeyC("|", color = MUTED),
                    bottomLeft = KeyC("sch", color = MUTED),
                    left = KeyC("ß"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("ü"),
                    topRight = KeyC("(", color = MUTED),
                    right = KeyC("[", color = MUTED),
                    bottom = KeyC( text = "", color = MUTED),
                    bottomRight = KeyC("{", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("<", color = MUTED),
                    right = KeyC("x"),
                    bottom = KeyC("#", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                    bottomRight = KeyC("$", color = MUTED)
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    longPress = ToggleCapsLock,
                    swipeType = EIGHT_WAY,
                    top = KeyC("-", color = MUTED),
                    left = KeyC("—", color = MUTED),
                    topLeft = KeyC(";", color = MUTED),
                    topRight = KeyC(":", color = MUTED),
                    right = KeyC("_", color = MUTED),
                    bottom = KeyC("^", color = MUTED),
                    bottomLeft = KeyC("%", color = MUTED),
                    bottomRight = KeyC("&", color = MUTED),
                    backgroundColor = SURFACE_VARIANT,
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("j"),
                    topRight = KeyC(">", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    bottomRight = KeyC("/", color = MUTED),
                    left = KeyC("y"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("", color = MUTED),
                    topLeft = KeyC(")", color = MUTED),
                    bottom = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("}", color = MUTED),
                    left = KeyC("]", color = MUTED),
                ),
            ),
            SUAVE_BOTTOM_ROW,
        ),
    )

val KB_EN_TYPESPLIT_SUAVE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("1", color = MUTED),
                    right = KeyC("2", color = MUTED),
                    bottom = KeyC("Ö"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("4", color = MUTED),
                    right = KeyC("5", color = MUTED),
                    bottom = KeyC("W"),
                    left = KeyC("3", color = MUTED),
                ),
                SUAVE_BACKSPACE,
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("7", color = MUTED),
                    right = KeyC("8", color = MUTED),
                    bottom = KeyC("P"),
                    left = KeyC("6", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("0", color = MUTED),
                    bottom = KeyC("Q"),
                    left = KeyC("9", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Ä"),
                    bottom = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("V"),
                    topRight = KeyC("€", color = MUTED),
                    right = KeyC("C"),
                    bottom = KeyC("F"),
                    bottomRight = KeyC("Ch", color = MUTED),
                    left = KeyC("Z"),
                ),
                SUAVE_SPACE,
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("B"),
                    right = KeyC("K"),
                    bottom = KeyC("M"),
                    left = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("~", color = MUTED),
                    topLeft = KeyC("$", color = MUTED),
                    bottom = KeyC("|", color = MUTED),
                    bottomLeft = KeyC("Sch", color = MUTED),
                    left = KeyC("ß"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Ü"),
                    topRight = KeyC("(", color = MUTED),
                    right = KeyC("[", color = MUTED),
                    bottom = KeyC("", color = MUTED),
                    bottomRight = KeyC("{", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("<", color = MUTED),
                    right = KeyC("X"),
                    bottom = KeyC("#", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                    bottomRight = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardArrowUp),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            action = ToggleShiftMode(false),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    longPress = ToggleCapsLock,
                    swipeType = EIGHT_WAY,
                    top = KeyC("-", color = MUTED),
                    topLeft = KeyC(";", color = MUTED),
                    topRight = KeyC(":", color = MUTED),
                    right = KeyC("_", color = MUTED),
                    bottom = KeyC("^", color = MUTED),
                    bottomLeft = KeyC("%", color = MUTED),
                    bottomRight = KeyC("&", color = MUTED),
                    backgroundColor = SURFACE_VARIANT,
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("J"),
                    topRight = KeyC(">", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    bottomRight = KeyC("/", color = MUTED),
                    left = KeyC("Y"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC(")", color = MUTED),
                    right = KeyC(""),
                    bottom = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("}", color = MUTED),
                    left = KeyC("]", color = MUTED),
                ),
            ),
            SUAVE_BOTTOM_ROW,
        ),
    )

val KB_EN_TYPESPLIT_SUAVE_CTRLED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_O, "o", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_1, "1", color = MUTED),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_2, "2", color = MUTED),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_O, "ö"),
                    left = KeyC(""),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_R, "r", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_4, "4", color = MUTED),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_5, "5", color = MUTED),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_W, "w"),
                    left = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_3, "3", color = MUTED),
                ),
                SUAVE_BACKSPACE,
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_T, "t", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_7, "7", color = MUTED),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_8, "8", color = MUTED),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_P, "p"),
                    left = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_6, "6", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_H, "h", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_0, "0", color = MUTED),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_Q, "q"),
                    left = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_9, "9", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_A, "a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_A, "ä"),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_EQUALS, "+", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_E, "e", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_V, "v"),
                    topRight = KeyC("€", color = MUTED),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_C, "c"),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_F, "f"),
                    bottomRight = KeyC("ch", color = MUTED),
                    left = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_Z, "z"),
                ),
                SUAVE_SPACE,
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_N, "n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_B, "b"),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_K, "k"),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_M, "m"),
                    left = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_G, "g"),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_S, "s", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("~", color = MUTED),
                    topLeft = KeyC("$", color = MUTED),
                    bottom = KeyC("|", color = MUTED),
                    bottomLeft = KeyC("sch", color = MUTED),
                    left = KeyC("ß"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_U, "u", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("ü"),
                    topRight = keyCModifier(KeyEvent.META_CTRL_ON or KeyEvent.META_SHIFT_ON, KeyEvent.KEYCODE_9, "(", color = MUTED),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_LEFT_BRACKET, "[", color = MUTED),
                    bottom = KeyC( text = "", color = MUTED),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON or KeyEvent.META_SHIFT_ON, KeyEvent.KEYCODE_LEFT_BRACKET, "{", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_I, "i", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = keyCModifier(KeyEvent.META_CTRL_ON or KeyEvent.META_SHIFT_ON, KeyEvent.KEYCODE_COMMA, "<", color = MUTED),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_X, "x"),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_POUND, "#", color = MUTED),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_AT, "@", color = MUTED),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON or KeyEvent.META_SHIFT_ON, KeyEvent.KEYCODE_4, "$", color = MUTED)
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    longPress = ToggleCapsLock,
                    swipeType = EIGHT_WAY,
                    top = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_MINUS, "-", color = MUTED),
                    left = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_MINUS, "—", color = MUTED),
                    topLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_SEMICOLON, ";", color = MUTED),
                    topRight = keyCModifier(KeyEvent.META_CTRL_ON or KeyEvent.META_SHIFT_ON, KeyEvent.KEYCODE_SEMICOLON, ":", color = MUTED),
                    right = keyCModifier(KeyEvent.META_CTRL_ON or KeyEvent.META_SHIFT_ON, KeyEvent.KEYCODE_MINUS, "_", color = MUTED),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON or KeyEvent.META_SHIFT_ON, KeyEvent.KEYCODE_6, "^", color = MUTED),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON or KeyEvent.META_SHIFT_ON, KeyEvent.KEYCODE_5, "%", color = MUTED),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON or KeyEvent.META_SHIFT_ON, KeyEvent.KEYCODE_7, "&", color = MUTED),
                    backgroundColor = SURFACE_VARIANT,
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_D, "d", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_J, "j"),
                    topRight = keyCModifier(KeyEvent.META_CTRL_ON or KeyEvent.META_SHIFT_ON, KeyEvent.KEYCODE_PERIOD, ">", color = MUTED),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_EQUALS, "=", color = MUTED),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON or KeyEvent.META_SHIFT_ON, KeyEvent.KEYCODE_8, "*", color = MUTED),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_SLASH, "/", color = MUTED),
                    left = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_Y, "y"),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_L, "l", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("", color = MUTED),
                    topLeft = keyCModifier(KeyEvent.META_CTRL_ON or KeyEvent.META_SHIFT_ON, KeyEvent.KEYCODE_0, ")", color = MUTED),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_BACKSLASH, "\\", color = MUTED),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON or KeyEvent.META_SHIFT_ON, KeyEvent.KEYCODE_RIGHT_BRACKET, "}", color = MUTED),
                    left = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_RIGHT_BRACKET, "]", color = MUTED),
                ),
            ),
            SUAVE_BOTTOM_ROW_CTRLED,
        ),
    )
val KB_EN_TYPESPLIT_SUAVE_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u00B9", displayText = "¹", color = MUTED),
                    bottom = KeyC("\u2081", displayText = "₁", color = MUTED),
                    right = KeyC("\u0301", displayText = "◌́", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u00B2", displayText = "²", color = MUTED),
                    bottom = KeyC("\u2082", displayText = "₂", color = MUTED),
                    left = KeyC("\u0302", displayText = "◌̂", color = MUTED),
                    right = KeyC("\u030C", displayText = "◌̌", color = MUTED),
                ),
                SUAVE_BACKSPACE,
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u00B3", displayText = "³", color = MUTED),
                    bottom = KeyC("\u2083", displayText = "₃", color = MUTED),
                    left = KeyC("\u0303", displayText = "◌̃", color = MUTED),
                    right = KeyC("\u0327", displayText = "◌̧", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u2074", displayText = "⁴", color = MUTED),
                    bottom = KeyC("\u2084", displayText = "₄", color = MUTED),
                    left = KeyC("\u0307", displayText = "◌̇", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u2075", displayText = "⁵", color = MUTED),
                    bottom = KeyC("\u2085", displayText = "₅", color = MUTED),
                    right = KeyC("\u0300", displayText = "◌̀", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("\u2076", displayText = "⁶", color = MUTED),
                    topRight = KeyC("€", color = MUTED),
                    bottom = KeyC("\u2086", displayText = "₆", color = MUTED),
                    left = KeyC("\u0304", displayText = "◌̄", color = MUTED),
                    right = KeyC("\u0336", displayText = "◌̶", color = MUTED),
                ),
                SUAVE_SPACE,
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u2077", displayText = "⁷", color = MUTED),
                    bottom = KeyC("\u2087", displayText = "₇", color = MUTED),
                    left = KeyC("\u0308", displayText = "◌̈", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("\u2078", displayText = "⁸", color = MUTED),
                    topLeft = KeyC("$", color = MUTED),
                    bottom = KeyC("\u2088", displayText = "₈", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("\u2079", displayText = "⁹", color = MUTED),
                    right = KeyC("[", color = MUTED),
                    topRight = KeyC("(", color = MUTED),
                    bottom = KeyC("\u2089", displayText = "₉", color = MUTED),
                    bottomRight = KeyC("{", color = MUTED),
                    ),
                KeyItemC(
                    center = KeyC(",", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC(";"),
                    topLeft = KeyC("<", color = MUTED),
                    bottom = KeyC("#", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                    bottomRight = KeyC("$", color = MUTED)
                ),
                KeyItemC(
                    center = KeyC("+", color = MUTED),
                    swipeType = EIGHT_WAY,
                    top = KeyC("-", color = MUTED),
                    topLeft = KeyC(";", color = MUTED),
                    topRight = KeyC(":", color = MUTED),
                    right = KeyC("_", color = MUTED),
                    bottom = KeyC("^", color = MUTED),
                    bottomLeft = KeyC("%", color = MUTED),
                    bottomRight = KeyC("&", color = MUTED),
                    backgroundColor = SURFACE_VARIANT,
                ),
                KeyItemC(
                    center = KeyC(".", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC(":"),
                    topRight = KeyC(">", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    bottomRight = KeyC("/", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u2070", displayText = "⁰", color = MUTED),
                    topLeft = KeyC(")", color = MUTED),
                    left = KeyC("]", color = MUTED),
                    bottom = KeyC("\u2080", displayText = "₀", color = MUTED),
                    bottomLeft = KeyC("}", color = MUTED),
                ),
            ),
            listOf(
                SUAVE_MODIFIER_KEY,
                EMOJI_KEY_ITEM,
                ABC_KEY_ITEM,
                SUAVE_RETURN,
            )
        ),
    )


val KB_EN_TYPESPLIT_SUAVE: KeyboardDefinition =
    KeyboardDefinition(
        title = "english type-split suave",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_TYPESPLIT_SUAVE_MAIN,
                shifted = KB_EN_TYPESPLIT_SUAVE_SHIFTED,
                numeric = KB_EN_TYPESPLIT_SUAVE_NUMERIC,
                ctrled = KB_EN_TYPESPLIT_SUAVE_CTRLED
            ),
    )
