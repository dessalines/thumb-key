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
import androidx.compose.material.icons.automirrored.outlined.RotateLeft
import androidx.compose.material.icons.automirrored.outlined.RotateRight
import androidx.compose.material.icons.outlined.Abc
import androidx.compose.material.icons.outlined.Circle
import androidx.compose.material.icons.outlined.SpaceBar
import androidx.compose.material.icons.outlined.SwapHoriz
import androidx.compose.material.icons.outlined.Swipe
import androidx.compose.material.icons.outlined.UTurnRight
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
import com.dessalines.thumbkey.db.DEFAULT_CIRCLE_THRESHOLD
import com.dessalines.thumbkey.db.DEFAULT_CIRCULAR_DRAG_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_CLOCKWISE_DRAG_ACTION
import com.dessalines.thumbkey.db.DEFAULT_COUNTERCLOCKWISE_DRAG_ACTION
import com.dessalines.thumbkey.db.DEFAULT_DRAG_RETURN_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_MIN_SWIPE_LENGTH
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_BACKSPACE_DEADZONE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_CURSOR_MOVEMENT_MODE
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_SENSITIVITY
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_SPACEBAR_DEADZONE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SPACEBAR_MULTITAPS
import com.dessalines.thumbkey.ui.components.common.TestOutTextField
import com.dessalines.thumbkey.ui.components.settings.about.SettingsDivider
import com.dessalines.thumbkey.utils.CircularDragAction
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

    var minSwipeLengthState = (settings?.minSwipeLength ?: DEFAULT_MIN_SWIPE_LENGTH).toFloat()
    var minSwipeLengthSliderState by remember { mutableFloatStateOf(minSwipeLengthState) }

    var slideSensitivityState = (settings?.slideSensitivity ?: DEFAULT_SLIDE_SENSITIVITY).toFloat()
    var slideSensitivitySliderState by remember { mutableFloatStateOf(slideSensitivityState) }

    var slideCursorMovementModeState =
        CursorAccelerationMode.entries[settings?.slideCursorMovementMode ?: DEFAULT_SLIDE_CURSOR_MOVEMENT_MODE]

    var slideEnabledState = (settings?.slideEnabled ?: DEFAULT_SLIDE_ENABLED).toBool()
    var slideSpacebarDeadzoneEnabledState = (settings?.slideSpacebarDeadzoneEnabled ?: DEFAULT_SLIDE_SPACEBAR_DEADZONE_ENABLED).toBool()
    var slideBackspaceDeadzoneEnabledState = (settings?.slideBackspaceDeadzoneEnabled ?: DEFAULT_SLIDE_BACKSPACE_DEADZONE_ENABLED).toBool()
    var autoCapitalizeState = (settings?.autoCapitalize ?: DEFAULT_AUTO_CAPITALIZE).toBool()
    var spacebarMultiTapsState = (settings?.spacebarMultiTaps ?: DEFAULT_SPACEBAR_MULTITAPS).toBool()

    var dragReturnEnabledState = (settings?.dragReturnEnabled ?: DEFAULT_DRAG_RETURN_ENABLED).toBool()
    var circularDragEnabledState = (settings?.circularDragEnabled ?: DEFAULT_CIRCULAR_DRAG_ENABLED).toBool()
    var clockwiseDragActionState = CircularDragAction.entries[settings?.clockwiseDragAction ?: DEFAULT_CLOCKWISE_DRAG_ACTION]
    var counterclockwiseDragActionState =
        CircularDragAction.entries[settings?.counterclockwiseDragAction ?: DEFAULT_COUNTERCLOCKWISE_DRAG_ACTION]

    var circleThresholdState = (settings?.circleThreshold ?: DEFAULT_CIRCLE_THRESHOLD).toFloat()
    var circleThresholdSliderState by remember { mutableFloatStateOf(circleThresholdState) }

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
                dragReturnEnabled = dragReturnEnabledState.toInt(),
                circularDragEnabled = circularDragEnabledState.toInt(),
                clockwiseDragAction = clockwiseDragActionState.ordinal,
                counterclockwiseDragAction = counterclockwiseDragActionState.ordinal,
                circleThreshold = circleThresholdState.toInt(),
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
                    SwitchPreference(
                        value = dragReturnEnabledState,
                        onValueChange = {
                            dragReturnEnabledState = it
                            updateBehavior()
                        },
                        title = {
                            Text(stringResource(R.string.drag_return_enable))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.UTurnRight,
                                contentDescription = stringResource(R.string.drag_return_enable),
                            )
                        },
                    )
                    SwitchPreference(
                        value = circularDragEnabledState,
                        onValueChange = {
                            circularDragEnabledState = it
                            updateBehavior()
                        },
                        title = {
                            Text(stringResource(R.string.circular_drag_enable))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Circle,
                                contentDescription = stringResource(R.string.circular_drag_enable),
                            )
                        },
                    )
                    ListPreference(
                        enabled = circularDragEnabledState,
                        type = ListPreferenceType.DROPDOWN_MENU,
                        value = clockwiseDragActionState,
                        onValueChange = {
                            clockwiseDragActionState = it
                            updateBehavior()
                        },
                        values = CircularDragAction.entries,
                        valueToText = {
                            AnnotatedString(ctx.getString(it.resId))
                        },
                        title = {
                            Text(stringResource(R.string.clockwise_drag_action))
                        },
                        summary = {
                            Text(stringResource(clockwiseDragActionState.resId))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.AutoMirrored.Outlined.RotateRight,
                                contentDescription = stringResource(R.string.clockwise_drag_action),
                            )
                        },
                    )
                    ListPreference(
                        enabled = circularDragEnabledState,
                        type = ListPreferenceType.DROPDOWN_MENU,
                        value = counterclockwiseDragActionState,
                        onValueChange = {
                            counterclockwiseDragActionState = it
                            updateBehavior()
                        },
                        values = CircularDragAction.entries,
                        valueToText = {
                            AnnotatedString(ctx.getString(it.resId))
                        },
                        title = {
                            Text(stringResource(R.string.counterclockwise_drag_action))
                        },
                        summary = {
                            Text(stringResource(counterclockwiseDragActionState.resId))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.AutoMirrored.Outlined.RotateLeft,
                                contentDescription = stringResource(R.string.counterclockwise_drag_action),
                            )
                        },
                    )
                    SliderPreference(
                        value = circleThresholdState,
                        sliderValue = circleThresholdSliderState,
                        onValueChange = {
                            circleThresholdState = it
                            updateBehavior()
                        },
                        onSliderValueChange = { circleThresholdSliderState = it },
                        valueRange = 50f..300f,
                        title = {
                            Text(
                                stringResource(
                                    R.string.circle_threshold,
                                    circleThresholdSliderState.toInt().toString(),
                                ),
                            )
                        },
                        summary = {
                            Text(stringResource(R.string.circle_threshold_summary))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Circle,
                                contentDescription = null,
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
