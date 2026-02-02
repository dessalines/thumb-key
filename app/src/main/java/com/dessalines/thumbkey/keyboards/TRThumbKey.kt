@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_TR_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ö", size = LARGE),
                    left = KeyC("o"),
                    bottom = KeyC("q"),
                    bottomRight = KeyC("p"),
                    bottomLeft = KeyC("(", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("\\", color = MUTED),
                    topRight = KeyC("/", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("g", size = LARGE),
                    bottom = KeyC("ğ"),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC(">", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("n"),
                    bottomRight = KeyC(")", color = MUTED),
                    topLeft = KeyC("=", color = MUTED),
                    topRight = KeyC("+", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("y", size = LARGE),
                    topRight = KeyC("w"),
                    right = KeyC("v"),
                    bottomRight = KeyC("z"),
                    left = KeyC("@", color = MUTED),
                    top = KeyC("$", color = MUTED),
                    bottom = KeyC("&", color = MUTED),
                    bottomLeft = KeyC("|", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    topLeft = KeyC("f"),
                    left = KeyC("d"),
                    bottomLeft = KeyC("c"),
                    topRight = KeyC("h"),
                    right = KeyC("e"),
                    bottomRight = KeyC("ç"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    topLeft = KeyC("s"),
                    left = KeyC("ş"),
                    bottomLeft = KeyC("t"),
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
                    center = KeyC("a", size = LARGE),
                    topRight = KeyC("b"),
                    bottom = KeyC(",", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("k", size = LARGE),
                    top = KeyC("j"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("x"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    topLeft = KeyC("ü"),
                    top = KeyC("u"),
                    left = KeyC("ı"),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_TR_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("Ö", size = LARGE),
                    left = KeyC("O"),
                    bottom = KeyC("Q"),
                    bottomRight = KeyC("P"),
                    bottomLeft = KeyC("(", color = MUTED),
                    topLeft = KeyC("~", color = MUTED),
                    top = KeyC("\\", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("G", size = LARGE),
                    bottom = KeyC("Ğ"),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC(">", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("N"),
                    bottomRight = KeyC(")", color = MUTED),
                    topLeft = KeyC("=", color = MUTED),
                    topRight = KeyC("+", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Y", size = LARGE),
                    topRight = KeyC("W"),
                    right = KeyC("V"),
                    bottomRight = KeyC("Z"),
                    left = KeyC("#", color = MUTED),
                    top = KeyC("€", color = MUTED),
                    bottom = KeyC("&", color = MUTED),
                    bottomLeft = KeyC("|", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    topLeft = KeyC("F"),
                    left = KeyC("D"),
                    bottomLeft = KeyC("C"),
                    topRight = KeyC("H"),
                    right = KeyC("E"),
                    bottomRight = KeyC("Ç"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    topLeft = KeyC("S"),
                    left = KeyC("Ş"),
                    bottomLeft = KeyC("T"),
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
                    center = KeyC("A", size = LARGE),
                    topRight = KeyC("B"),
                    bottom = KeyC(",", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("https://", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("K", size = LARGE),
                    top = KeyC("J"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("X"),
                    bottomRight = KeyC("_"),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("İ", size = LARGE),
                    topLeft = KeyC("Ü"),
                    top = KeyC("U"),
                    left = KeyC("I"),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    right = KeyC(".com", color = MUTED, size = SMALLEST),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_TR_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "türkçe thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_TR_THUMBKEY_MAIN,
                shifted = KB_TR_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        locales = listOf("tr"),
    )
