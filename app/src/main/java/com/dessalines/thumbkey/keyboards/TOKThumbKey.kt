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

val KB_TOK_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ala ", displayText = "❌"),
                    topLeft = KeyC("esun ", displayText = "🛒"),
                    top = KeyC("kulupu ", displayText = "👥"),
                    topRight = KeyC("kute ", displayText = "👂"),
                    right = KeyC("sijelo ", displayText = "🏋️"),
                    bottomRight = KeyC("moli ", displayText = "💀"),
                    bottom = KeyC("pimeja ", displayText = "⚫"),
                    bottomLeft = KeyC("supa ", displayText = "🛏️"),
                    left = KeyC("utala ", displayText = "⚔️"),
                ),
                KeyItemC(
                    center = KeyC("sina ", displayText = "👉"),
                    topLeft = KeyC("kalama ", displayText = "🔈"),
                    top = KeyC("lape ", displayText = "😴"),
                    topRight = KeyC("mama ", displayText = "👪"),
                    right = KeyC("mani ", displayText = "💰"),
                    bottomRight = KeyC("poka ", displayText = "↔️"),
                    bottom = KeyC("sike ", displayText = "⭕"),
                    bottomLeft = KeyC("lipu ", displayText = "📄"),
                    left = KeyC("en ", displayText = "➕"),
                ),
                KeyItemC(
                    center = KeyC("tawa ", displayText = "↪️"),
                    topLeft = KeyC("soweli ", displayText = "🐒"),
                    top = KeyC("pakala ", displayText = "💥"),
                    topRight = KeyC("awen ", displayText = "⚓"),
                    right = KeyC("tu ", displayText = "✌️"),
                    bottomRight = KeyC("nasa ", displayText = "🌀"),
                    bottom = KeyC("ante ", displayText = "🔀"),
                    bottomLeft = KeyC("wan ", displayText = "☝️"),
                    left = KeyC("weka ", displayText = "🛫"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("la ", displayText = "🔼"),
                    topLeft = KeyC("kin ", displayText = "❕"),
                    top = KeyC("sin ", displayText = "🎁"),
                    topRight = KeyC("wawa ", displayText = "⚡"),
                    right = KeyC("nasin ", displayText = "🛣️"),
                    bottomRight = KeyC("musi ", displayText = "😃"),
                    bottom = KeyC("sitelen ", displayText = "🖼️"),
                    bottomLeft = KeyC("mije ", displayText = "👨"),
                    left = KeyC("sewi ", displayText = "⬆️"),
                ),
                KeyItemC(
                    center = KeyC("ni ", displayText = "👇"),
                    topLeft = KeyC("taso ", displayText = "🤔"),
                    top = KeyC("meli ", displayText = "👧"),
                    topRight = KeyC("lawa ", displayText = "😶"),
                    right = KeyC("suli ", displayText = "🐘"),
                    bottomRight = KeyC("anu ", displayText = "☯️"),
                    bottom = KeyC("ilo ", displayText = "⚙️"),
                    bottomLeft = KeyC("suno ", displayText = "☀️"),
                    left = KeyC("moku ", displayText = "🍽️"),
                ),
                KeyItemC(
                    center = KeyC("jan ", displayText = "👤"),
                    topLeft = KeyC("ijo ", displayText = "🐚"),
                    top = KeyC("sama ", displayText = "⚖️"),
                    topRight = KeyC("telo ", displayText = "💧"),
                    right = KeyC("pana ", displayText = "📤"),
                    bottomRight = KeyC("kepeken ", displayText = "🔧"),
                    bottom = KeyC("ike ", displayText = "👎"),
                    bottomLeft = KeyC("ale ", displayText = "♾️"),
                    left = KeyC("ma ", displayText = "🏝️"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("mi ", displayText = "👈"),
                    topLeft = KeyC("pini ", displayText = "🏁"),
                    top = KeyC("lili ", displayText = "🐭"),
                    topRight = KeyC("pilin ", displayText = "❤️"),
                    right = KeyC("jo ", displayText = "👜"),
                    bottomRight = KeyC("pali ", displayText = "✊"),
                    bottom = KeyC("lukin ", displayText = "👀"),
                    bottomLeft = KeyC("tan ", displayText = "↩️"),
                    left = KeyC("tomo ", displayText = "🏠"),
                ),
                KeyItemC(
                    center = KeyC("e ", displayText = "⏩"),
                    topLeft = KeyC("sona ", displayText = "🧠"),
                    top = KeyC("ken ", displayText = "💪"),
                    topRight = KeyC("o ", displayText = "👋"),
                    right = KeyC("wile ", displayText = "💭"),
                    bottomRight = KeyC(
                        action = ReplaceTrailingWhitespace(", ", 2),
                        display = KeyDisplay.TextDisplay(","),
                        color = MUTED
                    ),
                    bottom = KeyC(
                        action = ReplaceTrailingWhitespace(". ", 2),
                        display = KeyDisplay.TextDisplay("."),
                        color = MUTED
                    ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    left = KeyC("toki ", displayText = "🗣️"),
                ),
                KeyItemC(
                    center = KeyC("li ", displayText = "▶️"),
                    topLeft = KeyC("seme ", displayText = "❓"),
                    top = KeyC("kama ", displayText = "🚶"),
                    topRight = KeyC("pona ", displayText = "👍"),
                    right = KeyC("mute ", displayText = "👐"),
                    bottomRight = KeyC("tenpo ", displayText = "⏰"),
                    bottom = KeyC("ona ", displayText = "👆"),
                    bottomLeft = KeyC("pi ", displayText = "⏹️"),
                    left = KeyC("lon ", displayText = "📍"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_TOK_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("insa ", displayText = "⏺️"),
                ),
                KeyItemC(
                    center = KeyC("nimi ", displayText = "💬"),
                ),
                KeyItemC(
                    center = KeyC("seli ", displayText = "🔥"),
                    // Last char added here
                    bottomRight = KeyC("tonsi ", displayText = "♐"),
                    bottom = KeyC("soko ", displayText = "🍄"),
                    bottomLeft = KeyC("oko ", displayText = "👁️"),
                    left = KeyC("namako ", displayText = "🧂"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("kasi ", displayText = "🌴"),
                    topLeft = KeyC("monsuta ", displayText = "👹"),
                    top = KeyC("misikeke ", displayText = "💊"),
                    topRight = KeyC("meso ", displayText = "⛿"),
                    right = KeyC("leko ", displayText = "🧱"),
                    bottomRight = KeyC("lanpan ", displayText = "🫳"),
                    bottom = KeyC("ku ", displayText = "📕"),
                    bottomLeft = KeyC("kokosila ", displayText = "🐊"),
                    left = KeyC("kipisi ", displayText = "✂️"),
                ),
                KeyItemC(
                    center = KeyC("luka ", displayText = "✋"),
                    topLeft = KeyC("kijetesantakalu ", displayText = "🦝"),
                    top = KeyC("jasima ", displayText = "🪞"),
                    topRight = KeyC("epiku ", displayText = "😎"),
                    right = KeyC("pu ", displayText = "📖"),
                    bottomRight = KeyC("mu ", displayText = "😹"),
                    bottom = KeyC("unpa ", displayText = "🍆"),
                    bottomLeft = KeyC("laso ", displayText = "🔵"),
                    left = KeyC("kala ", displayText = "🐟"),
                ),
                KeyItemC(
                    center = KeyC("kon ", displayText = "💨"),
                    topLeft = KeyC("jelo ", displayText = "💛"),
                    top = KeyC("alasa ", displayText = "🏹"),
                    topRight = KeyC("palisa ", displayText = "📏"),
                    right = KeyC("mun ", displayText = "🌙"),
                    bottomRight = KeyC("pan ", displayText = "🍞"),
                    bottom = KeyC("pipi ", displayText = "🐞"),
                    bottomLeft = KeyC("nena ", displayText = "🗻"),
                    left = KeyC("waso ", displayText = "🦅"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("len ", displayText = "👕"),
                    topLeft = KeyC("loje ", displayText = "🔴"),
                    top = KeyC("ko ", displayText = "🍦"),
                    topRight = KeyC("jaki ", displayText = "💩"),
                    right = KeyC("kili ", displayText = "🍎"),
                    bottomRight = KeyC("walo ", displayText = "⚪"),
                    bottom = KeyC("selo ", displayText = "🔲"),
                    bottomLeft = KeyC("a ", displayText = "❗"),
                    left = KeyC("monsi ", displayText = "⬅️"),
                ),
                KeyItemC(
                    center = KeyC("olin ", displayText = "💕"),
                    topLeft = KeyC("lupa ", displayText = "🕳️"),
                    top = KeyC("kule ", displayText = "🌈"),
                    topRight = KeyC("akesi ", displayText = "🦎"),
                    right = KeyC("lete ", displayText = "❄️"),
                    bottomRight = KeyC(
                        action = ReplaceTrailingWhitespace(", ", 2),
                        display = KeyDisplay.TextDisplay(","),
                        color = MUTED
                    ),
                    bottom = KeyC(
                        action = ReplaceTrailingWhitespace(". ", 2),
                        display = KeyDisplay.TextDisplay("."),
                        color = MUTED
                    ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    left = KeyC("uta ", displayText = "👄"),
                ),
                KeyItemC(
                    center = KeyC("open ", displayText = "🔓"),
                    topLeft = KeyC("noka ", displayText = "🦵"),
                    top = KeyC("linja ", displayText = "〰️"),
                    topRight = KeyC("nanpa ", displayText = "#️⃣"),
                    right = KeyC("anpa ", displayText = "⬇️"),
                    bottomRight = KeyC("kiwen ", displayText = "💎"),
                    bottom = KeyC("suwi ", displayText = "🍭"),
                    bottomLeft = KeyC("sinpin ", displayText = "➡️"),
                    left = KeyC("poki ", displayText = "📦"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_TOK_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "toki pona thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_TOK_THUMBKEY_MAIN,
                shifted = KB_TOK_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings = KeyboardDefinitionSettings(layoutForceNoAutoShift = true)
    )
