package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.getKeyboardFromTextLayout
import com.dessalines.thumbkey.utils.mergeKeyItems

val PL_MESSAGEASE_TEXTLAYOUT =
    """
        +---+---+---+
        |   |`ń´|ł  |
        | a-|+n!|?i |
        |¿ąv|/l\|x=€|
        +---+---+---+
        |{ó%|qup|| }|
        |(wk|cob|mr)|
        |[ć_|gdj|@ ]|
        +---+---+---+
        |~ y|"h'|f&°|
        |<zź|żet|śs>|
        | ę |,.:|;  |
        +---+---+---+
    """
        .trimIndent()
        .replace("¿", "\$") // \\\$ would brake ascii table formatting so some kind of replacement'¿' is used instead

val PL_MESSAGEASE_NUMERIC_TEXTLAYOUT =
    """
        +---+---+---+
        |   |`^´|   |
        | 1-|+2!|?3 |
        |¿  |/ \| =€|
        +---+---+---+
        |{ %|   || }|
        |(4 | 5 | 6)|
        |[ _|   |@ ]|
        +---+---+---+
        |~  |" '| &°|
        |<7*| 8 |#9>|
        |   |,.:|;  |
        +---+---+---+
    """
        .trimIndent()
        .replace("¿", "\$") // \\\$ would brake ascii table formatting so some kind of replacement'¿' is used instead

val PL_MESSAGEASE_9SQUARES = getKeyboardFromTextLayout(PL_MESSAGEASE_TEXTLAYOUT)

val KB_PL_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                *(PL_MESSAGEASE_9SQUARES.arr[0].toTypedArray()),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                PL_MESSAGEASE_9SQUARES.arr[1][0],
                PL_MESSAGEASE_9SQUARES.arr[1][1],
                mergeKeyItems(
                    PL_MESSAGEASE_9SQUARES.arr[1][2],
                    SHIFT_OVERRIDE_KEYITEM,
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                *(PL_MESSAGEASE_9SQUARES.arr[2].toTypedArray()),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val PL_MESSAGEASE_9SQUARES_SHIFTED = getKeyboardFromTextLayout(PL_MESSAGEASE_TEXTLAYOUT.uppercase())

val KB_PL_MESSAGEASE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                *(PL_MESSAGEASE_9SQUARES_SHIFTED.arr[0].toTypedArray()),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                PL_MESSAGEASE_9SQUARES_SHIFTED.arr[1][0],
                PL_MESSAGEASE_9SQUARES_SHIFTED.arr[1][1],
                mergeKeyItems(
                    PL_MESSAGEASE_9SQUARES_SHIFTED.arr[1][2],
                    SHIFTED_OVERRIDE_KEYITEM,
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                *(PL_MESSAGEASE_9SQUARES_SHIFTED.arr[2].toTypedArray()),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val PL_MESSAGEASE_NUMERIC_9SQUARES = getKeyboardFromTextLayout(PL_MESSAGEASE_NUMERIC_TEXTLAYOUT)

val KB_PL_MESSAGEASE_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                *(PL_MESSAGEASE_NUMERIC_9SQUARES.arr[0].toTypedArray()),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                *(PL_MESSAGEASE_NUMERIC_9SQUARES.arr[1].toTypedArray()),
                ABC_KEY_ITEM,
            ),
            listOf(
                *(PL_MESSAGEASE_NUMERIC_9SQUARES.arr[2].toTypedArray()),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("0"),
                            action = KeyAction.CommitText("0"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    widthMultiplier = 2,
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PL_MESSAGEASE: KeyboardDefinition =
    KeyboardDefinition(
        title = "polski messagease",
        modes =
            KeyboardDefinitionModes(
                main = KB_PL_MESSAGEASE_MAIN,
                shifted = KB_PL_MESSAGEASE_SHIFTED,
                numeric = KB_PL_MESSAGEASE_NUMERIC,
            ),
    )
