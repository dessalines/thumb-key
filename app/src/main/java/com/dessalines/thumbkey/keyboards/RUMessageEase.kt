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
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_RU_MESSAGEEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("с"),
                        action = KeyAction.CommitText("с"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("-"),
                                action = KeyAction.CommitText("-"),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("п"),
                                action = KeyAction.CommitText("п"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ц"),
                                action = KeyAction.CommitText("ц"),
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("и"),
                        action = KeyAction.CommitText("и"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("й"),
                                action = KeyAction.CommitText("й"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("к"),
                                action = KeyAction.CommitText("к"),
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("т"),
                        action = KeyAction.CommitText("т"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    swipes =
                    mapOf(
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ь"),
                                action = KeyAction.CommitText("ь"),
                            ),
                    ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("в"),
                        action = KeyAction.CommitText("в"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("б"),
                                action = KeyAction.CommitText("б"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ы"),
                                action = KeyAction.CommitText("ы"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ъ"),
                                action = KeyAction.CommitText("ъ"),
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("о"),
                        action = KeyAction.CommitText("о"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ч"),
                                action = KeyAction.CommitText("ч"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("м"),
                                action = KeyAction.CommitText("м"),
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("х"),
                                action = KeyAction.CommitText("х"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("г"),
                                action = KeyAction.CommitText("г"),
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ш"),
                                action = KeyAction.CommitText("ш"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("я"),
                                action = KeyAction.CommitText("я"),
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("щ"),
                                action = KeyAction.CommitText("щ"),
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ж"),
                                action = KeyAction.CommitText("ж"),
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("а"),
                        action = KeyAction.CommitText("а"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("л"),
                                action = KeyAction.CommitText("л"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                action = KeyAction.ToggleShiftMode(true),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("е"),
                        action = KeyAction.CommitText("е"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ё"),
                                action = KeyAction.CommitText("ё"),
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("д"),
                                action = KeyAction.CommitText("д"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("э"),
                                action = KeyAction.CommitText("э"),
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("р"),
                        action = KeyAction.CommitText("р"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("у"),
                                action = KeyAction.CommitText("у"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("з"),
                                action = KeyAction.CommitText("з"),
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ю"),
                                action = KeyAction.CommitText("ю"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("."),
                                action = KeyAction.CommitText("."),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(","),
                                action = KeyAction.CommitText(","),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("н"),
                        action = KeyAction.CommitText("н"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("ф"),
                                action = KeyAction.CommitText("ф"),
                            ),
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

val KB_RU_MESSAGEEASE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("С"),
                        action = KeyAction.CommitText("С"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("П"),
                                action = KeyAction.CommitText("П"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ц"),
                                action = KeyAction.CommitText("Ц"),
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("И"),
                        action = KeyAction.CommitText("И"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Й"),
                                action = KeyAction.CommitText("Й"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("К"),
                                action = KeyAction.CommitText("К"),
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("Т"),
                        action = KeyAction.CommitText("Т"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    swipes =
                    mapOf(
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ь"),
                                action = KeyAction.CommitText("Ь"),
                            ),
                    ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("В"),
                        action = KeyAction.CommitText("В"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Б"),
                                action = KeyAction.CommitText("Б"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ы"),
                                action = KeyAction.CommitText("Ы"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ъ"),
                                action = KeyAction.CommitText("Ъ"),
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("О"),
                        action = KeyAction.CommitText("О"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ч"),
                                action = KeyAction.CommitText("Ч"),
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("М"),
                                action = KeyAction.CommitText("М"),
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Х"),
                                action = KeyAction.CommitText("Х"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Г"),
                                action = KeyAction.CommitText("Г"),
                            ),
                        SwipeDirection.BOTTOM_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ш"),
                                action = KeyAction.CommitText("Ш"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Я"),
                                action = KeyAction.CommitText("Я"),
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Щ"),
                                action = KeyAction.CommitText("Щ"),
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ж"),
                                action = KeyAction.CommitText("Ж"),
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("А"),
                        action = KeyAction.CommitText("А"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Л"),
                                action = KeyAction.CommitText("Л"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                                action = KeyAction.ToggleShiftMode(false),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                                capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                                action = KeyAction.ToggleCapsLock,
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("Е"),
                        action = KeyAction.CommitText("Е"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ё"),
                                action = KeyAction.CommitText("Ё"),
                            ),
                        SwipeDirection.TOP_RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Д"),
                                action = KeyAction.CommitText("Д"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Э"),
                                action = KeyAction.CommitText("Э"),
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("Р"),
                        action = KeyAction.CommitText("Р"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.TOP to
                            KeyC(
                                display = KeyDisplay.TextDisplay("У"),
                                action = KeyAction.CommitText("У"),
                            ),
                        SwipeDirection.RIGHT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("З"),
                                action = KeyAction.CommitText("З"),
                            ),
                        SwipeDirection.LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ю"),
                                action = KeyAction.CommitText("Ю"),
                            ),
                        SwipeDirection.BOTTOM to
                            KeyC(
                                display = KeyDisplay.TextDisplay("."),
                                action = KeyAction.CommitText("."),
                                color = ColorVariant.MUTED,
                            ),
                        SwipeDirection.BOTTOM_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay(","),
                                action = KeyAction.CommitText(","),
                                color = ColorVariant.MUTED,
                            ),
                    ),
                ),
                KeyItemC(
                    center =
                    KeyC(
                        display = KeyDisplay.TextDisplay("Н"),
                        action = KeyAction.CommitText("Н"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    swipes =
                    mapOf(
                        SwipeDirection.TOP_LEFT to
                            KeyC(
                                display = KeyDisplay.TextDisplay("Ф"),
                                action = KeyAction.CommitText("Ф"),
                            ),
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

val KB_RU_MESSAGEEASE: KeyboardDefinition =
    KeyboardDefinition(
        title = "русский messageease",
        modes =
        KeyboardDefinitionModes(
            main = KB_RU_MESSAGEEASE_MAIN,
            shifted = KB_RU_MESSAGEEASE_SHIFTED,
            numeric = NUMERIC_KEYBOARD,
        ),
    )
