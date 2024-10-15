package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropUp
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
import com.dessalines.thumbkey.utils.SwipeNWay
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe

val KB_EO_CYRILLIC_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("о", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("к"),
                    top = KeyC("м"),
                    left = KeyC("'"),
                    right = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("с", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("ш"),
                    top = KeyC("п"),
                    left = KeyC("ϗ"),
                    right = KeyC("₷"),
                ),
                KeyItemC(
                    center = KeyC("е", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("х"),
                    top = KeyC("һ"),
                    left = KeyC("#"),
                    right = KeyC(":"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("н", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("ж"),
                    top = KeyC("j"),
                    left = KeyC("."),
                    right = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("р", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("в"),
                    top = KeyC("ф"),
                    left = KeyC("?"),
                    right = KeyC("!"),
                ),
                KeyItemC(
                    center = KeyC("а", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("д"),
                    left = KeyC("("),
                    right = KeyC(")"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("т", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("ч"),
                    top = KeyC("ц"),
                    left = KeyC("б"),
                ),
                KeyItemC(
                    center = KeyC("л", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("џ"),
                    top = KeyC("г"),
                    right = KeyC("з"),
                ),
                KeyItemC(
                    center = KeyC("и", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("ў"),
                    top = KeyC("у"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EO_CYRILLIC_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("О", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("К"),
                    top = KeyC("М"),
                    left = KeyC("'"),
                    right = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("С", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("Ш"),
                    top = KeyC("П"),
                    left = KeyC("ϗ"),
                    right = KeyC("₷"),
                ),
                KeyItemC(
                    center = KeyC("Е", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("Х"),
                    top = KeyC("Һ"),
                    left = KeyC("#"),
                    right = KeyC(":"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Н", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("Ж"),
                    top = KeyC("J"),
                    left = KeyC("."),
                    right = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("Р", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("В"),
                    top = KeyC("Ф"),
                    left = KeyC("?"),
                    right = KeyC("‽"),
                ),
                KeyItemC(
                    center = KeyC("А", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("Д"),
                    left = KeyC("("),
                    right = KeyC(")"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Т", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("Ч"),
                    top = KeyC("Ц"),
                    left = KeyC("Б"),
                ),
                KeyItemC(
                    center = KeyC("Л", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("Џ"),
                    top = KeyC("Г"),
                    right = KeyC("З"),
                ),
                KeyItemC(
                    center = KeyC("И", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC("Ў"),
                    top = KeyC("У"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EO_CYRILLIC_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "esperanto cyrillic thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_EO_CYRILLIC_THUMBKEY_MAIN,
                shifted = KB_EO_CYRILLIC_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
