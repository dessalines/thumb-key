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
                    center = KeyC("❌"),
                    topLeft = KeyC("🛒"),
                    top = KeyC("👥"),
                    topRight = KeyC("👂"),
                    right = KeyC("🏋️"),
                    bottomRight = KeyC("💀"),
                    bottom = KeyC("⚫"),
                    bottomLeft = KeyC("🛏️"),
                    left = KeyC("⚔️"),
                ),
                KeyItemC(
                    center = KeyC("👉"),
                    topLeft = KeyC("🔈"),
                    top = KeyC("😴"),
                    topRight = KeyC("👪"),
                    right = KeyC("💰"),
                    bottomRight = KeyC("↔️"),
                    bottom = KeyC("⭕"),
                    bottomLeft = KeyC("📄"),
                    left = KeyC("➕"),
                ),
                KeyItemC(
                    center = KeyC("↪️"),
                    topLeft = KeyC("🐒"),
                    top = KeyC("💥"),
                    topRight = KeyC("⚓"),
                    right = KeyC("✌️"),
                    bottomRight = KeyC("🌀"),
                    bottom = KeyC("🔀"),
                    bottomLeft = KeyC("☝️"),
                    left = KeyC("🛫"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("🔼"),
                    topLeft = KeyC("❕"),
                    top = KeyC("🎁"),
                    topRight = KeyC("⚡"),
                    right = KeyC("🛣️"),
                    bottomRight = KeyC("😃"),
                    bottom = KeyC("🖼️"),
                    bottomLeft = KeyC("👨"),
                    left = KeyC("⬆️"),
                ),
                KeyItemC(
                    center = KeyC("👇"),
                    topLeft = KeyC("🤔"),
                    top = KeyC("👧"),
                    topRight = KeyC("😶"),
                    right = KeyC("🐘"),
                    bottomRight = KeyC("☯️"),
                    bottom = KeyC("⚙️"),
                    bottomLeft = KeyC("☀️"),
                    left = KeyC("🍽️"),
                ),
                KeyItemC(
                    center = KeyC("👤"),
                    topLeft = KeyC("🐚"),
                    top = KeyC("⚖️"),
                    topRight = KeyC("💧"),
                    right = KeyC("📤"),
                    bottomRight = KeyC("🔧"),
                    bottom = KeyC("👎"),
                    bottomLeft = KeyC("♾️"),
                    left = KeyC("🏝️"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("👈"),
                    topLeft = KeyC("🏁"),
                    top = KeyC("🐭"),
                    topRight = KeyC("❤️"),
                    right = KeyC("👜"),
                    bottomRight = KeyC("✊"),
                    bottom = KeyC("👀"),
                    bottomLeft = KeyC("↩️"),
                    left = KeyC("🏠"),
                ),
                KeyItemC(
                    center = KeyC("⏩"),
                    topLeft = KeyC("🧠"),
                    top = KeyC("💪"),
                    topRight = KeyC("👋"),
                    right = KeyC("💭"),
                    bottomRight = KeyC(",", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC("🗣️"),
                ),
                KeyItemC(
                    center = KeyC("▶️"),
                    topLeft = KeyC("❓"),
                    top = KeyC("🚶"),
                    topRight = KeyC("👍"),
                    right = KeyC("👐"),
                    bottomRight = KeyC("⏰"),
                    bottom = KeyC("👆"),
                    bottomLeft = KeyC("⏹️"),
                    left = KeyC("📍"),
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
                    center = KeyC("⏺️"),
                ),
                KeyItemC(
                    center = KeyC("💬"),
                ),
                KeyItemC(
                    center = KeyC("🔥"),
                    // Last char added here
                    bottomRight = KeyC("♐"),
                    bottom = KeyC("🍄"),
                    bottomLeft = KeyC("👁️"),
                    left = KeyC("🧂"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("🌴"),
                    topLeft = KeyC("👹"),
                    top = KeyC("💊"),
                    topRight = KeyC("⛿"),
                    right = KeyC("🧱"),
                    bottomRight = KeyC("🫳"),
                    bottom = KeyC("📕"),
                    bottomLeft = KeyC("🐊"),
                    left = KeyC("✂️"),
                ),
                KeyItemC(
                    center = KeyC("✋"),
                    topLeft = KeyC("🦝"),
                    top = KeyC("🪞"),
                    topRight = KeyC("😎"),
                    right = KeyC("📖"),
                    bottomRight = KeyC("😹"),
                    bottom = KeyC("🍆"),
                    bottomLeft = KeyC("🔵"),
                    left = KeyC("🐟"),
                ),
                KeyItemC(
                    center = KeyC("💨"),
                    topLeft = KeyC("💛"),
                    top = KeyC("🏹"),
                    topRight = KeyC("📏"),
                    right = KeyC("🌙"),
                    bottomRight = KeyC("🍞"),
                    bottom = KeyC("🐞"),
                    bottomLeft = KeyC("🗻"),
                    left = KeyC("🦅"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("👕"),
                    topLeft = KeyC("🔴"),
                    top = KeyC("🍦"),
                    topRight = KeyC("💩"),
                    right = KeyC("🍎"),
                    bottomRight = KeyC("⚪"),
                    bottom = KeyC("🔲"),
                    bottomLeft = KeyC("❗"),
                    left = KeyC("⬅️"),
                ),
                KeyItemC(
                    center = KeyC("💕"),
                    topLeft = KeyC("🕳️"),
                    top = KeyC("🌈"),
                    topRight = KeyC("🦎"),
                    right = KeyC("❄️"),
                    bottomRight = KeyC(",", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC("👄"),
                ),
                KeyItemC(
                    center = KeyC("🔓"),
                    topLeft = KeyC("🦵"),
                    top = KeyC("〰️"),
                    topRight = KeyC("#️⃣"),
                    right = KeyC("⬇️"),
                    bottomRight = KeyC("💎"),
                    bottom = KeyC("🍭"),
                    bottomLeft = KeyC("➡️"),
                    left = KeyC("📦"),
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
