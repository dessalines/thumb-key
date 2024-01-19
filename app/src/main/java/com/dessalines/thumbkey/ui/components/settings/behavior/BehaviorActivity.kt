package com.dessalines.thumbkey.ui.components.settings.behavior

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Backspace
import androidx.compose.material.icons.outlined.Abc
import androidx.compose.material.icons.outlined.SpaceBar
import androidx.compose.material.icons.outlined.SwapHoriz
import androidx.compose.material.icons.outlined.Swipe
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
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.alorma.compose.settings.storage.base.SettingValueState
import com.alorma.compose.settings.storage.base.rememberBooleanSettingState
import com.alorma.compose.settings.storage.base.rememberFloatSettingState
import com.alorma.compose.settings.storage.base.rememberIntSettingState
import com.alorma.compose.settings.ui.SettingsCheckbox
import com.alorma.compose.settings.ui.SettingsList
import com.alorma.compose.settings.ui.SettingsSlider
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.AppSettingsViewModel
import com.dessalines.thumbkey.db.BehaviorUpdate
import com.dessalines.thumbkey.db.DEFAULT_AUTO_CAPITALIZE
import com.dessalines.thumbkey.db.DEFAULT_MIN_SWIPE_LENGTH
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_BACKSPACE_DEADZONE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_CURSOR_MOVEMENT_MODE
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_SENSITIVITY
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_SPACEBAR_DEADZONE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SPACEBAR_MULTITAPS
import com.dessalines.thumbkey.ui.components.common.TestOutTextField
import com.dessalines.thumbkey.ui.components.settings.about.SettingsDivider
import com.dessalines.thumbkey.utils.CursorAccelerationMode
import com.dessalines.thumbkey.utils.SimpleTopAppBar
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.toBool
import com.dessalines.thumbkey.utils.toInt

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BehaviorActivity(
    navController: NavController,
    appSettingsViewModel: AppSettingsViewModel,
) {
    Log.d(TAG, "Got to behavior activity")

    val settings by appSettingsViewModel.appSettings.observeAsState()

    val minSwipeLengthState =
        rememberFloatSettingState(
            (settings?.minSwipeLength ?: DEFAULT_MIN_SWIPE_LENGTH).toFloat(),
        )
    val slideSensitivityState =
        rememberFloatSettingState(
            (settings?.slideSensitivity ?: DEFAULT_SLIDE_SENSITIVITY).toFloat(),
        )
    val slideCursorMovementModeState =
        rememberIntSettingState(
            (settings?.slideCursorMovementMode ?: DEFAULT_SLIDE_CURSOR_MOVEMENT_MODE),
        )
    val slideEnabledState =
        rememberBooleanSettingState(
            (settings?.slideEnabled ?: DEFAULT_SLIDE_ENABLED).toBool(),
        )
    val slideSpacebarDeadzoneEnabledState =
        rememberBooleanSettingState(
            (settings?.slideSpacebarDeadzoneEnabled ?: DEFAULT_SLIDE_SPACEBAR_DEADZONE_ENABLED).toBool(),
        )
    val slideBackspaceDeadzoneEnabledState =
        rememberBooleanSettingState(
            (settings?.slideBackspaceDeadzoneEnabled ?: DEFAULT_SLIDE_BACKSPACE_DEADZONE_ENABLED).toBool(),
        )
    val autoCapitalizeState =
        rememberBooleanSettingState(
            ((settings?.autoCapitalize ?: DEFAULT_AUTO_CAPITALIZE).toBool()),
        )
    val spacebarMultiTapsState =
        rememberBooleanSettingState(
            ((settings?.spacebarMultiTaps ?: DEFAULT_SPACEBAR_MULTITAPS).toBool()),
        )

    val snackbarHostState = remember { SnackbarHostState() }

    val scrollState = rememberScrollState()

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            SimpleTopAppBar(
                text = stringResource(R.string.behavior),
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
                SettingsCheckbox(
                    state = autoCapitalizeState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Abc,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(stringResource(R.string.auto_capitalize))
                    },
                    onCheckedChange = {
                        updateBehavior(
                            appSettingsViewModel,
                            minSwipeLengthState,
                            slideSensitivityState,
                            slideEnabledState,
                            slideCursorMovementModeState,
                            slideSpacebarDeadzoneEnabledState,
                            slideBackspaceDeadzoneEnabledState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                        )
                    },
                )
                SettingsCheckbox(
                    state = spacebarMultiTapsState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.SpaceBar,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(stringResource(R.string.spacebar_multitaps))
                    },
                    onCheckedChange = {
                        updateBehavior(
                            appSettingsViewModel,
                            minSwipeLengthState,
                            slideSensitivityState,
                            slideEnabledState,
                            slideCursorMovementModeState,
                            slideSpacebarDeadzoneEnabledState,
                            slideBackspaceDeadzoneEnabledState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                        )
                    },
                )
                val minSwipeLengthStr =
                    stringResource(
                        R.string.min_swipe_length,
                        minSwipeLengthState.value.toInt().toString(),
                    )
                SettingsSlider(
                    valueRange = 0f..200f,
                    state = minSwipeLengthState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Swipe,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(minSwipeLengthStr)
                    },
                    onValueChangeFinished = {
                        updateBehavior(
                            appSettingsViewModel,
                            minSwipeLengthState,
                            slideSensitivityState,
                            slideEnabledState,
                            slideCursorMovementModeState,
                            slideSpacebarDeadzoneEnabledState,
                            slideBackspaceDeadzoneEnabledState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                        )
                    },
                )
                val slideSensitivityStr =
                    stringResource(
                        R.string.slide_sensitivity,
                        slideSensitivityState
                            .value
                            .toInt().toString(),
                    )
                SettingsDivider()
                SettingsCheckbox(
                    state = slideEnabledState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.SpaceBar,
                            contentDescription = stringResource(R.string.slide_enable),
                        )
                    },
                    title = {
                        Text(stringResource(R.string.slide_enable))
                    },
                    onCheckedChange = {
                        updateBehavior(
                            appSettingsViewModel,
                            minSwipeLengthState,
                            slideSensitivityState,
                            slideEnabledState,
                            slideCursorMovementModeState,
                            slideSpacebarDeadzoneEnabledState,
                            slideBackspaceDeadzoneEnabledState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                        )
                    },
                )
                SettingsList(
                    state = slideCursorMovementModeState,
                    enabled = slideEnabledState.value,
                    items = CursorAccelerationMode.entries.map { it.title() },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.SwapHoriz,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(stringResource(R.string.slide_cursor_movement_mode))
                    },
                    onItemSelected = { i, _ ->
                        slideCursorMovementModeState.value = i
                        updateBehavior(
                            appSettingsViewModel,
                            minSwipeLengthState,
                            slideSensitivityState,
                            slideEnabledState,
                            slideCursorMovementModeState,
                            slideSpacebarDeadzoneEnabledState,
                            slideBackspaceDeadzoneEnabledState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                        )
                    },
                )
                SettingsSlider(
                    valueRange = 1f..50f,
                    state = slideSensitivityState,
                    enabled = slideEnabledState.value,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.SwapHoriz,
                            contentDescription = slideSensitivityStr,
                        )
                    },
                    title = {
                        Text(slideSensitivityStr)
                    },
                    onValueChangeFinished = {
                        updateBehavior(
                            appSettingsViewModel,
                            minSwipeLengthState,
                            slideSensitivityState,
                            slideEnabledState,
                            slideCursorMovementModeState,
                            slideSpacebarDeadzoneEnabledState,
                            slideBackspaceDeadzoneEnabledState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                        )
                    },
                )
                SettingsCheckbox(
                    state = slideSpacebarDeadzoneEnabledState,
                    enabled = slideEnabledState.value,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.SpaceBar,
                            contentDescription = stringResource(R.string.slide_spacebar_deadzone_enable),
                        )
                    },
                    title = {
                        Text(stringResource(R.string.slide_spacebar_deadzone_enable))
                    },
                    onCheckedChange = {
                        updateBehavior(
                            appSettingsViewModel,
                            minSwipeLengthState,
                            slideSensitivityState,
                            slideEnabledState,
                            slideCursorMovementModeState,
                            slideSpacebarDeadzoneEnabledState,
                            slideBackspaceDeadzoneEnabledState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                        )
                    },
                )
                SettingsCheckbox(
                    state = slideBackspaceDeadzoneEnabledState,
                    enabled = slideEnabledState.value,
                    icon = {
                        Icon(
                            imageVector = Icons.AutoMirrored.Outlined.Backspace,
                            contentDescription = stringResource(R.string.slide_backspace_deadzone_enable),
                        )
                    },
                    title = {
                        Text(stringResource(R.string.slide_backspace_deadzone_enable))
                    },
                    onCheckedChange = {
                        updateBehavior(
                            appSettingsViewModel,
                            minSwipeLengthState,
                            slideSensitivityState,
                            slideEnabledState,
                            slideCursorMovementModeState,
                            slideSpacebarDeadzoneEnabledState,
                            slideBackspaceDeadzoneEnabledState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                        )
                    },
                )
                SettingsDivider()
                TestOutTextField()
            }
        },
    )
}

