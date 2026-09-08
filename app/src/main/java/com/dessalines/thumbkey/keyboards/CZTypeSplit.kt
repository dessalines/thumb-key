@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.KeyboardCapslock
import androidx.compose.material.icons.outlined.KeyboardControlKey
import androidx.compose.material.icons.outlined.KeyboardOptionKey
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

// NOTE: relies on keyCModifier() being visible package-wide from
// ENMessagEaseSymbolsModifiers.kt (same package, no import needed).
//
// Design summary:
//  - LEFT main keys (n t l r d m): consonant-heavy, chosen + arranged by
//    running a constrained max-cut optimization over this user's own
//    Czech tweet-archive bigram frequencies (see extract_czech_freq.py /
//    optimize_split.py). Achieves ~81% of all bigram weight alternating
//    thumbs, vs ~34% for a naive vowel/consonant split.
//  - RIGHT main keys (e a o i s u): vowel-heavy, lighter letter-swipe load,
//    so carries diacritics, Ctrl/Alt toggles, and the programming symbol set.
//  - Digits 1-9,0 are longPress (no swipe slots used) in reading order
//    across the first 10 main keys.
//  - Ctrl (t.bottomLeft) / Alt (s.bottomRight) toggle into full CTRLED/
//    ALTED grids mirroring all 26 letters, matching the confirmed-working
//    pattern from ENMessagEaseSymbolsModifiers.kt. Same physical gesture
//    toggles back off.

