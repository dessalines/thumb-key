@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val SELECT_LINE_WITH_CURSOR_KEYC =
    KeyC(
        action = SelectLineWithCursor,
        display = KeyDisplay.TextDisplay("<>"),
        color = MUTED,
    )

val DELETE_WORD_BEFORE_CURSOR_TEXT_KEYC =
    KeyC(
        action = DeleteWordBeforeCursor,
        display = KeyDisplay.TextDisplay("<|"),
        color = MUTED,
    )

fun specialActionKeyItemCustom(center: KeyC): KeyItemC =
    KeyItemC(
        backgroundColor = SURFACE_VARIANT,
        swipeType = EIGHT_WAY,
        center = center,
        topLeft = SELECT_LINE_WITH_CURSOR_KEYC,
        // topLeft = MOVE_KEYBOARD_CYCLE_RIGHT_KEYC,
        top = GOTO_SETTINGS_KEYC,
        bottom = SWITCH_IME_KEYC,
        bottomRight = SWITCH_IME_VOICE_KEYC,
        left = DELETE_WORD_BEFORE_CURSOR_TEXT_KEYC,
        right = SWITCH_LANGUAGE_KEYC,
    )

val EMOJI_KEY_ITEM_CUSTOM =
    specialActionKeyItemCustom(
        center = TOGGLE_EMOJI_MODE_TRUE_KEYC,
    )

// Move UNDO_KEYC to right instead of bottomLeft to avoid painful presses
fun textEditKeyItemCustom(center: KeyC): KeyItemC =
    KeyItemC(
        backgroundColor = SURFACE_VARIANT,
        swipeType = EIGHT_WAY,
        center = center,
        topLeft = SELECT_ALL_KEYC,
        top = COPY_KEYC,
        topRight = CUT_KEYC,
        right = UNDO_KEYC,
        bottom = PASTE_KEYC,
        bottomRight = REDO_KEYC,
    )

val ABC_KEY_ITEM_CUSTOM =
    textEditKeyItemCustom(
        center = TOGGLE_NUMERIC_MODE_FALSE_KEYC,
    )

val NUMERIC_KEY_ITEM_CUSTOM =
    textEditKeyItemCustom(
        center = TOGGLE_NUMERIC_MODE_TRUE_KEYC,
    )

