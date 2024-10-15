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
                            action = KeyAction.CommitText("ⱄ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ⱋ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ⰹ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ⰷ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ⱊ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ⱃ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ⱈ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ⱒ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ⱜ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ⰵ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ⰶ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ⱑ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ⱔ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ⱕ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ⱗ"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ⱀ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ⰿ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ⰾ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ⱞ"),
                        ),
                    bottomRight =
                        KeyC(
                            // this character often lacks proper font support, but is technically part of Unicode
                            action = KeyAction.CommitText("ⱟ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ⱛ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ⰲ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ⰼ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ⰺ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ⱐ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ⱂ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ⱆ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ⰸ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ⰳ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ⰽ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ⰰ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ⱇ"),
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
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ⱝ"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ⱅ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ⱍ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ⱎ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ⱏ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ⱚ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ⰻ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ⰱ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ⱌ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
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
                    left =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ⱁ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ⰴ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ⱓ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ⱖ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ⱉ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ⱘ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ⱙ"),
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
                            action = KeyAction.CommitText("Ⱄ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ⱋ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ⰹ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ⰷ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ⱊ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("Ⱃ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ⱈ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ⱒ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ⱜ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("Ⰵ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ⰶ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ⱑ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ⱔ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ⱕ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ⱗ"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("Ⱀ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ⰿ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ⰾ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Ⱞ"),
                        ),
                    bottomRight =
                        KeyC(
                            // this character often lacks proper font support, but is technically part of Unicode
                            action = KeyAction.CommitText("Ⱟ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ⱛ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("Ⰲ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ⰼ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ⰺ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Ⱐ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ⱂ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ⱆ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ⰸ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ⰳ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ⰽ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("Ⰰ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ⱇ"),
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
                            action = KeyAction.CommitText("Ⱝ"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("Ⱅ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Ⱍ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ⱎ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ⱏ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ⱚ"),
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
                            action = KeyAction.CommitText("Ⰱ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ⱌ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
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
                    left =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("Ⱁ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ⰴ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ⱓ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Ⱖ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ⱉ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ⱘ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("Ⱙ"),
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
