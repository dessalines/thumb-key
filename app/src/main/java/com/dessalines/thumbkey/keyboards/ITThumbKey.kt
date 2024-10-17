@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_IT_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottom = KeyC("z"),
                    right = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    bottom = KeyC("p"),
                    bottomRight = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    left = KeyC("u"),
                    bottomRight = KeyC("ù", color = MUTED),
                    right = KeyC("ò", color = MUTED),
                    bottomLeft = KeyC("qu", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    topLeft = KeyC("j"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("x"),
                    bottomLeft = KeyC("w"),
                    left = KeyC("k"),
                    right = KeyC("h"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    left = KeyC("b"),
                    right = KeyC("c"),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("à", color = MUTED),
                    bottomLeft = KeyC("ch", color = MUTED),
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
                    topRight = KeyC("!", color = MUTED),
                    bottomLeft = KeyC("?", color = MUTED),
                    bottomRight = KeyC("@", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    right = KeyC("ì", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    right = KeyC("è", color = MUTED),
                    left = KeyC("f"),
                    topRight = KeyC("é", color = MUTED),
                    topLeft = KeyC("ə", color = MUTED),
                    top = KeyC("d"),
                    bottom = KeyC("g"),
                    bottomLeft = KeyC("gh", color = MUTED),
                    bottomRight = KeyC("ɜ", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_IT_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottom = KeyC("Z"),
                    right = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    bottom = KeyC("P"),
                    bottomRight = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    right = KeyC("Ò", color = MUTED),
                    bottomRight = KeyC("Ù", color = MUTED),
                    left = KeyC("U"),
                    bottomLeft = KeyC("Qu", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    topLeft = KeyC("J"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("X"),
                    bottomLeft = KeyC("W"),
                    left = KeyC("K"),
                    right = KeyC("H"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    right = KeyC("C"),
                    left = KeyC("B"),
                    bottomRight = KeyC("À", color = MUTED),
                    bottomLeft = KeyC("Ch", color = MUTED),
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
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("!", color = MUTED),
                    bottomLeft = KeyC("?", color = MUTED),
                    bottomRight = KeyC("@", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    right = KeyC("Ì", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    right = KeyC("È", color = MUTED),
                    topRight = KeyC("É", color = MUTED),
                    topLeft = KeyC("Ǝ", color = MUTED),
                    top = KeyC("D"),
                    left = KeyC("F"),
                    bottom = KeyC("G"),
                    bottomLeft = KeyC("Gh", color = MUTED),
                    bottomRight = KeyC("3", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_IT_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "italiano thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_IT_THUMBKEY_MAIN,
                shifted = KB_IT_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
