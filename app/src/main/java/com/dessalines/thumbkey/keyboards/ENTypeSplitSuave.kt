@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

/**
 * Internal helper to define a key's content once and generate layers from it.
 */
private data class SuaveKeyDef(
    val center: String,
    val top: String? = null,
    val topLeft: String? = null,
    val topRight: String? = null,
    val left: String? = null,
    val right: String? = null,
    val bottom: String? = null,
    val bottomLeft: String? = null,
    val bottomRight: String? = null,
    val swipeType: SwipeNWay = EIGHT_WAY,
    val size: FontSizeVariant = LARGE,
    val isStatic: Boolean = false, // If true, don't change case or apply Ctrl
    val keyCode: Int? = null // Optional explicit keycode for shortcuts
)

private enum class SuaveMode { MAIN, SHIFTED, CTRLED, ALTED }

// Special mappings for shifted mode
private val SHIFT_MAPPINGS = mapOf(
    "ö" to "Ö",
    "ä" to "Ä",
    "ü" to "Ü",
    "ß" to "SS",
    "sch" to "Sch",
    "ch" to "Ch"
)

// Key Definitions
private val GRID_0_0 = SuaveKeyDef("o", top = "1", right = "2", bottom = "ö", left = "", isStatic = true)
private val GRID_0_1 = SuaveKeyDef("r", top = "4", right = "5", bottom = "w", bottomLeft = "?", bottomRight = "," , left = "3")
private val GRID_0_3 = SuaveKeyDef("t", top = "7", right = "8", bottom = "p", bottomLeft = ".", bottomRight = "!", left = "6")
private val GRID_0_4 = SuaveKeyDef("h", top = "0", bottom = "q", left = "9")

private val GRID_1_0 = SuaveKeyDef("a", right = "ä", bottom = "+")
private val GRID_1_1 = SuaveKeyDef("e", top = "v", topRight = "€", right = "c", bottom = "f", bottomRight = "ch", left = "z")
private val GRID_1_3 = SuaveKeyDef("n", top = "b", right = "k", bottom = "m", left = "g")
private val GRID_1_4 = SuaveKeyDef("s", top = "~", topLeft = "$", bottom = "|", bottomLeft = "sch", left = "ß")

private val GRID_2_0 = SuaveKeyDef("u", top = "ü", topRight = "(", right = "[", bottomRight = "{")
private val GRID_2_1 = SuaveKeyDef("i", topLeft = "<", right = "x", bottom = "#", bottomLeft = "@", bottomRight = "$")
private val GRID_2_3 = SuaveKeyDef("d", top = "j", topRight = ">", bottom = "=", bottomLeft = "*", bottomRight = "/", left = "y")
private val GRID_2_4 = SuaveKeyDef("l", top = "julian.konrath@gmail.com", topLeft = ")", bottom = "\\", bottomLeft = "}", left = "]", isStatic = true)

val SUAVE_BACKSPACE = KeyItemC(
    center = KeyC(display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardBackspace), action = DeleteKeyAction, size = LARGE, color = SECONDARY),
    swipeType = SwipeNWay.FOUR_WAY_CROSS,
    slideType = SlideType.DELETE,
    top = KeyC("'", color = MUTED),
    bottom = KeyC("\"", color = MUTED),
    backgroundColor = SURFACE_VARIANT,
    longPress = DeleteWordBeforeCursor,
)

val SUAVE_SPACE = KeyItemC(
    center = KeyC(" "),
    swipeType = FOUR_WAY_CROSS,
    slideType = SlideType.MOVE_CURSOR,
    left = KeyC(display = KeyDisplay.TextDisplay("←"), action = SendEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_LEFT)), color = MUTED),
    right = KeyC(display = KeyDisplay.TextDisplay("→"), action = SendEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_RIGHT)), color = MUTED),
    top = KeyC(display = KeyDisplay.TextDisplay("↑"), action = SendEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_UP)), color = MUTED),
    bottom = KeyC(display = KeyDisplay.TextDisplay("↓"), action = SendEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_DOWN)), color = MUTED),
    nextTapActions = listOf(ReplaceLastText(", ", trimCount = 1), ReplaceLastText(". "), ReplaceLastText("? "), ReplaceLastText("! "), ReplaceLastText(": "), ReplaceLastText("; ")),
    backgroundColor = SURFACE_VARIANT,
    widthMultiplier = 1,
)

val SUAVE_RETURN = KeyItemC(
    center = KeyC(display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn), action = IMECompleteAction, size = LARGE, color = SECONDARY),
    swipeType = FOUR_WAY_CROSS,
    left = KeyC(display = null, action = CommitText("\n")),
    top = KeyC(display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab), action = CommitText("\t"), color = SECONDARY),
    backgroundColor = SURFACE_VARIANT,
    longPress = CommitText("\n"),
    widthMultiplier = 2
)

