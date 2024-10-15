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

val KB_IT_MESSAGEASE_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("v"),
                        ),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("à"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("h"),
                        ),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("x"),
                        ),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ì"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("l", size = FontSizeVariant.LARGE),
                    right =
                        KeyC(
                            KeyAction.CommitText("k"),
                        ),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    top =
                        KeyC(
                            KeyAction.CommitText("ù"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ò"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("q"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("u"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("p"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("b"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("j"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("d"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("g"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("c"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    left =
                        KeyC(
                            KeyAction.CommitText("m"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("y"),
                        ),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    right =
                        KeyC(
                            KeyAction.CommitText("è"),
                        ),
                    bottomRight = KeyC("\t", displayText = "⇥", color = ColorVariant.MUTED),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    top = KeyC("*", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    top =
                        KeyC(
                            KeyAction.CommitText("w"),
                        ),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    right =
                        KeyC(
                            KeyAction.CommitText("z"),
                        ),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            KeyAction.CommitText("é"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("f"),
                        ),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
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

val KB_IT_MESSAGEASE_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("V"),
                        ),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("À"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("H"),
                        ),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("X"),
                        ),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("Ì"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("L", size = FontSizeVariant.LARGE),
                    right =
                        KeyC(
                            KeyAction.CommitText("K"),
                        ),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    top =
                        KeyC(
                            KeyAction.CommitText("Ù"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Ò"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("Q"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("U"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("P"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("B"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("J"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("D"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("G"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("C"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    left =
                        KeyC(
                            KeyAction.CommitText("M"),
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
                    topRight =
                        KeyC(
                            KeyAction.CommitText("Y"),
                        ),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    right =
                        KeyC(
                            KeyAction.CommitText("È"),
                        ),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = ColorVariant.MUTED),
                    top = KeyC("*", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    top =
                        KeyC(
                            KeyAction.CommitText("W"),
                        ),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    right =
                        KeyC(
                            KeyAction.CommitText("Z"),
                        ),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            KeyAction.CommitText("É"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("F"),
                        ),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
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

val KB_IT_MESSAGEASE_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "italiano messagease symbols",
        modes =
            KeyboardDefinitionModes(
                main = KB_IT_MESSAGEASE_SYMBOLS_MAIN,
                shifted = KB_IT_MESSAGEASE_SYMBOLS_SHIFTED,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
    )
