package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
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

val KB_DE_THUMBKEY_MULTILINGUAL_MAIN =
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
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("#"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ç"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("…"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("c"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("d"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("f"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("l"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ä"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("â"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("à"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("å"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("æ"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("€"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("|"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("&"),
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
                    right =
                        KeyC(
                            action = KeyAction.CommitText("m"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ó"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ø"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ò"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ö"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ô"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("o"),
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
                            action = KeyAction.CommitText("z"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("k"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("w"),
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
                            action = KeyAction.CommitText("p"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ï"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ì"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("î"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
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
                            action = KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("g"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("u"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("û"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ü"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ù"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
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
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("y"),
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
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ß"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("œ"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ë"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ê"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("è"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("é"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("~"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("?"),
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

val KB_DE_THUMBKEY_MULTILINGUAL_SHIFTED =
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
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("#"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ç"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("…"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("C"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("D"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("F"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("L"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ä"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Â"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("À"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Å"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Æ"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("€"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("|"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("&"),
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
                    right =
                        KeyC(
                            action = KeyAction.CommitText("M"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ó"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ø"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ò"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ö"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ô"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("O"),
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
                            action = KeyAction.CommitText("Z"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("K"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("W"),
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
                            action = KeyAction.CommitText("P"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ï"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ì"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Î"),
                            color = ColorVariant.MUTED,
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
                            action = KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("G"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("U"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Û"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ü"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ù"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
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
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Y"),
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
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ẞ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Œ"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ë"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ê"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("È"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("É"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("~"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("?"),
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

// TODO this needs fixing, which languages are here?
val KB_DE_THUMBKEY_MULTILINGUAL: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch multilingual thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_THUMBKEY_MULTILINGUAL_MAIN,
                shifted = KB_DE_THUMBKEY_MULTILINGUAL_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
