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
import com.dessalines.thumbkey.utils.KeyboardDefinitionSettings
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe

val KB_BG_MESSAGEASE_PHONETIC_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("а", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("ж"),
                    bottom = KeyC("ч"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("н", size = FontSizeVariant.LARGE),
                    bottom = KeyC("л"),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("и", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("х"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("в", size = FontSizeVariant.LARGE),
                    right = KeyC("к"),
                    top = KeyC("ъ"),
                    bottom = KeyC("ь"),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("о", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("я"),
                    top = KeyC("у"),
                    topRight = KeyC("п"),
                    right = KeyC("б"),
                    bottomRight = KeyC("й"),
                    bottom = KeyC("д"),
                    bottomLeft = KeyC("г"),
                    left = KeyC("ц"),
                ),
                KeyItemC(
                    center = KeyC("р", size = FontSizeVariant.LARGE),
                    left = KeyC("м"),
                    bottomLeft = KeyC("ѝ"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
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
                    topRight = KeyC("ю"),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    right = KeyC("*", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = ColorVariant.MUTED),
                    left = KeyC("<", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("е", size = FontSizeVariant.LARGE),
                    top = KeyC("ш"),
                    topRight = KeyC("щ"),
                    right = KeyC("з"),
                    left = KeyC("„", color = ColorVariant.MUTED),
                    topLeft = KeyC("“", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("с", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("ф"),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
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

val KB_BG_MESSAGEASE_PHONETIC_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("А", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("Ж"),
                    bottom = KeyC("Ч"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("$", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("Н", size = FontSizeVariant.LARGE),
                    bottom = KeyC("Л"),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topRight = KeyC("´", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("/", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("И", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("Х"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    bottomRight = KeyC("€", color = ColorVariant.MUTED),
                    bottom = KeyC("=", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("В", size = FontSizeVariant.LARGE),
                    right = KeyC("К"),
                    top = KeyC("Ъ"),
                    bottom = KeyC("Ь"),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                    bottomRight = KeyC("_", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("О", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("Я"),
                    top = KeyC("У"),
                    topRight = KeyC("П"),
                    right = KeyC("Б"),
                    bottomRight = KeyC("Й"),
                    bottom = KeyC("Д"),
                    bottomLeft = KeyC("Г"),
                    left = KeyC("Ц"),
                ),
                KeyItemC(
                    center = KeyC("Р", size = FontSizeVariant.LARGE),
                    left = KeyC("М"),
                    bottomLeft = KeyC("Ѝ"),
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
                    topLeft = KeyC("|", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Т", size = FontSizeVariant.LARGE),
                    topRight = KeyC("Ю"),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    right = KeyC("*", color = ColorVariant.MUTED),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("Е", size = FontSizeVariant.LARGE),
                    top = KeyC("Ш"),
                    topRight = KeyC("Щ"),
                    right = KeyC("З"),
                    left = KeyC("„", color = ColorVariant.MUTED),
                    topLeft = KeyC("“", color = ColorVariant.MUTED),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("С", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("Ф"),
                    top = KeyC("&", color = ColorVariant.MUTED),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
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

val KB_BG_MESSAGEASE_PHONETIC_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "bulgarian messagease phonetic symbols",
        modes =
            KeyboardDefinitionModes(
                main = KB_BG_MESSAGEASE_PHONETIC_SYMBOLS_MAIN,
                shifted = KB_BG_MESSAGEASE_PHONETIC_SYMBOLS_SHIFTED,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
