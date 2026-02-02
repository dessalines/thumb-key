@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_PT_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("h"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    bottomLeft = KeyC("c"),
                    left = KeyC("ç", color = MUTED),
                    topRight = KeyC("ó", color = MUTED),
                    right = KeyC("ô", color = MUTED),
                    bottom = KeyC("õ", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    topLeft = KeyC("x"),
                    top = KeyC("w"),
                    topRight = KeyC("f"),
                    right = KeyC("b"),
                    bottomRight = KeyC("q"),
                    bottom = KeyC("k"),
                    bottomLeft = KeyC("z"),
                    left = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    left = KeyC("t"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topRight = KeyC("é", color = MUTED),
                    right = KeyC("ê", color = MUTED),
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
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("l"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("g"),
                    topRight = KeyC("í", color = MUTED),
                    right = KeyC("y"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    topLeft = KeyC("'", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    topLeft = KeyC("u"),
                    top = KeyC("ú", color = MUTED),
                    topRight = KeyC("á", color = MUTED),
                    right = KeyC("â", color = MUTED),
                    bottomRight = KeyC("à", color = MUTED),
                    bottom = KeyC("ã", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PT_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("H"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    bottomLeft = KeyC("C"),
                    left = KeyC("Ç", color = MUTED),
                    topRight = KeyC("Ó", color = MUTED),
                    right = KeyC("Ô", color = MUTED),
                    bottom = KeyC("Õ", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    topLeft = KeyC("X"),
                    top = KeyC("W"),
                    topRight = KeyC("F"),
                    right = KeyC("B"),
                    bottomRight = KeyC("Q"),
                    bottom = KeyC("K"),
                    bottomLeft = KeyC("Z"),
                    left = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    left = KeyC("T"),
                    right = KeyC("Ê", color = MUTED),
                    topRight = KeyC("É", color = MUTED),
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
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("L"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("G"),
                    topRight = KeyC("Í", color = MUTED),
                    right = KeyC("Y"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    topLeft = KeyC("'", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    topLeft = KeyC("U"),
                    top = KeyC("Ú", color = MUTED),
                    topRight = KeyC("Á", color = MUTED),
                    right = KeyC("Â", color = MUTED),
                    bottomRight = KeyC("À", color = MUTED),
                    bottom = KeyC("Ã", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PT_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "português thumb-key",
        locales = listOf("pt"),
        modes =
            KeyboardDefinitionModes(
                main = KB_PT_THUMBKEY_MAIN,
                shifted = KB_PT_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
