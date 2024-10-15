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
import com.dessalines.thumbkey.utils.KeyboardDefinitionSettings
import com.dessalines.thumbkey.utils.SwipeNWay
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe

val KB_EN_QBASED_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("w", size = FontSizeVariant.LARGE),
                    left = KeyC("q", color = ColorVariant.PRIMARY),
                    right = KeyC("e", color = ColorVariant.PRIMARY),
                    topLeft = KeyC("1"),
                    top = KeyC("2"),
                    topRight = KeyC("3"),
                ),
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    left = KeyC("r", color = ColorVariant.PRIMARY),
                    right = KeyC("u", color = ColorVariant.PRIMARY),
                    bottom = KeyC("y", color = ColorVariant.PRIMARY),
                    topLeft = KeyC("4"),
                    top = KeyC("5"),
                    topRight = KeyC("6"),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    left = KeyC("i", color = ColorVariant.PRIMARY),
                    right = KeyC("p", color = ColorVariant.PRIMARY),
                    topLeft = KeyC("7"),
                    top = KeyC("8"),
                    topRight = KeyC("9"),
                    bottomRight = KeyC("0"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    left = KeyC("a", color = ColorVariant.PRIMARY),
                    right = KeyC("d", color = ColorVariant.PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("g", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    left = KeyC("f", color = ColorVariant.PRIMARY),
                    right = KeyC("h", color = ColorVariant.PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("k", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC("j", color = ColorVariant.PRIMARY),
                    right = KeyC("l", color = ColorVariant.PRIMARY),
                    top = KeyC("\""),
                    bottom = KeyC("'"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("z", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("x", color = ColorVariant.PRIMARY),
                    left =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                        ),
                ),
                KeyItemC(
                    center = KeyC("v", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC("c", color = ColorVariant.PRIMARY),
                    right = KeyC("b", color = ColorVariant.PRIMARY),
                    bottom = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("m", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("?"),
                    top = KeyC("!"),
                    bottom = KeyC("."),
                    left = KeyC("n", color = ColorVariant.PRIMARY),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_QBASED_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("W", size = FontSizeVariant.LARGE),
                    left = KeyC("Q", color = ColorVariant.PRIMARY),
                    right = KeyC("E", color = ColorVariant.PRIMARY),
                    topLeft = KeyC("!"),
                    top = KeyC("@"),
                    topRight = KeyC("#"),
                ),
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    left = KeyC("R", color = ColorVariant.PRIMARY),
                    right = KeyC("U", color = ColorVariant.PRIMARY),
                    bottom = KeyC("Y", color = ColorVariant.PRIMARY),
                    topLeft = KeyC("$"),
                    top = KeyC("%"),
                    topRight = KeyC("^"),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    left = KeyC("I", color = ColorVariant.PRIMARY),
                    right = KeyC("P", color = ColorVariant.PRIMARY),
                    topLeft = KeyC("&"),
                    top = KeyC("*"),
                    topRight = KeyC("("),
                    bottomRight = KeyC(")"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    left = KeyC("A", color = ColorVariant.PRIMARY),
                    right = KeyC("D", color = ColorVariant.PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("G", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    left = KeyC("F", color = ColorVariant.PRIMARY),
                    right = KeyC("H", color = ColorVariant.PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("K", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    left = KeyC("J", color = ColorVariant.PRIMARY),
                    right = KeyC("L", color = ColorVariant.PRIMARY),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Z", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("X", color = ColorVariant.PRIMARY),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                ),
                KeyItemC(
                    center = KeyC("V", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    left = KeyC("C", color = ColorVariant.PRIMARY),
                    right = KeyC("B", color = ColorVariant.PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("M", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("/"),
                    left = KeyC("N", color = ColorVariant.PRIMARY),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_QBASED: KeyboardDefinition =
    KeyboardDefinition(
        title = "english qbased",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_QBASED_MAIN,
                shifted = KB_EN_QBASED_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
