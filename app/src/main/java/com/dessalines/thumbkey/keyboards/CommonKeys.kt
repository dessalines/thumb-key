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
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.SwipeNWay

val TEXT_EDIT_SWIPES =
    mapOf(
        SwipeDirection.TOP to
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCopy),
                action = KeyAction.Copy,
                color = ColorVariant.MUTED,
            ),
        SwipeDirection.TOP_LEFT to
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.SelectAll),
                action = KeyAction.SelectAll,
                color = ColorVariant.MUTED,
            ),
        SwipeDirection.TOP_RIGHT to
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCut),
                action = KeyAction.Cut,
                color = ColorVariant.MUTED,
            ),
        SwipeDirection.LEFT to
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.Undo),
                action = KeyAction.Undo,
                color = ColorVariant.MUTED,
            ),
        SwipeDirection.RIGHT to
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.Redo),
                action = KeyAction.Redo,
                color = ColorVariant.MUTED,
            ),
        SwipeDirection.BOTTOM to
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ContentPaste),
                action = KeyAction.Paste,
                color = ColorVariant.MUTED,
            ),
    )

val SPECIAL_ACTIONS_SWIPES =
    mapOf(
        SwipeDirection.TOP to
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                action = KeyAction.GotoSettings,
                color = ColorVariant.MUTED,
            ),
        SwipeDirection.BOTTOM to
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Keyboard),
                action = KeyAction.SwitchIME,
                color = ColorVariant.MUTED,
            ),
        SwipeDirection.BOTTOM_LEFT to
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Mic),
                action = KeyAction.SwitchIMEVoice,
                color = ColorVariant.MUTED,
            ),
        SwipeDirection.LEFT to
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Language),
                action = KeyAction.SwitchLanguage,
                color = ColorVariant.MUTED,
            ),
        SwipeDirection.RIGHT to
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.LinearScale),
                action = KeyAction.SwitchPosition,
                color = ColorVariant.MUTED,
            ),
    )

val ABC_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Abc),
                action = KeyAction.ToggleNumericMode(false),
                size = FontSizeVariant.LARGE,
                color = ColorVariant.PRIMARY,
            ),
        swipeType = SwipeNWay.EIGHT_WAY,
        swipes = TEXT_EDIT_SWIPES,
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val NUMERIC_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Numbers),
                action = KeyAction.ToggleNumericMode(true),
                size = FontSizeVariant.LARGE,
                color = ColorVariant.SECONDARY,
            ),
        swipeType = SwipeNWay.EIGHT_WAY,
        swipes = TEXT_EDIT_SWIPES,
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val EMOJI_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Mood),
                action = KeyAction.ToggleEmojiMode(true),
                size = FontSizeVariant.LARGE,
                color = ColorVariant.SECONDARY,
            ),
        swipeType = SwipeNWay.EIGHT_WAY,
        swipes = SPECIAL_ACTIONS_SWIPES,
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val EMOJI_BACK_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Abc),
                action = KeyAction.ToggleEmojiMode(false),
                size = FontSizeVariant.LARGE,
                color = ColorVariant.PRIMARY,
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val ABC_KEY_ITEM_ALT = ABC_KEY_ITEM.copy(swipes = SPECIAL_ACTIONS_SWIPES)
val NUMERIC_KEY_ITEM_ALT = NUMERIC_KEY_ITEM.copy(swipes = SPECIAL_ACTIONS_SWIPES)
val EMOJI_KEY_ITEM_ALT = EMOJI_KEY_ITEM.copy(swipes = TEXT_EDIT_SWIPES)

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
        swipes =
            mapOf(
                SwipeDirection.LEFT to
                    KeyC(
                        action = KeyAction.DeleteWordBeforeCursor,
                        display = null,
                    ),
                SwipeDirection.RIGHT to
                    KeyC(
                        action = KeyAction.DeleteWordAfterCursor,
                        display = null,
                    ),
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        longPress = KeyAction.DeleteWordBeforeCursor,
    )

