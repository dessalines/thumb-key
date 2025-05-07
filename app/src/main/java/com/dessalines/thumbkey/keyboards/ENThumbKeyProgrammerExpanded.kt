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

// uses programming layout but adds numbers to the left side. the grid is 5x4.
// the layout also adds the few other keys from the numeric layout that the programming layout didn't already have.
// because this layout contains all the keys from the numeric layout, the key to switch to the numeric layout has been replaced with the key to switch to voice input.
// additionally, the "move keyboard" button has been relocated from right to topLeft, because swiping inward is easier than outward for keys on the edge.

val EMOJI_KEY_PROGRAMMING_EXPANDED =
    KeyItemC(
        backgroundColor = SURFACE_VARIANT,
        swipeType = EIGHT_WAY,
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Mood),
                action = ToggleEmojiMode(true),
                size = LARGE,
                color = SECONDARY,
            ),
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                action = GotoSettings,
                color = MUTED,
            ),
        bottom =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Keyboard),
                action = SwitchIME,
                color = MUTED,
            ),
        topLeft =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.LinearScale),
                action = MoveKeyboard.CycleRight,
                color = MUTED,
            ),
        left =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Language),
                action = SwitchLanguage,
                color = MUTED,
            ),
    )
val TEXTEDIT_KEY_PROGRAMMING_EXPANDED =
    textEditKeyItem(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Mic),
                action = SwitchIMEVoice,
                size = LARGE,
                color = SECONDARY,
            ),
    )

val KB_EN_THUMBKEY_PROGRAMMING_EXPANDED_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("3", size = LARGE, color = MUTED),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("9", color = MUTED),
                    bottom = KeyC("6", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottomRight = KeyC("w"),
                    bottomLeft = KeyC("(", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("\\", color = MUTED),
                    topRight = KeyC("/", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    bottom = KeyC("g"),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC(">", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("u"),
                    bottomRight = KeyC(")", color = MUTED),
                    topLeft = KeyC("=", color = MUTED),
                    topRight = KeyC("+", color = MUTED),
                ),
                EMOJI_KEY_PROGRAMMING_EXPANDED,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("2", size = LARGE, color = MUTED),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("8", color = MUTED),
                    bottom = KeyC("5", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("m"),
                    left = KeyC("@", color = MUTED),
                    top = KeyC("$", color = MUTED),
                    bottom = KeyC("&", color = MUTED),
                    bottomLeft = KeyC("|", color = MUTED),
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
                TEXTEDIT_KEY_PROGRAMMING_EXPANDED,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE, color = MUTED),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("7", color = MUTED),
                    bottom = KeyC("4", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("c"),
                    bottom = KeyC(",", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("f"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC("?", color = MUTED),
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
                KeyItemC(
                    center = KeyC("0", size = LARGE, color = MUTED),
                ),
                SPACEBAR_PROGRAMMING_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_PROGRAMMING_EXPANDED_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("3", size = LARGE, color = MUTED),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("9", color = MUTED),
                    bottom = KeyC("6", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottomRight = KeyC("W"),
                    bottomLeft = KeyC("(", color = MUTED),
                    right = KeyC("´", color = MUTED),
                    topLeft = KeyC("~", color = MUTED),
                    top = KeyC("\\", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    bottom = KeyC("G"),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC(">", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("U"),
                    bottomRight = KeyC(")", color = MUTED),
                    topLeft = KeyC("=", color = MUTED),
                    topRight = KeyC("+", color = MUTED),
                ),
                EMOJI_KEY_PROGRAMMING_EXPANDED,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("2", size = LARGE, color = MUTED),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("8", color = MUTED),
                    bottom = KeyC("5", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("M"),
                    left = KeyC("#", color = MUTED),
                    top = KeyC("€", color = MUTED),
                    topRight = KeyC("£", color = MUTED),
                    bottom = KeyC("&", color = MUTED),
                    bottomLeft = KeyC("|", color = MUTED),
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
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = CommitText("\t"),
                            color = MUTED,
                        ),
                ),
                TEXTEDIT_KEY_PROGRAMMING_EXPANDED,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE, color = MUTED),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("7", color = MUTED),
                    bottom = KeyC("4", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("C"),
                    bottom = KeyC(",", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("https://", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("F"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC("_"),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("D"),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    right = KeyC(".com", color = MUTED, size = SMALLEST),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("0", size = LARGE, color = MUTED),
                ),
                SPACEBAR_PROGRAMMING_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_PROGRAMMING_EXPANDED: KeyboardDefinition =
    KeyboardDefinition(
        title = "english thumb-key programming expanded",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_PROGRAMMING_EXPANDED_MAIN,
                shifted = KB_EN_THUMBKEY_PROGRAMMING_EXPANDED_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
