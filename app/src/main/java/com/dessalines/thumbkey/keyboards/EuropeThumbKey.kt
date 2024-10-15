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
                            KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("«"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("§"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("»"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("¿"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̄"),
                            action = KeyAction.CommitText("\u0304"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("p"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("l"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("¡"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ł"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("v"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̃"),
                            action = KeyAction.CommitText("\u0303"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̆"),
                            action = KeyAction.CommitText("\u0306"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("m"),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̌"),
                            action = KeyAction.CommitText("\u030c"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̓"),
                            action = KeyAction.CommitText("\u0313"),
                        ),
                    top =
                        KeyC(
                            // PER MILLE SIGN
                            display = KeyDisplay.TextDisplay("‰"),
                            action = KeyAction.CommitText("\u2030"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̦"),
                            action = KeyAction.CommitText("\u0326"),
                        ),
                    left =
                        KeyC(
                            // DAGGER
                            display = KeyDisplay.TextDisplay("†"),
                            action = KeyAction.CommitText("\u2020"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("h"),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̏"),
                            action = KeyAction.CommitText("\u030f"),
                        ),
                    bottom =
                        KeyC(
                            // PLUS-MINUS SIGN
                            display = KeyDisplay.TextDisplay("±"),
                            action = KeyAction.CommitText("\u00b1"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̇"),
                            action = KeyAction.CommitText("\u0307"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("y"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("q"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("w"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("k"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("b"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("j"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("z"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("f"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̊"),
                            action = KeyAction.CommitText("\u030a"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̨"),
                            action = KeyAction.CommitText("\u0328"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("u"),
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
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̒"),
                            action = KeyAction.CommitText("\u0312"),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̈"),
                            action = KeyAction.CommitText("\u0308"),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̧"),
                            action = KeyAction.CommitText("\u0327"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            // U+00DE
                            action = KeyAction.CommitText("þ"),
                        ),
                    top =
                        KeyC(
                            // DEGREE SIGN
                            display = KeyDisplay.TextDisplay("°"),
                            action = KeyAction.CommitText("\u00b0"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("c"),
                        ),
                    bottomLeft =
                        KeyC(
                            // U+0152
                            action = KeyAction.CommitText("œ"),
                        ),
                    bottomRight =
                        KeyC(
                            // U+00D0
                            action = KeyAction.CommitText("ð"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("đ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("g"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ø"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("x"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("æ"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("d"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̀"),
                            action = KeyAction.CommitText("\u0300"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("ß"),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̂"),
                            action = KeyAction.CommitText("\u0302"),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̋"),
                            action = KeyAction.CommitText("\u030b"),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌́"),
                            action = KeyAction.CommitText("\u0301"),
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
                            KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("«"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("§"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("»"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("¿"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̄"),
                            action = KeyAction.CommitText("\u0304"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("P"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("L"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("¡"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Ł"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("V"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̃"),
                            action = KeyAction.CommitText("\u0303"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̆"),
                            action = KeyAction.CommitText("\u0306"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("M"),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̌"),
                            action = KeyAction.CommitText("\u030c"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̓"),
                            action = KeyAction.CommitText("\u0313"),
                        ),
                    top =
                        KeyC(
                            // PER MILLE SIGN
                            display = KeyDisplay.TextDisplay("‰"),
                            action = KeyAction.CommitText("\u2030"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̦"),
                            action = KeyAction.CommitText("\u0326"),
                        ),
                    left =
                        KeyC(
                            // DOUBLE DAGGER
                            display = KeyDisplay.TextDisplay("‡"),
                            action = KeyAction.CommitText("\u2021"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("H"),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̏"),
                            action = KeyAction.CommitText("\u030f"),
                        ),
                    bottom =
                        KeyC(
                            // PLUS-MINUS SIGN
                            display = KeyDisplay.TextDisplay("±"),
                            action = KeyAction.CommitText("\u00b1"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̇"),
                            action = KeyAction.CommitText("\u0307"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("Y"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Q"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("W"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("K"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("B"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("J"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("Z"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("F"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̊"),
                            action = KeyAction.CommitText("\u030a"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̨"),
                            action = KeyAction.CommitText("\u0328"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("U"),
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
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̒"),
                            action = KeyAction.CommitText("\u0312"),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̈"),
                            action = KeyAction.CommitText("\u0308"),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̧"),
                            action = KeyAction.CommitText("\u0327"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("Þ"),
                        ),
                    top =
                        KeyC(
                            // DEGREE SIGN
                            display = KeyDisplay.TextDisplay("°"),
                            action = KeyAction.CommitText("\u00b0"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("C"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("Œ"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("Ð"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("Đ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("G"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("Ø"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("X"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("Æ"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("D"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̀"),
                            action = KeyAction.CommitText("\u0300"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("ẞ"),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̂"),
                            action = KeyAction.CommitText("\u0302"),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̋"),
                            action = KeyAction.CommitText("\u030b"),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌́"),
                            action = KeyAction.CommitText("\u0301"),
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
        title = "european thumb-key",
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
