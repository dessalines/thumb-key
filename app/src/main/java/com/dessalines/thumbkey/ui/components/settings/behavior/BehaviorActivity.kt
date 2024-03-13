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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.navigation.NavController
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
import me.zhanghai.compose.preference.ListPreference
import me.zhanghai.compose.preference.ListPreferenceType
import me.zhanghai.compose.preference.ProvidePreferenceTheme
import me.zhanghai.compose.preference.SliderPreference
import me.zhanghai.compose.preference.SwitchPreference

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BehaviorActivity(
    navController: NavController,
    appSettingsViewModel: AppSettingsViewModel,
) {
    Log.d(TAG, "Got to behavior activity")

    val settings by appSettingsViewModel.appSettings.observeAsState()

    var minSwipeLengthState by remember { mutableStateOf((settings?.minSwipeLength ?: DEFAULT_MIN_SWIPE_LENGTH).toFloat()) }
    var minSwipeLengthSliderState by remember { mutableStateOf(minSwipeLengthState) }

    var slideSensitivityState by remember { mutableStateOf((settings?.slideSensitivity ?: DEFAULT_SLIDE_SENSITIVITY).toFloat()) }
    var slideSensitivitySliderState by remember { mutableStateOf(slideSensitivityState) }

    var slideCursorMovementModeState by remember {
        mutableStateOf(CursorAccelerationMode.entries[settings?.slideCursorMovementMode ?: DEFAULT_SLIDE_CURSOR_MOVEMENT_MODE])
    }

    var slideEnabledState by remember { mutableStateOf((settings?.slideEnabled ?: DEFAULT_SLIDE_ENABLED).toBool()) }
    var slideSpacebarDeadzoneEnabledState by remember {
        mutableStateOf((settings?.slideSpacebarDeadzoneEnabled ?: DEFAULT_SLIDE_SPACEBAR_DEADZONE_ENABLED).toBool())
    }
    var slideBackspaceDeadzoneEnabledState by remember {
        mutableStateOf((settings?.slideBackspaceDeadzoneEnabled ?: DEFAULT_SLIDE_BACKSPACE_DEADZONE_ENABLED).toBool())
    }
    var autoCapitalizeState by remember { mutableStateOf((settings?.autoCapitalize ?: DEFAULT_AUTO_CAPITALIZE).toBool()) }
    var spacebarMultiTapsState by remember { mutableStateOf((settings?.spacebarMultiTaps ?: DEFAULT_SPACEBAR_MULTITAPS).toBool()) }

    val snackbarHostState = remember { SnackbarHostState() }

    val scrollState = rememberScrollState()

    val ctx = LocalContext.current

    fun updateBehavior() {
        appSettingsViewModel.updateBehavior(
            BehaviorUpdate(
                id = 1,
                minSwipeLength = minSwipeLengthState.toInt(),
                slideSensitivity = slideSensitivityState.toInt(),
                slideEnabled = slideEnabledState.toInt(),
                slideCursorMovementMode = slideCursorMovementModeState.ordinal,
                slideSpacebarDeadzoneEnabled = slideSpacebarDeadzoneEnabledState.toInt(),
                slideBackspaceDeadzoneEnabled = slideBackspaceDeadzoneEnabledState.toInt(),
                autoCapitalize = autoCapitalizeState.toInt(),
                spacebarMultiTaps = spacebarMultiTapsState.toInt(),
            ),
        )
    }

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
                ProvidePreferenceTheme {
                    SwitchPreference(
                        value = autoCapitalizeState,
                        onValueChange = {
                            autoCapitalizeState = it
                            updateBehavior()
                        },
                        title = {
                            Text(stringResource(R.string.auto_capitalize))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Abc,
                                contentDescription = null,
                            )
                        },
                    )
                    SwitchPreference(
                        value = spacebarMultiTapsState,
                        onValueChange = {
                            spacebarMultiTapsState = it
                            updateBehavior()
                        },
                        title = {
                            Text(stringResource(R.string.spacebar_multitaps))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.SpaceBar,
                                contentDescription = null,
                            )
                        },
                    )
                    SliderPreference(
                        value = minSwipeLengthState,
                        sliderValue = minSwipeLengthSliderState,
                        onValueChange = {
                            minSwipeLengthState = it
                            updateBehavior()
                        },
                        onSliderValueChange = { minSwipeLengthSliderState = it },
                        valueRange = 0f..200f,
                        title = {
                            val minSwipeLengthStr =
                                stringResource(
                                    R.string.min_swipe_length,
                                    minSwipeLengthSliderState.toInt().toString(),
                                )
                            Text(minSwipeLengthStr)
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Swipe,
                                contentDescription = null,
                            )
                        },
                    )
                    SettingsDivider()
                    SwitchPreference(
                        value = slideEnabledState,
                        onValueChange = {
                            slideEnabledState = it
                            updateBehavior()
                        },
                        title = {
                            Text(stringResource(R.string.slide_enable))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.SpaceBar,
                                contentDescription = stringResource(R.string.slide_enable),
                            )
                        },
                    )
                    ListPreference(
                        enabled = slideEnabledState,
                        type = ListPreferenceType.DROPDOWN_MENU,
                        value = slideCursorMovementModeState,
                        onValueChange = {
                            slideCursorMovementModeState = it
                            updateBehavior()
                        },
                        values = CursorAccelerationMode.entries,
                        valueToText = {
                            AnnotatedString(ctx.getString(it.resId))
                        },
                        title = {
                            Text(stringResource(R.string.slide_cursor_movement_mode))
                        },
                        summary = {
                            Text(stringResource(slideCursorMovementModeState.resId))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.SwapHoriz,
                                contentDescription = null,
                            )
                        },
                    )
                    SliderPreference(
                        valueRange = 1f..50f,
                        value = slideSensitivityState,
                        sliderValue = slideSensitivitySliderState,
                        onSliderValueChange = { slideSensitivitySliderState = it },
                        onValueChange = {
                            slideSensitivityState = it
                            updateBehavior()
                        },
                        enabled = slideEnabledState,
                        title = {
                            val slideSensitivityStr =
                                stringResource(
                                    R.string.slide_sensitivity,
                                    slideSensitivitySliderState
                                        .toInt().toString(),
                                )
                            Text(slideSensitivityStr)
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.SwapHoriz,
                                contentDescription = null,
                            )
                        },
                    )
                    SwitchPreference(
                        value = slideSpacebarDeadzoneEnabledState,
                        onValueChange = {
                            slideSpacebarDeadzoneEnabledState = it
                            updateBehavior()
                        },
                        enabled = slideEnabledState,
                        title = {
                            Text(stringResource(R.string.slide_spacebar_deadzone_enable))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.SpaceBar,
                                contentDescription = stringResource(R.string.slide_spacebar_deadzone_enable),
                            )
                        },
                    )
                    SwitchPreference(
                        value = slideBackspaceDeadzoneEnabledState,
                        onValueChange = {
                            slideBackspaceDeadzoneEnabledState = it
                            updateBehavior()
                        },
                        enabled = slideEnabledState,
                        title = {
                            Text(stringResource(R.string.slide_backspace_deadzone_enable))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.AutoMirrored.Outlined.Backspace,
                                contentDescription = stringResource(R.string.slide_backspace_deadzone_enable),
                            )
                        },
                    )
                    SettingsDivider()
                    TestOutTextField()
                }
            }
        },
    )
}
