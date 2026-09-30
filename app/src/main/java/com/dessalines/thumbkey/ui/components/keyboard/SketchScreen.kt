package com.dessalines.thumbkey.ui.components.keyboard

import android.content.Context
import android.media.AudioManager
import android.util.Log
import android.view.HapticFeedbackConstants
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material.icons.outlined.Draw
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dessalines.thumbkey.IMEService
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.keyboards.BACKSPACE_KEY_ITEM
import com.dessalines.thumbkey.keyboards.RETURN_KEY_ITEM
import com.dessalines.thumbkey.keyboards.SKETCH_BACK_KEY_ITEM
import com.dessalines.thumbkey.keyboards.SKETCH_UNDO_KEY_ITEM
import com.dessalines.thumbkey.keyboards.SPACEBAR_SKINNY_KEY_ITEM
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardFieldConnection
import com.dessalines.thumbkey.utils.SKETCH_CANDIDATE_KEYS
import com.dessalines.thumbkey.utils.SKETCH_LIST_SIZE
import com.dessalines.thumbkey.utils.SketchRecognizer
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.SwipeNWay
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.isCornerDirection
import com.dessalines.thumbkey.utils.sketchLanguage
import com.dessalines.thumbkey.utils.sketchRank
import com.dessalines.thumbkey.utils.sketchSlot
import com.dessalines.thumbkey.utils.swipeDirectionArrow
import io.github.toldry.glyphsketch.Charset
import io.github.toldry.glyphsketch.Point
import io.github.toldry.glyphsketch.Recognizer
import io.github.toldry.glyphsketch.Tile
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

// Corner labels need a big enough key to stay readable. Smaller keys keep the corner swipes.
private const val SKETCH_CORNER_LABELS_MIN_KEY_SIZE = 80f

private const val SKETCH_PEN_WIDTH_DP = 6f

// The dashed guide line, as a fraction of the pad's height
private const val SKETCH_BASELINE = 0.72f

/** A list over the whole sketch keyboard, instead of the pad and keys. */
sealed interface SketchList {
    // Every candidate, by rank
    data object Candidates : SketchList

    // One candidate's look-alike group, the candidate first
    class LookAlikes(
        val codePoints: List<Int>,
    ) : SketchList
}

/**
 * What sketch mode shows. KeyboardScreen keeps it, so the drawing stays while a list's search
 * borrows the letter keys, and when sketch mode is left and opened again.
 */
@Stable
class SketchState {
    var strokes by mutableStateOf(listOf<List<Offset>>())
    var tiles by mutableStateOf(listOf<Tile>())

    // Searching the open list, typed with the layout's own keys
    var searching by mutableStateOf(false)
    var query by mutableStateOf("")

    private var openList by mutableStateOf<SketchList?>(null)

    // The open list, or null for the pad. Closing it clears its search.
    var list: SketchList?
        get() = openList
        set(value) {
            openList = value
            if (value == null) query = ""
        }
}

/**
 * Sketch mode: draw a character on the pad and type it from the candidate keys below.
 * The pad takes the three left columns, above the row of three candidate keys; the right
 * column holds the controls. `key` draws a keyboard key that sends sketch actions to
 * `onSketchAction`. `onSearch` opens the open list's search.
 */
