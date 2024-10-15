@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_UK_BY_RU_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("с", size = LARGE),
                    top = KeyC("ў"),
                    left = KeyC("э"),
                    bottomRight = KeyC("й"),
                ),
                KeyItemC(
                    center = KeyC("р", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("х"),
                ),
                KeyItemC(
                    center = KeyC("а", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("ы"),
                    bottomLeft = KeyC("ж"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("н", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("м"),
                ),
                KeyItemC(
                    center = KeyC("в", size = LARGE),
                    topLeft = KeyC("я"),
                    top = KeyC("ї"),
                    topRight = KeyC("ь"),
                    right = KeyC("п"),
                    bottomRight = KeyC("у"),
                    bottom = KeyC("з"),
                    bottomLeft = KeyC("г"),
                    left = KeyC("к"),
                ),
                KeyItemC(
                    center = KeyC("і", size = LARGE),
                    topLeft = KeyC("е"),
                    left = KeyC("л"),
                    bottomLeft = KeyC("ф"),
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
                    center = KeyC("т", size = LARGE),
                    topRight = KeyC("ч"),
                    top = KeyC("ш"),
                    bottom = KeyC("ъ"),
                ),
                KeyItemC(
                    center = KeyC("и", size = LARGE),
                    topLeft = KeyC("щ"),
                    top = KeyC("б"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("ц"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("о", size = LARGE),
                    topLeft = KeyC("д"),
                    top = KeyC("ю"),
                    left = KeyC("є"),
                    right = KeyC("ё"),
                    bottomRight = KeyC("ґ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_UK_BY_RU_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("С", size = LARGE),
                    top = KeyC("Ў"),
                    left = KeyC("Э"),
                    bottomRight = KeyC("Й"),
                ),
                KeyItemC(
                    center = KeyC("Р", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("Х"),
                ),
                KeyItemC(
                    center = KeyC("А", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("Ы"),
                    bottomLeft = KeyC("Ж"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Н", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("М"),
                ),
                KeyItemC(
                    center = KeyC("В", size = LARGE),
                    topLeft = KeyC("Я"),
                    top = KeyC("Ї"),
                    topRight = KeyC("Ь"),
                    right = KeyC("П"),
                    bottomRight = KeyC("У"),
                    bottom = KeyC("З"),
                    bottomLeft = KeyC("Г"),
                    left = KeyC("К"),
                ),
                KeyItemC(
                    center = KeyC("І", size = LARGE),
                    topLeft = KeyC("Е"),
                    left = KeyC("Л"),
                    bottomLeft = KeyC("Ф"),
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
                    center = KeyC("Т", size = LARGE),
                    topRight = KeyC("Ч"),
                    top = KeyC("Ш"),
                    bottom = KeyC("Ъ"),
                ),
                KeyItemC(
                    center = KeyC("И", size = LARGE),
                    topLeft = KeyC("Щ"),
                    top = KeyC("Б"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Ц"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("О", size = LARGE),
                    topLeft = KeyC("Д"),
                    top = KeyC("Ю"),
                    left = KeyC("Є"),
                    right = KeyC("Ё"),
                    bottomRight = KeyC("Ґ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_UK_BY_RU_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "українська беларуская русский thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_UK_BY_RU_THUMBKEY_MAIN,
                shifted = KB_UK_BY_RU_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
