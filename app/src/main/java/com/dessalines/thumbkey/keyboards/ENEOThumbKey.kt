package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropUp
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.KeyboardDefinitionSettings
import com.dessalines.thumbkey.utils.SwipeNWay
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe

val KB_EN_EO_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("k"),
                    top = KeyC("m"),
                    left = KeyC("'"),
                    right = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("ŝ"),
                    top = KeyC("p"),
                    left = KeyC("ϗ"),
                    right = KeyC("₷"),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("ĥ"),
                    top = KeyC("h"),
                    left = KeyC("#"),
                    right = KeyC(":"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("ĵ"),
                    top = KeyC("j"),
                    left = KeyC("."),
                    right = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("v"),
                    top = KeyC("f"),
                    left = KeyC("?"),
                    right = KeyC("!"),
                ),
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("d"),
                    left = KeyC("("),
                    right = KeyC(")"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("ĉ"),
                    top = KeyC("c"),
                    left = KeyC("b"),
                    right = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("l", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("ĝ"),
                    top = KeyC("g"),
                    left = KeyC("y"),
                    right = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
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
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("K"),
                    top = KeyC("M"),
                    left = KeyC("'"),
                    right = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("Ŝ"),
                    top = KeyC("P"),
                    left = KeyC("ϗ"),
                    right = KeyC("₷"),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("Ĥ"),
                    top = KeyC("H"),
                    left = KeyC("#"),
                    right = KeyC(":"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("Ĵ"),
                    top = KeyC("J"),
                    left = KeyC("."),
                    right = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("V"),
                    top = KeyC("F"),
                    left = KeyC("?"),
                    right = KeyC("‽"),
                ),
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("D"),
                    left = KeyC("("),
                    right = KeyC(")"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("Ĉ"),
                    top = KeyC("C"),
                    left = KeyC("B"),
                    right = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("L", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("Ĝ"),
                    top = KeyC("G"),
                    left = KeyC("Y"),
                    right = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
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