@Composable
fun SketchScreen(
    state: SketchState,
    layoutName: String,
    rowCount: Int,
    leftHanded: Boolean,
    keyWidth: Float,
    keyHeight: Float,
    keyPadding: Int,
    keyBorderWidth: Float,
    cornerRadius: Float,
    vibrateOnTap: Boolean,
    soundOnTap: Boolean,
    onCommit: (text: String) -> Unit,
    onSearch: () -> Unit,
    key: @Composable (key: KeyItemC, onSketchAction: (KeyAction.Sketch) -> Unit) -> Unit,
) {
    val ctx = LocalContext.current
    val feedback = rememberSketchFeedback(vibrateOnTap, soundOnTap)

    val recognizer by produceState<Result<Recognizer>?>(null) {
        value = runCatching { SketchRecognizer.get(ctx) }
    }
    val loaded = recognizer?.getOrNull()
    val language = remember(loaded, layoutName) { loaded?.let { sketchLanguage(layoutName, it.charset.keyboardScripts) } }

    // Recognize after each stroke. A new stroke restarts this, dropping the older query.
    LaunchedEffect(loaded, state.strokes, language) {
        val strokes = state.strokes
        if (loaded == null || strokes.isEmpty()) {
            state.tiles = emptyList()
            return@LaunchedEffect
        }
        val points = strokes.map { stroke -> stroke.map { Point(it.x.toDouble(), it.y.toDouble()) } }
        val result =
            withContext(Dispatchers.Default) {
                loaded.recognize(
                    points,
                    language = language,
                    tiles = SKETCH_LIST_SIZE,
                    characters = 0,
                    accept = SketchRecognizer.displayable,
                )
            }
        with(result.timings) {
            Log.d(
                TAG,
                "glyphsketch: recognized ${strokes.size} strokes (language $language) in " +
                    "%.1f ms: rasterize %.1f, encode %.1f, rank %.1f".format(totalMs, rasterizeMs, encodeMs, rankMs),
            )
        }
        state.tiles = result.tiles
    }

    // The drawing stays on the pad, for another candidate or a look-alike
    fun commit(text: String) {
        onCommit(text)
        state.list = null
    }

    val onSketchAction: (KeyAction.Sketch) -> Unit = { action ->
        when (action) {
            is KeyAction.Sketch.CommitCandidate -> {
                commit(action.text)
            }

            is KeyAction.Sketch.ShowLookAlikes -> {
                state.list = SketchList.LookAlikes(action.codePoints)
            }

            KeyAction.Sketch.UndoStroke -> {
                state.strokes = state.strokes.dropLast(1)
            }

            KeyAction.Sketch.ClearPad -> {
                state.strokes = emptyList()
            }

            KeyAction.Sketch.ShowCandidateList -> {
                // Nothing to list before drawing
                if (state.strokes.isNotEmpty()) state.list = SketchList.Candidates
            }
        }
    }

    val cornerLabels = (keyWidth + keyHeight) / 2 >= SKETCH_CORNER_LABELS_MIN_KEY_SIZE
    // The best candidates sit nearest the thumb: #1 on the right, or on the left for a
    // keyboard on the left
    val candidateKeys =
        remember(state.tiles, loaded, cornerLabels, leftHanded) {
            val keys = (0 until SKETCH_CANDIDATE_KEYS).map { candidateKeyItem(it, state.tiles, loaded?.charset, cornerLabels) }
            if (leftHanded) keys else keys.asReversed()
        }
    val controlKeys =
        listOf(SKETCH_BACK_KEY_ITEM, SKETCH_UNDO_KEY_ITEM, BACKSPACE_KEY_ITEM, SPACEBAR_SKINNY_KEY_ITEM, RETURN_KEY_ITEM)
            .take(rowCount.coerceAtLeast(3))

    val padShape = RoundedCornerShape(cornerRadius.dp)
    Box {
        // The pad fills what the candidate keys leave of the control column's height, so both
        // columns end on the same pixel
        Row(modifier = Modifier.height(IntrinsicSize.Min)) {
            Column(modifier = Modifier.fillMaxHeight()) {
                Box(
                    modifier =
                        Modifier
                            .width((keyWidth * SKETCH_CANDIDATE_KEYS).dp)
                            .weight(1f)
                            .padding(keyPadding.dp)
                            .clip(padShape)
                            .then(
                                if (keyBorderWidth > 0.0) {
                                    Modifier.border(keyBorderWidth.dp, MaterialTheme.colorScheme.outline, padShape)
                                } else {
                                    Modifier
                                },
                            ).background(MaterialTheme.colorScheme.surface),
                ) {
                    SketchPad(
                        strokes = state.strokes,
                        hint =
                            when {
                                recognizer == null -> stringResource(R.string.sketch_loading)
                                loaded == null -> stringResource(R.string.sketch_load_failed)
                                else -> stringResource(R.string.sketch_hint)
                            },
                        onStroke = { state.strokes = state.strokes + listOf(it) },
                    )
                }
                Row {
                    candidateKeys.forEach { key(it, onSketchAction) }
                }
            }
            Column {
                controlKeys.forEach { key(it, onSketchAction) }
            }
        }
        val charset = loaded?.charset
        val list = state.list
        if (list != null && charset != null) {
            SketchListScreen(
                list = list,
                tiles = state.tiles,
                charset = charset,
                onPick = {
                    feedback()
                    commit(it)
                },
                onSearch = onSearch,
                onClose = { state.list = null },
                modifier = Modifier.matchParentSize(),
            )
        }
    }
}

@Composable
private fun rememberSketchFeedback(
    vibrateOnTap: Boolean,
    soundOnTap: Boolean,
): () -> Unit {
    val ctx = LocalContext.current
    val view = LocalView.current
    val audioManager = ctx.getSystemService(Context.AUDIO_SERVICE) as AudioManager
    return {
        if (vibrateOnTap) view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP)
        if (soundOnTap) audioManager.playSoundEffect(AudioManager.FX_KEY_CLICK, .1f)
    }
}

