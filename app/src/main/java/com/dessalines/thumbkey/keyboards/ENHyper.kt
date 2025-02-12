@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardCapslock
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_HYPER_MAIN =
    KeyboardC(
        listOf(
            listOf(
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("`", color = MUTED),
                    bottom = KeyC("x"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("!", color = MUTED),
                    left = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("b"),
                    bottom = KeyC("d"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("@", color = MUTED),
                    bottom = KeyC("y"),
                ),
                RETURN_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("k"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
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
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("?", color = MUTED),
                    top = KeyC(".", color = MUTED),
                    bottom = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("p"),
                    bottom = KeyC("w"),
                    top = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("c"),
                    bottom = KeyC("q"),
                    top = KeyC("-", color = MUTED),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("g", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("\"", color = MUTED),
                    top = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("'", color = MUTED),
                    left = KeyC(";", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("f"),
                    top = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("#", color = MUTED),
                    top = KeyC("/", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
        ),
    )

val KB_EN_HYPER_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("~", color = MUTED),
                    bottom = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("!", color = MUTED),
                    left = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("B"),
                    bottom = KeyC("D"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("@", color = MUTED),
                    bottom = KeyC("Y"),
                ),
                RETURN_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("K"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("?", color = MUTED),
                    top = KeyC(".", color = MUTED),
                    bottom = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("P"),
                    top = KeyC("M"),
                    bottom = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("C"),
                    top = KeyC("_", color = MUTED),
                    bottom = KeyC("Q"),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("G", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("\"", color = MUTED),
                    top = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC(":", color = MUTED),
                    top = KeyC("'", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("F"),
                    top = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("#", color = MUTED),
                    top = KeyC("/", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
        ),
    )

val KB_EN_HYPER: KeyboardDefinition =
    KeyboardDefinition(
        title = "english hyper",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_HYPER_MAIN,
                shifted = KB_EN_HYPER_SHIFTED,
                numeric = HYPER_NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
