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
                    center = KeyC(KeyAction.CommitText("a"), size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC(KeyAction.CommitText(KB_ES_MESSAGEASE_CURRENCY_SYMBOL), color = ColorVariant.MUTED),
                    bottomRight = KeyC(KeyAction.CommitText("v")),
                    bottom = KeyC(KeyAction.CommitText("á")),
                    right = KeyC(KeyAction.CommitText("-"), color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("n"), size = FontSizeVariant.LARGE),
                    left = KeyC(KeyAction.CommitText("+"), color = ColorVariant.MUTED),
                    top = KeyC(KeyAction.CommitText("ñ")),
                    right = KeyC(KeyAction.CommitText("!"), color = ColorVariant.MUTED),
                    bottom = KeyC(KeyAction.CommitText("l")),
                    bottomLeft = KeyC(KeyAction.CommitText("/"), color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("i"), size = FontSizeVariant.LARGE),
                    topLeft = KeyC(KeyAction.CommitText("í")),
                    bottomLeft = KeyC(KeyAction.CommitText("x")),
                    topRight = KeyC(KeyAction.CommitText("¡"), color = ColorVariant.MUTED),
                    left = KeyC(KeyAction.CommitText("?"), color = ColorVariant.MUTED),
                    right = KeyC(KeyAction.CommitText("¿"), color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("d"), size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC(KeyAction.CommitText("("), color = ColorVariant.MUTED),
                    top = KeyC(KeyAction.CommitText("ü")),
                    right = KeyC(KeyAction.CommitText("k")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("o"), size = FontSizeVariant.LARGE),
                    topLeft = KeyC(KeyAction.CommitText("q")),
                    top = KeyC(KeyAction.CommitText("u")),
                    topRight = KeyC(KeyAction.CommitText("p")),
                    right = KeyC(KeyAction.CommitText("b")),
                    bottomRight = KeyC(KeyAction.CommitText("j")),
                    bottom = KeyC(KeyAction.CommitText("h")),
                    bottomLeft = KeyC(KeyAction.CommitText("g")),
                    left = KeyC(KeyAction.CommitText("c")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("r"), size = FontSizeVariant.LARGE),
                    left = KeyC(KeyAction.CommitText("m")),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC(KeyAction.CommitText(")"), color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    bottomLeft = KeyC(KeyAction.CommitText("@"), color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("t"), size = FontSizeVariant.LARGE),
                    topRight = KeyC(KeyAction.CommitText("y")),
                    top = KeyC(KeyAction.CommitText("ú")),
                    bottom = KeyC(KeyAction.CommitText("ó")),
                    right = KeyC(KeyAction.CommitText("*"), color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("e"), size = FontSizeVariant.LARGE),
                    top = KeyC(KeyAction.CommitText("w")),
                    topRight = KeyC(KeyAction.CommitText("'"), color = ColorVariant.MUTED),
                    topLeft = KeyC(KeyAction.CommitText("\""), color = ColorVariant.MUTED),
                    right = KeyC(KeyAction.CommitText("z")),
                    bottomRight = KeyC(KeyAction.CommitText(":"), color = ColorVariant.MUTED),
                    bottom = KeyC(KeyAction.CommitText("."), color = ColorVariant.MUTED),
                    bottomLeft = KeyC(KeyAction.CommitText(","), color = ColorVariant.MUTED),
                    left = KeyC(KeyAction.CommitText("é")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("s"), size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC(KeyAction.CommitText("f")),
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
                    center = KeyC(KeyAction.CommitText("A"), size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC(KeyAction.CommitText(KB_ES_MESSAGEASE_CURRENCY_SYMBOL), color = ColorVariant.MUTED),
                    bottomRight = KeyC(KeyAction.CommitText("V")),
                    bottom = KeyC(KeyAction.CommitText("Á")),
                    right = KeyC(KeyAction.CommitText("-"), color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("N"), size = FontSizeVariant.LARGE),
                    left = KeyC(KeyAction.CommitText("+"), color = ColorVariant.MUTED),
                    top = KeyC(KeyAction.CommitText("Ñ")),
                    right = KeyC(KeyAction.CommitText("!"), color = ColorVariant.MUTED),
                    bottom = KeyC(KeyAction.CommitText("L")),
                    bottomLeft = KeyC(KeyAction.CommitText("/"), color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("I"), size = FontSizeVariant.LARGE),
                    topLeft = KeyC(KeyAction.CommitText("Í")),
                    bottomLeft = KeyC(KeyAction.CommitText("X")),
                    topRight = KeyC(KeyAction.CommitText("¡"), color = ColorVariant.MUTED),
                    left = KeyC(KeyAction.CommitText("?"), color = ColorVariant.MUTED),
                    right = KeyC(KeyAction.CommitText("¿"), color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("D"), size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC(KeyAction.CommitText("("), color = ColorVariant.MUTED),
                    top = KeyC(KeyAction.CommitText("Ü")),
                    right = KeyC(KeyAction.CommitText("K")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("O"), size = FontSizeVariant.LARGE),
                    topLeft = KeyC(KeyAction.CommitText("Q")),
                    top = KeyC(KeyAction.CommitText("U")),
                    topRight = KeyC(KeyAction.CommitText("P")),
                    right = KeyC(KeyAction.CommitText("B")),
                    bottomRight = KeyC(KeyAction.CommitText("J")),
                    bottom = KeyC(KeyAction.CommitText("H")),
                    bottomLeft = KeyC(KeyAction.CommitText("G")),
                    left = KeyC(KeyAction.CommitText("C")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("R"), size = FontSizeVariant.LARGE),
                    left = KeyC(KeyAction.CommitText("M")),
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
                    right = KeyC(KeyAction.CommitText(")"), color = ColorVariant.MUTED),
                    bottomLeft = KeyC(KeyAction.CommitText("@"), color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("T"), size = FontSizeVariant.LARGE),
                    topRight = KeyC(KeyAction.CommitText("Y")),
                    top = KeyC(KeyAction.CommitText("Ú")),
                    bottom = KeyC(KeyAction.CommitText("Ó")),
                    right = KeyC(KeyAction.CommitText("*"), color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("E"), size = FontSizeVariant.LARGE),
                    top = KeyC(KeyAction.CommitText("W")),
                    topRight = KeyC(KeyAction.CommitText("'"), color = ColorVariant.MUTED),
                    topLeft = KeyC(KeyAction.CommitText("\""), color = ColorVariant.MUTED),
                    right = KeyC(KeyAction.CommitText("Z")),
                    bottomRight = KeyC(KeyAction.CommitText(":"), color = ColorVariant.MUTED),
                    bottom = KeyC(KeyAction.CommitText("."), color = ColorVariant.MUTED),
                    bottomLeft = KeyC(KeyAction.CommitText(","), color = ColorVariant.MUTED),
                    left = KeyC(KeyAction.CommitText("É")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("S"), size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC(KeyAction.CommitText("F")),
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
