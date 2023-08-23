package com.dessalines.thumbkey.ui.components.settings.lookandfeel

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Abc
import androidx.compose.material.icons.outlined.Animation
import androidx.compose.material.icons.outlined.BorderAll
import androidx.compose.material.icons.outlined.Colorize
import androidx.compose.material.icons.outlined.FormatSize
import androidx.compose.material.icons.outlined.HideImage
import androidx.compose.material.icons.outlined.KeyboardAlt
import androidx.compose.material.icons.outlined.LinearScale
import androidx.compose.material.icons.outlined.MusicNote
import androidx.compose.material.icons.outlined.Palette
import androidx.compose.material.icons.outlined.ResetTv
import androidx.compose.material.icons.outlined.SpaceBar
import androidx.compose.material.icons.outlined.Swipe
import androidx.compose.material.icons.outlined.VerticalAlignTop
import androidx.compose.material.icons.outlined.Vibration
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.alorma.compose.settings.storage.base.SettingValueState
import com.alorma.compose.settings.storage.base.rememberBooleanSettingState
import com.alorma.compose.settings.storage.base.rememberFloatSettingState
import com.alorma.compose.settings.storage.base.rememberIntSetSettingState
import com.alorma.compose.settings.storage.base.rememberIntSettingState
import com.alorma.compose.settings.ui.SettingsCheckbox
import com.alorma.compose.settings.ui.SettingsList
import com.alorma.compose.settings.ui.SettingsListMultiSelect
import com.alorma.compose.settings.ui.SettingsMenuLink
import com.alorma.compose.settings.ui.SettingsSlider
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.AppSettings
import com.dessalines.thumbkey.db.AppSettingsViewModel
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_HELPER_SPEED
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_SPEED
import com.dessalines.thumbkey.db.DEFAULT_AUTO_CAPITALIZE
import com.dessalines.thumbkey.db.DEFAULT_HIDE_LETTERS
import com.dessalines.thumbkey.db.DEFAULT_KEYBOARD_LAYOUT
import com.dessalines.thumbkey.db.DEFAULT_KEY_BORDERS
import com.dessalines.thumbkey.db.DEFAULT_KEY_SIZE
import com.dessalines.thumbkey.db.DEFAULT_MIN_SWIPE_LENGTH
import com.dessalines.thumbkey.db.DEFAULT_POSITION
import com.dessalines.thumbkey.db.DEFAULT_PUSHUP_SIZE
import com.dessalines.thumbkey.db.DEFAULT_SOUND_ON_TAP
import com.dessalines.thumbkey.db.DEFAULT_SPACEBAR_MULTITAPS
import com.dessalines.thumbkey.db.DEFAULT_THEME
import com.dessalines.thumbkey.db.DEFAULT_THEME_COLOR
import com.dessalines.thumbkey.db.DEFAULT_VIBRATE_ON_TAP
import com.dessalines.thumbkey.utils.KeyboardLayout
import com.dessalines.thumbkey.utils.KeyboardPosition
import com.dessalines.thumbkey.utils.SimpleTopAppBar
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.ThemeColor
import com.dessalines.thumbkey.utils.ThemeMode
import com.dessalines.thumbkey.utils.keyboardLayoutsSetFromTitleIndex
import com.dessalines.thumbkey.utils.keyboardRealIndexFromTitleIndex
import com.dessalines.thumbkey.utils.keyboardTitleIndexFromRealIndex
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

    val keySizeState = rememberFloatSettingState(
        (settings?.keySize ?: DEFAULT_KEY_SIZE).toFloat(),
    )
    val pushupSizeState = rememberFloatSettingState(
        (settings?.pushupSize ?: DEFAULT_PUSHUP_SIZE).toFloat(),
    )
    val animationSpeedState = rememberFloatSettingState(
        (settings?.animationSpeed ?: DEFAULT_ANIMATION_SPEED).toFloat(),
    )
    val animationHelperSpeedState = rememberFloatSettingState(
        (settings?.animationHelperSpeed ?: DEFAULT_ANIMATION_HELPER_SPEED).toFloat(),
    )
    val minSwipeLengthState = rememberFloatSettingState(
        (settings?.minSwipeLength ?: DEFAULT_MIN_SWIPE_LENGTH).toFloat(),
    )
    val positionState = rememberIntSettingState(
        settings?.position ?: DEFAULT_POSITION,
    )
    val autoCapitalizeState = rememberBooleanSettingState(
        ((settings?.autoCapitalize ?: DEFAULT_AUTO_CAPITALIZE).toBool()),
    )
    val vibrateOnTapState = rememberBooleanSettingState(
        ((settings?.vibrateOnTap ?: DEFAULT_VIBRATE_ON_TAP).toBool()),
    )
    val soundOnTapState = rememberBooleanSettingState(
        ((settings?.soundOnTap ?: DEFAULT_SOUND_ON_TAP).toBool()),
    )
    val hideLettersState = rememberBooleanSettingState(
        ((settings?.hideLetters ?: DEFAULT_HIDE_LETTERS).toBool()),
    )

    val keyboardLayoutsState = rememberIntSetSettingState(
        keyboardLayoutsSetFromTitleIndex(settings?.keyboardLayouts),
    )
    val themeState = rememberIntSettingState(settings?.theme ?: DEFAULT_THEME)
    val themeColorState = rememberIntSettingState(settings?.themeColor ?: DEFAULT_THEME_COLOR)
    val keyBordersState = rememberBooleanSettingState(
        ((settings?.keyBorders ?: DEFAULT_KEY_BORDERS).toBool()),
    )
    val spacebarMultiTapsState = rememberBooleanSettingState(
        ((settings?.spacebarMultiTaps ?: DEFAULT_SPACEBAR_MULTITAPS).toBool()),
    )

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
                    .imePadding(),
            ) {
                SettingsListMultiSelect(
                    state = keyboardLayoutsState,
                    items = KeyboardLayout.values().sortedBy { it.title }.map { it.title },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.KeyboardAlt,
                            contentDescription = stringResource(R.string.layouts),
                        )
                    },
                    title = {
                        Text(stringResource(R.string.layouts))
                    },
                    confirmButton = stringResource(R.string.save),
                    onItemsSelected = { saved ->
                        if (saved.isEmpty()) {
                            keyboardLayoutsState.value = setOf(keyboardTitleIndexFromRealIndex(DEFAULT_KEYBOARD_LAYOUT))
                        }
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                SettingsList(
                    state = themeState,
                    items = ThemeMode.values().map { it.title() },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Palette,
                            contentDescription = stringResource(R.string.theme),
                        )
                    },
                    title = {
                        Text(stringResource(R.string.theme))
                    },
                    onItemSelected = { i, _ ->
                        themeState.value = i
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                SettingsList(
                    state = themeColorState,
                    items = ThemeColor.values().map { it.title() },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Colorize,
                            contentDescription = stringResource(R.string.theme_color),
                        )
                    },
                    title = {
                        Text(stringResource(R.string.theme_color))
                    },
                    onItemSelected = { i, _ ->
                        themeColorState.value = i
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                SettingsList(
                    state = positionState,
                    items = KeyboardPosition.values().map { it.title() },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.LinearScale,
                            contentDescription = stringResource(R.string.position),
                        )
                    },
                    title = {
                        Text(stringResource(R.string.position))
                    },
                    onItemSelected = { i, _ ->
                        positionState.value = i
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                SettingsCheckbox(
                    state = vibrateOnTapState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Vibration,
                            contentDescription = stringResource(R.string.vibrate_on_tap),
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
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                SettingsCheckbox(
                    state = soundOnTapState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.MusicNote,
                            contentDescription = stringResource(R.string.play_sound_on_tap),
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
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                SettingsCheckbox(
                    state = hideLettersState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.HideImage,
                            contentDescription = stringResource(R.string.hide_letters),
                        )
                    },
                    title = {
                        Text(stringResource(R.string.hide_letters))
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
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                SettingsCheckbox(
                    state = autoCapitalizeState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Abc,
                            contentDescription = stringResource(R.string.auto_capitalize),
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
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                SettingsCheckbox(
                    state = spacebarMultiTapsState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.SpaceBar,
                            contentDescription = stringResource(R.string.spacebar_multitaps),
                        )
                    },
                    title = {
                        Text(stringResource(R.string.spacebar_multitaps))
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
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                SettingsCheckbox(
                    state = keyBordersState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.BorderAll,
                            contentDescription = stringResource(R.string.key_borders),
                        )
                    },
                    title = {
                        Text(stringResource(R.string.key_borders))
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
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
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
                            contentDescription = keySizeStr,
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
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                val bottomOffsetStr = stringResource(R.string.bottom_offset, pushupSizeState.value.toInt().toString())
                SettingsSlider(
                    valueRange = 0f..100f,
                    state = pushupSizeState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.VerticalAlignTop,
                            contentDescription = bottomOffsetStr,
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
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                val minSwipeLengthStr = stringResource(R.string.min_swipe_length, minSwipeLengthState.value.toInt().toString())
                SettingsSlider(
                    valueRange = 0f..200f,
                    state = minSwipeLengthState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Swipe,
                            contentDescription = minSwipeLengthStr,
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
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
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
                            contentDescription = animationSpeedStr,
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
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                val animationHelperSpeedStr = stringResource(
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
                            contentDescription = animationHelperSpeedStr,
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
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                SettingsMenuLink(
                    title = {
                        Text(stringResource(R.string.reset_to_defaults))
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.ResetTv,
                            contentDescription = stringResource(R.string.reset_to_defaults),
                        )
                    },
                    onClick = {
                        resetAppSettingsToDefault(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                OutlinedTextField(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    value = text,
                    onValueChange = { text = it },
                    label = { Text(stringResource(R.string.test_out_thumbkey)) },
                )
            }
        },
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
    spacebarMultiTapsState: SettingValueState<Boolean>,
    keyBordersState: SettingValueState<Boolean>,
    vibrateOnTapState: SettingValueState<Boolean>,
    soundOnTapState: SettingValueState<Boolean>,
    hideLettersState: SettingValueState<Boolean>,
    keyboardLayoutsState: SettingValueState<Set<Int>>,
    themeState: SettingValueState<Int>,
    themeColorState: SettingValueState<Int>,
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
            spacebarMultiTaps = spacebarMultiTapsState.value.toInt(),
            keyBorders = keyBordersState.value.toInt(),
            vibrateOnTap = vibrateOnTapState.value.toInt(),
            soundOnTap = soundOnTapState.value.toInt(),
            hideLetters = hideLettersState.value.toInt(),
            keyboardLayout = keyboardRealIndexFromTitleIndex(keyboardLayoutsState.value.first()), // Set
            // the current to the first
            keyboardLayouts = keyboardLayoutsState.value.map { keyboardRealIndexFromTitleIndex(it) }
                .joinToString(),
            theme = themeState.value,
            themeColor = themeColorState.value,
            viewedChangelog = appSettingsViewModel.appSettings.value?.viewedChangelog ?: 0,
        ),
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
    spacebarMultiTapsState: SettingValueState<Boolean>,
    keyBordersState: SettingValueState<Boolean>,
    vibrateOnTapState: SettingValueState<Boolean>,
    soundOnTapState: SettingValueState<Boolean>,
    hideLettersState: SettingValueState<Boolean>,
    keyboardLayoutsState: SettingValueState<Set<Int>>,
    themeState: SettingValueState<Int>,
    themeColorState: SettingValueState<Int>,
) {
    keySizeState.value = DEFAULT_KEY_SIZE.toFloat()
    pushupSizeState.value = DEFAULT_PUSHUP_SIZE.toFloat()
    animationSpeedState.value = DEFAULT_ANIMATION_SPEED.toFloat()
    animationHelperSpeedState.value = DEFAULT_ANIMATION_HELPER_SPEED.toFloat()
    minSwipeLengthState.value = DEFAULT_MIN_SWIPE_LENGTH.toFloat()
    positionState.value = DEFAULT_POSITION
    autoCapitalizeState.value = DEFAULT_AUTO_CAPITALIZE.toBool()
    spacebarMultiTapsState.value = DEFAULT_SPACEBAR_MULTITAPS.toBool()
    keyBordersState.value = DEFAULT_KEY_BORDERS.toBool()
    vibrateOnTapState.value = DEFAULT_VIBRATE_ON_TAP.toBool()
    soundOnTapState.value = DEFAULT_SOUND_ON_TAP.toBool()
    hideLettersState.value = DEFAULT_HIDE_LETTERS.toBool()
    keyboardLayoutsState.value = setOf(keyboardTitleIndexFromRealIndex(DEFAULT_KEYBOARD_LAYOUT))
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
        spacebarMultiTapsState,
        keyBordersState,
        vibrateOnTapState,
        soundOnTapState,
        hideLettersState,
        keyboardLayoutsState,
        themeState,
        themeColorState,
    )
}
