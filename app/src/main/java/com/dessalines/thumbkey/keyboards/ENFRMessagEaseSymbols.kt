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
import com.dessalines.thumbkey.utils.SwipeNWay
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe

// Layout for English and French
// ┌───────┬───────┬───────┐
// │   Â   │       │   Î   │
// │   A   │   N  !│?  I   │
// │   À  V│   L   │X  Ï   │
// ├───────┼───────┼───────┤
// │   Û  Ç│Q  H  P│   ▢   │
// │(  U  K│C  O  B│M  R  )│
// │   '  Ù│G  D  J│   ▢   │
// ├───────┼───────┼───────┤
// │   Ô  Y│È  W  É│F      │
// │   T  -│Ê  E  Z│Ë  S   │
// │       │,  .  :│;      │
// └───────┴───────┴───────┘
// ┌───────┬───────┬───────┐
// │       │`  ^  ´│²  ≈  ³│
// │≤  1   │+  2  !│?  3  ≥│
// │   $  €│/  *  \│   =   │
// ├───────┼───────┼───────┤
// │{     ✓│↔  ↑  ↕│   ½  }│
// │(  4   │←  5  →│¼  6  )│
// │[  '  ✗│   ↓  _│@  ¾  ]│
// ├───────┼───────┼───────┤
// │~  "  °│·  •  –│—  &  |│
// │<  7  -│   8  %│#  9  >│
// │«     ↹│,  .  :│;     »│
// └───────┴───────┴───────┘
// For support about this particular layout, open an issue and tag @Zwyx

