@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_LV_LTG_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("d"),
                ),
                KeyItemC(
                    center = KeyC("k", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("ķ"),
                    bottom = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("ē"),
                    bottomLeft = KeyC("j"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("ļ"),
                    right = KeyC("l"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    topLeft = KeyC("c"),
                    top = KeyC("h"),
                    topRight = KeyC("č"),
                    right = KeyC("ģ"),
                    bottomRight = KeyC("ņ"),
                    bottom = KeyC("f"),
                    bottomLeft = KeyC("b"),
                    left = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    topLeft = KeyC("ī"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    right = KeyC("ž"),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomLeft = KeyC("y"),
                    left = KeyC("z"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    top = KeyC("š"),
                    topRight = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    top = KeyC("p"),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC("ū", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    topLeft = KeyC("o"),
                    top = KeyC("ā", color = MUTED),
                    left = KeyC("ō", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_LV_LTG_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("D"),
                ),
                KeyItemC(
                    center = KeyC("K", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("Ķ"),
                    bottom = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("Ē"),
                    bottomLeft = KeyC("J"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Ļ"),
                    right = KeyC("L"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    topLeft = KeyC("C"),
                    top = KeyC("H"),
                    topRight = KeyC("Č"),
                    right = KeyC("Ģ"),
                    bottomRight = KeyC("Ņ"),
                    bottom = KeyC("F"),
                    bottomLeft = KeyC("B"),
                    left = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    topLeft = KeyC("Ī"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    right = KeyC("Ž"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    bottomLeft = KeyC("Y"),
                    left = KeyC("Z"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    top = KeyC("Š"),
                    topRight = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    top = KeyC("P"),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC("Ū"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    topLeft = KeyC("O"),
                    top = KeyC("Ā", color = MUTED),
                    left = KeyC("Ō", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_LV_LTG_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "latviešu valoda thumb-key",
        locales = listOf("lv"),
        modes =
            KeyboardDefinitionModes(
                main = KB_LV_LTG_THUMBKEY_MAIN,
                shifted = KB_LV_LTG_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
