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
 * INTERNAL CONFIGURATION
 */

private enum class SuaveMode { MAIN, SHIFTED, CTRLED, ALTED, EMOJI }

// Special mappings for shifted mode
private val SHIFT_MAPPINGS =
    mapOf(
        "ö" to "Ö",
        "ä" to "Ä",
        "ü" to "Ü",
        "ß" to "SS",
        "sch" to "Sch",
        "ch" to "Ch",
    )

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
    val w: Int = 1,
    val bg: ColorVariant? = null,
    val slide: SlideType = SlideType.NONE,
)

// Key Definitions
private val GRID_0_0 = SuaveKeyDef("o", top = "1", right = "2", bottom = "ö", left = "")
private val GRID_0_1 = SuaveKeyDef("r", top = "4", right = "5", bottom = "w", bottomLeft = "?", bottomRight = ",", left = "3")
private val GRID_0_2 =
    SuaveKeyDef(
        center = "backspace",
        top = "'",
        bottom = "\"",
        bg = SURFACE_VARIANT,
        slide = SlideType.DELETE,
        swipeType = FOUR_WAY_CROSS,
    )
private val GRID_0_3 = SuaveKeyDef("t", top = "7", right = "8", bottom = "p", bottomLeft = ".", bottomRight = "!", left = "6")
private val GRID_0_4 = SuaveKeyDef("h", top = "0", bottom = "q", left = "9")

private val GRID_1_0 = SuaveKeyDef("a", right = "ä", bottom = "+")
private val GRID_1_1 = SuaveKeyDef("e", top = "v", topRight = "€", right = "c", bottom = "f", bottomRight = "ch", left = "z")
private val GRID_1_2 =
    SuaveKeyDef(
        center = " ",
        top = "up",
        bottom = "down",
        left = "left",
        right = "right",
        bg = SURFACE_VARIANT,
        swipeType = FOUR_WAY_CROSS,
        slide = SlideType.MOVE_CURSOR,
    )
private val GRID_1_3 = SuaveKeyDef("n", top = "b", right = "k", bottom = "m", left = "g")
private val GRID_1_4 = SuaveKeyDef("s", top = "~", topLeft = "$", bottom = "|", bottomLeft = "sch", left = "ß")

private val GRID_2_0 = SuaveKeyDef("u", top = "ü", topRight = "(", right = "[", bottomRight = "{")
private val GRID_2_1 = SuaveKeyDef("i", topLeft = "<", right = "x", bottom = "#", bottomLeft = "@", bottomRight = "$")
private val GRID_2_2 =
    SuaveKeyDef(
        center = "shift",
        top = "-",
        left = "—",
        topLeft = ";",
        topRight = ":",
        right = "_",
        bottom = "^",
        bottomLeft = "%",
        bottomRight = "&",
        bg = SURFACE_VARIANT,
    )
private val GRID_2_3 = SuaveKeyDef("d", top = "j", topRight = ">", bottom = "=", bottomLeft = "*", bottomRight = "/", left = "y")
private val GRID_2_4 = SuaveKeyDef("l", topLeft = ")", bottom = "\\", bottomLeft = "}", left = "]")

private val GRID_3_0 = SuaveKeyDef("ctrl", right = "alt", top = "esc", bg = SURFACE_VARIANT, swipeType = FOUR_WAY_CROSS)
private val GRID_3_0_EMOJI = SuaveKeyDef("backspace", bg = SURFACE_VARIANT, slide = SlideType.DELETE)
private val GRID_3_1 =
    SuaveKeyDef(
        center = "emoji",
        top = "settings",
        topLeft = "hide",
        bottom = "ime",
        bottomLeft = "voice",
        left = "lang",
        right = "move",
        bg = SURFACE_VARIANT,
    )
private val GRID_3_2 =
    SuaveKeyDef(
        center = "numeric",
        top = "copy",
        topLeft = "selectAll",
        topRight = "cut",
        bottomLeft = "undo",
        bottomRight = "redo",
        bottom = "paste",
        bg = SURFACE_VARIANT,
    )
