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

val KB_RU_MESSAGE_OWL_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("н", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC("й"),
                    right = KeyC("ы"),
                    top = KeyC("ц"),
                    bottom = KeyC("ч"),
                ),
                KeyItemC(
                    center = KeyC("р", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("г"),
                    bottom = KeyC("с"),
                    left = KeyC("х"),
                ),
                KeyItemC(
                    center = KeyC("к", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("я"),
                    right = KeyC("щ"),
                    top = KeyC("ш"),
                    left = KeyC("з"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("у", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("п"),
                    right = KeyC("в"),
                ),
                KeyItemC(
                    center = KeyC("о", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("а"),
                    right = KeyC("ж"),
                    left = KeyC("ф"),
                ),
                KeyItemC(
                    center = KeyC("л", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("."),
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay(","),
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("м", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    top = KeyC("б"),
                    bottom = KeyC("ъ"),
                ),
                KeyItemC(
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    center = KeyC("е", size = FontSizeVariant.LARGE),
                    top = KeyC("и"),
                    bottom = KeyC("ё"),
                ),
                KeyItemC(
                    center = KeyC("т", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("д"),
                    left = KeyC("э"),
                    bottom = KeyC("ь"),
                    right = KeyC("ю"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_RU_MESSAGE_OWL_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("Н", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC("Й"),
                    right = KeyC("Ы"),
                    top = KeyC("Ц"),
                    bottom = KeyC("Ч"),
                ),
                KeyItemC(
                    center = KeyC("Р", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("Г"),
                    bottom = KeyC("С"),
                    left = KeyC("Х"),
                ),
                KeyItemC(
                    center = KeyC("К", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("Я"),
                    right = KeyC("Щ"),
                    top = KeyC("Ш"),
                    left = KeyC("З"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("У", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("П"),
                    right = KeyC("В"),
                ),
                KeyItemC(
                    center = KeyC("О", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("А"),
                    right = KeyC("Ж"),
                    left = KeyC("Ф"),
                ),
                KeyItemC(
                    center = KeyC("Л", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC(".", color = ColorVariant.MUTED),
                    right = KeyC(",", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    center = KeyC("М", size = FontSizeVariant.LARGE),
                    top = KeyC("Б"),
                    bottom = KeyC("Ъ"),
                ),
                KeyItemC(
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    center = KeyC("Е", size = FontSizeVariant.LARGE),
                    top = KeyC("И"),
                    bottom = KeyC("Ё"),
                ),
                KeyItemC(
                    center = KeyC("Т", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC("Д"),
                    left = KeyC("Э"),
                    bottom = KeyC("Ь"),
                    right = KeyC("Ю"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_RU_MESSAGE_OWL: KeyboardDefinition =
    KeyboardDefinition(
        title = "русский owl",
        modes =
            KeyboardDefinitionModes(
                main = KB_RU_MESSAGE_OWL_MAIN,
                shifted = KB_RU_MESSAGE_OWL_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
