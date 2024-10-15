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

val KB_EU_ES_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC(KeyAction.CommitText("s")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("z"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC(KeyAction.CommitText("h")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft = KeyC(KeyAction.CommitText("d")),
                    right = KeyC(KeyAction.CommitText("í")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC(KeyAction.CommitText("g")),
                    left = KeyC(KeyAction.CommitText("w")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("u"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("c")),
                    top = KeyC(KeyAction.CommitText("m")),
                    topRight = KeyC(KeyAction.CommitText("j")),
                    right = KeyC(KeyAction.CommitText("ú")),
                    bottomRight = KeyC(KeyAction.CommitText("x")),
                    bottom = KeyC(KeyAction.CommitText("v")),
                    bottomLeft = KeyC(KeyAction.CommitText("y")),
                    left = KeyC(KeyAction.CommitText("f")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC(KeyAction.CommitText("b")),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC(KeyAction.CommitText("é")),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight = KeyC(KeyAction.CommitText("l")),
                    left = KeyC(KeyAction.CommitText("ñ")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("¡"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("p")),
                    left = KeyC(KeyAction.CommitText("q")),
                    right = KeyC(KeyAction.CommitText("ó")),
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
                            KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("k")),
                    right = KeyC(KeyAction.CommitText("á")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("¿"),
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

val KB_EU_ES_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC(KeyAction.CommitText("S")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Z"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC(KeyAction.CommitText("H")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft = KeyC(KeyAction.CommitText("D")),
                    right = KeyC(KeyAction.CommitText("Í")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC(KeyAction.CommitText("G")),
                    left = KeyC(KeyAction.CommitText("W")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("U"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("C")),
                    top = KeyC(KeyAction.CommitText("M")),
                    topRight = KeyC(KeyAction.CommitText("J")),
                    right = KeyC(KeyAction.CommitText("Ú")),
                    bottomRight = KeyC(KeyAction.CommitText("X")),
                    bottom = KeyC(KeyAction.CommitText("V")),
                    bottomLeft = KeyC(KeyAction.CommitText("Y")),
                    left = KeyC(KeyAction.CommitText("F")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC(KeyAction.CommitText("B")),
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
                    right = KeyC(KeyAction.CommitText("É")),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight = KeyC(KeyAction.CommitText("L")),
                    left = KeyC(KeyAction.CommitText("Ñ")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("¡"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("P")),
                    left = KeyC(KeyAction.CommitText("Q")),
                    right = KeyC(KeyAction.CommitText("Ó")),
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
                            KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("K")),
                    right = KeyC(KeyAction.CommitText("Á")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("¿"),
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

val KB_EU_ES_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "euskara español thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_EU_ES_THUMBKEY_MAIN,
                shifted = KB_EU_ES_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