val KB_FR_EN_FRAPPE_FLUIDE_V1_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    topLeft = KeyC("<", color = MUTED),
                    top = KeyC("[", color = MUTED),
                    topRight = KeyC("#", color = MUTED),
                    left = KeyC("^", color = MUTED),
                    right = KeyC("û", color = MUTED),
                    bottomLeft = KeyC("ll", color = MUTED),
                    bottom = KeyC("b"),
                    bottomRight = KeyC("qu"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    topLeft = KeyC("ff", color = MUTED),
                    top = KeyC("\u0308", displayText = "¨", color = MUTED),
                    topRight = KeyC("`", color = MUTED),
                    left = KeyC("mm", size = SMALLEST, color = MUTED),
                    right = KeyC("ù", color = MUTED),
                    bottomLeft = KeyC("d"),
                    bottom = KeyC("m"),
                    bottomRight = KeyC("f"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    topLeft = KeyC("@", color = MUTED),
                    top = KeyC("]", color = MUTED),
                    topRight = KeyC(">", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    right = KeyC("gh", color = MUTED),
                    bottomLeft = KeyC("c"),
                    bottom = KeyC("î", color = MUTED),
                    bottomRight = KeyC("ô", color = MUTED),
                ),
                EMOJI_KEY_ITEM_CUSTOM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("œ", color = MUTED),
                    top = KeyC("q", color = MUTED),
                    topRight = KeyC("ê", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    right = KeyC("é", color = MUTED),
                    bottomLeft = KeyC("\u202F", displayText = "⍽", size = SMALLEST, color = MUTED),
                    bottom = KeyC("z"),
                    bottomRight = KeyC("è", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    topLeft = KeyC("k"),
                    top = KeyC("o"),
                    topRight = KeyC("â", color = MUTED),
                    left = KeyC("v"),
                    right = KeyC("y"),
                    bottomLeft = KeyC("g"),
                    bottom = KeyC("x"),
                    bottomRight = KeyC("à", color = MUTED),
                ),
                KeyItemC(
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    center = KeyC("t", size = LARGE),
                    topLeft = KeyC("ç", color = MUTED),
                    topRight = KeyC("/", color = MUTED),
                    left = KeyC("h"),
                    right = KeyC(")", color = MUTED),
                    bottomLeft = KeyC("p"),
                    bottomRight = KeyC("\u00A0", displayText = "⍽", color = MUTED),
                ),
                NUMERIC_KEY_ITEM_CUSTOM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    topLeft = KeyC("·", color = MUTED),
                    top = KeyC("j"),
                    topRight = KeyC("ch", color = MUTED),
                    left = KeyC("“", color = MUTED),
                    right = KeyC("=", color = MUTED),
                    bottomLeft = KeyC("« ", displayText = "«", color = MUTED),
                    bottom = KeyC("!", color = MUTED),
                    bottomRight = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("pp", size = SMALLEST, color = MUTED),
                    top = KeyC("oo", size = SMALLEST, color = MUTED),
                    topRight = KeyC("-", color = MUTED),
                    left = KeyC("*", color = MUTED),
                    right = KeyC(":", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC(";", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    topLeft = KeyC("’", color = MUTED),
                    top = KeyC("w"),
                    topRight = KeyC("\"", color = MUTED),
                    left = KeyC("'", color = MUTED),
                    right = KeyC("”", color = MUTED),
                    bottomLeft = KeyC("…", color = MUTED),
                    bottom = KeyC("_", color = MUTED),
                    bottomRight = KeyC(" »", displayText = "»", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FR_EN_FRAPPE_FLUIDE_V1_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    topLeft = KeyC("<", color = MUTED),
                    top = KeyC("[", color = MUTED),
                    topRight = KeyC("#", color = MUTED),
                    left = KeyC("^", color = MUTED),
                    right = KeyC("Û", color = MUTED),
                    bottomLeft = KeyC("LL", size = SMALLEST, color = MUTED),
                    bottom = KeyC("B"),
                    bottomRight = KeyC("Qu"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    topLeft = KeyC("FF", color = MUTED),
                    top = KeyC("\u0308", displayText = "¨", color = MUTED),
                    topRight = KeyC("`", color = MUTED),
                    left = KeyC("MM", size = SMALLEST, color = MUTED),
                    right = KeyC("Ù", color = MUTED),
                    bottomLeft = KeyC("D"),
                    bottom = KeyC("M"),
                    bottomRight = KeyC("F"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    topLeft = KeyC("@", color = MUTED),
                    top = KeyC("]", color = MUTED),
                    topRight = KeyC(">", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    right = KeyC("GH", color = MUTED),
                    bottomLeft = KeyC("C"),
                    bottom = KeyC("Î", color = MUTED),
                    bottomRight = KeyC("Ô", color = MUTED),
                ),
                EMOJI_KEY_ITEM_CUSTOM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("Œ", color = MUTED),
                    top = KeyC("Q", color = MUTED),
                    topRight = KeyC("Ê", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    right = KeyC("É", color = MUTED),
                    bottomLeft = KeyC("\u202F", displayText = "⍽", size = SMALLEST, color = MUTED),
                    bottom = KeyC("Z"),
                    bottomRight = KeyC("È", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    topLeft = KeyC("K"),
                    top = KeyC("O"),
                    topRight = KeyC("Â", color = MUTED),
                    left = KeyC("V"),
                    right = KeyC("Y"),
                    bottomLeft = KeyC("G"),
                    bottom = KeyC("X"),
                    bottomRight = KeyC("À", color = MUTED),
                ),
                KeyItemC(
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = PRIMARY,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = PRIMARY,
                        ),
                    center = KeyC("T", size = LARGE),
                    topLeft = KeyC("Ç", color = MUTED),
                    topRight = KeyC("/", color = MUTED),
                    left = KeyC("H"),
                    right = KeyC(")", color = MUTED),
                    bottomLeft = KeyC("P"),
                    bottomRight = KeyC("\u00A0", displayText = "⍽", color = MUTED),
                ),
                NUMERIC_KEY_ITEM_CUSTOM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    topLeft = KeyC("·", color = MUTED),
                    top = KeyC("J"),
                    topRight = KeyC("Ch", color = MUTED),
                    left = KeyC("“", color = MUTED),
                    right = KeyC("=", color = MUTED),
                    bottomLeft = KeyC("« ", displayText = "«", color = MUTED),
                    bottom = KeyC("!", color = MUTED),
                    bottomRight = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("PP", size = SMALLEST, color = MUTED),
                    top = KeyC("OO", size = SMALLEST, color = MUTED),
                    topRight = KeyC("-", color = MUTED),
                    left = KeyC("*", color = MUTED),
                    right = KeyC(":", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC(";", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    topLeft = KeyC("’", color = MUTED),
                    top = KeyC("W"),
                    topRight = KeyC("\"", color = MUTED),
                    left = KeyC("'", color = MUTED),
                    right = KeyC("”", color = MUTED),
                    bottomLeft = KeyC("…", color = MUTED),
                    bottom = KeyC("_", color = MUTED),
                    bottomRight = KeyC(" »", displayText = "»", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FRENCH_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val FRENCH_FLUID_NUMERIC_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    topLeft = KeyC("<"),
                    top = KeyC("["),
                    topRight = KeyC("#"),
                    left = KeyC("^"),
                    right = KeyC("±"),
                    bottomLeft = KeyC("≤"),
                    bottom = KeyC("¬"),
                    bottomRight = KeyC("≥"),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    top = KeyC("≈"),
                    topRight = KeyC("`"),
                    left = KeyC("×"),
                    bottomLeft = KeyC("÷"),
                    bottom = KeyC("m"),
                    bottomRight = KeyC("≠"),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    topLeft = KeyC("@"),
                    top = KeyC("]"),
                    topRight = KeyC(">"),
                    left = KeyC("+"),
                    right = KeyC("|"),
                    bottomLeft = KeyC("~"),
                    bottom = KeyC("&"),
                ),
                EMOJI_KEY_ITEM_CUSTOM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    topLeft = KeyC("\\"),
                    left = KeyC("("),
                    bottomLeft = KeyC("\u202F", displayText = "⍽", size = SMALLEST),
                    bottom = KeyC("{"),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    topRight = KeyC("¥"),
                    left = KeyC("‰"),
                    right = KeyC("$"),
                    bottomLeft = KeyC("%"),
                    bottom = KeyC("€"),
                    bottomRight = KeyC("£"),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    topRight = KeyC("/"),
                    left = KeyC("h"),
                    right = KeyC(")"),
                    bottom = KeyC("}"),
                    bottomRight = KeyC("\u00A0", displayText = "⍽"),
                ),
                ABC_KEY_ITEM_CUSTOM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    topLeft = KeyC("·"),
                    top = KeyC("„"),
                    left = KeyC("“"),
                    right = KeyC("="),
                    bottomLeft = KeyC("« ", displayText = "«"),
                    bottom = KeyC("!"),
                    bottomRight = KeyC("?"),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    top = KeyC("°"),
                    topRight = KeyC("-"),
                    left = KeyC("*"),
                    right = KeyC(":"),
                    bottomLeft = KeyC(","),
                    bottom = KeyC("."),
                    bottomRight = KeyC(";"),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    topLeft = KeyC("’"),
                    topRight = KeyC("\""),
                    left = KeyC("'"),
                    right = KeyC("”"),
                    bottomLeft = KeyC("…"),
                    bottom = KeyC("_"),
                    bottomRight = KeyC(" »", displayText = "»"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                ),
                SPACEBAR_FRENCH_KEY_ITEM.copy(widthMultiplier = 2),
                RETURN_KEY_ITEM,
            ),
        ),
    )

fun reverseKeyItemC(item: KeyItemC): KeyItemC {
    val revItem =
        item.copy(
            left = item.right,
            right = item.left,
            topLeft = item.topRight,
            topRight = item.topLeft,
            bottomLeft = item.bottomRight,
            bottomRight = item.bottomLeft,
        )
    return revItem
}

fun reverseRow(l: List<KeyItemC>): List<KeyItemC> {
    val rev = mutableListOf<KeyItemC>()
    for (item in l) {
        val revItem = reverseKeyItemC(item)
        rev.add(0, revItem)
    }
    return rev
}

fun reverseRowExceptControl(l: List<KeyItemC>): List<KeyItemC> {
    val rev = mutableListOf<KeyItemC>()
    for (item in l) {
        if (item.backgroundColor == SURFACE_VARIANT) {
            rev.add(item)
        } else {
            val revItem = reverseKeyItemC(item)
            rev.add(0, revItem)
        }
    }
    return rev
}

fun reverseRowOnlyControl(l: List<KeyItemC>): List<KeyItemC> {
    val grid = mutableListOf<KeyItemC>()
    for (item in l) {
        if (item.backgroundColor == SURFACE_VARIANT) {
            val revItem = reverseKeyItemC(item)
            grid.add(0, revItem)
        } else {
            grid.add(item)
        }
    }
    return grid
}

fun makeControlLeftSide(kb: KeyboardC): KeyboardC {
    val kbArrNew = mutableListOf<List<KeyItemC>>()
    for (row in kb.arr) {
        kbArrNew.add(reverseRowOnlyControl(row))
    }
    return KeyboardC(kbArrNew)
}

fun makeLeftHanded(kb: KeyboardC): KeyboardC {
    val kbArrNew = mutableListOf<List<KeyItemC>>()
    for (row in kb.arr) {
        kbArrNew.add(reverseRowExceptControl(row))
    }
    return KeyboardC(kbArrNew)
}

fun makeLeftHandedControlLeftSide(kb: KeyboardC): KeyboardC {
    val kbArrNew = mutableListOf<List<KeyItemC>>()
    for (row in kb.arr) {
        kbArrNew.add(reverseRow(row))
    }
    return KeyboardC(kbArrNew)
}

val KB_FR_EN_FRAPPE_FLUIDE_V1: KeyboardDefinition =
    KeyboardDefinition(
        title = "français frappefluide (fr+en) v1",
        modes =
            KeyboardDefinitionModes(
                main = KB_FR_EN_FRAPPE_FLUIDE_V1_MAIN,
                shifted = KB_FR_EN_FRAPPE_FLUIDE_V1_SHIFTED,
                numeric = FRENCH_FLUID_NUMERIC_KEYBOARD,
            ),
    )

val KB_FR_EN_FRAPPE_FLUIDE_V1_CONTROL_LEFT_SIDE: KeyboardDefinition =
    KeyboardDefinition(
        title = "français frappefluide (fr+en) v1 (outils à gauche)",
        modes =
            KeyboardDefinitionModes(
                main = makeControlLeftSide(KB_FR_EN_FRAPPE_FLUIDE_V1_MAIN),
                shifted = makeControlLeftSide(KB_FR_EN_FRAPPE_FLUIDE_V1_SHIFTED),
                numeric = makeControlLeftSide(FRENCH_FLUID_NUMERIC_KEYBOARD),
            ),
    )

val KB_FR_EN_FRAPPE_FLUIDE_V1_LEFT_HANDED: KeyboardDefinition =
    KeyboardDefinition(
        title = "français frappefluide (fr+en) v1 (gauchère)",
        modes =
            KeyboardDefinitionModes(
                main = makeLeftHanded(KB_FR_EN_FRAPPE_FLUIDE_V1_MAIN),
                shifted = makeLeftHanded(KB_FR_EN_FRAPPE_FLUIDE_V1_SHIFTED),
                numeric = makeLeftHanded(FRENCH_FLUID_NUMERIC_KEYBOARD),
            ),
    )

val KB_FR_EN_FRAPPE_FLUIDE_V1_LEFT_HANDED_CONTROL_LEFT_SIDE: KeyboardDefinition =
    KeyboardDefinition(
        title = "français frappefluide (fr+en) v1 (gauchère, outils à gauche)",
        modes =
            KeyboardDefinitionModes(
                main = makeLeftHandedControlLeftSide(KB_FR_EN_FRAPPE_FLUIDE_V1_MAIN),
                shifted = makeLeftHandedControlLeftSide(KB_FR_EN_FRAPPE_FLUIDE_V1_SHIFTED),
                numeric = makeLeftHandedControlLeftSide(FRENCH_FLUID_NUMERIC_KEYBOARD),
            ),
    )
