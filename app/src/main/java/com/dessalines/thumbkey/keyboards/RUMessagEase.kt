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

val KB_RU_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("с", size = FontSizeVariant.LARGE),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottomRight = KeyC("п"),
                    bottom = KeyC("ц"),
                ),
                KeyItemC(
                    center = KeyC("и", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top = KeyC("й"),
                    bottom = KeyC("к"),
                ),
                KeyItemC(
                    center = KeyC("т", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("ь"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("в", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("б"),
                    right = KeyC("ы"),
                    bottom = KeyC("ъ"),
                ),
                KeyItemC(
                    center = KeyC("о", size = FontSizeVariant.LARGE),
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
                    center = KeyC("а", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC("л"),
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
                    center = KeyC("е", size = FontSizeVariant.LARGE),
                    top = KeyC("ё"),
                    topRight = KeyC("д"),
                    right = KeyC("э"),
                ),
                KeyItemC(
                    center = KeyC("р", size = FontSizeVariant.LARGE),
                    top = KeyC("у"),
                    right = KeyC("з"),
                    left = KeyC("ю"),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("н", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
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
                    center = KeyC("С", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("П"),
                    bottom = KeyC("Ц"),
                ),
                KeyItemC(
                    center = KeyC("И", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top = KeyC("Й"),
                    bottom = KeyC("К"),
                ),
                KeyItemC(
                    center = KeyC("Т", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("Ь"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("В", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("Б"),
                    right = KeyC("Ы"),
                    bottom = KeyC("Ъ"),
                ),
                KeyItemC(
                    center = KeyC("О", size = FontSizeVariant.LARGE),
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
                    center = KeyC("А", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC("Л"),
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
                    center = KeyC("Е", size = FontSizeVariant.LARGE),
                    top = KeyC("Ё"),
                    topRight = KeyC("Д"),
                    right = KeyC("Э"),
                ),
                KeyItemC(
                    center = KeyC("Р", size = FontSizeVariant.LARGE),
                    top = KeyC("У"),
                    right = KeyC("З"),
                    left = KeyC("Ю"),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("Н", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
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
