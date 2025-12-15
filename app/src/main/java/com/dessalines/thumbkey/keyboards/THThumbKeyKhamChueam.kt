@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import android.R.attr.numeric
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_TH_THUMBKEY_KHAM_CHUEAM_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    topLeft = KeyC("", color = MUTED, size = FontSizeVariant.SMALLEST),
                    top = KeyC("จะ", color = MUTED, size = FontSizeVariant.SMALLEST),
                    topRight = KeyC("ที่", color = MUTED, size = FontSizeVariant.SMALLEST),
                    center = KeyC("ด", size = LARGE),
                    right = KeyC("ฒ"),
                    bottomRight = KeyC("ต"),
                    bottom = KeyC("ฎ"),
                    bottomLeft = KeyC("ฏ"),
                    left = KeyC("ยัง", color = MUTED, size = FontSizeVariant.SMALLEST),
                ),
                KeyItemC(
                    center = KeyC("ท", size = LARGE),
                    topLeft = KeyC("ฑ"),
                    top = KeyC("ฝ"),
                    topRight = KeyC("ฟ"),
                    right = KeyC("ถ"),
                    bottomRight = KeyC("ผ"),
                    bottom = KeyC("พ"),
                    bottomLeft = KeyC("ธ"),
                    left = KeyC("ภ"),
                ),
                KeyItemC(
                    center = KeyC("ก", size = LARGE),
                    topLeft = KeyC("ฆ"),
                    top = KeyC("ฅ"),
                    topRight = KeyC("ใช่", color = MUTED, size = FontSizeVariant.SMALLEST),
                    right = KeyC("ได้", color = MUTED, size = FontSizeVariant.SMALLEST),
                    bottomRight = KeyC("ไม่", color = MUTED, size = FontSizeVariant.SMALLEST),
                    bottom = KeyC("ฐ"),
                    bottomLeft = KeyC("ค"),
                    left = KeyC("ฃ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ง", size = LARGE),
                    topLeft = KeyC("ฦ"),
                    top = KeyC("๐"),
                    topRight = KeyC("฿"),
                    right = KeyC("ว"),
                    bottomRight = KeyC("จ"),
                    bottom = KeyC(displayText = "◌๋", text = "๋"),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.TransitEnterexit),
                            action = ToggleShiftMode(true),
                            color = MUTED,
                        ),
                    left = KeyC(displayText = "-ๅ", text = "ๅ"),
                ),
                KeyItemC(
                    center = KeyC("ย", size = LARGE),
                    topLeft = KeyC("ใ"),
                    top = KeyC("โ"),
                    topRight = KeyC("ข"),
                    right = KeyC("ห"),
                    bottomRight = KeyC(displayText = "◌ั", text = "ั"),
                    bottom = KeyC(displayText = "◌ิ", text = "ิ"),
                    bottomLeft = KeyC(displayText = "◌ี", text = "ี"),
                    left = KeyC("ไ"),
                ),
                KeyItemC(
                    center = KeyC("น", size = LARGE),
                    topLeft = KeyC("ณ"),
                    top = KeyC("ญ"),
                    topRight = KeyC("ไหม", color = MUTED, size = FontSizeVariant.SMALLEST),
                    right = KeyC("ฮ"),
                    bottomRight = KeyC("ฬ"),
                    bottom = KeyC("ศ"),
                    bottomLeft = KeyC(displayText = "-ะ", text = "ะ"),
                    left = KeyC("ม"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC(displayText = "-า", text = "า", size = LARGE),
                    topLeft = KeyC("ซ"),
                    top = KeyC("ช"),
                    topRight = KeyC(displayText = "◌่", text = "่"),
                    right = KeyC("บ"),
                    bottomRight = KeyC(displayText = "◌็", text = "็"),
                    bottom = KeyC(displayText = "-ำ", text = "ำ"),
                    bottomLeft = KeyC("ฌ"),
                    left = KeyC("ฉ"),
                ),
                KeyItemC(
                    center = KeyC("อ", size = LARGE),
                    topLeft = KeyC(displayText = "◌ุ", text = "ุ"),
                    top = KeyC("เ"),
                    topRight = KeyC("แ"),
                    right = KeyC("ฤ"),
                    bottomRight = KeyC(displayText = "◌์", text = "์"),
                    bottom = KeyC(displayText = "◌ื", text = "ื"),
                    bottomLeft = KeyC(displayText = "◌ู", text = "ู"),
                    left = KeyC("ป"),
                ),
                KeyItemC(
                    center = KeyC("ร", size = LARGE),
                    topLeft = KeyC(displayText = "◌้", text = "้"),
                    top = KeyC("ส"),
                    topRight = KeyC("ษ"),
                    right = KeyC("ๆ"),
                    bottomRight = KeyC("ฯ"),
                    bottom = KeyC(displayText = "◌๊", text = "๊"),
                    bottomLeft = KeyC(displayText = "◌ึ", text = "ึ"),
                    left = KeyC("ล"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_TH_THUMBKEY_KHAM_CHUEAM_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("มาก"),
                    bottomRight = KeyC("ความ"),
                ),
                KeyItemC(
                    center = KeyC("กว่า"),
                    bottomRight = KeyC("เมื่อ"),
                ),
                KeyItemC(
                    center = KeyC("ด้วย"),
                    bottomLeft = KeyC("การ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("แต่"),
                    topRight = KeyC("ทั้ง"),
                    bottomLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.TransitEnterexit),
                            action = ToggleShiftMode(false),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("เป็น"),
                    topLeft = KeyC("คือ"),
                    topRight = KeyC("กัน"),
                    bottomRight = KeyC("ให้", size = FontSizeVariant.SMALL),
                    bottomLeft = KeyC("จาก"),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                ),
                KeyItemC(
                    topLeft = KeyC("ของ"),
                    topRight = KeyC("ครับ"),
                    center = KeyC("แล้ว"),
                    bottomRight = KeyC("ค่ะ"),
                    bottomLeft = KeyC("ต้อง", size = SMALL),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ขึ้น"),
                    topRight = KeyC("ถึง"),
                ),
                KeyItemC(
                    center = KeyC("ว่า"),
                    topLeft = KeyC("แต่"),
                    topRight = KeyC("และ"),
                ),
                KeyItemC(
                    topLeft = KeyC("กับ"),
                    topRight = KeyC("คะ"),
                    center = KeyC("หรือ"),
                    bottomLeft = KeyC("อยู่"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_TH_THUMBKEY_KHAM_CHUEAM: KeyboardDefinition =
    KeyboardDefinition(
        title = "ภาษาไทย thai thumb-key คำเชื่อม",
        modes =
            KeyboardDefinitionModes(
                main = KB_TH_THUMBKEY_KHAM_CHUEAM_MAIN,
                shifted = KB_TH_THUMBKEY_KHAM_CHUEAM_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
