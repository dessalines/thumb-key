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

val KB_DE_THUMBKEY_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    top = KeyC("ä"),
                    topLeft = KeyC("ö"),
                    left = KeyC("ü"),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                    bottomRight = KeyC("c"),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("-"), // mi
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¿¡"), // mi
                            action = KeyAction.ComposeLastKey("!"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("d", size = FontSizeVariant.LARGE),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    bottom = KeyC("f"),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    right = KeyC("=", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("˘"), // mi
                            action = KeyAction.CommitText("˘"),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("l"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ä"), // mi
                            action = KeyAction.CommitText("ä"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("sch"), // mi
                            action = KeyAction.CommitText("sch"),
                        ),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ch"), // mi
                            action = KeyAction.CommitText("ch"),
                        ),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    right = KeyC("m"),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("h", size = FontSizeVariant.LARGE),
                    top = KeyC("q"),
                    topLeft = KeyC("j"),
                    left = KeyC("p"),
                    bottomLeft = KeyC("v"),
                    bottom = KeyC("x"),
                    bottomRight = KeyC("w"),
                    right = KeyC("k"),
                    topRight = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    left = KeyC("o"),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ö"), // mi
                            action = KeyAction.CommitText("ö"),
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
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ß"), // mi
                            action = KeyAction.CommitText("ß"),
                        ),
                    right = KeyC("*", color = ColorVariant.MUTED),
                    topRight = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    top = KeyC("b"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    left = KeyC("ß", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    right = KeyC("y"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topLeft = KeyC("u"),
                    left = KeyC("#", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    bottom = KeyC("ü", color = ColorVariant.MUTED),
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

val KB_DE_THUMBKEY_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    top = KeyC("Ä", color = ColorVariant.MUTED),
                    topLeft = KeyC("Ö", color = ColorVariant.MUTED),
                    left = KeyC("Ü", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("Ä"), // mi
                            action = KeyAction.CommitText("Ä"),
                        ),
                    bottomRight = KeyC("C"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¿¡"), // mi
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("D", size = FontSizeVariant.LARGE),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    bottom = KeyC("F"),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    right = KeyC("=", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("˘"), // mi
                            action = KeyAction.CommitText("˘"),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("L"),
                    bottom = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    top = KeyC("Sch"),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottom = KeyC("Ch"),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    right = KeyC("M"),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("H", size = FontSizeVariant.LARGE),
                    top = KeyC("Q"),
                    topLeft = KeyC("J"),
                    left = KeyC("P"),
                    bottomLeft = KeyC("V"),
                    bottom = KeyC("X"),
                    bottomRight = KeyC("W"),
                    right = KeyC("K"),
                    topRight = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    left = KeyC("O"),
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
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ẞ"), // mi
                            action = KeyAction.CommitText("ẞ"),
                        ),
                    right = KeyC("*", color = ColorVariant.MUTED),
                    topRight = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    top = KeyC("B"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    left = KeyC("ẞ", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    right = KeyC("Y"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topLeft = KeyC("U"),
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

val KB_DE_THUMBKEY_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch thumb-key symbols",
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_THUMBKEY_SYMBOLS_MAIN,
                shifted = KB_DE_THUMBKEY_SYMBOLS_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
