package com.dessalines.thumbkey.ui.components.settings

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.HelpCenter
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.InstallMobile
import androidx.compose.material.icons.outlined.KeyboardAlt
import androidx.compose.material.icons.outlined.Palette
import androidx.compose.material.icons.outlined.ResetTv
import androidx.compose.material.icons.outlined.TouchApp
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.alorma.compose.settings.storage.base.SettingValueState
import com.alorma.compose.settings.storage.base.rememberIntSetSettingState
import com.alorma.compose.settings.ui.SettingsListMultiSelect
import com.alorma.compose.settings.ui.SettingsMenuLink
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.AppSettings
import com.dessalines.thumbkey.db.AppSettingsViewModel
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_HELPER_SPEED
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_SPEED
import com.dessalines.thumbkey.db.DEFAULT_AUTO_CAPITALIZE
import com.dessalines.thumbkey.db.DEFAULT_BACKDROP_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_HIDE_LETTERS
import com.dessalines.thumbkey.db.DEFAULT_HIDE_SYMBOLS
import com.dessalines.thumbkey.db.DEFAULT_KEYBOARD_LAYOUT
import com.dessalines.thumbkey.db.DEFAULT_KEY_BORDERS
import com.dessalines.thumbkey.db.DEFAULT_KEY_BORDER_WIDTH
import com.dessalines.thumbkey.db.DEFAULT_KEY_PADDING
import com.dessalines.thumbkey.db.DEFAULT_KEY_RADIUS
import com.dessalines.thumbkey.db.DEFAULT_KEY_SIZE
import com.dessalines.thumbkey.db.DEFAULT_MIN_SWIPE_LENGTH
import com.dessalines.thumbkey.db.DEFAULT_POSITION
import com.dessalines.thumbkey.db.DEFAULT_PUSHUP_SIZE
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_BACKSPACE_DEADZONE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_CURSOR_MOVEMENT_MODE
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_SENSITIVITY
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_SPACEBAR_DEADZONE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SOUND_ON_TAP
import com.dessalines.thumbkey.db.DEFAULT_SPACEBAR_MULTITAPS
import com.dessalines.thumbkey.db.DEFAULT_THEME
import com.dessalines.thumbkey.db.DEFAULT_THEME_COLOR
import com.dessalines.thumbkey.db.DEFAULT_VIBRATE_ON_TAP
import com.dessalines.thumbkey.db.LayoutsUpdate
import com.dessalines.thumbkey.ui.components.common.TestOutTextField
import com.dessalines.thumbkey.ui.components.settings.about.SettingsDivider
import com.dessalines.thumbkey.ui.components.settings.about.userGuideLink
import com.dessalines.thumbkey.utils.KeyboardLayout
import com.dessalines.thumbkey.utils.SimpleTopAppBar
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.keyboardLayoutsSetFromTitleIndex
import com.dessalines.thumbkey.utils.keyboardRealIndexFromTitleIndex
import com.dessalines.thumbkey.utils.keyboardTitleIndexFromRealIndex
import com.dessalines.thumbkey.utils.openLink

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsActivity(
    navController: NavController,
    appSettingsViewModel: AppSettingsViewModel,
    thumbkeyEnabled: Boolean,
    thumbkeySelected: Boolean,
) {
    Log.d(TAG, "Got to settings activity")

    val snackbarHostState = remember { SnackbarHostState() }
    val ctx = LocalContext.current

    val settings = appSettingsViewModel.appSettings.observeAsState().value

    val scrollState = rememberScrollState()
    val showConfirmResetDialog = remember { mutableStateOf(false) }

    val layoutsState = rememberIntSetSettingState(
        keyboardLayoutsSetFromTitleIndex(settings?.keyboardLayouts),
    )

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            SimpleTopAppBar(text = stringResource(R.string.app_name), navController = navController, showBack = false)
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .verticalScroll(scrollState)
                    .imePadding(),
            ) {
                if (!(thumbkeyEnabled || thumbkeySelected)) {
                    val setupStr = stringResource(R.string.setup)
                    SettingsMenuLink(
                        title = { Text(setupStr) },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.InstallMobile,
                                contentDescription = setupStr,
                            )
                        },
                        onClick = { navController.navigate("setup") },
                    )
                }
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
                                        layoutsState,
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
                    state = layoutsState,
                    items = KeyboardLayout.entries.sortedBy { it.keyboardDefinition.title }.map { it.keyboardDefinition.title },
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
                            layoutsState.value = setOf(keyboardTitleIndexFromRealIndex(DEFAULT_KEYBOARD_LAYOUT))
                        }
                        updateLayouts(
                            appSettingsViewModel,
                            layoutsState,
                        )
                    },
                )
                val lookAndFeelStr = stringResource(R.string.look_and_feel)
                SettingsMenuLink(
                    title = { Text(lookAndFeelStr) },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Palette,
                            contentDescription = lookAndFeelStr,
                        )
                    },
                    onClick = { navController.navigate("lookAndFeel") },
                )
                val behaviorStr = stringResource(R.string.behavior)
                SettingsMenuLink(
                    title = { Text(behaviorStr) },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.TouchApp,
                            contentDescription = behaviorStr,
                        )
                    },
                    onClick = { navController.navigate("behavior") },
                )
                val userGuideStr = stringResource(R.string.user_guide)
                SettingsMenuLink(
                    title = { Text(userGuideStr) },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.HelpCenter,
                            contentDescription = userGuideStr,
                        )
                    },
                    onClick = {
                        openLink(userGuideLink, ctx)
                    },
                )
                val aboutStr = stringResource(R.string.about)
                SettingsMenuLink(
                    title = { Text(aboutStr) },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Info,
                            contentDescription = aboutStr,
                        )
                    },
                    onClick = { navController.navigate("about") },
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
                SettingsDivider()
                TestOutTextField()
            }
        },
    )
}

