@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

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
                    bottomRight = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
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
                    bottomRight = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
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
