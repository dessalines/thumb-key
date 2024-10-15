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
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("â"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("v"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("à"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("l"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("î"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ï"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("x"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("u"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("û"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ç"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("k"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ù"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("q"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("h"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("p"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("b"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("j"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("d"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("g"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("c"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("m"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ô"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("y"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("è"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("w"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("é"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("z"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ê"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("f"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ë"),
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
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Â"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("V"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("À"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("L"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Î"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("Ï"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("X"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("U"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Û"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Ç"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("K"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("Ù"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("Q"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("H"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("P"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("B"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("J"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("D"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("G"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("C"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("M"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("Ô"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("Y"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("È"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("W"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("É"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("Z"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ê"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("F"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("Ë"),
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
                            action = KeyAction.CommitText("1"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("€"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("$"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("≤"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("2"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("`"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("^"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("´"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("\\"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("*"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("/"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("+"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("3"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("²"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("≈"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("³"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("≥"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("="),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("4"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("{"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("✓"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("✗"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("["),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("5"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("↔"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("↑"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("↕"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("→"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("_"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("↓"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("←"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("6"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("½"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("}"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("]"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("¾"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("@"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("¼"),
                        ),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("7"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("~"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("\""),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("°"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("\t"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("«"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("<"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("8"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("·"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("•"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("–"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("%"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("9"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("—"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("&"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("|"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText(">"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("»"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("#"),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("0"),
                            size = FontSizeVariant.LARGE,
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
        title = "english français messagease symbols",
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
