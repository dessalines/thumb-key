package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes

// Frequencies from here: https://www.reddit.com/r/tokipona/comments/cxlpt5/frequency_list_of_toki_pona_words_from_tatoeba
// Since these aren't vowels, no need to alternate, just do bottom right to left, bottom to top

val KB_TOK_SITELEN_THUMBKEY_EMOJI_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("❌"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("🛒"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("👥"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("👂"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("🏋️"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("💀"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("⚫"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("🛏️"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("⚔️"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("👉"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("🔈"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("😴"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("👪"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("💰"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("↔️"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("⭕"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("📄"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("➕"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("↪️"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("🐒"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("💥"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("⚓"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("✌️"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("🌀"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("🔀"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("☝️"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("🛫"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("🔼"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("❕"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("🎁"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("⚡"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("🛣️"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("😃"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("🖼️"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("👨"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("⬆️"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("👇"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("🤔"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("👧"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("😶"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("🐘"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("☯️"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("⚙️"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("☀️"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("🍽️"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("👤"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("🐚"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("⚖️"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("💧"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("📤"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("🔧"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("👎"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("♾️"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("🏝️"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("👈"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("🏁"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("🐭"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("❤️"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("👜"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("✊"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("👀"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("↩️"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("🏠"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("⏩"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("🧠"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("💪"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("👋"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("💭"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("🗣️"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("▶️"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("❓"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("🚶"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("👍"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("👐"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("⏰"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("👆"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("⏹️"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("📍"),
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

val KB_TOK_SITELEN_THUMBKEY_EMOJI_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("⏺️"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("💬"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("🔥"),
                        ),
                    // Last char added here
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("♐"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("🍄"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("👁️"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("🧂"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("🌴"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("👹"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("💊"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("⛿"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("🧱"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("🫳"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("📕"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("🐊"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("✂️"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("✋"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("🦝"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("🪞"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("😎"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("📖"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("😹"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("🍆"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("🔵"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("🐟"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("💨"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("💛"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("🏹"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("📏"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("🌙"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("🍞"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("🐞"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("🗻"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("🦅"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("👕"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("🔴"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("🍦"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("💩"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("🍎"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("⚪"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("🔲"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("❗"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("⬅️"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("💕"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("🕳️"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("🌈"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("🦎"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("❄️"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("👄"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("🔓"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("🦵"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("〰️"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("#️⃣"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("⬇️"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("💎"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("🍭"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("➡️"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("📦"),
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

val KB_TOK_SITELEN_THUMBKEY_EMOJI: KeyboardDefinition =
    KeyboardDefinition(
        title = "toki pona sitelen thumb-key emoji",
        modes =
            KeyboardDefinitionModes(
                main = KB_TOK_SITELEN_THUMBKEY_EMOJI_MAIN,
                shifted = KB_TOK_SITELEN_THUMBKEY_EMOJI_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
