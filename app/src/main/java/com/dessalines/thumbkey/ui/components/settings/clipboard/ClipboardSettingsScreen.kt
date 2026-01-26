package com.dessalines.thumbkey.ui.components.settings.clipboard

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccessTime
import androidx.compose.material.icons.outlined.CleaningServices
import androidx.compose.material.icons.outlined.ContentPaste
import androidx.compose.material.icons.outlined.DataArray
import androidx.compose.material.icons.outlined.DiscFull
import androidx.compose.material.icons.outlined.History
import androidx.compose.material.icons.outlined.HourglassEmpty
import androidx.compose.material.icons.outlined.HourglassTop
import androidx.compose.material.icons.outlined.Numbers
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.AppSettingsViewModel
import com.dessalines.thumbkey.db.ClipboardRepository
import com.dessalines.thumbkey.db.ClipboardSettingsUpdate
import com.dessalines.thumbkey.db.DEFAULT_CLIPBOARD_AUTO_CLEANUP_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_CLIPBOARD_CLEANUP_AFTER_MINUTES
import com.dessalines.thumbkey.db.DEFAULT_CLIPBOARD_HISTORY_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_CLIPBOARD_MAX_SIZE
import com.dessalines.thumbkey.db.DEFAULT_CLIPBOARD_SIZE_LIMIT_ENABLED
import com.dessalines.thumbkey.db.MAX_CLIPBOARD_MAX_SIZE
import com.dessalines.thumbkey.db.MIN_CLIPBOARD_MAX_SIZE
import com.dessalines.thumbkey.utils.SimpleTopAppBar
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.toBool
import com.dessalines.thumbkey.utils.toInt
import kotlinx.coroutines.launch
import me.zhanghai.compose.preference.ProvidePreferenceTheme
import me.zhanghai.compose.preference.SliderPreference
import me.zhanghai.compose.preference.SwitchPreference

