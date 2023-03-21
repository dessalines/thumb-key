package com.dessalines.thumbkey.ui.components.settings.lookandfeel

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.alorma.compose.settings.storage.base.SettingValueState
import com.alorma.compose.settings.storage.base.rememberBooleanSettingState
import com.alorma.compose.settings.storage.base.rememberFloatSettingState
import com.alorma.compose.settings.storage.base.rememberIntSettingState
import com.alorma.compose.settings.ui.SettingsCheckbox
import com.alorma.compose.settings.ui.SettingsList
import com.alorma.compose.settings.ui.SettingsSlider
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.AppSettings
import com.dessalines.thumbkey.db.AppSettingsViewModel
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_HELPER_SPEED
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_SPEED
import com.dessalines.thumbkey.db.DEFAULT_AUTO_CAPITALIZE
import com.dessalines.thumbkey.db.DEFAULT_KEYBOARD_LAYOUT
import com.dessalines.thumbkey.db.DEFAULT_KEY_SIZE
import com.dessalines.thumbkey.db.DEFAULT_MIN_SWIPE_LENGTH
import com.dessalines.thumbkey.db.DEFAULT_POSITION
import com.dessalines.thumbkey.db.DEFAULT_PUSHUP_SIZE
import com.dessalines.thumbkey.db.DEFAULT_SOUND_ON_TAP
import com.dessalines.thumbkey.db.DEFAULT_THEME
import com.dessalines.thumbkey.db.DEFAULT_THEME_COLOR
import com.dessalines.thumbkey.db.DEFAULT_VIBRATE_ON_TAP
import com.dessalines.thumbkey.utils.KeyboardLayout
import com.dessalines.thumbkey.utils.KeyboardPosition
import com.dessalines.thumbkey.utils.SimpleTopAppBar
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.ThemeColor
import com.dessalines.thumbkey.utils.ThemeMode
import com.dessalines.thumbkey.utils.toBool
import com.dessalines.thumbkey.utils.toInt

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LookAndFeelActivity(
    navController: NavController,
    appSettingsViewModel: AppSettingsViewModel
) {
    Log.d(TAG, "Got to lookAndFeel activity")

    val settings = appSettingsViewModel.appSettings.value

    val keySizeState = rememberFloatSettingState(
        (settings?.keySize ?: DEFAULT_KEY_SIZE).toFloat()
    )
    val pushupSizeState = rememberFloatSettingState(
        (settings?.pushupSize ?: DEFAULT_PUSHUP_SIZE).toFloat()
    )
    val animationSpeedState = rememberFloatSettingState(
        (settings?.animationSpeed ?: DEFAULT_ANIMATION_SPEED).toFloat()
    )
    val animationHelperSpeedState = rememberFloatSettingState(
        (settings?.animationHelperSpeed ?: DEFAULT_ANIMATION_HELPER_SPEED).toFloat()
    )
    val minSwipeLengthState = rememberFloatSettingState(
        (settings?.minSwipeLength ?: DEFAULT_MIN_SWIPE_LENGTH).toFloat()
    )
    val positionState = rememberIntSettingState(
        settings?.position ?: DEFAULT_POSITION
    )
    val autoCapitalizeState = rememberBooleanSettingState(
        ((settings?.autoCapitalize ?: DEFAULT_AUTO_CAPITALIZE).toBool())
    )
    val vibrateOnTapState = rememberBooleanSettingState(
        ((settings?.vibrateOnTap ?: DEFAULT_VIBRATE_ON_TAP).toBool())
    )
    val soundOnTapState = rememberBooleanSettingState(
        ((settings?.soundOnTap ?: DEFAULT_SOUND_ON_TAP).toBool())
    )
    val keyboardLayoutState = rememberIntSettingState(
        settings?.keyboardLayout ?: DEFAULT_KEYBOARD_LAYOUT
    )
    val themeState = rememberIntSettingState(settings?.theme ?: DEFAULT_THEME)
    val themeColorState = rememberIntSettingState(settings?.themeColor ?: DEFAULT_THEME_COLOR)

    val snackbarHostState = remember { SnackbarHostState() }

    var text by remember { mutableStateOf("") }

    val scrollState = rememberScrollState()

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            SimpleTopAppBar(text = stringResource(R.string.look_and_feel), navController = navController)
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .verticalScroll(scrollState)
                    .imePadding()
            ) {
                SettingsList(
                    state = keyboardLayoutState,
                    items = KeyboardLayout.values().map { it.title },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.KeyboardAlt,
                            contentDescription = stringResource(R.string.layout)
                        )
                    },
                    title = {
                        Text(stringResource(R.string.layout))
                    },
                    action = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            vibrateOnTapState,
                            soundOnTapState,
                            autoCapitalizeState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                SettingsList(
                    state = themeState,
                    items = ThemeMode.values().map { it.title() },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Palette,
                            contentDescription = stringResource(R.string.theme)
                        )
                    },
                    title = {
                        Text(stringResource(R.string.theme))
                    },
                    action = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            vibrateOnTapState,
                            soundOnTapState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                SettingsList(
                    state = themeColorState,
                    items = ThemeColor.values().map { it.title() },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Colorize,
                            contentDescription = stringResource(R.string.theme_color)
                        )
                    },
                    title = {
                        Text(stringResource(R.string.theme_color))
                    },
                    action = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            vibrateOnTapState,
                            soundOnTapState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                SettingsList(
                    state = positionState,
                    items = KeyboardPosition.values().map { it.title() },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.LinearScale,
                            contentDescription = stringResource(R.string.position)
                        )
                    },
                    title = {
                        Text(stringResource(R.string.position))
                    },
                    action = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            vibrateOnTapState,
                            soundOnTapState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                SettingsCheckbox(
                    state = vibrateOnTapState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Vibration,
                            contentDescription = stringResource(R.string.vibrate_on_tap)
                        )
                    },
                    title = {
                        Text(stringResource(R.string.vibrate_on_tap))
                    },
                    onCheckedChange = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            vibrateOnTapState,
                            soundOnTapState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                SettingsCheckbox(
                    state = soundOnTapState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.MusicNote,
                            contentDescription = stringResource(R.string.play_sound_on_tap)
                        )
                    },
                    title = {
                        Text(stringResource(R.string.play_sound_on_tap))
                    },
                    onCheckedChange = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            vibrateOnTapState,
                            soundOnTapState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                SettingsCheckbox(
                    state = autoCapitalizeState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Abc,
                            contentDescription = stringResource(R.string.auto_capitalize)
                        )
                    },
                    title = {
                        Text(stringResource(R.string.auto_capitalize))
                    },
                    onCheckedChange = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            vibrateOnTapState,
                            soundOnTapState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                val keySizeStr = stringResource(R.string.key_size, keySizeState.value.toInt().toString())
                SettingsSlider(
                    valueRange = 10f..200f,
                    state = keySizeState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.FormatSize,
                            contentDescription = keySizeStr
                        )
                    },
                    title = {
                        Text(keySizeStr)
                    },
                    onValueChangeFinished = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            vibrateOnTapState,
                            soundOnTapState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                val bottomOffsetStr = stringResource(R.string.bottom_offset, pushupSizeState.value.toInt().toString())
                SettingsSlider(
                    valueRange = 0f..100f,
                    state = pushupSizeState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.VerticalAlignTop,
                            contentDescription = bottomOffsetStr
                        )
                    },
                    title = {
                        Text(bottomOffsetStr)
                    },
                    onValueChangeFinished = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            vibrateOnTapState,
                            soundOnTapState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                val minSwipeLengthStr = stringResource(R.string.min_swipe_length, minSwipeLengthState.value.toInt().toString())
                SettingsSlider(
                    valueRange = 0f..200f,
                    state = minSwipeLengthState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Swipe,
                            contentDescription = minSwipeLengthStr
                        )
                    },
                    title = {
                        Text(minSwipeLengthStr)
                    },
                    onValueChangeFinished = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            vibrateOnTapState,
                            soundOnTapState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                val animationSpeedStr = stringResource(R.string.animation_speed, animationSpeedState.value.toInt().toString())
                SettingsSlider(
                    valueRange = 0f..500f,
                    state = animationSpeedState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Animation,
                            contentDescription = animationSpeedStr
                        )
                    },
                    title = {
                        Text(animationSpeedStr)
                    },
                    onValueChangeFinished = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            vibrateOnTapState,
                            soundOnTapState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                val animationHelperSpeedStr = stringResource(
                    R.string.animation_helper_speed,
                    animationHelperSpeedState
                        .value
                        .toInt().toString()
                )
                SettingsSlider(
                    valueRange = 0f..500f,
                    state = animationHelperSpeedState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Visibility,
                            contentDescription = animationHelperSpeedStr
                        )
                    },
                    title = {
                        Text(animationHelperSpeedStr)
                    },
                    onValueChangeFinished = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            vibrateOnTapState,
                            soundOnTapState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                ListItem(
                    modifier = Modifier
                        .height(56.dp)
                        .clickable {
                            resetAppSettingsToDefault(
                                appSettingsViewModel,
                                keySizeState,
                                pushupSizeState,
                                animationSpeedState,
                                animationHelperSpeedState,
                                minSwipeLengthState,
                                positionState,
                                autoCapitalizeState,
                                vibrateOnTapState,
                                soundOnTapState,
                                keyboardLayoutState,
                                themeState,
                                themeColorState
                            )
                        },
                    headlineText = {
                        Text(stringResource(R.string.reset_to_defaults))
                    },
                    leadingContent = {
                        Icon(
                            imageVector = Icons.Outlined.ResetTv,
                            contentDescription = stringResource(R.string.reset_to_defaults)
                        )
                    }
                )
                OutlinedTextField(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    value = text,
                    onValueChange = { text = it },
                    label = { Text(stringResource(R.string.test_out_thumbkey)) }
                )
            }
        }
    )
}

