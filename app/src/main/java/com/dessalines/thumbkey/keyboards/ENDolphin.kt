@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_EN_DOLPHIN_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    bottomRight = KeyC("r"),
                    right = KeyC("g"),
                    bottom = KeyC("y")
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    bottom = KeyC("c"),
                    bottomLeft = KeyC("q"),
                    bottomRight = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    bottomLeft = KeyC("l"),
                    right = TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(size = SMALL, color = MUTED),
                    top = GOTO_SETTINGS_KEYC,
                    topLeft = TOGGLE_HIDE_LETTERS_KEYC,
                    topRight = SWITCH_IME_VOICE_KEYC,
                    left = SWITCH_LANGUAGE_KEYC,
                    bottomRight = SWITCH_IME_KEYC,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    right=KeyC("u"),
                    topRight = KeyC("p"),
                    bottomRight = KeyC("b"),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    left = KeyC("f"),
                    right = TOGGLE_NUMERIC_MODE_TRUE_KEYC.copy(size = SMALL, color = MUTED),
                    top = COPY_KEYC,
                    topLeft = SELECT_ALL_KEYC,
                    topRight = CUT_KEYC,
                    bottomLeft = UNDO_KEYC,
                    bottomRight = REDO_KEYC,
                    bottom = PASTE_KEYC,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    topRight = KeyC("d"),
                    top = KeyC("v"),
                    right = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    top = KeyC("w"),
                    topLeft = KeyC("j"),
                    topRight = KeyC("x"),
                    left = KeyC("'", color = MUTED),
                    right = KeyC(".", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("m"),
                    bottom = RETURN_KEYC.copy(size = SMALL, color = MUTED),
                    left = BACKSPACE_KEYC.copy(size = SMALL, color = MUTED),
                    bottomLeft = DELETE_WORD_BEFORE_CURSOR_KEYC,
                    bottomRight = DELETE_WORD_AFTER_CURSOR_KEYC,
                    top =
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

val KB_EN_DOLPHIN_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    bottomRight = KeyC("R"),
                    right = KeyC("G"),
                    bottom = KeyC("Y")
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    bottom = KeyC("C"),
                    bottomLeft = KeyC("Q"),
                    bottomRight = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    bottomLeft = KeyC("L"),
                    right = TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(size = SMALL, color = MUTED),
                    top = GOTO_SETTINGS_KEYC,
                    topLeft = TOGGLE_HIDE_LETTERS_KEYC,
                    topRight = SWITCH_IME_VOICE_KEYC,
                    left = SWITCH_LANGUAGE_KEYC,
                    bottomRight = SWITCH_IME_KEYC,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    right=KeyC("U"),
                    topRight = KeyC("P"),
                    bottomRight = KeyC("B"),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    left = KeyC("F"),
                    right = TOGGLE_NUMERIC_MODE_TRUE_KEYC.copy(size = SMALL, color = MUTED),
                    top = COPY_KEYC,
                    topLeft = SELECT_ALL_KEYC,
                    topRight = CUT_KEYC,
                    bottomLeft = UNDO_KEYC,
                    bottomRight = REDO_KEYC,
                    bottom = PASTE_KEYC,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    topRight = KeyC("D"),
                    top = KeyC("V"),
                    right = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    top = KeyC("W"),
                    topLeft = KeyC("J"),
                    topRight = KeyC("X"),
                    left = KeyC("'", color = MUTED),
                    right = KeyC(".", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("M"),
                    bottom = RETURN_KEYC.copy(size = SMALL, color = MUTED),
                    left = BACKSPACE_KEYC.copy(size = SMALL, color = MUTED),
                    bottomLeft = DELETE_WORD_BEFORE_CURSOR_KEYC,
                    bottomRight = DELETE_WORD_AFTER_CURSOR_KEYC,
                    top =
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




val KB_EN_DOLPHIN: KeyboardDefinition =
    KeyboardDefinition(
        title = "english dolphin",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_DOLPHIN_MAIN,
                shifted = KB_EN_DOLPHIN_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
