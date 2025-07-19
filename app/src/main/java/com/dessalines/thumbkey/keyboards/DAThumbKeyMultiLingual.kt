@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_DA_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    left = KeyC("ß", color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC("v"),
                    bottom = KeyC("š", color = MUTED),
                    topLeft = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("f"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("y"),
                    right = KeyC("ü", color = MUTED),
                    bottomLeft = KeyC("h"),
                    
                    
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("m"),
                    left = KeyC("ñ", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("j", size = LARGE),
                    topLeft = KeyC("q"),
                    top = KeyC("x"),
                    topRight = KeyC("æ"),
                    right = KeyC("ø"),
                    bottomRight = KeyC("å"),
                    bottom = KeyC("l"),
                    bottomLeft = KeyC("b"),
                    left = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = Key("ä", color = MUTED),
                    left = KeyC("u"),
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
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    top = KeyC("k"),
                    topRight = KeyC("c"),
                    right = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("ö", color = MUTED),
                    topLeft = KeyC("o"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DA_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    left = KeyC("ß", color = MUTED),
                    right = KeyC("Z"),
                    bottom =KeyC("Š", color = MUTED),
                    bottomRight = KeyC("V"),
                    topLeft = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("F"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("Y"),
                    right = KeyC("Ü", color = MUTED),
                    bottomLeft = KeyC("H"),
                    
                    
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("M"),
                    left = KeyC("Ñ", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("J", size = LARGE),
                    topLeft = KeyC("Q"),
                    top = KeyC("X"),
                    topRight = KeyC("Æ"),
                    right = KeyC("Ø"),
                    bottomRight = KeyC("Å"),
                    bottom = KeyC("L"),
                    bottomLeft = KeyC("B"),
                    left = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("U"),
                    right = KeyC("Ä", color = MUTED),
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
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    top = KeyC("K"),
                    topRight = KeyC("C"),
                    right = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("Ö", color = MUTED),
                    topLeft = KeyC("O"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DA_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "dansk thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_DA_THUMBKEY_MAIN,
                shifted = KB_DA_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
