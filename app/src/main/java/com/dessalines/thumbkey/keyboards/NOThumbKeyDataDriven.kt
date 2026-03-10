@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_NO_THUMBKEY_DATADRIVEN_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    bottom = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("u"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("d"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("h"),
                    top = KeyC("c"),
                    topRight = KeyC("y"),
                    right = KeyC("å"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("b"),
                    bottomLeft = KeyC("ø"),
                    left = KeyC("æ"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("p"),
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
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("g"),
                    right = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    top = KeyC("k"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("w"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("f"),
                    top = KeyC("q"),
                    left = KeyC("x"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_NO_THUMBKEY_DATADRIVEN_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    bottom = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("U"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("D"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("H"),
                    top = KeyC("C"),
                    topRight = KeyC("Y"),
                    right = KeyC("Å"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("B"),
                    bottomLeft = KeyC("Ø"),
                    left = KeyC("Æ"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("P"),
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
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("G"),
                    right = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    top = KeyC("K"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("W"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("F"),
                    top = KeyC("Q"),
                    left = KeyC("X"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_NO_THUMBKEY_DATADRIVEN: KeyboardDefinition =
    KeyboardDefinition(
        title = "norsk thumb-key datadrevet",
        modes =
            KeyboardDefinitionModes(
                main = KB_NO_THUMBKEY_DATADRIVEN_MAIN,
                shifted = KB_NO_THUMBKEY_DATADRIVEN_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
