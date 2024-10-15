package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes

val KB_CA_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ᑊ"),
                    top = KeyC("ᐱ", color = ColorVariant.PRIMARY),
                    topRight = KeyC("ᐯ", color = ColorVariant.PRIMARY),
                    right = KeyC("ᕑ"),
                    bottom = KeyC("ᐸ", color = ColorVariant.PRIMARY),
                    bottomRight = KeyC("ᐳ", color = ColorVariant.PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("ᐨ"),
                    topLeft = KeyC("ᒋ", size = FontSizeVariant.LARGE),
                    top = KeyC("ᕠ"),
                    topRight = KeyC("ᒉ", size = FontSizeVariant.LARGE),
                    left = KeyC("ᕦ"),
                    right = KeyC("ᕤ"),
                    bottomLeft = KeyC("ᒐ", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ᕞ"),
                    bottomRight = KeyC("ᒍ", size = FontSizeVariant.LARGE),
                ),
                KeyItemC(
                    center = KeyC("ᐢ"),
                    topLeft = KeyC("ᓯ", size = FontSizeVariant.LARGE),
                    top = KeyC("ᔑ"),
                    topRight = KeyC("ᓭ", size = FontSizeVariant.LARGE),
                    left = KeyC("ᔕ"),
                    right = KeyC("ᔓ"),
                    bottomLeft = KeyC("ᓴ", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ᔐ"),
                    bottomRight = KeyC("ᓱ", size = FontSizeVariant.LARGE),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ᐟ"),
                    top = KeyC("ᑎ", color = ColorVariant.PRIMARY),
                    topRight = KeyC("ᑌ", color = ColorVariant.PRIMARY),
                    right = KeyC("ᓫ"),
                    bottom = KeyC("ᑕ", color = ColorVariant.PRIMARY),
                    bottomRight = KeyC("ᑐ", color = ColorVariant.PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("ᐩ"),
                    topLeft = KeyC("ᔨ", size = FontSizeVariant.LARGE),
                    top = KeyC("ᕕ"),
                    topRight = KeyC("ᔦ", size = FontSizeVariant.LARGE),
                    left = KeyC("ᕙ"),
                    right = KeyC("ᕗ"),
                    bottomLeft = KeyC("ᔭ", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ᕓ"),
                    bottomRight = KeyC("ᔪ", size = FontSizeVariant.LARGE),
                ),
                KeyItemC(
                    center = KeyC("ᒼ"),
                    topLeft = KeyC("ᒥ", size = FontSizeVariant.LARGE),
                    top = KeyC("ᕆ"),
                    topRight = KeyC("ᒣ", size = FontSizeVariant.LARGE),
                    left = KeyC("ᕋ"),
                    right = KeyC("ᕈ"),
                    bottomLeft = KeyC("ᒪ", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ᕃ"),
                    bottomRight = KeyC("ᒧ", size = FontSizeVariant.LARGE),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ᐤ"),
                    top = KeyC("ᐃ", color = ColorVariant.PRIMARY),
                    topRight = KeyC("ᐁ", color = ColorVariant.PRIMARY),
                    right = KeyC("ᕽ"),
                    bottom = KeyC("ᐊ", color = ColorVariant.PRIMARY),
                    bottomRight = KeyC("ᐅ", color = ColorVariant.PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("ᐠ"),
                    topLeft = KeyC("ᑭ", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("·"),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topRight = KeyC("ᑫ", size = FontSizeVariant.LARGE),
                    left = KeyC("·"),
                    right = KeyC("᐀"),
                    bottomLeft = KeyC("ᑲ", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ᐞ"),
                    bottomRight = KeyC("ᑯ", size = FontSizeVariant.LARGE),
                ),
                KeyItemC(
                    center = KeyC("ᐣ"),
                    topLeft = KeyC("ᓂ", size = FontSizeVariant.LARGE),
                    top = KeyC("ᓕ"),
                    topRight = KeyC("ᓀ", size = FontSizeVariant.LARGE),
                    left = KeyC("ᓚ"),
                    right = KeyC("ᓗ"),
                    bottomLeft = KeyC("ᓇ", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ᓓ"),
                    bottomRight = KeyC("ᓄ", size = FontSizeVariant.LARGE),
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
                    top = KeyC("ᐲ", color = ColorVariant.PRIMARY),
                    topRight = KeyC("ᐶ", color = ColorVariant.PRIMARY),
                    right = KeyC("ᐷ"),
                    bottom = KeyC("ᐹ", color = ColorVariant.PRIMARY),
                    bottomRight = KeyC("ᐴ", color = ColorVariant.PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("ᕪ"),
                    topLeft = KeyC("ᒌ", size = FontSizeVariant.LARGE),
                    top = KeyC("ᕢ"),
                    topRight = KeyC("ᒊ", size = FontSizeVariant.LARGE),
                    left = KeyC("ᕧ"),
                    right = KeyC("ᕥ"),
                    bottomLeft = KeyC("ᒑ", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ᕐ"),
                    bottomRight = KeyC("ᒎ", size = FontSizeVariant.LARGE),
                ),
                KeyItemC(
                    center = KeyC("ᐡ"),
                    topLeft = KeyC("ᓰ", size = FontSizeVariant.LARGE),
                    top = KeyC("ᔒ"),
                    topRight = KeyC("ᓮ", size = FontSizeVariant.LARGE),
                    left = KeyC("ᔖ"),
                    right = KeyC("ᔔ"),
                    bottomLeft = KeyC("ᓵ", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ᖕ"),
                    bottomRight = KeyC("ᓲ", size = FontSizeVariant.LARGE),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ᑍ"),
                    top = KeyC("ᑏ", color = ColorVariant.PRIMARY),
                    topRight = KeyC("ᑓ", color = ColorVariant.PRIMARY),
                    right = KeyC("ᑔ"),
                    bottom = KeyC("ᑖ", color = ColorVariant.PRIMARY),
                    bottomRight = KeyC("ᑑ", color = ColorVariant.PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("ᕝ"),
                    topLeft = KeyC("ᔩ", size = FontSizeVariant.LARGE),
                    top = KeyC("ᕖ"),
                    topRight = KeyC("ᔧ", size = FontSizeVariant.LARGE),
                    left = KeyC("ᕚ"),
                    right = KeyC("ᕘ"),
                    bottomLeft = KeyC("ᔮ", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ᕔ"),
                    bottomRight = KeyC("ᔫ", size = FontSizeVariant.LARGE),
                ),
                KeyItemC(
                    center = KeyC("ᔆ"),
                    topLeft = KeyC("ᒦ", size = FontSizeVariant.LARGE),
                    top = KeyC("ᕇ"),
                    topRight = KeyC("ᒤ", size = FontSizeVariant.LARGE),
                    left = KeyC("ᕌ"),
                    right = KeyC("ᕉ"),
                    bottomLeft = KeyC("ᒫ", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ᕅ"),
                    bottomRight = KeyC("ᒨ", size = FontSizeVariant.LARGE),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ᐂ"),
                    top = KeyC("ᐄ", color = ColorVariant.PRIMARY),
                    topRight = KeyC("ᐈ", color = ColorVariant.PRIMARY),
                    right = KeyC("ᐉ"),
                    bottom = KeyC("ᐋ", color = ColorVariant.PRIMARY),
                    bottomRight = KeyC("ᐆ", color = ColorVariant.PRIMARY),
                ),
                KeyItemC(
                    center = KeyC("ᐬ"),
                    topLeft = KeyC("ᑮ", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("·"),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    topRight = KeyC("ᑬ", size = FontSizeVariant.LARGE),
                    left = KeyC("ᐮ"),
                    right = KeyC("ᐭ"),
                    bottomLeft = KeyC("ᑳ", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ᐫ"),
                    bottomRight = KeyC("ᑰ", size = FontSizeVariant.LARGE),
                ),
                KeyItemC(
                    center = KeyC("ᐪ"),
                    topLeft = KeyC("ᓃ", size = FontSizeVariant.LARGE),
                    top = KeyC("ᓖ"),
                    topRight = KeyC("ᓁ", size = FontSizeVariant.LARGE),
                    left = KeyC("ᓛ"),
                    right = KeyC("ᓘ"),
                    bottomLeft = KeyC("ᓈ", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ᓔ"),
                    bottomRight = KeyC("ᓅ", size = FontSizeVariant.LARGE),
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
