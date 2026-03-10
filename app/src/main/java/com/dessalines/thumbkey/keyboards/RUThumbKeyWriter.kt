@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_RU_THUMBKEY_WRITER_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("с", size = LARGE),
                    right = KeyC("щ"),
                    bottomRight = KeyC("й"),
                    bottom = KeyC("э"),
                    bottomLeft = KeyC("$", color = MUTED),
                    left = KeyC("«", color = MUTED),
                    topLeft = KeyC("„", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("р", size = LARGE),
                    bottom = KeyC("х"),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("а", size = LARGE),
                    bottomLeft = KeyC("ж"),
                    left = KeyC("?", color = MUTED),
                    topRight = KeyC("“", color = MUTED),
                    right = KeyC("»", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("н", size = LARGE),
                    right = KeyC("м"),
                    bottom = KeyC("л"),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    top = KeyC("–", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("в", size = LARGE),
                    topLeft = KeyC("я"),
                    top = KeyC("ы"),
                    topRight = KeyC("ь"),
                    right = KeyC("п"),
                    bottomRight = KeyC("у"),
                    bottom = KeyC("з"),
                    bottomLeft = KeyC("г"),
                    left = KeyC("к"),
                ),
                KeyItemC(
                    center = KeyC("е", size = LARGE),
                    left = KeyC("ф"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
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
                    center = KeyC("т", size = LARGE),
                    topRight = KeyC("ч"),
                    top = KeyC("ш"),
                    right = KeyC("ъ"),
                    topLeft = KeyC("~", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC("—", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                    left = KeyC("…", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("и", size = LARGE),
                    top = KeyC("б"),
                    right = KeyC("ц"),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("о", size = LARGE),
                    topLeft = KeyC("д"),
                    bottom = KeyC("ю"),
                    right = KeyC("ё"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    bottomRight = KeyC(">", color = MUTED),
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

val KB_RU_THUMBKEY_WRITER_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("С", size = LARGE),
                    right = KeyC("Щ"),
                    bottomRight = KeyC("Й"),
                    bottom = KeyC("Э"),
                    bottomLeft = KeyC("$", color = MUTED),
                    left = KeyC("«", color = MUTED),
                    topLeft = KeyC("„", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("Р", size = LARGE),
                    bottom = KeyC("Х"),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("А", size = LARGE),
                    bottomLeft = KeyC("Ж"),
                    left = KeyC("?", color = MUTED),
                    topRight = KeyC("“", color = MUTED),
                    right = KeyC("»", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Н", size = LARGE),
                    right = KeyC("М"),
                    bottom = KeyC("Л"),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    top = KeyC("–", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("В", size = LARGE),
                    topLeft = KeyC("Я"),
                    top = KeyC("Ы"),
                    topRight = KeyC("Ь"),
                    right = KeyC("П"),
                    bottomRight = KeyC("У"),
                    bottom = KeyC("З"),
                    bottomLeft = KeyC("Г"),
                    left = KeyC("К"),
                ),
                KeyItemC(
                    center = KeyC("Е", size = LARGE),
                    left = KeyC("Ф"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
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
                    center = KeyC("Т", size = LARGE),
                    topRight = KeyC("Ч"),
                    top = KeyC("Ш"),
                    right = KeyC("Ъ"),
                    topLeft = KeyC("~", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC("—", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                    left = KeyC("…", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("И", size = LARGE),
                    top = KeyC("Б"),
                    right = KeyC("Ц"),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("О", size = LARGE),
                    topLeft = KeyC("Д"),
                    bottom = KeyC("Ю"),
                    right = KeyC("Ё"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    bottomRight = KeyC(">", color = MUTED),
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

val KB_RU_THUMBKEY_WRITER: KeyboardDefinition =
    KeyboardDefinition(
        title = "русский writer thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_RU_THUMBKEY_WRITER_MAIN,
                shifted = KB_RU_THUMBKEY_WRITER_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
