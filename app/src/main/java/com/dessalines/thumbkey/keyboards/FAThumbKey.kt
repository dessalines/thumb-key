@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_FA_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("د", size = LARGE),
                    bottomRight = KeyC("ص"),
                    bottom = KeyC("ض"),
                ),
                KeyItemC(
                    center = KeyC("ر", size = LARGE),
                    right = KeyC("ژ"),
                    bottomRight = KeyC("ف"),
                    bottom = KeyC("ز"),
                    bottomLeft = KeyC("ق"),
                ),
                KeyItemC(
                    center = KeyC("و", size = LARGE),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("‹"),
                            action = CommitText("\u200F"), // Right-to-Left Mark (RLM)
                            color = MUTED,
                        ),
                    bottom = KeyC("ء"),
                    bottomLeft = KeyC("ع"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ن", size = LARGE),
                    right = KeyC("ج"),
                    topRight = KeyC("ح"),
                    bottomRight = KeyC("چ"),
                ),
                KeyItemC(
                    center = KeyC("ا", size = LARGE),
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
                    center = KeyC("م", size = LARGE),
                    bottomLeft = KeyC("گ"),
                    left = KeyC("ک"),
                    topLeft = KeyC("غ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ت", size = LARGE),
                    topRight = KeyC("ث"),
                ),
                KeyItemC(
                    center = KeyC("ی", size = LARGE),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("‹›"),
                            action = CommitText("\u200C"), // Zero Width Non-Joiner (ZWNJ)
                            color = MUTED,
                        ),
                    right = KeyC("ئ"),
                    bottomRight = KeyC("ـ", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    left = KeyC("؟", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ه", size = LARGE),
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