val SUAVE_MODIFIER_KEY = KeyItemC(
    center = KeyC(display = KeyDisplay.TextDisplay("Ctrl"), action = ToggleCtrlMode(true), color = SECONDARY),
    right = KeyC(display = KeyDisplay.TextDisplay("Alt"), action = ToggleAltMode(true), color = MUTED),
    top = KeyC(display = KeyDisplay.TextDisplay("ESC"), action = SendEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ESCAPE)), color = MUTED),
    swipeType = FOUR_WAY_CROSS,
    backgroundColor = SURFACE_VARIANT,
)

val SUAVE_MODIFIER_KEY_CTRLED = KeyItemC(
    center = KeyC(display = KeyDisplay.TextDisplay("Ctrl"), action = ToggleCtrlMode(false), color = PRIMARY),
    right = KeyC(display = KeyDisplay.TextDisplay("Alt"), action = ToggleAltMode(true), color = MUTED),
    top = KeyC(display = KeyDisplay.TextDisplay("ESC"), action = SendEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ESCAPE)), color = MUTED),
    swipeType = FOUR_WAY_CROSS,
    backgroundColor = SURFACE_VARIANT,
)

val SUAVE_MODIFIER_KEY_ALTED = KeyItemC(
    center = KeyC(display = KeyDisplay.TextDisplay("Ctrl"), action = ToggleCtrlMode(true), color = MUTED),
    right = KeyC(display = KeyDisplay.TextDisplay("Alt"), action = ToggleAltMode(false), color = PRIMARY),
    top = KeyC(display = KeyDisplay.TextDisplay("ESC"), action = SendEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ESCAPE)), color = MUTED),
    swipeType = FOUR_WAY_CROSS,
    backgroundColor = SURFACE_VARIANT,
)

private val SHIFT_KEY_MAIN = KeyItemC(
    center = KeyC(display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp), action = ToggleShiftMode(true), size = LARGE, color = SECONDARY),
    longPress = ToggleCapsLock,
    swipeType = EIGHT_WAY,
    top = KeyC("-", color = MUTED),
    left = KeyC("—", color = MUTED),
    topLeft = KeyC(";", color = MUTED),
    topRight = KeyC(":", color = MUTED),
    right = KeyC("_", color = MUTED),
    bottom = KeyC("^", color = MUTED),
    bottomLeft = KeyC("%", color = MUTED),
    bottomRight = KeyC("&", color = MUTED),
    backgroundColor = SURFACE_VARIANT,
)

private val SHIFT_KEY_SHIFTED = KeyItemC(
    center = KeyC(display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardArrowUp), capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock), action = ToggleShiftMode(false), size = LARGE, color = SECONDARY),
    longPress = ToggleCapsLock,
    swipeType = EIGHT_WAY,
    top = KeyC("-", color = MUTED),
    topLeft = KeyC(";", color = MUTED),
    topRight = KeyC(":", color = MUTED),
    right = KeyC("_", color = MUTED),
    bottom = KeyC("^", color = MUTED),
    bottomLeft = KeyC("%", color = MUTED),
    bottomRight = KeyC("&", color = MUTED),
    backgroundColor = SURFACE_VARIANT,
)

private val SUAVE_GRID_TEMPLATE = listOf(
    listOf(GRID_0_0, GRID_0_1, SUAVE_BACKSPACE, GRID_0_3, GRID_0_4),
    listOf(GRID_1_0, GRID_1_1, SUAVE_SPACE, GRID_1_3, GRID_1_4),
    listOf(GRID_2_0, GRID_2_1, SHIFT_KEY_MAIN, GRID_2_3, GRID_2_4)
)

private val SUAVE_GRID_TEMPLATE_SHIFTED = listOf(
    listOf(GRID_0_0, GRID_0_1, SUAVE_BACKSPACE, GRID_0_3, GRID_0_4),
    listOf(GRID_1_0, GRID_1_1, SUAVE_SPACE, GRID_1_3, GRID_1_4),
    listOf(GRID_2_0, GRID_2_1, SHIFT_KEY_SHIFTED, GRID_2_3, GRID_2_4)
)


