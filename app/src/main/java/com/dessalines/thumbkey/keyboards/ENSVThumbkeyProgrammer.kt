@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

// Adds more punctuation options to the main screen to reduce switches to the numeric keyboard whilst also adding letters å ä ö
// layout based on "english thumb-key programming". Added å ä ö, changed position of some symbols, and made all symbols accessible without shifting
val KB_EN_SV_THUMBKEY_PROGRAMMING_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottomRight = KeyC("w"),
                    bottomLeft = KeyC("(", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    left = KeyC("~", color = MUTED),
                    bottom = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    bottom = KeyC("g"),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    bottomLeft = KeyC("u"),
                    bottomRight = KeyC(")", color = MUTED),
                    topLeft = KeyC("=", color = MUTED),
                    topRight = KeyC("+", color = MUTED),
                    right = KeyC("-", color = MUTED),
                    left = KeyC("å", color = MUTED),
                    top = KeyC("ö", color = MUTED),
                    bottom = KeyC("ä", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("m"),
                    left = KeyC("@", color = MUTED),
                    top = KeyC("$", color = MUTED),
                    bottom = KeyC("&", color = MUTED),
                    bottomLeft = KeyC("|", color = MUTED),
                    topLeft = KeyC("#", color = MUTED),
                    topRight = KeyC("€", color = MUTED),
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
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("c"),
                    bottom = KeyC(",", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("!", color = MUTED),
                    right = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("f"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("z"),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    topLeft = KeyC("_", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("d"),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_PROGRAMMING_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_SV_THUMBKEY_PROGRAMMING_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottomRight = KeyC("W"),
                    bottomLeft = KeyC("(", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    left = KeyC("~", color = MUTED),
                    bottom = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    bottom = KeyC("G"),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    bottomLeft = KeyC("U"),
                    bottomRight = KeyC(")", color = MUTED),
                    topLeft = KeyC("=", color = MUTED),
                    topRight = KeyC("+", color = MUTED),
                    right = KeyC("-", color = MUTED),
                    left = KeyC("Å", color = MUTED),
                    top = KeyC("Ö", color = MUTED),
                    bottom = KeyC("Ä", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("M"),
                    left = KeyC("@", color = MUTED),
                    top = KeyC("$", color = MUTED),
                    bottom = KeyC("&", color = MUTED),
                    bottomLeft = KeyC("|", color = MUTED),
                    topLeft = KeyC("#", color = MUTED),
                    topRight = KeyC("€", color = MUTED),
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
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("C"),
                    bottom = KeyC(",", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("!", color = MUTED),
                    right = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("F"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    topLeft = KeyC("_", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("D"),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_PROGRAMMING_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_SV_THUMBKEY_PROGRAMMING: KeyboardDefinition =
    KeyboardDefinition(
        title = "english svenska thumb-key programming ",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_SV_THUMBKEY_PROGRAMMING_MAIN,
                shifted = KB_EN_SV_THUMBKEY_PROGRAMMING_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
