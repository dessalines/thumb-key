@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_BG_MESSAGEASE_PHONETIC_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("а", size = LARGE),
                    bottomRight = KeyC("ж"),
                    bottom = KeyC("ч"),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("н", size = LARGE),
                    bottom = KeyC("л"),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("и", size = LARGE),
                    bottomLeft = KeyC("х"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("в", size = LARGE),
                    right = KeyC("к"),
                    top = KeyC("ъ"),
                    bottom = KeyC("ь"),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("о", size = LARGE),
                    topLeft = KeyC("я"),
                    top = KeyC("у"),
                    topRight = KeyC("п"),
                    right = KeyC("б"),
                    bottomRight = KeyC("й"),
                    bottom = KeyC("д"),
                    bottomLeft = KeyC("г"),
                    left = KeyC("ц"),
                ),
                KeyItemC(
                    center = KeyC("р", size = LARGE),
                    left = KeyC("м"),
                    bottomLeft = KeyC("ѝ"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
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
                    center = KeyC("т", size = LARGE),
                    topRight = KeyC("ю"),
                    topLeft = KeyC("~", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = MUTED),
                    left = KeyC("<", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("е", size = LARGE),
                    top = KeyC("ш"),
                    topRight = KeyC("щ"),
                    right = KeyC("з"),
                    left = KeyC("„", color = MUTED),
                    topLeft = KeyC("“", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("с", size = LARGE),
                    topLeft = KeyC("ф"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("#", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_BG_MESSAGEASE_PHONETIC_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("А", size = LARGE),
                    bottomRight = KeyC("Ж"),
                    bottom = KeyC("Ч"),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("Н", size = LARGE),
                    bottom = KeyC("Л"),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("И", size = LARGE),
                    bottomLeft = KeyC("Х"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("В", size = LARGE),
                    right = KeyC("К"),
                    top = KeyC("Ъ"),
                    bottom = KeyC("Ь"),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("О", size = LARGE),
                    topLeft = KeyC("Я"),
                    top = KeyC("У"),
                    topRight = KeyC("П"),
                    right = KeyC("Б"),
                    bottomRight = KeyC("Й"),
                    bottom = KeyC("Д"),
                    bottomLeft = KeyC("Г"),
                    left = KeyC("Ц"),
                ),
                KeyItemC(
                    center = KeyC("Р", size = LARGE),
                    left = KeyC("М"),
                    bottomLeft = KeyC("Ѝ"),
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
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Т", size = LARGE),
                    topRight = KeyC("Ю"),
                    topLeft = KeyC("~", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("Е", size = LARGE),
                    top = KeyC("Ш"),
                    topRight = KeyC("Щ"),
                    right = KeyC("З"),
                    left = KeyC("„", color = MUTED),
                    topLeft = KeyC("“", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("С", size = LARGE),
                    topLeft = KeyC("Ф"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("#", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_BG_MESSAGEASE_PHONETIC_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "bulgarian messagease phonetic symbols",
        modes =
            KeyboardDefinitionModes(
                main = KB_BG_MESSAGEASE_PHONETIC_SYMBOLS_MAIN,
                shifted = KB_BG_MESSAGEASE_PHONETIC_SYMBOLS_SHIFTED,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
