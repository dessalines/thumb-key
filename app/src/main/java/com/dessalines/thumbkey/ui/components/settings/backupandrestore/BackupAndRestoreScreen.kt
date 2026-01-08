package com.dessalines.thumbkey.ui.components.settings.backupandrestore

import android.os.Build
import android.util.Log
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ResetTv
import androidx.compose.material.icons.outlined.Restore
import androidx.compose.material.icons.outlined.Save
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.AppDB
import com.dessalines.thumbkey.db.AppSettings
import com.dessalines.thumbkey.db.AppSettingsViewModel
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_HELPER_SPEED
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_SPEED
import com.dessalines.thumbkey.db.DEFAULT_AUTO_CAPITALIZE
import com.dessalines.thumbkey.db.DEFAULT_AUTO_SIZE_KEYS
import com.dessalines.thumbkey.db.DEFAULT_BACKDROP_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_CIRCULAR_DRAG_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_CLOCKWISE_DRAG_ACTION
import com.dessalines.thumbkey.db.DEFAULT_COUNTERCLOCKWISE_DRAG_ACTION
import com.dessalines.thumbkey.db.DEFAULT_DISABLE_FULLSCREEN_EDITOR
import com.dessalines.thumbkey.db.DEFAULT_DRAG_RETURN_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_GHOST_KEYS_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_HIDE_LETTERS
import com.dessalines.thumbkey.db.DEFAULT_HIDE_SYMBOLS
import com.dessalines.thumbkey.db.DEFAULT_IGNORE_BOTTOM_PADDING
import com.dessalines.thumbkey.db.DEFAULT_KEYBOARD_LAYOUT
import com.dessalines.thumbkey.db.DEFAULT_KEY_BORDERS
import com.dessalines.thumbkey.db.DEFAULT_KEY_BORDER_WIDTH
import com.dessalines.thumbkey.db.DEFAULT_KEY_HEIGHT
import com.dessalines.thumbkey.db.DEFAULT_KEY_MODIFICATIONS
import com.dessalines.thumbkey.db.DEFAULT_KEY_PADDING
import com.dessalines.thumbkey.db.DEFAULT_KEY_RADIUS
import com.dessalines.thumbkey.db.DEFAULT_KEY_WIDTH
import com.dessalines.thumbkey.db.DEFAULT_MIN_SWIPE_LENGTH
import com.dessalines.thumbkey.db.DEFAULT_NON_SQUARE_KEYS
import com.dessalines.thumbkey.db.DEFAULT_POSITION
import com.dessalines.thumbkey.db.DEFAULT_PUSHUP_SIZE
import com.dessalines.thumbkey.db.DEFAULT_SHOW_TOAST_ON_LAYOUT_SWITCH
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_BACKSPACE_DEADZONE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_CURSOR_MOVEMENT_MODE
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_SENSITIVITY
import com.dessalines.thumbkey.db.DEFAULT_SLIDE_SPACEBAR_DEADZONE_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_SOUND_ON_TAP
import com.dessalines.thumbkey.db.DEFAULT_SPACEBAR_MULTITAPS
import com.dessalines.thumbkey.db.DEFAULT_THEME
import com.dessalines.thumbkey.db.DEFAULT_THEME_COLOR
import com.dessalines.thumbkey.db.DEFAULT_VIBRATE_ON_SLIDE
import com.dessalines.thumbkey.db.DEFAULT_VIBRATE_ON_TAP
import com.dessalines.thumbkey.utils.SimpleTopAppBar
import com.dessalines.thumbkey.utils.keyboardLayoutsSetFromDbIndexString
import com.dessalines.thumbkey.utils.updateLayouts
import com.roomdbexportimport.RoomDBExportImport
import me.zhanghai.compose.preference.Preference
import me.zhanghai.compose.preference.ProvidePreferenceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BackupAndRestoreScreen(
    navController: NavController,
    appSettingsViewModel: AppSettingsViewModel,
) {
    Log.d("thumb key", "Got to Backup and Restore screen")

    val ctx = LocalContext.current
    val snackbarHostState = remember { SnackbarHostState() }

    var showConfirmResetDialog by remember { mutableStateOf(false) }

    val dbSavedText = stringResource(R.string.database_backed_up)
    val dbRestoredText = stringResource(R.string.database_restored)

    val dbHelper = RoomDBExportImport(AppDB.getDatabase(ctx).openHelper)

    val exportDbLauncher =
        rememberLauncherForActivityResult(
            ActivityResultContracts.CreateDocument("application/zip"),
        ) {
            it?.also {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    dbHelper.export(ctx, it)
                    Toast.makeText(ctx, dbSavedText, Toast.LENGTH_SHORT).show()
                }
            }
        }

    val importDbLauncher =
        rememberLauncherForActivityResult(
            ActivityResultContracts.OpenDocument(),
        ) {
            it?.also {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    dbHelper.import(ctx, it, true)
                    Toast.makeText(ctx, dbRestoredText, Toast.LENGTH_SHORT).show()
                }
            }
        }

    if (showConfirmResetDialog) {
        AlertDialog(
            onDismissRequest = {
                showConfirmResetDialog = false
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
                        showConfirmResetDialog = false
                        resetAppSettingsToDefault(
                            appSettingsViewModel,
                        )
                    },
                ) {
                    Text(stringResource(R.string.reset_to_defaults_confirm))
                }
            },
            dismissButton = {
                Button(
                    onClick = {
                        showConfirmResetDialog = false
                    },
                ) {
                    Text(stringResource(R.string.cancel))
                }
            },
        )
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            SimpleTopAppBar(text = stringResource(R.string.backup_and_restore), navController = navController)
        },
        content = { padding ->
            Column(
                modifier =
                    Modifier
                        .verticalScroll(rememberScrollState())
                        .padding(padding),
            ) {
                ProvidePreferenceTheme {
                    Preference(
                        title = { Text(stringResource(R.string.backup_database)) },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Save,
                                contentDescription = null,
                            )
                        },
                        onClick = {
                            exportDbLauncher.launch("thumb-key")
                        },
                    )
                    Preference(
                        title = { Text(stringResource(R.string.restore_database)) },
                        summary = {
                            Text(stringResource(R.string.restore_database_warning))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Restore,
                                contentDescription = null,
                            )
                        },
                        onClick = {
                            importDbLauncher.launch(arrayOf("application/zip"))
                        },
                    )
                    Preference(
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
                            showConfirmResetDialog = true
                        },
                    )
                }
            }
        },
    )
}

