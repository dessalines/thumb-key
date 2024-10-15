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

val KB_EN_THUMBKEY_COMPOSE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("w"),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\""),
                            action = KeyAction.ComposeLastKey("\""),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("^"),
                            action = KeyAction.ComposeLastKey("^"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("~"),
                            action = KeyAction.ComposeLastKey("~"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            KeyAction.CommitText("g"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("u"),
                        ),
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
                    swipeType = SwipeNWay.EIGHT_WAY,
                    right =
                        KeyC(
                            KeyAction.CommitText("m"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ˇ"),
                            action = KeyAction.ComposeLastKey("ˇ"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("˘"),
                            action = KeyAction.ComposeLastKey("˘"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("`"),
                            action = KeyAction.ComposeLastKey("`"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("'"),
                            action = KeyAction.ComposeLastKey("'"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("h"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("j"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("q"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("b"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("p"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("y"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("x"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("v"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("k"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            KeyAction.CommitText("l"),
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
                            KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight =
                        KeyC(
                            KeyAction.CommitText("c"),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("°/"),
                            action = KeyAction.ComposeLastKey("°"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¿¡ßç"),
                            action = KeyAction.ComposeLastKey("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\$"),
                            action = KeyAction.ComposeLastKey("\$"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("f"),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay(" "),
                            action = KeyAction.CommitText("f"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("z"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("d"),
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

val KB_EN_THUMBKEY_COMPOSE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("W"),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\""),
                            action = KeyAction.ComposeLastKey("\""),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("^"),
                            action = KeyAction.ComposeLastKey("^"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("~"),
                            action = KeyAction.ComposeLastKey("~"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom =
                        KeyC(
                            KeyAction.CommitText("G"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("U"),
                        ),
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
                    swipeType = SwipeNWay.EIGHT_WAY,
                    right =
                        KeyC(
                            KeyAction.CommitText("M"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ˇ"),
                            action = KeyAction.ComposeLastKey("ˇ"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("˘"),
                            action = KeyAction.ComposeLastKey("˘"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("'"),
                            action = KeyAction.ComposeLastKey("'"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("`"),
                            action = KeyAction.ComposeLastKey("`"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("H"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("J"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Q"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("B"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("P"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("Y"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("X"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("V"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("K"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            KeyAction.CommitText("L"),
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
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight =
                        KeyC(
                            KeyAction.CommitText("C"),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("°/"),
                            action = KeyAction.ComposeLastKey("°"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¿¡ßÇ"),
                            action = KeyAction.ComposeLastKey("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\$"),
                            action = KeyAction.ComposeLastKey("\$"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("F"),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay(" "),
                            action = KeyAction.CommitText("F"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Z"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("D"),
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

val KB_EN_THUMBKEY_COMPOSE: KeyboardDefinition =
    KeyboardDefinition(
        title = "english thumb-key compose",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_COMPOSE_MAIN,
                shifted = KB_EN_THUMBKEY_COMPOSE_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
