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

val KB_RU_THUMBKEY_WRITER_MAIN =
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
                                    display = KeyDisplay.TextDisplay("щ"),
                                    action = KeyAction.CommitText("щ"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("й"),
                                    action = KeyAction.CommitText("й"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("э"),
                                    action = KeyAction.CommitText("э"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("$"),
                                    action = KeyAction.CommitText("$"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("«"),
                                    action = KeyAction.CommitText("«"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("„"),
                                    action = KeyAction.CommitText("„"),
                                    color = ColorVariant.MUTED,
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
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("х"),
                                    action = KeyAction.CommitText("х"),
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("`"),
                                    action = KeyAction.CommitText("`"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("^"),
                                    action = KeyAction.CommitText("^"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("´"),
                                    action = KeyAction.CommitText("´"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("!"),
                                    action = KeyAction.CommitText("!"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\\"),
                                    action = KeyAction.CommitText("\\"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("/"),
                                    action = KeyAction.CommitText("/"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("+"),
                                    action = KeyAction.CommitText("+"),
                                    color = ColorVariant.MUTED,
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
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ж"),
                                    action = KeyAction.CommitText("ж"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("?"),
                                    action = KeyAction.CommitText("?"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("“"),
                                    action = KeyAction.CommitText("“"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("»"),
                                    action = KeyAction.CommitText("»"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("€"),
                                    action = KeyAction.CommitText("€"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("="),
                                    action = KeyAction.CommitText("="),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("н"),
                            action = KeyAction.CommitText("н"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("м"),
                                    action = KeyAction.CommitText("м"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("л"),
                                    action = KeyAction.CommitText("л"),
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("{"),
                                    action = KeyAction.CommitText("{"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("("),
                                    action = KeyAction.CommitText("("),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("["),
                                    action = KeyAction.CommitText("["),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("_"),
                                    action = KeyAction.CommitText("_"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("%"),
                                    action = KeyAction.CommitText("%"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("–"),
                                    action = KeyAction.CommitText("–"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("в"),
                            action = KeyAction.CommitText("в"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("я"),
                                    action = KeyAction.CommitText("я"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ы"),
                                    action = KeyAction.CommitText("ы"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ь"),
                                    action = KeyAction.CommitText("ь"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("п"),
                                    action = KeyAction.CommitText("п"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("у"),
                                    action = KeyAction.CommitText("у"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("з"),
                                    action = KeyAction.CommitText("з"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("г"),
                                    action = KeyAction.CommitText("г"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("к"),
                                    action = KeyAction.CommitText("к"),
                                ),
                        ),
                ),
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
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ф"),
                                    action = KeyAction.CommitText("ф"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                    action = KeyAction.ToggleShiftMode(true),
                                    swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                                    action = KeyAction.ToggleShiftMode(false),
                                    swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("|"),
                                    action = KeyAction.CommitText("|"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("}"),
                                    action = KeyAction.CommitText("}"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(")"),
                                    action = KeyAction.CommitText(")"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("]"),
                                    action = KeyAction.CommitText("]"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("@"),
                                    action = KeyAction.CommitText("@"),
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
                            display = KeyDisplay.TextDisplay("т"),
                            action = KeyAction.CommitText("т"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ч"),
                                    action = KeyAction.CommitText("ч"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ш"),
                                    action = KeyAction.CommitText("ш"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ъ"),
                                    action = KeyAction.CommitText("ъ"),
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("~"),
                                    action = KeyAction.CommitText("~"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(":"),
                                    action = KeyAction.CommitText(":"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("—"),
                                    action = KeyAction.CommitText("—"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("<"),
                                    action = KeyAction.CommitText("<"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("…"),
                                    action = KeyAction.CommitText("…"),
                                    color = ColorVariant.MUTED,
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
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("б"),
                                    action = KeyAction.CommitText("б"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ц"),
                                    action = KeyAction.CommitText("ц"),
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\""),
                                    action = KeyAction.CommitText("\""),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("'"),
                                    action = KeyAction.CommitText("'"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("-"),
                                    action = KeyAction.CommitText("-"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("."),
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("*"),
                                    action = KeyAction.CommitText("*"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
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
                            display = KeyDisplay.TextDisplay("о"),
                            action = KeyAction.CommitText("о"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("д"),
                                    action = KeyAction.CommitText("д"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ю"),
                                    action = KeyAction.CommitText("ю"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ё"),
                                    action = KeyAction.CommitText("ё"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("&"),
                                    action = KeyAction.CommitText("&"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("°"),
                                    action = KeyAction.CommitText("°"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(">"),
                                    action = KeyAction.CommitText(">"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(";"),
                                    action = KeyAction.CommitText(";"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("#"),
                                    action = KeyAction.CommitText("#"),
                                    color = ColorVariant.MUTED,
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

val KB_RU_THUMBKEY_WRITER_SHIFTED =
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
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Щ"),
                                    action = KeyAction.CommitText("Щ"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Й"),
                                    action = KeyAction.CommitText("Й"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Э"),
                                    action = KeyAction.CommitText("Э"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("$"),
                                    action = KeyAction.CommitText("$"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("«"),
                                    action = KeyAction.CommitText("«"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("„"),
                                    action = KeyAction.CommitText("„"),
                                    color = ColorVariant.MUTED,
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
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Х"),
                                    action = KeyAction.CommitText("Х"),
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("`"),
                                    action = KeyAction.CommitText("`"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("^"),
                                    action = KeyAction.CommitText("^"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("´"),
                                    action = KeyAction.CommitText("´"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("!"),
                                    action = KeyAction.CommitText("!"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\\"),
                                    action = KeyAction.CommitText("\\"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("/"),
                                    action = KeyAction.CommitText("/"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("+"),
                                    action = KeyAction.CommitText("+"),
                                    color = ColorVariant.MUTED,
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
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ж"),
                                    action = KeyAction.CommitText("Ж"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("?"),
                                    action = KeyAction.CommitText("?"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("“"),
                                    action = KeyAction.CommitText("“"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("»"),
                                    action = KeyAction.CommitText("»"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("€"),
                                    action = KeyAction.CommitText("€"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("="),
                                    action = KeyAction.CommitText("="),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("Н"),
                            action = KeyAction.CommitText("Н"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("М"),
                                    action = KeyAction.CommitText("М"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Л"),
                                    action = KeyAction.CommitText("Л"),
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("{"),
                                    action = KeyAction.CommitText("{"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("("),
                                    action = KeyAction.CommitText("("),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("["),
                                    action = KeyAction.CommitText("["),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("_"),
                                    action = KeyAction.CommitText("_"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("%"),
                                    action = KeyAction.CommitText("%"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("–"),
                                    action = KeyAction.CommitText("–"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("В"),
                            action = KeyAction.CommitText("В"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Я"),
                                    action = KeyAction.CommitText("Я"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ы"),
                                    action = KeyAction.CommitText("Ы"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ь"),
                                    action = KeyAction.CommitText("Ь"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("П"),
                                    action = KeyAction.CommitText("П"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("У"),
                                    action = KeyAction.CommitText("У"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("З"),
                                    action = KeyAction.CommitText("З"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Г"),
                                    action = KeyAction.CommitText("Г"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("К"),
                                    action = KeyAction.CommitText("К"),
                                ),
                        ),
                ),
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
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ф"),
                                    action = KeyAction.CommitText("Ф"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                                    capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                                    action = KeyAction.ToggleCapsLock,
                                    swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                                    action = KeyAction.ToggleShiftMode(false),
                                    swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("|"),
                                    action = KeyAction.CommitText("|"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("}"),
                                    action = KeyAction.CommitText("}"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(")"),
                                    action = KeyAction.CommitText(")"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("]"),
                                    action = KeyAction.CommitText("]"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("@"),
                                    action = KeyAction.CommitText("@"),
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
                            display = KeyDisplay.TextDisplay("Т"),
                            action = KeyAction.CommitText("Т"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ч"),
                                    action = KeyAction.CommitText("Ч"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ш"),
                                    action = KeyAction.CommitText("Ш"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ъ"),
                                    action = KeyAction.CommitText("Ъ"),
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("~"),
                                    action = KeyAction.CommitText("~"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(":"),
                                    action = KeyAction.CommitText(":"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("—"),
                                    action = KeyAction.CommitText("—"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("<"),
                                    action = KeyAction.CommitText("<"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("…"),
                                    action = KeyAction.CommitText("…"),
                                    color = ColorVariant.MUTED,
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
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Б"),
                                    action = KeyAction.CommitText("Б"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ц"),
                                    action = KeyAction.CommitText("Ц"),
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\""),
                                    action = KeyAction.CommitText("\""),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("'"),
                                    action = KeyAction.CommitText("'"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("-"),
                                    action = KeyAction.CommitText("-"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("."),
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("*"),
                                    action = KeyAction.CommitText("*"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
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
                            display = KeyDisplay.TextDisplay("О"),
                            action = KeyAction.CommitText("О"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Д"),
                                    action = KeyAction.CommitText("Д"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ю"),
                                    action = KeyAction.CommitText("Ю"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ё"),
                                    action = KeyAction.CommitText("Ё"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("&"),
                                    action = KeyAction.CommitText("&"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("°"),
                                    action = KeyAction.CommitText("°"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(">"),
                                    action = KeyAction.CommitText(">"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(";"),
                                    action = KeyAction.CommitText(";"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("#"),
                                    action = KeyAction.CommitText("#"),
                                    color = ColorVariant.MUTED,
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
