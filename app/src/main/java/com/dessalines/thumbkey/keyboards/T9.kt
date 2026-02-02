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

val KB_T9_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    topLeft = KeyC("$", color = MUTED),
                    top = KeyC("%", color = MUTED),
                    topRight = KeyC("&", color = MUTED),
                    bottomLeft = KeyC("£", color = MUTED),
                    left = KeyC("€", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    topLeft = KeyC("~", color = MUTED),
                    top = KeyC("`", color = MUTED),
                    topRight = KeyC("^", color = MUTED),
                    bottomRight = KeyC("c"),
                    bottom = KeyC("b"),
                    bottomLeft = KeyC("a"),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    topLeft = KeyC("@", color = MUTED),
                    top = KeyC(":", color = MUTED),
                    topRight = KeyC(";", color = MUTED),
                    bottomRight = KeyC("f"),
                    bottom = KeyC("e"),
                    bottomLeft = KeyC("d"),
                    left = KeyC("#", color = MUTED),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            CommitText("-"),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    topLeft = KeyC("/", color = MUTED),
                    top = KeyC("*", color = MUTED),
                    topRight = KeyC("\\", color = MUTED),
                    right = KeyC("=", color = MUTED),
                    bottomRight = KeyC(">", color = MUTED),
                    bottom = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    bottomRight = KeyC("i"),
                    bottom = KeyC("h"),
                    bottomLeft = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    bottomRight = KeyC("l"),
                    bottom = KeyC("k"),
                    bottomLeft = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    bottomRight = KeyC("o"),
                    bottom = KeyC("n"),
                    bottomLeft = KeyC("m"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇧"),
                            action = ToggleShiftMode(true),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    bottomRight = KeyC("s"),
                    bottom = KeyC("r"),
                    bottomLeft = KeyC("q"),
                    left = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    bottomRight = KeyC("v"),
                    bottom = KeyC("u"),
                    bottomLeft = KeyC("t"),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    right = KeyC("z"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("x"),
                    bottomLeft = KeyC("w"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⌫"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent
                                            .KEYCODE_DEL,
                                    ),
                                ),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.SelectAll),
                            action = SelectAll,
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCopy),
                            action = Copy,
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCut),
                            action = Cut,
                            color = MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇥"),
                            action = DeleteWordAfterCursor,
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ContentPaste),
                            action = Paste,
                            color = MUTED,
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇤"),
                            action = DeleteWordBeforeCursor,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC(" ", displayText = "␠", color = SECONDARY),
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
                    backgroundColor = SURFACE_VARIANT,
                    nextTapActions =
                        listOf(
                            ReplaceLastText(", ", trimCount = 1),
                            ReplaceLastText(". "),
                            ReplaceLastText("? "),
                            ReplaceLastText("! "),
                            ReplaceLastText(": "),
                            ReplaceLastText("; "),
                        ),
                ),
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    bottom = KeyC("|", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            CommitText("."),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    topLeft = KeyC("'", color = MUTED),
                    topRight = KeyC("\"", color = MUTED),
                    bottomRight = KeyC("?", color = MUTED),
                    bottom = KeyC(",", color = MUTED),
                    bottomLeft = KeyC("!", color = MUTED),
                    backgroundColor = SURFACE_VARIANT,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                            action = IMECompleteAction,
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                            action = GotoSettings,
                            color = MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.Language),
                            action = SwitchLanguage,
                            color = MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↔"),
                            action = MoveKeyboard.CycleRight,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
        ),
    )

val KB_T9_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    topLeft = KeyC("$", color = MUTED),
                    top = KeyC("%", color = MUTED),
                    topRight = KeyC("&", color = MUTED),
                    bottomLeft = KeyC("£", color = MUTED),
                    left = KeyC("€", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    topLeft = KeyC("~", color = MUTED),
                    top = KeyC("`", color = MUTED),
                    topRight = KeyC("^", color = MUTED),
                    bottomRight = KeyC("C"),
                    bottom = KeyC("B"),
                    bottomLeft = KeyC("A"),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    topLeft = KeyC("@", color = MUTED),
                    top = KeyC(":", color = MUTED),
                    topRight = KeyC(";", color = MUTED),
                    bottomRight = KeyC("F"),
                    bottom = KeyC("E"),
                    bottomLeft = KeyC("D"),
                    left = KeyC("#", color = MUTED),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            CommitText("-"),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    topLeft = KeyC("/", color = MUTED),
                    top = KeyC("*", color = MUTED),
                    topRight = KeyC("\\", color = MUTED),
                    right = KeyC("=", color = MUTED),
                    bottomRight = KeyC(">", color = MUTED),
                    bottom = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    bottomRight = KeyC("I"),
                    bottom = KeyC("H"),
                    bottomLeft = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    bottomRight = KeyC("L"),
                    bottom = KeyC("K"),
                    bottomLeft = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    bottomRight = KeyC("O"),
                    bottom = KeyC("N"),
                    bottomLeft = KeyC("M"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇩"),
                            action = ToggleShiftMode(false),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇪"),
                            capsModeDisplay = KeyDisplay.TextDisplay("⇧"),
                            action = ToggleCapsLock,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    bottomRight = KeyC("S"),
                    bottom = KeyC("R"),
                    bottomLeft = KeyC("Q"),
                    left = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    bottomRight = KeyC("V"),
                    bottom = KeyC("U"),
                    bottomLeft = KeyC("T"),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    right = KeyC("Z"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("X"),
                    bottomLeft = KeyC("W"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⌫"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent
                                            .KEYCODE_DEL,
                                    ),
                                ),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.SelectAll),
                            action = SelectAll,
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCopy),
                            action = Copy,
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCut),
                            action = Cut,
                            color = MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇥"),
                            action = DeleteWordAfterCursor,
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ContentPaste),
                            action = Paste,
                            color = MUTED,
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇤"),
                            action = DeleteWordBeforeCursor,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC(" ", displayText = "␠", color = SECONDARY),
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
                    backgroundColor = SURFACE_VARIANT,
                    nextTapActions =
                        listOf(
                            ReplaceLastText(", ", trimCount = 1),
                            ReplaceLastText(". "),
                            ReplaceLastText("? "),
                            ReplaceLastText("! "),
                            ReplaceLastText(": "),
                            ReplaceLastText("; "),
                        ),
                ),
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    bottom = KeyC("|", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            CommitText("."),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    topLeft = KeyC("'", color = MUTED),
                    topRight = KeyC("\"", color = MUTED),
                    bottomRight = KeyC("?", color = MUTED),
                    bottom = KeyC(",", color = MUTED),
                    bottomLeft = KeyC("!", color = MUTED),
                    backgroundColor = SURFACE_VARIANT,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                            action = IMECompleteAction,
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                            action = GotoSettings,
                            color = MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.Language),
                            action = SwitchLanguage,
                            color = MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↔"),
                            action = MoveKeyboard.CycleRight,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
        ),
    )

val KB_T9: KeyboardDefinition =
    KeyboardDefinition(
        title = "T9",
        locales = listOf("en"),
        modes =
            KeyboardDefinitionModes(
                main = KB_T9_MAIN,
                shifted = KB_T9_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
