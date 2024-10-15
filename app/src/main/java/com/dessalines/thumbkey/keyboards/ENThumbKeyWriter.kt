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

// Adds more punctuation options to the main screen to reduce switches to the numeric keyboard
val KB_EN_THUMBKEY_WRITER_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("w"),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    bottom = KeyC("g"),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("u"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    right = KeyC("m"),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    bottom = KeyC("…", color = ColorVariant.MUTED),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
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
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    topRight = KeyC("c"),
                    top = KeyC("–", color = ColorVariant.MUTED),
                    topLeft = KeyC("“", color = ColorVariant.MUTED),
                    left = KeyC("‘", color = ColorVariant.MUTED),
                    right = KeyC("~", color = ColorVariant.MUTED),
                    bottom = KeyC("—", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("<", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    top = KeyC("f"),
                    right = KeyC("z"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    left = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("d"),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("”", color = ColorVariant.MUTED),
                    right = KeyC("’", color = ColorVariant.MUTED),
                    bottom = KeyC("°", color = ColorVariant.MUTED),
                    bottomRight = KeyC(">", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    left = KeyC("#", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_WRITER_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("W"),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    bottom = KeyC("G"),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("U"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    right = KeyC("M"),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    bottom = KeyC("…", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
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
                    left = KeyC("L"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    topRight = KeyC("C"),
                    top = KeyC("–", color = ColorVariant.MUTED),
                    topLeft = KeyC("“", color = ColorVariant.MUTED),
                    left = KeyC("‘", color = ColorVariant.MUTED),
                    right = KeyC("~", color = ColorVariant.MUTED),
                    bottom = KeyC("—", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("<", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    top = KeyC("F"),
                    right = KeyC("Z"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    left = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("D"),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("”", color = ColorVariant.MUTED),
                    right = KeyC("’", color = ColorVariant.MUTED),
                    bottom = KeyC("°", color = ColorVariant.MUTED),
                    bottomRight = KeyC(">", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    left = KeyC("#", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_WRITER: KeyboardDefinition =
    KeyboardDefinition(
        title = "english thumb-key writer",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_WRITER_MAIN,
                shifted = KB_EN_THUMBKEY_WRITER_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
