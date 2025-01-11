@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_PT_DVORAK_WIDE_PUNCT_KEY =
    KeyItemC(
        center = KeyC("'", size = LARGE),
        swipeType = FOUR_WAY_DIAGONAL,
        topLeft = KeyC("!", color = MUTED),
        topRight = KeyC("?", color = MUTED),
        bottomRight = KeyC(".", color = MUTED),
        bottomLeft = KeyC(",", color = MUTED),
    )

val KB_PT_DVORAK_WIDE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    bottomLeft = KeyC("à", color = MUTED),
                    bottom = KeyC("ã", color = MUTED),
                    bottomRight = KeyC("â", color = MUTED),
                    right = KeyC("á", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("y", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("p"),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("f"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("g"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topRight = KeyC("ó", color = MUTED),
                    bottomRight = KeyC("ô", color = MUTED),
                    right = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    left = KeyC("k"),
                    right = KeyC("ú", color = MUTED),
                ),
                KB_PT_DVORAK_WIDE_PUNCT_KEY,
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("v"),
                    right = KeyC("c"),
                    bottom = KeyC("ç"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("l"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    left = KeyC("\x1b", displayText = "⎋", color = MUTED),
                    topRight = KeyC("j"),
                    top = KeyC("õ", color = MUTED),
                    right = KeyC("é", color = MUTED),
                    bottomRight = KeyC("ê", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    topLeft = KeyC("x"),
                    right = KeyC("í", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("m"),
                    topLeft = KeyC("b"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topLeft = KeyC("w"),
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = CommitText("\t"),
                            color = MUTED,
                        ),
                    bottomRight = KeyC("z"),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM.copy(
                    swipeType = TWO_WAY_VERTICAL,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = SECONDARY,
                        ),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                ),
            ),
        ),
    )

val KB_PT_DVORAK_WIDE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    bottomLeft = KeyC("À", color = MUTED),
                    bottom = KeyC("Ã", color = MUTED),
                    bottomRight = KeyC("Â", color = MUTED),
                    right = KeyC("Á", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("Y", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("P"),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("F"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("G"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    right = KeyC("Q"),
                    topRight = KeyC("Ó", color = MUTED),
                    bottomRight = KeyC("Ô", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    left = KeyC("K"),
                    right = KeyC("Ú", color = MUTED),
                ),
                KB_PT_DVORAK_WIDE_PUNCT_KEY,
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("V"),
                    right = KeyC("C"),
                    bottom = KeyC("Ç", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("L"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    left = KeyC("\x1b", displayText = "⎋", color = MUTED),
                    topRight = KeyC("J"),
                    top = KeyC("Õ", color = MUTED),
                    right = KeyC("É", color = MUTED),
                    bottomRight = KeyC("Ê", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    topLeft = KeyC("X"),
                    right = KeyC("Í", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("M"),
                    topLeft = KeyC("B"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("W"),
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = CommitText("\t"),
                            color = MUTED,
                        ),
                    bottomRight = KeyC("Z"),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM.copy(
                    swipeType = TWO_WAY_VERTICAL,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = SECONDARY,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = SECONDARY,
                        ),
                ),
            ),
        ),
    )

val KB_PT_DVORAK_WIDE: KeyboardDefinition =
    KeyboardDefinition(
        title = "português dvorak wide",
        modes =
            KeyboardDefinitionModes(
                main = KB_PT_DVORAK_WIDE_MAIN,
                shifted = KB_PT_DVORAK_WIDE_SHIFTED,
                numeric = WIDE_NUMERIC_KEYBOARD,
            ),
    )
