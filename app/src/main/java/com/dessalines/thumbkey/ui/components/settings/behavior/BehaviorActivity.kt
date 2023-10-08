package com.dessalines.thumbkey.ui.components.settings.behavior

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Abc
import androidx.compose.material.icons.outlined.SpaceBar
import androidx.compose.material.icons.outlined.SwapHoriz
import androidx.compose.material.icons.outlined.Swipe
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.alorma.compose.settings.storage.base.SettingValueState
import com.alorma.compose.settings.storage.base.rememberBooleanSettingState
import com.alorma.compose.settings.storage.base.rememberFloatSettingState
import com.alorma.compose.settings.ui.SettingsCheckbox
import com.alorma.compose.settings.ui.SettingsSlider
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.AppSettingsViewModel
import com.dessalines.thumbkey.db.BehaviorUpdate
import com.dessalines.thumbkey.db.DEFAULT_AUTO_CAPITALIZE
import com.dessalines.thumbkey.db.DEFAULT_MIN_SWIPE_LENGTH
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_SENSITIVITY
import com.dessalines.thumbkey.db.DEFAULT_SPACEBAR_MULTITAPS
import com.dessalines.thumbkey.ui.components.common.TestOutTextField
import com.dessalines.thumbkey.ui.components.settings.about.SettingsDivider
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

    val settings = appSettingsViewModel.appSettings.observeAsState().value

    val minSwipeLengthState = rememberFloatSettingState(
        (settings?.minSwipeLength ?: DEFAULT_MIN_SWIPE_LENGTH).toFloat(),
    )
    val slideSensitivityState = rememberFloatSettingState(
        (settings?.slideSensitivity ?: DEFAULT_SLIDE_SENSITIVITY).toFloat(),
    )
    val slideEnabledState = rememberBooleanSettingState(
        (settings?.slideEnabled ?: DEFAULT_SLIDE_ENABLED).toBool(),
    )
    val autoCapitalizeState = rememberBooleanSettingState(
        ((settings?.autoCapitalize ?: DEFAULT_AUTO_CAPITALIZE).toBool()),
    )
    val spacebarMultiTapsState = rememberBooleanSettingState(
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
                modifier = Modifier
                    .padding(padding)
                    .verticalScroll(scrollState)
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
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                        )
                    },
                )
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
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                        )
                    },
                )
                val minSwipeLengthStr = stringResource(
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
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                        )
                    },
                )
                val slideSensitivityStr = stringResource(
                    R.string.slide_sensitivity,
                    slideSensitivityState
                        .value
                        .toInt().toString(),
                )
                SettingsSlider(
                    valueRange = 1f..50f,
                    state = slideSensitivityState,
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
    autoCapitalizeState: SettingValueState<Boolean>,
    spacebarMultiTapsState: SettingValueState<Boolean>,
) {
    appSettingsViewModel.updateBehavior(
        BehaviorUpdate(
            id = 1,
            minSwipeLength = minSwipeLengthState.value.toInt(),
            slideSensitivity = slideSensitivityState.value.toInt(),
            slideEnabled = slideEnabledState.value.toInt(),
            autoCapitalize = autoCapitalizeState.value.toInt(),
            spacebarMultiTaps = spacebarMultiTapsState.value.toInt(),
        ),
    )
}
