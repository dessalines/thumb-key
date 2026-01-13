package com.dessalines.thumbkey.ui.components.keyboard

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.outlined.ContentPaste
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.DeleteSweep
import androidx.compose.material.icons.outlined.PushPin
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.PlainTooltip
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TooltipBox
import androidx.compose.material3.TooltipDefaults
import androidx.compose.material3.rememberTooltipState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.ClipboardItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClipboardHistoryScreen(
    clipboardItems: List<ClipboardItem>,
    isEnabled: Boolean,
    onItemClick: (ClipboardItem) -> Unit,
    onItemPaste: (ClipboardItem) -> Unit,
    onItemDelete: (ClipboardItem) -> Unit,
    onItemTogglePin: (ClipboardItem) -> Unit,
    onBack: () -> Unit,
    onClearAll: () -> Unit,
    onGoToClipboardSettings: () -> Unit,
    keyHeight: Float,
    keyPadding: Int,
    cornerRadius: Float,
    modifier: Modifier = Modifier,
) {
    val headerHeight = (keyHeight * 0.6f).dp
    val backdropColor = MaterialTheme.colorScheme.surfaceContainerLow

    Column(
        modifier =
            modifier
                .fillMaxSize()
                .background(backdropColor),
    ) {
        // Header row
        ClipboardHeader(
            onBack = onBack,
            onClearAll = onClearAll,
            showClearAll = isEnabled,
            height = headerHeight,
            keyPadding = keyPadding,
            cornerRadius = cornerRadius,
        )

        // Show disabled state
        if (!isEnabled) {
            ClipboardDisabledView(
                onGoToClipboardSettings = onGoToClipboardSettings,
                cornerRadius = cornerRadius,
            )
        } else if (clipboardItems.isEmpty()) {
            // Clipboard items list - empty state
            Box(
                modifier =
                    Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = stringResource(R.string.clipboard_empty),
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
        } else {
            val pinnedItems = clipboardItems.filter { it.isPinned }
            val unpinnedItems = clipboardItems.filter { !it.isPinned }

            LazyColumn(
                modifier =
                    Modifier
                        .fillMaxSize()
                        .padding(horizontal = keyPadding.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                // Pinned section
                if (pinnedItems.isNotEmpty()) {
                    items(pinnedItems, key = { it.id }) { item ->
                        ClipboardItemRow(
                            item = item,
                            onClick = { onItemClick(item) },
                            onPaste = { onItemPaste(item) },
                            onDelete = { onItemDelete(item) },
                            onTogglePin = { onItemTogglePin(item) },
                            cornerRadius = cornerRadius,
                        )
                    }
                }

                // Unpinned section
                if (unpinnedItems.isNotEmpty()) {
                    items(unpinnedItems, key = { it.id }) { item ->
                        ClipboardItemRow(
                            item = item,
                            onClick = { onItemClick(item) },
                            onPaste = { onItemPaste(item) },
                            onDelete = { onItemDelete(item) },
                            onTogglePin = { onItemTogglePin(item) },
                            cornerRadius = cornerRadius,
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun ClipboardDisabledView(
    onGoToClipboardSettings: () -> Unit,
    cornerRadius: Float,
) {
    Box(
        modifier =
            Modifier
                .fillMaxSize()
                .padding(16.dp),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(
                text = stringResource(R.string.clipboard_disabled),
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
            Button(
                onClick = onGoToClipboardSettings,
                shape = RoundedCornerShape(cornerRadius.dp),
            ) {
                Text(stringResource(R.string.clipboard_go_to_settings))
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ClipboardHeader(
    onBack: () -> Unit,
    onClearAll: () -> Unit,
    showClearAll: Boolean,
    height: Dp,
    keyPadding: Int,
    cornerRadius: Float,
) {
    val backTooltipState = rememberTooltipState()
    val clearTooltipState = rememberTooltipState()
    val backRightTooltipState = rememberTooltipState()

    Surface(
        modifier =
            Modifier
                .fillMaxWidth()
                .height(height)
                .padding(keyPadding.dp)
                .clip(RoundedCornerShape(cornerRadius.dp)),
        color = MaterialTheme.colorScheme.surfaceContainerHigh,
    ) {
        Row(
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            // Back button with tooltip (left side)
            TooltipBox(
                positionProvider = TooltipDefaults.rememberPlainTooltipPositionProvider(),
                tooltip = {
                    PlainTooltip {
                        Text(stringResource(R.string.clipboard_back))
                    }
                },
                state = backTooltipState,
            ) {
                IconButton(onClick = onBack) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Outlined.ArrowBack,
                        contentDescription = stringResource(R.string.clipboard_back),
                        tint = MaterialTheme.colorScheme.onSurface,
                    )
                }
            }

            Text(
                text = stringResource(R.string.clipboard_history),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface,
            )

            // Right side buttons
            Row {
                // Clear all button with tooltip (only show when enabled)
                if (showClearAll) {
                    TooltipBox(
                        positionProvider = TooltipDefaults.rememberPlainTooltipPositionProvider(),
                        tooltip = {
                            PlainTooltip {
                                Text(stringResource(R.string.clipboard_clear_all))
                            }
                        },
                        state = clearTooltipState,
                    ) {
                        IconButton(onClick = onClearAll) {
                            Icon(
                                imageVector = Icons.Outlined.DeleteSweep,
                                contentDescription = stringResource(R.string.clipboard_clear_all),
                                tint = MaterialTheme.colorScheme.onSurface,
                            )
                        }
                    }
                }

                // Back button (right side for right-handed users)
                TooltipBox(
                    positionProvider = TooltipDefaults.rememberPlainTooltipPositionProvider(),
                    tooltip = {
                        PlainTooltip {
                            Text(stringResource(R.string.clipboard_back))
                        }
                    },
                    state = backRightTooltipState,
                ) {
                    IconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Outlined.ArrowBack,
                            contentDescription = stringResource(R.string.clipboard_back),
                            tint = MaterialTheme.colorScheme.onSurface,
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun formatTimestamp(timestamp: Long): String {
    val now = System.currentTimeMillis()
    val diff = now - timestamp
    val minutes = (diff / (1000 * 60)).toInt()
    val hours = minutes / 60
    val remainingMinutes = minutes % 60

    return when {
        minutes < 1 -> {
            stringResource(R.string.clipboard_just_now)
        }

        hours < 1 -> {
            stringResource(R.string.clipboard_minutes_ago, minutes)
        }

        hours < 24 && remainingMinutes == 0 -> {
            stringResource(R.string.clipboard_hours_ago, hours)
        }

        hours < 24 -> {
            stringResource(R.string.clipboard_hours_minutes_ago, hours, remainingMinutes)
        }

        else -> {
            val formatter = java.text.SimpleDateFormat("MMM d, h:mm a", java.util.Locale.getDefault())
            formatter.format(java.util.Date(timestamp))
        }
    }
}

@Composable
private fun ClipboardItemRow(
    item: ClipboardItem,
    onClick: () -> Unit,
    onPaste: () -> Unit,
    onDelete: () -> Unit,
    onTogglePin: () -> Unit,
    cornerRadius: Float,
) {
    var showContextMenu by remember { mutableStateOf(false) }
    // Track the press location for context menu positioning
    var pressOffset by remember { mutableStateOf(Offset.Zero) }
    val density = LocalDensity.current

    Box {
        Surface(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(cornerRadius.dp))
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onTap = { onClick() },
                            onLongPress = { offset ->
                                pressOffset = offset
                                showContextMenu = true
                            },
                        )
                    },
            color = MaterialTheme.colorScheme.surfaceContainer,
        ) {
            Row(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                // Pin indicator
                if (item.isPinned) {
                    Icon(
                        imageVector = Icons.Outlined.PushPin,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp),
                        tint = MaterialTheme.colorScheme.primary,
                    )
                }

                // Content (text)
                Text(
                    text = middleTruncate(item.text),
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.weight(1f),
                )

                // Timestamp and character count (right side)
                Column(
                    horizontalAlignment = Alignment.End,
                ) {
                    Text(
                        text = formatTimestamp(item.timestamp),
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                    if (item.text.length > calculateMaxDisplayLength()) {
                        Text(
                            text = stringResource(R.string.clipboard_characters, item.text.length),
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                }
            }
        }

        // Context menu positioned at the long-press location
        val menuOffset =
            with(density) {
                DpOffset(pressOffset.x.toDp(), pressOffset.y.toDp())
            }
        DropdownMenu(
            expanded = showContextMenu,
            onDismissRequest = { showContextMenu = false },
            offset = menuOffset,
            properties = PopupProperties(focusable = false),
        ) {
            DropdownMenuItem(
                text = { Text(stringResource(R.string.clipboard_paste)) },
                onClick = {
                    showContextMenu = false
                    onPaste()
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.ContentPaste,
                        contentDescription = null,
                    )
                },
            )
            DropdownMenuItem(
                text = { Text(stringResource(R.string.clipboard_delete)) },
                onClick = {
                    showContextMenu = false
                    onDelete()
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Delete,
                        contentDescription = null,
                    )
                },
            )
            DropdownMenuItem(
                text = {
                    Text(
                        if (item.isPinned) {
                            stringResource(R.string.clipboard_unpin)
                        } else {
                            stringResource(R.string.clipboard_pin)
                        },
                    )
                },
                onClick = {
                    showContextMenu = false
                    onTogglePin()
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.PushPin,
                        contentDescription = null,
                    )
                },
            )
        }
    }
}

@Composable
private fun calculateMaxDisplayLength(): Int {
    val configuration = LocalConfiguration.current
    // Estimate ~7dp per character at body medium size, minus padding
    val availableWidth = configuration.screenWidthDp - 80 // Subtract padding and icons
    return (availableWidth / 7).coerceIn(30, 80)
}

@Composable
private fun middleTruncate(text: String) =
    buildAnnotatedString {
        val maxDisplayLength = calculateMaxDisplayLength()
        val truncationPartLength = (maxDisplayLength - 3) / 2 // -3 for "..."
        val cleanText = text.replace("\n", " ").replace("\r", "")
        if (cleanText.length <= maxDisplayLength) {
            append(cleanText)
        } else {
            val head = cleanText.take(truncationPartLength)
            val tail = cleanText.takeLast(truncationPartLength)

            append(head)
            withStyle(SpanStyle(color = MaterialTheme.colorScheme.outline)) {
                append("...")
            }
            append(tail)
        }
    }
