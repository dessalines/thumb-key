package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardMode
import com.dessalines.thumbkey.utils.SwipeDirection

val THUMBKEY_CA_V1_MAIN = KeyboardC(
    listOf(
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᑊ"),
                    action = KeyAction.CommitText("ᑊ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᐱ"),
                        action = KeyAction.CommitText("ᐱ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᐯ"),
                        action = KeyAction.CommitText("ᐯ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᕑ"),
                        action = KeyAction.CommitText("ᕑ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᐸ"),
                        action = KeyAction.CommitText("ᐸ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᐳ"),
                        action = KeyAction.CommitText("ᐳ"),
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᐨ"),
                    action = KeyAction.CommitText("ᐨ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒋ"),
                        action = KeyAction.CommitText("ᒋ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᕠ"),
                        action = KeyAction.CommitText("ᕠ"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒉ"),
                        action = KeyAction.CommitText("ᒉ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᕦ"),
                        action = KeyAction.CommitText("ᕦ"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᕤ"),
                        action = KeyAction.CommitText("ᕤ"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒐ"),
                        action = KeyAction.CommitText("ᒐ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᕞ"),
                        action = KeyAction.CommitText("ᕞ"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒍ"),
                        action = KeyAction.CommitText("ᒍ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᐢ"),
                    action = KeyAction.CommitText("ᐢ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓯ"),
                        action = KeyAction.CommitText("ᓯ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᔑ"),
                        action = KeyAction.CommitText("ᔑ"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓭ"),
                        action = KeyAction.CommitText("ᓭ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᔕ"),
                        action = KeyAction.CommitText("ᔕ"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᔓ"),
                        action = KeyAction.CommitText("ᔓ"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓴ"),
                        action = KeyAction.CommitText("ᓴ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᔐ"),
                        action = KeyAction.CommitText("ᔐ"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓱ"),
                        action = KeyAction.CommitText("ᓱ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            EMOJI_KEY_ITEM,
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᐟ"),
                    action = KeyAction.CommitText("ᐟ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᑎ"),
                        action = KeyAction.CommitText("ᑎ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᑌ"),
                        action = KeyAction.CommitText("ᑌ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓫ"),
                        action = KeyAction.CommitText("ᓫ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᑕ"),
                        action = KeyAction.CommitText("ᑕ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᑐ"),
                        action = KeyAction.CommitText("ᑐ"),
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᐩ"),
                    action = KeyAction.CommitText("ᐩ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᔨ"),
                        action = KeyAction.CommitText("ᔨ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᕕ"),
                        action = KeyAction.CommitText("ᕕ"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᔦ"),
                        action = KeyAction.CommitText("ᔦ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᕙ"),
                        action = KeyAction.CommitText("ᕙ"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᕗ"),
                        action = KeyAction.CommitText("ᕗ"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᔭ"),
                        action = KeyAction.CommitText("ᔭ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᕓ"),
                        action = KeyAction.CommitText("ᕓ"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᔪ"),
                        action = KeyAction.CommitText("ᔪ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᒼ"),
                    action = KeyAction.CommitText("ᒼ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒥ"),
                        action = KeyAction.CommitText("ᒥ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᕆ"),
                        action = KeyAction.CommitText("ᕆ"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒣ"),
                        action = KeyAction.CommitText("ᒣ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᕋ"),
                        action = KeyAction.CommitText("ᕋ"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᕈ"),
                        action = KeyAction.CommitText("ᕈ"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒪ"),
                        action = KeyAction.CommitText("ᒪ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᕃ"),
                        action = KeyAction.CommitText("ᕃ"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒧ"),
                        action = KeyAction.CommitText("ᒧ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            NUMERIC_KEY_ITEM,
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᐤ"),
                    action = KeyAction.CommitText("ᐤ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᐃ"),
                        action = KeyAction.CommitText("ᐃ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᐁ"),
                        action = KeyAction.CommitText("ᐁ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᕽ"),
                        action = KeyAction.CommitText("ᕽ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᐊ"),
                        action = KeyAction.CommitText("ᐊ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᐅ"),
                        action = KeyAction.CommitText("ᐅ"),
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᐠ"),
                    action = KeyAction.CommitText("ᐠ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᑭ"),
                        action = KeyAction.CommitText("ᑭ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("·"),
                        action = KeyAction.ToggleShiftMode(true),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᑫ"),
                        action = KeyAction.CommitText("ᑫ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("·"),
                        action = KeyAction.CommitText("·"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("᐀"),
                        action = KeyAction.CommitText("᐀"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᑲ"),
                        action = KeyAction.CommitText("ᑲ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᐞ"),
                        action = KeyAction.CommitText("ᐞ"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᑯ"),
                        action = KeyAction.CommitText("ᑯ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᐣ"),
                    action = KeyAction.CommitText("ᐣ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓂ"),
                        action = KeyAction.CommitText("ᓂ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᓕ"),
                        action = KeyAction.CommitText("ᓕ"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓀ"),
                        action = KeyAction.CommitText("ᓀ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓚ"),
                        action = KeyAction.CommitText("ᓚ"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓗ"),
                        action = KeyAction.CommitText("ᓗ"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓇ"),
                        action = KeyAction.CommitText("ᓇ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᓓ"),
                        action = KeyAction.CommitText("ᓓ"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓄ"),
                        action = KeyAction.CommitText("ᓄ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
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

val THUMBKEY_CA_V1_SHIFTED = KeyboardC(
    listOf(
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᐰ"),
                    action = KeyAction.CommitText("ᐰ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᐲ"),
                        action = KeyAction.CommitText("ᐲ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᐶ"),
                        action = KeyAction.CommitText("ᐶ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᐷ"),
                        action = KeyAction.CommitText("ᐷ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᐹ"),
                        action = KeyAction.CommitText("ᐹ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᐴ"),
                        action = KeyAction.CommitText("ᐴ"),
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᕪ"),
                    action = KeyAction.CommitText("ᕪ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒌ"),
                        action = KeyAction.CommitText("ᒌ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᕢ"),
                        action = KeyAction.CommitText("ᕢ"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒊ"),
                        action = KeyAction.CommitText("ᒊ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᕧ"),
                        action = KeyAction.CommitText("ᕧ"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᕥ"),
                        action = KeyAction.CommitText("ᕥ"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒑ"),
                        action = KeyAction.CommitText("ᒑ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᕐ"),
                        action = KeyAction.CommitText("ᕐ"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒎ"),
                        action = KeyAction.CommitText("ᒎ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᐡ"),
                    action = KeyAction.CommitText("ᐡ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓰ"),
                        action = KeyAction.CommitText("ᓰ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᔒ"),
                        action = KeyAction.CommitText("ᔒ"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓮ"),
                        action = KeyAction.CommitText("ᓮ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᔖ"),
                        action = KeyAction.CommitText("ᔖ"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᔔ"),
                        action = KeyAction.CommitText("ᔔ"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓵ"),
                        action = KeyAction.CommitText("ᓵ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᖕ"),
                        action = KeyAction.CommitText("ᖕ"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓲ"),
                        action = KeyAction.CommitText("ᓲ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            EMOJI_KEY_ITEM,
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᑍ"),
                    action = KeyAction.CommitText("ᑍ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᑏ"),
                        action = KeyAction.CommitText("ᑏ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᑓ"),
                        action = KeyAction.CommitText("ᑓ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᑔ"),
                        action = KeyAction.CommitText("ᑔ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᑖ"),
                        action = KeyAction.CommitText("ᑖ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᑑ"),
                        action = KeyAction.CommitText("ᑑ"),
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᕝ"),
                    action = KeyAction.CommitText("ᕝ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᔩ"),
                        action = KeyAction.CommitText("ᔩ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᕖ"),
                        action = KeyAction.CommitText("ᕖ"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᔧ"),
                        action = KeyAction.CommitText("ᔧ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᕚ"),
                        action = KeyAction.CommitText("ᕚ"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᕘ"),
                        action = KeyAction.CommitText("ᕘ"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᔮ"),
                        action = KeyAction.CommitText("ᔮ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᕔ"),
                        action = KeyAction.CommitText("ᕔ"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᔫ"),
                        action = KeyAction.CommitText("ᔫ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᔆ"),
                    action = KeyAction.CommitText("ᔆ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒦ"),
                        action = KeyAction.CommitText("ᒦ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᕇ"),
                        action = KeyAction.CommitText("ᕇ"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒤ"),
                        action = KeyAction.CommitText("ᒤ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᕌ"),
                        action = KeyAction.CommitText("ᕌ"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᕉ"),
                        action = KeyAction.CommitText("ᕉ"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒫ"),
                        action = KeyAction.CommitText("ᒫ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᕅ"),
                        action = KeyAction.CommitText("ᕅ"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᒨ"),
                        action = KeyAction.CommitText("ᒨ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            NUMERIC_KEY_ITEM,
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᐂ"),
                    action = KeyAction.CommitText("ᐂ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᐄ"),
                        action = KeyAction.CommitText("ᐄ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᐈ"),
                        action = KeyAction.CommitText("ᐈ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᐉ"),
                        action = KeyAction.CommitText("ᐉ"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᐋ"),
                        action = KeyAction.CommitText("ᐋ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᐆ"),
                        action = KeyAction.CommitText("ᐆ"),
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᐬ"),
                    action = KeyAction.CommitText("ᐬ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᑮ"),
                        action = KeyAction.CommitText("ᑮ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("·"),
                        action = KeyAction.ToggleShiftMode(false),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᑬ"),
                        action = KeyAction.CommitText("ᑬ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᐮ"),
                        action = KeyAction.CommitText("ᐮ"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᐭ"),
                        action = KeyAction.CommitText("ᐭ"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᑳ"),
                        action = KeyAction.CommitText("ᑳ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᐫ"),
                        action = KeyAction.CommitText("ᐫ"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᑰ"),
                        action = KeyAction.CommitText("ᑰ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ᐪ"),
                    action = KeyAction.CommitText("ᐪ"),
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓃ"),
                        action = KeyAction.CommitText("ᓃ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ᓖ"),
                        action = KeyAction.CommitText("ᓖ"),
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓁ"),
                        action = KeyAction.CommitText("ᓁ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓛ"),
                        action = KeyAction.CommitText("ᓛ"),
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓘ"),
                        action = KeyAction.CommitText("ᓘ"),
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓈ"),
                        action = KeyAction.CommitText("ᓈ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ᓔ"),
                        action = KeyAction.CommitText("ᓔ"),
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ᓅ"),
                        action = KeyAction.CommitText("ᓅ"),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.PRIMARY,
                    ),
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

val THUMBKEY_CA_V1_KEYBOARD_MODES: Map<KeyboardMode, KeyboardC> = mapOf(
    KeyboardMode.MAIN to THUMBKEY_CA_V1_MAIN,
    KeyboardMode.SHIFTED to THUMBKEY_CA_V1_SHIFTED,
    KeyboardMode.NUMERIC to NUMERIC_KEYBOARD,
)
