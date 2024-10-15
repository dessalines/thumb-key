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
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_TR_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ö"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("o"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("q"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("p"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("`"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("\\"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("/"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("g"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ğ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("^"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("<"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(">"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("l"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("n"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("="),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("+"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("y"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("w"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("v"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("z"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("$"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("&"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("|"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("m"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("f"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("d"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("c"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("h"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("e"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ç"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("s"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ş"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("t"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
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
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = KeyAction.CommitText("\t"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("b"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("{"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("["),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("k"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("j"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("x"),
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
                            action = KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ü"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("u"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ı"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("}"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("]"),
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

val KB_TR_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("Ö"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("O"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Q"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("P"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("~"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("\\"),
                            color = ColorVariant.MUTED,
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
                            action = KeyAction.CommitText("G"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ğ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("^"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("<"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(">"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("L"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("N"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("="),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("+"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("Y"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("W"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("V"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Z"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("#"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("€"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("&"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("|"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("M"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("F"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("D"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("C"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("H"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("E"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ç"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("S"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ş"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("T"),
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
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = KeyAction.CommitText("\t"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("B"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("{"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("https://"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("["),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("K"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("J"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("X"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("_"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("İ"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ü"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("U"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("I"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("}"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("]"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(".com"),
                            color = ColorVariant.MUTED,
                            size = FontSizeVariant.SMALLEST,
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

val KB_TR_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "türkçe thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_TR_THUMBKEY_MAIN,
                shifted = KB_TR_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
