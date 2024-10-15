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
import com.dessalines.thumbkey.utils.SwipeDirection

val KB_T9_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("1"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("$"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("%"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("&"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("£"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("€"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("2"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("~"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("`"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("^"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("c"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("b"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("a"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("3"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("@"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText(":"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText(";"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("f"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("e"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("d"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("#"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("/"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("*"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("\\"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("="),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText(">"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("_"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("<"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("+"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("4"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("i"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("h"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("g"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("5"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("l"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("k"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("j"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("6"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("o"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("n"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("m"),
                                ),
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
                            action = KeyAction.CommitText("7"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("s"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("r"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("q"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("p"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("8"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("v"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("u"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("t"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("9"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("z"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("y"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("x"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("w"),
                                ),
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
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.SelectAll),
                                    action = KeyAction.SelectAll,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCopy),
                                    action = KeyAction.Copy,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCut),
                                    action = KeyAction.Cut,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("⇥"),
                                    action = KeyAction.DeleteWordAfterCursor,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ContentPaste),
                                    action = KeyAction.Paste,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("⇤"),
                                    action = KeyAction.DeleteWordBeforeCursor,
                                    color = ColorVariant.MUTED,
                                ),
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
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
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
                            SwipeDirection.RIGHT to
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
                            SwipeDirection.BOTTOM to
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
                            SwipeDirection.LEFT to
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
                            action = KeyAction.CommitText("0"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("{"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("}"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText(")"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("]"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("|"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("["),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("("),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("'"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("\""),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("?"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText(","),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("!"),
                                    color = ColorVariant.MUTED,
                                ),
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
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                                    action = KeyAction.GotoSettings,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.Language),
                                    action = KeyAction.SwitchLanguage,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("↔"),
                                    action = KeyAction.SwitchPosition,
                                    color = ColorVariant.MUTED,
                                ),
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
                            action = KeyAction.CommitText("1"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("$"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("%"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("&"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("£"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("€"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("2"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("~"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("`"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("^"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("C"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("B"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("A"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("3"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("@"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText(":"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText(";"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("F"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("E"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("D"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("#"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("/"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("*"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("\\"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("="),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText(">"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("_"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("<"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("+"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("4"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("I"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("H"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("G"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("5"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("L"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("K"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("J"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("6"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("O"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("N"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("M"),
                                ),
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
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("⇪"),
                                    capsModeDisplay = KeyDisplay.TextDisplay("⇧"),
                                    action = KeyAction.ToggleCapsLock,
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("7"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("S"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("R"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("Q"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("P"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("8"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("V"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("U"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("T"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("9"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("Z"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("Y"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("X"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("W"),
                                ),
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
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.SelectAll),
                                    action = KeyAction.SelectAll,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCopy),
                                    action = KeyAction.Copy,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCut),
                                    action = KeyAction.Cut,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("⇥"),
                                    action = KeyAction.DeleteWordAfterCursor,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ContentPaste),
                                    action = KeyAction.Paste,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("⇤"),
                                    action = KeyAction.DeleteWordBeforeCursor,
                                    color = ColorVariant.MUTED,
                                ),
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
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
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
                            SwipeDirection.RIGHT to
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
                            SwipeDirection.BOTTOM to
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
                            SwipeDirection.LEFT to
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
                            action = KeyAction.CommitText("0"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("{"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("}"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText(")"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("]"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("|"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("["),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("("),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.SECONDARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("'"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("\""),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("?"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText(","),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("!"),
                                    color = ColorVariant.MUTED,
                                ),
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
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                                    action = KeyAction.GotoSettings,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.Language),
                                    action = KeyAction.SwitchLanguage,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("↔"),
                                    action = KeyAction.SwitchPosition,
                                    color = ColorVariant.MUTED,
                                ),
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