enum class CleanupDuration(
    val minutes: Int,
    val displayNameResId: Int,
) {
    MINUTES_5(5, R.string.duration_5_minutes),
    MINUTES_10(10, R.string.duration_10_minutes),
    MINUTES_30(30, R.string.duration_30_minutes),
    HOURS_1(60, R.string.duration_1_hour),
    HOURS_2(2 * 60, R.string.duration_2_hours),
    HOURS_4(4 * 60, R.string.duration_4_hours),
    HOURS_12(12 * 60, R.string.duration_12_hours),
    DAYS_1(24 * 60, R.string.duration_1_day),
    DAYS_2(2 * 24 * 60, R.string.duration_2_days),
    DAYS_4(4 * 24 * 60, R.string.duration_4_days),
    DAYS_7(7 * 24 * 60, R.string.duration_7_days),
    ;

    companion object {
        fun fromIndex(index: Int): CleanupDuration = entries.getOrElse(index) { HOURS_2 }

        fun fromMinutes(minutes: Int): CleanupDuration = entries.find { it.minutes == minutes } ?: HOURS_2
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClipboardSettingsScreen(
    navController: NavController,
    appSettingsViewModel: AppSettingsViewModel,
    clipboardRepository: ClipboardRepository?,
) {
    Log.d(TAG, "Got to clipboard settings activity")

    val settings by appSettingsViewModel.appSettings.observeAsState()
    val scope = rememberCoroutineScope()

    var clipboardHistoryEnabledState =
        (settings?.clipboardHistoryEnabled ?: DEFAULT_CLIPBOARD_HISTORY_ENABLED).toBool()
    var clipboardAutoCleanupEnabledState =
        (settings?.clipboardAutoCleanupEnabled ?: DEFAULT_CLIPBOARD_AUTO_CLEANUP_ENABLED).toBool()
    val currentCleanupMinutes = settings?.clipboardCleanupAfterMinutes ?: DEFAULT_CLIPBOARD_CLEANUP_AFTER_MINUTES
    var clipboardCleanupDuration = CleanupDuration.fromMinutes(currentCleanupMinutes)
    var clipboardCleanupSliderState by remember {
        mutableFloatStateOf(clipboardCleanupDuration.ordinal.toFloat())
    }
    var clipboardSizeLimitEnabledState =
        (settings?.clipboardSizeLimitEnabled ?: DEFAULT_CLIPBOARD_SIZE_LIMIT_ENABLED).toBool()
    // Float is required because SliderPreference uses float values for the slider position
    var clipboardMaxSizeState =
        (settings?.clipboardMaxSize ?: DEFAULT_CLIPBOARD_MAX_SIZE).toFloat()
    var clipboardMaxSizeSliderState by remember { mutableFloatStateOf(clipboardMaxSizeState) }

    val snackbarHostState = remember { SnackbarHostState() }
    val scrollState = rememberScrollState()

    fun updateClipboardSettings() {
        appSettingsViewModel.updateClipboardSettings(
            ClipboardSettingsUpdate(
                id = 1,
                clipboardHistoryEnabled = clipboardHistoryEnabledState.toInt(),
                clipboardAutoCleanupEnabled = clipboardAutoCleanupEnabledState.toInt(),
                clipboardCleanupAfterMinutes = clipboardCleanupDuration.minutes,
                clipboardSizeLimitEnabled = clipboardSizeLimitEnabledState.toInt(),
                clipboardMaxSize = clipboardMaxSizeState.toInt(),
            ),
        )
        // Enforce size limit after updating settings
        scope.launch {
            clipboardRepository?.enforceSizeLimit()
        }
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            SimpleTopAppBar(
                text = stringResource(R.string.clipboard_history),
                navController = navController,
            )
        },
        content = { padding ->
            Column(
                modifier =
                    Modifier
                        .padding(padding)
                        .verticalScroll(scrollState)
                        .background(color = MaterialTheme.colorScheme.surface)
                        .imePadding(),
            ) {
                ProvidePreferenceTheme {
                    SwitchPreference(
                        value = clipboardHistoryEnabledState,
                        onValueChange = {
                            clipboardHistoryEnabledState = it
                            updateClipboardSettings()
                        },
                        title = {
                            Text(stringResource(R.string.clipboard_history_enabled))
                        },
                        summary = {
                            Text(stringResource(R.string.clipboard_history_enabled_description))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.ContentPaste,
                                contentDescription = null,
                            )
                        },
                    )
                    SwitchPreference(
                        value = clipboardAutoCleanupEnabledState,
                        onValueChange = {
                            clipboardAutoCleanupEnabledState = it
                            updateClipboardSettings()
                        },
                        enabled = clipboardHistoryEnabledState,
                        title = {
                            Text(stringResource(R.string.clipboard_auto_cleanup))
                        },
                        summary = {
                            Text(stringResource(R.string.clipboard_auto_cleanup_description))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.CleaningServices,
                                contentDescription = null,
                            )
                        },
                    )
                    SliderPreference(
                        value = clipboardCleanupDuration.ordinal.toFloat(),
                        sliderValue = clipboardCleanupSliderState,
                        onValueChange = {
                            clipboardCleanupDuration = CleanupDuration.fromIndex(it.toInt())
                            updateClipboardSettings()
                        },
                        onSliderValueChange = { clipboardCleanupSliderState = it },
                        valueRange = 0f..(CleanupDuration.entries.size - 1).toFloat(),
                        valueSteps = CleanupDuration.entries.size - 2,
                        enabled = clipboardHistoryEnabledState && clipboardAutoCleanupEnabledState,
                        title = {
                            val duration = CleanupDuration.fromIndex(clipboardCleanupSliderState.toInt())
                            Text(
                                stringResource(
                                    R.string.clipboard_cleanup_after,
                                    stringResource(duration.displayNameResId),
                                ),
                            )
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.HourglassTop,
                                contentDescription = null,
                            )
                        },
                    )
                    SwitchPreference(
                        value = clipboardSizeLimitEnabledState,
                        onValueChange = {
                            clipboardSizeLimitEnabledState = it
                            updateClipboardSettings()
                        },
                        enabled = clipboardHistoryEnabledState,
                        title = {
                            Text(stringResource(R.string.clipboard_size_limit))
                        },
                        summary = {
                            Text(stringResource(R.string.clipboard_size_limit_description))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.DiscFull,
                                contentDescription = null,
                            )
                        },
                    )
                    SliderPreference(
                        value = clipboardMaxSizeState,
                        sliderValue = clipboardMaxSizeSliderState,
                        onValueChange = {
                            clipboardMaxSizeState = it
                            updateClipboardSettings()
                        },
                        onSliderValueChange = { clipboardMaxSizeSliderState = it },
                        valueRange = MIN_CLIPBOARD_MAX_SIZE.toFloat()..MAX_CLIPBOARD_MAX_SIZE.toFloat(),
                        enabled = clipboardHistoryEnabledState && clipboardSizeLimitEnabledState,
                        title = {
                            Text(
                                stringResource(
                                    R.string.clipboard_max_size,
                                    clipboardMaxSizeSliderState.toInt(),
                                ),
                            )
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.DataArray,
                                contentDescription = null,
                            )
                        },
                    )
                }
            }
        },
    )
}
