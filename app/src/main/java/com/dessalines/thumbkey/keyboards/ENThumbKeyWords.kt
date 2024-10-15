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
                    center =
                        KeyC(
                            KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("w"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("make"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("will"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("what"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("g"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("when"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("which"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("with"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("just"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("from"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("be"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("u"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ould"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("'ll"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'re"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("about"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("n't"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("'t"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("'s"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("m"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("like"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("not"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("and"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("know"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("h"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("j"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("q"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("b"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("p"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("y"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("x"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("v"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("k"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            KeyAction.CommitText("l"),
                        ),
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
                    center =
                        KeyC(
                            KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("c"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("have"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("can"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("but"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("f"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("z"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("this"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("that"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("I'm"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("d"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("the"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("for"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("do"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("you"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
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
                    center =
                        KeyC(
                            KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("W"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("Make"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Will"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("What"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("G"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("When"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("Which"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("With"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("Just"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("From"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("Be"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("U"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ould"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("'ll"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'re"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("About"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("n't"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("'t"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("'s"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("M"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Like"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("Not"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("And"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Know"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("H"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("J"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Q"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("B"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("P"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("Y"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("X"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("V"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("K"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            KeyAction.CommitText("L"),
                        ),
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
                    center =
                        KeyC(
                            KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("C"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Have"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Can"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("But"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("F"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Z"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("This"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("I'm"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("D"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("The"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("For"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("Do"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("You"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
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
