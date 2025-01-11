@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_BR_FR_THUMBKEY_COMPOSE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    topLeft = KeyC("«"),
                    top = KeyC("»"),
                    topRight = KeyC("'"),
                    right = KeyC("^"),
                    bottomRight = KeyC("q"),
                    bottom = KeyC("-"),
                    left = KeyC("\""),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    top = KeyC("ü"),
                    right = KeyC("û"),
                    bottomRight = KeyC("ù"),
                    bottom = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    topLeft = KeyC("ꝃ"),
                    top = KeyC("ï"),
                    right = KeyC("î"),
                    bottomRight = KeyC("k"),
                    bottomLeft = KeyC("y"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("'"),
                            action = ComposeLastKey("'"),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\""),
                            action = ComposeLastKey("\""),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ˇ"),
                            action = ComposeLastKey("ˇ"),
                            color = MUTED,
                        ),
                    right = KeyC("v"),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("˘"),
                            action = ComposeLastKey("˘"),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("^"),
                            action = ComposeLastKey("^"),
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
                    center = KeyC("n", size = LARGE),
                    topLeft = KeyC("w"),
                    top = KeyC("j"),
                    topRight = KeyC("g"),
                    right = KeyC("b"),
                    bottomRight = KeyC("f"),
                    bottom = KeyC("h"),
                    bottomLeft = KeyC("x"),
                    left = KeyC("ñ"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topRight = KeyC("@", color = MUTED),
                    right = KeyC("â", color = MUTED),
                    bottomRight = KeyC("à", color = MUTED),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomLeft = KeyC("æ"),
                    left = KeyC("d"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("°/"),
                            action = ComposeLastKey("°"),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("~"),
                            action = ComposeLastKey("~"),
                            color = MUTED,
                        ),
                    topRight = KeyC("m"),
                    right = KeyC("?"),
                    bottomRight = KeyC("!"),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¿¡ßç"),
                            action = ComposeLastKey("!"),
                            color = MUTED,
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\$"),
                            action = ComposeLastKey("\$"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("ç"),
                    top = KeyC("c"),
                    topRight = KeyC("c'h"),
                    right = KeyC("ch"),
                    bottomRight = KeyC("*"),
                    bottom = KeyC("."),
                    bottomLeft = KeyC(","),
                    left = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("o"),
                    top = KeyC("ë"),
                    topRight = KeyC("é"),
                    right = KeyC("ê"),
                    bottomRight = KeyC("è"),
                    bottomLeft = KeyC("œ"),
                    left = KeyC("ô"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_BR_FR_THUMBKEY_COMPOSE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    topLeft = KeyC("«"),
                    top = KeyC("»"),
                    topRight = KeyC("'"),
                    right = KeyC("^"),
                    bottomRight = KeyC("Q"),
                    bottom = KeyC("-"),
                    left = KeyC("\""),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    top = KeyC("Ü"),
                    right = KeyC("Û"),
                    bottomRight = KeyC("Ù"),
                    bottom = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    topLeft = KeyC("Ꝃ"),
                    top = KeyC("Ï"),
                    right = KeyC("Î"),
                    bottomRight = KeyC("K"),
                    bottomLeft = KeyC("Y"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("'"),
                            action = ComposeLastKey("'"),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\""),
                            action = ComposeLastKey("\""),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ˇ"),
                            action = ComposeLastKey("ˇ"),
                            color = MUTED,
                        ),
                    right = KeyC("V"),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("˘"),
                            action = ComposeLastKey("˘"),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("^"),
                            action = ComposeLastKey("^"),
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
                    center = KeyC("N", size = LARGE),
                    topLeft = KeyC("W"),
                    top = KeyC("J"),
                    topRight = KeyC("G"),
                    right = KeyC("B"),
                    bottomRight = KeyC("F"),
                    bottom = KeyC("H"),
                    bottomLeft = KeyC("X"),
                    left = KeyC("Ñ"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topRight = KeyC("@"),
                    right = KeyC("Â"),
                    bottomRight = KeyC("À"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    bottomLeft = KeyC("Æ"),
                    left = KeyC("D"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("°/"),
                            action = ComposeLastKey("°"),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("~"),
                            action = ComposeLastKey("~"),
                            color = MUTED,
                        ),
                    topRight = KeyC("M"),
                    right = KeyC("?"),
                    bottomRight = KeyC("!"),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¿¡ßç"),
                            action = ComposeLastKey("!"),
                            color = MUTED,
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("\$"),
                            action = ComposeLastKey("\$"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("Ç"),
                    top = KeyC("C"),
                    topRight = KeyC("C'H"),
                    right = KeyC("CH"),
                    bottomRight = KeyC("*"),
                    bottom = KeyC("."),
                    bottomLeft = KeyC(","),
                    left = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("O"),
                    top = KeyC("Ë"),
                    topRight = KeyC("É"),
                    right = KeyC("Ê"),
                    bottomRight = KeyC("È"),
                    bottomLeft = KeyC("Œ"),
                    left = KeyC("Ô"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_BR_FR_THUMBKEY_COMPOSE: KeyboardDefinition =
    KeyboardDefinition(
        title = "brezhoneg français thumb-key compose",
        modes =
            KeyboardDefinitionModes(
                main = KB_BR_FR_THUMBKEY_COMPOSE_MAIN,
                shifted = KB_BR_FR_THUMBKEY_COMPOSE_SHIFTED,
                numeric = FRENCH_NUMERIC_KEYBOARD,
            ),
    )