val KB_CZ_TYPESPLIT_FULL_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("1"),
                    center = KeyC("n", size = LARGE),
                    topLeft = KeyC("ň"),
                    top = KeyC("č"),
                    right = KeyC("z"),
                    bottomLeft = KeyC("ž"),
                    bottomRight = KeyC("c"),
                    bottom = KeyC("v"),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("2"),
                    center = KeyC("t", size = LARGE),
                    bottomLeft = KeyC("ť"),
                    bottomRight = KeyC("w"),
                    bottom = KeyC("x"),
                    right = KeyC("q"),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardControlKey),
                            action = ToggleCtrlMode(true),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardOptionKey),
                            action = ToggleAltMode(true),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("3"),
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("é"),
                    top = KeyC("ě"),
                    topRight = KeyC(",", color = MUTED),
                    right = KeyC(".", color = MUTED),
                    bottomRight = KeyC("!", color = MUTED),
                    bottom = KeyC("?", color = MUTED),
                    bottomLeft = KeyC(":", color = MUTED),
                    left = KeyC(";", color = MUTED),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("4"),
                    center = KeyC("a", size = LARGE),
                    topLeft = KeyC("á"),
                    left = KeyC("-", color = MUTED),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom = KeyC(ToggleShiftMode(false), swipeReturnAction = ToggleCurrentWordCapitalization(false)),
                ),
            ),
            listOf(
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("5"),
                    center = KeyC("l", size = LARGE),
                    right = KeyC("h"),
                    bottomRight = KeyC("f"),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("6"),
                    center = KeyC("r", size = LARGE),
                    topLeft = KeyC("ř"),
                    bottomLeft = KeyC("p"),
                    bottomRight = KeyC("b"),
                    bottom = KeyC("g"),
                    top = KeyC("*", color = MUTED),
                    topRight = KeyC("=", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC(">", color = MUTED),
                ),
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("o", size = LARGE),
                    topLeft = KeyC("ó"),
                    top = KeyC("{", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC("\"", color = MUTED),
                    bottomRight = KeyC("'", color = MUTED),
                    bottom = KeyC("`", color = MUTED),
                    bottomLeft = KeyC("„", color = MUTED),
                    left = KeyC("“", color = MUTED),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("i", size = LARGE),
                    topLeft = KeyC("í"),
                    top = KeyC("+", color = MUTED),
                    bottomRight = KeyC("/", color = MUTED),
                    bottom = KeyC("%", color = MUTED),
                    bottomLeft = KeyC("^", color = MUTED),
                    left = KeyC("~", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("9"),
                    center = KeyC("d", size = LARGE),
                    topLeft = KeyC("ď"),
                    right = KeyC("k"),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("0"),
                    center = KeyC("m", size = LARGE),
                    bottomLeft = KeyC("j"),
                    topLeft = KeyC("(", color = MUTED),
                    topRight = KeyC(")", color = MUTED),
                    left = KeyC("[", color = MUTED),
                    right = KeyC("]", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("š"),
                    right = KeyC("y"),
                    bottomRight = KeyC("ý"),
                    top = KeyC("@", color = MUTED),
                    topRight = KeyC("#", color = MUTED),
                    bottom = KeyC("$", color = MUTED),
                    bottomLeft = KeyC("&", color = MUTED),
                    left = KeyC("_", color = MUTED),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("u", size = LARGE),
                    topLeft = KeyC("ú"),
                    top = KeyC("ů"),
                    topRight = KeyC("|", color = MUTED),
                    right = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("–", color = MUTED),
                ),
            ),
            listOf(
                EMOJI_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
val KB_CZ_TYPESPLIT_FULL_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("1"),
                    center = KeyC("N", size = LARGE),
                    topLeft = KeyC("Ň"),
                    top = KeyC("Č"),
                    right = KeyC("Z"),
                    bottomLeft = KeyC("Ž"),
                    bottomRight = KeyC("C"),
                    bottom = KeyC("V"),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("2"),
                    center = KeyC("T", size = LARGE),
                    bottomLeft = KeyC("Ť"),
                    bottomRight = KeyC("W"),
                    bottom = KeyC("X"),
                    right = KeyC("Q"),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardControlKey),
                            action = ToggleCtrlMode(true),
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardOptionKey),
                            action = ToggleAltMode(true),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("3"),
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("É"),
                    top = KeyC("Ě"),
                    topRight = KeyC(",", color = MUTED),
                    right = KeyC(".", color = MUTED),
                    bottomRight = KeyC("!", color = MUTED),
                    bottom = KeyC("?", color = MUTED),
                    bottomLeft = KeyC(":", color = MUTED),
                    left = KeyC(";", color = MUTED),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("4"),
                    center = KeyC("A", size = LARGE),
                    topLeft = KeyC("Á"),
                    left = KeyC("-", color = MUTED),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("5"),
                    center = KeyC("L", size = LARGE),
                    right = KeyC("H"),
                    bottomRight = KeyC("F"),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("6"),
                    center = KeyC("R", size = LARGE),
                    topLeft = KeyC("Ř"),
                    bottomLeft = KeyC("P"),
                    bottomRight = KeyC("B"),
                    bottom = KeyC("G"),
                    top = KeyC("*", color = MUTED),
                    topRight = KeyC("=", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC(">", color = MUTED),
                ),
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("O", size = LARGE),
                    topLeft = KeyC("Ó"),
                    top = KeyC("{", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC("a\"", color = MUTED),
                    bottomRight = KeyC("'", color = MUTED),
                    bottom = KeyC("`", color = MUTED),
                    bottomLeft = KeyC("„", color = MUTED),
                    left = KeyC("“", color = MUTED),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("I", size = LARGE),
                    topLeft = KeyC("Í"),
                    top = KeyC("+", color = MUTED),
                    bottomRight = KeyC("/", color = MUTED),
                    bottom = KeyC("%", color = MUTED),
                    bottomLeft = KeyC("^", color = MUTED),
                    left = KeyC("~", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("9"),
                    center = KeyC("D", size = LARGE),
                    topLeft = KeyC("Ď"),
                    right = KeyC("K"),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    longPress = CommitText("0"),
                    center = KeyC("M", size = LARGE),
                    bottomLeft = KeyC("J"),
                    topLeft = KeyC("(", color = MUTED),
                    topRight = KeyC(")", color = MUTED),
                    left = KeyC("[", color = MUTED),
                    right = KeyC("]", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("Š"),
                    right = KeyC("Y"),
                    bottomRight = KeyC("Ý"),
                    top = KeyC("@", color = MUTED),
                    topRight = KeyC("#", color = MUTED),
                    bottom = KeyC("$", color = MUTED),
                    bottomLeft = KeyC("&", color = MUTED),
                    left = KeyC("_", color = MUTED),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("U", size = LARGE),
                    topLeft = KeyC("Ú"),
                    top = KeyC("Ů"),
                    topRight = KeyC("|", color = MUTED),
                    right = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("–", color = MUTED),
                ),
            ),
            listOf(
                EMOJI_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
val KB_CZ_TYPESPLIT_FULL_CTRLED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_N, "n", size = LARGE),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_Z, "z"),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_C, "c"),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_V, "v"),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_T, "t", size = LARGE),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_W, "w"),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_X, "x"),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_Q, "q"),
                    topLeft = KeyC(action = ToggleCtrlMode(false), color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_E, "e", size = LARGE),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_A, "a", size = LARGE),
                ),
            ),
            listOf(
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_L, "l", size = LARGE),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_H, "h"),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_F, "f"),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_R, "r", size = LARGE),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_P, "p"),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_B, "b"),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_G, "g"),
                ),
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_O, "o", size = LARGE),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_I, "i", size = LARGE),
                ),
            ),
            listOf(
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_D, "d", size = LARGE),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_K, "k"),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_M, "m", size = LARGE),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_J, "j"),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_S, "s", size = LARGE),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_Y, "y"),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_U, "u", size = LARGE),
                ),
            ),
            listOf(
                EMOJI_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
val KB_CZ_TYPESPLIT_FULL_ALTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_N, "n", size = LARGE),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_Z, "z"),
                    bottomRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_C, "c"),
                    bottom = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_V, "v"),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_T, "t", size = LARGE),
                    bottomRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_W, "w"),
                    bottom = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_X, "x"),
                    right = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_Q, "q"),
                    topRight = KeyC(action = ToggleAltMode(false), color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_E, "e", size = LARGE),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_A, "a", size = LARGE),
                ),
            ),
            listOf(
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_L, "l", size = LARGE),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_H, "h"),
                    bottomRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_F, "f"),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_R, "r", size = LARGE),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_P, "p"),
                    bottomRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_B, "b"),
                    bottom = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_G, "g"),
                ),
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_O, "o", size = LARGE),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_I, "i", size = LARGE),
                ),
            ),
            listOf(
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_D, "d", size = LARGE),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_K, "k"),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_M, "m", size = LARGE),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_J, "j"),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_S, "s", size = LARGE),
                    right = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_Y, "y"),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_U, "u", size = LARGE),
                ),
            ),
            listOf(
                EMOJI_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
val KB_CZ_TYPESPLIT_FULL_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("/"),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("*"),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("-"),
                ),
                ABC_KEY_ITEM,
                KeyItemC(
                    center = KeyC("\u0301", displayText = "◌́", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("/"),
                    top = KeyC("*"),
                    topRight = KeyC("-"),
                    right = KeyC("+"),
                    bottomRight = KeyC("="),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("{"),
                    left = KeyC("("),
                    bottomLeft = KeyC("["),
                    bottomRight = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottomLeft = KeyC("$"),
                    bottom = KeyC("€"),
                    bottomRight = KeyC("#"),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("+"),
                    bottomRight = KeyC("'"),
                    bottomLeft = KeyC("|"),
                    bottom = KeyC("~"),
                ),
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("\u0308", displayText = "◌̈", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topRight = KeyC("}"),
                    right = KeyC(")"),
                    bottomRight = KeyC("]"),
                    bottomLeft = KeyC("\""),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("<"),
                    bottomLeft = KeyC("^"),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("`"),
                    bottomRight = KeyC("&"),
                    bottomLeft = KeyC("_"),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("."),
                    left = KeyC(","),
                    right = KeyC("!"),
                    top = KeyC("%"),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("\u0300", displayText = "◌̀", size = LARGE),
                    swipeType = EIGHT_WAY,
                    left = KeyC("?"),
                    topRight = KeyC(">"),
                    bottom = KeyC(":"),
                    top = KeyC(";"),
                    bottomRight = KeyC("\\"),
                ),
            ),
            listOf(
                EMOJI_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_CZ_TYPESPLIT_FULL: KeyboardDefinition =
    KeyboardDefinition(
        title = "czech type-split full (writing + code)",
        modes =
            KeyboardDefinitionModes(
                main = KB_CZ_TYPESPLIT_FULL_MAIN,
                shifted = KB_CZ_TYPESPLIT_FULL_SHIFTED,
                numeric = KB_CZ_TYPESPLIT_FULL_NUMERIC,
                ctrled = KB_CZ_TYPESPLIT_FULL_CTRLED,
                alted = KB_CZ_TYPESPLIT_FULL_ALTED,
            ),
        // NOTE: reference layouts pass English autoCapitalizers here
        // (::autoCapitalizeI, ::autoCapitalizeIApostrophe) - those are
        // English-specific ("i" -> "I") and don't apply to Czech, so
        // omitted. Verify KeyboardDefinitionSettings() has a valid
        // no-arg / default form at compile time.
        settings = KeyboardDefinitionSettings(),
    )