private fun updateBehavior(
    appSettingsViewModel: AppSettingsViewModel,
    minSwipeLengthState: SettingValueState<Float>,
    slideSensitivityState: SettingValueState<Float>,
    slideEnabledState: SettingValueState<Boolean>,
    slideCursorMovementModeState: SettingValueState<Int>,
    slideSpacebarDeadzoneEnabledState: SettingValueState<Boolean>,
    slideBackspaceDeadzoneEnabledState: SettingValueState<Boolean>,
    autoCapitalizeState: SettingValueState<Boolean>,
    spacebarMultiTapsState: SettingValueState<Boolean>,
) {
    appSettingsViewModel.updateBehavior(
        BehaviorUpdate(
            id = 1,
            minSwipeLength = minSwipeLengthState.value.toInt(),
            slideSensitivity = slideSensitivityState.value.toInt(),
            slideEnabled = slideEnabledState.value.toInt(),
            slideCursorMovementMode = slideCursorMovementModeState.value,
            slideSpacebarDeadzoneEnabled = slideSpacebarDeadzoneEnabledState.value.toInt(),
            slideBackspaceDeadzoneEnabled = slideBackspaceDeadzoneEnabledState.value.toInt(),
            autoCapitalize = autoCapitalizeState.value.toInt(),
            spacebarMultiTaps = spacebarMultiTapsState.value.toInt(),
        ),
    )
}
