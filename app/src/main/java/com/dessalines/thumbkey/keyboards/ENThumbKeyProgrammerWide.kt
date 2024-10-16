@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

// uses programming layout but moves spacebar to the left column in order to make a more aspect ration friendly layout. this grid is 5x3 which is closer to the average phone aspect ration of 16:9 than 4x4 keyboard.
val KB_EN_THUMBKEY_PROGRAMMING_WIDE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottomRight = KeyC("w"),
                    bottomLeft = KeyC("(", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("\\", color = MUTED),
                    topRight = KeyC("/", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    bottom = KeyC("g"),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC(">", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    bottomLeft = KeyC("u"),
                    bottomRight = KeyC(")", color = MUTED),
                    topLeft = KeyC("=", color = MUTED),
                    topRight = KeyC("+", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ALL_SYMBOLS,
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("m"),
                    left = KeyC("@", color = MUTED),
                    top = KeyC("$", color = MUTED),
                    bottom = KeyC("&", color = MUTED),
                    bottomLeft = KeyC("|", color = MUTED),
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
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = CommitText("\t"),
                            color = MUTED,
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("c"),
                    bottom = KeyC(",", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("f"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("d"),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_PROGRAMMING_WIDE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottomRight = KeyC("W"),
                    bottomLeft = KeyC("(", color = MUTED),
                    topLeft = KeyC("~", color = MUTED),
                    top = KeyC("\\", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    bottom = KeyC("G"),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC(">", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    bottomLeft = KeyC("U"),
                    bottomRight = KeyC(")", color = MUTED),
                    topLeft = KeyC("=", color = MUTED),
                    topRight = KeyC("+", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ALL_SYMBOLS,
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("M"),
                    left = KeyC("#", color = MUTED),
                    top = KeyC("€", color = MUTED),
                    bottom = KeyC("&", color = MUTED),
                    bottomLeft = KeyC("|", color = MUTED),
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
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = CommitText("\t"),
                            color = MUTED,
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("C"),
                    bottom = KeyC(",", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("https://", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("F"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC("_"),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("D"),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    right = KeyC(".com", color = MUTED, size = SMALLEST),
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )
val NUMERIC_KEYBOARD_WIDE =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    bottomLeft = KeyC("$"),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    topLeft = KeyC("`"),
                    top = KeyC("^"),
                    topRight = KeyC("´"),
                    right = KeyC("!"),
                    bottomRight = KeyC("\\"),
                    bottomLeft = KeyC("/"),
                    left = KeyC("+"),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    left = KeyC("?"),
                    bottomRight = KeyC("€"),
                    bottomLeft = KeyC("£"),
                    bottom = KeyC("="),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ALL_SYMBOLS,
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    topLeft = KeyC("{"),
                    topRight = KeyC("%"),
                    bottomRight = KeyC("_"),
                    bottomLeft = KeyC("["),
                    left = KeyC("("),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    topLeft = KeyC("|"),
                    topRight = KeyC("}"),
                    right = KeyC(")"),
                    bottomRight = KeyC("]"),
                    bottomLeft = KeyC("@"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    topLeft = KeyC("~"),
                    bottomRight = KeyC(":"),
                    bottomLeft = KeyC("<"),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    topLeft = KeyC("\""),
                    topRight = KeyC("'"),
                    bottomRight = KeyC("-"),
                    bottom = KeyC("."),
                    bottomLeft = KeyC("*"),
                    left = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    top = KeyC("&"),
                    topRight = KeyC("°"),
                    bottomRight = KeyC(">"),
                    bottomLeft = KeyC(";"),
                    left = KeyC("#"),
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_PROGRAMMING_WIDE: KeyboardDefinition =
    KeyboardDefinition(
        title = "english thumb-key programming wide",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_PROGRAMMING_WIDE_MAIN,
                shifted = KB_EN_THUMBKEY_PROGRAMMING_WIDE_SHIFTED,
                numeric = NUMERIC_KEYBOARD_WIDE,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