private fun updateAppSettings(
    appSettingsViewModel: AppSettingsViewModel,
    keySizeState: SettingValueState<Float>,
    pushupSizeState: SettingValueState<Float>,
    animationSpeedState: SettingValueState<Float>,
    animationHelperSpeedState: SettingValueState<Float>,
    minSwipeLengthState: SettingValueState<Float>,
    positionState: SettingValueState<Int>,
    autoCapitalizeState: SettingValueState<Boolean>,
    vibrateOnTapState: SettingValueState<Boolean>,
    soundOnTapState: SettingValueState<Boolean>,
    keyboardLayoutState: SettingValueState<Int>,
    themeState: SettingValueState<Int>,
    themeColorState: SettingValueState<Int>
) {
    appSettingsViewModel.update(
        AppSettings(
            id = 1,
            keySize = keySizeState.value.toInt(),
            pushupSize = pushupSizeState.value.toInt(),
            animationSpeed = animationSpeedState.value.toInt(),
            animationHelperSpeed = animationHelperSpeedState.value.toInt(),
            minSwipeLength = minSwipeLengthState.value.toInt(),
            position = positionState.value,
            autoCapitalize = autoCapitalizeState.value.toInt(),
            vibrateOnTap = vibrateOnTapState.value.toInt(),
            soundOnTap = soundOnTapState.value.toInt(),
            keyboardLayout = keyboardLayoutState.value,
            theme = themeState.value,
            themeColor = themeColorState.value,
            viewedChangelog = appSettingsViewModel.appSettings.value?.viewedChangelog ?: 0
        )
    )
}

