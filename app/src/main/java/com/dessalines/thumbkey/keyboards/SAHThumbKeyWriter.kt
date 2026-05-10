@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_SAH_THUMBKEY_WRITER_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("с", size = LARGE),
                    right = KeyC("щ"),
                    bottomRight = KeyC("й"),
                    bottom = KeyC("з"),
                    bottomLeft = KeyC("$", color = MUTED),
                    left = KeyC("«", color = MUTED),
                    topLeft = KeyC("„", color = MUTED),
                    top = KeyC("ч"),
                    topRight = KeyC("ф"),
                ),
                KeyItemC(
                    center = KeyC("р", size = LARGE),
                    bottom = KeyC("г"),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("о", size = LARGE),
                    bottomLeft = KeyC("ы"),
                    left = KeyC("?", color = MUTED),
                    topLeft = KeyC("е"),
                    top = KeyC("я"),
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
                    bottom = KeyC("ҥ"),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    top = KeyC("–", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("у", size = LARGE),
                    topLeft = KeyC("ҕ"),
                    top = KeyC("ө"),
                    topRight = KeyC("ь"),
                    right = KeyC("п"),
                    bottomRight = KeyC("ү"),
                    bottom = KeyC("х"),
                    bottomLeft = KeyC("в"),
                    left = KeyC("һ"),
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
                    topRight = KeyC("к"),
                    top = KeyC("ш"),
                    right = KeyC("ъ"),
                    topLeft = KeyC("~", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC("—", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                    left = KeyC("ж", color = MUTED),
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
                    center = KeyC("э", size = LARGE),
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

val KB_SAH_THUMBKEY_WRITER_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("С", size = LARGE),
                    right = KeyC("Щ"),
                    bottomRight = KeyC("Й"),
                    bottom = KeyC("З"),
                    bottomLeft = KeyC("$", color = MUTED),
                    left = KeyC("«", color = MUTED),
                    topLeft = KeyC("„", color = MUTED),
                    top = KeyC("Ч"),
                    topRight = KeyC("Ф"),
                ),
                KeyItemC(
                    center = KeyC("Р", size = LARGE),
                    bottom = KeyC("Г"),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("О", size = LARGE),
                    bottomLeft = KeyC("Ы"),
                    left = KeyC("?", color = MUTED),
                    topLeft = KeyC("Е"),
                    top = KeyC("Я"),
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
                    bottom = KeyC("Ҥ"),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    top = KeyC("–", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("У", size = LARGE),
                    topLeft = KeyC("Ҕ"),
                    top = KeyC("Ө"),
                    topRight = KeyC("Ь"),
                    right = KeyC("П"),
                    bottomRight = KeyC("Ү"),
                    bottom = KeyC("Х"),
                    bottomLeft = KeyC("В"),
                    left = KeyC("Һ"),
                ),
                KeyItemC(
                    center = KeyC("А", size = LARGE),
                    left = KeyC("Л"),
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
                    topRight = KeyC("К"),
                    top = KeyC("Ш"),
                    right = KeyC("Ъ"),
                    topLeft = KeyC("~", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC("—", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                    left = KeyC("Ж", color = MUTED),
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
                    center = KeyC("Э", size = LARGE),
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

val KB_SAH_THUMBKEY_WRITER: KeyboardDefinition =
    KeyboardDefinition(
        title = "саха thumb-key writer",
        modes =
            KeyboardDefinitionModes(
                main = KB_SAH_THUMBKEY_WRITER_MAIN,
                shifted = KB_SAH_THUMBKEY_WRITER_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