private fun resetAppSettingsToDefault(
    appSettingsViewModel: AppSettingsViewModel,
    layoutsState: SettingValueState<Set<Int>>,
) {
    layoutsState.value = setOf(keyboardTitleIndexFromRealIndex(DEFAULT_KEYBOARD_LAYOUT))
    appSettingsViewModel.update(
        AppSettings(
            id = 1,
            animationHelperSpeed = DEFAULT_ANIMATION_HELPER_SPEED,
            autoCapitalize = DEFAULT_AUTO_CAPITALIZE,
            animationSpeed = DEFAULT_ANIMATION_SPEED,
            slideEnabled = DEFAULT_SLIDE_ENABLED,
            slideCursorMovementMode = DEFAULT_SLIDE_CURSOR_MOVEMENT_MODE,
            slideSpacebarDeadzoneEnabled = DEFAULT_SLIDE_SPACEBAR_DEADZONE_ENABLED,
            slideBackspaceDeadzoneEnabled = DEFAULT_SLIDE_BACKSPACE_DEADZONE_ENABLED,
            slideSensitivity = DEFAULT_SLIDE_SENSITIVITY,
            soundOnTap = DEFAULT_SOUND_ON_TAP,
            position = DEFAULT_POSITION,
            pushupSize = DEFAULT_PUSHUP_SIZE,
            minSwipeLength = DEFAULT_MIN_SWIPE_LENGTH,
            keyboardLayout = DEFAULT_KEYBOARD_LAYOUT,
            keyboardLayouts = setOf(DEFAULT_KEYBOARD_LAYOUT).joinToString(),
            hideLetters = DEFAULT_HIDE_LETTERS,
            hideSymbols = DEFAULT_HIDE_SYMBOLS,
            keyBorders = DEFAULT_KEY_BORDERS,
            keySize = DEFAULT_KEY_SIZE,
            spacebarMultiTaps = DEFAULT_SPACEBAR_MULTITAPS,
            theme = DEFAULT_THEME,
            themeColor = DEFAULT_THEME_COLOR,
            vibrateOnTap = DEFAULT_VIBRATE_ON_TAP,
            lastVersionCodeViewed = appSettingsViewModel.appSettings.value?.lastVersionCodeViewed ?: 0,
            viewedChangelog = appSettingsViewModel.appSettings.value?.viewedChangelog ?: 1,
            backdropEnabled = DEFAULT_BACKDROP_ENABLED,
            keyPadding = DEFAULT_KEY_PADDING,
            keyBorderWidth = DEFAULT_KEY_BORDER_WIDTH,
            keyRadius = DEFAULT_KEY_RADIUS,
        ),

    )
}

private fun updateLayouts(
    appSettingsViewModel: AppSettingsViewModel,
    layoutsState: SettingValueState<Set<Int>>,
) {
    appSettingsViewModel.updateLayouts(
        LayoutsUpdate(
            id = 1,
            keyboardLayout = keyboardRealIndexFromTitleIndex(layoutsState.value.first()), // Set
            // the current to the first
            keyboardLayouts = layoutsState.value.map { keyboardRealIndexFromTitleIndex(it) }
                .joinToString(),
        ),
    )
}
