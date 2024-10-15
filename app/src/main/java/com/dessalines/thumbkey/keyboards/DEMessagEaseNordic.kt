package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardTab
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

val KB_DE_NORDIC_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                    bottom = KeyC("ä"),
                    bottomRight = KeyC("v"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    top = KeyC("å"),
                ),
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    top = KeyC("\u0302", displayText = "^", color = ColorVariant.MUTED),
                    topLeft = KeyC("\u0300", displayText = "`", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    bottom = KeyC("l"),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    topRight = KeyC("\u0301", displayText = "´", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("x"),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("h", size = FontSizeVariant.LARGE),
                    top = KeyC("ü"),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottom = KeyC("ö"),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    right = KeyC("k"),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("d", size = FontSizeVariant.LARGE),
                    top = KeyC("u"),
                    topLeft = KeyC("q"),
                    left = KeyC("c"),
                    bottomLeft = KeyC("g"),
                    bottom = KeyC("o"),
                    bottomRight = KeyC("j"),
                    right = KeyC("b"),
                    topRight = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    left = KeyC("m"),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("\u0303", displayText = "~", color = ColorVariant.MUTED),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    right = KeyC("*", color = ColorVariant.MUTED),
                    topRight = KeyC("y"),
                    top = KeyC("ø"),
                    bottom = KeyC("ß"),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = KeyAction.CommitText("\t"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    top = KeyC("w"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    left = KeyC("æ"),
                    bottomLeft = KeyC(",", color = ColorVariant.SECONDARY),
                    bottom = KeyC(".", color = ColorVariant.SECONDARY),
                    bottomRight = KeyC(":", color = ColorVariant.SECONDARY),
                    right = KeyC("z"),
                    topRight = KeyC("'", color = ColorVariant.SECONDARY),
                ),
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topLeft = KeyC("f"),
                    left = KeyC("#", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DE_NORDIC_MESSAGEASE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                    bottom = KeyC("Ä"),
                    bottomRight = KeyC("V"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    top = KeyC("Å"),
                ),
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    bottom = KeyC("L"),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("X"),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("H", size = FontSizeVariant.LARGE),
                    top = KeyC("Ü"),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottom = KeyC("Ö"),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    right = KeyC("K"),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("D", size = FontSizeVariant.LARGE),
                    top = KeyC("U"),
                    topLeft = KeyC("Q"),
                    left = KeyC("C"),
                    bottomLeft = KeyC("G"),
                    bottom = KeyC("O"),
                    bottomRight = KeyC("J"),
                    right = KeyC("B"),
                    topRight = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    left = KeyC("M"),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("\u0303", displayText = "~", color = ColorVariant.MUTED),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    right = KeyC("*", color = ColorVariant.MUTED),
                    topRight = KeyC("Y"),
                    top = KeyC("Ø"),
                    bottom = KeyC("ẞ"),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = KeyAction.CommitText("\t"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    top = KeyC("W"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    left = KeyC("Æ"),
                    bottomLeft = KeyC(",", color = ColorVariant.SECONDARY),
                    bottom = KeyC(".", color = ColorVariant.SECONDARY),
                    bottomRight = KeyC(":", color = ColorVariant.SECONDARY),
                    right = KeyC("Z"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topLeft = KeyC("F"),
                    left = KeyC("#", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DE_NORDIC_MESSAGEASE: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch messagease +åæø",
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_NORDIC_MESSAGEASE_MAIN,
                shifted = KB_DE_NORDIC_MESSAGEASE_SHIFTED,
                numeric = KB_NORDIC_MESSAGEASE_NUMERIC,
            ),
    )
