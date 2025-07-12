@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_RU_ARTI_MAIN =
    KB_TR_ARTI_MAIN.copy()

val KB_RU_ARTI_SHIFTED =
    KB_TR_ARTI_SHIFTED.copy()

val KB_RU_ARTI_NUMERIC =
    KB_TR_ARTI_NUMERIC.copy()

val KB_RU_ARTI: KeyboardDefinition =
    KeyboardDefinition(
        title = "русский плюс много",
        modes =
            KeyboardDefinitionModes(
                main = KB_RU_ARTI_MAIN,
                shifted = KB_RU_ARTI_SHIFTED,
                numeric = KB_RU_ARTI_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(),
    )
