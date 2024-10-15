package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardCapslock
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.KeyboardDefinitionSettings
import com.dessalines.thumbkey.utils.SwipeNWay
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe

// Adds common English words to main screen to reduce amount of taps required when typing
val KB_EN_THUMBKEY_WORDS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("w"),
                    topRight = KeyC("make", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    right = KeyC("will", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottom = KeyC("what", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    bottom = KeyC("g"),
                    topLeft = KeyC("when", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    left = KeyC("which", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottomLeft = KeyC("with", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    topRight = KeyC("just", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    right = KeyC("from", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottomRight = KeyC("be", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("u"),
                    topLeft = KeyC("ould", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    top = KeyC("'ll", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    topRight = KeyC("'re", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    right = KeyC("about", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottomRight = KeyC("n't", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottom = KeyC("'t", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    left = KeyC("'s", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    right = KeyC("m"),
                    top = KeyC("like", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    topRight = KeyC("not", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottomRight = KeyC("and", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottom = KeyC("know", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("h", size = FontSizeVariant.LARGE),
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
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC("l"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    topRight = KeyC("c"),
                    top = KeyC("have", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    right = KeyC("can", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottomRight = KeyC("but", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    top = KeyC("f"),
                    right = KeyC("z"),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    topLeft = KeyC("this", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    topRight = KeyC("that", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    left = KeyC("I'm", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("d"),
                    top = KeyC("the", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    topRight = KeyC("for", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottomLeft = KeyC("do", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    left = KeyC("you", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
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
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("W"),
                    topRight = KeyC("Make", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    right = KeyC("Will", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottom = KeyC("What", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    bottom = KeyC("G"),
                    topLeft = KeyC("When", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    left = KeyC("Which", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottomLeft = KeyC("With", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    topRight = KeyC("Just", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    right = KeyC("From", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottomRight = KeyC("Be", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("U"),
                    topLeft = KeyC("ould", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    top = KeyC("'ll", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    topRight = KeyC("'re", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    right = KeyC("About", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottomRight = KeyC("n't", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottom = KeyC("'t", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    left = KeyC("'s", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    right = KeyC("M"),
                    top = KeyC("Like", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    topRight = KeyC("Not", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottomRight = KeyC("And", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottom = KeyC("Know", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("H", size = FontSizeVariant.LARGE),
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
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC("L"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    topRight = KeyC("C"),
                    top = KeyC("Have", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    right = KeyC("Can", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottomRight = KeyC("But", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    top = KeyC("F"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    topLeft = KeyC("This", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    left = KeyC("I'm", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("D"),
                    top = KeyC("The", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    topRight = KeyC("For", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottomLeft = KeyC("Do", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    left = KeyC("You", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
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
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
