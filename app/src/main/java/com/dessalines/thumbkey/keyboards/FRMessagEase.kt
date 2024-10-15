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

val KB_FR_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("v"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("à"),
                        ),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("â"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("\u0300", displayText = "ˋ", color = ColorVariant.MUTED),
                    top = KeyC("\u0302", displayText = "^", color = ColorVariant.MUTED),
                    topRight = KeyC("\u0301", displayText = "ˊ", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("l"),
                        ),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("x"),
                        ),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("u", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    right =
                        KeyC(
                            KeyAction.CommitText("k"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("û"),
                        ),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ç"),
                        ),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("q"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("h"),
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
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            KeyAction.CommitText("m"),
                        ),
                    right = KeyC(")", color = ColorVariant.MUTED),
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
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("y"),
                        ),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    right =
                        KeyC(
                            KeyAction.CommitText("è"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ê"),
                        ),
                    bottomRight = KeyC("\u0009", displayText = "␉", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ù"),
                        ),
                    bottomLeft = KeyC("\u0303", displayText = "ñ", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            KeyAction.CommitText("w"),
                        ),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    right =
                        KeyC(
                            KeyAction.CommitText("z"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("é"),
                        ),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("f"),
                        ),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                    left = KeyC("#", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    bottom = KeyC("\u0308", displayText = "¨", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_MESSAGEASE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("V"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("À"),
                        ),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Â"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("\u0300", displayText = "ˋ", color = ColorVariant.MUTED),
                    top = KeyC("\u0302", displayText = "^", color = ColorVariant.MUTED),
                    topRight = KeyC("\u0301", displayText = "ˊ", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("L"),
                        ),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("X"),
                        ),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("U", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    right =
                        KeyC(
                            KeyAction.CommitText("K"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Û"),
                        ),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Ç"),
                        ),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("Q"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("H"),
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
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    left =
                        KeyC(
                            KeyAction.CommitText("M"),
                        ),
                    right = KeyC(")", color = ColorVariant.MUTED),
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
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("Y"),
                        ),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    right =
                        KeyC(
                            KeyAction.CommitText("È"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Ê"),
                        ),
                    bottomRight = KeyC("\u0009", displayText = "␉", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Ù"),
                        ),
                    bottomLeft = KeyC("\u0303", displayText = "ñ", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            KeyAction.CommitText("W"),
                        ),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    right =
                        KeyC(
                            KeyAction.CommitText("Z"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("É"),
                        ),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("F"),
                        ),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                    left = KeyC("#", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    bottom = KeyC("\u0308", displayText = "¨", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_MESSAGEASE: KeyboardDefinition =
    KeyboardDefinition(
        title = "français messagease",
        modes =
            KeyboardDefinitionModes(
                main = KB_FR_MESSAGEASE_MAIN,
                shifted = KB_FR_MESSAGEASE_SHIFTED,
                numeric = FRENCH_NUMERIC_KEYBOARD,
            ),
    )
