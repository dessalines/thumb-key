@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_RU_MESSAGEASE_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("с", size = LARGE),
                    right = KeyC("-", color = MUTED),
                    bottomRight = KeyC("п"),
                    bottom = KeyC("ц"),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("и", size = LARGE),
                    top = KeyC("й"),
                    bottom = KeyC("к"),
                    topLeft = KeyC("`", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("т", size = LARGE),
                    bottomLeft = KeyC("ь"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("в", size = LARGE),
                    top = KeyC("б"),
                    right = KeyC("ы"),
                    bottom = KeyC("ъ"),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("о", size = LARGE),
                    topLeft = KeyC("ч"),
                    top = KeyC("м"),
                    topRight = KeyC("х"),
                    right = KeyC("г"),
                    bottomRight = KeyC("ш"),
                    bottom = KeyC("я"),
                    bottomLeft = KeyC("щ"),
                    left = KeyC("ж"),
                ),
                KeyItemC(
                    center = KeyC("а", size = LARGE),
                    left = KeyC("л"),
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
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("]", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("е", size = LARGE),
                    top = KeyC("ё"),
                    topRight = KeyC("д"),
                    right = KeyC("э"),
                    topLeft = KeyC("~", color = MUTED),
                    bottomRight = KeyC("*", color = MUTED),
                    left = KeyC("<", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("р", size = LARGE),
                    top = KeyC("у"),
                    right = KeyC("з"),
                    left = KeyC("ю"),
                    topRight = KeyC("'", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("н", size = LARGE),
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

val KB_RU_MESSAGEASE_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("С", size = LARGE),
                    right = KeyC("-", color = MUTED),
                    bottomRight = KeyC("П"),
                    bottom = KeyC("Ц"),
                    bottomLeft = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("И", size = LARGE),
                    top = KeyC("Й"),
                    bottom = KeyC("К"),
                    topLeft = KeyC("`", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("Т", size = LARGE),
                    bottomLeft = KeyC("Ь"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("В", size = LARGE),
                    top = KeyC("Б"),
                    right = KeyC("Ы"),
                    bottom = KeyC("Ъ"),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("О", size = LARGE),
                    topLeft = KeyC("Ч"),
                    top = KeyC("М"),
                    topRight = KeyC("Х"),
                    right = KeyC("Г"),
                    bottomRight = KeyC("Ш"),
                    bottom = KeyC("Я"),
                    bottomLeft = KeyC("Щ"),
                    left = KeyC("Ж"),
                ),
                KeyItemC(
                    center = KeyC("А", size = LARGE),
                    left = KeyC("Л"),
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
                    bottomLeft = KeyC("@", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Е", size = LARGE),
                    top = KeyC("Ё"),
                    topRight = KeyC("Д"),
                    right = KeyC("Э"),
                    topLeft = KeyC("~", color = MUTED),
                    bottomRight = KeyC("*", color = MUTED),
                    left = KeyC("<", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("Р", size = LARGE),
                    top = KeyC("У"),
                    right = KeyC("З"),
                    left = KeyC("Ю"),
                    topRight = KeyC("'", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("Н", size = LARGE),
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

val KB_RU_MESSAGEASE_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "русский messagease symbols",
        modes =
            KeyboardDefinitionModes(
                main = KB_RU_MESSAGEASE_SYMBOLS_MAIN,
                shifted = KB_RU_MESSAGEASE_SYMBOLS_SHIFTED,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
    )
