package com.dessalines.thumbkey.ui.components.settings.lookandfeel

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.alorma.compose.settings.storage.base.SettingValueState
import com.alorma.compose.settings.storage.base.rememberBooleanSettingState
import com.alorma.compose.settings.storage.base.rememberFloatSettingState
import com.alorma.compose.settings.storage.base.rememberIntSettingState
import com.alorma.compose.settings.ui.SettingsCheckbox
import com.alorma.compose.settings.ui.SettingsList
import com.alorma.compose.settings.ui.SettingsSlider
import com.dessalines.thumbkey.db.AppSettings
import com.dessalines.thumbkey.db.AppSettingsViewModel
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_HELPER_SPEED
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_SPEED
import com.dessalines.thumbkey.db.DEFAULT_KEYBOARD_LAYOUT
import com.dessalines.thumbkey.db.DEFAULT_KEY_SIZE
import com.dessalines.thumbkey.utils.KeyboardLayout
import com.dessalines.thumbkey.utils.KeyboardPosition
import com.dessalines.thumbkey.utils.SimpleTopAppBar
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.ThemeColor
import com.dessalines.thumbkey.utils.ThemeMode

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LookAndFeelActivity(
    navController: NavController,
    appSettingsViewModel: AppSettingsViewModel
) {
    Log.d(TAG, "Got to lookAndFeel activity")

    val settings = appSettingsViewModel.appSettings.value

    val keySizeState = rememberFloatSettingState((settings?.keySize ?: DEFAULT_KEY_SIZE).toFloat())
    val animationSpeedState = rememberFloatSettingState(
        (settings?.animationSpeed ?: DEFAULT_ANIMATION_SPEED).toFloat()
    )
    val animationHelperSpeedState = rememberFloatSettingState(
        (
            settings?.animationHelperSpeed
                ?: DEFAULT_ANIMATION_HELPER_SPEED
            ).toFloat()
    )
    val positionState = rememberIntSettingState(
        settings?.position ?: com.dessalines.thumbkey
            .db.DEFAULT_POSITION
    )
    val autoCapitalizeState = rememberBooleanSettingState(
        (settings?.autoCapitalize?.equals(1))
            ?: true
    )
    val keyboardLayoutState = rememberIntSettingState(
        settings?.keyboardLayout
            ?: DEFAULT_KEYBOARD_LAYOUT
    )
    val themeState = rememberIntSettingState(settings?.theme ?: 0)
    val themeColorState = rememberIntSettingState(settings?.themeColor ?: 0)

    val snackbarHostState = remember { SnackbarHostState() }

    var text by remember { mutableStateOf("") }

    val scrollState = rememberScrollState()

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            SimpleTopAppBar(text = "Look and feel", navController = navController)
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .verticalScroll(scrollState)
            ) {
                SettingsList(
                    state = keyboardLayoutState,
                    items = KeyboardLayout.values().map { it.name },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.KeyboardAlt,
                            contentDescription = "TODO"
                        )
                    },
                    title = {
                        Text(text = "Layout")
                    },
                    action = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            autoCapitalizeState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                SettingsList(
                    state = themeState,
                    items = ThemeMode.values().map { it.name },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Palette,
                            contentDescription = "TODO"
                        )
                    },
                    title = {
                        Text(text = "Theme")
                    },
                    action = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            autoCapitalizeState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                SettingsList(
                    state = themeColorState,
                    items = ThemeColor.values().map { it.name },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Colorize,
                            contentDescription = "TODO"
                        )
                    },
                    title = {
                        Text(text = "Theme color")
                    },
                    action = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            autoCapitalizeState,
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
                            contentDescription = "TODO"
                        )
                    },
                    title = {
                        Text(text = "Auto-Capitalize")
                    },
                    onCheckedChange = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            autoCapitalizeState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                SettingsList(
                    state = positionState,
                    items = KeyboardPosition.values().map { it.name },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.LinearScale,
                            contentDescription = "TODO"
                        )
                    },
                    title = {
                        Text(text = "Position")
                    },
                    action = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            autoCapitalizeState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                SettingsSlider(
                    valueRange = 10f..200f,
                    state = keySizeState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.FormatSize,
                            contentDescription = "TODO"
                        )
                    },
                    title = {
                        Text(text = "Key Size: ${keySizeState.value.toInt()}")
                    },
                    onValueChangeFinished = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            autoCapitalizeState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                SettingsSlider(
                    valueRange = 0f..500f,
                    state = animationSpeedState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Animation,
                            contentDescription = "TODO"
                        )
                    },
                    title = {
                        Text(text = "Animation Speed: ${animationSpeedState.value.toInt()}")
                    },
                    onValueChangeFinished = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            autoCapitalizeState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                SettingsSlider(
                    valueRange = 0f..500f,
                    state = animationHelperSpeedState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Visibility,
                            contentDescription = "TODO"
                        )
                    },
                    title = {
                        Text(text = "Animation Helper Speed: ${animationHelperSpeedState.value.toInt()}")
                    },
                    onValueChangeFinished = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            autoCapitalizeState,
                            keyboardLayoutState,
                            themeState,
                            themeColorState
                        )
                    }
                )
                OutlinedTextField(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    value = text,
                    onValueChange = { text = it },
                    singleLine = true,
                    label = { Text("Test out Thumb-Key") }
                )
            }
        }
    )
}

private fun updateAppSettings(
    appSettingsViewModel: AppSettingsViewModel,
    keySizeState: SettingValueState<Float>,
    animationSpeedState: SettingValueState<Float>,
    animationHelperSpeedState: SettingValueState<Float>,
    positionState: SettingValueState<Int>,
    autoCapitalizeState: SettingValueState<Boolean>,
    keyboardLayoutState: SettingValueState<Int>,
    themeState: SettingValueState<Int>,
    themeColorState: SettingValueState<Int>
) {
    appSettingsViewModel.update(
        AppSettings(
            id = 1,
            keySize = keySizeState.value.toInt(),
            animationSpeed = animationSpeedState.value.toInt(),
            animationHelperSpeed = animationHelperSpeedState.value.toInt(),
            position = positionState.value,
            autoCapitalize = autoCapitalizeState.value.compareTo(false),
            keyboardLayout = keyboardLayoutState.value,
            theme = themeState.value,
            themeColor = themeColorState.value,
            viewedChangelog = appSettingsViewModel.appSettings.value?.viewedChangelog ?: 0
        )
    )
}
