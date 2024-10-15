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

val KB_EN_SK_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    top = KeyC(KeyAction.CommitText("š")),
                    bottomRight = KeyC(KeyAction.CommitText("w")),
                    left = KeyC(KeyAction.CommitText("ô")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top = KeyC(KeyAction.CommitText("ŕ")),
                    bottom = KeyC(KeyAction.CommitText("g")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    top = KeyC(KeyAction.CommitText("ó")),
                    bottomRight = KeyC(KeyAction.CommitText("ú")),
                    bottomLeft = KeyC(KeyAction.CommitText("u")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC(KeyAction.CommitText("ň")),
                    right = KeyC(KeyAction.CommitText("m")),
                    left = KeyC(KeyAction.CommitText("ä")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("h"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC(KeyAction.CommitText("j")),
                    top = KeyC(KeyAction.CommitText("q")),
                    topRight = KeyC(KeyAction.CommitText("b")),
                    right = KeyC(KeyAction.CommitText("p")),
                    bottomRight = KeyC(KeyAction.CommitText("y")),
                    bottom = KeyC(KeyAction.CommitText("x")),
                    bottomLeft = KeyC(KeyAction.CommitText("v")),
                    left = KeyC(KeyAction.CommitText("k")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC(KeyAction.CommitText("ĺ")),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topRight = KeyC(KeyAction.CommitText("á")),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC(KeyAction.CommitText("ý")),
                    bottomLeft = KeyC(KeyAction.CommitText("ľ")),
                    left = KeyC(KeyAction.CommitText("l")),
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
                    swipeType = SwipeNWay.EIGHT_WAY,
                    top = KeyC(KeyAction.CommitText("ť")),
                    topRight = KeyC(KeyAction.CommitText("c")),
                    bottomRight = KeyC(KeyAction.CommitText("č")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC(KeyAction.CommitText("í")),
                    top = KeyC(KeyAction.CommitText("f")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC(KeyAction.CommitText("z")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC(KeyAction.CommitText("d")),
                    top = KeyC(KeyAction.CommitText("é")),
                    right = KeyC(KeyAction.CommitText("ž")),
                    bottomLeft = KeyC(KeyAction.CommitText("ď")),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_SK_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    top = KeyC(KeyAction.CommitText("Š")),
                    bottomRight = KeyC(KeyAction.CommitText("W")),
                    left = KeyC(KeyAction.CommitText("Ô")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top = KeyC(KeyAction.CommitText("Ŕ")),
                    bottom = KeyC(KeyAction.CommitText("G")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    top = KeyC(KeyAction.CommitText("Ó")),
                    bottomRight = KeyC(KeyAction.CommitText("Ú")),
                    bottomLeft = KeyC(KeyAction.CommitText("U")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC(KeyAction.CommitText("Ň")),
                    right = KeyC(KeyAction.CommitText("M")),
                    left = KeyC(KeyAction.CommitText("Ä")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("H"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC(KeyAction.CommitText("J")),
                    top = KeyC(KeyAction.CommitText("Q")),
                    topRight = KeyC(KeyAction.CommitText("B")),
                    right = KeyC(KeyAction.CommitText("P")),
                    bottomRight = KeyC(KeyAction.CommitText("Y")),
                    bottom = KeyC(KeyAction.CommitText("X")),
                    bottomLeft = KeyC(KeyAction.CommitText("V")),
                    left = KeyC(KeyAction.CommitText("K")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC(KeyAction.CommitText("Ĺ")),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topRight = KeyC(KeyAction.CommitText("Á")),
                    bottomRight = KeyC(KeyAction.CommitText("Ý")),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft = KeyC(KeyAction.CommitText("Ľ")),
                    left = KeyC(KeyAction.CommitText("L")),
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
                    swipeType = SwipeNWay.EIGHT_WAY,
                    top = KeyC(KeyAction.CommitText("Ť")),
                    topRight = KeyC(KeyAction.CommitText("C")),
                    bottomRight = KeyC(KeyAction.CommitText("Č")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC(KeyAction.CommitText("Í")),
                    top = KeyC(KeyAction.CommitText("F")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC(KeyAction.CommitText("Z")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC(KeyAction.CommitText("D")),
                    top = KeyC(KeyAction.CommitText("É")),
                    right = KeyC(KeyAction.CommitText("Ž")),
                    bottomLeft = KeyC(KeyAction.CommitText("Ď")),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_SK_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "english slovenčina thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_SK_THUMBKEY_MAIN,
                shifted = KB_EN_SK_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
