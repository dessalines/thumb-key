@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_PL_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottom = KeyC("y"),
                    bottomRight = KeyC("ś"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("u"),
                    bottomRight = KeyC("ó"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("d"),
                    bottomRight = KeyC("ń"),
                ),
                KeyItemC(
                    center = KeyC("w", size = LARGE),
                    topLeft = KeyC("h"),
                    top = KeyC("q"),
                    topRight = KeyC("ł"),
                    right = KeyC("l"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("f"),
                    bottomLeft = KeyC("b"),
                    left = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    left = KeyC("c"),
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
                    bottomRight = KeyC("ć"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("z", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("k"),
                    bottomLeft = KeyC("ż"),
                    bottomRight = KeyC("ź"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("*", color = MUTED),
                    top = KeyC("m"),
                    topRight = KeyC("-", color = MUTED),
                    right = KeyC("v"),
                    left = KeyC("x"),
                    bottomRight = KeyC("ę"),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("t"),
                    bottomRight = KeyC("ą"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PL_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottom = KeyC("Y"),
                    bottomRight = KeyC("Ś"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("U"),
                    bottomRight = KeyC("Ó"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("D"),
                    bottomRight = KeyC("Ń"),
                ),
                KeyItemC(
                    center = KeyC("W", size = LARGE),
                    topLeft = KeyC("H"),
                    top = KeyC("Q"),
                    topRight = KeyC("Ł"),
                    right = KeyC("L"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("F"),
                    bottomLeft = KeyC("B"),
                    left = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    left = KeyC("C"),
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
                    bottomRight = KeyC("Ć"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Z", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("K"),
                    bottomLeft = KeyC("Ż"),
                    bottomRight = KeyC("Ź"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("*", color = MUTED),
                    top = KeyC("M"),
                    topRight = KeyC("-", color = MUTED),
                    right = KeyC("V"),
                    left = KeyC("X"),
                    bottomRight = KeyC("Ę"),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("T"),
                    bottomRight = KeyC("Ą"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PL_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "polski thumb-key",
        locales = listOf("pl"),
        modes =
            KeyboardDefinitionModes(
                main = KB_PL_THUMBKEY_MAIN,
                shifted = KB_PL_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
