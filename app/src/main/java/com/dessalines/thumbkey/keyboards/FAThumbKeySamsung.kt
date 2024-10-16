@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_FA_THUMBKEY_SAMSUNG: KeyboardDefinition =
    KeyboardDefinition(
        title = "فارسی thumb-key samsung",
        modes =
            KeyboardDefinitionModes(
                main = KB_FA_THUMBKEY_MAIN,
                shifted = KB_FA_THUMBKEY_MAIN,
                numeric = FARSI_NUMERIC_SAMSUNG_KEYBOARD,
            ),
    )