private fun getKeyCode(char: Char): Int = when (char.lowercaseChar()) {
    'a' -> KeyEvent.KEYCODE_A
    'b' -> KeyEvent.KEYCODE_B
    'c' -> KeyEvent.KEYCODE_C
    'd' -> KeyEvent.KEYCODE_D
    'e' -> KeyEvent.KEYCODE_E
    'f' -> KeyEvent.KEYCODE_F
    'g' -> KeyEvent.KEYCODE_G
    'h' -> KeyEvent.KEYCODE_H
    'i' -> KeyEvent.KEYCODE_I
    'j' -> KeyEvent.KEYCODE_J
    'k' -> KeyEvent.KEYCODE_K
    'l' -> KeyEvent.KEYCODE_L
    'm' -> KeyEvent.KEYCODE_M
    'n' -> KeyEvent.KEYCODE_N
    'o' -> KeyEvent.KEYCODE_O
    'p' -> KeyEvent.KEYCODE_P
    'q' -> KeyEvent.KEYCODE_Q
    'r' -> KeyEvent.KEYCODE_R
    's' -> KeyEvent.KEYCODE_S
    't' -> KeyEvent.KEYCODE_T
    'u' -> KeyEvent.KEYCODE_U
    'v' -> KeyEvent.KEYCODE_V
    'w' -> KeyEvent.KEYCODE_W
    'x' -> KeyEvent.KEYCODE_X
    'y' -> KeyEvent.KEYCODE_Y
    'z' -> KeyEvent.KEYCODE_Z
    '1' -> KeyEvent.KEYCODE_1
    '2' -> KeyEvent.KEYCODE_2
    '3' -> KeyEvent.KEYCODE_3
    '4' -> KeyEvent.KEYCODE_4
    '5' -> KeyEvent.KEYCODE_5
    '6' -> KeyEvent.KEYCODE_6
    '7' -> KeyEvent.KEYCODE_7
    '8' -> KeyEvent.KEYCODE_8
    '9' -> KeyEvent.KEYCODE_9
    '0' -> KeyEvent.KEYCODE_0
    else -> KeyEvent.KEYCODE_UNKNOWN
}

private fun generateSuaveLayout(mode: SuaveMode, grid: List<List<Any>>): KeyboardC {
    val result = grid.map { row ->
        row.map { item ->
            when (item) {
                is KeyItemC -> item
                is SuaveKeyDef -> {
                    val backgroundColor = if (mode == SuaveMode.CTRLED || mode == SuaveMode.ALTED) SURFACE_VARIANT else SURFACE

                    fun process(text: String?, isCenter: Boolean = false): KeyC? {
                        if (text == null) return null
                        if (item.isStatic && !isCenter) return KeyC(text, color = MUTED)

                        val processedText = when (mode) {
                            SuaveMode.SHIFTED -> {
                                SHIFT_MAPPINGS[text] ?: if (text.length == 1) text.uppercase() else text
                            }
                            else -> text
                        }

                        if ((mode == SuaveMode.CTRLED || mode == SuaveMode.ALTED) && text.length == 1) {
                            val code = getKeyCode(text[0])
                            if (code != KeyEvent.KEYCODE_UNKNOWN) {
                                val flag = if (mode == SuaveMode.CTRLED) KeyEvent.META_CTRL_ON else KeyEvent.META_ALT_ON
                                return keyCModifier(flag, code, processedText, size = if (isCenter) item.size else SMALL)
                            }
                        }

                        return if ((mode == SuaveMode.CTRLED || mode == SuaveMode.ALTED) && !isCenter) {
                            KeyC(processedText, color = MUTED)
                        } else {
                            KeyC(processedText, size = if (isCenter) item.size else SMALL, color = if (isCenter) PRIMARY else MUTED)
                        }
                    }

                    KeyItemC(
                        center = process(item.center, true)!!,
                        top = process(item.top),
                        topLeft = process(item.topLeft),
                        topRight = process(item.topRight),
                        left = process(item.left),
                        right = process(item.right),
                        bottom = process(item.bottom),
                        bottomLeft = process(item.bottomLeft),
                        bottomRight = process(item.bottomRight),
                        swipeType = item.swipeType,
                        backgroundColor = backgroundColor
                    )
                }
                else -> throw IllegalArgumentException("Unknown item type")
            }
        }
    }
    return KeyboardC(result)
}


val KB_EN_TYPESPLIT_SUAVE_MAIN = generateSuaveLayout(SuaveMode.MAIN, SUAVE_GRID_TEMPLATE + listOf(listOf(SUAVE_MODIFIER_KEY, EMOJI_KEY_ITEM, NUMERIC_KEY_ITEM, SUAVE_RETURN)))
val KB_EN_TYPESPLIT_SUAVE_SHIFTED = generateSuaveLayout(SuaveMode.SHIFTED, SUAVE_GRID_TEMPLATE_SHIFTED + listOf(listOf(SUAVE_MODIFIER_KEY, EMOJI_KEY_ITEM, NUMERIC_KEY_ITEM, SUAVE_RETURN)))
val KB_EN_TYPESPLIT_SUAVE_CTRLED = generateSuaveLayout(SuaveMode.CTRLED, SUAVE_GRID_TEMPLATE + listOf(listOf(SUAVE_MODIFIER_KEY_CTRLED, EMOJI_KEY_ITEM, NUMERIC_KEY_ITEM, SUAVE_RETURN)))
val KB_EN_TYPESPLIT_SUAVE_ALTED = generateSuaveLayout(SuaveMode.ALTED, SUAVE_GRID_TEMPLATE + listOf(listOf(SUAVE_MODIFIER_KEY_ALTED, EMOJI_KEY_ITEM, NUMERIC_KEY_ITEM, SUAVE_RETURN)))

