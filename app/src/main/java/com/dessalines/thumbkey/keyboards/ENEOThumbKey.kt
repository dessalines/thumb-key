@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_EO_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("k"),
                    top = KeyC("m"),
                    left = KeyC("'"),
                    right = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ŝ"),
                    top = KeyC("p"),
                    left = KeyC("ϗ"),
                    right = KeyC("₷"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ĥ"),
                    top = KeyC("h"),
                    left = KeyC("#"),
                    right = KeyC(":"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ĵ"),
                    top = KeyC("j"),
                    left = KeyC("."),
                    right = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("v"),
                    top = KeyC("f"),
                    left = KeyC("?"),
                    right = KeyC("!"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("d"),
                    left = KeyC("("),
                    right = KeyC(")"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ĉ"),
                    top = KeyC("c"),
                    left = KeyC("b"),
                    right = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ĝ"),
                    top = KeyC("g"),
                    left = KeyC("y"),
                    right = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ŭ"),
                    top = KeyC("u"),
                    left = KeyC("x"),
                    right = KeyC("q"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_EO_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("K"),
                    top = KeyC("M"),
                    left = KeyC("'"),
                    right = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Ŝ"),
                    top = KeyC("P"),
                    left = KeyC("ϗ"),
                    right = KeyC("₷"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Ĥ"),
                    top = KeyC("H"),
                    left = KeyC("#"),
                    right = KeyC(":"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Ĵ"),
                    top = KeyC("J"),
                    left = KeyC("."),
                    right = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("V"),
                    top = KeyC("F"),
                    left = KeyC("?"),
                    right = KeyC("‽"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("D"),
                    left = KeyC("("),
                    right = KeyC(")"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Ĉ"),
                    top = KeyC("C"),
                    left = KeyC("B"),
                    right = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Ĝ"),
                    top = KeyC("G"),
                    left = KeyC("Y"),
                    right = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Ŭ"),
                    top = KeyC("U"),
                    left = KeyC("X"),
                    right = KeyC("Q"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_EO_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "english esperanto thumb-key",
        locales = listOf("en", "eo"),
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_EO_THUMBKEY_MAIN,
                shifted = KB_EN_EO_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
