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



val KB_EN_MESSAGEEASE_SYMBOLS_MAIN_VAR =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = DUMMY_KEY
                ),
                DUMMY_KEYITEM,
                DUMMY_KEYITEM,
                DUMMY_KEYITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(
                        display = KeyDisplay.TextDisplay("þ"),
                        action = KeyAction.CommitText("þ"),
                    ),
                ),
                DUMMY_KEYITEM,
                DUMMY_KEYITEM,
                DUMMY_KEYITEM,
            ),
            listOf(
                DUMMY_KEYITEM,
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
                        SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("þ"),
                                    action = KeyAction.CommitText("þ"),
                                ),
                        SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("þ"),
                                    action = KeyAction.CommitText("þ"),
                                    color = ColorVariant.MUTED,
                                ),
                    ),
                ),
                DUMMY_KEYITEM,
            ),
            listOf(
                DUMMY_KEYITEM,
                DUMMY_KEYITEM,
            ),
        ),
    )

val KB_EN_MESSAGEEASE_SYMBOLS_VAR = makeVariant(
    KB_EN_MESSAGEEASE_SYMBOLS_MAIN,
    KB_EN_MESSAGEEASE_SYMBOLS_MAIN_VAR
)


val KB_EN_MESSAGEEASE_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "english symbols messageease variant merge test",
        modes =
        KeyboardDefinitionModes(
            main = KB_EN_MESSAGEEASE_SYMBOLS_VAR,
            shifted = KB_EN_MESSAGEEASE_SYMBOLS_SHIFTED,
            numeric = NUMERIC_KEYBOARD_MESSAGEASE,
        ),
        settings =
        KeyboardDefinitionSettings(
            autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
        ),
    )
