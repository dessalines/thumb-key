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

val COPY_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCopy),
        action = Copy,
        color = MUTED,
    )
val SELECT_ALL_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.SelectAll),
        action = SelectAll,
        color = MUTED,
    )
val CUT_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCut),
        action = Cut,
        color = MUTED,
    )
val UNDO_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.Undo),
        action = Undo,
        color = MUTED,
    )
val REDO_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.Redo),
        action = Redo,
        color = MUTED,
    )
val PASTE_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.ContentPaste),
        action = Paste,
        color = MUTED,
    )
val GOTO_SETTINGS_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
        action = GotoSettings,
        color = MUTED,
    )
val SWITCH_IME_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.Keyboard),
        action = SwitchIME,
        color = MUTED,
    )
val SWITCH_IME_VOICE_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.Mic),
        action = SwitchIMEVoice,
        color = MUTED,
    )
val SWITCH_LANGUAGE_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.Language),
        action = SwitchLanguage,
        color = MUTED,
    )
val MOVE_KEYBOARD_CYCLE_RIGHT_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.LinearScale),
        action = MoveKeyboard.CycleRight,
        color = MUTED,
    )
val HIDE_KEYBOARD_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardDoubleArrowDown),
        action = HideKeyboard,
        color = MUTED,
    )

fun textEditKeyItem(center: KeyC): KeyItemC =
    KeyItemC(
        backgroundColor = SURFACE_VARIANT,
        swipeType = EIGHT_WAY,
        center = center,
        top = COPY_KEYC,
        topLeft = SELECT_ALL_KEYC,
        topRight = CUT_KEYC,
        bottomLeft = UNDO_KEYC,
        bottomRight = REDO_KEYC,
        bottom = PASTE_KEYC,
    )

fun specialActionKeyItem(center: KeyC): KeyItemC =
    KeyItemC(
        backgroundColor = SURFACE_VARIANT,
        swipeType = EIGHT_WAY,
        center = center,
        top = GOTO_SETTINGS_KEYC,
        topLeft = TOGGLE_HIDE_LETTERS_KEYC,
        bottom = SWITCH_IME_KEYC,
        bottomLeft = SWITCH_IME_VOICE_KEYC,
        left = SWITCH_LANGUAGE_KEYC,
        right = MOVE_KEYBOARD_CYCLE_RIGHT_KEYC,
    )

val TOGGLE_NUMERIC_MODE_FALSE_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.Abc),
        action = ToggleNumericMode(false),
        size = LARGE,
    )
val ABC_KEY_ITEM =
    textEditKeyItem(
        center = TOGGLE_NUMERIC_MODE_FALSE_KEYC,
    )

val TOGGLE_NUMERIC_MODE_TRUE_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.Numbers),
        action = ToggleNumericMode(true),
        size = LARGE,
        color = SECONDARY,
    )
val NUMERIC_KEY_ITEM =
    textEditKeyItem(
        center = TOGGLE_NUMERIC_MODE_TRUE_KEYC,
    )

val TOGGLE_EMOJI_MODE_TRUE_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.Mood),
        action = ToggleEmojiMode(true),
        size = LARGE,
        color = SECONDARY,
    )

val TOGGLE_HIDE_LETTERS_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.HideImage),
        action = ToggleHideLetters,
        color = MUTED,
    )

val EMOJI_KEY_ITEM =
    specialActionKeyItem(
        center = TOGGLE_EMOJI_MODE_TRUE_KEYC,
    )

val TOGGLE_EMOJI_MODE_FALSE_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.Abc),
        action = ToggleEmojiMode(false),
        size = LARGE,
    )
val EMOJI_BACK_KEY_ITEM =
    KeyItemC(
        center = TOGGLE_EMOJI_MODE_FALSE_KEYC,
        backgroundColor = SURFACE_VARIANT,
    )

val ABC_KEY_ITEM_ALT = specialActionKeyItem(center = ABC_KEY_ITEM.center)
val NUMERIC_KEY_ITEM_ALT = specialActionKeyItem(center = NUMERIC_KEY_ITEM.center)
val EMOJI_KEY_ITEM_ALT = textEditKeyItem(center = EMOJI_KEY_ITEM.center)

val TOGGLE_CAPS_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
        capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
        action = ToggleCapsLock,
        swipeReturnAction = ToggleCurrentWordCapitalization(true),
        color = MUTED,
    )

val TOGGLE_SHIFT_TRUE_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
        action = ToggleShiftMode(true),
        swipeReturnAction = ToggleCurrentWordCapitalization(true),
        color = MUTED,
    )

