@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

// Adds common English words to main screen to reduce amount of taps required when typing, while preserving common punctuation and symbols that aren't displaced by words. Also mirror sidebar to avoid accidental back swipes on left hand
val KB_EN_THUMBKEY_WORDS_SYMBOLS_DUAL_MAIN =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottomRight = KeyC("w"),
                    topRight = KeyC("make", color = MUTED, size = SMALLEST),
                    right = KeyC("will", color = MUTED, size = SMALLEST),
                    bottom = KeyC("what", color = MUTED, size = SMALLEST),
                    left = KeyC("'s", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    bottom = KeyC("g"),
                    top = KeyC("ing", color = MUTED, size = SMALLEST),
                    topLeft = KeyC("when", color = MUTED, size = SMALLEST),
                    left = KeyC("which", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("with", color = MUTED, size = SMALLEST),
                    topRight = KeyC("just", color = MUTED, size = SMALLEST),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("be", color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    bottomLeft = KeyC("u"),
                    topLeft = KeyC("ould", color = MUTED, size = SMALLEST),
                    top = KeyC("'ll", color = MUTED),
                    topRight = KeyC("'re", color = MUTED),
                    right = KeyC("about", color = MUTED, size = SMALLEST),
                    bottomRight = KeyC("n't", color = MUTED),
                    bottom = KeyC("'t", color = MUTED),
                    left = KeyC("?", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("m"),
                    topLeft = KeyC("{", color = MUTED),
                    top = KeyC("like", color = MUTED, size = SMALLEST),
                    topRight = KeyC("not", color = MUTED, size = SMALLEST),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom = KeyC("know", color = MUTED, size = SMALLEST),
                    bottomRight = KeyC("and", color = MUTED, size = SMALLEST),
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
                    bottomLeft = KeyC("@", color = MUTED),
                    left = KeyC("l"),
                    topLeft = KeyC("/", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
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
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("c"),
                    top = KeyC("have", color = MUTED, size = SMALLEST),
                    right = KeyC("can", color = MUTED, size = SMALLEST),
                    bottomRight = KeyC("but", color = MUTED, size = SMALLEST),
                    topLeft = KeyC("this", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("that", color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("f"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC("I'm", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("d"),
                    top = KeyC("the", color = MUTED, size = SMALLEST),
                    topRight = KeyC("for", color = MUTED, size = SMALLEST),
                    right = KeyC("from", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("do", color = MUTED, size = SMALLEST),
                    left = KeyC("you", color = MUTED, size = SMALLEST),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                RETURN_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_WORDS_SYMBOLS_DUAL_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottomRight = KeyC("W"),
                    topRight = KeyC("Make", color = MUTED, size = SMALLEST),
                    right = KeyC("Will", color = MUTED, size = SMALLEST),
                    bottom = KeyC("What", color = MUTED, size = SMALLEST),
                    left = KeyC("'s", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    bottom = KeyC("G"),
                    top = KeyC("ing", color = MUTED, size = SMALLEST),
                    topLeft = KeyC("When", color = MUTED, size = SMALLEST),
                    left = KeyC("Which", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("With", color = MUTED, size = SMALLEST),
                    topRight = KeyC("Just", color = MUTED, size = SMALLEST),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("Be", color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    bottomLeft = KeyC("U"),
                    topLeft = KeyC("ould", color = MUTED, size = SMALLEST),
                    top = KeyC("'ll", color = MUTED),
                    topRight = KeyC("'re", color = MUTED),
                    right = KeyC("About", color = MUTED, size = SMALLEST),
                    bottomRight = KeyC("n't", color = MUTED),
                    bottom = KeyC("'t", color = MUTED),
                    left = KeyC("?", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("M"),
                    topLeft = KeyC("{", color = MUTED),
                    top = KeyC("Like", color = MUTED, size = SMALLEST),
                    topRight = KeyC("Not", color = MUTED, size = SMALLEST),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottom = KeyC("Know", color = MUTED, size = SMALLEST),
                    bottomRight = KeyC("And", color = MUTED, size = SMALLEST),
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
                    bottomLeft = KeyC("@", color = MUTED),
                    left = KeyC("L"),
                    topLeft = KeyC("/", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
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
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("C"),
                    top = KeyC("Have", color = MUTED, size = SMALLEST),
                    right = KeyC("Can", color = MUTED, size = SMALLEST),
                    bottomRight = KeyC("But", color = MUTED, size = SMALLEST),
                    topLeft = KeyC("This", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("That", color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("F"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC("I'm", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("D"),
                    top = KeyC("The", color = MUTED, size = SMALLEST),
                    topRight = KeyC("For", color = MUTED, size = SMALLEST),
                    right = KeyC("From", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("Do", color = MUTED, size = SMALLEST),
                    left = KeyC("You", color = MUTED, size = SMALLEST),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                RETURN_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_WORDS_SYMBOLS_DUAL: KeyboardDefinition =
    KeyboardDefinition(
        title = "english thumb-key words symbols dual",
        locales = listOf("en"),
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_WORDS_SYMBOLS_DUAL_MAIN,
                shifted = KB_EN_THUMBKEY_WORDS_SYMBOLS_DUAL_SHIFTED,
                numeric = NUMERIC_KEYBOARD_DUAL,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe, ::autoCapitalizeIApostropheLL),
            ),
    )
