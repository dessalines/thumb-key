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

val KB_ES_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(KB_ES_MESSAGEASE_CURRENCY_SYMBOL),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(action = KeyAction.CommitText("v")),
                    bottom =
                        KeyC(action = KeyAction.CommitText("á")),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("+"),
                            color = ColorVariant.MUTED,
                        ),
                    top = KeyC(action = KeyAction.CommitText("ñ")),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom = KeyC(action = KeyAction.CommitText("l")),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("/"),
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
                    topLeft = KeyC(action = KeyAction.CommitText("í")),
                    bottomLeft = KeyC(action = KeyAction.CommitText("x")),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("¡"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("¿"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("d"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    top = KeyC(action = KeyAction.CommitText("ü")),
                    right = KeyC(action = KeyAction.CommitText("k")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft = KeyC(action = KeyAction.CommitText("q")),
                    top = KeyC(action = KeyAction.CommitText("u")),
                    topRight = KeyC(action = KeyAction.CommitText("p")),
                    right = KeyC(action = KeyAction.CommitText("b")),
                    bottomRight = KeyC(action = KeyAction.CommitText("j")),
                    bottom = KeyC(action = KeyAction.CommitText("h")),
                    bottomLeft = KeyC(action = KeyAction.CommitText("g")),
                    left = KeyC(action = KeyAction.CommitText("c")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    left = KeyC(action = KeyAction.CommitText("m")),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight = KeyC(action = KeyAction.CommitText("y")),
                    top = KeyC(action = KeyAction.CommitText("ú")),
                    bottom = KeyC(action = KeyAction.CommitText("ó")),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("*"),
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
                    top = KeyC(action = KeyAction.CommitText("w")),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC(action = KeyAction.CommitText("z")),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(":"),
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
                        KeyC(action = KeyAction.CommitText("é")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC(action = KeyAction.CommitText("f")),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(SPACEBAR_KEY_ITEM, RETURN_KEY_ITEM),
        ),
    )

val KB_ES_MESSAGEASE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(KB_ES_MESSAGEASE_CURRENCY_SYMBOL),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("V"),
                        ),
                    bottom = KeyC(action = KeyAction.CommitText("Á")),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("+"),
                            color = ColorVariant.MUTED,
                        ),
                    top = KeyC(action = KeyAction.CommitText("Ñ")),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom = KeyC(action = KeyAction.CommitText("L")),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("/"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft = KeyC(action = KeyAction.CommitText("Í")),
                    bottomLeft = KeyC(action = KeyAction.CommitText("X")),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("¡"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("¿"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("D"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    top = KeyC(action = KeyAction.CommitText("Ü")),
                    right = KeyC(action = KeyAction.CommitText("K")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft = KeyC(action = KeyAction.CommitText("Q")),
                    top = KeyC(action = KeyAction.CommitText("U")),
                    topRight = KeyC(action = KeyAction.CommitText("P")),
                    right = KeyC(action = KeyAction.CommitText("B")),
                    bottomRight = KeyC(action = KeyAction.CommitText("J")),
                    bottom = KeyC(action = KeyAction.CommitText("H")),
                    bottomLeft = KeyC(action = KeyAction.CommitText("G")),
                    left = KeyC(action = KeyAction.CommitText("C")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    left = KeyC(action = KeyAction.CommitText("M")),
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
                            action = KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight = KeyC(action = KeyAction.CommitText("Y")),
                    top = KeyC(action = KeyAction.CommitText("Ú")),
                    bottom = KeyC(action = KeyAction.CommitText("Ó")),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("*"),
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
                    top = KeyC(action = KeyAction.CommitText("W")),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC(action = KeyAction.CommitText("Z")),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(":"),
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
                            action = KeyAction.CommitText("É"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC(action = KeyAction.CommitText("F")),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_ES_MESSAGEASE: KeyboardDefinition =
    KeyboardDefinition(
        title = "español messagease",
        modes =
            KeyboardDefinitionModes(
                main = KB_ES_MESSAGEASE_MAIN,
                shifted = KB_ES_MESSAGEASE_SHIFTED,
                numeric = KB_ES_MESSAGEASE_NUMERIC,
            ),
    )
