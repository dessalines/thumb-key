package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes

val KB_FA_THUMBKEY_SAMSUNG: KeyboardDefinition =
    KeyboardDefinition(
        title = "thumb-key فارسی samsung",
        modes =
            KeyboardDefinitionModes(
                main = KB_FA_THUMBKEY_MAIN,
                shifted = KB_FA_THUMBKEY_MAIN,
                numeric = FARSI_NUMERIC_SAMSUNG_KEYBOARD,
            ),
    )
