package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.ContentPaste
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.Keyboard
import androidx.compose.material.icons.outlined.KeyboardBackspace
import androidx.compose.material.icons.outlined.KeyboardCapslock
import androidx.compose.material.icons.outlined.KeyboardReturn
import androidx.compose.material.icons.outlined.Language
import androidx.compose.material.icons.outlined.LinearScale
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

val SETTINGS_KEY_ITEM =
    KeyItemC(
        center = KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
            action = KeyAction.GotoSettings,
            size = FontSizeVariant.LARGE,
            color = ColorVariant.SECONDARY,
        ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val NUMERIC_KEY_ITEM =
    KeyItemC(
        center = KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.Numbers),
            action = KeyAction.ToggleNumericMode(true),
            size = FontSizeVariant.LARGE,
            color = ColorVariant.SECONDARY,
        ),
        swipes = mapOf(
            SwipeDirection.TOP to KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.SelectAll),
                action = KeyAction.SelectAndCopyAll,
                color = ColorVariant.MUTED,
            ),
            SwipeDirection.TOP_LEFT to KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Keyboard),
                action = KeyAction.SwitchIME,
                color = ColorVariant.MUTED,
            ),
            SwipeDirection.BOTTOM to KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ContentPaste),
                action = KeyAction.Paste,
                color = ColorVariant.MUTED,
            ),
            SwipeDirection.LEFT to KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Language),
                action = KeyAction.SwitchLanguage,
                color = ColorVariant.MUTED,
            ),
            SwipeDirection.RIGHT to KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.LinearScale),
                action = KeyAction.SwitchPosition,
                color = ColorVariant.MUTED,
            ),
        ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val BACKSPACE_KEY_ITEM =
    KeyItemC(
        center = KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardBackspace),
            action = KeyAction.SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent
                        .KEYCODE_DEL,
                ),
            ),
            size = FontSizeVariant.LARGE,
            color = ColorVariant.SECONDARY,
        ),
        swipes = mapOf(
            SwipeDirection.LEFT to KeyC(
                action = KeyAction.DeleteLastWord,
                display = null,
            ),
            SwipeDirection.RIGHT to KeyC(
                action = KeyAction.SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent
                            .KEYCODE_FORWARD_DEL,
                    ),
                ),
                display = null,
                color = ColorVariant.MUTED,
                size = FontSizeVariant.SMALLEST,
            ),
        ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val SPACEBAR_KEY_ITEM =
    KeyItemC(
        center = KeyC(
            display = KeyDisplay.TextDisplay(" "),
            action = KeyAction.CommitText(" "),
        ),
        slideType = SlideType.MOVE_CURSOR,
        swipes = mapOf(
            SwipeDirection.LEFT to KeyC(
                action = KeyAction.SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_DPAD_LEFT,
                    ),
                ),
                display = null,
            ),
            SwipeDirection.RIGHT to KeyC(
                action = KeyAction.SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_DPAD_RIGHT,
                    ),
                ),
                display = null,
            ),
        ),
        nextTapActions = listOf(
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

val SPACEBAR_PROGRAMMER_KEY_ITEM =
    KeyItemC(
        center = KeyC(
            display = KeyDisplay.TextDisplay(" "),
            action = KeyAction.CommitText(" "),
        ),
        slideType = SlideType.MOVE_CURSOR,
        swipes = mapOf(
            SwipeDirection.LEFT to KeyC(
                action = KeyAction.SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_DPAD_LEFT,
                    ),
                ),
                display = null,
            ),
            SwipeDirection.RIGHT to KeyC(
                action = KeyAction.SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_DPAD_RIGHT,
                    ),
                ),
                display = null,
            ),
            SwipeDirection.TOP to KeyC(
                action = KeyAction.SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_DPAD_UP,
                    ),
                ),
                display = null,
            ),
            SwipeDirection.BOTTOM to KeyC(
                action = KeyAction.SendEvent(
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
        center = KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardReturn),
            action = KeyAction.IMECompleteAction,
            size = FontSizeVariant.LARGE,
            color = ColorVariant.SECONDARY,
        ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val SPACEBAR_TYPESPLIT_TOP_KEY_ITEM =
    KeyItemC(
        center = KeyC(
            display = KeyDisplay.TextDisplay(" "),
            action = KeyAction.CommitText(" "),
        ),
        swipes = mapOf(
            SwipeDirection.LEFT to KeyC(
                action = KeyAction.SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_DPAD_LEFT,
                    ),
                ),
                display = null,
            ),
            SwipeDirection.RIGHT to KeyC(
                action = KeyAction.SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_DPAD_RIGHT,
                    ),
                ),
                display = null,
            ),
            SwipeDirection.BOTTOM to KeyC(
                display = KeyDisplay.TextDisplay("*"),
                action = KeyAction.CommitText("*"),
                color = ColorVariant.MUTED,
            ),
            SwipeDirection.TOP to KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                action = KeyAction.GotoSettings,
                color = ColorVariant.SECONDARY,
            ),
        ),
        nextTapActions = listOf(
            KeyAction.ReplaceLastText(", ", trimCount = 1),
            KeyAction.ReplaceLastText(". "),
            KeyAction.ReplaceLastText("? "),
            KeyAction.ReplaceLastText("! "),
            KeyAction.ReplaceLastText(": "),
            KeyAction.ReplaceLastText("; "),
        ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )
val SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM = SPACEBAR_TYPESPLIT_TOP_KEY_ITEM.copy(
    swipes = mapOf(
        SwipeDirection.LEFT to KeyC(
            action = KeyAction.SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent.KEYCODE_DPAD_LEFT,
                ),
            ),
            display = null,
        ),
        SwipeDirection.RIGHT to KeyC(
            action = KeyAction.SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent.KEYCODE_DPAD_RIGHT,
                ),
            ),
            display = null,
        ),
        SwipeDirection.BOTTOM to KeyC(
            display = KeyDisplay.TextDisplay(","),
            action = KeyAction.CommitText(","),
            color = ColorVariant.MUTED,
        ),
        SwipeDirection.TOP to KeyC(
            display = KeyDisplay.TextDisplay("'"),
            action = KeyAction.CommitText("'"),
            color = ColorVariant.MUTED,
        ),
    ),
)
val SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM = SPACEBAR_TYPESPLIT_TOP_KEY_ITEM.copy(
    swipes = mapOf(
        SwipeDirection.LEFT to KeyC(
            action = KeyAction.SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent.KEYCODE_DPAD_LEFT,
                ),
            ),
            display = null,
        ),
        SwipeDirection.RIGHT to KeyC(
            action = KeyAction.SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent.KEYCODE_DPAD_RIGHT,
                ),
            ),
            display = null,
        ),
        SwipeDirection.BOTTOM to KeyC(
            display = KeyDisplay.TextDisplay("."),
            action = KeyAction.CommitText("."),
            color = ColorVariant.MUTED,
        ),
        SwipeDirection.TOP to KeyC(
            display = KeyDisplay.TextDisplay("-"),
            action = KeyAction.CommitText("-"),
            color = ColorVariant.MUTED,
        ),
    ),
)

val BACKSPACE_TYPESPLIT_KEY_ITEM =
    KeyItemC(
        center = KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardBackspace),
            action = KeyAction.SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent
                        .KEYCODE_DEL,
                ),
            ),
            size = FontSizeVariant.LARGE,
            color = ColorVariant.SECONDARY,
        ),
        swipes = mapOf(
            SwipeDirection.LEFT to KeyC(
                action = KeyAction.DeleteLastWord,
                display = null,
            ),
            SwipeDirection.RIGHT to KeyC(
                action = KeyAction.SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent
                            .KEYCODE_FORWARD_DEL,
                    ),
                ),
                display = null,
                color = ColorVariant.MUTED,
                size = FontSizeVariant.SMALLEST,
            ),
            SwipeDirection.TOP to KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                action = KeyAction.ToggleShiftMode(true),
                color = ColorVariant.SECONDARY,
            ),
        ),
        widthMultiplier = 3,
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )
val BACKSPACE_TYPESPLIT_SHIFTED_KEY_ITEM = BACKSPACE_TYPESPLIT_KEY_ITEM.copy(
    swipes = mapOf(
        SwipeDirection.LEFT to KeyC(
            action = KeyAction.DeleteLastWord,
            display = null,
        ),
        SwipeDirection.RIGHT to KeyC(
            action = KeyAction.SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent
                        .KEYCODE_FORWARD_DEL,
                ),
            ),
            display = null,
            color = ColorVariant.MUTED,
            size = FontSizeVariant.SMALLEST,
        ),
        SwipeDirection.TOP to KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
            action = KeyAction.ToggleCapsLock,
            color = ColorVariant.SECONDARY,
        ),
        SwipeDirection.BOTTOM to KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
            action = KeyAction.ToggleShiftMode(false),
            color = ColorVariant.SECONDARY,
        ),
    ),
)
