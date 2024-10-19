@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_EN_QBASED_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("w", size = LARGE),
                    left = KeyC("q", color = PRIMARY),
                    right = KeyC("e", color = PRIMARY),
                    topLeft = KeyC("1"),
                    top = KeyC("2"),
                    topRight = KeyC("3"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    left = KeyC("r", color = PRIMARY),
                    right = KeyC("u", color = PRIMARY),
                    bottom = KeyC("y", color = PRIMARY),
                    topLeft = KeyC("4"),
                    top = KeyC("5"),
                    topRight = KeyC("6"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    left = KeyC("i", color = PRIMARY),
                    right = KeyC("p", color = PRIMARY),
                    topLeft = KeyC("7"),
                    top = KeyC("8"),
                    topRight = KeyC("9"),
                    bottomRight = KeyC("0"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    left = KeyC("a", color = PRIMARY),
                    right = KeyC("d", color = PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("g", size = LARGE),
                    left = KeyC("f", color = PRIMARY),
                    right = KeyC("h", color = PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("k", size = LARGE),
                    left = KeyC("j", color = PRIMARY),
                    right = KeyC("l", color = PRIMARY),
                    top = KeyC("\""),
                    bottom = KeyC("'"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("z", size = LARGE),
                    right = KeyC("x", color = PRIMARY),
                    left =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                        ),
                ),
                KeyItemC(
                    center = KeyC("v", size = LARGE),
                    left = KeyC("c", color = PRIMARY),
                    right = KeyC("b", color = PRIMARY),
                    bottom = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    right = KeyC("?"),
                    top = KeyC("!"),
                    bottom = KeyC("."),
                    left = KeyC("n", color = PRIMARY),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_QBASED_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("W", size = LARGE),
                    left = KeyC("Q", color = PRIMARY),
                    right = KeyC("E", color = PRIMARY),
                    topLeft = KeyC("!"),
                    top = KeyC("@"),
                    topRight = KeyC("#"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    left = KeyC("R", color = PRIMARY),
                    right = KeyC("U", color = PRIMARY),
                    bottom = KeyC("Y", color = PRIMARY),
                    topLeft = KeyC("$"),
                    top = KeyC("%"),
                    topRight = KeyC("^"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    left = KeyC("I", color = PRIMARY),
                    right = KeyC("P", color = PRIMARY),
                    topLeft = KeyC("&"),
                    top = KeyC("*"),
                    topRight = KeyC("("),
                    bottomRight = KeyC(")"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    left = KeyC("A", color = PRIMARY),
                    right = KeyC("D", color = PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("G", size = LARGE),
                    left = KeyC("F", color = PRIMARY),
                    right = KeyC("H", color = PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("K", size = LARGE),
                    left = KeyC("J", color = PRIMARY),
                    right = KeyC("L", color = PRIMARY),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Z", size = LARGE),
                    right = KeyC("X", color = PRIMARY),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                ),
                KeyItemC(
                    center = KeyC("V", size = LARGE),
                    left = KeyC("C", color = PRIMARY),
                    right = KeyC("B", color = PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    right = KeyC("/"),
                    left = KeyC("N", color = PRIMARY),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_QBASED: KeyboardDefinition =
    KeyboardDefinition(
        title = "english qbased",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_QBASED_MAIN,
                shifted = KB_EN_QBASED_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
