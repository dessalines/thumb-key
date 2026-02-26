@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_SK_THUMBKEY_V2_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    // swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("q"),
                    top = KeyC("ť"),
                    topRight = KeyC("č"),
                    bottomRight = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("v", size = LARGE),
                    // swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("w"),
                    bottom = KeyC("z"),
                    bottomRight = KeyC("ž"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    // swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("ú"),
                    top = KeyC("é"),
                    topRight = KeyC("x"),
                    bottomLeft = KeyC("u"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    // swipeType = TWO_WAY_HORIZONTAL,
                    top = KeyC("ň"),
                    right = KeyC("m"),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    topLeft = KeyC("b"),
                    top = KeyC("ŕ"),
                    topRight = KeyC("j"),
                    right = KeyC("h"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("ý"),
                    bottomLeft = KeyC("g"),
                    left = KeyC("f"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    // swipeType = FOUR_WAY_CROSS,
                    // eng.: you have to turn off this in case to allow 8-way swiping, obvious, but new and tricki to me
                    topRight = KeyC("ó"),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("ô"),
                    left = KeyC("k"),
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
                    top = KeyC("š"),
                    topRight = KeyC("d"),
                    right = KeyC("%", color = MUTED),
                    bottomRight = KeyC("ď"),
                    bottom = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("p"),
                    topRight = KeyC("í"),
                    bottomRight = KeyC("?", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    topLeft = KeyC("l"),
                    topRight = KeyC("á"),
                    bottomRight = KeyC("ä"),
                    bottom = KeyC("@", color = MUTED),
                    bottomLeft = KeyC("ĺ"),
                    left = KeyC("ľ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_SK_THUMBKEY_V2_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    // swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("Q"),
                    top = KeyC("Ť"),
                    topRight = KeyC("Č"),
                    bottomRight = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("V", size = LARGE),
                    // swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("W"),
                    bottom = KeyC("Z"),
                    bottomRight = KeyC("Ž"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    // swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("Ú"),
                    top = KeyC("É"),
                    topRight = KeyC("X"),
                    bottomLeft = KeyC("U"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    // swipeType = TWO_WAY_HORIZONTAL,
                    top = KeyC("Ň"),
                    right = KeyC("M"),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    topLeft = KeyC("B"),
                    top = KeyC("Ŕ"),
                    topRight = KeyC("J"),
                    right = KeyC("H"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("Ý"),
                    bottomLeft = KeyC("G"),
                    left = KeyC("F"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topRight = KeyC("Ó"),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("Ô"),
                    left = KeyC("K"),
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
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    top = KeyC("Š"),
                    topRight = KeyC("D"),
                    right = KeyC("%", color = MUTED),
                    bottomRight = KeyC("Ď"),
                    bottom = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("P"),
                    topRight = KeyC("Í"),
                    bottomRight = KeyC("?", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("L"),
                    topRight = KeyC("Á"),
                    bottomRight = KeyC("Ä"),
                    bottom = KeyC("@", color = MUTED),
                    bottomLeft = KeyC("Ĺ"),
                    left = KeyC("Ľ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_SK_THUMBKEY_V2: KeyboardDefinition =
    KeyboardDefinition(
        title = "slovenčina thumb-key v2",
        locales = listOf("sk"),
        modes =
            KeyboardDefinitionModes(
                main = KB_SK_THUMBKEY_V2_MAIN,
                shifted = KB_SK_THUMBKEY_V2_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
