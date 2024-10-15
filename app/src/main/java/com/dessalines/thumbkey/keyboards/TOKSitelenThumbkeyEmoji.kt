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
                    center = KeyC(KeyAction.CommitText("❌")),
                    topLeft = KeyC(KeyAction.CommitText("🛒")),
                    top = KeyC(KeyAction.CommitText("👥")),
                    topRight = KeyC(KeyAction.CommitText("👂")),
                    right = KeyC(KeyAction.CommitText("🏋️")),
                    bottomRight = KeyC(KeyAction.CommitText("💀")),
                    bottom = KeyC(KeyAction.CommitText("⚫")),
                    bottomLeft = KeyC(KeyAction.CommitText("🛏️")),
                    left = KeyC(KeyAction.CommitText("⚔️")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("👉")),
                    topLeft = KeyC(KeyAction.CommitText("🔈")),
                    top = KeyC(KeyAction.CommitText("😴")),
                    topRight = KeyC(KeyAction.CommitText("👪")),
                    right = KeyC(KeyAction.CommitText("💰")),
                    bottomRight = KeyC(KeyAction.CommitText("↔️")),
                    bottom = KeyC(KeyAction.CommitText("⭕")),
                    bottomLeft = KeyC(KeyAction.CommitText("📄")),
                    left = KeyC(KeyAction.CommitText("➕")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("↪️")),
                    topLeft = KeyC(KeyAction.CommitText("🐒")),
                    top = KeyC(KeyAction.CommitText("💥")),
                    topRight = KeyC(KeyAction.CommitText("⚓")),
                    right = KeyC(KeyAction.CommitText("✌️")),
                    bottomRight = KeyC(KeyAction.CommitText("🌀")),
                    bottom = KeyC(KeyAction.CommitText("🔀")),
                    bottomLeft = KeyC(KeyAction.CommitText("☝️")),
                    left = KeyC(KeyAction.CommitText("🛫")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("🔼")),
                    topLeft = KeyC(KeyAction.CommitText("❕")),
                    top = KeyC(KeyAction.CommitText("🎁")),
                    topRight = KeyC(KeyAction.CommitText("⚡")),
                    right = KeyC(KeyAction.CommitText("🛣️")),
                    bottomRight = KeyC(KeyAction.CommitText("😃")),
                    bottom = KeyC(KeyAction.CommitText("🖼️")),
                    bottomLeft = KeyC(KeyAction.CommitText("👨")),
                    left = KeyC(KeyAction.CommitText("⬆️")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("👇")),
                    topLeft = KeyC(KeyAction.CommitText("🤔")),
                    top = KeyC(KeyAction.CommitText("👧")),
                    topRight = KeyC(KeyAction.CommitText("😶")),
                    right = KeyC(KeyAction.CommitText("🐘")),
                    bottomRight = KeyC(KeyAction.CommitText("☯️")),
                    bottom = KeyC(KeyAction.CommitText("⚙️")),
                    bottomLeft = KeyC(KeyAction.CommitText("☀️")),
                    left = KeyC(KeyAction.CommitText("🍽️")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("👤")),
                    topLeft = KeyC(KeyAction.CommitText("🐚")),
                    top = KeyC(KeyAction.CommitText("⚖️")),
                    topRight = KeyC(KeyAction.CommitText("💧")),
                    right = KeyC(KeyAction.CommitText("📤")),
                    bottomRight = KeyC(KeyAction.CommitText("🔧")),
                    bottom = KeyC(KeyAction.CommitText("👎")),
                    bottomLeft = KeyC(KeyAction.CommitText("♾️")),
                    left = KeyC(KeyAction.CommitText("🏝️")),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("👈")),
                    topLeft = KeyC(KeyAction.CommitText("🏁")),
                    top = KeyC(KeyAction.CommitText("🐭")),
                    topRight = KeyC(KeyAction.CommitText("❤️")),
                    right = KeyC(KeyAction.CommitText("👜")),
                    bottomRight = KeyC(KeyAction.CommitText("✊")),
                    bottom = KeyC(KeyAction.CommitText("👀")),
                    bottomLeft = KeyC(KeyAction.CommitText("↩️")),
                    left = KeyC(KeyAction.CommitText("🏠")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("⏩")),
                    topLeft = KeyC(KeyAction.CommitText("🧠")),
                    top = KeyC(KeyAction.CommitText("💪")),
                    topRight = KeyC(KeyAction.CommitText("👋")),
                    right = KeyC(KeyAction.CommitText("💭")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC(KeyAction.CommitText("🗣️")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("▶️")),
                    topLeft = KeyC(KeyAction.CommitText("❓")),
                    top = KeyC(KeyAction.CommitText("🚶")),
                    topRight = KeyC(KeyAction.CommitText("👍")),
                    right = KeyC(KeyAction.CommitText("👐")),
                    bottomRight = KeyC(KeyAction.CommitText("⏰")),
                    bottom = KeyC(KeyAction.CommitText("👆")),
                    bottomLeft = KeyC(KeyAction.CommitText("⏹️")),
                    left = KeyC(KeyAction.CommitText("📍")),
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
                    center = KeyC(KeyAction.CommitText("⏺️")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("💬")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("🔥")),
                    // Last char added here
                    bottomRight = KeyC(KeyAction.CommitText("♐")),
                    bottom = KeyC(KeyAction.CommitText("🍄")),
                    bottomLeft = KeyC(KeyAction.CommitText("👁️")),
                    left = KeyC(KeyAction.CommitText("🧂")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("🌴")),
                    topLeft = KeyC(KeyAction.CommitText("👹")),
                    top = KeyC(KeyAction.CommitText("💊")),
                    topRight = KeyC(KeyAction.CommitText("⛿")),
                    right = KeyC(KeyAction.CommitText("🧱")),
                    bottomRight = KeyC(KeyAction.CommitText("🫳")),
                    bottom = KeyC(KeyAction.CommitText("📕")),
                    bottomLeft = KeyC(KeyAction.CommitText("🐊")),
                    left = KeyC(KeyAction.CommitText("✂️")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("✋")),
                    topLeft = KeyC(KeyAction.CommitText("🦝")),
                    top = KeyC(KeyAction.CommitText("🪞")),
                    topRight = KeyC(KeyAction.CommitText("😎")),
                    right = KeyC(KeyAction.CommitText("📖")),
                    bottomRight = KeyC(KeyAction.CommitText("😹")),
                    bottom = KeyC(KeyAction.CommitText("🍆")),
                    bottomLeft = KeyC(KeyAction.CommitText("🔵")),
                    left = KeyC(KeyAction.CommitText("🐟")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("💨")),
                    topLeft = KeyC(KeyAction.CommitText("💛")),
                    top = KeyC(KeyAction.CommitText("🏹")),
                    topRight = KeyC(KeyAction.CommitText("📏")),
                    right = KeyC(KeyAction.CommitText("🌙")),
                    bottomRight = KeyC(KeyAction.CommitText("🍞")),
                    bottom = KeyC(KeyAction.CommitText("🐞")),
                    bottomLeft = KeyC(KeyAction.CommitText("🗻")),
                    left = KeyC(KeyAction.CommitText("🦅")),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("👕")),
                    topLeft = KeyC(KeyAction.CommitText("🔴")),
                    top = KeyC(KeyAction.CommitText("🍦")),
                    topRight = KeyC(KeyAction.CommitText("💩")),
                    right = KeyC(KeyAction.CommitText("🍎")),
                    bottomRight = KeyC(KeyAction.CommitText("⚪")),
                    bottom = KeyC(KeyAction.CommitText("🔲")),
                    bottomLeft = KeyC(KeyAction.CommitText("❗")),
                    left = KeyC(KeyAction.CommitText("⬅️")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("💕")),
                    topLeft = KeyC(KeyAction.CommitText("🕳️")),
                    top = KeyC(KeyAction.CommitText("🌈")),
                    topRight = KeyC(KeyAction.CommitText("🦎")),
                    right = KeyC(KeyAction.CommitText("❄️")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC(KeyAction.CommitText("👄")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("🔓")),
                    topLeft = KeyC(KeyAction.CommitText("🦵")),
                    top = KeyC(KeyAction.CommitText("〰️")),
                    topRight = KeyC(KeyAction.CommitText("#️⃣")),
                    right = KeyC(KeyAction.CommitText("⬇️")),
                    bottomRight = KeyC(KeyAction.CommitText("💎")),
                    bottom = KeyC(KeyAction.CommitText("🍭")),
                    bottomLeft = KeyC(KeyAction.CommitText("➡️")),
                    left = KeyC(KeyAction.CommitText("📦")),
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
