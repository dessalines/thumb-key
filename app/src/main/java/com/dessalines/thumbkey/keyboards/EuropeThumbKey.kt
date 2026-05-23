@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EUROPE_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("«", color = MUTED),
                    top = KeyC("§", color = MUTED),
                    topRight = KeyC("»", color = MUTED),
                    left = KeyC("¿", color = MUTED),
                    right = KeyC("?", color = MUTED),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̄"),
                            action = NormalizeLastKey("\u0304"),
                        ),
                    bottomRight =
                        KeyC(
                            CommitText("p"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    left = KeyC("¡", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    top =
                        KeyC(
                            CommitText("ł"),
                        ),
                    bottom =
                        KeyC(
                            CommitText("v"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̃"),
                            action = NormalizeLastKey("\u0303"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̆"),
                            action = NormalizeLastKey("\u0306"),
                        ),
                    bottomLeft =
                        KeyC(
                            CommitText("m"),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̌"),
                            action = NormalizeLastKey("\u030c"),
                        ),
                    top =
                        KeyC(
                            CommitText("ı"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̓"),
                            action = NormalizeLastKey("\u0313"),
                        ),
                    top =
                        KeyC(
                            // PER MILLE SIGN
                            display = KeyDisplay.TextDisplay("‰"),
                            action = CommitText("\u2030"),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̦"),
                            action = NormalizeLastKey("\u0326"),
                        ),
                    left =
                        KeyC(
                            // DAGGER
                            display = KeyDisplay.TextDisplay("†"),
                            action = CommitText("\u2020"),
                            color = MUTED,
                        ),
                    right =
                        KeyC(
                            CommitText("h"),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̏"),
                            action = NormalizeLastKey("\u030f"),
                        ),
                    bottom =
                        KeyC(
                            // PLUS-MINUS SIGN
                            display = KeyDisplay.TextDisplay("±"),
                            action = CommitText("\u00b1"),
                            color = MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̇"),
                            action = NormalizeLastKey("\u0307"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    topLeft =
                        KeyC(
                            CommitText("y"),
                        ),
                    top =
                        KeyC(
                            CommitText("q"),
                        ),
                    topRight =
                        KeyC(
                            CommitText("w"),
                        ),
                    right =
                        KeyC(
                            CommitText("k"),
                        ),
                    bottomRight =
                        KeyC(
                            CommitText("b"),
                        ),
                    bottom =
                        KeyC(
                            CommitText("j"),
                        ),
                    bottomLeft =
                        KeyC(
                            CommitText("z"),
                        ),
                    left =
                        KeyC(
                            CommitText("f"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̊"),
                            action = NormalizeLastKey("\u030a"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̨"),
                            action = NormalizeLastKey("\u0328"),
                        ),
                    left =
                        KeyC(
                            CommitText("u"),
                        ),
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
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̒"),
                            action = NormalizeLastKey("\u0312"),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̈"),
                            action = NormalizeLastKey("\u0308"),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̧"),
                            action = NormalizeLastKey("\u0327"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    topLeft =
                        KeyC(
                            // U+00DE
                            action = CommitText("þ"),
                        ),
                    top =
                        KeyC(
                            // DEGREE SIGN
                            display = KeyDisplay.TextDisplay("°"),
                            action = CommitText("\u00b0"),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            CommitText("c"),
                        ),
                    bottomLeft =
                        KeyC(
                            // U+0152
                            action = CommitText("œ"),
                        ),
                    bottomRight =
                        KeyC(
                            // U+00D0
                            action = CommitText("ð"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topLeft =
                        KeyC(
                            CommitText("đ"),
                        ),
                    top =
                        KeyC(
                            CommitText("g"),
                        ),
                    topRight =
                        KeyC(
                            CommitText("ø"),
                        ),
                    right =
                        KeyC(
                            CommitText("x"),
                        ),
                    left =
                        KeyC(
                            CommitText("æ"),
                        ),
                    bottomLeft = KeyC("'", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft =
                        KeyC(
                            CommitText("d"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̀"),
                            action = NormalizeLastKey("\u0300"),
                        ),
                    left =
                        KeyC(
                            CommitText("ß"),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̂"),
                            action = NormalizeLastKey("\u0302"),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̋"),
                            action = NormalizeLastKey("\u030b"),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌́"),
                            action = NormalizeLastKey("\u0301"),
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
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("«", color = MUTED),
                    top = KeyC("§", color = MUTED),
                    topRight = KeyC("»", color = MUTED),
                    left = KeyC("¿", color = MUTED),
                    right = KeyC("?", color = MUTED),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̄"),
                            action = NormalizeLastKey("\u0304"),
                        ),
                    bottomRight =
                        KeyC(
                            CommitText("P"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    left = KeyC("¡", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    top =
                        KeyC(
                            CommitText("Ł"),
                        ),
                    bottom =
                        KeyC(
                            CommitText("V"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̃"),
                            action = NormalizeLastKey("\u0303"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̆"),
                            action = NormalizeLastKey("\u0306"),
                        ),
                    bottomLeft =
                        KeyC(
                            CommitText("M"),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̌"),
                            action = NormalizeLastKey("\u030c"),
                        ),
                    top =
                        KeyC(
                            CommitText("İ"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̓"),
                            action = NormalizeLastKey("\u0313"),
                        ),
                    top =
                        KeyC(
                            // PER MILLE SIGN
                            display = KeyDisplay.TextDisplay("‰"),
                            action = CommitText("\u2030"),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̦"),
                            action = NormalizeLastKey("\u0326"),
                        ),
                    left =
                        KeyC(
                            // DOUBLE DAGGER
                            display = KeyDisplay.TextDisplay("‡"),
                            action = CommitText("\u2021"),
                            color = MUTED,
                        ),
                    right =
                        KeyC(
                            CommitText("H"),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̏"),
                            action = NormalizeLastKey("\u030f"),
                        ),
                    bottom =
                        KeyC(
                            // PLUS-MINUS SIGN
                            display = KeyDisplay.TextDisplay("±"),
                            action = CommitText("\u00b1"),
                            color = MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̇"),
                            action = NormalizeLastKey("\u0307"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    topLeft =
                        KeyC(
                            CommitText("Y"),
                        ),
                    top =
                        KeyC(
                            CommitText("Q"),
                        ),
                    topRight =
                        KeyC(
                            CommitText("W"),
                        ),
                    right =
                        KeyC(
                            CommitText("K"),
                        ),
                    bottomRight =
                        KeyC(
                            CommitText("B"),
                        ),
                    bottom =
                        KeyC(
                            CommitText("J"),
                        ),
                    bottomLeft =
                        KeyC(
                            CommitText("Z"),
                        ),
                    left =
                        KeyC(
                            CommitText("F"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̊"),
                            action = NormalizeLastKey("\u030a"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̨"),
                            action = NormalizeLastKey("\u0328"),
                        ),
                    left =
                        KeyC(
                            CommitText("U"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̒"),
                            action = NormalizeLastKey("\u0312"),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̈"),
                            action = NormalizeLastKey("\u0308"),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̧"),
                            action = NormalizeLastKey("\u0327"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    topLeft =
                        KeyC(
                            CommitText("Þ"),
                        ),
                    top =
                        KeyC(
                            // DEGREE SIGN
                            display = KeyDisplay.TextDisplay("°"),
                            action = CommitText("\u00b0"),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            CommitText("C"),
                        ),
                    bottomLeft =
                        KeyC(
                            CommitText("Œ"),
                        ),
                    bottomRight =
                        KeyC(
                            CommitText("Ð"),
                        ),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topLeft =
                        KeyC(
                            CommitText("Đ"),
                        ),
                    top =
                        KeyC(
                            CommitText("G"),
                        ),
                    topRight =
                        KeyC(
                            CommitText("Ø"),
                        ),
                    right =
                        KeyC(
                            CommitText("X"),
                        ),
                    left =
                        KeyC(
                            CommitText("Æ"),
                        ),
                    bottomLeft = KeyC("'", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft =
                        KeyC(
                            CommitText("D"),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̀"),
                            action = NormalizeLastKey("\u0300"),
                        ),
                    left =
                        KeyC(
                            CommitText("ẞ"),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̂"),
                            action = NormalizeLastKey("\u0302"),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌̋"),
                            action = NormalizeLastKey("\u030b"),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("◌́"),
                            action = NormalizeLastKey("\u0301"),
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
