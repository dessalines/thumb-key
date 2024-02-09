package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.KeyboardDefinitionSettings
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe
import com.dessalines.thumbkey.utils.lastColKeysToFirst

val KB_EN_MESSAGEEASE_LEFT: KeyboardDefinition =
    KeyboardDefinition(
        title = "english messageease left-handed",
        modes =
            KeyboardDefinitionModes(
                main = lastColKeysToFirst(KB_EN_MESSAGEEASE_MAIN),
                shifted = lastColKeysToFirst(KB_EN_MESSAGEEASE_SHIFTED),
                numeric = lastColKeysToFirst(NUMERIC_KEYBOARD),
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
