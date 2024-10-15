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
                    center =
                        KeyC(
                            action = KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ä"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ö"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ü"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("$"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("c"),
                        ),
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
                    center =
                        KeyC(
                            action = KeyAction.CommitText("d"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("^"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("`"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("+"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("/"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("f"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("\\"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("="),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("´"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("˘"), // mi
                            action = KeyAction.CommitText("˘"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("l"),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ä"), // mi
                            action = KeyAction.CommitText("ä"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("€"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("sch"), // mi
                            action = KeyAction.CommitText("sch"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("{"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("["),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ch"), // mi
                            action = KeyAction.CommitText("ch"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("_"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("m"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("%"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("h"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("q"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("j"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("p"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("v"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("x"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("w"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("k"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("z"),
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
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("|"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("o"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ö"), // mi
                            action = KeyAction.CommitText("ö"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("]"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("}"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("~"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("<"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ß"), // mi
                            action = KeyAction.CommitText("ß"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("g"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("b"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ß"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("y"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("&"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("u"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("#"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ü"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(">"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("°"),
                            color = ColorVariant.MUTED,
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

val KB_DE_THUMBKEY_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ä"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ö"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ü"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("$"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("Ä"), // mi
                            action = KeyAction.CommitText("Ä"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("C"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¿¡"), // mi
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("D"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("^"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("`"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("+"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("/"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("F"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("\\"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("="),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("´"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("˘"), // mi
                            action = KeyAction.CommitText("˘"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("L"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("€"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Sch"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("{"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("["),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ch"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("_"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("M"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("%"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("H"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Q"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("J"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("P"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("V"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("X"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("W"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("K"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Z"),
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
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("|"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("O"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("]"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("}"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("~"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("<"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ẞ"), // mi
                            action = KeyAction.CommitText("ẞ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("G"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("B"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ẞ"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Y"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("&"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("U"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("#"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(">"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("°"),
                            color = ColorVariant.MUTED,
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