val KB_EN_TYPESPLIT_SUAVE_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u00B9", displayText = "¹", color = MUTED),
                    bottom = KeyC("\u2081", displayText = "₁", color = MUTED),
                    right = KeyC("\u0301", displayText = "◌́", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u00B2", displayText = "²", color = MUTED),
                    bottom = KeyC("\u2082", displayText = "₂", color = MUTED),
                    left = KeyC("\u0302", displayText = "◌̂", color = MUTED),
                    right = KeyC("\u030C", displayText = "◌̌", color = MUTED),
                ),
                SUAVE_BACKSPACE,
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u00B3", displayText = "³", color = MUTED),
                    bottom = KeyC("\u2083", displayText = "₃", color = MUTED),
                    left = KeyC("\u0303", displayText = "◌̃", color = MUTED),
                    right = KeyC("\u0327", displayText = "◌̧", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u2074", displayText = "⁴", color = MUTED),
                    bottom = KeyC("\u2084", displayText = "₄", color = MUTED),
                    left = KeyC("\u0307", displayText = "◌̇", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u2075", displayText = "⁵", color = MUTED),
                    bottom = KeyC("\u2085", displayText = "₅", color = MUTED),
                    right = KeyC("\u0300", displayText = "◌̀", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("\u2076", displayText = "⁶", color = MUTED),
                    topRight = KeyC("€", color = MUTED),
                    bottom = KeyC("\u2086", displayText = "₆", color = MUTED),
                    left = KeyC("\u0304", displayText = "◌̄", color = MUTED),
                    right = KeyC("\u0336", displayText = "◌̶", color = MUTED),
                ),
                SUAVE_SPACE,
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u2077", displayText = "⁷", color = MUTED),
                    bottom = KeyC("\u2087", displayText = "₇", color = MUTED),
                    left = KeyC("\u0308", displayText = "◌̈", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("\u2078", displayText = "⁸", color = MUTED),
                    topLeft = KeyC("$", color = MUTED),
                    bottom = KeyC("\u2088", displayText = "₈", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("\u2079", displayText = "⁹", color = MUTED),
                    right = KeyC("[", color = MUTED),
                    topRight = KeyC("(", color = MUTED),
                    bottom = KeyC("\u2089", displayText = "₉", color = MUTED),
                    bottomRight = KeyC("{", color = MUTED),
                    ),
                KeyItemC(
                    center = KeyC(",", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC(";"),
                    topLeft = KeyC("<", color = MUTED),
                    bottom = KeyC("#", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                    bottomRight = KeyC("$", color = MUTED)
                ),
                KeyItemC(
                    center = KeyC("+", color = MUTED),
                    swipeType = EIGHT_WAY,
                    top = KeyC("-", color = MUTED),
                    topLeft = KeyC(";", color = MUTED),
                    topRight = KeyC(":", color = MUTED),
                    right = KeyC("_", color = MUTED),
                    bottom = KeyC("^", color = MUTED),
                    bottomLeft = KeyC("%", color = MUTED),
                    bottomRight = KeyC("&", color = MUTED),
                    backgroundColor = SURFACE_VARIANT,
                ),
                KeyItemC(
                    center = KeyC(".", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC(":"),
                    topRight = KeyC(">", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    bottomRight = KeyC("/", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("\u2070", displayText = "⁰", color = MUTED),
                    topLeft = KeyC(")", color = MUTED),
                    left = KeyC("]", color = MUTED),
                    bottom = KeyC("\u2080", displayText = "₀", color = MUTED),
                    bottomLeft = KeyC("}", color = MUTED),
                ),
            ),
            listOf(
                SUAVE_MODIFIER_KEY,
                EMOJI_KEY_ITEM,
                ABC_KEY_ITEM,
                SUAVE_RETURN,
            )
        ),
    )


val KB_EN_TYPESPLIT_SUAVE: KeyboardDefinition =
    KeyboardDefinition(
        title = "english type-split suave",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_TYPESPLIT_SUAVE_MAIN,
                shifted = KB_EN_TYPESPLIT_SUAVE_SHIFTED,
                numeric = KB_EN_TYPESPLIT_SUAVE_NUMERIC,
                ctrled = KB_EN_TYPESPLIT_SUAVE_CTRLED,
                alted = KB_EN_TYPESPLIT_SUAVE_ALTED
            ),
    )
