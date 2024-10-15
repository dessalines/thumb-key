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

val KB_RU_THUMBKEY_WRITER_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("с"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("щ"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("й"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("э"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("$"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("«"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("„"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("р"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("х"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("`"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("^"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("´"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("\\"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("/"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("+"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("а"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ж"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("“"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("»"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("€"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("="),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("н"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("м"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("л"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("{"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("["),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("_"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("%"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("–"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("в"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("я"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ы"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ь"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("п"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("у"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("з"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("г"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("к"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("е"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("ф"),
                        ),
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
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("|"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("}"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("]"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("т"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ч"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ш"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ъ"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("~"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("—"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("<"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("…"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("и"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("б"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ц"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("о"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("д"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ю"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ё"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("&"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("°"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(">"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("#"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_RU_THUMBKEY_WRITER_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("С"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Щ"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("Й"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Э"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("$"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("«"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("„"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Р"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Х"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("`"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("^"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("´"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("\\"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("/"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("+"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("А"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("Ж"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("“"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("»"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("€"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("="),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Н"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("М"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Л"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("{"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("["),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("_"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("%"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("–"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("В"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("Я"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Ы"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("Ь"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("П"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("У"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("З"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("Г"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("К"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Е"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("Ф"),
                        ),
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
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("|"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("}"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("]"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Т"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("Ч"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Ш"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Ъ"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("~"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("—"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("<"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("…"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("И"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Б"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Ц"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("О"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("Д"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Ю"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Ё"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("&"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("°"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(">"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("#"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_RU_THUMBKEY_WRITER: KeyboardDefinition =
    KeyboardDefinition(
        title = "русский writer thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_RU_THUMBKEY_WRITER_MAIN,
                shifted = KB_RU_THUMBKEY_WRITER_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
