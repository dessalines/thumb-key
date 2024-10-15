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

val KB_FA_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("د", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("ص"),
                    bottom = KeyC("ض"),
                ),
                KeyItemC(
                    center = KeyC("ر", size = FontSizeVariant.LARGE),
                    right = KeyC("ژ"),
                    bottomRight = KeyC("ف"),
                    bottom = KeyC("ز"),
                    bottomLeft = KeyC("ق"),
                ),
                KeyItemC(
                    center = KeyC("و", size = FontSizeVariant.LARGE),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("‹"),
                            action = KeyAction.CommitText("\u200F"), // Right-to-Left Mark (RLM)
                            color = ColorVariant.MUTED,
                        ),
                    bottom = KeyC("ء"),
                    bottomLeft = KeyC("ع"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ن", size = FontSizeVariant.LARGE),
                    right = KeyC("ج"),
                    topRight = KeyC("ح"),
                    bottomRight = KeyC("چ"),
                ),
                KeyItemC(
                    center = KeyC("ا", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("ذ"),
                    top = KeyC("ب"),
                    topRight = KeyC("پ"),
                    right = KeyC("س"),
                    bottomRight = KeyC("ش"),
                    bottom = KeyC("ل"),
                    bottomLeft = KeyC("آ"),
                    left = KeyC("خ"),
                ),
                KeyItemC(
                    center = KeyC("م", size = FontSizeVariant.LARGE),
                    bottomLeft = KeyC("گ"),
                    left = KeyC("ک"),
                    topLeft = KeyC("غ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ت", size = FontSizeVariant.LARGE),
                    topRight = KeyC("ث"),
                ),
                KeyItemC(
                    center = KeyC("ی", size = FontSizeVariant.LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("‹›"),
                            action = KeyAction.CommitText("\u200C"), // Zero Width Non-Joiner (ZWNJ)
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC("ئ"),
                    bottomRight = KeyC("ـ", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    left = KeyC("؟", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("ه", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("ط"),
                    top = KeyC("ظ"),
                    left = KeyC("ۀ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FARSI_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FA_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "thumb-key فارسی",
        modes =
            KeyboardDefinitionModes(
                main = KB_FA_THUMBKEY_MAIN,
                shifted = KB_FA_THUMBKEY_MAIN,
                numeric = FARSI_NUMERIC_KEYBOARD,
            ),
    )
