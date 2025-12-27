@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

/**
 * This is the numeric portion of the layout known as "German + ÅÆØ" in
 * MessagEase and is intended to preserve compatibility with it. Do not
 * make changes that alter the placements!
 */
val KB_NORDIC_MESSAGEASE_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    bottomLeft = KeyC("$", color = MUTED),
                    right = KeyC("-", color = MUTED),
                    bottomRight =
                        getLocalCurrency()?.let {
                            if (it !in setOf("$", "£", "€")) {
                                KeyC(it, color = MUTED)
                            } else {
                                null
                            }
                        },
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("´", color = MUTED),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottomLeft = KeyC("£", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    topLeft = KeyC("~", color = MUTED),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = CommitText("\t"),
                            color = MUTED,
                        ),
                    left = KeyC("<", color = MUTED),
                    top = KeyC("\u0308", displayText = "¨", color = MUTED),
                    right = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    topLeft = KeyC("\"", color = MUTED),
                    topRight = KeyC("'", color = SECONDARY),
                    bottomRight = KeyC(":", color = SECONDARY),
                    bottom = KeyC(".", color = SECONDARY),
                    bottomLeft = KeyC(",", color = SECONDARY),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC("°", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("#", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                    widthMultiplier = 2,
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
