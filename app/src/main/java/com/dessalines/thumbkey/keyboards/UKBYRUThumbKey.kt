package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardCapslock
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_UK_BY_RU_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("с", size = FontSizeVariant.LARGE),
                    top = KeyC("ў"),
                    left = KeyC("э"),
                    bottomRight = KeyC("й"),
                ),
                KeyItemC(
                    center = KeyC("р", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("х"),
                ),
                KeyItemC(
                    center = KeyC("а", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight = KeyC("ы"),
                    bottomLeft = KeyC("ж"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("н", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("м"),
                ),
                KeyItemC(
                    center = KeyC("в", size = FontSizeVariant.LARGE),
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
                    center = KeyC("і", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("е"),
                    left = KeyC("л"),
                    bottomLeft = KeyC("ф"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("т", size = FontSizeVariant.LARGE),
                    topRight = KeyC("ч"),
                    top = KeyC("ш"),
                    bottom = KeyC("ъ"),
                ),
                KeyItemC(
                    center = KeyC("и", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("щ"),
                    top = KeyC("б"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    right = KeyC("ц"),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("о", size = FontSizeVariant.LARGE),
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
                    center = KeyC("С", size = FontSizeVariant.LARGE),
                    top = KeyC("Ў"),
                    left = KeyC("Э"),
                    bottomRight = KeyC("Й"),
                ),
                KeyItemC(
                    center = KeyC("Р", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("Х"),
                ),
                KeyItemC(
                    center = KeyC("А", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight = KeyC("Ы"),
                    bottomLeft = KeyC("Ж"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Н", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC("М"),
                ),
                KeyItemC(
                    center = KeyC("В", size = FontSizeVariant.LARGE),
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
                    center = KeyC("І", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("Е"),
                    left = KeyC("Л"),
                    bottomLeft = KeyC("Ф"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Т", size = FontSizeVariant.LARGE),
                    topRight = KeyC("Ч"),
                    top = KeyC("Ш"),
                    bottom = KeyC("Ъ"),
                ),
                KeyItemC(
                    center = KeyC("И", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("Щ"),
                    top = KeyC("Б"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    right = KeyC("Ц"),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("О", size = FontSizeVariant.LARGE),
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
