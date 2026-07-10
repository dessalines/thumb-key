@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

// Adds common English words to main screen to reduce amount of taps required when typing
val KB_EN_THUMBKEY_WORDS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottomRight = KeyC("w"),
                    topRight = KeyC("make", color = MUTED, size = SMALLEST),
                    right = KeyC("will", color = MUTED, size = SMALLEST),
                    bottom = KeyC("what", color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    bottom = KeyC("g"),
                    topLeft = KeyC("when", color = MUTED, size = SMALLEST),
                    left = KeyC("which", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("with", color = MUTED, size = SMALLEST),
                    topRight = KeyC("just", color = MUTED, size = SMALLEST),
                    right = KeyC("from", color = MUTED, size = SMALLEST),
                    bottomRight = KeyC("be", color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    bottomLeft = KeyC("u"),
                    topLeft = KeyC("ould", color = MUTED, size = SMALLEST),
                    top = KeyC("'ll", color = MUTED, size = SMALLEST),
                    topRight = KeyC("'re", color = MUTED, size = SMALLEST),
                    right = KeyC("about", color = MUTED, size = SMALLEST),
                    bottomRight = KeyC("n't", color = MUTED, size = SMALLEST),
                    bottom = KeyC("'t", color = MUTED, size = SMALLEST),
                    left = KeyC("'s", color = MUTED, size = SMALLEST),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("m"),
                    top = KeyC("like", color = MUTED, size = SMALLEST),
                    topRight = KeyC("not", color = MUTED, size = SMALLEST),
                    bottomRight = KeyC("and", color = MUTED, size = SMALLEST),
                    bottom = KeyC("know", color = MUTED, size = SMALLEST),
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
                    swipeType = FOUR_WAY_CROSS,
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
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("c"),
                    top = KeyC("have", color = MUTED, size = SMALLEST),
                    right = KeyC("can", color = MUTED, size = SMALLEST),
                    bottomRight = KeyC("but", color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("f"),
                    right = KeyC("z"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    topLeft = KeyC("this", color = MUTED, size = SMALLEST),
                    topRight = KeyC("that", color = MUTED, size = SMALLEST),
                    left = KeyC("I'm", color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("d"),
                    top = KeyC("the", color = MUTED, size = SMALLEST),
                    topRight = KeyC("for", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("do", color = MUTED, size = SMALLEST),
                    left = KeyC("you", color = MUTED, size = SMALLEST),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_WORDS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottomRight = KeyC("W"),
                    topRight = KeyC("Make", capsModeDisplay = KeyDisplay.TextDisplay("MAKE"), color = MUTED, size = SMALLEST),
                    right = KeyC("Will", capsModeDisplay = KeyDisplay.TextDisplay("WILL"), color = MUTED, size = SMALLEST),
                    bottom = KeyC("What", capsModeDisplay = KeyDisplay.TextDisplay("WHAT"), color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    bottom = KeyC("G"),
                    topLeft = KeyC("When", capsModeDisplay = KeyDisplay.TextDisplay("WHEN"), color = MUTED, size = SMALLEST),
                    left = KeyC("Which", capsModeDisplay = KeyDisplay.TextDisplay("WHICH"), color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("With", capsModeDisplay = KeyDisplay.TextDisplay("WITH"), color = MUTED, size = SMALLEST),
                    topRight = KeyC("Just", capsModeDisplay = KeyDisplay.TextDisplay("JUST"), color = MUTED, size = SMALLEST),
                    right = KeyC("From", capsModeDisplay = KeyDisplay.TextDisplay("FROM"), color = MUTED, size = SMALLEST),
                    bottomRight = KeyC("Be", capsModeDisplay = KeyDisplay.TextDisplay("BE"), color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    bottomLeft = KeyC("U"),
                    topLeft = KeyC("ould", color = MUTED, size = SMALLEST),
                    top = KeyC("'ll", color = MUTED, size = SMALLEST),
                    topRight = KeyC("'re", color = MUTED, size = SMALLEST),
                    right = KeyC("About", capsModeDisplay = KeyDisplay.TextDisplay("ABOUT"), color = MUTED, size = SMALLEST),
                    bottomRight = KeyC("n't", color = MUTED, size = SMALLEST),
                    bottom = KeyC("'t", color = MUTED, size = SMALLEST),
                    left = KeyC("'s", color = MUTED, size = SMALLEST),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("M"),
                    top = KeyC("Like", capsModeDisplay = KeyDisplay.TextDisplay("LIKE"), color = MUTED, size = SMALLEST),
                    topRight = KeyC("Not", capsModeDisplay = KeyDisplay.TextDisplay("NOT"), color = MUTED, size = SMALLEST),
                    bottomRight = KeyC("And", capsModeDisplay = KeyDisplay.TextDisplay("AND"), color = MUTED, size = SMALLEST),
                    bottom = KeyC("Know", capsModeDisplay = KeyDisplay.TextDisplay("KNOW"), color = MUTED, size = SMALLEST),
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
                    swipeType = FOUR_WAY_CROSS,
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
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("C"),
                    top = KeyC("Have", capsModeDisplay = KeyDisplay.TextDisplay("HAVE"), color = MUTED, size = SMALLEST),
                    right = KeyC("Can", capsModeDisplay = KeyDisplay.TextDisplay("CAN"), color = MUTED, size = SMALLEST),
                    bottomRight = KeyC("But", capsModeDisplay = KeyDisplay.TextDisplay("BUT"), color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("F"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    topLeft = KeyC("This", capsModeDisplay = KeyDisplay.TextDisplay("THIS"), color = MUTED, size = SMALLEST),
                    left = KeyC("I'm", color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("D"),
                    top = KeyC("The", capsModeDisplay = KeyDisplay.TextDisplay("THE"), color = MUTED, size = SMALLEST),
                    topRight = KeyC("For", capsModeDisplay = KeyDisplay.TextDisplay("FOR"), color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("Do", capsModeDisplay = KeyDisplay.TextDisplay("DO"), color = MUTED, size = SMALLEST),
                    left = KeyC("You", capsModeDisplay = KeyDisplay.TextDisplay("YOU"), color = MUTED, size = SMALLEST),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_WORDS: KeyboardDefinition =
    KeyboardDefinition(
        title = "english thumb-key words",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_WORDS_MAIN,
                shifted = KB_EN_THUMBKEY_WORDS_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe, ::autoCapitalizeIApostropheLL),
            ),
    )
