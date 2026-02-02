@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_LT_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    right = KeyC("h"),
                    bottomRight = KeyC("d"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    bottomLeft = KeyC("l"),
                    left = KeyC("f"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    topLeft = KeyC("q", color = MUTED),
                    right = KeyC("v"),
                    bottomLeft = KeyC("x", color = MUTED),
                    left = KeyC("w", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    topLeft = KeyC("č"),
                    top = KeyC("c"),
                    topRight = KeyC("y"),
                    right = KeyC("ų"),
                    bottomRight = KeyC("ž"),
                    bottom = KeyC("z"),
                    bottomLeft = KeyC("b"),
                    left = KeyC("ū"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ą"),
                    left = KeyC("m"),
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
                    center = KeyC("s", size = LARGE),
                    topRight = KeyC("p"),
                    right = KeyC("š"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("j"),
                    topRight = KeyC("?", color = MUTED),
                    right = KeyC("ę"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("ė"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    topLeft = KeyC("k"),
                    left = KeyC("į"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_LT_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    right = KeyC("H"),
                    bottomRight = KeyC("D"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    bottomLeft = KeyC("L"),
                    left = KeyC("F"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    topLeft = KeyC("Q", color = MUTED),
                    right = KeyC("V"),
                    bottomLeft = KeyC("X", color = MUTED),
                    left = KeyC("W", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    topLeft = KeyC("Č"),
                    top = KeyC("C"),
                    topRight = KeyC("Y"),
                    right = KeyC("Ų"),
                    bottomRight = KeyC("Ž"),
                    bottom = KeyC("Z"),
                    bottomLeft = KeyC("B"),
                    left = KeyC("Ū"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Ą"),
                    left = KeyC("M"),
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
                    topRight = KeyC("P"),
                    right = KeyC("Š"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("J"),
                    topRight = KeyC("?", color = MUTED),
                    right = KeyC("Ę"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("Ė"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    topLeft = KeyC("K"),
                    left = KeyC("Į"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_LT_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "lietuvių kalba thumb-key",
        locales = listOf("lt"),
        modes =
            KeyboardDefinitionModes(
                main = KB_LT_THUMBKEY_MAIN,
                shifted = KB_LT_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
