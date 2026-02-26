@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_THUMBKEY_COMPOSE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("w"),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\""),
                            action = ComposeLastKey("\""),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("^"),
                            action = ComposeLastKey("^"),
                            color = MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("~"),
                            action = ComposeLastKey("~"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("g"),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("-"),
                            action = ComposeLastKey("-"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("u"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = EIGHT_WAY,
                    right = KeyC("m"),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ˇ"),
                            action = ComposeLastKey("ˇ"),
                            color = MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("˘"),
                            action = ComposeLastKey("˘"),
                            color = MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("`"),
                            action = ComposeLastKey("`"),
                            color = MUTED,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("'"),
                            action = ComposeLastKey("'"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    topLeft = KeyC("j"),
                    top = KeyC("q"),
                    topRight = KeyC("b"),
                    right = KeyC("p"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("x"),
                    bottomLeft = KeyC("v"),
                    left = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("l"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("c"),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("°/"),
                            action = ComposeLastKey("°"),
                            color = MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¿¡ßç"),
                            action = ComposeLastKey("!"),
                            color = MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\$"),
                            action = ComposeLastKey("\$"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("f"),
                    topLeft = KeyC("f", displayText = " "),
                    topRight = KeyC("'"),
                    right = KeyC("z"),
                    bottomRight = KeyC("-"),
                    bottom = KeyC("."),
                    bottomLeft = KeyC("*"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("d"),
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
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("W"),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\""),
                            action = ComposeLastKey("\""),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("^"),
                            action = ComposeLastKey("^"),
                            color = MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("~"),
                            action = ComposeLastKey("~"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("G"),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("-"),
                            action = ComposeLastKey("-"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("U"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = EIGHT_WAY,
                    right = KeyC("M"),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ˇ"),
                            action = ComposeLastKey("ˇ"),
                            color = MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("˘"),
                            action = ComposeLastKey("˘"),
                            color = MUTED,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("'"),
                            action = ComposeLastKey("'"),
                            color = MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("`"),
                            action = ComposeLastKey("`"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    topLeft = KeyC("J"),
                    top = KeyC("Q"),
                    topRight = KeyC("B"),
                    right = KeyC("P"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("X"),
                    bottomLeft = KeyC("V"),
                    left = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("L"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("C"),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("°/"),
                            action = ComposeLastKey("°"),
                            color = MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¿¡ßÇ"),
                            action = ComposeLastKey("!"),
                            color = MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\$"),
                            action = ComposeLastKey("\$"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("F"),
                    topLeft = KeyC("F", displayText = " "),
                    topRight = KeyC("'"),
                    right = KeyC("Z"),
                    bottomRight = KeyC("-"),
                    bottom = KeyC("."),
                    bottomLeft = KeyC("*"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("D"),
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
        locales = listOf("en"),
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
