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
                    center = KeyC(KeyAction.CommitText("ᑊ")),
                    top =
                        KeyC(
                            KeyAction.CommitText("ᐱ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᐯ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right = KeyC(KeyAction.CommitText("ᕑ")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ᐸ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᐳ"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᐨ")),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ᒋ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("ᕠ")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᒉ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left = KeyC(KeyAction.CommitText("ᕦ")),
                    right = KeyC(KeyAction.CommitText("ᕤ")),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ᒐ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom = KeyC(KeyAction.CommitText("ᕞ")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᒍ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᐢ")),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ᓯ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("ᔑ")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᓭ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left = KeyC(KeyAction.CommitText("ᔕ")),
                    right = KeyC(KeyAction.CommitText("ᔓ")),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ᓴ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom = KeyC(KeyAction.CommitText("ᔐ")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᓱ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᐟ")),
                    top =
                        KeyC(
                            KeyAction.CommitText("ᑎ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᑌ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right = KeyC(KeyAction.CommitText("ᓫ")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ᑕ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᑐ"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᐩ")),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ᔨ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("ᕕ")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᔦ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left = KeyC(KeyAction.CommitText("ᕙ")),
                    right = KeyC(KeyAction.CommitText("ᕗ")),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ᔭ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom = KeyC(KeyAction.CommitText("ᕓ")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᔪ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᒼ")),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ᒥ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("ᕆ")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᒣ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left = KeyC(KeyAction.CommitText("ᕋ")),
                    right = KeyC(KeyAction.CommitText("ᕈ")),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ᒪ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom = KeyC(KeyAction.CommitText("ᕃ")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᒧ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᐤ")),
                    top =
                        KeyC(
                            KeyAction.CommitText("ᐃ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᐁ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right = KeyC(KeyAction.CommitText("ᕽ")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ᐊ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᐅ"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᐠ")),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ᑭ"),
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
                            KeyAction.CommitText("ᑫ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left = KeyC(KeyAction.CommitText("·")),
                    right = KeyC(KeyAction.CommitText("᐀")),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ᑲ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom = KeyC(KeyAction.CommitText("ᐞ")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᑯ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᐣ")),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ᓂ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("ᓕ")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᓀ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left = KeyC(KeyAction.CommitText("ᓚ")),
                    right = KeyC(KeyAction.CommitText("ᓗ")),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ᓇ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom = KeyC(KeyAction.CommitText("ᓓ")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᓄ"),
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
                    center = KeyC(KeyAction.CommitText("ᐰ")),
                    top =
                        KeyC(
                            KeyAction.CommitText("ᐲ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᐶ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right = KeyC(KeyAction.CommitText("ᐷ")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ᐹ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᐴ"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᕪ")),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ᒌ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("ᕢ")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᒊ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left = KeyC(KeyAction.CommitText("ᕧ")),
                    right = KeyC(KeyAction.CommitText("ᕥ")),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ᒑ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom = KeyC(KeyAction.CommitText("ᕐ")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᒎ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᐡ")),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ᓰ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("ᔒ")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᓮ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left = KeyC(KeyAction.CommitText("ᔖ")),
                    right = KeyC(KeyAction.CommitText("ᔔ")),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ᓵ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom = KeyC(KeyAction.CommitText("ᖕ")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᓲ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᑍ")),
                    top =
                        KeyC(
                            KeyAction.CommitText("ᑏ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᑓ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right = KeyC(KeyAction.CommitText("ᑔ")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ᑖ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᑑ"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᕝ")),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ᔩ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("ᕖ")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᔧ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left = KeyC(KeyAction.CommitText("ᕚ")),
                    right = KeyC(KeyAction.CommitText("ᕘ")),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ᔮ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom = KeyC(KeyAction.CommitText("ᕔ")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᔫ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᔆ")),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ᒦ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("ᕇ")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᒤ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left = KeyC(KeyAction.CommitText("ᕌ")),
                    right = KeyC(KeyAction.CommitText("ᕉ")),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ᒫ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom = KeyC(KeyAction.CommitText("ᕅ")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᒨ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᐂ")),
                    top =
                        KeyC(
                            KeyAction.CommitText("ᐄ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᐈ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    right = KeyC(KeyAction.CommitText("ᐉ")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ᐋ"),
                            color = ColorVariant.PRIMARY,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᐆ"),
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᐬ")),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ᑮ"),
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
                            KeyAction.CommitText("ᑬ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left = KeyC(KeyAction.CommitText("ᐮ")),
                    right = KeyC(KeyAction.CommitText("ᐭ")),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ᑳ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom = KeyC(KeyAction.CommitText("ᐫ")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᑰ"),
                            size = FontSizeVariant.LARGE,
                        ),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("ᐪ")),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ᓃ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("ᓖ")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ᓁ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    left = KeyC(KeyAction.CommitText("ᓛ")),
                    right = KeyC(KeyAction.CommitText("ᓘ")),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ᓈ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottom = KeyC(KeyAction.CommitText("ᓔ")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ᓅ"),
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
