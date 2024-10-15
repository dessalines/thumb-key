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
                            action = KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("«"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("§"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("»"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("¿"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̄"),
                            action = KeyAction.CommitText("\u0304"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("p"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("l"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("¡"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ł"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("v"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("i"),
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
                            action = KeyAction.CommitText("m"),
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
                            action = KeyAction.CommitText("t"),
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
                            action = KeyAction.CommitText("h"),
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
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("y"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("q"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("w"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("k"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("b"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("j"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("z"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("f"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("a"),
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
                            action = KeyAction.CommitText("u"),
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
                            action = KeyAction.ToggleShiftMode(false),
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
                            action = KeyAction.CommitText("n"),
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
                            action = KeyAction.CommitText("c"),
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
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("đ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("g"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ø"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("x"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("æ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("d"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̀"),
                            action = KeyAction.CommitText("\u0300"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ß"),
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
                            action = KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("«"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("§"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("»"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("¿"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̄"),
                            action = KeyAction.CommitText("\u0304"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("P"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("L"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("¡"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ł"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("V"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("I"),
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
                            action = KeyAction.CommitText("M"),
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
                            action = KeyAction.CommitText("T"),
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
                            action = KeyAction.CommitText("H"),
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
                            action = KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Y"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Q"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("W"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("K"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("B"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("J"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Z"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("F"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("A"),
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
                            action = KeyAction.CommitText("U"),
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
                            action = KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Þ"),
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
                            action = KeyAction.CommitText("C"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Œ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ð"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Đ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("G"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Ø"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("X"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Æ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("D"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̀"),
                            action = KeyAction.CommitText("\u0300"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ẞ"),
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
