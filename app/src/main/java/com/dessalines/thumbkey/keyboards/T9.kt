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
                    center =
                        KeyC(
                            KeyAction.CommitText("1"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("$"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("%"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("&"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("£"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("€"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("2"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("~"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("`"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("^"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("c"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("b"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("a"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("3"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("f"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("e"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("d"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("#"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("-"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("/"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("\\"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("="),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(">"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("_"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("<"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("+"),
                            color = ColorVariant.MUTED,
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("4"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("i"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("h"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("g"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("5"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("l"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("k"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("j"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("6"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("o"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("n"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("m"),
                        ),
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
                    center =
                        KeyC(
                            KeyAction.CommitText("7"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("s"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("r"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("q"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("p"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("8"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("v"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("u"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("t"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("9"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("z"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("y"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("x"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("w"),
                        ),
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
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("␠"),
                            action = KeyAction.CommitText(" "),
                            color = ColorVariant.SECONDARY,
                        ),
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
                    center =
                        KeyC(
                            KeyAction.CommitText("0"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("{"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("}"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("]"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("|"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("["),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("."),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
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
                    center =
                        KeyC(
                            KeyAction.CommitText("1"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("$"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("%"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("&"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("£"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("€"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("2"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("~"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("`"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("^"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("C"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("B"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("A"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("3"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("F"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("E"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("D"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("#"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("-"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("/"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("\\"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("="),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(">"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("_"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("<"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("+"),
                            color = ColorVariant.MUTED,
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("4"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("I"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("H"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("G"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("5"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("L"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("K"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("J"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("6"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("O"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("N"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("M"),
                        ),
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
                    center =
                        KeyC(
                            KeyAction.CommitText("7"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("S"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("R"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("Q"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("P"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("8"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("V"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("U"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("T"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("9"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Z"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("Y"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("X"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("W"),
                        ),
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
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("␠"),
                            action = KeyAction.CommitText(" "),
                            color = ColorVariant.SECONDARY,
                        ),
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
                    center =
                        KeyC(
                            KeyAction.CommitText("0"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("{"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("}"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("]"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("|"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("["),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("."),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
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
