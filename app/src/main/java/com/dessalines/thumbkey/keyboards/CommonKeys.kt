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

fun textEditKeyItem(center: KeyC) =
    KeyItemC(
        backgroundColor = SURFACE_VARIANT,
        swipeType = EIGHT_WAY,
        center = center,
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCopy),
                action = Copy,
                color = MUTED,
            ),
        topLeft =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.SelectAll),
                action = SelectAll,
                color = MUTED,
            ),
        topRight =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCut),
                action = Cut,
                color = MUTED,
            ),
        left =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.Undo),
                action = Undo,
                color = MUTED,
            ),
        right =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.Redo),
                action = Redo,
                color = MUTED,
            ),
        bottom =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ContentPaste),
                action = Paste,
                color = MUTED,
            ),
    )

fun specialActionKeyItem(center: KeyC) =
    KeyItemC(
        backgroundColor = SURFACE_VARIANT,
        swipeType = EIGHT_WAY,
        center = center,
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                action = GotoSettings,
                color = MUTED,
            ),
        bottom =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Keyboard),
                action = SwitchIME,
                color = MUTED,
            ),
        bottomLeft =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Mic),
                action = SwitchIMEVoice,
                color = MUTED,
            ),
        left =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Language),
                action = SwitchLanguage,
                color = MUTED,
            ),
        right =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.LinearScale),
                action = SwitchPosition,
                color = MUTED,
            ),
    )

val ABC_KEY_ITEM =
    textEditKeyItem(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Abc),
                action = ToggleNumericMode(false),
                size = LARGE,
            ),
    )

val NUMERIC_KEY_ITEM =
    textEditKeyItem(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Numbers),
                action = ToggleNumericMode(true),
                size = LARGE,
                color = SECONDARY,
            ),
    )

val EMOJI_KEY_ITEM =
    specialActionKeyItem(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Mood),
                action = ToggleEmojiMode(true),
                size = LARGE,
                color = SECONDARY,
            ),
    )

val EMOJI_BACK_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Abc),
                action = ToggleEmojiMode(false),
                size = LARGE,
            ),
        backgroundColor = SURFACE_VARIANT,
    )

val ABC_KEY_ITEM_ALT = specialActionKeyItem(center = ABC_KEY_ITEM.center)
val NUMERIC_KEY_ITEM_ALT = specialActionKeyItem(center = NUMERIC_KEY_ITEM.center)
val EMOJI_KEY_ITEM_ALT = textEditKeyItem(center = EMOJI_KEY_ITEM.center)

val BACKSPACE_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardBackspace),
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
        swipeType = TWO_WAY_HORIZONTAL,
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
        backgroundColor = SURFACE_VARIANT,
        longPress = DeleteWordBeforeCursor,
    )

val BACKSPACE_WIDE_KEY_ITEM = BACKSPACE_KEY_ITEM.copy(widthMultiplier = 3)

val SPACEBAR_KEY_ITEM =
    KeyItemC(
        center = KeyC(" "),
        swipeType = FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_LEFT,
                        ),
                    ),
                display = null,
            ),
        right =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_RIGHT,
                        ),
                    ),
                display = null,
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
    )
val SPACEBAR_SKINNY_KEY_ITEM = SPACEBAR_KEY_ITEM.copy(widthMultiplier = 1)
val SPACEBAR_DOUBLE_KEY_ITEM = SPACEBAR_KEY_ITEM.copy(widthMultiplier = 2)

val SPACEBAR_PROGRAMMING_KEY_ITEM =
    KeyItemC(
        center = KeyC(" "),
        swipeType = FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_LEFT,
                        ),
                    ),
                display = null,
            ),
        right =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_RIGHT,
                        ),
                    ),
                display = null,
            ),
        top =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_UP,
                        ),
                    ),
                display = null,
            ),
        bottom =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_DOWN,
                        ),
                    ),
                display = null,
            ),
        backgroundColor = SURFACE_VARIANT,
        widthMultiplier = 3,
    )

val RETURN_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                action = IMECompleteAction,
                size = LARGE,
                color = SECONDARY,
            ),
        backgroundColor = SURFACE_VARIANT,
        longPress = CommitText("\n"),
    )

val SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM =
    KeyItemC(
        center = KeyC(" "),
        swipeType = FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_LEFT,
                        ),
                    ),
                display = null,
            ),
        right =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_RIGHT,
                        ),
                    ),
                display = null,
            ),
        top = KeyC("'", color = MUTED),
        bottom = KeyC(",", color = MUTED),
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
    )
val SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM =
    SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM.copy(
        swipeType = EIGHT_WAY,
        left =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_LEFT,
                        ),
                    ),
                display = null,
            ),
        right =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_RIGHT,
                        ),
                    ),
                display = null,
            ),
        top = KeyC("-", color = MUTED),
        bottom = KeyC(".", color = MUTED),
        bottomLeft = KeyC("*", color = MUTED),
    )

val SPACEBAR_ALL_SYMBOLS =
    SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM.copy(
        left = KeyC(",", color = MUTED),
        right = KeyC("'", color = MUTED),
        top = KeyC("-", color = MUTED),
        bottom = KeyC(".", color = MUTED),
    )
val SPACEBAR_ALL_DIRECTIONS =
    SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM.copy(
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
    )

val BACKSPACE_TYPESPLIT_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardBackspace),
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
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                action = ToggleShiftMode(true),
                color = SECONDARY,
            ),
        widthMultiplier = 3,
        backgroundColor = SURFACE_VARIANT,
    )
val BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM =
    BACKSPACE_TYPESPLIT_KEY_ITEM.copy(
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
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                action = ToggleCapsLock,
                color = SECONDARY,
            ),
        bottom =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                action = ToggleShiftMode(false),
                color = SECONDARY,
            ),
    )

val SPACEBAR_FRENCH_KEY_ITEM =
    SPACEBAR_KEY_ITEM.copy(
        nextTapActions =
            listOf(
                ReplaceLastText(", ", trimCount = 1),
                ReplaceLastText(". "),
                ReplaceLastText(" ? "),
                ReplaceLastText(" ! ", trimCount = 3),
                ReplaceLastText(" : ", trimCount = 3),
                ReplaceLastText(" ; ", trimCount = 3),
            ),
    )

val SPACEBAR_FRENCH_SKINNY_KEY_ITEM = SPACEBAR_FRENCH_KEY_ITEM.copy(widthMultiplier = 1)

val SPACEBAR_FRENCH_TYPESPLIT_MIDDLE_KEY_ITEM =
    SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM.copy(
        nextTapActions =
            listOf(
                ReplaceLastText(", ", trimCount = 1),
                ReplaceLastText(". "),
                ReplaceLastText(" ? "),
                ReplaceLastText(" ! ", trimCount = 3),
                ReplaceLastText(" : ", trimCount = 3),
                ReplaceLastText(" ; ", trimCount = 3),
            ),
    )

val SPACEBAR_FRENCH_TYPESPLIT_BOTTOM_KEY_ITEM =
    SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM.copy(
        nextTapActions =
            listOf(
                ReplaceLastText(", ", trimCount = 1),
                ReplaceLastText(". "),
                ReplaceLastText(" ? "),
                ReplaceLastText(" ! ", trimCount = 3),
                ReplaceLastText(" : ", trimCount = 3),
                ReplaceLastText(" ; ", trimCount = 3),
            ),
    )

val SPACEBAR_FARSI_KEY_ITEM =
    SPACEBAR_KEY_ITEM.copy(
        nextTapActions =
            listOf(
                ReplaceLastText("، ", trimCount = 1),
                ReplaceLastText(". "),
                ReplaceLastText("؟ "),
                ReplaceLastText("! "),
                ReplaceLastText(": "),
                ReplaceLastText("؛ "),
            ),
    )

val SPACEBAR_FARSI_SKINNY_KEY_ITEM = SPACEBAR_FARSI_KEY_ITEM.copy(widthMultiplier = 1)

val SPACEBAR_ZERO_KEY_ITEM = SPACEBAR_KEY_ITEM.copy(longPress = CommitText("0"))
