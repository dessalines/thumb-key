package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardBackspace
import androidx.compose.material.icons.automirrored.outlined.KeyboardReturn
import androidx.compose.material.icons.automirrored.outlined.Redo
import androidx.compose.material.icons.automirrored.outlined.Undo
import androidx.compose.material.icons.outlined.Abc
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.ContentCopy
import androidx.compose.material.icons.outlined.ContentCut
import androidx.compose.material.icons.outlined.ContentPaste
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.Keyboard
import androidx.compose.material.icons.outlined.KeyboardCapslock
import androidx.compose.material.icons.outlined.Language
import androidx.compose.material.icons.outlined.LinearScale
import androidx.compose.material.icons.outlined.Mic
import androidx.compose.material.icons.outlined.Mood
import androidx.compose.material.icons.outlined.Numbers
import androidx.compose.material.icons.outlined.SelectAll
import androidx.compose.material.icons.outlined.Settings
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.SlideType
import com.dessalines.thumbkey.utils.SwipeNWay

fun textEditKeyItem(center: KeyC) =
    KeyItemC(
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        swipeType = SwipeNWay.EIGHT_WAY,
        center = center,
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCopy),
                action = KeyAction.Copy,
                color = ColorVariant.MUTED,
            ),
        topLeft =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.SelectAll),
                action = KeyAction.SelectAll,
                color = ColorVariant.MUTED,
            ),
        topRight =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCut),
                action = KeyAction.Cut,
                color = ColorVariant.MUTED,
            ),
        left =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.Undo),
                action = KeyAction.Undo,
                color = ColorVariant.MUTED,
            ),
        right =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.Redo),
                action = KeyAction.Redo,
                color = ColorVariant.MUTED,
            ),
        bottom =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ContentPaste),
                action = KeyAction.Paste,
                color = ColorVariant.MUTED,
            ),
    )

fun specialActionKeyItem(center: KeyC) =
    KeyItemC(
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        swipeType = SwipeNWay.EIGHT_WAY,
        center = center,
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                action = KeyAction.GotoSettings,
                color = ColorVariant.MUTED,
            ),
        bottom =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Keyboard),
                action = KeyAction.SwitchIME,
                color = ColorVariant.MUTED,
            ),
        bottomLeft =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Mic),
                action = KeyAction.SwitchIMEVoice,
                color = ColorVariant.MUTED,
            ),
        left =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Language),
                action = KeyAction.SwitchLanguage,
                color = ColorVariant.MUTED,
            ),
        right =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.LinearScale),
                action = KeyAction.SwitchPosition,
                color = ColorVariant.MUTED,
            ),
    )

val ABC_KEY_ITEM =
    textEditKeyItem(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Abc),
                action = KeyAction.ToggleNumericMode(false),
                size = FontSizeVariant.LARGE,
            ),
    )

val NUMERIC_KEY_ITEM =
    textEditKeyItem(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Numbers),
                action = KeyAction.ToggleNumericMode(true),
                size = FontSizeVariant.LARGE,
                color = ColorVariant.SECONDARY,
            ),
    )

val EMOJI_KEY_ITEM =
    specialActionKeyItem(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Mood),
                action = KeyAction.ToggleEmojiMode(true),
                size = FontSizeVariant.LARGE,
                color = ColorVariant.SECONDARY,
            ),
    )

val EMOJI_BACK_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Abc),
                action = KeyAction.ToggleEmojiMode(false),
                size = FontSizeVariant.LARGE,
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
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
        swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
        slideType = SlideType.DELETE,
        left =
            KeyC(
                action = KeyAction.DeleteWordBeforeCursor,
                display = null,
            ),
        right =
            KeyC(
                action = KeyAction.DeleteWordAfterCursor,
                display = null,
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        longPress = KeyAction.DeleteWordBeforeCursor,
    )

val BACKSPACE_WIDE_KEY_ITEM = BACKSPACE_KEY_ITEM.copy(widthMultiplier = 3)

val SPACEBAR_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                action = KeyAction.CommitText(" "),
            ),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left =
            KeyC(
                action =
                    KeyAction.SendEvent(
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
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_RIGHT,
                        ),
                    ),
                display = null,
            ),
        nextTapActions =
            listOf(
                KeyAction.ReplaceLastText(", ", trimCount = 1),
                KeyAction.ReplaceLastText(". "),
                KeyAction.ReplaceLastText("? "),
                KeyAction.ReplaceLastText("! "),
                KeyAction.ReplaceLastText(": "),
                KeyAction.ReplaceLastText("; "),
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        widthMultiplier = 3,
    )
val SPACEBAR_SKINNY_KEY_ITEM = SPACEBAR_KEY_ITEM.copy(widthMultiplier = 1)
val SPACEBAR_DOUBLE_KEY_ITEM = SPACEBAR_KEY_ITEM.copy(widthMultiplier = 2)

val SPACEBAR_PROGRAMMING_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                action = KeyAction.CommitText(" "),
            ),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left =
            KeyC(
                action =
                    KeyAction.SendEvent(
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
                    KeyAction.SendEvent(
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
                    KeyAction.SendEvent(
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
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_DOWN,
                        ),
                    ),
                display = null,
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        widthMultiplier = 3,
    )

val RETURN_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                action = KeyAction.IMECompleteAction,
                size = FontSizeVariant.LARGE,
                color = ColorVariant.SECONDARY,
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        longPress = KeyAction.CommitText("\n"),
    )

val SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                action = KeyAction.CommitText(" "),
            ),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left =
            KeyC(
                action =
                    KeyAction.SendEvent(
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
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_RIGHT,
                        ),
                    ),
                display = null,
            ),
        top =
            KeyC(
                action = KeyAction.CommitText("'"),
                color = ColorVariant.MUTED,
            ),
        bottom =
            KeyC(
                action = KeyAction.CommitText(","),
                color = ColorVariant.MUTED,
            ),
        nextTapActions =
            listOf(
                KeyAction.ReplaceLastText(", ", trimCount = 1),
                KeyAction.ReplaceLastText(". "),
                KeyAction.ReplaceLastText("? "),
                KeyAction.ReplaceLastText("! "),
                KeyAction.ReplaceLastText(": "),
                KeyAction.ReplaceLastText("; "),
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )
val SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM =
    SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM.copy(
        swipeType = SwipeNWay.EIGHT_WAY,
        left =
            KeyC(
                action =
                    KeyAction.SendEvent(
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
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_RIGHT,
                        ),
                    ),
                display = null,
            ),
        top =
            KeyC(
                action = KeyAction.CommitText("-"),
                color = ColorVariant.MUTED,
            ),
        bottom =
            KeyC(
                action = KeyAction.CommitText("."),
                color = ColorVariant.MUTED,
            ),
        bottomLeft =
            KeyC(
                action = KeyAction.CommitText("*"),
                color = ColorVariant.MUTED,
            ),
    )

val SPACEBAR_ALL_SYMBOLS =
    SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM.copy(
        left =
            KeyC(
                action = KeyAction.CommitText(","),
                color = ColorVariant.MUTED,
            ),
        right =
            KeyC(
                action = KeyAction.CommitText("'"),
                color = ColorVariant.MUTED,
            ),
        top =
            KeyC(
                action = KeyAction.CommitText("-"),
                color = ColorVariant.MUTED,
            ),
        bottom =
            KeyC(
                action = KeyAction.CommitText("."),
                color = ColorVariant.MUTED,
            ),
    )
val SPACEBAR_ALL_DIRECTIONS =
    SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM.copy(
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
    )

val BACKSPACE_TYPESPLIT_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardBackspace),
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
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.DELETE,
        left =
            KeyC(
                action = KeyAction.DeleteWordBeforeCursor,
                display = null,
            ),
        right =
            KeyC(
                action = KeyAction.DeleteWordAfterCursor,
                display = null,
            ),
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                action = KeyAction.ToggleShiftMode(true),
                color = ColorVariant.SECONDARY,
            ),
        widthMultiplier = 3,
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )
val BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM =
    BACKSPACE_TYPESPLIT_KEY_ITEM.copy(
        left =
            KeyC(
                action = KeyAction.DeleteWordBeforeCursor,
                display = null,
            ),
        right =
            KeyC(
                action = KeyAction.DeleteWordAfterCursor,
                display = null,
            ),
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                action = KeyAction.ToggleCapsLock,
                color = ColorVariant.SECONDARY,
            ),
        bottom =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                action = KeyAction.ToggleShiftMode(false),
                color = ColorVariant.SECONDARY,
            ),
    )

val SPACEBAR_FRENCH_KEY_ITEM =
    SPACEBAR_KEY_ITEM.copy(
        nextTapActions =
            listOf(
                KeyAction.ReplaceLastText(", ", trimCount = 1),
                KeyAction.ReplaceLastText(". "),
                KeyAction.ReplaceLastText(" ? "),
                KeyAction.ReplaceLastText(" ! ", trimCount = 3),
                KeyAction.ReplaceLastText(" : ", trimCount = 3),
                KeyAction.ReplaceLastText(" ; ", trimCount = 3),
            ),
    )

val SPACEBAR_FRENCH_SKINNY_KEY_ITEM = SPACEBAR_FRENCH_KEY_ITEM.copy(widthMultiplier = 1)

val SPACEBAR_FRENCH_TYPESPLIT_MIDDLE_KEY_ITEM =
    SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM.copy(
        nextTapActions =
            listOf(
                KeyAction.ReplaceLastText(", ", trimCount = 1),
                KeyAction.ReplaceLastText(". "),
                KeyAction.ReplaceLastText(" ? "),
                KeyAction.ReplaceLastText(" ! ", trimCount = 3),
                KeyAction.ReplaceLastText(" : ", trimCount = 3),
                KeyAction.ReplaceLastText(" ; ", trimCount = 3),
            ),
    )

val SPACEBAR_FRENCH_TYPESPLIT_BOTTOM_KEY_ITEM =
    SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM.copy(
        nextTapActions =
            listOf(
                KeyAction.ReplaceLastText(", ", trimCount = 1),
                KeyAction.ReplaceLastText(". "),
                KeyAction.ReplaceLastText(" ? "),
                KeyAction.ReplaceLastText(" ! ", trimCount = 3),
                KeyAction.ReplaceLastText(" : ", trimCount = 3),
                KeyAction.ReplaceLastText(" ; ", trimCount = 3),
            ),
    )

val SPACEBAR_FARSI_KEY_ITEM =
    SPACEBAR_KEY_ITEM.copy(
        nextTapActions =
            listOf(
                KeyAction.ReplaceLastText("، ", trimCount = 1),
                KeyAction.ReplaceLastText(". "),
                KeyAction.ReplaceLastText("؟ "),
                KeyAction.ReplaceLastText("! "),
                KeyAction.ReplaceLastText(": "),
                KeyAction.ReplaceLastText("؛ "),
            ),
    )

val SPACEBAR_FARSI_SKINNY_KEY_ITEM = SPACEBAR_FARSI_KEY_ITEM.copy(widthMultiplier = 1)

val SPACEBAR_ZERO_KEY_ITEM = SPACEBAR_KEY_ITEM.copy(longPress = KeyAction.CommitText("0"))
