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
                            action = KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("w"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("make"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("will"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("what"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("g"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("when"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("which"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("with"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("just"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("from"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("be"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("u"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ould"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("'ll"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'re"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("about"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("n't"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("'t"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("'s"),
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
                            action = KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("m"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("like"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("not"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("and"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("know"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("h"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("j"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("q"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("b"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("p"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("y"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("x"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("v"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("k"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            action = KeyAction.CommitText("l"),
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
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("c"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("have"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("can"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("but"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("f"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("z"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("this"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("that"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("I'm"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("d"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("the"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("for"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("do"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("you"),
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
                            action = KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("W"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Make"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Will"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("What"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("G"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("When"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Which"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("With"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Just"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("From"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Be"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("U"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ould"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("'ll"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'re"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("About"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("n't"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("'t"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("'s"),
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
                            action = KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("M"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Like"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Not"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("And"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Know"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("H"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("J"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Q"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("B"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("P"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Y"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("X"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("V"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("K"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            action = KeyAction.CommitText("L"),
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
                            action = KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("C"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Have"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Can"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("But"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("F"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Z"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("This"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("I'm"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("D"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("The"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("For"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Do"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("You"),
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