/** Candidate key `key`: its center, sides and corners type candidates, see [sketchRank]. */
private fun candidateKeyItem(
    key: Int,
    tiles: List<Tile>,
    charset: Charset?,
    cornerLabels: Boolean,
): KeyItemC {
    fun slot(direction: SwipeDirection?): KeyC {
        val tile = tiles.getOrNull(sketchRank(key, direction))
        // An empty slot does nothing, rather than typing the center
        if (tile == null || charset == null) return KeyC(action = KeyAction.Noop, display = null)
        val info = charset.characters.getValue(tile.representative)
        val corner = isCornerDirection(direction)
        return KeyC(
            action = KeyAction.Sketch.CommitCandidate(info.text, info.displayText),
            swipeReturnAction = KeyAction.Sketch.ShowLookAlikes(tile.members),
            display = if (corner && !cornerLabels) null else KeyDisplay.TextDisplay(info.displayText),
            size =
                when {
                    direction == null -> FontSizeVariant.LARGE
                    corner -> FontSizeVariant.SMALLEST
                    else -> FontSizeVariant.SMALL
                },
            color = if (direction == null) ColorVariant.PRIMARY else ColorVariant.SECONDARY,
        )
    }

    return KeyItemC(
        center = slot(null),
        left = slot(SwipeDirection.LEFT),
        topLeft = slot(SwipeDirection.TOP_LEFT),
        top = slot(SwipeDirection.TOP),
        topRight = slot(SwipeDirection.TOP_RIGHT),
        right = slot(SwipeDirection.RIGHT),
        bottomRight = slot(SwipeDirection.BOTTOM_RIGHT),
        bottom = slot(SwipeDirection.BOTTOM),
        bottomLeft = slot(SwipeDirection.BOTTOM_LEFT),
        swipeType = SwipeNWay.EIGHT_WAY,
        backgroundColor = ColorVariant.SURFACE,
        longPress = tiles.getOrNull(key)?.let { KeyAction.Sketch.ShowLookAlikes(it.members) },
    )
}

/** Records strokes in its own pixels. A tap is a stroke of one point, a dot. */
@Composable
private fun SketchPad(
    strokes: List<List<Offset>>,
    hint: String,
    onStroke: (List<Offset>) -> Unit,
) {
    val current = remember { mutableStateListOf<Offset>() }
    val currentOnStroke by rememberUpdatedState(onStroke)
    val ink = MaterialTheme.colorScheme.onSurface
    val guide = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.15f)
    val hintColor = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.55f)

    Box(modifier = Modifier.fillMaxSize()) {
        if (strokes.isEmpty() && current.isEmpty()) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterVertically),
                modifier = Modifier.fillMaxSize().padding(horizontal = 20.dp),
            ) {
                Icon(
                    imageVector = Icons.Outlined.Draw,
                    contentDescription = null,
                    tint = hintColor.copy(alpha = 0.35f),
                    modifier = Modifier.size(28.dp),
                )
                Text(
                    text = hint,
                    color = hintColor,
                    fontSize = 14.sp,
                    lineHeight = 19.sp,
                    textAlign = TextAlign.Center,
                )
            }
        }
        Canvas(
            modifier =
                Modifier
                    .fillMaxSize()
                    .pointerInput(Unit) {
                        awaitEachGesture {
                            val down = awaitFirstDown()
                            current.clear()
                            current.add(down.position)
                            down.consume()
                            while (true) {
                                val event = awaitPointerEvent()
                                val change = event.changes.firstOrNull { it.id == down.id } ?: break
                                if (!change.pressed) break
                                change.historical.forEach { current.add(it.position) }
                                current.add(change.position)
                                change.consume()
                            }
                            val finished = current.toList()
                            current.clear()
                            currentOnStroke(finished)
                        }
                    },
        ) {
            val baseline = size.height * SKETCH_BASELINE
            val inset = 14.dp.toPx()
            drawLine(
                color = guide,
                start = Offset(inset, baseline),
                end = Offset(size.width - inset, baseline),
                strokeWidth = 1.dp.toPx(),
                pathEffect = PathEffect.dashPathEffect(floatArrayOf(3.dp.toPx(), 3.dp.toPx())),
            )
            val width = SKETCH_PEN_WIDTH_DP.dp.toPx()
            val pen = Stroke(width = width, cap = StrokeCap.Round, join = StrokeJoin.Round)
            for (stroke in strokes + listOf(current.toList())) {
                if (stroke.isEmpty()) continue
                if (stroke.size == 1) {
                    drawCircle(ink, radius = width / 2, center = stroke[0])
                    continue
                }
                val path = Path()
                path.moveTo(stroke[0].x, stroke[0].y)
                for (point in stroke.drop(1)) path.lineTo(point.x, point.y)
                drawPath(path, ink, style = pen)
            }
        }
    }
}

