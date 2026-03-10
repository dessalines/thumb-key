@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_DE_THUMBKEY_MULTILINGUAL_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topLeft = KeyC("@", color = MUTED),
                    topRight = KeyC("#", color = MUTED),
                    right = KeyC("ç", color = MUTED),
                    bottom = KeyC("…", color = MUTED),
                    bottomRight = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    bottom = KeyC("f"),
                    bottomRight = KeyC("l"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    bottomLeft = KeyC("ä"),
                    bottomRight = KeyC("â", color = MUTED),
                    bottom = KeyC("à", color = MUTED),
                    left = KeyC("å", color = MUTED),
                    right = KeyC("æ", color = MUTED),
                    topLeft = KeyC("€", color = MUTED),
                    top = KeyC("|", color = MUTED),
                    topRight = KeyC("&", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    right = KeyC("m"),
                    bottomLeft = KeyC("ó", color = MUTED),
                    bottomRight = KeyC("ø", color = MUTED),
                    left = KeyC("ò", color = MUTED),
                    topLeft = KeyC("ö"),
                    top = KeyC("ô", color = MUTED),
                    topRight = KeyC("o"),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    topLeft = KeyC("j"),
                    top = KeyC("q"),
                    topRight = KeyC("z"),
                    right = KeyC("k"),
                    bottomRight = KeyC("w"),
                    bottom = KeyC("x"),
                    bottomLeft = KeyC("v"),
                    left = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    bottom = KeyC("ï", color = MUTED),
                    right = KeyC("ì", color = MUTED),
                    bottomRight = KeyC("î", color = MUTED),
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
                    center = KeyC("n", size = LARGE),
                    right = KeyC("g"),
                    topRight = KeyC("u"),
                    top = KeyC("û", color = MUTED),
                    topLeft = KeyC("ü"),
                    left = KeyC("ù", color = MUTED),
                    bottomLeft = KeyC("(", color = MUTED),
                    bottom = KeyC("!", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    top = KeyC("b"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("y"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("ß"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    left = KeyC("œ", color = MUTED),
                    topLeft = KeyC("ë", color = MUTED),
                    top = KeyC("ê", color = MUTED),
                    topRight = KeyC("è", color = MUTED),
                    right = KeyC("é", color = MUTED),
                    bottomRight = KeyC(")", color = MUTED),
                    bottom = KeyC("~", color = MUTED),
                    bottomLeft = KeyC("?", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DE_THUMBKEY_MULTILINGUAL_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topLeft = KeyC("@", color = MUTED),
                    topRight = KeyC("#", color = MUTED),
                    right = KeyC("Ç", color = MUTED),
                    bottom = KeyC("…", color = MUTED),
                    bottomRight = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    bottom = KeyC("F"),
                    bottomRight = KeyC("L"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    bottomLeft = KeyC("Ä"),
                    bottomRight = KeyC("Â", color = MUTED),
                    bottom = KeyC("À", color = MUTED),
                    left = KeyC("Å", color = MUTED),
                    right = KeyC("Æ", color = MUTED),
                    topLeft = KeyC("€", color = MUTED),
                    top = KeyC("|", color = MUTED),
                    topRight = KeyC("&", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    right = KeyC("M"),
                    bottomLeft = KeyC("Ó", color = MUTED),
                    bottomRight = KeyC("Ø", color = MUTED),
                    left = KeyC("Ò", color = MUTED),
                    topLeft = KeyC("Ö"),
                    top = KeyC("Ô", color = MUTED),
                    topRight = KeyC("O"),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    topLeft = KeyC("J"),
                    top = KeyC("Q"),
                    topRight = KeyC("Z"),
                    right = KeyC("K"),
                    bottomRight = KeyC("W"),
                    bottom = KeyC("X"),
                    bottomLeft = KeyC("V"),
                    left = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    bottomLeft = KeyC("Ï", color = MUTED),
                    right = KeyC("Ì", color = MUTED),
                    bottomRight = KeyC("Î", color = MUTED),
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
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("G"),
                    topRight = KeyC("U"),
                    top = KeyC("Û", color = MUTED),
                    topLeft = KeyC("Ü"),
                    left = KeyC("Ù", color = MUTED),
                    bottomLeft = KeyC("(", color = MUTED),
                    bottom = KeyC("!", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    top = KeyC("B"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Y"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("ẞ"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    left = KeyC("Œ", color = MUTED),
                    topLeft = KeyC("Ë", color = MUTED),
                    top = KeyC("Ê", color = MUTED),
                    topRight = KeyC("È", color = MUTED),
                    right = KeyC("É", color = MUTED),
                    bottomRight = KeyC(")", color = MUTED),
                    bottom = KeyC("~", color = MUTED),
                    bottomLeft = KeyC("?", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

// TODO this needs fixing, which languages are here?
val KB_DE_THUMBKEY_MULTILINGUAL: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch multilingual thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_THUMBKEY_MULTILINGUAL_MAIN,
                shifted = KB_DE_THUMBKEY_MULTILINGUAL_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
