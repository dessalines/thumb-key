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

val KB_TOK_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("❌"),
                            action = KeyAction.CommitText("ala "),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🛒"),
                            action = KeyAction.CommitText("esun "),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👥"),
                            action = KeyAction.CommitText("kulupu "),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👂"),
                            action = KeyAction.CommitText("kute "),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🏋️"),
                            action = KeyAction.CommitText("sijelo "),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("💀"),
                            action = KeyAction.CommitText("moli "),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⚫"),
                            action = KeyAction.CommitText("pimeja "),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🛏️"),
                            action = KeyAction.CommitText("supa "),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⚔️"),
                            action = KeyAction.CommitText("utala "),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👉"),
                            action = KeyAction.CommitText("sina "),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🔈"),
                            action = KeyAction.CommitText("kalama "),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("😴"),
                            action = KeyAction.CommitText("lape "),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👪"),
                            action = KeyAction.CommitText("mama "),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("💰"),
                            action = KeyAction.CommitText("mani "),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↔️"),
                            action = KeyAction.CommitText("poka "),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⭕"),
                            action = KeyAction.CommitText("sike "),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("📄"),
                            action = KeyAction.CommitText("lipu "),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("➕"),
                            action = KeyAction.CommitText("en "),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↪️"),
                            action = KeyAction.CommitText("tawa "),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🐒"),
                            action = KeyAction.CommitText("soweli "),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("💥"),
                            action = KeyAction.CommitText("pakala "),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⚓"),
                            action = KeyAction.CommitText("awen "),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("✌️"),
                            action = KeyAction.CommitText("tu "),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🌀"),
                            action = KeyAction.CommitText("nasa "),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🔀"),
                            action = KeyAction.CommitText("ante "),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("☝️"),
                            action = KeyAction.CommitText("wan "),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🛫"),
                            action = KeyAction.CommitText("weka "),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🔼"),
                            action = KeyAction.CommitText("la "),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("❕"),
                            action = KeyAction.CommitText("kin "),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🎁"),
                            action = KeyAction.CommitText("sin "),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⚡"),
                            action = KeyAction.CommitText("wawa "),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🛣️"),
                            action = KeyAction.CommitText("nasin "),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("😃"),
                            action = KeyAction.CommitText("musi "),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🖼️"),
                            action = KeyAction.CommitText("sitelen "),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👨"),
                            action = KeyAction.CommitText("mije "),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⬆️"),
                            action = KeyAction.CommitText("sewi "),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👇"),
                            action = KeyAction.CommitText("ni "),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🤔"),
                            action = KeyAction.CommitText("taso "),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👧"),
                            action = KeyAction.CommitText("meli "),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("😶"),
                            action = KeyAction.CommitText("lawa "),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🐘"),
                            action = KeyAction.CommitText("suli "),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("☯️"),
                            action = KeyAction.CommitText("anu "),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⚙️"),
                            action = KeyAction.CommitText("ilo "),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("☀️"),
                            action = KeyAction.CommitText("suno "),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🍽️"),
                            action = KeyAction.CommitText("moku "),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👤"),
                            action = KeyAction.CommitText("jan "),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🐚"),
                            action = KeyAction.CommitText("ijo "),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⚖️"),
                            action = KeyAction.CommitText("sama "),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("💧"),
                            action = KeyAction.CommitText("telo "),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("📤"),
                            action = KeyAction.CommitText("pana "),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🔧"),
                            action = KeyAction.CommitText("kepeken "),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👎"),
                            action = KeyAction.CommitText("ike "),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("♾️"),
                            action = KeyAction.CommitText("ale "),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🏝️"),
                            action = KeyAction.CommitText("ma "),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👈"),
                            action = KeyAction.CommitText("mi "),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🏁"),
                            action = KeyAction.CommitText("pini "),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🐭"),
                            action = KeyAction.CommitText("lili "),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("❤️"),
                            action = KeyAction.CommitText("pilin "),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👜"),
                            action = KeyAction.CommitText("jo "),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("✊"),
                            action = KeyAction.CommitText("pali "),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👀"),
                            action = KeyAction.CommitText("lukin "),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↩️"),
                            action = KeyAction.CommitText("tan "),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🏠"),
                            action = KeyAction.CommitText("tomo "),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⏩"),
                            action = KeyAction.CommitText("e "),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🧠"),
                            action = KeyAction.CommitText("sona "),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("💪"),
                            action = KeyAction.CommitText("ken "),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👋"),
                            action = KeyAction.CommitText("o "),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("💭"),
                            action = KeyAction.CommitText("wile "),
                        ),
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
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🗣️"),
                            action = KeyAction.CommitText("toki "),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("▶️"),
                            action = KeyAction.CommitText("li "),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("❓"),
                            action = KeyAction.CommitText("seme "),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🚶"),
                            action = KeyAction.CommitText("kama "),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👍"),
                            action = KeyAction.CommitText("pona "),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👐"),
                            action = KeyAction.CommitText("mute "),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⏰"),
                            action = KeyAction.CommitText("tenpo "),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👆"),
                            action = KeyAction.CommitText("ona "),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⏹️"),
                            action = KeyAction.CommitText("pi "),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("📍"),
                            action = KeyAction.CommitText("lon "),
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