/** One row of a list: its number, the character, and where it sits on the keys, if it does. */
private class SketchRow(
    val number: Int,
    val codePoint: Int,
    val slot: Pair<Int, SwipeDirection?>?,
)

/**
 * The rows of `list` that match every word of `query` by name or code point. Searching all
 * candidates also finds members of their look-alike groups.
 */
private fun sketchListRows(
    list: SketchList,
    query: String,
    tiles: List<Tile>,
    charset: Charset,
): List<SketchRow> {
    val words = query.trim().split(Regex("\\s+")).filter { it.isNotEmpty() }

    fun matches(codePoint: Int): Boolean {
        val name = charset.characters.getValue(codePoint).name
        val code = "%04X".format(codePoint)
        return words.all { word ->
            name.contains(word, ignoreCase = true) ||
                code.contains(word.removePrefix("U+").removePrefix("u+"), ignoreCase = true)
        }
    }

    return when (list) {
        SketchList.Candidates -> {
            tiles.flatMapIndexed { rank, tile ->
                val codePoints = if (words.isEmpty()) listOf(tile.representative) else tile.members.filter(::matches)
                // Only the candidate itself is on a key, not the rest of its group
                codePoints.map { SketchRow(rank + 1, it, if (it == tile.representative) sketchSlot(rank) else null) }
            }
        }

        is SketchList.LookAlikes -> {
            val ranks = tiles.withIndex().associate { (rank, tile) -> tile.representative to rank }
            list.codePoints
                .mapIndexed { index, codePoint -> SketchRow(index + 1, codePoint, ranks[codePoint]?.let(::sketchSlot)) }
                .filter { matches(it.codePoint) }
        }
    }
}

