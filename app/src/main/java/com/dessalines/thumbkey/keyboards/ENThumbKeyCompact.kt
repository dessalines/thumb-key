@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_THUMBKEY_COMPACT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_KEY_ITEM.copy(
                    center = KeyC("s", size = LARGE),
                    bottomRight = KeyC("w"),
                    right =
                        TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("g"),
                ),
                NUMERIC_KEY_ITEM.copy(
                    center = KeyC("o", size = LARGE),
                    bottomLeft = KeyC("u"),
                    right = UNDO_KEYC,
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
                    center = KeyC("n", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    topLeft = KeyC("j"),
                    top = KeyC("q"),
                    topRight = KeyC("b"),
                    right = KeyC("p"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("x"),
                    bottomLeft = KeyC("v"),
                    left = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("l"),
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
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("c"),
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
                    center = KeyC("i", size = LARGE),
                    top = KeyC("f"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC(",", color = MUTED),
                    topLeft = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("d"),
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

val KB_EN_THUMBKEY_COMPACT_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_KEY_ITEM.copy(
                    center = KeyC("S", size = LARGE),
                    bottomRight = KeyC("W"),
                    right =
                        TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("G"),
                ),
                NUMERIC_KEY_ITEM.copy(
                    center = KeyC("O", size = LARGE),
                    bottomLeft = KeyC("U"),
                    right = UNDO_KEYC,
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
                    center = KeyC("N", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    topLeft = KeyC("J"),
                    top = KeyC("Q"),
                    topRight = KeyC("B"),
                    right = KeyC("P"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("X"),
                    bottomLeft = KeyC("V"),
                    left = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("L"),
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
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("C"),
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
                    center = KeyC("I", size = LARGE),
                    top = KeyC("F"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC(",", color = MUTED),
                    topLeft = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("D"),
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

val KB_EN_THUMBKEY_COMPACT: KeyboardDefinition =
    KeyboardDefinition(
        title = "english thumb-key compact",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_COMPACT_MAIN,
                shifted = KB_EN_THUMBKEY_COMPACT_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
