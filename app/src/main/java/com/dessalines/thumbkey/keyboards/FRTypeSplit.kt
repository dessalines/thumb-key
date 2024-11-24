@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_FR_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    right = KeyC("à", color = MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("à"),
                        ),
                    bottom = KeyC("z"),
                    top = KeyC("â", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    right = KeyC("é", color = MUTED),
                    left = KeyC("è", color = MUTED),
                    bottom = KeyC("r"),
                    top = KeyC("ê", color = MUTED),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    right = KeyC("y"),
                    left = KeyC("ù", color = MUTED),
                    bottom = KeyC("u"),
                    top = KeyC("û", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    right = KeyC("ô", color = MUTED),
                    left = KeyC("p"),
                    bottom = KeyC("o"),
                    top = KeyC("î", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottom = KeyC("q"),
                    top = KeyC("œ", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("f"),
                        ),
                    left = KeyC("f"),
                    bottom = KeyC("g"),
                    top = KeyC("ë", color = MUTED),
                ),
                SPACEBAR_FRENCH_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    right = KeyC("j"),
                    left = KeyC("k"),
                    bottom = KeyC("h"),
                    top = KeyC("ü", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    top = KeyC("ï", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    right = KeyC("w"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("w"),
                        ),
                    bottom = KeyC("x"),
                    top = KeyC("ç", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("v", size = LARGE),
                ),
                SPACEBAR_FRENCH_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("b", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("?", color = MUTED),
                    left = KeyC("!", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    top = KeyC(";", color = MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_TYPESPLIT_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    right = KeyC("À", color = MUTED),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("À"),
                        ),
                    bottom = KeyC("Z"),
                    top = KeyC("Â", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    right = KeyC("É", color = MUTED),
                    left = KeyC("È", color = MUTED),
                    bottom = KeyC("R"),
                    top = KeyC("Ê", color = MUTED),
                ),
                EMOJI_KEY_ITEM_ALT,
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    right = KeyC("Y"),
                    left = KeyC("Ù", color = MUTED),
                    bottom = KeyC("U"),
                    top = KeyC("Û", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    right = KeyC("Ô", color = MUTED),
                    left = KeyC("P"),
                    bottom = KeyC("O"),
                    top = KeyC("Î", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottom = KeyC("Q"),
                    top = KeyC("Œ", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("F"),
                        ),
                    left = KeyC("F"),
                    bottom = KeyC("G"),
                    top = KeyC("Ë", color = MUTED),
                ),
                SPACEBAR_FRENCH_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    right = KeyC("J"),
                    left = KeyC("K"),
                    bottom = KeyC("H"),
                    top = KeyC("Ü", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    top = KeyC("Ï", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    right = KeyC("W"),
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("W"),
                        ),
                    bottom = KeyC("X"),
                    top = KeyC("Ç", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("V", size = LARGE),
                ),
                SPACEBAR_FRENCH_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("B", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("?", color = MUTED),
                    left = KeyC("!", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    top = KeyC(";", color = MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_TYPESPLIT: KeyboardDefinition =
    KeyboardDefinition(
        title = "français type-split",
        modes =
            KeyboardDefinitionModes(
                main = KB_FR_TYPESPLIT_MAIN,
                shifted = KB_FR_TYPESPLIT_SHIFTED,
                numeric = FRENCH_TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
