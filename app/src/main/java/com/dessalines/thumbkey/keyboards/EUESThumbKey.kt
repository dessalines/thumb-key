@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EU_ES_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("s"),
                ),
                KeyItemC(
                    center = KeyC("z", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("h"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    bottomLeft = KeyC("d"),
                    right = KeyC("í"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("g"),
                    left = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    topLeft = KeyC("c"),
                    top = KeyC("m"),
                    topRight = KeyC("j"),
                    right = KeyC("ú"),
                    bottomRight = KeyC("x"),
                    bottom = KeyC("v"),
                    bottomLeft = KeyC("y"),
                    left = KeyC("f"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("b"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    right = KeyC("é"),
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
                    center = KeyC("n", size = LARGE),
                    topRight = KeyC("l"),
                    left = KeyC("ñ"),
                    bottom = KeyC("¡", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    top = KeyC("p"),
                    left = KeyC("q"),
                    right = KeyC("ó"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    topLeft = KeyC("k"),
                    right = KeyC("á"),
                    bottom = KeyC("¿", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EU_ES_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("S"),
                ),
                KeyItemC(
                    center = KeyC("Z", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("H"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    bottomLeft = KeyC("D"),
                    right = KeyC("Í"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("G"),
                    left = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    topLeft = KeyC("C"),
                    top = KeyC("M"),
                    topRight = KeyC("J"),
                    right = KeyC("Ú"),
                    bottomRight = KeyC("X"),
                    bottom = KeyC("V"),
                    bottomLeft = KeyC("Y"),
                    left = KeyC("F"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("B"),
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
                    right = KeyC("É"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    topRight = KeyC("L"),
                    left = KeyC("Ñ"),
                    bottom = KeyC("¡", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    top = KeyC("P"),
                    left = KeyC("Q"),
                    right = KeyC("Ó"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    topLeft = KeyC("K"),
                    right = KeyC("Á"),
                    bottom = KeyC("¿", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EU_ES_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "euskara español thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_EU_ES_THUMBKEY_MAIN,
                shifted = KB_EU_ES_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
