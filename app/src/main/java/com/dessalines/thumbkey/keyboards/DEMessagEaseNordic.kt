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
                    center =
                        KeyC(
                            KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("$"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ä"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("v"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("å"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("^"),
                            action = KeyAction.CommitText("\u0302"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("`"),
                            action = KeyAction.CommitText("\u0300"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("+"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("/"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("l"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("\\"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("´"),
                            action = KeyAction.CommitText("\u0301"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("x"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("="),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("€"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("h"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ü"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("{"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("["),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ö"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("_"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("k"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("%"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("d"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("u"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("q"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("c"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("g"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("o"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("j"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("b"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("p"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
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
                            KeyAction.CommitText("|"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("m"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("]"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("}"),
                            color = ColorVariant.MUTED,
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
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("~"),
                            action = KeyAction.CommitText("\u0303"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("<"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("y"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ø"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ß"),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = KeyAction.CommitText("\t"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("w"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("æ"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.SECONDARY,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.SECONDARY,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(":"),
                            color = ColorVariant.SECONDARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("z"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.SECONDARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("&"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("f"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("#"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText(">"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("°"),
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

val KB_DE_NORDIC_MESSAGEASE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("$"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Ä"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("V"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Å"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("^"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("`"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("+"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("/"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("L"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("\\"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("´"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("X"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("="),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("€"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("H"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Ü"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("{"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("["),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Ö"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("_"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("K"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("%"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("D"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("U"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("Q"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("C"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("G"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("O"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("J"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("B"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("P"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
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
                            KeyAction.CommitText("|"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("M"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("@"),
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
                            KeyAction.CommitText("]"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("}"),
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
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("~"),
                            action = KeyAction.CommitText("\u0303"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("<"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("Y"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Ø"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ẞ"),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = KeyAction.CommitText("\t"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("W"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("Æ"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.SECONDARY,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.SECONDARY,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(":"),
                            color = ColorVariant.SECONDARY,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Z"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("&"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("F"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("#"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText(">"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("°"),
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
