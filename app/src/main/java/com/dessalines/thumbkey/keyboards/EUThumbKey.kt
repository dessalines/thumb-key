@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_EU_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    bottomRight = KeyC("s"),
                ),
                KeyItemC(
                    center = KeyC("z", size = LARGE),
                    bottom = KeyC("h"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    bottomLeft = KeyC("d"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    right = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    topLeft = KeyC("c"),
                    top = KeyC("w"),
                    topRight = KeyC("j"),
                    right = KeyC("m"),
                    bottomRight = KeyC("x"),
                    bottom = KeyC("v"),
                    bottomLeft = KeyC("y"),
                    left = KeyC("f"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    left = KeyC("b"),
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
                    center = KeyC("n", size = LARGE),
                    topRight = KeyC("l"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    top = KeyC("p"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("q"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    topLeft = KeyC("k"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EU_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    bottomRight = KeyC("S"),
                ),
                KeyItemC(
                    center = KeyC("Z", size = LARGE),
                    bottom = KeyC("H"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    bottomLeft = KeyC("D"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    right = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    topLeft = KeyC("C"),
                    top = KeyC("W"),
                    topRight = KeyC("J"),
                    right = KeyC("M"),
                    bottomRight = KeyC("X"),
                    bottom = KeyC("V"),
                    bottomLeft = KeyC("Y"),
                    left = KeyC("F"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
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
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    topRight = KeyC("L"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    top = KeyC("P"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Q"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    topLeft = KeyC("K"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EU_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "euskara thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_EU_THUMBKEY_MAIN,
                shifted = KB_EU_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
