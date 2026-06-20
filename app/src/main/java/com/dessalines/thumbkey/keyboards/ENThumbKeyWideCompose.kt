@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_THUMBKEY_WIDE_COMPOSE_PUNCT_KEY =
    KeyItemC(
        center = KeyC("'", size = LARGE),
        swipeType = FOUR_WAY_DIAGONAL,
        topLeft = KeyC("!", color = MUTED),
        topRight = KeyC("?", color = MUTED),
        bottomRight = KeyC(".", color = MUTED),
        bottomLeft = KeyC(",", color = MUTED),
    )

val KB_EN_THUMBKEY_WIDE_COMPOSE_MAIN =
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
                    center = KeyC("d", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("b"),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("-"),
                            action = ComposeLastKey("-"),
                            color = MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("x"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("y"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
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
                    center = KeyC("r", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    left = KeyC("p"),
                    right = KeyC("q"),
                ),
                KB_EN_THUMBKEY_WIDE_COMPOSE_PUNCT_KEY,
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    left = KeyC("z"),
                    right = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("g"),
                ),
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
                    center = KeyC("h", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("f"),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("k"),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM.copy(
                    swipeType = TWO_WAY_VERTICAL,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = SECONDARY,
                        ),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                ),
            ),
        ),
    )

val KB_EN_THUMBKEY_WIDE_COMPOSE_SHIFTED =
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
                    center = KeyC("D", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("B"),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("-"),
                            action = ComposeLastKey("-"),
                            color = MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("Y"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
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
                    center = KeyC("R", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    left = KeyC("P"),
                    right = KeyC("Q"),
                ),
                KB_EN_THUMBKEY_WIDE_COMPOSE_PUNCT_KEY,
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    left = KeyC("Z"),
                    right = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("G"),
                ),
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
                    center = KeyC("H", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("F"),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("K"),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM.copy(
                    swipeType = TWO_WAY_VERTICAL,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = SECONDARY,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = SECONDARY,
                        ),
                ),
            ),
        ),
    )

val KB_EN_THUMBKEY_WIDE_COMPOSE: KeyboardDefinition =
    KeyboardDefinition(
        title = "english thumb-key wide compose",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_WIDE_COMPOSE_MAIN,
                shifted = KB_EN_THUMBKEY_WIDE_COMPOSE_SHIFTED,
                numeric = WIDE_NUMERIC_KEYBOARD,
            ),
    )
