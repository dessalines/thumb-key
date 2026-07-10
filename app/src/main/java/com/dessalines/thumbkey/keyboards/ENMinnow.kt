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
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottomRight = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    bottom = KeyC("f"),
                    bottomLeft = KeyC("g"),
                    bottomRight = KeyC("y"),
                ),
                EMOJI_KEY_ITEM.copy(
                    center = KeyC("i", size = LARGE),
                    right =
                        TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    right = KeyC("b"),
                    topRight = KeyC("z"),
                ),
                KeyItemC(
                    center = SPACEBAR_CENTER_KEYC,
                    slideType = SlideType.MOVE_CURSOR,
                    nextTapActions = SPACEBAR_NEXT_TAP_ACTIONS,
                    top = KeyC("h"),
                    bottom = KeyC("r"),
                    left = KeyC("d"),
                    right = KeyC("l"),
                    topLeft = KeyC("c"),
                    topRight = KeyC("u"),
                    bottomLeft = KeyC("m"),
                    bottomRight = KeyC("w"),
                ),
                NUMERIC_KEY_ITEM.copy(
                    center = KeyC("e", size = LARGE),
                    left = KeyC("v"),
                    right =
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
                    topRight = KeyC("k"),
                ),
                KeyItemC(
                    center = BACKSPACE_KEYC,
                    longPress = DeleteWordBeforeCursor,
                    slideType = SlideType.DELETE,
                    top = KeyC("j"),
                    topLeft = KeyC("x"),
                    left = KeyC(".", color = MUTED),
                    right = KeyC(",", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom =
                        RETURN_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    topLeft = KeyC("q"),
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
        ),
    )

val KB_EN_MINNOW_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottomRight = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    bottom = KeyC("F"),
                    bottomLeft = KeyC("G"),
                    bottomRight = KeyC("Y"),
                ),
                EMOJI_KEY_ITEM.copy(
                    center = KeyC("I", size = LARGE),
                    right =
                        TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    right = KeyC("B"),
                    topRight = KeyC("Z"),
                ),
                KeyItemC(
                    center = SPACEBAR_CENTER_KEYC,
                    slideType = SlideType.MOVE_CURSOR,
                    nextTapActions = SPACEBAR_NEXT_TAP_ACTIONS,
                    top = KeyC("H"),
                    bottom = KeyC("R"),
                    left = KeyC("D"),
                    right = KeyC("L"),
                    topLeft = KeyC("C"),
                    topRight = KeyC("U"),
                    bottomLeft = KeyC("M"),
                    bottomRight = KeyC("W"),
                ),
                NUMERIC_KEY_ITEM.copy(
                    center = KeyC("E", size = LARGE),
                    left = KeyC("V"),
                    right =
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
                    topRight = KeyC("K"),
                ),
                KeyItemC(
                    center = BACKSPACE_KEYC,
                    longPress = DeleteWordBeforeCursor,
                    slideType = SlideType.DELETE,
                    top = KeyC("J"),
                    topLeft = KeyC("X"),
                    left = KeyC(".", color = MUTED),
                    right = KeyC(",", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom =
                        RETURN_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    topLeft = KeyC("Q"),
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