private fun resetAppSettingsToDefault(
    appSettingsViewModel: AppSettingsViewModel,
    keySizeState: SettingValueState<Float>,
    pushupSizeState: SettingValueState<Float>,
    animationSpeedState: SettingValueState<Float>,
    animationHelperSpeedState: SettingValueState<Float>,
    minSwipeLengthState: SettingValueState<Float>,
    positionState: SettingValueState<Int>,
    autoCapitalizeState: SettingValueState<Boolean>,
    vibrateOnTapState: SettingValueState<Boolean>,
    soundOnTapState: SettingValueState<Boolean>,
    keyboardLayoutState: SettingValueState<Int>,
    themeState: SettingValueState<Int>,
    themeColorState: SettingValueState<Int>
) {
    keySizeState.value = DEFAULT_KEY_SIZE.toFloat()
    pushupSizeState.value = DEFAULT_PUSHUP_SIZE.toFloat()
    animationSpeedState.value = DEFAULT_ANIMATION_SPEED.toFloat()
    animationHelperSpeedState.value = DEFAULT_ANIMATION_HELPER_SPEED.toFloat()
    minSwipeLengthState.value = DEFAULT_MIN_SWIPE_LENGTH.toFloat()
    positionState.value = DEFAULT_POSITION
    autoCapitalizeState.value = DEFAULT_AUTO_CAPITALIZE.toBool()
    vibrateOnTapState.value = DEFAULT_VIBRATE_ON_TAP.toBool()
    soundOnTapState.value = DEFAULT_SOUND_ON_TAP.toBool()
    keyboardLayoutState.value = DEFAULT_KEYBOARD_LAYOUT
    themeState.value = DEFAULT_THEME
    themeColorState.value = DEFAULT_THEME_COLOR

    updateAppSettings(
        appSettingsViewModel,
        keySizeState,
        pushupSizeState,
        animationSpeedState,
        animationHelperSpeedState,
        minSwipeLengthState,
        positionState,
        autoCapitalizeState,
        vibrateOnTapState,
        soundOnTapState,
        keyboardLayoutState,
        themeState,
        themeColorState
    )
}
