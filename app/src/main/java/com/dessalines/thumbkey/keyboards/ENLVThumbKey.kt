@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_ENLV_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    // swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("w"),
                    top = KeyC("š"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    // swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("g"),
                    bottomLeft = KeyC("ģ"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    // swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("u"),
                    left = KeyC("ū"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    // swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("m"),
                    top = KeyC("ņ"),	
                    topRight = KeyC("ķ"),
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
                    // swipeType = FOUR_WAY_CROSS,
                    topLeft = KeyC("ļ"),
                    left = KeyC("l"),
                    right = KeyC("ā"),
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
                    topRight = KeyC("c"),
                    right = KeyC("č"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("f"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    topLeft = KeyC("ī"),
                    left = KeyC("ž"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    // swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("d"),
                    top = KeyC("ē"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ENLV_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    // swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("W"),
                    top = KeyC("Š"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    // swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("G"),
                    bottomLeft = KeyC("Ģ"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    // swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("U"),
                    left = KeyC("Ū"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    // swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("M"),
                    top = KeyC("Ņ"),	
                    topRight = KeyC("Ķ"),
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
                    // swipeType = FOUR_WAY_CROSS,
                    topLeft = KeyC("Ļ"),
                    left = KeyC("L"),
                    right = KeyC("Ā"),
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
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("C"),
                    right = KeyC("Č"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("F"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    topLeft = KeyC("Ī"),
                    left = KeyC("Ž"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    // swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("D"),
                    top = KeyC("Ē"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
val KB_ENLV_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "latviešu valoda english thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_ENLV_THUMBKEY_MAIN,
                shifted = KB_ENLV_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
