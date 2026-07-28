@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_THUMBKEY_WORDS_SHIFT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    left = KeyC("why", size = SMALLEST, color = MUTED),
                    topLeft = KeyC("about", size = SMALLEST, color = MUTED),
                    top = KeyC("/", size = SMALLEST, color = MUTED),
                    topRight = KeyC("make", size = SMALLEST, color = MUTED),
                    right = KeyC("will", size = SMALLEST, color = MUTED),
                    bottom = KeyC("what", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("go", color = MUTED),
                    bottomRight = KeyC("w"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    top = KeyC("(", size = SMALLEST, color = MUTED),
                    topRight = KeyC("just", size = SMALLEST, color = MUTED),
                    topLeft = KeyC("when", size = SMALLEST, color = MUTED),
                    left = KeyC("which", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("with", size = SMALLEST, color = MUTED),
                    bottomRight = KeyC("be", size = SMALLEST, color = MUTED),
                    right = KeyC("from", size = SMALLEST, color = MUTED),
                    bottom = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topRight = KeyC("'re", size = SMALLEST, color = MUTED),
                    top = KeyC("'ll", size = SMALLEST, color = MUTED),
                    topLeft = KeyC("'d", size = SMALLEST, color = MUTED),
                    left = KeyC("'s", size = SMALLEST, color = MUTED),
                    bottom = KeyC("'t", size = SMALLEST, color = MUTED),
                    bottomRight = KeyC("n't", size = SMALLEST, color = MUTED),
                    right = KeyC("'ve", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("u"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    topLeft = KeyC("my", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("we", size = SMALLEST, color = MUTED),
                    left = KeyC("ould", size = SMALLEST, color = MUTED),
                    top = KeyC("like", size = SMALLEST, color = MUTED),
                    topRight = KeyC("not", size = SMALLEST, color = MUTED),
                    bottomRight = KeyC("and", size = SMALLEST, color = MUTED),
                    bottom = KeyC("know", size = SMALLEST, color = MUTED),
                    right = KeyC("m"),
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
                    topLeft = KeyC("*", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("-", size = SMALLEST, color = MUTED),
                    bottomRight = KeyC("@", size = SMALLEST, color = MUTED),
                    topRight = KeyC("\"", size = SMALLEST, color = MUTED),
                    right = KeyC("ing", size = SMALLEST, color = MUTED),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom = KeyC(",", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    top = KeyC("have", size = SMALLEST, color = MUTED),
                    topLeft = KeyC("how", size = SMALLEST, color = MUTED),
                    left = KeyC("was", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("are", size = SMALLEST, color = MUTED),
                    bottom = KeyC("want", size = SMALLEST, color = MUTED),
                    bottomRight = KeyC("but", size = SMALLEST, color = MUTED),
                    right = KeyC("can", size = SMALLEST, color = MUTED),
                    topRight = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("f"),
                    topRight = KeyC("that", size = SMALLEST, color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC("?", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("!", color = MUTED),
                    left = KeyC("I'm", size = SMALLEST, color = MUTED),
                    topLeft = KeyC("this", size = SMALLEST, color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("the", size = SMALLEST, color = MUTED),
                    topRight = KeyC("for", size = SMALLEST, color = MUTED),
                    right = KeyC("to", size = SMALLEST, color = MUTED),
                    bottomRight = KeyC("it", size = SMALLEST, color = MUTED),
                    bottom = KeyC("is", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("do", size = SMALLEST, color = MUTED),
                    left = KeyC("you", size = SMALLEST, color = MUTED),
                    topLeft = KeyC("d"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_WORDS_SHIFT_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topRight = KeyC("Make", size = SMALLEST, color = MUTED),
                    right = KeyC("Will", size = SMALLEST, color = MUTED),
                    top = KeyC("•", size = SMALLEST, color = MUTED),
                    bottom = KeyC("What", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("Go", size = SMALLEST, color = MUTED),
                    left = KeyC("Why", size = SMALLEST, color = MUTED),
                    topLeft = KeyC("About", size = SMALLEST, color = MUTED),
                    bottomRight = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    topRight = KeyC("Just", size = SMALLEST, color = MUTED),
                    top = KeyC(")", size = SMALLEST, color = MUTED),
                    topLeft = KeyC("When", size = SMALLEST, color = MUTED),
                    left = KeyC("Which", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("With", size = SMALLEST, color = MUTED),
                    bottomRight = KeyC("Be", size = SMALLEST, color = MUTED),
                    right = KeyC("From", size = SMALLEST, color = MUTED),
                    bottom = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topRight = KeyC("'re", size = SMALLEST, color = MUTED),
                    top = KeyC("'ll", size = SMALLEST, color = MUTED),
                    topLeft = KeyC("'d", size = SMALLEST, color = MUTED),
                    left = KeyC("'s", size = SMALLEST, color = MUTED),
                    bottom = KeyC("'t", size = SMALLEST, color = MUTED),
                    bottomRight = KeyC("n't", size = SMALLEST, color = MUTED),
                    right = KeyC("'ve", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("U"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    left = KeyC("ould", size = SMALLEST, color = MUTED),
                    topLeft = KeyC("My", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("We", size = SMALLEST, color = MUTED),
                    top = KeyC("Like", size = SMALLEST, color = MUTED),
                    topRight = KeyC("Not", size = SMALLEST, color = MUTED),
                    bottomRight = KeyC("And", size = SMALLEST, color = MUTED),
                    bottom = KeyC("Know", size = SMALLEST, color = MUTED),
                    right = KeyC("M"),
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
                    right = KeyC("ing", size = SMALLEST, color = MUTED),
                    topRight = KeyC(":", size = SMALLEST, color = MUTED),
                    bottomRight = KeyC("#", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("_", size = SMALLEST, color = MUTED),
                    topLeft = KeyC("&", size = SMALLEST, color = MUTED),
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
                    top = KeyC("Have", size = SMALLEST, color = MUTED),
                    topLeft = KeyC("How", size = SMALLEST, color = MUTED),
                    left = KeyC("Was", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("Are", size = SMALLEST, color = MUTED),
                    bottomRight = KeyC("But", size = SMALLEST, color = MUTED),
                    bottom = KeyC("Want", size = SMALLEST, color = MUTED),
                    right = KeyC("Can", size = SMALLEST, color = MUTED),
                    topRight = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("F"),
                    topRight = KeyC("That", size = SMALLEST, color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC("?", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    topLeft = KeyC("This", size = SMALLEST, color = MUTED),
                    left = KeyC("I'm", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("The", size = SMALLEST, color = MUTED),
                    topRight = KeyC("For", size = SMALLEST, color = MUTED),
                    right = KeyC("To", size = SMALLEST, color = MUTED),
                    bottomRight = KeyC("It", size = SMALLEST, color = MUTED),
                    bottom = KeyC("Is", size = SMALLEST, color = MUTED),
                    bottomLeft = KeyC("Do", size = SMALLEST, color = MUTED),
                    left = KeyC("You", size = SMALLEST, color = MUTED),
                    topLeft = KeyC("D"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_WORDS_SHIFT: KeyboardDefinition =
    KeyboardDefinition(
        title = "english thumb-key words shift",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_WORDS_SHIFT_MAIN,
                shifted = KB_EN_THUMBKEY_WORDS_SHIFT_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
