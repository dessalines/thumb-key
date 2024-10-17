@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_PT_EN_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottomRight = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    bottom = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topLeft = KeyC("ú", color = MUTED),
                    top = KeyC("õ", color = MUTED),
                    topRight = KeyC("ó", color = MUTED),
                    bottomLeft = KeyC("u"),
                    bottomRight = KeyC("ô", color = MUTED),
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
                    topLeft = KeyC("à", color = MUTED),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topRight = KeyC("á", color = MUTED),
                    left = KeyC("l"),
                    bottomLeft = KeyC("ã", color = MUTED),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("â", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("c"),
                    right = KeyC("ç", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("f"),
                    topRight = KeyC("í", color = MUTED),
                    right = KeyC("z"),
                    bottomLeft = KeyC("*", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("d"),
                    topRight = KeyC("é", color = MUTED),
                    bottomRight = KeyC("ê", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PT_EN_THUMBKEY_SHIFTED =
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
                    topLeft = KeyC("Ú", color = MUTED),
                    top = KeyC("Õ", color = MUTED),
                    topRight = KeyC("Ó", color = MUTED),
                    bottomLeft = KeyC("U"),
                    bottomRight = KeyC("Ô", color = MUTED),
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
                    topLeft = KeyC("À", color = MUTED),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topRight = KeyC("Á", color = MUTED),
                    left = KeyC("L"),
                    bottomLeft = KeyC("Ã", color = MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    bottomRight = KeyC("Â", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("C"),
                    right = KeyC("Ç", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("F"),
                    topRight = KeyC("Í", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("D"),
                    topRight = KeyC("É", color = MUTED),
                    bottomRight = KeyC("Ê", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PT_EN_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "português english thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_PT_EN_THUMBKEY_MAIN,
                shifted = KB_PT_EN_THUMBKEY_SHIFTED,
                numeric = NUMERIC_PT_EN_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