/** A list over the whole sketch keyboard: all candidates, or one candidate's look-alikes. */
@Composable
private fun SketchListScreen(
    list: SketchList,
    tiles: List<Tile>,
    charset: Charset,
    onPick: (text: String) -> Unit,
    onSearch: () -> Unit,
    onClose: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val rows = remember(list, tiles, charset) { sketchListRows(list, "", tiles, charset) }
    Column(modifier = modifier.background(MaterialTheme.colorScheme.surface)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier =
                Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surfaceVariant)
                    .padding(horizontal = 4.dp),
        ) {
            // A back button at each end, like the clipboard history, for either thumb
            IconButton(onClick = onClose) {
                Icon(
                    imageVector = Icons.AutoMirrored.Outlined.ArrowBack,
                    contentDescription = stringResource(R.string.sketch_back),
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
            Text(
                text =
                    when (list) {
                        SketchList.Candidates -> {
                            stringResource(R.string.sketch_all_candidates, rows.size)
                        }

                        is SketchList.LookAlikes -> {
                            val first = charset.characters.getValue(list.codePoints.first()).displayText
                            stringResource(R.string.sketch_look_alikes, first, rows.size)
                        }
                    },
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.weight(1f),
            )
            IconButton(onClick = onClose) {
                Icon(
                    imageVector = Icons.AutoMirrored.Outlined.ArrowBack,
                    contentDescription = stringResource(R.string.sketch_back),
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
        }
        SearchField(
            text = "",
            hint = stringResource(R.string.sketch_search_hint),
            modifier = Modifier.clickable(onClick = onSearch),
        )
        LazyColumn {
            items(rows) { CandidateRow(it, charset, onPick) }
        }
    }
}

/**
 * The open list's search, over the keyboard while its letter keys type the query. It finds
 * characters by name or code point.
 */
@Composable
fun SketchSearch(
    state: SketchState,
    height: Dp,
    vibrateOnTap: Boolean,
    soundOnTap: Boolean,
    onPick: (text: String) -> Unit,
    onClose: () -> Unit,
) {
    val ctx = LocalContext.current
    val ime = ctx as IMEService
    val view = LocalView.current
    val feedback = rememberSketchFeedback(vibrateOnTap, soundOnTap)
    val charset = produceState<Charset?>(null) { value = runCatching { SketchRecognizer.get(ctx).charset }.getOrNull() }.value

    // The keys type into the search field while it's shown
    val field = remember { KeyboardFieldConnection(view, state.query) { state.query = it } }
    DisposableEffect(field) {
        ime.setInputRedirect(field)
        onDispose { ime.setInputRedirect(null) }
    }

    val list = state.list ?: SketchList.Candidates
    val rows =
        remember(list, state.query, state.tiles, charset) {
            charset?.let { sketchListRows(list, state.query, state.tiles, it) }.orEmpty()
        }

    Column(
        modifier =
            Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.surface),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier =
                Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surfaceVariant)
                    .padding(horizontal = 4.dp),
        ) {
            IconButton(onClick = onClose) {
                Icon(
                    imageVector = Icons.AutoMirrored.Outlined.ArrowBack,
                    contentDescription = stringResource(R.string.sketch_back),
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
            SearchField(
                text = state.query,
                hint = stringResource(R.string.sketch_search_hint),
                cursor = true,
                modifier = Modifier.weight(1f),
            )
            if (state.query.isNotEmpty()) {
                IconButton(onClick = { field.clear() }) {
                    Icon(
                        imageVector = Icons.Outlined.Close,
                        contentDescription = stringResource(R.string.sketch_clear_search),
                        tint = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            }
        }
        LazyColumn(modifier = Modifier.height(height)) {
            if (charset != null && rows.isEmpty()) {
                item {
                    Text(
                        text = stringResource(R.string.sketch_no_matches),
                        fontSize = 13.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.padding(16.dp),
                    )
                }
            }
            if (charset != null) {
                items(rows) { row ->
                    CandidateRow(row, charset) {
                        feedback()
                        onPick(it)
                    }
                }
            }
        }
    }
}

/** A search field's look, with a 🔎: the keyboard's keys, not a system keyboard, type in it. */
@Composable
private fun SearchField(
    text: String,
    hint: String,
    modifier: Modifier = Modifier,
    cursor: Boolean = false,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier =
            modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 6.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(MaterialTheme.colorScheme.surfaceContainerHighest)
                .heightIn(min = 40.dp)
                .padding(horizontal = 12.dp),
    ) {
        Icon(
            imageVector = Icons.Outlined.Search,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.size(20.dp),
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            if (text.isNotEmpty()) {
                Text(text = text, fontSize = 15.sp, maxLines = 1, color = MaterialTheme.colorScheme.onSurface)
            }
            if (cursor) {
                Box(
                    modifier =
                        Modifier
                            .width(2.dp)
                            .height(18.dp)
                            .background(MaterialTheme.colorScheme.primary),
                )
            }
            if (text.isEmpty()) {
                Text(
                    text = hint,
                    fontSize = 14.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(start = 2.dp),
                )
            }
        }
    }
}

/** One row of a list: number, character, name, code point and, if it's on a key, where. */
@Composable
private fun CandidateRow(
    row: SketchRow,
    charset: Charset,
    onPick: (text: String) -> Unit,
) {
    val info = charset.characters.getValue(row.codePoint)
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(6.dp),
        modifier =
            Modifier
                .fillMaxWidth()
                .heightIn(min = 52.dp)
                .clickable { onPick(info.text) }
                .padding(start = 8.dp, end = 10.dp, top = 4.dp, bottom = 4.dp),
    ) {
        Text(
            text = row.number.toString(),
            fontSize = 11.sp,
            fontFamily = FontFamily.Monospace,
            color = MaterialTheme.colorScheme.outline,
            textAlign = TextAlign.End,
            modifier = Modifier.width(30.dp),
        )
        Text(
            text = info.displayText,
            fontSize = 28.sp,
            lineHeight = 30.sp,
            color = MaterialTheme.colorScheme.onSurface,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(48.dp),
        )
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = info.name,
                fontSize = 12.sp,
                lineHeight = 15.sp,
                color = MaterialTheme.colorScheme.onSurface,
            )
            Text(
                text = codePointLabel(row.codePoint),
                fontSize = 10.5.sp,
                fontFamily = FontFamily.Monospace,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
        row.slot?.let { (key, direction) ->
            Text(
                text = stringResource(R.string.sketch_key_position, key + 1, swipeDirectionArrow(direction)),
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.primary,
            )
        }
    }
    HorizontalDivider(thickness = 0.5.dp, color = MaterialTheme.colorScheme.outlineVariant)
}

private fun codePointLabel(codePoint: Int) = "U+%04X".format(codePoint)