private fun resetAppSettingsToDefault(appSettingsViewModel: AppSettingsViewModel) {
    val layoutsDefault = keyboardLayoutsSetFromDbIndexString(DEFAULT_KEYBOARD_LAYOUT.toString())
    updateLayouts(appSettingsViewModel, layoutsDefault)

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
            spacebarMultiTaps = DEFAULT_SPACEBAR_MULTITAPS,
            theme = DEFAULT_THEME,
            themeColor = DEFAULT_THEME_COLOR,
            vibrateOnTap = DEFAULT_VIBRATE_ON_TAP,
            vibrateOnSlide = DEFAULT_VIBRATE_ON_SLIDE,
            lastVersionCodeViewed = appSettingsViewModel.appSettings.value?.lastVersionCodeViewed ?: 0,
            viewedChangelog = appSettingsViewModel.appSettings.value?.viewedChangelog ?: 1,
            backdropEnabled = DEFAULT_BACKDROP_ENABLED,
            keyPadding = DEFAULT_KEY_PADDING,
            keyBorderWidth = DEFAULT_KEY_BORDER_WIDTH,
            keyRadius = DEFAULT_KEY_RADIUS,
            dragReturnEnabled = DEFAULT_DRAG_RETURN_ENABLED,
            circularDragEnabled = DEFAULT_CIRCULAR_DRAG_ENABLED,
            clockwiseDragAction = DEFAULT_CLOCKWISE_DRAG_ACTION,
            counterclockwiseDragAction = DEFAULT_COUNTERCLOCKWISE_DRAG_ACTION,
            ghostKeysEnabled = DEFAULT_GHOST_KEYS_ENABLED,
            keyModifications = DEFAULT_KEY_MODIFICATIONS,
            autoSizeKeys = DEFAULT_AUTO_SIZE_KEYS,
            nonSquareKeys = DEFAULT_NON_SQUARE_KEYS,
            keyWidth = DEFAULT_KEY_WIDTH,
            keyHeight = DEFAULT_KEY_HEIGHT,
            ignoreBottomPadding = DEFAULT_IGNORE_BOTTOM_PADDING,
            showToastOnLayoutSwitch = DEFAULT_SHOW_TOAST_ON_LAYOUT_SWITCH,
            disableFullscreenEditor = DEFAULT_DISABLE_FULLSCREEN_EDITOR,
        ),
    )
}
