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
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    topRight = KeyC("ª"),
                    left = KeyC("ñ"),
                    bottomLeft = KeyC("$"),
                    bottomRight = KeyC("b"),
                ),
                KeyItemC(
                    center = KeyC("l", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    topLeft = KeyC("`"),
                    top = KeyC("^"),
                    topRight = KeyC("´"),
                    left = KeyC("+"),
                    right = KeyC("!"),
                    bottomLeft = KeyC("/"),
                    bottom = KeyC("v"),
                    bottomRight = KeyC("\\"),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    topRight = KeyC("€"),
                    top = KeyC("="),
                    topLeft = KeyC("£"),
                    left = KeyC("?"),
                    right = KeyC("ó"),
                    bottomLeft = KeyC("u"),
                    bottom = KeyC("ü"),
                    bottomRight = KeyC("ú"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    topLeft = KeyC("{"),
                    topRight = KeyC("%"),
                    right = KeyC("p"),
                    bottomLeft = KeyC("["),
                    bottom = KeyC("("),
                    bottomRight = KeyC("_"),
                ),
                KeyItemC(
                    center = KeyC("d", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("j"),
                    top = KeyC("k"),
                    topRight = KeyC("h"),
                    left = KeyC("z"),
                    right = KeyC("q"),
                    bottomLeft = KeyC("f"),
                    bottom = KeyC("x"),
                    bottomRight = KeyC("y"),
                ),
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    topLeft = KeyC("|"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topRight = KeyC("}"),
                    left = KeyC("t"),
                    right = KeyC("á"),
                    bottomLeft = KeyC("@"),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("]"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("~"),
                    topRight = KeyC("m"),
                    bottomLeft = KeyC("<"),
                    bottomRight = KeyC(":"),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("\""),
                    top = KeyC("g"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    left = KeyC("w"),
                    right = KeyC("í"),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("c"),
                    top = KeyC("&"),
                    topRight = KeyC("°"),
                    left = KeyC("#"),
                    right = KeyC("é"),
                    bottomLeft = KeyC(";"),
                    bottom = KeyC(","),
                    bottomRight = KeyC(">"),
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
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    left = KeyC("Ñ"),
                    bottomRight = KeyC("B"),
                ),
                KeyItemC(
                    center = KeyC("L", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("¡", color = ColorVariant.MUTED),
                    bottom = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    left = KeyC("¿", color = ColorVariant.MUTED),
                    right = KeyC("Ó"),
                    bottomLeft = KeyC("U"),
                    bottom = KeyC("Ü"),
                    bottomRight = KeyC("Ú"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("D", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("J"),
                    top = KeyC("K"),
                    topRight = KeyC("H"),
                    left = KeyC("Z"),
                    right = KeyC("Q"),
                    bottomLeft = KeyC("F"),
                    bottom = KeyC("X"),
                    bottomRight = KeyC("Y"),
                ),
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC("T"),
                    right = KeyC("Á"),
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
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    top = KeyC("G"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    left = KeyC("W"),
                    right = KeyC("Í"),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("C"),
                    right = KeyC("É"),
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