private val GRID_3_2_ABC = GRID_3_2.copy(center = "abc")
private val GRID_3_3 = SuaveKeyDef("return", top = "tab", left = "enter", bg = SURFACE_VARIANT, swipeType = FOUR_WAY_CROSS, w = 2)

private val SUAVE_GRID_TEMPLATE =
    listOf(
        listOf(GRID_0_0, GRID_0_1, GRID_0_2, GRID_0_3, GRID_0_4),
        listOf(GRID_1_0, GRID_1_1, GRID_1_2, GRID_1_3, GRID_1_4),
        listOf(GRID_2_0, GRID_2_1, GRID_2_2, GRID_2_3, GRID_2_4),
    )

val KB_DE_TYPESPLIT_SUAVE_MAIN =
    generateSuaveLayout(
        SuaveMode.MAIN,
        SUAVE_GRID_TEMPLATE + listOf(listOf(GRID_3_0, GRID_3_1, GRID_3_2, GRID_3_3)),
    )
val KB_DE_TYPESPLIT_SUAVE_SHIFTED =
    generateSuaveLayout(
        SuaveMode.SHIFTED,
        SUAVE_GRID_TEMPLATE + listOf(listOf(GRID_3_0, GRID_3_1, GRID_3_2, GRID_3_3)),
    )
val KB_DE_TYPESPLIT_SUAVE_CTRLED =
    generateSuaveLayout(
        SuaveMode.CTRLED,
        SUAVE_GRID_TEMPLATE + listOf(listOf(GRID_3_0, GRID_3_1, GRID_3_2, GRID_3_3)),
    )
val KB_DE_TYPESPLIT_SUAVE_ALTED =
    generateSuaveLayout(
        SuaveMode.ALTED,
        SUAVE_GRID_TEMPLATE + listOf(listOf(GRID_3_0, GRID_3_1, GRID_3_2, GRID_3_3)),
    )
val KB_DE_TYPESPLIT_SUAVE_EMOJI =
    generateSuaveLayout(
        SuaveMode.EMOJI,
        SUAVE_GRID_TEMPLATE + listOf(listOf(GRID_3_0_EMOJI, GRID_3_1, GRID_3_2, GRID_3_3)),
    )

val KB_DE_TYPESPLIT_SUAVE_NUMERIC =
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
                generateSuaveLayout(SuaveMode.MAIN, listOf(listOf(GRID_0_2))).arr[0][0],
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
                generateSuaveLayout(SuaveMode.MAIN, listOf(listOf(GRID_1_2))).arr[0][0],
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
                    bottomRight = KeyC("$", color = MUTED),
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
                generateSuaveLayout(SuaveMode.MAIN, listOf(listOf(GRID_3_0))).arr[0][0],
                generateSuaveLayout(SuaveMode.MAIN, listOf(listOf(GRID_3_1))).arr[0][0],
                generateSuaveLayout(SuaveMode.MAIN, listOf(listOf(GRID_3_2_ABC))).arr[0][0],
                generateSuaveLayout(SuaveMode.MAIN, listOf(listOf(GRID_3_3))).arr[0][0],
            ),
        ),
    )

val KB_DE_TYPESPLIT_SUAVE: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch type-split suave",
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_TYPESPLIT_SUAVE_MAIN,
                shifted = KB_DE_TYPESPLIT_SUAVE_SHIFTED,
                numeric = KB_DE_TYPESPLIT_SUAVE_NUMERIC,
                ctrled = KB_DE_TYPESPLIT_SUAVE_CTRLED,
                alted = KB_DE_TYPESPLIT_SUAVE_ALTED,
                emoji = KB_DE_TYPESPLIT_SUAVE_EMOJI,
            ),
    )

/**
 * GENERIC PROCESSING LOGIC
 */

private fun getKeyCode(char: Char): Int =
    when (char.lowercaseChar()) {
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
        '.' -> KeyEvent.KEYCODE_PERIOD
        ',' -> KeyEvent.KEYCODE_COMMA
        '/' -> KeyEvent.KEYCODE_SLASH
        ';' -> KeyEvent.KEYCODE_SEMICOLON
        '=' -> KeyEvent.KEYCODE_EQUALS
        '-' -> KeyEvent.KEYCODE_MINUS
        '[' -> KeyEvent.KEYCODE_LEFT_BRACKET
        ']' -> KeyEvent.KEYCODE_RIGHT_BRACKET
        '\\' -> KeyEvent.KEYCODE_BACKSLASH
        ' ' -> KeyEvent.KEYCODE_SPACE
        else -> KeyEvent.KEYCODE_UNKNOWN
    }

