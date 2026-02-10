@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_KZ_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("с", size = LARGE),
                    right = KeyC("щ"),
                    bottomRight = KeyC("й"),
                    bottom = KeyC("э"),
                ),
                KeyItemC(
                    center = KeyC("р", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("х"),
                ),
                KeyItemC(
                    center = KeyC("а", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("ж"),
                    topRight = KeyC("ә"),
                    bottomRight = KeyC("і"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("н", size = LARGE),
                    right = KeyC("м"),
                    bottom = KeyC("л"),
                    bottomRight = KeyC("ғ"),
                    topRight = KeyC("қ"),
                    bottomLeft = KeyC("ң"),
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
                    bottomRight = KeyC("ү"),
                    topRight = KeyC("ұ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("т", size = LARGE),
                    topRight = KeyC("ч"),
                    top = KeyC("ш"),
                    right = KeyC("ъ"),
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
                    bottomRight = KeyC("ө"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_KZ_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("С", size = LARGE),
                    right = KeyC("Щ"),
                    bottomRight = KeyC("Й"),
                    bottom = KeyC("Э"),
                ),
                KeyItemC(
                    center = KeyC("Р", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("Х"),
                ),
                KeyItemC(
                    center = KeyC("А", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("Ж"),
                    topRight = KeyC("Ә"),
                    bottomRight = KeyC("І"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Н", size = LARGE),
                    right = KeyC("М"),
                    bottom = KeyC("Л"),
                    bottomRight = KeyC("Ғ"),
                    topRight = KeyC("Қ"),
                    bottomLeft = KeyC("Ң"),
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
                    bottomRight = KeyC("Ү"),
                    topRight = KeyC("Ұ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Т", size = LARGE),
                    topRight = KeyC("Ч"),
                    top = KeyC("Ш"),
                    right = KeyC("Ъ"),
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
                    bottomRight = KeyC("Ө"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_KZ_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "қазақша thumb-key",
        locales = listOf("kk"),
        modes =
            KeyboardDefinitionModes(
                main = KB_KZ_THUMBKEY_MAIN,
                shifted = KB_KZ_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
