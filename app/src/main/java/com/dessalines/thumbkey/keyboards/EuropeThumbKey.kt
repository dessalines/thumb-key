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
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.SwipeNWay
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe

val KB_EUROPE_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("«"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("§"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("»"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("¿"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("?"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̄"),
                                    action = KeyAction.CommitText("\u0304"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("p"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("l"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("¡"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("!"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("ł"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("v"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̃"),
                                    action = KeyAction.CommitText("\u0303"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̆"),
                                    action = KeyAction.CommitText("\u0306"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("m"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̌"),
                                    action = KeyAction.CommitText("\u030c"),
                                ),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̓"),
                                    action = KeyAction.CommitText("\u0313"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    // PER MILLE SIGN
                                    display = KeyDisplay.TextDisplay("‰"),
                                    action = KeyAction.CommitText("\u2030"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̦"),
                                    action = KeyAction.CommitText("\u0326"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    // DAGGER
                                    display = KeyDisplay.TextDisplay("†"),
                                    action = KeyAction.CommitText("\u2020"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("h"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̏"),
                                    action = KeyAction.CommitText("\u030f"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    // PLUS-MINUS SIGN
                                    display = KeyDisplay.TextDisplay("±"),
                                    action = KeyAction.CommitText("\u00b1"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̇"),
                                    action = KeyAction.CommitText("\u0307"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("y"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("q"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("w"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("k"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("b"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("j"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("z"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("f"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̊"),
                                    action = KeyAction.CommitText("\u030a"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̨"),
                                    action = KeyAction.CommitText("\u0328"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("u"),
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
                                    action = KeyAction.ToggleShiftMode(false),
                                    swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̒"),
                                    action = KeyAction.CommitText("\u0312"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̈"),
                                    action = KeyAction.CommitText("\u0308"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̧"),
                                    action = KeyAction.CommitText("\u0327"),
                                ),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    // U+00DE
                                    action = KeyAction.CommitText("þ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    // DEGREE SIGN
                                    display = KeyDisplay.TextDisplay("°"),
                                    action = KeyAction.CommitText("\u00b0"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("c"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    // U+0152
                                    action = KeyAction.CommitText("œ"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    // U+00D0
                                    action = KeyAction.CommitText("ð"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("đ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("g"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("ø"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("x"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("æ"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("'"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("-"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("d"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̀"),
                                    action = KeyAction.CommitText("\u0300"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("ß"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̂"),
                                    action = KeyAction.CommitText("\u0302"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̋"),
                                    action = KeyAction.CommitText("\u030b"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌́"),
                                    action = KeyAction.CommitText("\u0301"),
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

val KB_EUROPE_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("«"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("§"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("»"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("¿"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("?"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̄"),
                                    action = KeyAction.CommitText("\u0304"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("P"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("L"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("¡"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("!"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("Ł"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("V"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̃"),
                                    action = KeyAction.CommitText("\u0303"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̆"),
                                    action = KeyAction.CommitText("\u0306"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("M"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̌"),
                                    action = KeyAction.CommitText("\u030c"),
                                ),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̓"),
                                    action = KeyAction.CommitText("\u0313"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    // PER MILLE SIGN
                                    display = KeyDisplay.TextDisplay("‰"),
                                    action = KeyAction.CommitText("\u2030"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̦"),
                                    action = KeyAction.CommitText("\u0326"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    // DOUBLE DAGGER
                                    display = KeyDisplay.TextDisplay("‡"),
                                    action = KeyAction.CommitText("\u2021"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("H"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̏"),
                                    action = KeyAction.CommitText("\u030f"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    // PLUS-MINUS SIGN
                                    display = KeyDisplay.TextDisplay("±"),
                                    action = KeyAction.CommitText("\u00b1"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̇"),
                                    action = KeyAction.CommitText("\u0307"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("Y"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("Q"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("W"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("K"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("B"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("J"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("Z"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("F"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̊"),
                                    action = KeyAction.CommitText("\u030a"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̨"),
                                    action = KeyAction.CommitText("\u0328"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("U"),
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
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̒"),
                                    action = KeyAction.CommitText("\u0312"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̈"),
                                    action = KeyAction.CommitText("\u0308"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̧"),
                                    action = KeyAction.CommitText("\u0327"),
                                ),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("Þ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    // DEGREE SIGN
                                    display = KeyDisplay.TextDisplay("°"),
                                    action = KeyAction.CommitText("\u00b0"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("C"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("Œ"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("Ð"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("Đ"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("G"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("Ø"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("X"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("Æ"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("'"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("-"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("D"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̀"),
                                    action = KeyAction.CommitText("\u0300"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("ẞ"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̂"),
                                    action = KeyAction.CommitText("\u0302"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌̋"),
                                    action = KeyAction.CommitText("\u030b"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("◌́"),
                                    action = KeyAction.CommitText("\u0301"),
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

val KB_EUROPE_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "European thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_EUROPE_THUMBKEY_MAIN,
                shifted = KB_EUROPE_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
