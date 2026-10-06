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
// reaches it most easily, and key 2 on the left; left-handed layouts mirror this.
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

// Thumb-Key has no left-handed setting; left-handed layouts say so in their name, as
// ENMessagEaseLeft or FRENFrappeFluideV1LeftHanded.
fun isLeftHandedLayout(layoutName: String) = layoutName.contains("Left")

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
