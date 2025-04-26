@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_DE_TYPESPLIT_IMPROVED_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("f"),
                    right = KeyC("g"),
                    bottom = KeyC("ß"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("j"),
                    right = KeyC("m"),
                    bottom = KeyC("k"),
                    left = KeyC("p"),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("ö"),
                    right = KeyC("y"),
                    bottom = KeyC("€", color = MUTED),
                    left = KeyC("o"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("ä"),
                    bottom = KeyC("&", color = MUTED),
                    left = KeyC("@", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("-", color = MUTED),
                    right = KeyC("+", color = MUTED),
                    bottom = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("x"),
                    right = KeyC("w"),
                    bottom = KeyC("q"),
                    left = KeyC("v"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardBackspace),
                            action = DeleteKeyAction,
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    slideType = SlideType.DELETE,
                    top = KeyC("."),
                    bottom = KeyC(","),
                    left =
                        KeyC(
                            DeleteWordBeforeCursor,
                            display = null,
                        ),
                    right =
                        KeyC(
                            DeleteWordAfterCursor,
                            display = null,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                    longPress = DeleteWordBeforeCursor,
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("1", color = MUTED),
                    left = KeyC("2", color = MUTED),
                    right = KeyC("3", color = MUTED),
                    bottom = KeyC("4", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("ü"),
                    left = KeyC("5", color = MUTED),
                    bottom = KeyC("6", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("„“"), // mi
                            action = SmartQuotes("„", "“"),
                            color = MUTED,
                        ),
                    right = KeyC("'", color = MUTED),
                    bottom = KeyC("#", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("b"),
                    right = KeyC("z"),
                    left = KeyC("<", color = MUTED),
                    bottom = KeyC(">", color = MUTED),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    left = KeyC("!"),
                    right = KeyC("?"),
                    backgroundColor = SURFACE_VARIANT,
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("7", color = MUTED),
                    left = KeyC("8", color = MUTED),
                    right = KeyC("9", color = MUTED),
                    bottom = KeyC("0", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("(", color = MUTED),
                    bottom = KeyC(")", color = MUTED),
                    left = KeyC("/", color = MUTED),
                ),
            ),
            listOf(
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC(" "),
                    swipeType = FOUR_WAY_CROSS,
                    slideType = SlideType.MOVE_CURSOR,
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("←"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_LEFT,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("→"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_RIGHT,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↑"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_UP,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↓"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_DOWN,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    nextTapActions =
                        listOf(
                            ReplaceLastText(", ", trimCount = 1),
                            ReplaceLastText(". "),
                            ReplaceLastText("? "),
                            ReplaceLastText("! "),
                            ReplaceLastText(": "),
                            ReplaceLastText("; "),
                        ),
                    backgroundColor = SURFACE_VARIANT,
                    widthMultiplier = 3,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                            action = IMECompleteAction,
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("\n"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = CommitText("\t"),
                            color = SECONDARY,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                    longPress = CommitText("\n"),
                ),
            ),
        ),
    )

val KB_DE_TYPESPLIT_IMPROVED_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("F"),
                    right = KeyC("G"),
                    bottom = KeyC("ẞ"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("J"),
                    right = KeyC("M"),
                    bottom = KeyC("K"),
                    left = KeyC("P"),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Ö"),
                    right = KeyC("Y"),
                    bottom = KeyC("$", color = MUTED),
                    left = KeyC("O"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Ä"),
                    bottom = KeyC("£", color = MUTED),
                    left = KeyC("µ", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("_", color = MUTED),
                    right = KeyC("*", color = MUTED),
                    bottom = KeyC("°", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("X"),
                    right = KeyC("W"),
                    bottom = KeyC("Q"),
                    left = KeyC("V"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardBackspace),
                            action = DeleteKeyAction,
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    slideType = SlideType.DELETE,
                    left =
                        KeyC(
                            DeleteWordBeforeCursor,
                            display = null,
                        ),
                    right =
                        KeyC(
                            DeleteWordAfterCursor,
                            display = null,
                        ),
                    top = KeyC(":"),
                    bottom = KeyC(";"),
                    backgroundColor = SURFACE_VARIANT,
                    longPress = DeleteWordBeforeCursor,
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("1", color = MUTED),
                    left = KeyC("2", color = MUTED),
                    right = KeyC("3", color = MUTED),
                    bottom = KeyC("4", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Ü"),
                    left = KeyC("5", color = MUTED),
                    bottom = KeyC("6", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\"", color = MUTED),
                    right = KeyC("~", color = MUTED),
                    bottom = KeyC("§", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("B"),
                    right = KeyC("Z"),
                    bottom = KeyC("^", color = MUTED),
                    left = KeyC("|", color = MUTED),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleCapsLock,
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    left = KeyC("[", color = MUTED),
                    right = KeyC("]", color = MUTED),
                    backgroundColor = SURFACE_VARIANT,
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("7", color = MUTED),
                    left = KeyC("8", color = MUTED),
                    right = KeyC("9", color = MUTED),
                    bottom = KeyC("0", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("}", color = MUTED),
                    bottom = KeyC("{", color = MUTED),
                    left = KeyC("\\", color = MUTED),
                ),
            ),
            listOf(
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC(" "),
                    swipeType = FOUR_WAY_CROSS,
                    slideType = SlideType.MOVE_CURSOR,
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("←"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_LEFT,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("→"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_RIGHT,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↑"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_UP,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↓"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_DOWN,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    nextTapActions =
                        listOf(
                            ReplaceLastText(", ", trimCount = 1),
                            ReplaceLastText(". "),
                            ReplaceLastText("? "),
                            ReplaceLastText("! "),
                            ReplaceLastText(": "),
                            ReplaceLastText("; "),
                        ),
                    backgroundColor = SURFACE_VARIANT,
                    widthMultiplier = 3,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                            action = IMECompleteAction,
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            display = null,
                            action = CommitText("\n"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = CommitText("\t"),
                            color = SECONDARY,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                    longPress = CommitText("\n"),
                ),
            ),
        ),
    )

val KB_DE_TYPESPLIT_IMPROVED_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                ABC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("=", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("*"),
                    right = KeyC("/"),
                    top = KeyC("+"),
                    bottom = KeyC("-"),
                ),
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u00B9", displayText = "¹", color = MUTED),
                    bottom = KeyC("\u2081", displayText = "₁", color = MUTED),
                    left = KeyC("\u0300", displayText = "◌̀", color = MUTED),
                    right = KeyC("\u0301", displayText = "◌́", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u00B2", displayText = "²", color = MUTED),
                    bottom = KeyC("\u2082", displayText = "₂", color = MUTED),
                    left = KeyC("\u0302", displayText = "◌̂", color = MUTED),
                    right = KeyC("\u030C", displayText = "◌̌", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u00B3", displayText = "³", color = MUTED),
                    bottom = KeyC("\u2083", displayText = "₃", color = MUTED),
                    left = KeyC("\u0303", displayText = "◌̃", color = MUTED),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("%", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("~", color = MUTED),
                    bottom = KeyC("°", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    right = KeyC(")", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u2074", displayText = "⁴", color = MUTED),
                    bottom = KeyC("\u2084", displayText = "₄", color = MUTED),
                    left = KeyC("[", color = MUTED),
                    right = KeyC("]", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u2075", displayText = "⁵", color = MUTED),
                    bottom = KeyC("\u2085", displayText = "₅", color = MUTED),
                    left = KeyC("{", color = MUTED),
                    right = KeyC("}", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u2076", displayText = "⁶", color = MUTED),
                    bottom = KeyC("\u2086", displayText = "₆", color = MUTED),
                    left = KeyC("\u0304", displayText = "◌̄", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                            action = IMECompleteAction,
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = null,
                            action = CommitText("\n"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = CommitText("\t"),
                            color = SECONDARY,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                    longPress = CommitText("\n"),
                ),
                KeyItemC(
                    center = KeyC(".", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC(":"),
                    bottom = KeyC("_", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC(">", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u2077", displayText = "⁷", color = MUTED),
                    bottom = KeyC("\u2087", displayText = "₇", color = MUTED),
                    left = KeyC("€", color = MUTED),
                    right = KeyC("$", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u2078", displayText = "⁸", color = MUTED),
                    bottom = KeyC("\u2088", displayText = "₈", color = MUTED),
                    left = KeyC("§", color = MUTED),
                    right = KeyC("&", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u2079", displayText = "⁹", color = MUTED),
                    bottom = KeyC("\u2089", displayText = "₉", color = MUTED),
                    left = KeyC("\u0336", displayText = "◌̶", color = MUTED),
                ),
            ),
            listOf(
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC(" "),
                    swipeType = FOUR_WAY_CROSS,
                    slideType = SlideType.MOVE_CURSOR,
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("←"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_LEFT,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("→"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_RIGHT,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↑"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_UP,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↓"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_DOWN,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    nextTapActions =
                        listOf(
                            ReplaceLastText(", ", trimCount = 1),
                            ReplaceLastText(". "),
                            ReplaceLastText("? "),
                            ReplaceLastText("! "),
                            ReplaceLastText(": "),
                            ReplaceLastText("; "),
                        ),
                    backgroundColor = SURFACE_VARIANT,
                    widthMultiplier = 2,
                ),
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u2070", displayText = "⁰", color = MUTED),
                    bottom = KeyC("\u2080", displayText = "₀", color = MUTED),
                    left = KeyC("\u0307", displayText = "◌̇", color = MUTED),
                    right = KeyC("\u0308", displayText = "◌̈", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC(",", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC(";"),
                    left = KeyC("\u0327", displayText = "◌̧", color = MUTED),
                ),
            ),
        ),
    )

val KB_DE_TYPESPLIT_IMPROVED: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch type-split improved",
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_TYPESPLIT_IMPROVED_MAIN,
                shifted = KB_DE_TYPESPLIT_IMPROVED_SHIFTED,
                numeric = KB_DE_TYPESPLIT_IMPROVED_NUMERIC,
            ),
    )