val TOGGLE_SHIFT_FALSE_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
        action = ToggleShiftMode(false),
        swipeReturnAction = ToggleCurrentWordCapitalization(false),
        color = MUTED,
    )

val TOGGLE_CTRL_TRUE_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardControlKey),
        action = ToggleCtrlMode(true),
        color = MUTED,
    )

val TOGGLE_CTRL_FALSE_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardDoubleArrowDown),
        action = ToggleCtrlMode(false),
        color = MUTED,
    )

val TOGGLE_ALT_TRUE_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardOptionKey),
        action = ToggleAltMode(true),
        color = MUTED,
    )

val TOGGLE_ALT_FALSE_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardDoubleArrowDown),
        action = ToggleAltMode(false),
        color = MUTED,
    )

val BACKSPACE_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardBackspace),
        action = DeleteKeyAction,
        size = LARGE,
        color = SECONDARY,
    )
val DELETE_WORD_BEFORE_CURSOR_KEYC =
    KeyC(
        DeleteWordBeforeCursor,
        display = null,
    )
val DELETE_WORD_AFTER_CURSOR_KEYC =
    KeyC(
        DeleteWordAfterCursor,
        display = null,
    )

val PREVIOUS_WORD_BEFORE_CURSOR_KEYC =
    KeyC(
        PreviousWordBeforeCursor,
        display = null,
    )
val NEXT_WORD_AFTER_CURSOR_KEYC =
    KeyC(
        NextWordAfterCursor,
        display = null,
    )

val BACKSPACE_KEY_ITEM =
    KeyItemC(
        center = BACKSPACE_KEYC,
        swipeType = TWO_WAY_HORIZONTAL,
        slideType = SlideType.DELETE,
        left = DELETE_WORD_BEFORE_CURSOR_KEYC,
        right = DELETE_WORD_AFTER_CURSOR_KEYC,
        backgroundColor = SURFACE_VARIANT,
        longPress = DeleteWordBeforeCursor,
    )

val BACKSPACE_WIDE_KEY_ITEM = BACKSPACE_KEY_ITEM.copy(widthMultiplier = 3)

val SPACEBAR_LEFT_KEYC =
    KeyC(
        action =
            SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent.KEYCODE_DPAD_LEFT,
                ),
            ),
        display = null,
    )
val SPACEBAR_RIGHT_KEYC =
    KeyC(
        action =
            SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent.KEYCODE_DPAD_RIGHT,
                ),
            ),
        display = null,
    )
val SPACEBAR_NEXT_TAP_ACTIONS =
    listOf(
        ReplaceLastText(", ", trimCount = 1),
        ReplaceLastText(". "),
        ReplaceLastText("? "),
        ReplaceLastText("! "),
        ReplaceLastText(": "),
        ReplaceLastText("; "),
    )
val SPACEBAR_CENTER_KEYC = KeyC(" ")
val SPACEBAR_KEY_ITEM =
    KeyItemC(
        center = SPACEBAR_CENTER_KEYC,
        swipeType = SwipeNWay.EIGHT_WAY,
        slideType = SlideType.MOVE_CURSOR,
        left = SPACEBAR_LEFT_KEYC,
        right = SPACEBAR_RIGHT_KEYC,
        bottomLeft = PREVIOUS_WORD_BEFORE_CURSOR_KEYC,
        bottomRight = NEXT_WORD_AFTER_CURSOR_KEYC,
        nextTapActions = SPACEBAR_NEXT_TAP_ACTIONS,
        backgroundColor = SURFACE_VARIANT,
        widthMultiplier = 3,
    )
val SPACEBAR_SKINNY_KEY_ITEM = SPACEBAR_KEY_ITEM.copy(widthMultiplier = 1)
val SPACEBAR_DOUBLE_KEY_ITEM = SPACEBAR_KEY_ITEM.copy(widthMultiplier = 2)

val SPACEBAR_TOP_KEYC =
    KeyC(
        action =
            SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent.KEYCODE_DPAD_UP,
                ),
            ),
        display = null,
    )
val SPACEBAR_BOTTOM_KEYC =
    KeyC(
        action =
            SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent.KEYCODE_DPAD_DOWN,
                ),
            ),
        display = null,
    )
val SPACEBAR_PROGRAMMING_KEY_ITEM =
    KeyItemC(
        center = SPACEBAR_CENTER_KEYC,
        swipeType = FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left = SPACEBAR_LEFT_KEYC,
        right = SPACEBAR_RIGHT_KEYC,
        top = SPACEBAR_TOP_KEYC,
        bottom = SPACEBAR_BOTTOM_KEYC,
        backgroundColor = SURFACE_VARIANT,
        widthMultiplier = 3,
    )

