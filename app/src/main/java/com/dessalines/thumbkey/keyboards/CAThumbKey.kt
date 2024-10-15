@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_CA_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ᑊ"),
                    top = KeyC("ᐱ", color = PRIMARY),
                    topRight = KeyC("ᐯ", color = PRIMARY),
                    right = KeyC("ᕑ"),
                    bottom = KeyC("ᐸ", color = PRIMARY),
                    bottomRight = KeyC("ᐳ", color = PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("ᐨ"),
                    topLeft = KeyC("ᒋ", size = LARGE),
                    top = KeyC("ᕠ"),
                    topRight = KeyC("ᒉ", size = LARGE),
                    left = KeyC("ᕦ"),
                    right = KeyC("ᕤ"),
                    bottomLeft = KeyC("ᒐ", size = LARGE),
                    bottom = KeyC("ᕞ"),
                    bottomRight = KeyC("ᒍ", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("ᐢ"),
                    topLeft = KeyC("ᓯ", size = LARGE),
                    top = KeyC("ᔑ"),
                    topRight = KeyC("ᓭ", size = LARGE),
                    left = KeyC("ᔕ"),
                    right = KeyC("ᔓ"),
                    bottomLeft = KeyC("ᓴ", size = LARGE),
                    bottom = KeyC("ᔐ"),
                    bottomRight = KeyC("ᓱ", size = LARGE),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ᐟ"),
                    top = KeyC("ᑎ", color = PRIMARY),
                    topRight = KeyC("ᑌ", color = PRIMARY),
                    right = KeyC("ᓫ"),
                    bottom = KeyC("ᑕ", color = PRIMARY),
                    bottomRight = KeyC("ᑐ", color = PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("ᐩ"),
                    topLeft = KeyC("ᔨ", size = LARGE),
                    top = KeyC("ᕕ"),
                    topRight = KeyC("ᔦ", size = LARGE),
                    left = KeyC("ᕙ"),
                    right = KeyC("ᕗ"),
                    bottomLeft = KeyC("ᔭ", size = LARGE),
                    bottom = KeyC("ᕓ"),
                    bottomRight = KeyC("ᔪ", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("ᒼ"),
                    topLeft = KeyC("ᒥ", size = LARGE),
                    top = KeyC("ᕆ"),
                    topRight = KeyC("ᒣ", size = LARGE),
                    left = KeyC("ᕋ"),
                    right = KeyC("ᕈ"),
                    bottomLeft = KeyC("ᒪ", size = LARGE),
                    bottom = KeyC("ᕃ"),
                    bottomRight = KeyC("ᒧ", size = LARGE),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ᐤ"),
                    top = KeyC("ᐃ", color = PRIMARY),
                    topRight = KeyC("ᐁ", color = PRIMARY),
                    right = KeyC("ᕽ"),
                    bottom = KeyC("ᐊ", color = PRIMARY),
                    bottomRight = KeyC("ᐅ", color = PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("ᐠ"),
                    topLeft = KeyC("ᑭ", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("·"),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topRight = KeyC("ᑫ", size = LARGE),
                    left = KeyC("·"),
                    right = KeyC("᐀"),
                    bottomLeft = KeyC("ᑲ", size = LARGE),
                    bottom = KeyC("ᐞ"),
                    bottomRight = KeyC("ᑯ", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("ᐣ"),
                    topLeft = KeyC("ᓂ", size = LARGE),
                    top = KeyC("ᓕ"),
                    topRight = KeyC("ᓀ", size = LARGE),
                    left = KeyC("ᓚ"),
                    right = KeyC("ᓗ"),
                    bottomLeft = KeyC("ᓇ", size = LARGE),
                    bottom = KeyC("ᓓ"),
                    bottomRight = KeyC("ᓄ", size = LARGE),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_CA_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ᐰ"),
                    top = KeyC("ᐲ", color = PRIMARY),
                    topRight = KeyC("ᐶ", color = PRIMARY),
                    right = KeyC("ᐷ"),
                    bottom = KeyC("ᐹ", color = PRIMARY),
                    bottomRight = KeyC("ᐴ", color = PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("ᕪ"),
                    topLeft = KeyC("ᒌ", size = LARGE),
                    top = KeyC("ᕢ"),
                    topRight = KeyC("ᒊ", size = LARGE),
                    left = KeyC("ᕧ"),
                    right = KeyC("ᕥ"),
                    bottomLeft = KeyC("ᒑ", size = LARGE),
                    bottom = KeyC("ᕐ"),
                    bottomRight = KeyC("ᒎ", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("ᐡ"),
                    topLeft = KeyC("ᓰ", size = LARGE),
                    top = KeyC("ᔒ"),
                    topRight = KeyC("ᓮ", size = LARGE),
                    left = KeyC("ᔖ"),
                    right = KeyC("ᔔ"),
                    bottomLeft = KeyC("ᓵ", size = LARGE),
                    bottom = KeyC("ᖕ"),
                    bottomRight = KeyC("ᓲ", size = LARGE),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ᑍ"),
                    top = KeyC("ᑏ", color = PRIMARY),
                    topRight = KeyC("ᑓ", color = PRIMARY),
                    right = KeyC("ᑔ"),
                    bottom = KeyC("ᑖ", color = PRIMARY),
                    bottomRight = KeyC("ᑑ", color = PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("ᕝ"),
                    topLeft = KeyC("ᔩ", size = LARGE),
                    top = KeyC("ᕖ"),
                    topRight = KeyC("ᔧ", size = LARGE),
                    left = KeyC("ᕚ"),
                    right = KeyC("ᕘ"),
                    bottomLeft = KeyC("ᔮ", size = LARGE),
                    bottom = KeyC("ᕔ"),
                    bottomRight = KeyC("ᔫ", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("ᔆ"),
                    topLeft = KeyC("ᒦ", size = LARGE),
                    top = KeyC("ᕇ"),
                    topRight = KeyC("ᒤ", size = LARGE),
                    left = KeyC("ᕌ"),
                    right = KeyC("ᕉ"),
                    bottomLeft = KeyC("ᒫ", size = LARGE),
                    bottom = KeyC("ᕅ"),
                    bottomRight = KeyC("ᒨ", size = LARGE),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ᐂ"),
                    top = KeyC("ᐄ", color = PRIMARY),
                    topRight = KeyC("ᐈ", color = PRIMARY),
                    right = KeyC("ᐉ"),
                    bottom = KeyC("ᐋ", color = PRIMARY),
                    bottomRight = KeyC("ᐆ", color = PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("ᐬ"),
                    topLeft = KeyC("ᑮ", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("·"),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    topRight = KeyC("ᑬ", size = LARGE),
                    left = KeyC("ᐮ"),
                    right = KeyC("ᐭ"),
                    bottomLeft = KeyC("ᑳ", size = LARGE),
                    bottom = KeyC("ᐫ"),
                    bottomRight = KeyC("ᑰ", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("ᐪ"),
                    topLeft = KeyC("ᓃ", size = LARGE),
                    top = KeyC("ᓖ"),
                    topRight = KeyC("ᓁ", size = LARGE),
                    left = KeyC("ᓛ"),
                    right = KeyC("ᓘ"),
                    bottomLeft = KeyC("ᓈ", size = LARGE),
                    bottom = KeyC("ᓔ"),
                    bottomRight = KeyC("ᓅ", size = LARGE),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_CA_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "canadian aboriginal syllabic thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_CA_THUMBKEY_MAIN,
                shifted = KB_CA_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
