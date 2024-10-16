@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_BY_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("с", size = LARGE),
                    right = KeyC("ў"),
                    bottomRight = KeyC("й"),
                    bottom = KeyC("э"),
                ),
                KeyItemC(
                    center = KeyC("р", size = LARGE),
                    bottom = KeyC("х"),
                ),
                KeyItemC(
                    center = KeyC("а", size = LARGE),
                    bottomLeft = KeyC("ж"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("н", size = LARGE),
                    right = KeyC("м"),
                    bottom = KeyC("л"),
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
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("т", size = LARGE),
                    topRight = KeyC("ч"),
                    top = KeyC("ш"),
                ),
                KeyItemC(
                    center = KeyC("і", size = LARGE),
                    top = KeyC("б"),
                    right = KeyC("ц"),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'"),
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
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_BY_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("С", size = LARGE),
                    right = KeyC("Ў"),
                    bottomRight = KeyC("Й"),
                    bottom = KeyC("Э"),
                ),
                KeyItemC(
                    center = KeyC("Р", size = LARGE),
                    bottom = KeyC("Х"),
                ),
                KeyItemC(
                    center = KeyC("А", size = LARGE),
                    bottomLeft = KeyC("Ж"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Н", size = LARGE),
                    right = KeyC("М"),
                    bottom = KeyC("Л"),
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
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Т", size = LARGE),
                    topRight = KeyC("Ч"),
                    top = KeyC("Ш"),
                ),
                KeyItemC(
                    center = KeyC("І", size = LARGE),
                    top = KeyC("Б"),
                    right = KeyC("Ц"),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'"),
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
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_BY_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "беларуская thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_BY_THUMBKEY_MAIN,
                shifted = KB_BY_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
