@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_RU_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("с", size = LARGE),
                    right = KeyC("-", color = MUTED),
                    bottomRight = KeyC("п"),
                    bottom = KeyC("ц"),
                ),
                KeyItemC(
                    center = KeyC("и", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("й"),
                    bottom = KeyC("к"),
                ),
                KeyItemC(
                    center = KeyC("т", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("ь"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("в", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("б"),
                    right = KeyC("ы"),
                    bottom = KeyC("ъ"),
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
                    swipeType = FOUR_WAY_CROSS,
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
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("е", size = LARGE),
                    top = KeyC("ё"),
                    topRight = KeyC("д"),
                    right = KeyC("э"),
                ),
                KeyItemC(
                    center = KeyC("р", size = LARGE),
                    top = KeyC("у"),
                    right = KeyC("з"),
                    left = KeyC("ю"),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("н", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("ф"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_RU_MESSAGEASE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("С", size = LARGE),
                    bottomRight = KeyC("П"),
                    bottom = KeyC("Ц"),
                ),
                KeyItemC(
                    center = KeyC("И", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("Й"),
                    bottom = KeyC("К"),
                ),
                KeyItemC(
                    center = KeyC("Т", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("Ь"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("В", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Б"),
                    right = KeyC("Ы"),
                    bottom = KeyC("Ъ"),
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
                    swipeType = FOUR_WAY_CROSS,
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
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Е", size = LARGE),
                    top = KeyC("Ё"),
                    topRight = KeyC("Д"),
                    right = KeyC("Э"),
                ),
                KeyItemC(
                    center = KeyC("Р", size = LARGE),
                    top = KeyC("У"),
                    right = KeyC("З"),
                    left = KeyC("Ю"),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("Н", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("Ф"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_RU_MESSAGEASE: KeyboardDefinition =
    KeyboardDefinition(
        title = "русский messagease",
        modes =
            KeyboardDefinitionModes(
                main = KB_RU_MESSAGEASE_MAIN,
                shifted = KB_RU_MESSAGEASE_SHIFTED,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
    )
