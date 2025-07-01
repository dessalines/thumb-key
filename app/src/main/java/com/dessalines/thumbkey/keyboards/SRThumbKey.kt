@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_SR_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("с", size = LARGE),
                    bottomRight = KeyC("њ"),
                    top = KeyC("ш"),
                    bottom = KeyC("ж"),
                ),
                KeyItemC(
                    center = KeyC("р", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("г"),
                ),
                KeyItemC(
                    center = KeyC("о", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("у"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("н", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("м"),
                ),
                KeyItemC(
                    center = KeyC("х", size = LARGE),
                    topLeft = KeyC("ј"),
                    top = KeyC("љ"),
                    topRight = KeyC("б"),
                    right = KeyC("п"),
                    bottomRight = KeyC("ѕ"),
                    bottom = KeyC("џ"),
                    bottomLeft = KeyC("в"),
                    left = KeyC("к"),
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
                    center = KeyC("т", size = LARGE),
                    topRight = KeyC("ц"),
                    top = KeyC("ч"),
                    bottom = KeyC("ћ"),
                ),
                KeyItemC(
                    center = KeyC("и", size = LARGE),
                    top = KeyC("ф"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("з"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("е", size = LARGE),
                    topLeft = KeyC("д"),
                    bottom = KeyC("ђ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_SR_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("С", size = LARGE),
                    bottomRight = KeyC("Њ"),
                    top = KeyC("Ш"),
                    bottom = KeyC("Ж"),
                ),
                KeyItemC(
                    center = KeyC("Р", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("Г"),
                ),
                KeyItemC(
                    center = KeyC("О", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("У"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Н", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("М"),
                ),
                KeyItemC(
                    center = KeyC("Х", size = LARGE),
                    topLeft = KeyC("Ј"),
                    top = KeyC("Љ"),
                    topRight = KeyC("Б"),
                    right = KeyC("П"),
                    bottomRight = KeyC("Ѕ"),
                    bottom = KeyC("Џ"),
                    bottomLeft = KeyC("В"),
                    left = KeyC("К"),
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
                    center = KeyC("Т", size = LARGE),
                    topRight = KeyC("Ц"),
                    top = KeyC("Ч"),
                    bottom = KeyC("Ћ"),
                ),
                KeyItemC(
                    center = KeyC("И", size = LARGE),
                    top = KeyC("Ф"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("З"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("Е", size = LARGE),
                    topLeft = KeyC("Д"),
                    bottom = KeyC("Ђ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_SR_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "српски / srpski thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_SR_THUMBKEY_MAIN,
                shifted = KB_SR_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
