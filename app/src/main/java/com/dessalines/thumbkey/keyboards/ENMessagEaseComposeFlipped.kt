@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_MESSAGEASE_COMPOSE_LEFT_FLIPPED_NUMPAD: KeyboardDefinition =
    KeyboardDefinition(
        title = "english messagease compose left-handed with a flipped numpad layout",
        modes =
            KeyboardDefinitionModes(
                main = lastColKeysToFirst(KB_EN_MESSAGEASE_COMPOSED_MAIN),
                shifted = lastColKeysToFirst(KB_EN_MESSAGEASE_COMPOSED_SHIFTED),
                numeric = lastColKeysToFirst(NUMERIC_KEYBOARD_FLIPPED),
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
