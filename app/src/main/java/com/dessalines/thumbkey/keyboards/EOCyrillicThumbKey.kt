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
                    center =
                        KeyC(
                            KeyAction.CommitText("о"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("к")),
                    top = KeyC(KeyAction.CommitText("м")),
                    left = KeyC(KeyAction.CommitText("'")),
                    right = KeyC(KeyAction.CommitText("@")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("с"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ш")),
                    top = KeyC(KeyAction.CommitText("п")),
                    left = KeyC(KeyAction.CommitText("ϗ")),
                    right = KeyC(KeyAction.CommitText("₷")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("е"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("х")),
                    top = KeyC(KeyAction.CommitText("һ")),
                    left = KeyC(KeyAction.CommitText("#")),
                    right = KeyC(KeyAction.CommitText(":")),
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
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ж")),
                    top = KeyC(KeyAction.CommitText("j")),
                    left = KeyC(KeyAction.CommitText(".")),
                    right = KeyC(KeyAction.CommitText(",")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("р"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("в")),
                    top = KeyC(KeyAction.CommitText("ф")),
                    left = KeyC(KeyAction.CommitText("?")),
                    right = KeyC(KeyAction.CommitText("!")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("а"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("д")),
                    left = KeyC(KeyAction.CommitText("(")),
                    right = KeyC(KeyAction.CommitText(")")),
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
                    center =
                        KeyC(
                            KeyAction.CommitText("т"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ч")),
                    top = KeyC(KeyAction.CommitText("ц")),
                    left = KeyC(KeyAction.CommitText("б")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("л"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("џ")),
                    top = KeyC(KeyAction.CommitText("г")),
                    right = KeyC(KeyAction.CommitText("з")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("и"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("ў")),
                    top = KeyC(KeyAction.CommitText("у")),
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
                    center =
                        KeyC(
                            KeyAction.CommitText("О"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("К")),
                    top = KeyC(KeyAction.CommitText("М")),
                    left = KeyC(KeyAction.CommitText("'")),
                    right = KeyC(KeyAction.CommitText("@")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("С"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("Ш")),
                    top = KeyC(KeyAction.CommitText("П")),
                    left = KeyC(KeyAction.CommitText("ϗ")),
                    right = KeyC(KeyAction.CommitText("₷")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Е"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("Х")),
                    top = KeyC(KeyAction.CommitText("Һ")),
                    left = KeyC(KeyAction.CommitText("#")),
                    right = KeyC(KeyAction.CommitText(":")),
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
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("Ж")),
                    top = KeyC(KeyAction.CommitText("J")),
                    left = KeyC(KeyAction.CommitText(".")),
                    right = KeyC(KeyAction.CommitText(",")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Р"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("В")),
                    top = KeyC(KeyAction.CommitText("Ф")),
                    left = KeyC(KeyAction.CommitText("?")),
                    right = KeyC(KeyAction.CommitText("‽")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("А"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("Д")),
                    left = KeyC(KeyAction.CommitText("(")),
                    right = KeyC(KeyAction.CommitText(")")),
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
                    center =
                        KeyC(
                            KeyAction.CommitText("Т"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("Ч")),
                    top = KeyC(KeyAction.CommitText("Ц")),
                    left = KeyC(KeyAction.CommitText("Б")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Л"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("Џ")),
                    top = KeyC(KeyAction.CommitText("Г")),
                    right = KeyC(KeyAction.CommitText("З")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("И"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    bottom = KeyC(KeyAction.CommitText("Ў")),
                    top = KeyC(KeyAction.CommitText("У")),
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
