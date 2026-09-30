package com.dessalines.thumbkey.utils

import com.dessalines.thumbkey.utils.SwipeDirection.BOTTOM
import com.dessalines.thumbkey.utils.SwipeDirection.BOTTOM_LEFT
import com.dessalines.thumbkey.utils.SwipeDirection.BOTTOM_RIGHT
import com.dessalines.thumbkey.utils.SwipeDirection.LEFT
import com.dessalines.thumbkey.utils.SwipeDirection.RIGHT
import com.dessalines.thumbkey.utils.SwipeDirection.TOP
import com.dessalines.thumbkey.utils.SwipeDirection.TOP_LEFT
import com.dessalines.thumbkey.utils.SwipeDirection.TOP_RIGHT

// Sketch mode puts its candidates on three keys. Ranks run key by key: the centers are
// #1–3, the sides #4–15 (clockwise from the top) and the corners #16–27 (clockwise from the
// top left). Ranks here count from 0. Key 0 is shown on the right, where a right thumb
// reaches it most easily, and key 2 on the left.
const val SKETCH_CANDIDATE_KEYS = 3
const val SKETCH_KEY_SLOTS = SKETCH_CANDIDATE_KEYS * 9

// How many candidates the full list shows
const val SKETCH_LIST_SIZE = 100

private val SIDES = listOf(TOP, RIGHT, BOTTOM, LEFT)
private val CORNERS = listOf(TOP_LEFT, TOP_RIGHT, BOTTOM_RIGHT, BOTTOM_LEFT)

/** The rank of the candidate on `key` (0–2) in `direction`, null for the center. */
fun sketchRank(
    key: Int,
    direction: SwipeDirection?,
): Int =
    when (direction) {
        null -> key
        in SIDES -> SKETCH_CANDIDATE_KEYS + key * SIDES.size + SIDES.indexOf(direction)
        else -> SKETCH_CANDIDATE_KEYS * 5 + key * CORNERS.size + CORNERS.indexOf(direction)
    }

/** The key and direction of the candidate with this rank, or null if it isn't on a key. */
fun sketchSlot(rank: Int): Pair<Int, SwipeDirection?>? =
    when {
        rank < 0 || rank >= SKETCH_KEY_SLOTS -> null
        rank < SKETCH_CANDIDATE_KEYS -> Pair(rank, null)
        rank < SKETCH_CANDIDATE_KEYS * 5 -> (rank - SKETCH_CANDIDATE_KEYS).let { Pair(it / SIDES.size, SIDES[it % SIDES.size]) }
        else -> (rank - SKETCH_CANDIDATE_KEYS * 5).let { Pair(it / CORNERS.size, CORNERS[it % CORNERS.size]) }
    }

fun isCornerDirection(direction: SwipeDirection?) = direction in CORNERS

fun swipeDirectionArrow(direction: SwipeDirection?): String =
    when (direction) {
        null -> "•"
        TOP -> "↑"
        TOP_RIGHT -> "↗"
        RIGHT -> "→"
        BOTTOM_RIGHT -> "↘"
        BOTTOM -> "↓"
        BOTTOM_LEFT -> "↙"
        LEFT -> "←"
        TOP_LEFT -> "↖"
    }

// Thumb-Key layout codes that glyphsketch knows by another name. The recognizer only uses the
// language to pick the script a look-alike group is shown in, so a Cyrillic layout of a
// language glyphsketch doesn't list can use Russian.
private val SKETCH_LANGUAGE_ALIASES =
    mapOf(
        "gr" to "el",
        "cz" to "cs",
        "vn" to "vi",
        "by" to "ru",
        "kz" to "ru",
        "sah" to "ru",
    )

/** The language codes a layout's name starts with, lowercase: ENDEThumbKey → en, de. */
fun layoutLanguageCodes(layoutName: String): List<String> {
    // Names that start with capitals but aren't languages
    if (layoutName.startsWith("MATH") || layoutName.startsWith("TOK")) return emptyList()
    if (layoutName.startsWith("SAH")) return listOf("sah")

    val capitals = layoutName.takeWhile { it.isUpperCase() }
    // The last capital starts the next word, as the T in ENThumbKey
    val prefix =
        if (capitals.length < layoutName.length && layoutName[capitals.length].isLowerCase()) {
            capitals.dropLast(1)
        } else {
            capitals
        }
    val codes =
        prefix
            .chunked(2)
            .filter { it.length == 2 }
            .map { it.lowercase() }
            .toMutableList()
    val rest = layoutName.substring(prefix.length)
    if (rest.startsWith("Latn")) codes.remove("sr") // Serbian in Latin letters
    if (rest.startsWith("Cyrillic")) codes.add("ru")
    return codes
}

/**
 * The glyphsketch keyboard language for a layout: one of `keyboardScripts`' keys, or null for
 * Latin. A layout for several languages uses the first one written in another script than
 * Latin, since that's the script its look-alikes should be shown in.
 */
fun sketchLanguage(
    layoutName: String,
    keyboardScripts: Map<String, List<String>>,
): String? {
    val known =
        layoutLanguageCodes(layoutName)
            .map { SKETCH_LANGUAGE_ALIASES[it] ?: it }
            .filter { it in keyboardScripts }
    return known.firstOrNull { keyboardScripts[it] != listOf("Latin") } ?: known.firstOrNull()
}
