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
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    top = KeyC("â"),
                    bottomRight = KeyC("v"),
                    bottom = KeyC("à"),
                ),
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottom = KeyC("l"),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    top = KeyC("î"),
                    bottom = KeyC("ï"),
                    bottomLeft = KeyC("x"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("u", size = FontSizeVariant.LARGE),
                    top = KeyC("û"),
                    topRight = KeyC("ç"),
                    right = KeyC("k"),
                    bottomRight = KeyC("ù"),
                    bottom = KeyC("'", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("q"),
                    top = KeyC("h"),
                    topRight = KeyC("p"),
                    right = KeyC("b"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("d"),
                    bottomLeft = KeyC("g"),
                    left = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    left = KeyC("m"),
                    bottom =
                        KeyC(
                            KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    top = KeyC("ô"),
                    topRight = KeyC("y"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("è"),
                    top = KeyC("w"),
                    topRight = KeyC("é"),
                    right = KeyC("z"),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    left = KeyC("ê"),
                ),
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("f"),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    left = KeyC("ë"),
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
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    top = KeyC("Â"),
                    bottomRight = KeyC("V"),
                    bottom = KeyC("À"),
                ),
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottom = KeyC("L"),
                ),
                KeyItemC(
                    center = KeyC("I", size = FontSizeVariant.LARGE),
                    top = KeyC("Î"),
                    bottom = KeyC("Ï"),
                    bottomLeft = KeyC("X"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("U", size = FontSizeVariant.LARGE),
                    top = KeyC("Û"),
                    topRight = KeyC("Ç"),
                    right = KeyC("K"),
                    bottomRight = KeyC("Ù"),
                    bottom = KeyC("'", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("Q"),
                    top = KeyC("H"),
                    topRight = KeyC("P"),
                    right = KeyC("B"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("D"),
                    bottomLeft = KeyC("G"),
                    left = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC("M"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    top = KeyC("Ô"),
                    topRight = KeyC("Y"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("È"),
                    top = KeyC("W"),
                    topRight = KeyC("É"),
                    right = KeyC("Z"),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                    left = KeyC("Ê"),
                ),
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("F"),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    left = KeyC("Ë"),
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
                    center = KeyC("1", size = FontSizeVariant.LARGE),
                    bottomRight = KeyC("€"),
                    bottom = KeyC("$"),
                    left = KeyC("≤"),
                ),
                KeyItemC(
                    center = KeyC("2", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("`"),
                    top = KeyC("^"),
                    topRight = KeyC("´"),
                    right = KeyC("!", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\\"),
                    bottom = KeyC("*"),
                    bottomLeft = KeyC("/"),
                    left = KeyC("+"),
                ),
                KeyItemC(
                    center = KeyC("3", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("²"),
                    top = KeyC("≈"),
                    topRight = KeyC("³"),
                    right = KeyC("≥"),
                    bottom = KeyC("="),
                    left = KeyC("?", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("{"),
                    topRight = KeyC("✓"),
                    bottomRight = KeyC("✗"),
                    bottom = KeyC("'", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("["),
                    left = KeyC("(", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("5", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("↔"),
                    top = KeyC("↑"),
                    topRight = KeyC("↕"),
                    right = KeyC("→"),
                    bottomRight = KeyC("_"),
                    bottom = KeyC("↓"),
                    left = KeyC("←"),
                ),
                KeyItemC(
                    center = KeyC("6", size = FontSizeVariant.LARGE),
                    top = KeyC("½"),
                    topRight = KeyC("}"),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]"),
                    bottom = KeyC("¾"),
                    bottomLeft = KeyC("@"),
                    left = KeyC("¼"),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("7", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("~"),
                    top = KeyC("\""),
                    topRight = KeyC("°"),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottomRight = KeyC("\t"),
                    bottomLeft = KeyC("«"),
                    left = KeyC("<"),
                ),
                KeyItemC(
                    center = KeyC("8", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("·"),
                    top = KeyC("•"),
                    topRight = KeyC("–"),
                    right = KeyC("%"),
                    bottomRight = KeyC(":", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC(",", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("9", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("—"),
                    top = KeyC("&"),
                    topRight = KeyC("|"),
                    right = KeyC(">"),
                    bottomRight = KeyC("»"),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    left = KeyC("#"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("0", size = FontSizeVariant.LARGE),
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
