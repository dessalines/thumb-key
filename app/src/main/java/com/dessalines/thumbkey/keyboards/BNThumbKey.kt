@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

// Layer 1 (main): most frequent consonants + vowel signs (kar forms), used for
// normal running text (consonant + attached vowel sign is the common case).
val KB_BN_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("\u09A8", size = LARGE), // ন na
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("\u0964", color = MUTED), // । dari (Bengali full stop)
                    bottomRight = KeyC("\u0997"), // গ ga
                    bottomLeft = KeyC(",", color = MUTED), // comma
                ),
                KeyItemC(
                    center = KeyC("\u09B0", size = LARGE), // র ra
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("?", color = MUTED), // question mark
                    bottom = KeyC("\u09AC"), // ব ba
                ),
                KeyItemC(
                    center = KeyC("\u09C7", size = LARGE), // ে e-kar
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("!", color = MUTED), // exclamation mark
                    bottomLeft = KeyC("\u09C8"), // ৈ oi-kar
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("\u09B8", size = LARGE), // স sa
                    swipeType = TWO_WAY_HORIZONTAL,
                    left = KeyC("-", color = MUTED), // hyphen
                    right = KeyC("\u09B2"), // ল la
                ),
                KeyItemC(
                    center = KeyC("\u0995", size = LARGE), // ক ka
                    topLeft = KeyC("\u099A"), // চ cha
                    top = KeyC("\u099C"), // জ ja
                    topRight = KeyC("\u09B9"), // হ ha
                    right = KeyC("\u09B6"), // শ sha
                    bottomRight = KeyC("\u09A5"), // থ tha
                    bottom = KeyC("\u09A7"), // ধ dha
                    bottomLeft = KeyC("\u099F"), // ট Ta
                    left = KeyC("\u0996"), // খ kha
                ),
                KeyItemC(
                    center = KeyC("\u09BE", size = LARGE), // া aa-kar
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("\u09CD", color = MUTED), // ্ hasanta/virama
                    right = KeyC(":", color = MUTED), // colon
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("\u09A4", size = LARGE), // ত ta
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("(", color = MUTED), // open paren
                    topRight = KeyC("\u09A6"), // দ da
                    bottomRight = KeyC(")", color = MUTED), // close paren
                ),
                KeyItemC(
                    center = KeyC("\u09AE", size = LARGE), // ম ma
                    topLeft = KeyC("\u09F3", color = MUTED), // ৳ taka sign
                    top = KeyC("\u09AA"), // প pa
                    topRight = KeyC("\u09AF"), // য ya
                    right = KeyC("\u0982", color = MUTED), // ং anusvara
                    bottomRight = KeyC("\u0983", color = MUTED), // ঃ visarga
                    bottom = KeyC("\u09C0"), // ী ii-kar
                    bottomLeft = KeyC("\u09C1"), // ু u-kar
                    left = KeyC(";", color = MUTED), // semicolon
                ),
                KeyItemC(
                    center = KeyC("\u09BF", size = LARGE), // ি i-kar
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("\u09C2"), // ূ uu-kar
                    topRight = KeyC("\u0965", color = MUTED), // ॥ double danda
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

// Layer 2 ("shifted" slot, repurposed): independent vowels + remaining
// consonants + nukta letters + marks not frequent enough for layer 1.
// There is no case in Bengali, so this layer replaces capitals rather than adding them.

val KB_BN_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("\u09AD", size = LARGE), // ভ bha
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("\u09AB"), // ফ pha
                ),
                KeyItemC(
                    center = KeyC("\u099B", size = LARGE), // ছ chha
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("\u099D"), // ঝ jha
                ),
                KeyItemC(
                    center = KeyC("\u0993", size = LARGE), // ও o (independent)
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("\u0994"), // ঔ au
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("\u0998", size = LARGE), // ঘ gha
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("\u0999"), // ঙ nga
                ),
                KeyItemC(
                    center = KeyC("\u0985", size = LARGE), // অ a (independent)
                    topLeft = KeyC("\u0986"), // আ aa
                    top = KeyC("\u0987"), // ই i
                    topRight = KeyC("\u0988"), // ঈ ii
                    right = KeyC("\u0989"), // উ u
                    bottomRight = KeyC("\u098A"), // ঊ uu
                    bottom = KeyC("\u098B"), // ঋ ri
                    bottomLeft = KeyC("\u098F"), // এ e
                    left = KeyC("\u0990"), // ঐ ai
                ),
                KeyItemC(
                    center = KeyC("\u09A0", size = LARGE), // ঠ Tha
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("\u09A1"), // ড Da
                    top = KeyC("\u09A3"), // ণ Na
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("\u09A2", size = LARGE), // ঢ Dha
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("\u099E"), // ঞ nya
                ),
                KeyItemC(
                    center = KeyC("\u09DF", size = LARGE), // য় ya (nukta)
                    top = KeyC("\u09DC"), // ড় Ra (nukta)
                    topRight = KeyC("\u09DD"), // ঢ় Rha (nukta)
                    right = KeyC("\u09CE"), // ৎ khanda ta
                    bottomRight = KeyC("\u0981", color = MUTED), // ঁ chandrabindu
                    bottom = KeyC("\u09CC"), // ৌ ou-kar
                    bottomLeft = KeyC("\u09CB"), // ো o-kar
                ),
                KeyItemC(
                    center = KeyC("\u09C3", size = LARGE), // ৃ ri-kar
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("\u09B7"), // ষ ssa
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_BN_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "bengali thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_BN_THUMBKEY_MAIN,
                shifted = KB_BN_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
