@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.lastColKeysToFirst

val KB_DE_MESSAGEASE_LEFT: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch messagease left-handed",
        modes =
            KeyboardDefinitionModes(
                main = lastColKeysToFirst(KB_DE_MESSAGEASE_MAIN),
                shifted = lastColKeysToFirst(KB_DE_MESSAGEASE_SHIFTED),
                numeric = lastColKeysToFirst(KB_EN_MESSAGEASE_NUMERIC),
            ),
    )
