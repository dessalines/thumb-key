package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.KeyboardDefinitionSettings
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe
import com.dessalines.thumbkey.utils.lastColKeysToFirst

val KB_EN_QBASED_LEFT: KeyboardDefinition =
    KeyboardDefinition(
        title = "english QBased left-handed",
        modes =
            KeyboardDefinitionModes(
                main = lastColKeysToFirst(KB_EN_QBASED_MAIN),
                shifted = lastColKeysToFirst(KB_EN_QBASED_SHIFTED),
                numeric = lastColKeysToFirst(NUMERIC_KEYBOARD),
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
