package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardReturn
import androidx.compose.material.icons.outlined.ContentCopy
import androidx.compose.material.icons.outlined.ContentCut
import androidx.compose.material.icons.outlined.ContentPaste
import androidx.compose.material.icons.outlined.Language
import androidx.compose.material.icons.outlined.SelectAll
import androidx.compose.material.icons.outlined.Settings
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes

val KB_T9_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("1", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("$", color = ColorVariant.MUTED),
                    top = KeyC("%", color = ColorVariant.MUTED),
                    topRight = KeyC("&", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("£", color = ColorVariant.MUTED),
                    left = KeyC("€", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("2", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    top = KeyC("`", color = ColorVariant.MUTED),
                    topRight = KeyC("^", color = ColorVariant.MUTED),
                    bottomRight = KeyC("c"),
                    bottom = KeyC("b"),
                    bottomLeft = KeyC("a"),
                ),
                KeyItemC(
                    center = KeyC("3", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("@", color = ColorVariant.MUTED),
                    top = KeyC(":", color = ColorVariant.MUTED),
                    topRight = KeyC(";", color = ColorVariant.MUTED),
                    bottomRight = KeyC("f"),
                    bottom = KeyC("e"),
                    bottomLeft = KeyC("d"),
                    left = KeyC("#", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("-"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    topLeft = KeyC("/", color = ColorVariant.MUTED),
                    top = KeyC("*", color = ColorVariant.MUTED),
                    topRight = KeyC("\\", color = ColorVariant.MUTED),
                    right = KeyC("=", color = ColorVariant.MUTED),
                    bottomRight = KeyC(">", color = ColorVariant.MUTED),
                    bottom = KeyC("_", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("<", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("i"),
                    bottom = KeyC("h"),
                    bottomLeft = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("5", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("l"),
                    bottom = KeyC("k"),
                    bottomLeft = KeyC("j"),
                ),
                KeyItemC(
                    center = KeyC("6", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("o"),
                    bottom = KeyC("n"),
                    bottomLeft = KeyC("m"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇧"),
                            action = KeyAction.ToggleShiftMode(true),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("7", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("s"),
                    bottom = KeyC("r"),
                    bottomLeft = KeyC("q"),
                    left = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("8", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("v"),
                    bottom = KeyC("u"),
                    bottomLeft = KeyC("t"),
                ),
                KeyItemC(
                    center = KeyC("9", size = FontSizeVariant.LARGE),
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
                                KeyAction.SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent
                                            .KEYCODE_DEL,
                                    ),
                                ),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.SelectAll),
                            action = KeyAction.SelectAll,
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCopy),
                            action = KeyAction.Copy,
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCut),
                            action = KeyAction.Cut,
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇥"),
                            action = KeyAction.DeleteWordAfterCursor,
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ContentPaste),
                            action = KeyAction.Paste,
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇤"),
                            action = KeyAction.DeleteWordBeforeCursor,
                            color = ColorVariant.MUTED,
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC(" ", displayText = "␠", color = ColorVariant.SECONDARY),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↑"),
                            action =
                                KeyAction.SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_UP,
                                    ),
                                ),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("→"),
                            action =
                                KeyAction.SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_RIGHT,
                                    ),
                                ),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↓"),
                            action =
                                KeyAction.SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_DOWN,
                                    ),
                                ),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("←"),
                            action =
                                KeyAction.SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_LEFT,
                                    ),
                                ),
                            color = ColorVariant.MUTED,
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                    nextTapActions =
                        listOf(
                            KeyAction.ReplaceLastText(", ", trimCount = 1),
                            KeyAction.ReplaceLastText(". "),
                            KeyAction.ReplaceLastText("? "),
                            KeyAction.ReplaceLastText("! "),
                            KeyAction.ReplaceLastText(": "),
                            KeyAction.ReplaceLastText("; "),
                        ),
                ),
                KeyItemC(
                    center = KeyC("0", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    bottom = KeyC("|", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("."),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    topLeft = KeyC("'", color = ColorVariant.MUTED),
                    topRight = KeyC("\"", color = ColorVariant.MUTED),
                    bottomRight = KeyC("?", color = ColorVariant.MUTED),
                    bottom = KeyC(",", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("!", color = ColorVariant.MUTED),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                            action = KeyAction.IMECompleteAction,
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                            action = KeyAction.GotoSettings,
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.Language),
                            action = KeyAction.SwitchLanguage,
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↔"),
                            action = KeyAction.SwitchPosition,
                            color = ColorVariant.MUTED,
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
            ),
        ),
    )

