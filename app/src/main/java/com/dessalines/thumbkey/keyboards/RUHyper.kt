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
                    center = KeyC("р", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("`", color = MUTED),
                    bottom = KeyC("й"),
                ),
                KeyItemC(
                    center = KeyC("в", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("!", color = MUTED),
                    left = KeyC("с"),
                    right = KeyC("ю"),
                ),
                KeyItemC(
                    center = KeyC("л", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("э"),
                    bottom = KeyC("х"),
                ),
                KeyItemC(
                    center = KeyC("к", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("@", color = MUTED),
                    bottom = KeyC("ж"),
                    right = KeyC("ё"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("м", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("и"),
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
                    center = KeyC("д", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC(".", color = MUTED),
                    top = KeyC(",", color = MUTED),
                    bottom = KeyC("?", color = MUTED),
                    right = KeyC("у"),
                ),
                KeyItemC(
                    center = KeyC("п", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ы"),
                    bottom = KeyC("ш"),
                    top = KeyC("щ"),
                ),
                KeyItemC(
                    center = KeyC("ь", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("т"),
                    bottom = KeyC("ц"),
                    top = KeyC("-", color = MUTED),
                    right = KeyC("я"),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("г", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("\"", color = MUTED),
                    top = KeyC("ф"),
                    left = KeyC("н"),
                ),
                KeyItemC(
                    center = KeyC("б", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("'", color = MUTED),
                    left = KeyC(";", color = MUTED),
                    right = KeyC("о"),
                ),
                KeyItemC(
                    center = KeyC("з", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("а"),
                    top = KeyC("ъ"),
                ),
                KeyItemC(
                    center = KeyC("ч", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("#", color = MUTED),
                    top = KeyC("/", color = MUTED),
                    right = KeyC("е"),
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
                    center = KeyC("Р", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("~", color = MUTED),
                    bottom = KeyC("Й"),
                ),
                KeyItemC(
                    center = KeyC("В", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("!", color = MUTED),
                    left = KeyC("С"),
                    right = KeyC("Ю"),
                ),
                KeyItemC(
                    center = KeyC("Л", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Э"),
                    bottom = KeyC("Х"),
                ),
                KeyItemC(
                    center = KeyC("К", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("@", color = MUTED),
                    bottom = KeyC("Ж"),
                    right = KeyC("Ё"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("М", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("И"),
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
                    center = KeyC("Д", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC(".", color = MUTED),
                    top = KeyC(",", color = MUTED),
                    bottom = KeyC("?", color = MUTED),
                    right = KeyC("У"),
                ),
                KeyItemC(
                    center = KeyC("П", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Ы"),
                    bottom = KeyC("Ш"),
                    top = KeyC("Щ"),
                ),
                KeyItemC(
                    center = KeyC("Ь", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("Т"),
                    bottom = KeyC("Ц"),
                    top = KeyC("_", color = MUTED),
                    right = KeyC("Я"),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("Г", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("\"", color = MUTED),
                    top = KeyC("Ф"),
                    left = KeyC("Н"),
                ),
                KeyItemC(
                    center = KeyC("Б", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("'", color = MUTED),
                    left = KeyC(":", color = MUTED),
                    right = KeyC("О"),
                ),
                KeyItemC(
                    center = KeyC("З", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("А"),
                    top = KeyC("Ъ"),
                ),
                KeyItemC(
                    center = KeyC("Ч", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("#", color = MUTED),
                    top = KeyC("/", color = MUTED),
                    right = KeyC("Е"),
                ),
                EMOJI_KEY_ITEM,
            ),
        ),
    )

val KB_RU_HYPER: KeyboardDefinition =
    KeyboardDefinition(
        title = "russian hyper",
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
