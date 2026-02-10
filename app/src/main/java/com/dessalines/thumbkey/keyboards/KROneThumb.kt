@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.textprocessors.KoreanTextProcessor
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_KR_ONETHUMB_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    topLeft = KeyC("{", color = MUTED),
                    top = KeyC("[", color = MUTED),
                    topRight = KeyC("<", color = MUTED),
                    left = KeyC("@", color = MUTED),
                    center = KeyC("ㅅ", size = LARGE),
                    right = KeyC("*", color = MUTED),
                    bottomLeft = KeyC("°", color = MUTED),
                    bottom = KeyC("0", color = MUTED),
                    bottomRight = KeyC("ㅃ"),
                ),
                KeyItemC(
                    topLeft = KeyC("^", color = MUTED),
                    top = KeyC(";", color = MUTED),
                    topRight = KeyC("?", color = MUTED),
                    left = KeyC("#", color = MUTED),
                    center = KeyC("ㅗ", size = LARGE),
                    right = KeyC("/", color = MUTED),
                    bottomLeft = KeyC("~", color = MUTED),
                    bottom = KeyC("ㅍ"),
                    bottomRight = KeyC("ㅊ"),
                ),
                KeyItemC(
                    topLeft = KeyC("€", color = MUTED),
                    top = KeyC("§", color = MUTED),
                    topRight = KeyC("+", color = MUTED),
                    left = KeyC("&", color = MUTED),
                    center = KeyC("ㄱ", size = LARGE),
                    right = KeyC("$", color = MUTED),
                    bottomLeft = KeyC("ㅖ"),
                    bottom = KeyC("ㄸ"),
                    bottomRight = KeyC("|", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    topLeft = KeyC("1", color = MUTED),
                    top = KeyC("2", color = MUTED),
                    topRight = KeyC("3", color = MUTED),
                    left = KeyC("%", color = MUTED),
                    center = KeyC("ㄹ", size = LARGE),
                    right = KeyC("ㄲ"),
                    bottomLeft = KeyC("4", color = MUTED),
                    bottom = KeyC("5", color = MUTED),
                    bottomRight = KeyC("6", color = MUTED),
                ),
                KeyItemC(
                    topLeft = KeyC("ㅔ"),
                    top = KeyC("ㅛ"),
                    topRight = KeyC("ㅑ"),
                    left = KeyC("ㅠ"),
                    center = KeyC("ㅇ", size = LARGE),
                    right = KeyC("ㅎ"),
                    bottomLeft = KeyC("ㅋ"),
                    bottom = KeyC("ㅕ"),
                    bottomRight = KeyC("ㅜ"),
                ),
                KeyItemC(
                    topLeft = KeyC(".", color = MUTED),
                    top = KeyC("ㅒ"),
                    topRight = KeyC("`", color = MUTED),
                    left = KeyC("ㅐ"),
                    center = KeyC("ㅏ", size = LARGE),
                    right = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("ㅓ"),
                    bottom = KeyC("\"", color = MUTED),
                    bottomRight = KeyC("!", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    topLeft = KeyC("7", color = MUTED),
                    top = KeyC("8", color = MUTED),
                    topRight = KeyC("9", color = MUTED),
                    left = KeyC("=", color = MUTED),
                    center = KeyC("ㅡ", size = LARGE),
                    right = KeyC("'", color = MUTED),
                    bottomLeft = KeyC("}", color = MUTED),
                    bottom = KeyC("]", color = MUTED),
                    bottomRight = KeyC(">", color = MUTED),
                ),
                KeyItemC(
                    topLeft = KeyC("(", color = MUTED),
                    top = KeyC("ㅂ"),
                    topRight = KeyC("ㄷ"),
                    left = KeyC("ㅌ"),
                    center = KeyC("ㄴ", size = LARGE),
                    right = KeyC("ㅉ"),
                    bottomLeft = KeyC(")", color = MUTED),
                    bottom = KeyC(",", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    topLeft = KeyC("ㅁ"),
                    top = KeyC("ㅈ"),
                    topRight = KeyC("₩", color = MUTED),
                    left = KeyC("ㅆ"),
                    center = KeyC("ㅣ", size = LARGE),
                    right = KeyC("_", color = MUTED),
                    bottomLeft = KeyC(":", color = MUTED),
                    bottom = KeyC("´", color = MUTED),
                    bottomRight = KeyC("…", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_KR_ONETHUMB: KeyboardDefinition =
    KeyboardDefinition(
        title = "한국어 one-thumb",
        locales = listOf("ko"),
        modes =
            KeyboardDefinitionModes(
                main = KB_KR_ONETHUMB_MAIN,
                shifted = KB_KR_ONETHUMB_MAIN,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                textProcessor = KoreanTextProcessor(),
            ),
    )
