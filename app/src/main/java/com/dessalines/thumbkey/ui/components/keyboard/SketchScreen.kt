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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material.icons.outlined.Draw
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

/**
 * Sketch mode: draw a character on the pad and type it from the candidate keys below.
 * The pad takes the three left columns, above the row of three candidate keys; the right
 * column holds the controls. `key` draws a keyboard key that sends sketch actions to
 * `onSketchAction`.
 */
@Composable
fun SketchScreen(
    layoutName: String,
    rowCount: Int,
    keyWidth: Float,
    keyHeight: Float,
    keyPadding: Int,
    keyBorderWidth: Float,
    cornerRadius: Float,
    vibrateOnTap: Boolean,
    soundOnTap: Boolean,
    onCommit: (text: String) -> Unit,
    key: @Composable (key: KeyItemC, onSketchAction: (KeyAction.Sketch) -> Unit) -> Unit,
) {
    val ctx = LocalContext.current
    val view = LocalView.current
    val audioManager = ctx.getSystemService(Context.AUDIO_SERVICE) as AudioManager

    val recognizer by produceState<Result<Recognizer>?>(null) {
        value = runCatching { SketchRecognizer.get(ctx) }
    }
    val loaded = recognizer?.getOrNull()
    val language = remember(loaded, layoutName) { loaded?.let { sketchLanguage(layoutName, it.charset.keyboardScripts) } }

    var strokes by remember { mutableStateOf(listOf<List<Offset>>()) }
    var tiles by remember { mutableStateOf(listOf<Tile>()) }
    var lookAlikes by remember { mutableStateOf<List<Int>?>(null) }
    var showList by remember { mutableStateOf(false) }

    // Recognize after each stroke. A new stroke restarts this, dropping the older query.
    LaunchedEffect(loaded, strokes, language) {
        if (loaded == null || strokes.isEmpty()) {
            tiles = emptyList()
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
        tiles = result.tiles
    }

    fun feedback() {
        if (vibrateOnTap) view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP)
        if (soundOnTap) audioManager.playSoundEffect(AudioManager.FX_KEY_CLICK, .1f)
    }

    fun commit(text: String) {
        onCommit(text)
        strokes = emptyList()
        lookAlikes = null
        showList = false
    }

    val onSketchAction: (KeyAction.Sketch) -> Unit = { action ->
        when (action) {
            is KeyAction.Sketch.CommitCandidate -> {
                commit(action.text)
            }

            is KeyAction.Sketch.ShowLookAlikes -> {
                lookAlikes = action.codePoints
            }

            KeyAction.Sketch.UndoStroke -> {
                strokes = strokes.dropLast(1)
                lookAlikes = null
            }

            KeyAction.Sketch.ClearPad -> {
                strokes = emptyList()
                lookAlikes = null
            }

            KeyAction.Sketch.ShowCandidateList -> {
                showList = true
                lookAlikes = null
            }
        }
    }

    val cornerLabels = (keyWidth + keyHeight) / 2 >= SKETCH_CORNER_LABELS_MIN_KEY_SIZE
    val candidateKeys =
        remember(tiles, loaded, cornerLabels) {
            (0 until SKETCH_CANDIDATE_KEYS).map { candidateKeyItem(it, tiles, loaded?.charset, cornerLabels) }
        }
    val controlKeys =
        listOf(SKETCH_BACK_KEY_ITEM, SKETCH_UNDO_KEY_ITEM, BACKSPACE_KEY_ITEM, SPACEBAR_SKINNY_KEY_ITEM, RETURN_KEY_ITEM)
            .take(rowCount.coerceAtLeast(3))

    val padShape = RoundedCornerShape(cornerRadius.dp)
    Box {
        Row {
            Column {
                Box(
                    modifier =
                        Modifier
                            .size((keyWidth * SKETCH_CANDIDATE_KEYS).dp, (keyHeight * (controlKeys.size - 1)).dp)
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
                        strokes = strokes,
                        hint =
                            when {
                                recognizer == null -> stringResource(R.string.sketch_loading)
                                loaded == null -> stringResource(R.string.sketch_load_failed)
                                else -> stringResource(R.string.sketch_hint)
                            },
                        onStroke = {
                            strokes = strokes + listOf(it)
                            lookAlikes = null
                        },
                    )
                    val charset = loaded?.charset
                    val members = lookAlikes
                    if (charset != null && members != null) {
                        LookAlikes(
                            codePoints = members,
                            charset = charset,
                            onPick = {
                                feedback()
                                commit(it)
                            },
                            onClose = { lookAlikes = null },
                        )
                    }
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
        if (showList && charset != null) {
            CandidateList(
                tiles = tiles,
                hasStrokes = strokes.isNotEmpty(),
                charset = charset,
                onPick = {
                    feedback()
                    commit(it)
                },
                onClose = { showList = false },
                modifier = Modifier.matchParentSize(),
            )
        }
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

/** The look-alikes of one candidate over the pad, the candidate first. */
@Composable
private fun LookAlikes(
    codePoints: List<Int>,
    charset: Charset,
    onPick: (text: String) -> Unit,
    onClose: () -> Unit,
) {
    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.surface),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier =
                Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surfaceVariant)
                    .padding(start = 14.dp),
        ) {
            codePoints.firstOrNull()?.let {
                Text(
                    text = charset.characters.getValue(it).displayText,
                    fontSize = 24.sp,
                    color = MaterialTheme.colorScheme.primary,
                )
            }
            Text(
                text = stringResource(R.string.sketch_look_alikes),
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.weight(1f).padding(start = 8.dp),
            )
            IconButton(onClick = onClose) {
                Icon(
                    imageVector = Icons.Outlined.Close,
                    contentDescription = stringResource(R.string.sketch_close),
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
        }
        LazyVerticalGrid(columns = GridCells.Fixed(4)) {
            itemsIndexed(codePoints) { index, codePoint ->
                val info = charset.characters.getValue(codePoint)
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp, Alignment.CenterVertically),
                    modifier =
                        Modifier
                            .aspectRatio(1f)
                            .background(
                                if (index == 0) {
                                    MaterialTheme.colorScheme.primaryContainer
                                } else {
                                    MaterialTheme.colorScheme.surface
                                },
                            ).border(0.5.dp, MaterialTheme.colorScheme.outlineVariant)
                            .clickable { onPick(info.text) },
                ) {
                    Text(
                        text = info.displayText,
                        fontSize = 30.sp,
                        lineHeight = 32.sp,
                        color = MaterialTheme.colorScheme.onSurface,
                    )
                    Text(
                        text = codePointLabel(codePoint),
                        fontSize = 9.5.sp,
                        fontFamily = FontFamily.Monospace,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            }
        }
    }
}

/** Every candidate by rank over the whole sketch keyboard, with where it sits on the keys. */
@Composable
private fun CandidateList(
    tiles: List<Tile>,
    hasStrokes: Boolean,
    charset: Charset,
    onPick: (text: String) -> Unit,
    onClose: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier.background(MaterialTheme.colorScheme.surface)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
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
                    if (hasStrokes) {
                        stringResource(R.string.sketch_all_candidates, tiles.size)
                    } else {
                        stringResource(R.string.sketch_draw_first)
                    },
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
            IconButton(onClick = onClose) {
                Icon(
                    imageVector = Icons.AutoMirrored.Outlined.ArrowBack,
                    contentDescription = stringResource(R.string.sketch_back),
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
        }
        LazyColumn {
            itemsIndexed(tiles) { rank, tile ->
                val info = charset.characters.getValue(tile.representative)
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
                        text = (rank + 1).toString(),
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
                            text = codePointLabel(tile.representative),
                            fontSize = 10.5.sp,
                            fontFamily = FontFamily.Monospace,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                    sketchSlot(rank)?.let { (key, direction) ->
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
        }
    }
}

private fun codePointLabel(codePoint: Int) = "U+%04X".format(codePoint)
