@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_GLAGOLITIC_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ⱄ", size = LARGE),
                    right = KeyC("ⱋ"),
                    bottomRight = KeyC("ⰹ"),
                    bottom = KeyC("ⰷ"),
                    bottomLeft = KeyC("ⱊ"),
                ),
                KeyItemC(
                    center = KeyC("ⱃ", size = LARGE),
                    bottom = KeyC("ⱈ"),
                    bottomLeft = KeyC("ⱒ"),
                    bottomRight = KeyC("ⱜ"),
                ),
                KeyItemC(
                    center = KeyC("ⰵ", size = LARGE),
                    bottomLeft = KeyC("ⰶ"),
                    left = KeyC("ⱑ"),
                    bottom = KeyC("ⱔ"),
                    bottomRight = KeyC("ⱕ"),
                    top = KeyC("ⱗ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ⱀ", size = LARGE),
                    right = KeyC("ⰿ"),
                    bottom = KeyC("ⰾ"),
                    topRight = KeyC("ⱞ"),
                    bottomRight =
                        KeyC(
                            // this character often lacks proper font support, but is technically part of Unicode
                            action = CommitText("ⱟ"),
                        ),
                    top = KeyC("ⱛ"),
                ),
                KeyItemC(
                    center = KeyC("ⰲ", size = LARGE),
                    topLeft = KeyC("ⰼ"),
                    top = KeyC("ⰺ"),
                    topRight = KeyC("ⱐ"),
                    right = KeyC("ⱂ"),
                    bottomRight = KeyC("ⱆ"),
                    bottom = KeyC("ⰸ"),
                    bottomLeft = KeyC("ⰳ"),
                    left = KeyC("ⰽ"),
                ),
                KeyItemC(
                    center = KeyC("ⰰ", size = LARGE),
                    left = KeyC("ⱇ"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    right = KeyC("ⱝ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ⱅ", size = LARGE),
                    topRight = KeyC("ⱍ"),
                    top = KeyC("ⱎ"),
                    right = KeyC("ⱏ"),
                    topLeft = KeyC("ⱚ"),
                ),
                KeyItemC(
                    center = KeyC("ⰻ", size = LARGE),
                    top = KeyC("ⰱ"),
                    right = KeyC("ⱌ"),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ⱁ", size = LARGE),
                    topLeft = KeyC("ⰴ"),
                    bottom = KeyC("ⱓ"),
                    right = KeyC("ⱖ"),
                    top = KeyC("ⱉ"),
                    left = KeyC("ⱘ"),
                    bottomLeft = KeyC("ⱙ"),
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
                    center = KeyC("Ⱄ", size = LARGE),
                    right = KeyC("Ⱋ"),
                    bottomRight = KeyC("Ⰹ"),
                    bottom = KeyC("Ⰷ"),
                    bottomLeft = KeyC("Ⱊ"),
                ),
                KeyItemC(
                    center = KeyC("Ⱃ", size = LARGE),
                    bottom = KeyC("Ⱈ"),
                    bottomLeft = KeyC("Ⱒ"),
                    bottomRight = KeyC("Ⱜ"),
                ),
                KeyItemC(
                    center = KeyC("Ⰵ", size = LARGE),
                    bottomLeft = KeyC("Ⰶ"),
                    left = KeyC("Ⱑ"),
                    bottom = KeyC("Ⱔ"),
                    bottomRight = KeyC("Ⱕ"),
                    top = KeyC("Ⱗ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Ⱀ", size = LARGE),
                    right = KeyC("Ⰿ"),
                    bottom = KeyC("Ⰾ"),
                    topRight = KeyC("Ⱞ"),
                    bottomRight =
                        KeyC(
                            // this character often lacks proper font support, but is technically part of Unicode
                            action = CommitText("Ⱟ"),
                        ),
                    top = KeyC("Ⱛ"),
                ),
                KeyItemC(
                    center = KeyC("Ⰲ", size = LARGE),
                    topLeft = KeyC("Ⰼ"),
                    top = KeyC("Ⰺ"),
                    topRight = KeyC("Ⱐ"),
                    right = KeyC("Ⱂ"),
                    bottomRight = KeyC("Ⱆ"),
                    bottom = KeyC("Ⰸ"),
                    bottomLeft = KeyC("Ⰳ"),
                    left = KeyC("Ⰽ"),
                ),
                KeyItemC(
                    center = KeyC("Ⰰ", size = LARGE),
                    left = KeyC("Ⱇ"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    right = KeyC("Ⱝ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Ⱅ", size = LARGE),
                    topRight = KeyC("Ⱍ"),
                    top = KeyC("Ⱎ"),
                    right = KeyC("Ⱏ"),
                    topLeft = KeyC("Ⱚ"),
                ),
                KeyItemC(
                    center = KeyC("Ⰻ", size = LARGE),
                    top = KeyC("Ⰱ"),
                    right = KeyC("Ⱌ"),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("Ⱁ", size = LARGE),
                    topLeft = KeyC("Ⰴ"),
                    bottom = KeyC("Ⱓ"),
                    right = KeyC("Ⱖ"),
                    top = KeyC("Ⱉ"),
                    left = KeyC("Ⱘ"),
                    bottomLeft = KeyC("Ⱙ"),
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
