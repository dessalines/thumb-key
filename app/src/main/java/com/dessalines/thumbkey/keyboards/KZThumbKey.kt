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

val KB_KZ_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("с", size = FontSizeVariant.LARGE),
                    right = KeyC("щ"),
                    bottomRight = KeyC("й"),
                    bottom = KeyC("э"),
                ),
                KeyItemC(
                    center = KeyC("р", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("х"),
                ),
                KeyItemC(
                    center = KeyC("а", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("ж"),
                    topRight = KeyC("ә"),
                    bottomRight = KeyC("і"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("н", size = FontSizeVariant.LARGE),
                    right = KeyC("м"),
                    bottom = KeyC("л"),
                    bottomRight = KeyC("ғ"),
                    topRight = KeyC("қ"),
                    bottomLeft = KeyC("ң"),
                ),
                KeyItemC(
                    center = KeyC("в", size = FontSizeVariant.LARGE),
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
                    center = KeyC("е", size = FontSizeVariant.LARGE),
                    left = KeyC("ф"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight = KeyC("ү"),
                    topRight = KeyC("ұ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("т", size = FontSizeVariant.LARGE),
                    topRight = KeyC("ч"),
                    top = KeyC("ш"),
                    right = KeyC("ъ"),
                ),
                KeyItemC(
                    center = KeyC("и", size = FontSizeVariant.LARGE),
                    top = KeyC("б"),
                    right = KeyC("ц"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    left = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("о", size = FontSizeVariant.LARGE),
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
                    center = KeyC("С", size = FontSizeVariant.LARGE),
                    right = KeyC("Щ"),
                    bottomRight = KeyC("Й"),
                    bottom = KeyC("Э"),
                ),
                KeyItemC(
                    center = KeyC("Р", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    bottom = KeyC("Х"),
                ),
                KeyItemC(
                    center = KeyC("А", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("Ж"),
                    topRight = KeyC("Ә"),
                    bottomRight = KeyC("І"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Н", size = FontSizeVariant.LARGE),
                    right = KeyC("М"),
                    bottom = KeyC("Л"),
                    bottomRight = KeyC("Ғ"),
                    topRight = KeyC("Қ"),
                    bottomLeft = KeyC("Ң"),
                ),
                KeyItemC(
                    center = KeyC("В", size = FontSizeVariant.LARGE),
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
                    center = KeyC("Е", size = FontSizeVariant.LARGE),
                    left = KeyC("Ф"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight = KeyC("Ү"),
                    topRight = KeyC("Ұ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Т", size = FontSizeVariant.LARGE),
                    topRight = KeyC("Ч"),
                    top = KeyC("Ш"),
                    right = KeyC("Ъ"),
                ),
                KeyItemC(
                    center = KeyC("И", size = FontSizeVariant.LARGE),
                    top = KeyC("Б"),
                    right = KeyC("Ц"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    left = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("О", size = FontSizeVariant.LARGE),
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
        modes =
            KeyboardDefinitionModes(
                main = KB_KZ_THUMBKEY_MAIN,
                shifted = KB_KZ_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