val KB_TOK_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⏺️"),
                            action = KeyAction.CommitText("insa "),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("💬"),
                            action = KeyAction.CommitText("nimi "),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🔥"),
                            action = KeyAction.CommitText("seli "),
                        ),
                    // Last char added here
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("♐"),
                            action = KeyAction.CommitText("tonsi "),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🍄"),
                            action = KeyAction.CommitText("soko "),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👁️"),
                            action = KeyAction.CommitText("oko "),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🧂"),
                            action = KeyAction.CommitText("namako "),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🌴"),
                            action = KeyAction.CommitText("kasi "),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👹"),
                            action = KeyAction.CommitText("monsuta "),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("💊"),
                            action = KeyAction.CommitText("misikeke "),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⛿"),
                            action = KeyAction.CommitText("meso "),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🧱"),
                            action = KeyAction.CommitText("leko "),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🫳"),
                            action = KeyAction.CommitText("lanpan "),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("📕"),
                            action = KeyAction.CommitText("ku "),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🐊"),
                            action = KeyAction.CommitText("kokosila "),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("✂️"),
                            action = KeyAction.CommitText("kipisi "),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("✋"),
                            action = KeyAction.CommitText("luka "),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🦝"),
                            action = KeyAction.CommitText("kijetesantakalu "),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🪞"),
                            action = KeyAction.CommitText("jasima "),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("😎"),
                            action = KeyAction.CommitText("epiku "),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("📖"),
                            action = KeyAction.CommitText("pu "),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("😹"),
                            action = KeyAction.CommitText("mu "),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🍆"),
                            action = KeyAction.CommitText("unpa "),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🔵"),
                            action = KeyAction.CommitText("laso "),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🐟"),
                            action = KeyAction.CommitText("kala "),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("💨"),
                            action = KeyAction.CommitText("kon "),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("💛"),
                            action = KeyAction.CommitText("jelo "),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🏹"),
                            action = KeyAction.CommitText("alasa "),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("📏"),
                            action = KeyAction.CommitText("palisa "),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🌙"),
                            action = KeyAction.CommitText("mun "),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🍞"),
                            action = KeyAction.CommitText("pan "),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🐞"),
                            action = KeyAction.CommitText("pipi "),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🗻"),
                            action = KeyAction.CommitText("nena "),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🦅"),
                            action = KeyAction.CommitText("waso "),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👕"),
                            action = KeyAction.CommitText("len "),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🔴"),
                            action = KeyAction.CommitText("loje "),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🍦"),
                            action = KeyAction.CommitText("ko "),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("💩"),
                            action = KeyAction.CommitText("jaki "),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🍎"),
                            action = KeyAction.CommitText("kili "),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⚪"),
                            action = KeyAction.CommitText("walo "),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🔲"),
                            action = KeyAction.CommitText("selo "),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("❗"),
                            action = KeyAction.CommitText("a "),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⬅️"),
                            action = KeyAction.CommitText("monsi "),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("💕"),
                            action = KeyAction.CommitText("olin "),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🕳️"),
                            action = KeyAction.CommitText("lupa "),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🌈"),
                            action = KeyAction.CommitText("kule "),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🦎"),
                            action = KeyAction.CommitText("akesi "),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("❄️"),
                            action = KeyAction.CommitText("lete "),
                        ),
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
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("👄"),
                            action = KeyAction.CommitText("uta "),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🔓"),
                            action = KeyAction.CommitText("open "),
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🦵"),
                            action = KeyAction.CommitText("noka "),
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("〰️"),
                            action = KeyAction.CommitText("linja "),
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("#️⃣"),
                            action = KeyAction.CommitText("nanpa "),
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⬇️"),
                            action = KeyAction.CommitText("anpa "),
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("💎"),
                            action = KeyAction.CommitText("kiwen "),
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("🍭"),
                            action = KeyAction.CommitText("suwi "),
                        ),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.TextDisplay("➡️"),
                            action = KeyAction.CommitText("sinpin "),
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("📦"),
                            action = KeyAction.CommitText("poki "),
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

val KB_TOK_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "toki pona thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_TOK_THUMBKEY_MAIN,
                shifted = KB_TOK_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
