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
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("«", color = ColorVariant.MUTED),
                    top = KeyC("§", color = ColorVariant.MUTED),
                    topRight = KeyC("»", color = ColorVariant.MUTED),
                    left = KeyC("¿", color = ColorVariant.MUTED),
                    right = KeyC("?", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("\u0304", displayText = "◌̄"),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("p"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("l", size = FontSizeVariant.LARGE),
                    left = KeyC("¡", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
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
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("\u0303", displayText = "◌̃"),
                    topRight = KeyC("\u0306", displayText = "◌̆"),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("m"),
                        ),
                    bottomRight = KeyC("\u030c", displayText = "◌̌"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("\u0313", displayText = "◌̓"),
                    top =
                        KeyC(
                            // PER MILLE SIGN
                            display = KeyDisplay.TextDisplay("‰"),
                            action = KeyAction.CommitText("\u2030"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight = KeyC("\u0326", displayText = "◌̦"),
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
                    bottomLeft = KeyC("\u030f", displayText = "◌̏"),
                    bottom =
                        KeyC(
                            // PLUS-MINUS SIGN
                            display = KeyDisplay.TextDisplay("±"),
                            action = KeyAction.CommitText("\u00b1"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight = KeyC("\u0307", displayText = "◌̇"),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
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
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("\u030a", displayText = "◌̊"),
                    topRight = KeyC("\u0328", displayText = "◌̨"),
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
                    bottomLeft = KeyC("\u0312", displayText = "◌̒"),
                    right = KeyC("\u0308", displayText = "◌̈"),
                    bottomRight = KeyC("\u0327", displayText = "◌̧"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
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
                    center = KeyC("o", size = FontSizeVariant.LARGE),
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
                    bottomLeft = KeyC("'", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("d"),
                        ),
                    topRight = KeyC("\u0300", displayText = "◌̀"),
                    left =
                        KeyC(
                            KeyAction.CommitText("ß"),
                        ),
                    right = KeyC("\u0302", displayText = "◌̂"),
                    bottomLeft = KeyC("\u030b", displayText = "◌̋"),
                    bottomRight = KeyC("\u0301", displayText = "◌́"),
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
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("«", color = ColorVariant.MUTED),
                    top = KeyC("§", color = ColorVariant.MUTED),
                    topRight = KeyC("»", color = ColorVariant.MUTED),
                    left = KeyC("¿", color = ColorVariant.MUTED),
                    right = KeyC("?", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("\u0304", displayText = "◌̄"),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("P"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("L", size = FontSizeVariant.LARGE),
                    left = KeyC("¡", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
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
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("\u0303", displayText = "◌̃"),
                    topRight = KeyC("\u0306", displayText = "◌̆"),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("M"),
                        ),
                    bottomRight = KeyC("\u030c", displayText = "◌̌"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("\u0313", displayText = "◌̓"),
                    top =
                        KeyC(
                            // PER MILLE SIGN
                            display = KeyDisplay.TextDisplay("‰"),
                            action = KeyAction.CommitText("\u2030"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight = KeyC("\u0326", displayText = "◌̦"),
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
                    bottomLeft = KeyC("\u030f", displayText = "◌̏"),
                    bottom =
                        KeyC(
                            // PLUS-MINUS SIGN
                            display = KeyDisplay.TextDisplay("±"),
                            action = KeyAction.CommitText("\u00b1"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight = KeyC("\u0307", displayText = "◌̇"),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
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
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("\u030a", displayText = "◌̊"),
                    topRight = KeyC("\u0328", displayText = "◌̨"),
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
                    bottomLeft = KeyC("\u0312", displayText = "◌̒"),
                    right = KeyC("\u0308", displayText = "◌̈"),
                    bottomRight = KeyC("\u0327", displayText = "◌̧"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
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
                    center = KeyC("O", size = FontSizeVariant.LARGE),
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
                    bottomLeft = KeyC("'", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("D"),
                        ),
                    topRight = KeyC("\u0300", displayText = "◌̀"),
                    left =
                        KeyC(
                            KeyAction.CommitText("ẞ"),
                        ),
                    right = KeyC("\u0302", displayText = "◌̂"),
                    bottomLeft = KeyC("\u030b", displayText = "◌̋"),
                    bottomRight = KeyC("\u0301", displayText = "◌́"),
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
