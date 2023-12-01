package com.dessalines.thumbkey.ui.components.settings.lookandfeel

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Animation
import androidx.compose.material.icons.outlined.BorderOuter
import androidx.compose.material.icons.outlined.Colorize
import androidx.compose.material.icons.outlined.FormatSize
import androidx.compose.material.icons.outlined.HideImage
import androidx.compose.material.icons.outlined.LinearScale
import androidx.compose.material.icons.outlined.MusicNote
import androidx.compose.material.icons.outlined.Padding
import androidx.compose.material.icons.outlined.Palette
import androidx.compose.material.icons.outlined.RoundedCorner
import androidx.compose.material.icons.outlined.VerticalAlignTop
import androidx.compose.material.icons.outlined.Vibration
import androidx.compose.material.icons.outlined.ViewDay
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_HELPER_SPEED
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_SPEED
import com.dessalines.thumbkey.db.DEFAULT_BACKDROP_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_HIDE_LETTERS
import com.dessalines.thumbkey.db.DEFAULT_HIDE_SYMBOLS
import com.dessalines.thumbkey.db.DEFAULT_KEY_BORDERS
import com.dessalines.thumbkey.db.DEFAULT_KEY_BORDER_WIDTH
import com.dessalines.thumbkey.db.DEFAULT_KEY_PADDING
import com.dessalines.thumbkey.db.DEFAULT_KEY_RADIUS
import com.dessalines.thumbkey.db.DEFAULT_KEY_SIZE
import com.dessalines.thumbkey.db.DEFAULT_POSITION
import com.dessalines.thumbkey.db.DEFAULT_PUSHUP_SIZE
import com.dessalines.thumbkey.db.DEFAULT_SOUND_ON_TAP
import com.dessalines.thumbkey.db.DEFAULT_THEME
import com.dessalines.thumbkey.db.DEFAULT_THEME_COLOR
import com.dessalines.thumbkey.db.DEFAULT_VIBRATE_ON_TAP
import com.dessalines.thumbkey.db.LookAndFeelUpdate
import com.dessalines.thumbkey.ui.components.common.TestOutTextField
import com.dessalines.thumbkey.ui.components.settings.about.SettingsDivider
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
    appSettingsViewModel: AppSettingsViewModel,
) {
    Log.d(TAG, "Got to lookAndFeel activity")

    val settings = appSettingsViewModel.appSettings.observeAsState().value

    val keySizeState =
        rememberFloatSettingState(
            (settings?.keySize ?: DEFAULT_KEY_SIZE).toFloat(),
        )
    val pushupSizeState =
        rememberFloatSettingState(
            (settings?.pushupSize ?: DEFAULT_PUSHUP_SIZE).toFloat(),
        )
    val animationSpeedState =
        rememberFloatSettingState(
            (settings?.animationSpeed ?: DEFAULT_ANIMATION_SPEED).toFloat(),
        )
    val animationHelperSpeedState =
        rememberFloatSettingState(
            (settings?.animationHelperSpeed ?: DEFAULT_ANIMATION_HELPER_SPEED).toFloat(),
        )
    val positionState =
        rememberIntSettingState(
            settings?.position ?: DEFAULT_POSITION,
        )
    val vibrateOnTapState =
        rememberBooleanSettingState(
            ((settings?.vibrateOnTap ?: DEFAULT_VIBRATE_ON_TAP).toBool()),
        )
    val soundOnTapState =
        rememberBooleanSettingState(
            ((settings?.soundOnTap ?: DEFAULT_SOUND_ON_TAP).toBool()),
        )
    val hideLettersState =
        rememberBooleanSettingState(
            ((settings?.hideLetters ?: DEFAULT_HIDE_LETTERS).toBool()),
        )
    val hideSymbolsState =
        rememberBooleanSettingState(
            ((settings?.hideSymbols ?: DEFAULT_HIDE_SYMBOLS).toBool()),
        )

    val themeState = rememberIntSettingState(settings?.theme ?: DEFAULT_THEME)
    val themeColorState = rememberIntSettingState(settings?.themeColor ?: DEFAULT_THEME_COLOR)
    val keyBordersState =
        rememberBooleanSettingState(
            ((settings?.keyBorders ?: DEFAULT_KEY_BORDERS).toBool()),
        )

    val snackbarHostState = remember { SnackbarHostState() }

    val scrollState = rememberScrollState()

    val backdropEnabledState =
        rememberBooleanSettingState(
            ((settings?.backdropEnabled ?: DEFAULT_BACKDROP_ENABLED).toBool()),
        )
    val keyPaddingState =
        rememberFloatSettingState(
            (settings?.keyPadding ?: DEFAULT_KEY_PADDING).toFloat(),
        )
    val keyBorderWidthState =
        rememberFloatSettingState(
            (settings?.keyBorderWidth ?: DEFAULT_KEY_BORDER_WIDTH).toFloat(),
        )
    val keyRadiusState =
        rememberFloatSettingState(
            (settings?.keyRadius ?: DEFAULT_KEY_RADIUS).toFloat(),
        )

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            SimpleTopAppBar(text = stringResource(R.string.look_and_feel), navController = navController)
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
                SettingsList(
                    state = themeState,
                    items = ThemeMode.entries.map { it.title() },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Palette,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(stringResource(R.string.theme))
                    },
                    onItemSelected = { i, _ ->
                        themeState.value = i
                        updateLookAndFeel(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            themeState,
                            themeColorState,
                            backdropEnabledState,
                            keyPaddingState,
                            keyBorderWidthState,
                            keyRadiusState,
                        )
                    },
                )
                SettingsList(
                    state = themeColorState,
                    items = ThemeColor.entries.map { it.title() },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Colorize,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(stringResource(R.string.theme_color))
                    },
                    onItemSelected = { i, _ ->
                        themeColorState.value = i
                        updateLookAndFeel(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            themeState,
                            themeColorState,
                            backdropEnabledState,
                            keyPaddingState,
                            keyBorderWidthState,
                            keyRadiusState,
                        )
                    },
                )
                SettingsList(
                    state = positionState,
                    items = KeyboardPosition.entries.map { it.title() },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.LinearScale,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(stringResource(R.string.position))
                    },
                    onItemSelected = { i, _ ->
                        positionState.value = i
                        updateLookAndFeel(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            themeState,
                            themeColorState,
                            backdropEnabledState,
                            keyPaddingState,
                            keyBorderWidthState,
                            keyRadiusState,
                        )
                    },
                )
                SettingsCheckbox(
                    state = hideLettersState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.HideImage,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(stringResource(R.string.hide_letters))
                    },
                    onCheckedChange = {
                        updateLookAndFeel(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            themeState,
                            themeColorState,
                            backdropEnabledState,
                            keyPaddingState,
                            keyBorderWidthState,
                            keyRadiusState,
                        )
                    },
                )
                SettingsCheckbox(
                    state = hideSymbolsState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.HideImage,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(stringResource(R.string.hide_symbols))
                    },
                    onCheckedChange = {
                        updateLookAndFeel(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            themeState,
                            themeColorState,
                            backdropEnabledState,
                            keyPaddingState,
                            keyBorderWidthState,
                            keyRadiusState,
                        )
                    },
                )
                SettingsCheckbox(
                    state = backdropEnabledState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.ViewDay,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(stringResource(R.string.backdrop))
                    },
                    onCheckedChange = {
                        updateLookAndFeel(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            themeState,
                            themeColorState,
                            backdropEnabledState,
                            keyPaddingState,
                            keyBorderWidthState,
                            keyRadiusState,
                        )
                    },
                )
                val keySizeStr = stringResource(R.string.key_size, keySizeState.value.toInt().toString())
                SettingsSlider(
                    valueRange = 10f..200f,
                    state = keySizeState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.FormatSize,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(keySizeStr)
                    },
                    onValueChangeFinished = {
                        updateLookAndFeel(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            themeState,
                            themeColorState,
                            backdropEnabledState,
                            keyPaddingState,
                            keyBorderWidthState,
                            keyRadiusState,
                        )
                    },
                )
                val keyPaddingStr = stringResource(R.string.key_padding, keyPaddingState.value.toInt().toString())
                SettingsSlider(
                    valueRange = 0f..10f,
                    state = keyPaddingState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Padding,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(keyPaddingStr)
                    },
                    onValueChangeFinished = {
                        updateLookAndFeel(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            themeState,
                            themeColorState,
                            backdropEnabledState,
                            keyPaddingState,
                            keyBorderWidthState,
                            keyRadiusState,
                        )
                    },
                )
                val keyBorderWidthStr = stringResource(R.string.key_border_width, keyBorderWidthState.value.toInt().toString())
                SettingsSlider(
                    valueRange = 0f..50f,
                    state = keyBorderWidthState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.BorderOuter,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(keyBorderWidthStr)
                    },
                    onValueChangeFinished = {
                        updateLookAndFeel(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            themeState,
                            themeColorState,
                            backdropEnabledState,
                            keyPaddingState,
                            keyBorderWidthState,
                            keyRadiusState,
                        )
                    },
                )
                val keyRadiusStr = stringResource(R.string.key_radius, keyRadiusState.value.toInt().toString())
                SettingsSlider(
                    valueRange = 0f..100f,
                    state = keyRadiusState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.RoundedCorner,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(keyRadiusStr)
                    },
                    onValueChangeFinished = {
                        updateLookAndFeel(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            themeState,
                            themeColorState,
                            backdropEnabledState,
                            keyPaddingState,
                            keyBorderWidthState,
                            keyRadiusState,
                        )
                    },
                )
                val bottomOffsetStr = stringResource(R.string.bottom_offset, pushupSizeState.value.toInt().toString())
                SettingsSlider(
                    valueRange = 0f..200f,
                    state = pushupSizeState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.VerticalAlignTop,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(bottomOffsetStr)
                    },
                    onValueChangeFinished = {
                        updateLookAndFeel(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            themeState,
                            themeColorState,
                            backdropEnabledState,
                            keyPaddingState,
                            keyBorderWidthState,
                            keyRadiusState,
                        )
                    },
                )
                val animationSpeedStr = stringResource(R.string.animation_speed, animationSpeedState.value.toInt().toString())
                SettingsSlider(
                    valueRange = 0f..500f,
                    state = animationSpeedState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Animation,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(animationSpeedStr)
                    },
                    onValueChangeFinished = {
                        updateLookAndFeel(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            themeState,
                            themeColorState,
                            backdropEnabledState,
                            keyPaddingState,
                            keyBorderWidthState,
                            keyRadiusState,
                        )
                    },
                )
                val animationHelperSpeedStr =
                    stringResource(
                        R.string.animation_helper_speed,
                        animationHelperSpeedState
                            .value
                            .toInt().toString(),
                    )
                SettingsSlider(
                    valueRange = 0f..500f,
                    state = animationHelperSpeedState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Visibility,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(animationHelperSpeedStr)
                    },
                    onValueChangeFinished = {
                        updateLookAndFeel(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            themeState,
                            themeColorState,
                            backdropEnabledState,
                            keyPaddingState,
                            keyBorderWidthState,
                            keyRadiusState,
                        )
                    },
                )
                SettingsDivider()
                SettingsCheckbox(
                    state = vibrateOnTapState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Vibration,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(stringResource(R.string.vibrate_on_tap))
                    },
                    subtitle = {
                        Text(stringResource(R.string.vibrate_warning))
                    },
                    onCheckedChange = {
                        updateLookAndFeel(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            themeState,
                            themeColorState,
                            backdropEnabledState,
                            keyPaddingState,
                            keyBorderWidthState,
                            keyRadiusState,
                        )
                    },
                )
                SettingsCheckbox(
                    state = soundOnTapState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.MusicNote,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(stringResource(R.string.play_sound_on_tap))
                    },
                    onCheckedChange = {
                        updateLookAndFeel(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            positionState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            themeState,
                            themeColorState,
                            backdropEnabledState,
                            keyPaddingState,
                            keyBorderWidthState,
                            keyRadiusState,
                        )
                    },
                )
                SettingsDivider()
                TestOutTextField()
            }
        },
    )
}

