@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_DE_THUMBKEY_WORDS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    top = KeyC("die", color = MUTED, size = SMALLEST),
                    topLeft = KeyC("der", color = MUTED, size = SMALLEST),
                    left = KeyC("ein", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ck"), // mi
                            action = CommitText("ck"),
                        ),
                    bottomRight = KeyC("c"),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("-"), // mi
                            action = CommitText("-"),
                            color = MUTED,
                        ),
                    topRight = KeyC("das", color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    top = KeyC("nach", color = MUTED, size = SMALLEST),
                    topLeft = KeyC("von", color = MUTED, size = SMALLEST),
                    left = KeyC("und", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottom = KeyC("f"),
                    bottomRight = KeyC("\\", color = MUTED),
                    right = KeyC("mit", color = MUTED, size = SMALLEST),
                    topRight = KeyC("für", color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    top = KeyC("hat", color = MUTED, size = SMALLEST),
                    topLeft = KeyC("ist", color = MUTED, size = SMALLEST),
                    topRight = KeyC("wird", color = MUTED, size = SMALLEST),
                    left = KeyC("?", color = MUTED),
                    bottomLeft = KeyC("l"),
                    bottom = KeyC("ä"),
                    bottomRight = KeyC("€", color = MUTED),
                    right = KeyC("!", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("sch"), // mi
                            action = CommitText("sch"),
                        ),
                    topLeft = KeyC("was", color = MUTED, size = SMALLEST),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("wie", color = MUTED, size = SMALLEST),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ch"), // mi
                            action = CommitText("ch"),
                        ),
                    bottomRight = KeyC("_", color = MUTED),
                    right = KeyC("m"),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    top = KeyC("q"),
                    topLeft = KeyC("j"),
                    left = KeyC("p"),
                    bottomLeft = KeyC("v"),
                    bottom = KeyC("x"),
                    bottomRight = KeyC("w"),
                    right = KeyC("k"),
                    topRight = KeyC("z"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topLeft = KeyC("|", color = MUTED),
                    left = KeyC("o"),
                    bottomLeft = KeyC("@", color = MUTED),
                    bottom = KeyC("ö"),
                    bottomRight = KeyC("ohne", color = MUTED, size = SMALLEST),
                    right = KeyC(")", color = MUTED),
                    topRight = KeyC("nicht", color = MUTED, size = SMALLEST),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    topLeft = KeyC("aber", color = MUTED, size = SMALLEST),
                    left = KeyC("weil", color = MUTED, size = SMALLEST),
                    bottom = KeyC("wenn", color = MUTED, size = SMALLEST),
                    right = KeyC("*", color = MUTED),
                    topRight = KeyC("g"),
                    top = KeyC("sondern", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("auch", color = MUTED, size = SMALLEST),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¿¡"), // mi
                            action = ComposeLastKey("!"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    top = KeyC("b"),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("ß"),
                    bottomLeft = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    right = KeyC("y"),
                    topRight = KeyC("'", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    top = KeyC("ich", color = MUTED, size = SMALLEST),
                    topLeft = KeyC("u"),
                    left = KeyC("#", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC("ü"),
                    bottomRight = KeyC("schon", color = MUTED, size = SMALLEST),
                    right = KeyC("als", color = MUTED, size = SMALLEST),
                    topRight = KeyC("sie", color = MUTED, size = SMALLEST),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DE_THUMBKEY_WORDS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    top = KeyC("Die", color = MUTED, size = SMALLEST),
                    topLeft = KeyC("Der", color = MUTED, size = SMALLEST),
                    left = KeyC("Ein", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottom = KeyC("§", color = MUTED),
                    bottomRight = KeyC("C"),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("-"), // mi
                            action = CommitText("-"),
                            color = MUTED,
                        ),
                    topRight = KeyC("Das", color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    top = KeyC("Nach", color = MUTED, size = SMALLEST),
                    topLeft = KeyC("Von", color = MUTED, size = SMALLEST),
                    left = KeyC("Und", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("/", color = MUTED),
                    bottom = KeyC("F"),
                    bottomRight = KeyC("\\", color = MUTED),
                    right = KeyC("Mit", color = MUTED, size = SMALLEST),
                    topRight = KeyC("Für", color = MUTED, size = SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    top = KeyC("Hat", color = MUTED, size = SMALLEST),
                    topLeft = KeyC("Ist", color = MUTED, size = SMALLEST),
                    topRight = KeyC("Wird", color = MUTED, size = SMALLEST),
                    left = KeyC("?", color = MUTED),
                    bottomLeft = KeyC("L"),
                    bottom = KeyC("Ä"),
                    bottomRight = KeyC("€", color = MUTED),
                    right = KeyC("!", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("Sch"), // mi
                            action = CommitText("Sch"),
                        ),
                    topLeft = KeyC("Was", color = MUTED, size = SMALLEST),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("Wie", color = MUTED, size = SMALLEST),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("Ch"), // mi
                            action = CommitText("Ch"),
                        ),
                    bottomRight = KeyC("_", color = MUTED),
                    right = KeyC("M"),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    top = KeyC("Q"),
                    topLeft = KeyC("J"),
                    left = KeyC("P"),
                    bottomLeft = KeyC("V"),
                    bottom = KeyC("X"),
                    bottomRight = KeyC("W"),
                    right = KeyC("K"),
                    topRight = KeyC("Z"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topLeft = KeyC("|", color = MUTED),
                    left = KeyC("O"),
                    bottomLeft = KeyC("Ö"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    bottomRight = KeyC("Ohne", color = MUTED, size = SMALLEST),
                    right = KeyC(")", color = MUTED),
                    topRight = KeyC("Nicht", color = MUTED, size = SMALLEST),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    topLeft = KeyC("Aber", color = MUTED, size = SMALLEST),
                    left = KeyC("Weil", color = MUTED, size = SMALLEST),
                    bottom = KeyC("Wenn", color = MUTED, size = SMALLEST),
                    right = KeyC("*", color = MUTED),
                    topRight = KeyC("G"),
                    top = KeyC("Sondern", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("Auch", color = MUTED, size = SMALLEST),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¿¡"), // mi
                            action = ComposeLastKey("!"),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    top = KeyC("B"),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("ẞ"),
                    bottomLeft = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    right = KeyC("Y"),
                    topRight = KeyC("'", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    top = KeyC("Ich", color = MUTED, size = SMALLEST),
                    topLeft = KeyC("U"),
                    left = KeyC("#", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC("Ü"),
                    bottomRight = KeyC("Schon", color = MUTED, size = SMALLEST),
                    right = KeyC("Als", color = MUTED, size = SMALLEST),
                    topRight = KeyC("Sie", color = MUTED, size = SMALLEST),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DE_THUMBKEY_WORDS: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch thumb-key words",
        locales = listOf("de"),
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_THUMBKEY_WORDS_MAIN,
                shifted = KB_DE_THUMBKEY_WORDS_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
