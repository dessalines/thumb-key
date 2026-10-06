package com.dessalines.thumbkey.ui.components.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Clear
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.dessalines.thumbkey.R
import me.zhanghai.compose.preference.Preference

/**
 * A variant of [me.zhanghai.compose.preference.MultiSelectListPreference] whose dialog has a
 * search box that filters the list of values using [searchFilter]. The values that were
 * selected when the dialog opened are pinned above the full list.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun <T> SearchableMultiSelectListPreference(
    value: Set<T>,
    onValueChange: (Set<T>) -> Unit,
    values: List<T>,
    title: @Composable () -> Unit,
    searchPlaceholder: String,
    emptySearchText: String,
    modifier: Modifier = Modifier,
    icon: @Composable (() -> Unit)? = null,
    summary: @Composable (() -> Unit)? = null,
    valueToText: (T) -> AnnotatedString = { AnnotatedString(it.toString()) },
    searchFilter: (value: T, text: String, query: String) -> Boolean = { _, text, query ->
        text.contains(query, ignoreCase = true)
    },
) {
    var openDialog by rememberSaveable { mutableStateOf(false) }
    Preference(
        title = title,
        modifier = modifier,
        icon = icon,
        summary = summary,
    ) {
        openDialog = true
    }
    if (openDialog) {
        var dialogValue by rememberSaveable { mutableStateOf(value) }
        var query by rememberSaveable { mutableStateOf("") }
        // Snapshot of the selection when the dialog opened. Unchecking an item keeps it pinned
        // until the dialog is closed and reopened.
        val pinnedValues = rememberSaveable { values.filter { it in value } }
        val filteredPinnedValues =
            remember(pinnedValues, query) {
                pinnedValues.filter { searchFilter(it, valueToText(it).text, query) }
            }
        val filteredValues =
            remember(values, query) {
                values.filter { searchFilter(it, valueToText(it).text, query) }
            }
        val onToggle: (T, Boolean) -> Unit = { itemValue, checked ->
            dialogValue = if (checked) dialogValue + itemValue else dialogValue - itemValue
        }

        BasicAlertDialog(onDismissRequest = { openDialog = false }) {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = AlertDialogDefaults.shape,
                color = AlertDialogDefaults.containerColor,
                tonalElevation = AlertDialogDefaults.TonalElevation,
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Box(
                        modifier =
                            Modifier
                                .fillMaxWidth()
                                .padding(start = 24.dp, top = 24.dp, end = 24.dp, bottom = 16.dp),
                    ) {
                        ProvideDialogTitleStyle(title)
                    }
                    OutlinedTextField(
                        value = query,
                        onValueChange = { query = it },
                        modifier =
                            Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                        placeholder = { Text(searchPlaceholder) },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Outlined.Search,
                                contentDescription = null,
                            )
                        },
                        trailingIcon =
                            if (query.isNotEmpty()) {
                                {
                                    IconButton(onClick = { query = "" }) {
                                        Icon(
                                            imageVector = Icons.Outlined.Clear,
                                            contentDescription = stringResource(R.string.clear_search),
                                        )
                                    }
                                }
                            } else {
                                null
                            },
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                    )
                    // weight(1f) keeps the dialog at a stable height while the list shrinks
                    LazyColumn(
                        modifier =
                            Modifier
                                .fillMaxWidth()
                                .weight(1f)
                                .padding(top = 8.dp),
                    ) {
                        if (filteredValues.isEmpty()) {
                            item {
                                Text(
                                    text = emptySearchText,
                                    modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp),
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    style = MaterialTheme.typography.bodyLarge,
                                )
                            }
                        }
                        // The pinned rows are duplicates; each value also appears in the full list below.
                        items(filteredPinnedValues) { itemValue ->
                            SearchableMultiSelectItem(
                                text = valueToText(itemValue),
                                checked = itemValue in dialogValue,
                                onToggle = { onToggle(itemValue, it) },
                            )
                        }
                        if (filteredPinnedValues.isNotEmpty()) {
                            item {
                                HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                            }
                        }
                        items(filteredValues) { itemValue ->
                            SearchableMultiSelectItem(
                                text = valueToText(itemValue),
                                checked = itemValue in dialogValue,
                                onToggle = { onToggle(itemValue, it) },
                            )
                        }
                    }
                    Row(
                        modifier =
                            Modifier
                                .fillMaxWidth()
                                .padding(start = 24.dp, top = 16.dp, end = 24.dp, bottom = 24.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.End),
                    ) {
                        TextButton(onClick = { openDialog = false }) {
                            Text(text = stringResource(android.R.string.cancel))
                        }
                        TextButton(
                            onClick = {
                                onValueChange(dialogValue)
                                openDialog = false
                            },
                        ) {
                            Text(text = stringResource(android.R.string.ok))
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ProvideDialogTitleStyle(title: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalContentColor provides AlertDialogDefaults.titleContentColor,
        LocalTextStyle provides LocalTextStyle.current.merge(MaterialTheme.typography.headlineSmall),
        content = title,
    )
}

@Composable
private fun SearchableMultiSelectItem(
    text: AnnotatedString,
    checked: Boolean,
    onToggle: (Boolean) -> Unit,
) {
    Row(
        modifier =
            Modifier
                .fillMaxWidth()
                .heightIn(min = 48.dp)
                .toggleable(
                    value = checked,
                    role = Role.Checkbox,
                    onValueChange = onToggle,
                ).padding(horizontal = 24.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Checkbox(checked = checked, onCheckedChange = null)
        Spacer(modifier = Modifier.width(24.dp))
        Text(
            text = text,
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.bodyLarge,
        )
    }
}
