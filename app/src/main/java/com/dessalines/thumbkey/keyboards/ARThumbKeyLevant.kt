@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*

val KB_AR_THUMBKEY_LEVANT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ب", size = LARGE),
                    bottomRight = KeyC("ش"),
                ),
                KeyItemC(
                    center = KeyC("ر", size = LARGE),
                    bottomRight = KeyC("ز"),
                    bottom = KeyC("ق"),
                ),
                KeyItemC(
                    center = KeyC("و", size = LARGE),
                    top = KeyC("ؤ"),
                    bottomLeft = KeyC("س"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ن", size = LARGE),
                    right = KeyC("ف"),
                    bottomRight = KeyC("ذ"),
                    left = KeyC(")", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ت", size = LARGE),
                    topLeft = KeyC("ض"),
                    top = KeyC("ث"),
                    topRight = KeyC("خ"),
                    right = KeyC("ح"),
                    bottomRight = KeyC("ج"),
                    bottom = KeyC("ة"),
                    bottomLeft = KeyC("ص"),
                    left = KeyC("ط"),
                ),
                KeyItemC(
                    center = KeyC("ي", size = LARGE),
                    top = KeyC("ئ"),
                    right = KeyC("(", color = MUTED),
                    bottom = KeyC("ى"),
                    bottomLeft = KeyC("غ"),
                    left = KeyC("ك"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ل", size = LARGE),
                    topRight = KeyC("د"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottomLeft = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("م", size = LARGE),
                    top = KeyC("ه"),
                    topRight = KeyC("ظ"),
                    bottomRight = KeyC("،", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("؟", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ا", size = LARGE),
                    topLeft = KeyC("ع"),
                    top = KeyC("أ"),
                    topRight = KeyC("آ"),
                    bottom = KeyC("إ"),
                    left = KeyC("ء"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_AR_THUMBKEY_LEVANT: KeyboardDefinition =
    KeyboardDefinition(
        title = "عربية شامية thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_AR_THUMBKEY_LEVANT_MAIN,
                shifted = KB_AR_THUMBKEY_LEVANT_MAIN,
                numeric = ARABIC_NUMERIC_KEYBOARD,
            ),
        locales = listOf("ar"),
    )