val RETURN_KEYC =
    KeyC(
        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
        action = IMECompleteAction,
        size = LARGE,
        color = SECONDARY,
    )
val RETURN_KEY_ITEM =
    KeyItemC(
        center = RETURN_KEYC,
        backgroundColor = SURFACE_VARIANT,
        longPress = CommitText("\n"),
    )

val RETURN_TOP_KEYC =
    KeyC(
        action =
            SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent.KEYCODE_ESCAPE,
                ),
            ),
        display = null,
    )
val RETURN_LEFT_KEYC =
    KeyC(
        action =
            SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent.KEYCODE_MOVE_HOME,
                ),
            ),
        display = null,
    )
val RETURN_RIGHT_KEYC =
    KeyC(
        action =
            SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent.KEYCODE_MOVE_END,
                ),
            ),
        display = null,
    )

val NOOP_KEYC =
    KeyC(
        action = Noop,
        display = null,
    )

val RETURN_PROGRAMMING_KEY_ITEM =
    KeyItemC(
        center = RETURN_KEYC,
        swipeType = FOUR_WAY_CROSS,
        top = RETURN_TOP_KEYC,
        left = RETURN_LEFT_KEYC,
        right = RETURN_RIGHT_KEYC,
        backgroundColor = SURFACE_VARIANT,
        longPress = CommitText("\n"),
    )

val SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM =
    KeyItemC(
        center = SPACEBAR_CENTER_KEYC,
        swipeType = FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left = SPACEBAR_LEFT_KEYC,
        right = SPACEBAR_RIGHT_KEYC,
        top = KeyC("'", color = MUTED),
        bottom = KeyC(",", color = MUTED),
        nextTapActions = SPACEBAR_NEXT_TAP_ACTIONS,
        backgroundColor = SURFACE_VARIANT,
    )
val SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM =
    SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM.copy(
        swipeType = EIGHT_WAY,
        left = SPACEBAR_LEFT_KEYC,
        right = SPACEBAR_RIGHT_KEYC,
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
        left = SPACEBAR_LEFT_KEYC.copy(display = KeyDisplay.TextDisplay("←"), color = MUTED),
        right = SPACEBAR_RIGHT_KEYC.copy(display = KeyDisplay.TextDisplay("→"), color = MUTED),
        top = SPACEBAR_TOP_KEYC.copy(display = KeyDisplay.TextDisplay("↑"), color = MUTED),
        bottom = SPACEBAR_BOTTOM_KEYC.copy(display = KeyDisplay.TextDisplay("↓"), color = MUTED),
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
                            KeyEvent.KEYCODE_DEL,
                        ),
                    ),
                size = LARGE,
                color = SECONDARY,
            ),
        swipeType = FOUR_WAY_CROSS,
        slideType = SlideType.DELETE,
        left = DELETE_WORD_BEFORE_CURSOR_KEYC,
        right = DELETE_WORD_AFTER_CURSOR_KEYC,
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
        left = DELETE_WORD_BEFORE_CURSOR_KEYC,
        right = DELETE_WORD_AFTER_CURSOR_KEYC,
        top = TOGGLE_CAPS_KEYC.copy(color = SECONDARY),
        bottom = TOGGLE_SHIFT_FALSE_KEYC.copy(color = SECONDARY),
    )

val SPACEBAR_FRENCH_NEXT_TAP_ACTIONS =
    listOf(
        ReplaceLastText(", ", trimCount = 1),
        ReplaceLastText(". "),
        ReplaceLastText(" ? "),
        ReplaceLastText(" ! ", trimCount = 3),
        ReplaceLastText(" : ", trimCount = 3),
        ReplaceLastText(" ; ", trimCount = 3),
    )
val SPACEBAR_FRENCH_KEY_ITEM =
    SPACEBAR_KEY_ITEM.copy(
        nextTapActions = SPACEBAR_FRENCH_NEXT_TAP_ACTIONS,
    )

val SPACEBAR_FRENCH_SKINNY_KEY_ITEM = SPACEBAR_FRENCH_KEY_ITEM.copy(widthMultiplier = 1)

val SPACEBAR_FRENCH_TYPESPLIT_MIDDLE_KEY_ITEM =
    SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM.copy(
        nextTapActions = SPACEBAR_FRENCH_NEXT_TAP_ACTIONS,
    )

val SPACEBAR_FRENCH_TYPESPLIT_BOTTOM_KEY_ITEM =
    SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM.copy(
        nextTapActions = SPACEBAR_FRENCH_NEXT_TAP_ACTIONS,
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
