@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_RU_ARTI_MAIN =
    KB_TR_ARTI_MAIN.copy().alterKeys(
        Triple(0, 1) { key ->
            key.copy(
                center = KeyC("с", size = LARGE),
                right = KeyC("щ"),
                bottomRight = KeyC("й"),
                bottom = KeyC("э"),
            )
        },
        Triple(0, 2) { key ->
            key.copy(
                center = KeyC("р", size = LARGE),
                bottomRight = null,
                bottom = KeyC("х"),
            )
        },
        Triple(0, 3) { key ->
            key.copy(
                center = KeyC("а", size = LARGE),
                bottom = null,
                bottomLeft = KeyC("ж"),
                left = null,
            )
        },
        Triple(1, 1) { key ->
            key.copy(
                center = KeyC("н", size = LARGE),
                right = KeyC("м"),
                bottom = KeyC("л"),
            )
        },
        Triple(1, 2) { key ->
            key.copy(
                center = KeyC("в", size = LARGE),
                topLeft = KeyC("я"),
                top = KeyC("ы"),
                topRight = KeyC("ь"),
                right = KeyC("п"),
                bottomRight = KeyC("у"),
                bottom = KeyC("з"),
                bottomLeft = KeyC("г"),
                left = KeyC("к"),
            )
        },
        Triple(1, 3) { key ->
            key.copy(
                center = KeyC("е", size = LARGE),
                topLeft = KeyC("ё"), // bottom of key 9 on thumbkey original
                left = KeyC("ф"),
            )
        },
        Triple(2, 1) { key ->
            key.copy(
                center = KeyC("т", size = LARGE),
                topRight = KeyC("ч"),
                top = KeyC("ш"),
                right = KeyC("ъ"),
            )
        },
        Triple(2, 2) { key ->
            key.copy(
                center = KeyC("и", size = LARGE),
                topLeft = null,
                top = KeyC("б"),
                right = KeyC("ц"),
            )
        },
        Triple(2, 3) { key ->
            key.copy(
                center = KeyC("о", size = LARGE),
                topLeft = KeyC("д"),
                top = KeyC("ю"), // bottom on thumbkey original
            )
        },
    )

val KB_RU_ARTI_SHIFTED =
    KB_TR_ARTI_SHIFTED.copy().alterKeys(
        Triple(0, 1) { key ->
            key.copy(
                center = KeyC("С", size = LARGE),
                right = KeyC("Щ"),
                bottomRight = KeyC("Й"),
                bottom = KeyC("Э"),
            )
        },
        Triple(0, 2) { key ->
            key.copy(
                center = KeyC("Р", size = LARGE),
                bottom = KeyC("Х"),
                bottomRight = null,
            )
        },
        Triple(0, 3) { key ->
            key.copy(
                center = KeyC("А", size = LARGE),
                bottom = null,
                bottomLeft = KeyC("Ж"),
                left = null,
            )
        },
        Triple(1, 1) { key ->
            key.copy(
                center = KeyC("Н", size = LARGE),
                right = KeyC("М"),
                bottom = KeyC("Л"),
            )
        },
        Triple(1, 2) { key ->
            key.copy(
                center = KeyC("В", size = LARGE),
                topLeft = KeyC("Я"),
                top = KeyC("Ы"),
                topRight = KeyC("Ь"),
                right = KeyC("П"),
                bottomRight = KeyC("У"),
                bottom = KeyC("З"),
                bottomLeft = KeyC("Г"),
                left = KeyC("К"),
            )
        },
        Triple(1, 3) { key ->
            key.copy(
                center = KeyC("Е", size = LARGE),
                topLeft = KeyC("Ё"), // bottom of key 9 on RUThumbKey
                left = KeyC("Ф"),
            )
        },
        Triple(2, 1) { key ->
            key.copy(
                center = KeyC("Т", size = LARGE),
                topRight = KeyC("Ч"),
                top = KeyC("Ш"),
                right = KeyC("Ъ"),
            )
        },
        Triple(2, 2) { key ->
            key.copy(
                center = KeyC("И", size = LARGE),
                topLeft = null,
                top = KeyC("Б"),
                right = KeyC("Ц"),
            )
        },
        Triple(2, 3) { key ->
            key.copy(
                center = KeyC("О", size = LARGE),
                topLeft = KeyC("Д"),
                top = KeyC("Ю"), // bottom on RUThumbKey
            )
        },
    )

val KB_RU_ARTI_NUMERIC =
    KB_TR_ARTI_NUMERIC.copy()

val KB_RU_ARTI: KeyboardDefinition =
    KeyboardDefinition(
        title = "русский плюс много",
        modes =
            KeyboardDefinitionModes(
                main = KB_RU_ARTI_MAIN,
                shifted = KB_RU_ARTI_SHIFTED,
                numeric = KB_RU_ARTI_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(),
    )