private fun updateLookAndFeel(
    appSettingsViewModel: AppSettingsViewModel,
    keySizeState: SettingValueState<Float>,
    pushupSizeState: SettingValueState<Float>,
    animationSpeedState: SettingValueState<Float>,
    animationHelperSpeedState: SettingValueState<Float>,
    positionState: SettingValueState<Int>,
    keyBordersState: SettingValueState<Boolean>,
    vibrateOnTapState: SettingValueState<Boolean>,
    soundOnTapState: SettingValueState<Boolean>,
    hideLettersState: SettingValueState<Boolean>,
    hideSymbolsState: SettingValueState<Boolean>,
    themeState: SettingValueState<Int>,
    themeColorState: SettingValueState<Int>,
    backdropEnabledState: SettingValueState<Boolean>,
    keyPaddingState: SettingValueState<Float>,
    keyBorderWidthState: SettingValueState<Float>,
    keyRadiusState: SettingValueState<Float>,
) {
    appSettingsViewModel.updateLookAndFeel(
        LookAndFeelUpdate(
            id = 1,
            keySize = keySizeState.value.toInt(),
            pushupSize = pushupSizeState.value.toInt(),
            animationSpeed = animationSpeedState.value.toInt(),
            animationHelperSpeed = animationHelperSpeedState.value.toInt(),
            position = positionState.value,
            keyBorders = keyBordersState.value.toInt(),
            vibrateOnTap = vibrateOnTapState.value.toInt(),
            soundOnTap = soundOnTapState.value.toInt(),
            hideLetters = hideLettersState.value.toInt(),
            hideSymbols = hideSymbolsState.value.toInt(),
            theme = themeState.value,
            themeColor = themeColorState.value,
            backdropEnabled = backdropEnabledState.value.toInt(),
            keyPadding = keyPaddingState.value.toInt(),
            keyBorderWidth = keyBorderWidthState.value.toInt(),
            keyRadius = keyRadiusState.value.toInt(),
        ),
    )
}
