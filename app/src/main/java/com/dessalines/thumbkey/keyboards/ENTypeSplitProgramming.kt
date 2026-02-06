@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.KeyboardCapslock
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_TYPESPLIT_PROGRAMMING_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottomLeft = KeyC("q"),
                    bottomRight = KeyC("w"),
                    left = KeyC("0", color = MUTED),
                    topLeft = KeyC("1", color = MUTED),
                    top = KeyC("2", color = MUTED),
                    topRight = KeyC("3", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottomLeft = KeyC("r"),
                    bottomRight = KeyC("y"),
                    topLeft = KeyC("4", color = MUTED),
                    top = KeyC("5", color = MUTED),
                    topRight = KeyC("6", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottomRight = KeyC("u"),
                    topLeft = KeyC("7", color = MUTED),
                    top = KeyC("8", color = MUTED),
                    topRight = KeyC("9", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottomLeft = KeyC("p"),
                    topLeft = KeyC("/", color = MUTED),
                    top = KeyC("*", color = MUTED),
                    topRight = KeyC("-", color = MUTED),
                    right = KeyC("+", color = MUTED),
                    bottomRight = KeyC("=", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topRight = KeyC("d"),
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
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("@", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("f"),
                    bottomRight = KeyC("#", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottom = KeyC("€", color = MUTED),
                ),
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("g"),
                    topRight = KeyC("j"),
                    bottomRight = KeyC("'", color = MUTED),
                    bottomLeft = KeyC("|", color = MUTED),
                    bottom = KeyC("~", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("k"),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    bottomLeft = KeyC("\"", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topRight = KeyC("z"),
                    bottomRight = KeyC("x"),
                    topLeft = KeyC("<", color = MUTED),
                    bottomLeft = KeyC("^", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("b", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topRight = KeyC("v"),
                    topLeft = KeyC("`", color = MUTED),
                    bottomLeft = KeyC("_", color = MUTED),
                    bottomRight = KeyC("&", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC(".", color = MUTED),
                    left = KeyC(",", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    top = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    swipeType = EIGHT_WAY,
                    left = KeyC("?", color = MUTED),
                    topRight = KeyC(">", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    top = KeyC(";", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                ),
            ),
            listOf(
                EMOJI_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_TYPESPLIT_PROGRAMMING_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottomLeft = KeyC("Q"),
                    bottomRight = KeyC("W"),
                    left = KeyC("0", color = MUTED),
                    topLeft = KeyC("1", color = MUTED),
                    top = KeyC("2", color = MUTED),
                    topRight = KeyC("3", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottomLeft = KeyC("R"),
                    bottomRight = KeyC("Y"),
                    topLeft = KeyC("4", color = MUTED),
                    top = KeyC("5", color = MUTED),
                    topRight = KeyC("6", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottomRight = KeyC("U"),
                    topLeft = KeyC("7", color = MUTED),
                    top = KeyC("8", color = MUTED),
                    topRight = KeyC("9", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottomLeft = KeyC("P"),
                    topLeft = KeyC("/", color = MUTED),
                    top = KeyC("*", color = MUTED),
                    topRight = KeyC("-", color = MUTED),
                    right = KeyC("+", color = MUTED),
                    bottomRight = KeyC("=", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topRight = KeyC("D"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
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
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("@", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("F"),
                    bottomRight = KeyC("#", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottom = KeyC("€", color = MUTED),
                ),
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("G"),
                    topRight = KeyC("J"),
                    bottomRight = KeyC("'", color = MUTED),
                    bottomLeft = KeyC("|", color = MUTED),
                    bottom = KeyC("~", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("K"),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    bottomLeft = KeyC("\"", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topRight = KeyC("Z"),
                    bottomRight = KeyC("X"),
                    topLeft = KeyC("<", color = MUTED),
                    bottomLeft = KeyC("^", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("B", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topRight = KeyC("V"),
                    topLeft = KeyC("`", color = MUTED),
                    bottomLeft = KeyC("_", color = MUTED),
                    bottomRight = KeyC("&", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC(".", color = MUTED),
                    left = KeyC(",", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    top = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    swipeType = EIGHT_WAY,
                    left = KeyC("?", color = MUTED),
                    topRight = KeyC(">", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    top = KeyC(";", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                ),
            ),
            listOf(
                EMOJI_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_TYPESPLIT_PROGRAMMING_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("/"),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("*"),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("-"),
                ),
                ABC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("\u0301", displayText = "◌́", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("/"),
                    top = KeyC("*"),
                    topRight = KeyC("-"),
                    right = KeyC("+"),
                    bottomRight = KeyC("="),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("{"),
                    left = KeyC("("),
                    bottomLeft = KeyC("["),
                    bottomRight = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottomLeft = KeyC("$"),
                    bottom = KeyC("€"),
                    bottomRight = KeyC("#"),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("+"),
                    bottomRight = KeyC("'"),
                    bottomLeft = KeyC("|"),
                    bottom = KeyC("~"),
                ),
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("\u0308", displayText = "◌̈", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topRight = KeyC("}"),
                    right = KeyC(")"),
                    bottomRight = KeyC("]"),
                    bottomLeft = KeyC("\""),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("<"),
                    bottomLeft = KeyC("^"),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("`"),
                    bottomRight = KeyC("&"),
                    bottomLeft = KeyC("_"),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("."),
                    left = KeyC(","),
                    right = KeyC("!"),
                    top = KeyC("%"),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("\u0300", displayText = "◌̀", size = LARGE),
                    swipeType = EIGHT_WAY,
                    left = KeyC("?"),
                    topRight = KeyC(">"),
                    bottom = KeyC(":"),
                    top = KeyC(";"),
                    bottomRight = KeyC("\\"),
                ),
            ),
            listOf(
                EMOJI_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_TYPESPLIT_PROGRAMMING: KeyboardDefinition =
    KeyboardDefinition(
        title = "english type-split programming",
        locales = listOf("en"),
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_TYPESPLIT_PROGRAMMING_MAIN,
                shifted = KB_EN_TYPESPLIT_PROGRAMMING_SHIFTED,
                numeric = KB_EN_TYPESPLIT_PROGRAMMING_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