val KB_T9_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("1", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("$", color = ColorVariant.MUTED),
                    top = KeyC("%", color = ColorVariant.MUTED),
                    topRight = KeyC("&", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("£", color = ColorVariant.MUTED),
                    left = KeyC("€", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("2", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    top = KeyC("`", color = ColorVariant.MUTED),
                    topRight = KeyC("^", color = ColorVariant.MUTED),
                    bottomRight = KeyC("C"),
                    bottom = KeyC("B"),
                    bottomLeft = KeyC("A"),
                ),
                KeyItemC(
                    center = KeyC("3", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("@", color = ColorVariant.MUTED),
                    top = KeyC(":", color = ColorVariant.MUTED),
                    topRight = KeyC(";", color = ColorVariant.MUTED),
                    bottomRight = KeyC("F"),
                    bottom = KeyC("E"),
                    bottomLeft = KeyC("D"),
                    left = KeyC("#", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("-"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    topLeft = KeyC("/", color = ColorVariant.MUTED),
                    top = KeyC("*", color = ColorVariant.MUTED),
                    topRight = KeyC("\\", color = ColorVariant.MUTED),
                    right = KeyC("=", color = ColorVariant.MUTED),
                    bottomRight = KeyC(">", color = ColorVariant.MUTED),
                    bottom = KeyC("_", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("<", color = ColorVariant.MUTED),
                    left = KeyC("+", color = ColorVariant.MUTED),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("I"),
                    bottom = KeyC("H"),
                    bottomLeft = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("5", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("L"),
                    bottom = KeyC("K"),
                    bottomLeft = KeyC("J"),
                ),
                KeyItemC(
                    center = KeyC("6", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("O"),
                    bottom = KeyC("N"),
                    bottomLeft = KeyC("M"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇩"),
                            action = KeyAction.ToggleShiftMode(false),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇪"),
                            capsModeDisplay = KeyDisplay.TextDisplay("⇧"),
                            action = KeyAction.ToggleCapsLock,
                            color = ColorVariant.MUTED,
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("7", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("S"),
                    bottom = KeyC("R"),
                    bottomLeft = KeyC("Q"),
                    left = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("8", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("V"),
                    bottom = KeyC("U"),
                    bottomLeft = KeyC("T"),
                ),
                KeyItemC(
                    center = KeyC("9", size = FontSizeVariant.LARGE),
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
                                KeyAction.SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent
                                            .KEYCODE_DEL,
                                    ),
                                ),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.SelectAll),
                            action = KeyAction.SelectAll,
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCopy),
                            action = KeyAction.Copy,
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCut),
                            action = KeyAction.Cut,
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇥"),
                            action = KeyAction.DeleteWordAfterCursor,
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ContentPaste),
                            action = KeyAction.Paste,
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇤"),
                            action = KeyAction.DeleteWordBeforeCursor,
                            color = ColorVariant.MUTED,
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC(" ", displayText = "␠", color = ColorVariant.SECONDARY),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↑"),
                            action =
                                KeyAction.SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_UP,
                                    ),
                                ),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("→"),
                            action =
                                KeyAction.SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_RIGHT,
                                    ),
                                ),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↓"),
                            action =
                                KeyAction.SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_DOWN,
                                    ),
                                ),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("←"),
                            action =
                                KeyAction.SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_LEFT,
                                    ),
                                ),
                            color = ColorVariant.MUTED,
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                    nextTapActions =
                        listOf(
                            KeyAction.ReplaceLastText(", ", trimCount = 1),
                            KeyAction.ReplaceLastText(". "),
                            KeyAction.ReplaceLastText("? "),
                            KeyAction.ReplaceLastText("! "),
                            KeyAction.ReplaceLastText(": "),
                            KeyAction.ReplaceLastText("; "),
                        ),
                ),
                KeyItemC(
                    center = KeyC("0", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    bottom = KeyC("|", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("."),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    topLeft = KeyC("'", color = ColorVariant.MUTED),
                    topRight = KeyC("\"", color = ColorVariant.MUTED),
                    bottomRight = KeyC("?", color = ColorVariant.MUTED),
                    bottom = KeyC(",", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("!", color = ColorVariant.MUTED),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                            action = KeyAction.IMECompleteAction,
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                            action = KeyAction.GotoSettings,
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.Language),
                            action = KeyAction.SwitchLanguage,
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↔"),
                            action = KeyAction.SwitchPosition,
                            color = ColorVariant.MUTED,
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
            ),
        ),
    )

val KB_T9: KeyboardDefinition =
    KeyboardDefinition(
        title = "T9",
        modes =
            KeyboardDefinitionModes(
                main = KB_T9_MAIN,
                shifted = KB_T9_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
