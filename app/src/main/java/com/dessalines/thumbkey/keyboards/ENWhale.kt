@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_EN_WHALE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("q"),
                    bottom = KeyC("z")
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    bottom = KeyC("x"),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    top = KeyC("r"),
                    bottom = KeyC("d"),
                    left = KeyC("u"),
                    right = KeyC("f"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    bottom = KeyC("k"),
                    right = TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(size = SMALL, color = MUTED),
                    top = GOTO_SETTINGS_KEYC,
                    topLeft = TOGGLE_HIDE_LETTERS_KEYC,
                    bottomLeft = SWITCH_IME_VOICE_KEYC,
                    left = SWITCH_LANGUAGE_KEYC,
                    bottomRight = SWITCH_IME_KEYC,
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    top = KeyC("y"),
                    bottom = KeyC("p"),
                    left = KeyC("c"),
                    right = KeyC("w"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("j"),
                    right = TOGGLE_NUMERIC_MODE_TRUE_KEYC.copy(size = SMALL, color = MUTED),
                    left = COPY_KEYC,
                    topLeft = SELECT_ALL_KEYC,
                    topRight = CUT_KEYC,
                    bottomLeft = UNDO_KEYC,
                    bottomRight = REDO_KEYC,
                    bottom = PASTE_KEYC,
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    top = KeyC("m"),
                    bottom = KeyC("l"),
                    left = KeyC("b"),
                    right = KeyC("g"),
                    topRight = KeyC("'", color = MUTED),
                    topLeft = KeyC(".", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    top = KeyC("v"),
                    bottom = RETURN_KEYC.copy(size = SMALL, color = MUTED),
                    left = BACKSPACE_KEYC.copy(size = SMALL, color = MUTED),
                    bottomLeft = DELETE_WORD_BEFORE_CURSOR_KEYC,
                    bottomRight = DELETE_WORD_AFTER_CURSOR_KEYC,
                    topLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    longPress = DeleteWordBeforeCursor,

                ),
            ),
        ),
    )

val KB_EN_WHALE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("Q"),
                    bottom = KeyC("Z")
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    bottom = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    top = KeyC("R"),
                    bottom = KeyC("D"),
                    left = KeyC("U"),
                    right = KeyC("F"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    bottom = KeyC("K"),
                    right = TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(size = SMALL, color = MUTED),
                    top = GOTO_SETTINGS_KEYC,
                    topLeft = TOGGLE_HIDE_LETTERS_KEYC,
                    bottomLeft = SWITCH_IME_VOICE_KEYC,
                    left = SWITCH_LANGUAGE_KEYC,
                    bottomRight = SWITCH_IME_KEYC,
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    top = KeyC("Y"),
                    bottom = KeyC("P"),
                    left = KeyC("C"),
                    right = KeyC("W"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("J"),
                    right = TOGGLE_NUMERIC_MODE_TRUE_KEYC.copy(size = SMALL, color = MUTED),
                    left = COPY_KEYC,
                    topLeft = SELECT_ALL_KEYC,
                    topRight = CUT_KEYC,
                    bottomLeft = UNDO_KEYC,
                    bottomRight = REDO_KEYC,
                    bottom = PASTE_KEYC,
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    top = KeyC("M"),
                    bottom = KeyC("L"),
                    left = KeyC("B"),
                    right = KeyC("G"),
                    topRight = KeyC("'", color = MUTED),
                    topLeft = KeyC(".", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    top = KeyC("V"),
                    bottom = RETURN_KEYC.copy(size = SMALL, color = MUTED),
                    left = BACKSPACE_KEYC.copy(size = SMALL, color = MUTED),
                    bottomLeft = DELETE_WORD_BEFORE_CURSOR_KEYC,
                    bottomRight = DELETE_WORD_AFTER_CURSOR_KEYC,
                    topLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    longPress = DeleteWordBeforeCursor,
                    ),
            ),
        ),
    )

val KB_EN_WHALE: KeyboardDefinition =
    KeyboardDefinition(
        title = "english whale",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_WHALE_MAIN,
                shifted = KB_EN_WHALE_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
