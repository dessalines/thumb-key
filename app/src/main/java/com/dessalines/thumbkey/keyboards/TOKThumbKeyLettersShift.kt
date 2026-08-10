@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_TOK_THUMBKEY_LETTERS_SHIFT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("j"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("k", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    left = KeyC("w"),
                    right = KeyC("p"),
                    top = KeyC("t"),
                    bottom = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    topLeft = KeyC("*", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("-", size = SMALLEST, color = MUTED),
                    bottomRight = KeyC("@", size = SMALLEST, color = MUTED),
                    topRight = KeyC("\"", size = SMALLEST, color = MUTED),
                    bottom = KeyC(",", color = MUTED),
                    right = KeyC("(", size = SMALLEST, color = MUTED),
                    left = KeyC("/", size = SMALLEST, color = MUTED),
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
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    bottomRight = KeyC("?", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_TOK_THUMBKEY_LETTERS_SHIFT_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    bottomLeft = KeyC("J"),
                    swipeType = FOUR_WAY_DIAGONAL,
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("K", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    left = KeyC("W"),
                    right = KeyC("P"),
                    top = KeyC("T"),
                    bottom = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    topRight = KeyC(":", size = SMALLEST, color = MUTED),
                    bottomRight = KeyC("#", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("_", size = SMALLEST, color = MUTED),
                    topLeft = KeyC("&", size = SMALLEST, color = MUTED),
                    left = KeyC("•", size = SMALLEST, color = MUTED),
                    right = KeyC(")", size = SMALLEST, color = MUTED),
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
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    bottomRight = KeyC("?", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_TOK_THUMBKEY_LETTERS_SHIFT: KeyboardDefinition =
    KeyboardDefinition(
        title = "toki pona thumb-key letters shift",
        modes =
            KeyboardDefinitionModes(
                main = KB_TOK_THUMBKEY_LETTERS_SHIFT_MAIN,
                shifted = KB_TOK_THUMBKEY_LETTERS_SHIFT_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
