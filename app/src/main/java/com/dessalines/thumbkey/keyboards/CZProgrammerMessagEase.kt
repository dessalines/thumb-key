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

val KB_CZ_MESSAGEASE_PROGRAMMING_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("1"),
                    topRight = KeyC("á"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottomRight = KeyC("v"),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                    top = KeyC("°", color = ColorVariant.MUTED),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    left = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("2"),
                    topLeft = KeyC("ó"),
                    top = KeyC("ů"),
                    topRight = KeyC("ú"),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottom = KeyC("l"),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("3"),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topLeft = KeyC("í"),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ˇ"),
                            action = KeyAction.ComposeLastKey("ˇ"),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¨"),
                            action = KeyAction.ComposeLastKey("\""),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("´"),
                            action = KeyAction.ComposeLastKey("'"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("h", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("4"),
                    top = KeyC("x"),
                    right = KeyC("k"),
                    bottom = KeyC("'", color = ColorVariant.MUTED),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("5"),
                    top = KeyC("u"),
                    topRight = KeyC("p"),
                    right = KeyC("b"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("d"),
                    bottomLeft = KeyC("g"),
                    left = KeyC("c"),
                    topLeft = KeyC("č"),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("6"),
                    topLeft = KeyC("ř"),
                    left = KeyC("m"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("7"),
                    top = KeyC("ý"),
                    topRight = KeyC("y"),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    right = KeyC("*", color = ColorVariant.MUTED),
                    bottom = KeyC("|", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("8"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    top = KeyC("ě"),
                    topRight = KeyC("é"),
                    right = KeyC("z"),
                    left = KeyC("w"),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("9"),
                    top = KeyC("š"),
                    topLeft = KeyC("f"),
                    topRight = KeyC("&", color = ColorVariant.MUTED),
                    left = KeyC("ž"),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
                    bottom = KeyC("#", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ZERO_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_CZ_MESSAGEASE_PROGRAMMING_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("1"),
                    topRight = KeyC("Á"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottomRight = KeyC("V"),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                    top = KeyC("°", color = ColorVariant.MUTED),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    left = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("2"),
                    topLeft = KeyC("Ó"),
                    top = KeyC("Ů"),
                    topRight = KeyC("Ú"),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottom = KeyC("L"),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("3"),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topLeft = KeyC("Í"),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ˇ"),
                            action = KeyAction.ComposeLastKey("ˇ"),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¨"),
                            action = KeyAction.ComposeLastKey("\""),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("´"),
                            action = KeyAction.ComposeLastKey("'"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("H", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("4"),
                    top = KeyC("X"),
                    right = KeyC("K"),
                    bottom = KeyC("'", color = ColorVariant.MUTED),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("5"),
                    top = KeyC("U"),
                    topRight = KeyC("P"),
                    right = KeyC("B"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("D"),
                    bottomLeft = KeyC("G"),
                    left = KeyC("C"),
                    topLeft = KeyC("Č"),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("6"),
                    topLeft = KeyC("Ř"),
                    left = KeyC("M"),
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
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("7"),
                    top = KeyC("Ý"),
                    topRight = KeyC("Y"),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    right = KeyC("*", color = ColorVariant.MUTED),
                    bottom = KeyC("|", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("8"),
                    top = KeyC("Ě"),
                    topRight = KeyC("É"),
                    right = KeyC("Z"),
                    left = KeyC("W"),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    longPress = KeyAction.CommitText("9"),
                    top = KeyC("Š"),
                    topLeft = KeyC("F"),
                    topRight = KeyC("&", color = ColorVariant.MUTED),
                    left = KeyC("Ž"),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
                    bottom = KeyC("#", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ZERO_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_CZ_MESSAGEASE_PROGRAMMING: KeyboardDefinition =
    KeyboardDefinition(
        title = "čeština messagease programming",
        modes =
            KeyboardDefinitionModes(
                main = KB_CZ_MESSAGEASE_PROGRAMMING_MAIN,
                shifted = KB_CZ_MESSAGEASE_PROGRAMMING_SHIFTED,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
    )