val KB_EN_FR_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("a"),
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("â"),
                                    action = KeyAction.CommitText("â"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("v"),
                                    action = KeyAction.CommitText("v"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("à"),
                                    action = KeyAction.CommitText("à"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("n"),
                            action = KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("!"),
                                    action = KeyAction.CommitText("!"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("l"),
                                    action = KeyAction.CommitText("l"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("i"),
                            action = KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("î"),
                                    action = KeyAction.CommitText("î"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ï"),
                                    action = KeyAction.CommitText("ï"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("x"),
                                    action = KeyAction.CommitText("x"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("?"),
                                    action = KeyAction.CommitText("?"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("u"),
                            action = KeyAction.CommitText("u"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("û"),
                                    action = KeyAction.CommitText("û"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ç"),
                                    action = KeyAction.CommitText("ç"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("k"),
                                    action = KeyAction.CommitText("k"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ù"),
                                    action = KeyAction.CommitText("ù"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("'"),
                                    action = KeyAction.CommitText("'"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("("),
                                    action = KeyAction.CommitText("("),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("o"),
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("q"),
                                    action = KeyAction.CommitText("q"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("h"),
                                    action = KeyAction.CommitText("h"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("p"),
                                    action = KeyAction.CommitText("p"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("b"),
                                    action = KeyAction.CommitText("b"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("j"),
                                    action = KeyAction.CommitText("j"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("d"),
                                    action = KeyAction.CommitText("d"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("g"),
                                    action = KeyAction.CommitText("g"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("c"),
                                    action = KeyAction.CommitText("c"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("r"),
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                    action = KeyAction.ToggleShiftMode(true),
                                    swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(")"),
                                    action = KeyAction.CommitText(")"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("m"),
                                    action = KeyAction.CommitText("m"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.ToggleShiftMode(false),
                                    swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                                ),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("t"),
                            action = KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ô"),
                                    action = KeyAction.CommitText("ô"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("y"),
                                    action = KeyAction.CommitText("y"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("-"),
                                    action = KeyAction.CommitText("-"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("e"),
                            action = KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("è"),
                                    action = KeyAction.CommitText("è"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("w"),
                                    action = KeyAction.CommitText("w"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("é"),
                                    action = KeyAction.CommitText("é"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("z"),
                                    action = KeyAction.CommitText("z"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(":"),
                                    action = KeyAction.CommitText(":"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("."),
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(","),
                                    action = KeyAction.CommitText(","),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ê"),
                                    action = KeyAction.CommitText("ê"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("s"),
                            action = KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("f"),
                                    action = KeyAction.CommitText("f"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(";"),
                                    action = KeyAction.CommitText(";"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ë"),
                                    action = KeyAction.CommitText("ë"),
                                ),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_FR_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("A"),
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Â"),
                                    action = KeyAction.CommitText("Â"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("V"),
                                    action = KeyAction.CommitText("V"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("À"),
                                    action = KeyAction.CommitText("À"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("N"),
                            action = KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("!"),
                                    action = KeyAction.CommitText("!"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("L"),
                                    action = KeyAction.CommitText("L"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("I"),
                            action = KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Î"),
                                    action = KeyAction.CommitText("Î"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ï"),
                                    action = KeyAction.CommitText("Ï"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("X"),
                                    action = KeyAction.CommitText("X"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("?"),
                                    action = KeyAction.CommitText("?"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("U"),
                            action = KeyAction.CommitText("U"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Û"),
                                    action = KeyAction.CommitText("Û"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ç"),
                                    action = KeyAction.CommitText("Ç"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("K"),
                                    action = KeyAction.CommitText("K"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ù"),
                                    action = KeyAction.CommitText("Ù"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("'"),
                                    action = KeyAction.CommitText("'"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("("),
                                    action = KeyAction.CommitText("("),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("O"),
                            action = KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Q"),
                                    action = KeyAction.CommitText("Q"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("H"),
                                    action = KeyAction.CommitText("H"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("P"),
                                    action = KeyAction.CommitText("P"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("B"),
                                    action = KeyAction.CommitText("B"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("J"),
                                    action = KeyAction.CommitText("J"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("D"),
                                    action = KeyAction.CommitText("D"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("G"),
                                    action = KeyAction.CommitText("G"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("C"),
                                    action = KeyAction.CommitText("C"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("R"),
                            action = KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                                    capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                                    action = KeyAction.ToggleCapsLock,
                                    swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(")"),
                                    action = KeyAction.CommitText(")"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                                    action = KeyAction.ToggleShiftMode(false),
                                    swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("M"),
                                    action = KeyAction.CommitText("M"),
                                ),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("T"),
                            action = KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ô"),
                                    action = KeyAction.CommitText("Ô"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Y"),
                                    action = KeyAction.CommitText("Y"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("-"),
                                    action = KeyAction.CommitText("-"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("E"),
                            action = KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("È"),
                                    action = KeyAction.CommitText("È"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("W"),
                                    action = KeyAction.CommitText("W"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("É"),
                                    action = KeyAction.CommitText("É"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Z"),
                                    action = KeyAction.CommitText("Z"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(":"),
                                    action = KeyAction.CommitText(":"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("."),
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(","),
                                    action = KeyAction.CommitText(","),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ê"),
                                    action = KeyAction.CommitText("Ê"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("S"),
                            action = KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("F"),
                                    action = KeyAction.CommitText("F"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(";"),
                                    action = KeyAction.CommitText(";"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ë"),
                                    action = KeyAction.CommitText("Ë"),
                                ),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_FR_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("1"),
                            action = KeyAction.CommitText("1"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("€"),
                                    action = KeyAction.CommitText("€"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("$"),
                                    action = KeyAction.CommitText("$"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("≤"),
                                    action = KeyAction.CommitText("≤"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("2"),
                            action = KeyAction.CommitText("2"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("`"),
                                    action = KeyAction.CommitText("`"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("^"),
                                    action = KeyAction.CommitText("^"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("´"),
                                    action = KeyAction.CommitText("´"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("!"),
                                    action = KeyAction.CommitText("!"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\\"),
                                    action = KeyAction.CommitText("\\"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("*"),
                                    action = KeyAction.CommitText("*"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("/"),
                                    action = KeyAction.CommitText("/"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("+"),
                                    action = KeyAction.CommitText("+"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("3"),
                            action = KeyAction.CommitText("3"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("²"),
                                    action = KeyAction.CommitText("²"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("≈"),
                                    action = KeyAction.CommitText("≈"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("³"),
                                    action = KeyAction.CommitText("³"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("≥"),
                                    action = KeyAction.CommitText("≥"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("="),
                                    action = KeyAction.CommitText("="),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("?"),
                                    action = KeyAction.CommitText("?"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("4"),
                            action = KeyAction.CommitText("4"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("{"),
                                    action = KeyAction.CommitText("{"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("✓"),
                                    action = KeyAction.CommitText("✓"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("✗"),
                                    action = KeyAction.CommitText("✗"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("'"),
                                    action = KeyAction.CommitText("'"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("["),
                                    action = KeyAction.CommitText("["),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("("),
                                    action = KeyAction.CommitText("("),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("5"),
                            action = KeyAction.CommitText("5"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("↔"),
                                    action = KeyAction.CommitText("↔"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("↑"),
                                    action = KeyAction.CommitText("↑"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("↕"),
                                    action = KeyAction.CommitText("↕"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("→"),
                                    action = KeyAction.CommitText("→"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("_"),
                                    action = KeyAction.CommitText("_"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("↓"),
                                    action = KeyAction.CommitText("↓"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("←"),
                                    action = KeyAction.CommitText("←"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("6"),
                            action = KeyAction.CommitText("6"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("½"),
                                    action = KeyAction.CommitText("½"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("}"),
                                    action = KeyAction.CommitText("}"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(")"),
                                    action = KeyAction.CommitText(")"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("]"),
                                    action = KeyAction.CommitText("]"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("¾"),
                                    action = KeyAction.CommitText("¾"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("@"),
                                    action = KeyAction.CommitText("@"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("¼"),
                                    action = KeyAction.CommitText("¼"),
                                ),
                        ),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("7"),
                            action = KeyAction.CommitText("7"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("~"),
                                    action = KeyAction.CommitText("~"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\""),
                                    action = KeyAction.CommitText("\""),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("°"),
                                    action = KeyAction.CommitText("°"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("-"),
                                    action = KeyAction.CommitText("-"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\t"),
                                    action = KeyAction.CommitText("\t"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("«"),
                                    action = KeyAction.CommitText("«"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("<"),
                                    action = KeyAction.CommitText("<"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("8"),
                            action = KeyAction.CommitText("8"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("·"),
                                    action = KeyAction.CommitText("·"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("•"),
                                    action = KeyAction.CommitText("•"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("–"),
                                    action = KeyAction.CommitText("–"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("%"),
                                    action = KeyAction.CommitText("%"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(":"),
                                    action = KeyAction.CommitText(":"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("."),
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(","),
                                    action = KeyAction.CommitText(","),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("9"),
                            action = KeyAction.CommitText("9"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("—"),
                                    action = KeyAction.CommitText("—"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("&"),
                                    action = KeyAction.CommitText("&"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("|"),
                                    action = KeyAction.CommitText("|"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(">"),
                                    action = KeyAction.CommitText(">"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("»"),
                                    action = KeyAction.CommitText("»"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(";"),
                                    action = KeyAction.CommitText(";"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("#"),
                                    action = KeyAction.CommitText("#"),
                                ),
                        ),
                ),
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

val KB_EN_FR_MESSAGEASE_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "english français symbols messagease",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_FR_MAIN,
                shifted = KB_EN_FR_SHIFTED,
                numeric = KB_EN_FR_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
