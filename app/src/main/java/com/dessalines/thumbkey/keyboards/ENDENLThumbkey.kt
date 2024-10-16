@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_EN_DE_NL_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottomRight = KeyC("w"),
                    topRight = KeyC("ß", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    bottom = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topRight = KeyC("&", color = MUTED),
                    bottomLeft = KeyC("u"),
                    topLeft = KeyC("ü", color = MUTED),
                    bottom = KeyC("ö", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("m"),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    topLeft = KeyC("j"),
                    top = KeyC("q"),
                    topRight = KeyC("b"),
                    right = KeyC("p"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("x"),
                    bottomLeft = KeyC("v"),
                    left = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    left = KeyC("l"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom = KeyC("ä", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("c"),
                    right = KeyC("ç", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(";", color = MUTED),
                    bottomLeft = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("f"),
                    topRight = KeyC("'"),
                    right = KeyC("z"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC("."),
                    bottomLeft = KeyC(","),
                    left = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("d"),
                    top = KeyC("è", color = MUTED),
                    topRight = KeyC("é", color = MUTED),
                    right = KeyC("ë", color = MUTED),
                    bottomRight = KeyC(")", color = MUTED),
                    bottom = KeyC("!"),
                    bottomLeft = KeyC("?"),
                    left = KeyC("ê", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_DE_NL_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottomRight = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    bottom = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topRight = KeyC("&", color = MUTED),
                    bottomLeft = KeyC("U"),
                    topLeft = KeyC("Ü", color = MUTED),
                    bottom = KeyC("Ö", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    topLeft = KeyC("J"),
                    top = KeyC("Q"),
                    topRight = KeyC("B"),
                    right = KeyC("P"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("X"),
                    bottomLeft = KeyC("V"),
                    left = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    left = KeyC("L"),
                    right = KeyC("Ä", color = MUTED),
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
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("C"),
                    right = KeyC("Ç", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(";", color = MUTED),
                    bottomLeft = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("F"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("D"),
                    top = KeyC("È", color = MUTED),
                    topRight = KeyC("É", color = MUTED),
                    right = KeyC("Ë", color = MUTED),
                    bottomRight = KeyC(")", color = MUTED),
                    bottom = KeyC("!", color = MUTED),
                    bottomLeft = KeyC("?", color = MUTED),
                    left = KeyC("Ê", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_DE_NL_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "english deutsch nederlands thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_DE_NL_THUMBKEY_MAIN,
                shifted = KB_EN_DE_NL_THUMBKEY_SHIFTED,
                numeric = NUMERIC_ENDENL_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
