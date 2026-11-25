package com.dessalines.thumbkey.ui.components.keyboard

import android.content.Context
import android.graphics.Paint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dessalines.thumbkey.IMEService
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.ClipboardItem
import com.dessalines.thumbkey.utils.KeyboardFieldConnection
import com.dessalines.thumbkey.utils.TAG
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext

/** What the keyboard's own search field, typed with the layout's keys, is searching. */
enum class KeyboardSearchTarget {
    EMOJI,
    CLIPBOARD,
}

/**
 * The emoji and clipboard searches. While `target` is set, the layout's letter keys show
 * under the search and type into it, like sketch mode's search.
 */
@Stable
class KeyboardSearchState {
    // The open search, or null for none
    var target by mutableStateOf<KeyboardSearchTarget?>(null)

    // Each search keeps its own query, also while it's closed
    private val queries = mutableStateMapOf<KeyboardSearchTarget, String>()

    // The open search's query
    var query: String
        get() = target?.let { queries[it] }.orEmpty()
        set(value) {
            target?.let { queries[it] = value }
        }
}

/**
 * A field of the keyboard's own that the keys type into while it's shown, instead of the
 * app's text field. `onChange` gets its text after every edit.
 */
@Composable
private fun rememberRedirectedField(
    initialText: String,
    onChange: (String) -> Unit,
): KeyboardFieldConnection {
    val ime = LocalContext.current as IMEService
    val view = LocalView.current
    val field = remember { KeyboardFieldConnection(view, initialText, onChange) }
    DisposableEffect(field) {
        ime.setInputRedirect(field)
        onDispose { ime.setInputRedirect(null) }
    }
    return field
}

/** The words of a search query. */
private fun queryWords(query: String) = query.trim().split(Regex("\\s+")).filter { it.isNotEmpty() }

/** A search's top bar: back, the field the keys type into, and clear once there's a query. */
@Composable
private fun SearchBar(
    query: String,
    hint: String,
    onClear: () -> Unit,
    onClose: () -> Unit,
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
                contentDescription = stringResource(R.string.search_back),
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
        SearchField(
            text = query,
            hint = hint,
            cursor = true,
            modifier = Modifier.weight(1f),
        )
        if (query.isNotEmpty()) {
            IconButton(onClick = onClear) {
                Icon(
                    imageVector = Icons.Outlined.Close,
                    contentDescription = stringResource(R.string.sketch_clear_search),
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
        }
    }
}

@Composable
private fun NoMatches(text: String) {
    Text(
        text = text,
        fontSize = 13.sp,
        color = MaterialTheme.colorScheme.onSurfaceVariant,
        modifier = Modifier.padding(16.dp),
    )
}

/**
 * The search field shown at the top of the emoji picker and the clipboard history. It only
 * looks like a field: tapping it opens the search, which the keyboard's own keys type into.
 */
@Composable
fun SearchEntryField(
    hint: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    SearchField(
        text = "",
        hint = hint,
        modifier = modifier.clickable(onClick = onClick),
    )
}

/** About how tall a [SearchEntryField] is, to leave room for it. */
val SEARCH_ENTRY_FIELD_HEIGHT = 52.dp

// Emoji search

/**
 * The fields of one CSV line (RFC 4180): a quoted field may hold commas, and a doubled quote
 * inside it stands for one quote. The index has no line breaks inside fields.
 */
internal fun parseCsvLine(line: String): List<String> {
    val fields = mutableListOf<String>()
    val field = StringBuilder()
    var quoted = false
    var index = 0
    while (index < line.length) {
        val char = line[index]
        when {
            quoted && char == '"' && line.getOrNull(index + 1) == '"' -> {
                field.append('"')
                index++
            }

            char == '"' && (quoted || field.isEmpty()) -> {
                quoted = !quoted
            }

            !quoted && char == ',' -> {
                fields.add(field.toString())
                field.clear()
            }

            else -> {
                field.append(char)
            }
        }
        index++
    }
    fields.add(field.toString())
    return fields
}

/** One emoji of the search index, with its name and keywords. */
class EmojiSearchEntry(
    val emoji: String,
    val name: String,
    keywords: String,
) {
    private val nameWords = searchWords(name)
    private val keywordWords = searchWords(keywords)

    // 0 if every word starts a word of the name, 1 if some only start a keyword, or null
    fun rank(words: List<String>): Int? {
        var rank = 0
        for (word in words) {
            when {
                nameWords.any { it.startsWith(word, ignoreCase = true) } -> {}

                keywordWords.any { it.startsWith(word, ignoreCase = true) } -> {
                    rank = 1
                }

                else -> {
                    return null
                }
            }
        }
        return rank
    }

    private companion object {
        fun searchWords(text: String) = text.split(Regex("[^\\p{L}\\p{N}’'-]+")).filter { it.isNotEmpty() }
    }
}

/**
 * The emoji search index, read once from assets/emoji_search.csv (see
 * ./gradlew generateEmojiSearchData), without the emoji this phone's fonts can't draw.
 */
object EmojiSearchIndex {
    private const val ASSET = "emoji_search.csv"
    private val mutex = Mutex()
    private var entries: List<EmojiSearchEntry>? = null

    suspend fun get(ctx: Context): List<EmojiSearchEntry> =
        mutex.withLock {
            entries ?: withContext(Dispatchers.IO) { load(ctx.applicationContext) }.also { entries = it }
        }

    private fun load(ctx: Context): List<EmojiSearchEntry> {
        val paint = Paint()
        return ctx.assets.open(ASSET).bufferedReader().useLines { lines ->
            lines
                .drop(1) // The header: emoji,name,keywords
                .filter { it.isNotBlank() }
                .mapNotNull { line ->
                    val fields = parseCsvLine(line)
                    val emoji = fields[0]
                    if (fields.size < 2 || !paint.hasGlyph(emoji)) {
                        null
                    } else {
                        EmojiSearchEntry(emoji, fields[1], fields.getOrElse(2) { "" })
                    }
                }.toList()
        }
    }

    /**
     * The emoji whose names or keywords have a word starting with each word of `query`, those
     * that match by name first. An empty query matches every emoji.
     */
    fun search(
        entries: List<EmojiSearchEntry>,
        query: String,
    ): List<EmojiSearchEntry> {
        val words = queryWords(query)
        if (words.isEmpty()) return entries
        return entries
            .mapNotNull { entry -> entry.rank(words)?.let { entry to it } }
            .sortedBy { it.second }
            .map { it.first }
    }
}

/**
 * The emoji picker's search, over the keyboard while its letter keys type the query. It finds
 * emoji by name and keyword. `onPick` gets the tapped emoji.
 */
@Composable
fun EmojiSearch(
    state: KeyboardSearchState,
    height: Dp,
    vibrateOnTap: Boolean,
    soundOnTap: Boolean,
    onPick: (emoji: String) -> Unit,
    onClose: () -> Unit,
) {
    val ctx = LocalContext.current
    val feedback = rememberSketchFeedback(vibrateOnTap, soundOnTap)
    val field = rememberRedirectedField(state.query) { state.query = it }
    val index =
        produceState<List<EmojiSearchEntry>?>(null) {
            value =
                runCatching { EmojiSearchIndex.get(ctx) }
                    .onFailure { Log.e(TAG, "Couldn't load the emoji search index", it) }
                    .getOrDefault(emptyList())
        }.value
    val results = remember(index, state.query) { index?.let { EmojiSearchIndex.search(it, state.query) }.orEmpty() }
    // New results show from the top. The grid would otherwise stay on the emoji it showed first.
    val gridState = rememberLazyGridState()
    LaunchedEffect(results) { gridState.scrollToItem(0) }

    Column(
        modifier =
            Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.surface),
    ) {
        SearchBar(
            query = state.query,
            hint = stringResource(R.string.emoji_search_hint),
            onClear = { field.clear() },
            onClose = onClose,
        )
        Box(modifier = Modifier.height(height)) {
            when {
                index == null -> {}

                results.isEmpty() -> {
                    NoMatches(stringResource(R.string.emoji_search_no_matches))
                }

                else -> {
                    LazyVerticalGrid(
                        state = gridState,
                        columns = GridCells.Adaptive(minSize = 48.dp),
                        contentPadding =
                            PaddingValues(4.dp),
                    ) {
                        items(results, key = { it.emoji }) { entry ->
                            Text(
                                text = entry.emoji,
                                fontSize = 28.sp,
                                lineHeight = 34.sp,
                                textAlign = TextAlign.Center,
                                modifier =
                                    Modifier
                                        .clickable {
                                            feedback()
                                            onPick(entry.emoji)
                                        }.padding(vertical = 6.dp)
                                        .semantics { contentDescription = entry.name },
                            )
                        }
                    }
                }
            }
        }
    }
}

