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
import androidx.compose.material.icons.outlined.RotateRight
import androidx.compose.material.icons.outlined.SpaceBar
import androidx.compose.material.icons.outlined.SwapHoriz
import androidx.compose.material.icons.outlined.Swipe
import androidx.compose.material.icons.outlined.VerticalAlignTop
import androidx.compose.material.icons.outlined.Vibration
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
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
import com.dessalines.thumbkey.db.DEFAULT_HIDE_SYMBOLS
import com.dessalines.thumbkey.db.DEFAULT_KEYBOARD_LAYOUT
import com.dessalines.thumbkey.db.DEFAULT_KEY_BORDERS
import com.dessalines.thumbkey.db.DEFAULT_KEY_SIZE
import com.dessalines.thumbkey.db.DEFAULT_MIN_SWIPE_LENGTH
import com.dessalines.thumbkey.db.DEFAULT_POSITION
import com.dessalines.thumbkey.db.DEFAULT_PUSHUP_SIZE
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_SENSITIVITY
import com.dessalines.thumbkey.db.DEFAULT_SOUND_ON_TAP
import com.dessalines.thumbkey.db.DEFAULT_SPACEBAR_MULTITAPS
import com.dessalines.thumbkey.db.DEFAULT_SWIPE_ASSIST
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
    val slideSensitivityState = rememberFloatSettingState(
        (settings?.slideSensitivity ?: DEFAULT_SLIDE_SENSITIVITY).toFloat(),
    )
    val slideEnabledState = rememberBooleanSettingState(
        (settings?.slideEnabled ?: DEFAULT_SLIDE_ENABLED).toBool(),
    )
    val swipeAssistState = rememberFloatSettingState(
        (settings?.swipeAssist ?: DEFAULT_SWIPE_ASSIST).toFloat(),
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
    val hideSymbolsState = rememberBooleanSettingState(
        ((settings?.hideSymbols ?: DEFAULT_HIDE_SYMBOLS).toBool()),
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

    val showConfirmResetDialog = remember { mutableStateOf(false) }

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
                if (showConfirmResetDialog.value) {
                    AlertDialog(
                        onDismissRequest = {
                            showConfirmResetDialog.value = false
                        },
                        title = {
                            Text(stringResource(R.string.reset_to_defaults))
                        },
                        text = {
                            Text(stringResource(R.string.reset_to_defaults_msg))
                        },
                        confirmButton = {
                            Button(
                                onClick = {
                                    showConfirmResetDialog.value = false
                                    resetAppSettingsToDefault(
                                        appSettingsViewModel,
                                        keySizeState,
                                        pushupSizeState,
                                        animationSpeedState,
                                        animationHelperSpeedState,
                                        minSwipeLengthState,
                                        slideSensitivityState,
                                        slideEnabledState,
                                        swipeAssistState,
                                        positionState,
                                        autoCapitalizeState,
                                        spacebarMultiTapsState,
                                        keyBordersState,
                                        vibrateOnTapState,
                                        soundOnTapState,
                                        hideLettersState,
                                        hideSymbolsState,
                                        keyboardLayoutsState,
                                        themeState,
                                        themeColorState,
                                    )
                                },
                            ) {
                                Text(stringResource(R.string.reset_to_defaults_confirm))
                            }
                        },
                        dismissButton = {
                            Button(
                                onClick = {
                                    showConfirmResetDialog.value = false
                                },
                            ) {
                                Text(stringResource(R.string.cancel))
                            }
                        },
                    )
                }
                SettingsListMultiSelect(
                    state = keyboardLayoutsState,
                    items = KeyboardLayout.entries.sortedBy { it.title }.map { it.title },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.KeyboardAlt,
                            contentDescription = null,
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
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
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
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
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
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
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
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
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
                            contentDescription = null,
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
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
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
                            contentDescription = null,
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
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
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
                            contentDescription = null,
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
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
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
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
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
                            contentDescription = null,
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
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
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
                            contentDescription = null,
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
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                SettingsCheckbox(
                    state = slideEnabledState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.SpaceBar,
                            contentDescription = stringResource(R.string.spacebar_slide),
                        )
                    },
                    title = {
                        Text(stringResource(R.string.spacebar_slide))
                    },
                    onCheckedChange = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
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
                            contentDescription = null,
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
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
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
                            contentDescription = null,
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
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
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
                            contentDescription = null,
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
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
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
                            contentDescription = null,
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
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
                        )
                    },
                )
                val swipeAssistStr = stringResource(R.string.swipe_assist, swipeAssistState.value.toInt().toString())
                SettingsSlider(
                    // 23° is the minimum for 8-directional swiping.
                    // Above 180°, the behavior no longer changes.
                    valueRange = 23f..180f,
                    state = swipeAssistState,
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.RotateRight,
                            contentDescription = null,
                        )
                    },
                    title = {
                        Text(swipeAssistStr)
                    },
                    onValueChangeFinished = {
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
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
                            contentDescription = null,
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
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
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
                            contentDescription = null,
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
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
                            keyboardLayoutsState,
                            themeState,
                            themeColorState,
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
                        updateAppSettings(
                            appSettingsViewModel,
                            keySizeState,
                            pushupSizeState,
                            animationSpeedState,
                            animationHelperSpeedState,
                            minSwipeLengthState,
                            slideSensitivityState,
                            slideEnabledState,
                            swipeAssistState,
                            positionState,
                            autoCapitalizeState,
                            spacebarMultiTapsState,
                            keyBordersState,
                            vibrateOnTapState,
                            soundOnTapState,
                            hideLettersState,
                            hideSymbolsState,
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
                            contentDescription = null,
                        )
                    },
                    onClick = {
                        showConfirmResetDialog.value = true
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
    slideSensitivityState: SettingValueState<Float>,
    slideEnabledState: SettingValueState<Boolean>,
    swipeAssistState: SettingValueState<Float>,
    positionState: SettingValueState<Int>,
    autoCapitalizeState: SettingValueState<Boolean>,
    spacebarMultiTapsState: SettingValueState<Boolean>,
    keyBordersState: SettingValueState<Boolean>,
    vibrateOnTapState: SettingValueState<Boolean>,
    soundOnTapState: SettingValueState<Boolean>,
    hideLettersState: SettingValueState<Boolean>,
    hideSymbolsState: SettingValueState<Boolean>,
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
            slideSensitivity = slideSensitivityState.value.toInt(),
            slideEnabled = slideEnabledState.value.toInt(),
            swipeAssist = swipeAssistState.value.toInt(),
            position = positionState.value,
            autoCapitalize = autoCapitalizeState.value.toInt(),
            spacebarMultiTaps = spacebarMultiTapsState.value.toInt(),
            keyBorders = keyBordersState.value.toInt(),
            vibrateOnTap = vibrateOnTapState.value.toInt(),
            soundOnTap = soundOnTapState.value.toInt(),
            hideLetters = hideLettersState.value.toInt(),
            hideSymbols = hideSymbolsState.value.toInt(),
            keyboardLayout = keyboardRealIndexFromTitleIndex(keyboardLayoutsState.value.first()), // Set
            // the current to the first
            keyboardLayouts = keyboardLayoutsState.value.map { keyboardRealIndexFromTitleIndex(it) }
                .joinToString(),
            theme = themeState.value,
            themeColor = themeColorState.value,
            viewedChangelog = appSettingsViewModel.appSettings.value?.viewedChangelog ?: 0,
            lastVersionCodeViewed = appSettingsViewModel.appSettings.value?.lastVersionCodeViewed ?: 0,
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
    slideSensitivityState: SettingValueState<Float>,
    slideEnabledState: SettingValueState<Boolean>,
    swipeAssistState: SettingValueState<Float>,
    positionState: SettingValueState<Int>,
    autoCapitalizeState: SettingValueState<Boolean>,
    spacebarMultiTapsState: SettingValueState<Boolean>,
    keyBordersState: SettingValueState<Boolean>,
    vibrateOnTapState: SettingValueState<Boolean>,
    soundOnTapState: SettingValueState<Boolean>,
    hideLettersState: SettingValueState<Boolean>,
    hideSymbolsState: SettingValueState<Boolean>,
    keyboardLayoutsState: SettingValueState<Set<Int>>,
    themeState: SettingValueState<Int>,
    themeColorState: SettingValueState<Int>,
) {
    keySizeState.value = DEFAULT_KEY_SIZE.toFloat()
    pushupSizeState.value = DEFAULT_PUSHUP_SIZE.toFloat()
    animationSpeedState.value = DEFAULT_ANIMATION_SPEED.toFloat()
    animationHelperSpeedState.value = DEFAULT_ANIMATION_HELPER_SPEED.toFloat()
    minSwipeLengthState.value = DEFAULT_MIN_SWIPE_LENGTH.toFloat()
    slideSensitivityState.value = DEFAULT_SLIDE_SENSITIVITY.toFloat()
    swipeAssistState.value = DEFAULT_SWIPE_ASSIST.toFloat()
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
        slideSensitivityState,
        slideEnabledState,
        swipeAssistState,
        positionState,
        autoCapitalizeState,
        spacebarMultiTapsState,
        keyBordersState,
        vibrateOnTapState,
        soundOnTapState,
        hideLettersState,
        hideSymbolsState,
        keyboardLayoutsState,
        themeState,
        themeColorState,
    )
}