val SPACEBAR_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.TextDisplay(" "),
                action = KeyAction.CommitText(" "),
            ),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        swipes =
            mapOf(
                SwipeDirection.LEFT to
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
                SwipeDirection.RIGHT to
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
                display = KeyDisplay.TextDisplay(" "),
                action = KeyAction.CommitText(" "),
            ),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        swipes =
            mapOf(
                SwipeDirection.LEFT to
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
                SwipeDirection.RIGHT to
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
                SwipeDirection.TOP to
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
                SwipeDirection.BOTTOM to
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
                display = KeyDisplay.TextDisplay(" "),
                action = KeyAction.CommitText(" "),
            ),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        swipes =
            mapOf(
                SwipeDirection.LEFT to
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
                SwipeDirection.RIGHT to
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
                SwipeDirection.TOP to
                    KeyC(
                        display = KeyDisplay.TextDisplay("'"),
                        action = KeyAction.CommitText("'"),
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.BOTTOM to
                    KeyC(
                        display = KeyDisplay.TextDisplay(","),
                        action = KeyAction.CommitText(","),
                        color = ColorVariant.MUTED,
                    ),
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
        swipes =
            mapOf(
                SwipeDirection.LEFT to
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
                SwipeDirection.RIGHT to
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
                SwipeDirection.TOP to
                    KeyC(
                        display = KeyDisplay.TextDisplay("-"),
                        action = KeyAction.CommitText("-"),
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.BOTTOM to
                    KeyC(
                        display = KeyDisplay.TextDisplay("."),
                        action = KeyAction.CommitText("."),
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.BOTTOM_LEFT to
                    KeyC(
                        display = KeyDisplay.TextDisplay("*"),
                        action = KeyAction.CommitText("*"),
                        color = ColorVariant.MUTED,
                    ),
            ),
    )

val SPACEBAR_ALL_SYMBOLS =
    SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM.copy(
        swipes =
            mapOf(
                SwipeDirection.LEFT to
                    KeyC(
                        display = KeyDisplay.TextDisplay(","),
                        action = KeyAction.CommitText(","),
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.RIGHT to
                    KeyC(
                        display = KeyDisplay.TextDisplay("'"),
                        action = KeyAction.CommitText("'"),
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.TOP to
                    KeyC(
                        display = KeyDisplay.TextDisplay("-"),
                        action = KeyAction.CommitText("-"),
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.BOTTOM to
                    KeyC(
                        display = KeyDisplay.TextDisplay("."),
                        action = KeyAction.CommitText("."),
                        color = ColorVariant.MUTED,
                    ),
            ),
    )
val SPACEBAR_ALL_DIRECTIONS =
    SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM.copy(
        swipes =
            mapOf(
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
        swipes =
            mapOf(
                SwipeDirection.LEFT to
                    KeyC(
                        action = KeyAction.DeleteWordBeforeCursor,
                        display = null,
                    ),
                SwipeDirection.RIGHT to
                    KeyC(
                        action = KeyAction.DeleteWordAfterCursor,
                        display = null,
                    ),
                SwipeDirection.TOP to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                        action = KeyAction.ToggleShiftMode(true),
                        color = ColorVariant.SECONDARY,
                    ),
            ),
        widthMultiplier = 3,
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )
val BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM =
    BACKSPACE_TYPESPLIT_KEY_ITEM.copy(
        swipes =
            mapOf(
                SwipeDirection.LEFT to
                    KeyC(
                        action = KeyAction.DeleteWordBeforeCursor,
                        display = null,
                    ),
                SwipeDirection.RIGHT to
                    KeyC(
                        action = KeyAction.DeleteWordAfterCursor,
                        display = null,
                    ),
                SwipeDirection.TOP to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                        capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                        action = KeyAction.ToggleCapsLock,
                        color = ColorVariant.SECONDARY,
                    ),
                SwipeDirection.BOTTOM to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                        action = KeyAction.ToggleShiftMode(false),
                        color = ColorVariant.SECONDARY,
                    ),
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
