@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_ES_THUMBKEY_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    topRight = KeyC("ª"),
                    left = KeyC("ñ"),
                    bottomLeft = KeyC("$"),
                    bottomRight = KeyC("b"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    topLeft = KeyC("`"),
                    top = KeyC("^"),
                    topRight = KeyC("´"),
                    left = KeyC("+"),
                    right = KeyC("!"),
                    bottomLeft = KeyC("/"),
                    bottom = KeyC("v"),
                    bottomRight = KeyC("\\"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topRight = KeyC("€"),
                    top = KeyC("="),
                    topLeft = KeyC("£"),
                    left = KeyC("?"),
                    right = KeyC("ó"),
                    bottomLeft = KeyC("u"),
                    bottom = KeyC("ü"),
                    bottomRight = KeyC("ú"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    topLeft = KeyC("{"),
                    topRight = KeyC("%"),
                    right = KeyC("p"),
                    bottomLeft = KeyC("["),
                    bottom = KeyC("("),
                    bottomRight = KeyC("_"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    topLeft = KeyC("j"),
                    top = KeyC("k"),
                    topRight = KeyC("h"),
                    left = KeyC("z"),
                    right = KeyC("q"),
                    bottomLeft = KeyC("f"),
                    bottom = KeyC("x"),
                    bottomRight = KeyC("y"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    topLeft = KeyC("|"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topRight = KeyC("}"),
                    left = KeyC("t"),
                    right = KeyC("á"),
                    bottomLeft = KeyC("@"),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("]"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("~"),
                    topRight = KeyC("m"),
                    bottomLeft = KeyC("<"),
                    bottomRight = KeyC(":"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    topLeft = KeyC("\""),
                    top = KeyC("g"),
                    topRight = KeyC("'", color = MUTED),
                    left = KeyC("w"),
                    right = KeyC("í"),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("c"),
                    top = KeyC("&"),
                    topRight = KeyC("°"),
                    left = KeyC("#"),
                    right = KeyC("é"),
                    bottomLeft = KeyC(";"),
                    bottom = KeyC(","),
                    bottomRight = KeyC(">"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ES_THUMBKEY_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    left = KeyC("Ñ"),
                    bottomRight = KeyC("B"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("¡", color = MUTED),
                    bottom = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    left = KeyC("¿", color = MUTED),
                    right = KeyC("Ó"),
                    bottomLeft = KeyC("U"),
                    bottom = KeyC("Ü"),
                    bottomRight = KeyC("Ú"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    topLeft = KeyC("J"),
                    top = KeyC("K"),
                    topRight = KeyC("H"),
                    left = KeyC("Z"),
                    right = KeyC("Q"),
                    bottomLeft = KeyC("F"),
                    bottom = KeyC("X"),
                    bottomRight = KeyC("Y"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    left = KeyC("T"),
                    right = KeyC("Á"),
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
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("G"),
                    topRight = KeyC("'", color = MUTED),
                    left = KeyC("W"),
                    right = KeyC("Í"),
                    bottomLeft = KeyC("*", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("C"),
                    right = KeyC("É"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ES_THUMBKEY_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "español thumb-key symbols",
        locales = listOf("es"),
        modes =
            KeyboardDefinitionModes(
                main = KB_ES_THUMBKEY_SYMBOLS_MAIN,
                shifted = KB_ES_THUMBKEY_SYMBOLS_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
