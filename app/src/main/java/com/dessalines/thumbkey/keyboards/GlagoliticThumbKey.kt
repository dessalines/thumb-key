package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardCapslock
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_GLAGOLITIC_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ⱄ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ⱋ"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ⰹ"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ⰷ"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ⱊ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ⱃ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ⱈ"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ⱒ"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ⱜ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ⰵ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ⰶ"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("ⱑ"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ⱔ"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ⱕ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ⱗ"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ⱀ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ⰿ"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ⰾ"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ⱞ"),
                        ),
                    bottomRight =
                        KeyC(
                            // this character often lacks proper font support, but is technically part of Unicode
                            action = KeyAction.CommitText("ⱟ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ⱛ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ⰲ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ⰼ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ⰺ"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ⱐ"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ⱂ"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ⱆ"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ⰸ"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ⰳ"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("ⰽ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ⰰ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            KeyAction.CommitText("ⱇ"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ⱝ"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ⱅ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ⱍ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ⱎ"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ⱏ"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ⱚ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ⰻ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ⰱ"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ⱌ"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ⱁ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ⰴ"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ⱓ"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ⱖ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ⱉ"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("ⱘ"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ⱙ"),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_GLAGOLITIC_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Ⱄ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Ⱋ"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("Ⰹ"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Ⰷ"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("Ⱊ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Ⱃ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Ⱈ"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("Ⱒ"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("Ⱜ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Ⰵ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("Ⰶ"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("Ⱑ"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Ⱔ"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("Ⱕ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Ⱗ"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Ⱀ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Ⰿ"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Ⰾ"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("Ⱞ"),
                        ),
                    bottomRight =
                        KeyC(
                            // this character often lacks proper font support, but is technically part of Unicode
                            action = KeyAction.CommitText("Ⱟ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Ⱛ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Ⰲ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("Ⰼ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Ⰺ"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("Ⱐ"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Ⱂ"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("Ⱆ"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Ⰸ"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("Ⰳ"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("Ⰽ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Ⰰ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            KeyAction.CommitText("Ⱇ"),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Ⱝ"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Ⱅ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("Ⱍ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Ⱎ"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Ⱏ"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("Ⱚ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay(" Ⰻ"),
                            action = KeyAction.CommitText("Ⰻ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Ⰱ"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Ⱌ"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Ⱁ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("Ⰴ"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("Ⱓ"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("Ⱖ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("Ⱉ"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("Ⱘ"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("Ⱙ"),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_GLAGOLITIC_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "ⰳⰾⰰⰳⱁⰾⰻⱌⰰ thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_GLAGOLITIC_THUMBKEY_MAIN,
                shifted = KB_GLAGOLITIC_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
