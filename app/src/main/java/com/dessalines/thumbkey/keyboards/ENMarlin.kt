@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.KeyAction.DeleteWordBeforeCursor

val KB_EN_MARLIN_MAIN =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_KEY_ITEM.copy(
                    center = KeyC("w", size = LARGE),
                    right =
                        TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                ),
                NUMERIC_KEY_ITEM.copy(
                    center = KeyC("d", size = LARGE),
                    left =
                        TOGGLE_NUMERIC_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("f", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
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
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    top = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    top = KeyC("q"),
                    bottom = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    top = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("p"),
                    bottom = KeyC("b"),
                    left = KeyC(".", color = MUTED),
                    right = KeyC(",", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("y"),
                    bottom = KeyC("x"),
                    right = SPACEBAR_CENTER_KEYC_UNDERSCORE,
                    left = BACKSPACE_KEYC_MUTED,
                    longPress = DeleteWordBeforeCursor,
                    nextTapActions = SPACEBAR_NEXT_TAP_ACTIONS,
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    top = KeyC("v"),
                    bottom = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    right = SPACEBAR_CENTER_KEYC_UNDERSCORE,
                    left = BACKSPACE_KEYC_MUTED,
                    bottom =
                        RETURN_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    longPress = DeleteWordBeforeCursor,
                    nextTapActions = SPACEBAR_NEXT_TAP_ACTIONS,
                ),
            ),
        ),
    )

val KB_EN_MARLIN_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_KEY_ITEM.copy(
                    center = KeyC("W", size = LARGE),
                    right =
                        TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                ),
                NUMERIC_KEY_ITEM.copy(
                    center = KeyC("D", size = LARGE),
                    left =
                        TOGGLE_NUMERIC_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("F", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
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
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    top = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    top = KeyC("Q"),
                    bottom = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    top = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("P"),
                    bottom = KeyC("B"),
                    left = KeyC(".", color = MUTED),
                    right = KeyC(",", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("Y"),
                    bottom = KeyC("X"),
                    right = SPACEBAR_CENTER_KEYC_UNDERSCORE,
                    left = BACKSPACE_KEYC_MUTED,
                    longPress = DeleteWordBeforeCursor,
                    nextTapActions = SPACEBAR_NEXT_TAP_ACTIONS,
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    top = KeyC("V"),
                    bottom = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    right = SPACEBAR_CENTER_KEYC_UNDERSCORE,
                    left = BACKSPACE_KEYC_MUTED,
                    bottom =
                        RETURN_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    longPress = DeleteWordBeforeCursor,
                    nextTapActions = SPACEBAR_NEXT_TAP_ACTIONS,
                ),
            ),
        ),
    )

val KB_EN_MARLIN: KeyboardDefinition =
    KeyboardDefinition(
        title = "english marlin",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_MARLIN_MAIN,
                shifted = KB_EN_MARLIN_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