// Clipboard search

/** The clipboard items whose text contains every word of `query`, ignoring case. */
fun searchClipboardItems(
    items: List<ClipboardItem>,
    query: String,
): List<ClipboardItem> {
    val words = queryWords(query)
    return items.filter { item -> words.all { item.text.contains(it, ignoreCase = true) } }
}

/**
 * The clipboard history's search, over the keyboard while its letter keys type the query.
 * Pinned items come first, as in the history.
 */
@Composable
fun ClipboardSearch(
    state: KeyboardSearchState,
    clipboardItems: List<ClipboardItem>,
    height: Dp,
    keyPadding: Int,
    cornerRadius: Float,
    vibrateOnTap: Boolean,
    onItemClick: (ClipboardItem) -> Unit,
    onItemPaste: (ClipboardItem) -> Unit,
    onItemDelete: (ClipboardItem) -> Unit,
    onItemTogglePin: (ClipboardItem) -> Unit,
    onClose: () -> Unit,
) {
    val field = rememberRedirectedField(state.query) { state.query = it }
    val results =
        remember(clipboardItems, state.query) {
            searchClipboardItems(clipboardItems, state.query).sortedByDescending { it.isPinned }
        }
    // New results show from the top, as in the emoji search
    val listState = rememberLazyListState()
    LaunchedEffect(state.query) { listState.scrollToItem(0) }

    Column(
        modifier =
            Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.surfaceContainerLow),
    ) {
        SearchBar(
            query = state.query,
            hint = stringResource(R.string.clipboard_search_hint),
            onClear = { field.clear() },
            onClose = onClose,
        )
        Box(modifier = Modifier.height(height)) {
            if (results.isEmpty()) {
                NoMatches(stringResource(R.string.clipboard_search_no_matches))
            } else {
                LazyColumn(
                    state = listState,
                    modifier = Modifier.padding(horizontal = keyPadding.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                    contentPadding =
                        PaddingValues(vertical = 4.dp),
                ) {
                    items(results, key = { it.id }) { item ->
                        ClipboardItemRow(
                            item = item,
                            onClick = { onItemClick(item) },
                            onPaste = { onItemPaste(item) },
                            onDelete = { onItemDelete(item) },
                            onTogglePin = { onItemTogglePin(item) },
                            cornerRadius = cornerRadius,
                            vibrateOnTap = vibrateOnTap,
                        )
                    }
                }
            }
        }
    }
}
