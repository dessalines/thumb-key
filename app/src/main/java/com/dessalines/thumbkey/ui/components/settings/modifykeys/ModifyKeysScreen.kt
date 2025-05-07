package com.dessalines.thumbkey.ui.components.settings.modifykeys

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.outlined.QuestionMark
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.NavController
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.AppSettingsViewModel
import com.dessalines.thumbkey.db.DEFAULT_KEY_MODIFICATIONS
import com.dessalines.thumbkey.db.KeyModificationsUpdate
import com.dessalines.thumbkey.ui.components.common.TestOutTextField
import com.dessalines.thumbkey.ui.components.settings.about.SettingsDivider
import com.dessalines.thumbkey.utils.SimpleTopAppBar
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.checkAllKeyboardModifications
import com.dessalines.thumbkey.utils.openLink
import kotlinx.coroutines.delay
import me.zhanghai.compose.preference.Preference
import me.zhanghai.compose.preference.ProvidePreferenceTheme

const val MODIFY_KEYS_URL = "https://github.com/dessalines/thumb-key#modify-keys"

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModifyKeysScreen(
    navController: NavController,
    appSettingsViewModel: AppSettingsViewModel,
) {
    Log.d(TAG, "Got to modify keys activity")

    val settings by appSettingsViewModel.appSettings.observeAsState()
    var keyModifications = (settings?.keyModifications) ?: DEFAULT_KEY_MODIFICATIONS
    var textState by remember { mutableStateOf(TextFieldValue(keyModifications)) }
    var keyModificationsError = remember { mutableStateOf<String?>(null) }
    var shouldTriggerKeyModificationsChange = false
    val snackbarHostState = remember { SnackbarHostState() }
    val scrollState = rememberScrollState()
    val ctx = LocalContext.current

    checkAllKeyboardModifications(settings?.keyModifications, keyModificationsError)

    fun updateKeyModifications() {
        appSettingsViewModel.updateKeyModifications(
            KeyModificationsUpdate(
                id = 1,
                keyModifications = keyModifications,
            ),
        )
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            SimpleTopAppBar(
                text = stringResource(R.string.modify_keys),
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
                    Preference(
                        title = { Text(stringResource(R.string.how_to_modify_keys)) },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.QuestionMark,
                                contentDescription = stringResource(R.string.how_to_modify_keys),
                            )
                        },
                        onClick = {
                            openLink(MODIFY_KEYS_URL, ctx)
                        },
                    )
                    TextField(
                        modifier =
                            Modifier.fillMaxWidth(),
                        value = textState,
                        onValueChange = {
                            // test that the value actually changed and not just cursor position
                            shouldTriggerKeyModificationsChange = textState.text != it.text
                            textState = it
                        },
                        placeholder = {
                            Text(
                                stringResource(
                                    R.string.key_modification_placeholder,
                                ),
                            )
                        },
                        colors =
                            TextFieldDefaults.colors(
                                errorContainerColor = MaterialTheme.colorScheme.errorContainer,
                            ),
                        trailingIcon = {
                            keyModificationsError.value?.let {
                                Icon(
                                    Icons.Filled.Error,
                                    "error",
                                    tint = MaterialTheme.colorScheme.error,
                                )
                            }
                        },
                        isError = keyModificationsError.value != null,
                    )
                    LaunchedEffect(key1 = textState) {
                        if (shouldTriggerKeyModificationsChange) {
                            // debounce the text input
                            delay(300)
                            keyModifications = textState.text
                            shouldTriggerKeyModificationsChange = false
                            updateKeyModifications()
                        }
                    }
                    keyModificationsError.value?.let {
                        Text(
                            text = it,
                            color = MaterialTheme.colorScheme.error,
                            style = MaterialTheme.typography.bodyMedium,
                        )
                    }
                    SettingsDivider()
                    TestOutTextField()
                }
            }
        },
    )
}
