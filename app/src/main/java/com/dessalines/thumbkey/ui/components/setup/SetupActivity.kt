package com.dessalines.thumbkey.ui.components.setup

import android.content.Intent
import android.provider.Settings
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.utils.SimpleTopAppBar
import com.dessalines.thumbkey.utils.TAG
import splitties.systemservices.inputMethodManager

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SetupActivity(
    navController: NavController,
    thumbkeyEnabled: Boolean,
    thumbkeySelected: Boolean,
) {
    Log.d(TAG, "Got to setup activity")

    val snackbarHostState = remember { SnackbarHostState() }
    val ctx = LocalContext.current

    val spacing = 16.dp

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            SimpleTopAppBar(
                text = stringResource(R.string.setup_thumbkey),
                navController = navController,
                showBack = false,
            )
        },
        content = { padding ->
            Column(
                verticalArrangement = Arrangement.spacedBy(spacing),
                modifier =
                Modifier
                    .padding(padding)
                    .padding(horizontal = spacing),
            ) {
                if (!thumbkeyEnabled) {
                    Button(modifier = Modifier.fillMaxWidth(), onClick = {
                        ctx.startActivity(Intent(Settings.ACTION_INPUT_METHOD_SETTINGS))
                    }) {
                        Text(stringResource(R.string.enable_thumbkey))
                    }
                }
                if (!thumbkeySelected) {
                    Button(modifier = Modifier.fillMaxWidth(), onClick = {
                        inputMethodManager.showInputMethodPicker()
                    }) {
                        Text(stringResource(R.string.select_thumbkey))
                    }
                }
                Button(modifier = Modifier.fillMaxWidth(), onClick = {
                    navController.navigate("settings")
                }) {
                    Text(stringResource(R.string.finish_setup))
                }
            }
        },
    )
}
