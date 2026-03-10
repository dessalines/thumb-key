@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardCapslock
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_RU_HYPER_MAIN =
    KeyboardC(
        listOf(
            listOf(
                RETURN_KEY_ITEM,
                KeyItemC(
                    center = KeyC("н", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("`", color = MUTED),
                    bottom = KeyC("ж"),
                ),
                KeyItemC(
                    center = KeyC("с", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("!", color = MUTED),
                    left = KeyC("э"),
                    right = KeyC("ы"),
                ),
                KeyItemC(
                    center = KeyC("в", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("у"),
                    bottom = KeyC("ш"),
                ),
                KeyItemC(
                    center = KeyC("о", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("@", color = MUTED),
                    bottom = KeyC("й"),
                    right = KeyC("я"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("т", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("б"),
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
                KeyItemC(
                    center = KeyC("а", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC(".", color = MUTED),
                    top = KeyC(",", color = MUTED),
                    bottom = KeyC("?", color = MUTED),
                    right = KeyC("д"),
                ),
                KeyItemC(
                    center = KeyC("л", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("п"),
                    bottom = KeyC("х"),
                    top = KeyC("ф"),
                ),
                KeyItemC(
                    center = KeyC("е", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ц"),
                    bottom = KeyC("ю"),
                    top = KeyC("-", color = MUTED),
                    right = KeyC("г"),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("р", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("\"", color = MUTED),
                    top = KeyC("ё"),
                    left = KeyC("щ"),
                ),
                KeyItemC(
                    center = KeyC("и", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("'", color = MUTED),
                    left = KeyC(";", color = MUTED),
                    right = KeyC("з"),
                ),
                KeyItemC(
                    center = KeyC("к", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ч"),
                    top = KeyC("ъ"),
                ),
                KeyItemC(
                    center = KeyC("м", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("#", color = MUTED),
                    top = KeyC("/", color = MUTED),
                    right = KeyC("ь"),
                ),
                EMOJI_KEY_ITEM,
            ),
        ),
    )

val KB_RU_HYPER_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                RETURN_KEY_ITEM,
                KeyItemC(
                    center = KeyC("Н", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("~", color = MUTED),
                    bottom = KeyC("Ж"),
                ),
                KeyItemC(
                    center = KeyC("С", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("!", color = MUTED),
                    left = KeyC("Э"),
                    right = KeyC("Ы"),
                ),
                KeyItemC(
                    center = KeyC("В", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("У"),
                    bottom = KeyC("Ш"),
                ),
                KeyItemC(
                    center = KeyC("О", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("@", color = MUTED),
                    bottom = KeyC("Й"),
                    right = KeyC("Я"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("Т", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Б"),
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
                KeyItemC(
                    center = KeyC("А", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC(".", color = MUTED),
                    top = KeyC(",", color = MUTED),
                    bottom = KeyC("?", color = MUTED),
                    right = KeyC("Д"),
                ),
                KeyItemC(
                    center = KeyC("Л", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("П"),
                    bottom = KeyC("Х"),
                    top = KeyC("Ф"),
                ),
                KeyItemC(
                    center = KeyC("Е", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("Ц"),
                    bottom = KeyC("Ю"),
                    top = KeyC("_", color = MUTED),
                    right = KeyC("Г"),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("Р", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("\"", color = MUTED),
                    top = KeyC("Ё"),
                    left = KeyC("Щ"),
                ),
                KeyItemC(
                    center = KeyC("И", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("'", color = MUTED),
                    left = KeyC(":", color = MUTED),
                    right = KeyC("З"),
                ),
                KeyItemC(
                    center = KeyC("К", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Ч"),
                    top = KeyC("Ъ"),
                ),
                KeyItemC(
                    center = KeyC("М", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("#", color = MUTED),
                    top = KeyC("/", color = MUTED),
                    right = KeyC("Ь"),
                ),
                EMOJI_KEY_ITEM,
            ),
        ),
    )

val KB_RU_HYPER: KeyboardDefinition =
    KeyboardDefinition(
        title = "русский hyper",
        modes =
            KeyboardDefinitionModes(
                main = KB_RU_HYPER_MAIN,
                shifted = KB_RU_HYPER_SHIFTED,
                numeric = HYPER_NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
