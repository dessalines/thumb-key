// This file serves as an example for how to create a simple variant of an existing keyboard.
// This one replaces the middle of the english board with thorn characters on the left, right and center.

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardCapslock
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.KeyboardDefinitionSettings
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe
import com.dessalines.thumbkey.utils.makeVariant



val KB_EN_THUMBKEY_MAIN_THORNY_OVERRIDE =
    KeyboardC(
        listOf(
            DUMMY_ROW,
            listOf(
                DUMMY_KEYITEM,
                KeyItemC(
                    center = 
                    KeyC(
                        display = KeyDisplay.TextDisplay("þ"),
                        action = KeyAction.CommitText("þ"),
                        color = ColorVariant.PRIMARY,
                    ),
                    swipes =
                    mapOf(
                        SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("þ"),
                                    action = KeyAction.CommitText("þ"),
                                    color = ColorVariant.PRIMARY,
                                ),
                        SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("þ"),
                                    action = KeyAction.CommitText("þ"),
                                    color = ColorVariant.MUTED,
                                ),
                    ),
                ),
                DUMMY_KEYITEM,
                DUMMY_KEYITEM,
            ),
            DUMMY_ROW,
            listOf(
                KeyItemC(
                    center = DUMMY_KEY
                ),
                DUMMY_KEYITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_MAIN_THORNY = makeVariant(
    KB_EN_THUMBKEY_MAIN,
    KB_EN_THUMBKEY_MAIN_THORNY_OVERRIDE,
)


val KB_EN_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "english thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_MAIN_THORNY,
                shifted = KB_EN_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