private fun generateSuaveLayout(
    mode: SuaveMode,
    grid: List<List<Any>>,
): KeyboardC {
    val result =
        grid.map { row ->
            row.map { item ->
                when (item) {
                    is KeyItemC -> {
                        item
                    }

                    is SuaveKeyDef -> {
                        val backgroundColor =
                            item.bg ?: if (mode == SuaveMode.CTRLED || mode == SuaveMode.ALTED) {
                                SURFACE_VARIANT
                            } else {
                                SURFACE
                            }

                        fun process(
                            text: String?,
                            isCenter: Boolean = false,
                        ): KeyC? {
                            if (text == null) return null

                            // 1. Handle special tokens
                            when (text.lowercase()) {
                                "shift" -> {
                                    return if (mode == SuaveMode.SHIFTED) {
                                        KeyC(
                                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardArrowUp),
                                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                                            action = ToggleShiftMode(false),
                                            size = LARGE,
                                            color = SECONDARY,
                                        )
                                    } else {
                                        KeyC(
                                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                            action = ToggleShiftMode(true),
                                            size = LARGE,
                                            color = SECONDARY,
                                        )
                                    }
                                }

                                "ctrl" -> {
                                    val isActive = (mode == SuaveMode.CTRLED)
                                    return KeyC(
                                        display = KeyDisplay.TextDisplay("ctrl"),
                                        action = ToggleCtrlMode(!isActive),
                                        color = if (isActive) PRIMARY else SECONDARY,
                                    )
                                }

                                "alt" -> {
                                    val isActive = (mode == SuaveMode.ALTED)
                                    return KeyC(
                                        display = KeyDisplay.TextDisplay("alt"),
                                        action = ToggleAltMode(!isActive),
                                        color = if (isActive) PRIMARY else MUTED,
                                    )
                                }

                                "esc" -> {
                                    return KeyC(
                                        display = KeyDisplay.TextDisplay("esc"),
                                        action = SendEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ESCAPE)),
                                        color = MUTED,
                                    )
                                }

                                "return" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                                        action = IMECompleteAction,
                                        size = LARGE,
                                        color = SECONDARY,
                                    )
                                }

                                "tab" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                                        action = CommitText("\t"),
                                        color = SECONDARY,
                                    )
                                }

                                "enter" -> {
                                    return KeyC(display = null, action = CommitText("\n"))
                                }

                                "backspace" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardBackspace),
                                        action = DeleteKeyAction,
                                        size = LARGE,
                                        color = SECONDARY,
                                    )
                                }

                                "left" -> {
                                    return KeyC(
                                        display = KeyDisplay.TextDisplay("←"),
                                        action = SendEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_LEFT)),
                                        color = MUTED,
                                    )
                                }

                                "right" -> {
                                    return KeyC(
                                        display = KeyDisplay.TextDisplay("→"),
                                        action = SendEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_RIGHT)),
                                        color = MUTED,
                                    )
                                }

                                "up" -> {
                                    return KeyC(
                                        display = KeyDisplay.TextDisplay("↑"),
                                        action = SendEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_UP)),
                                        color = MUTED,
                                    )
                                }

                                "down" -> {
                                    return KeyC(
                                        display = KeyDisplay.TextDisplay("↓"),
                                        action = SendEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_DOWN)),
                                        color = MUTED,
                                    )
                                }

                                "emoji" -> {
                                    val isActive = (mode == SuaveMode.EMOJI)
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.Outlined.Mood),
                                        action = ToggleEmojiMode(!isActive),
                                        size = LARGE,
                                        color = if (isActive) PRIMARY else SECONDARY,
                                    )
                                }

                                "numeric" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.Outlined.Numbers),
                                        action = ToggleNumericMode(true),
                                        size = LARGE,
                                        color = SECONDARY,
                                    )
                                }

                                "abc" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.Outlined.Abc),
                                        action = ToggleNumericMode(false),
                                        size = LARGE,
                                        color = SECONDARY,
                                    )
                                }

                                "copy" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCopy),
                                        action = Copy,
                                        color = MUTED,
                                    )
                                }

                                "selectall" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.Outlined.SelectAll),
                                        action = SelectAll,
                                        swipeReturnAction = SelectLineWithCursor,
                                        color = MUTED,
                                    )
                                }

                                "cut" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCut),
                                        action = Cut,
                                        color = MUTED,
                                    )
                                }

                                "undo" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.Undo),
                                        action = Undo,
                                        color = MUTED,
                                    )
                                }

                                "redo" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.Redo),
                                        action = Redo,
                                        color = MUTED,
                                    )
                                }

                                "paste" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.Outlined.ContentPaste),
                                        action = Paste,
                                        swipeReturnAction = ToggleClipboardMode(true),
                                        color = MUTED,
                                    )
                                }

                                "settings" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                                        action = GotoSettings,
                                        color = MUTED,
                                    )
                                }

                                "hide" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.Outlined.HideImage),
                                        action = ToggleHideLetters,
                                        color = MUTED,
                                    )
                                }

                                "ime" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.Outlined.Keyboard),
                                        action = SwitchIME,
                                        color = MUTED,
                                    )
                                }

                                "voice" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.Outlined.Mic),
                                        action = SwitchIMEVoice,
                                        color = MUTED,
                                    )
                                }

                                "lang" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.Outlined.Language),
                                        action = SwitchLanguage,
                                        color = MUTED,
                                    )
                                }

                                "move" -> {
                                    return KeyC(
                                        display = KeyDisplay.IconDisplay(Icons.Outlined.LinearScale),
                                        action = MoveKeyboard.CycleRight,
                                        color = MUTED,
                                    )
                                }
                            }

                            // 2. Handle letter mapping
                            val processedText =
                                when (mode) {
                                    SuaveMode.SHIFTED -> {
                                        SHIFT_MAPPINGS[text] ?: if (text.length == 1) text.uppercase() else text
                                    }

                                    else -> {
                                        text
                                    }
                                }

                            // 3. Handle shortcuts
                            if ((mode == SuaveMode.CTRLED || mode == SuaveMode.ALTED) && text.length == 1) {
                                val code = getKeyCode(text[0])
                                if (code != KeyEvent.KEYCODE_UNKNOWN) {
                                    val flag =
                                        if (mode == SuaveMode.CTRLED) {
                                            KeyEvent.META_CTRL_ON
                                        } else {
                                            (KeyEvent.META_ALT_ON or KeyEvent.META_ALT_LEFT_ON)
                                        }
                                    return keyCModifier(flag, code, processedText, size = if (isCenter) item.size else SMALL)
                                }
                            }

                            // 4. Default KeyC
                            return if ((mode == SuaveMode.CTRLED || mode == SuaveMode.ALTED) && !isCenter) {
                                KeyC(processedText, color = MUTED)
                            } else {
                                KeyC(
                                    processedText,
                                    size = if (isCenter) item.size else SMALL,
                                    color = if (isCenter) PRIMARY else MUTED,
                                )
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
                            backgroundColor = backgroundColor,
                            slideType = item.slide,
                            longPress =
                                if (item.center == "shift") {
                                    ToggleCapsLock
                                } else if (item.center == "return") {
                                    CommitText("\n")
                                } else if (item.center == "backspace") {
                                    DeleteWordBeforeCursor
                                } else {
                                    null
                                },
                            nextTapActions =
                                if (item.center == " ") {
                                    listOf(
                                        ReplaceLastText(", ", trimCount = 1),
                                        ReplaceLastText(". "),
                                        ReplaceLastText("? "),
                                        ReplaceLastText("! "),
                                        ReplaceLastText(": "),
                                        ReplaceLastText("; "),
                                    )
                                } else {
                                    null
                                },
                            widthMultiplier = item.w,
                        )
                    }

                    else -> {
                        throw IllegalArgumentException("Unknown item type")
                    }
                }
            }
        }
    return KeyboardC(result)
}
