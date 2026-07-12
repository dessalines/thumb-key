@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_EN_MINNOW_MAIN =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_KEY_ITEM.copy(
                    center = KeyC("n", size = LARGE),
                    bottom = KeyC("g"),
                    topRight = SWITCH_IME_KEYC,
                    right =
                        TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
                NUMERIC_KEY_ITEM.copy(
                    center = KeyC("h", size = LARGE),
                    left =
                        TOGGLE_NUMERIC_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    bottom = KeyC("c"),
                    left = KeyC("m"),
                    top = KeyC("z"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    right = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    topLeft = KeyC("?", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    top = KeyC("u"),
                    bottom = KeyC("f"),
                    left = KeyC("w"),
                    right = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    left = KeyC("y"),
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
                    center = KeyC("s", size = LARGE),
                    right = SPACEBAR_CENTER_KEYC_UNDERSCORE,
                    left = BACKSPACE_KEYC_MUTED,
                    bottom =
                        RETURN_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    longPress = DeleteWordBeforeCursor,
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    top = KeyC("l"),
                    bottom = KeyC("p"),
                    left = KeyC("b"),
                    right = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("d"),
                    topLeft = KeyC("v"),
                    bottomLeft = KeyC("j"),
                    bottomRight = KeyC("x"),
                    right = SPACEBAR_CENTER_KEYC_UNDERSCORE,
                    left = BACKSPACE_KEYC_MUTED,
                    bottom =
                        RETURN_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    longPress = DeleteWordBeforeCursor,
                ),
            ),
        ),
    )
val KB_EN_MINNOW_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_KEY_ITEM.copy(
                    center = KeyC("N", size = LARGE),
                    bottom = KeyC("G"),
                    topRight = SWITCH_IME_KEYC,
                    right =
                        TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
                NUMERIC_KEY_ITEM.copy(
                    center = KeyC("H", size = LARGE),
                    left =
                        TOGGLE_NUMERIC_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    bottom = KeyC("C"),
                    left = KeyC("M"),
                    top = KeyC("Z"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    right = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    topLeft = KeyC("?", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    top = KeyC("U"),
                    bottom = KeyC("F"),
                    left = KeyC("W"),
                    right = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    left = KeyC("Y"),
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
                    center = KeyC("S", size = LARGE),
                    right = SPACEBAR_CENTER_KEYC_UNDERSCORE,
                    left = BACKSPACE_KEYC_MUTED,
                    bottom =
                        RETURN_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    longPress = DeleteWordBeforeCursor,
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    top = KeyC("L"),
                    bottom = KeyC("P"),
                    left = KeyC("B"),
                    right = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("D"),
                    topLeft = KeyC("V"),
                    bottomLeft = KeyC("J"),
                    bottomRight = KeyC("X"),
                    right = SPACEBAR_CENTER_KEYC_UNDERSCORE,
                    left = BACKSPACE_KEYC_MUTED,
                    bottom =
                        RETURN_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    longPress = DeleteWordBeforeCursor,
                ),
            ),
        ),
    )

val KB_EN_MINNOW: KeyboardDefinition =
    KeyboardDefinition(
        title = "english minnow",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_MINNOW_MAIN,
                shifted = KB_EN_MINNOW_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
