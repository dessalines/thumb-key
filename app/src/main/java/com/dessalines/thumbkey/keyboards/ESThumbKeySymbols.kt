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
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_ES_THUMBKEY_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ª"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ñ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("$"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("b"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("l"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("`"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("^"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("´"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("+"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("/"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("v"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("\\"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("€"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("="),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("£"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ó"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("u"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ü"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ú"),
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
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("{"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("%"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("p"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("["),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("("),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("_"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("d"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("j"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("k"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("h"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("z"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("q"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("f"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("x"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("y"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("|"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("}"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("t"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("á"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("]"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("~"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("m"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("<"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(":"),
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
                            action = KeyAction.CommitText("\""),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("g"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("w"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("í"),
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
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("-"),
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
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("c"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("&"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("°"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("#"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("é"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(";"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText(","),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(">"),
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

val KB_ES_THUMBKEY_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ñ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("B"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("L"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("¡"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("V"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("¿"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ó"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("U"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ü"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ú"),
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
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("P"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("D"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("J"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("K"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("H"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Z"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Q"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("F"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("X"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Y"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("T"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Á"),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("M"),
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
                            action = KeyAction.CommitText("G"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("W"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Í"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("-"),
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
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("C"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("É"),
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

val KB_ES_THUMBKEY_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "español thumb-key symbols",
        modes =
            KeyboardDefinitionModes(
                main = KB_ES_THUMBKEY_SYMBOLS_MAIN,
                shifted = KB_ES_THUMBKEY_SYMBOLS_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
