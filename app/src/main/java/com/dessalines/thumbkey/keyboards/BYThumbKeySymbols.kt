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

val KB_BY_THUMBKEY_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("с", size = FontSizeVariant.LARGE),
                    right = KeyC("ў"),
                    bottomRight = KeyC("й"),
                    bottom = KeyC("э"),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("р", size = FontSizeVariant.LARGE),
                    bottom = KeyC("х"),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("а", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("ж"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("н", size = FontSizeVariant.LARGE),
                    right = KeyC("м"),
                    bottom = KeyC("л"),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
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
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("т", size = FontSizeVariant.LARGE),
                    topRight = KeyC("ч"),
                    top = KeyC("ш"),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("<", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("і", size = FontSizeVariant.LARGE),
                    top = KeyC("б"),
                    right = KeyC("ц"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    topRight = KeyC("'"),
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
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                    bottomRight = KeyC(">", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    left = KeyC("#", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_BY_THUMBKEY_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("С", size = FontSizeVariant.LARGE),
                    right = KeyC("Ў"),
                    bottomRight = KeyC("Й"),
                    bottom = KeyC("Э"),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("Р", size = FontSizeVariant.LARGE),
                    bottom = KeyC("Х"),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("А", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("Ж"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Н", size = FontSizeVariant.LARGE),
                    right = KeyC("М"),
                    bottom = KeyC("Л"),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
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
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("@", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Т", size = FontSizeVariant.LARGE),
                    topRight = KeyC("Ч"),
                    top = KeyC("Ш"),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("<", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("І", size = FontSizeVariant.LARGE),
                    top = KeyC("Б"),
                    right = KeyC("Ц"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    topRight = KeyC("'"),
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
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                    bottomRight = KeyC(">", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    left = KeyC("#", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_BY_THUMBKEY_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "беларуская з сімваламі thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_BY_THUMBKEY_SYMBOLS_MAIN,
                shifted = KB_BY_THUMBKEY_SYMBOLS_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
