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
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᑊ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᐱ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᐯ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᕑ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᐸ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᐳ"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᐨ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᒋ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᕠ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᒉ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ᕦ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᕤ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᒐ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᕞ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᒍ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᐢ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᓯ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᔑ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᓭ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ᔕ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᔓ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᓴ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᔐ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᓱ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᐟ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᑎ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᑌ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᓫ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᑕ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᑐ"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᐩ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᔨ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᕕ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᔦ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ᕙ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᕗ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᔭ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᕓ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᔪ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᒼ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᒥ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᕆ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᒣ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ᕋ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᕈ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᒪ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᕃ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᒧ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᐤ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᐃ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᐁ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᕽ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᐊ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᐅ"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᐠ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᑭ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("·"),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᑫ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("·"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("᐀"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᑲ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᐞ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᑯ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᐣ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᓂ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᓕ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᓀ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ᓚ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᓗ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᓇ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᓓ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᓄ"),
                            size = FontSizeVariant.LARGE,
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

val KB_CA_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᐰ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᐲ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᐶ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᐷ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᐹ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᐴ"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᕪ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᒌ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᕢ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᒊ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ᕧ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᕥ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᒑ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᕐ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᒎ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᐡ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᓰ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᔒ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᓮ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ᔖ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᔔ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᓵ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᖕ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᓲ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᑍ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᑏ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᑓ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᑔ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᑖ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᑑ"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᕝ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᔩ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᕖ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᔧ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ᕚ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᕘ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᔮ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᕔ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᔫ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᔆ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᒦ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᕇ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᒤ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ᕌ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᕉ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᒫ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᕅ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᒨ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᐂ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᐄ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᐈ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᐉ"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᐋ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᐆ"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᐬ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᑮ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("·"),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᑬ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ᐮ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᐭ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᑳ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᐫ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᑰ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ᐪ"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᓃ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ᓖ"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ᓁ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ᓛ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ᓘ"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ᓈ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ᓔ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ᓅ"),
                            size = FontSizeVariant.LARGE,
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
