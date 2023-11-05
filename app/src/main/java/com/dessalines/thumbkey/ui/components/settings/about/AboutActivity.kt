package com.dessalines.thumbkey.ui.components.settings.about

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AttachMoney
import androidx.compose.material.icons.outlined.BugReport
import androidx.compose.material.icons.outlined.Chat
import androidx.compose.material.icons.outlined.Code
import androidx.compose.material.icons.outlined.NewReleases
import androidx.compose.material.icons.outlined.TravelExplore
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alorma.compose.settings.ui.SettingsMenuLink
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.utils.SimpleTopAppBar
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.openLink

const val githubUrl = "https://github.com/dessalines/thumb-key"
const val userGuideLink = "https://github.com/dessalines/thumb-key#user-guide"
const val matrixChat = "https://matrix.to/#/#thumbkey-dev:matrix.org"
const val donateLink = "https://liberapay.com/dessalines"
const val lemmyLink = "https://lemmy.ml/c/thumbkey"
const val mastodonLink = "https://mastodon.social/@dessalines"

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutActivity(navController: NavController) {
    Log.d(TAG, "Got to About activity")

    val ctx = LocalContext.current

    val version = ctx.packageManager.getPackageInfo(ctx.packageName, 0).versionName

    val snackbarHostState = remember { SnackbarHostState() }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            SimpleTopAppBar(text = stringResource(R.string.about), navController = navController)
        },
        content = { padding ->
            Column(
                modifier =
                Modifier.padding(padding)
                    .background(color = MaterialTheme.colorScheme.surface),
            ) {
                SettingsMenuLink(
                    title = { Text(stringResource(R.string.whats_new)) },
                    subtitle = { Text(stringResource(R.string.version, version)) },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.NewReleases,
                            contentDescription = stringResource(R.string.releases),
                        )
                    },
                    onClick = {
                        openLink("$githubUrl/blob/main/RELEASES.md", ctx)
                    },
                )
                SettingsDivider()
                SettingsHeader(text = stringResource(R.string.support))
                SettingsMenuLink(
                    title = { Text(stringResource(R.string.issue_tracker)) },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.BugReport,
                            contentDescription = stringResource(R.string.issue_tracker),
                        )
                    },
                    onClick = {
                        openLink("$githubUrl/issues", ctx)
                    },
                )
                SettingsMenuLink(
                    title = { Text(stringResource(R.string.developer_matrix_chatroom)) },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Chat,
                            contentDescription = stringResource(R.string.developer_matrix_chatroom),
                        )
                    },
                    onClick = {
                        openLink(matrixChat, ctx)
                    },
                )
                SettingsMenuLink(
                    title = { Text(stringResource(R.string.donate_to_thumbkey)) },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.AttachMoney,
                            contentDescription = stringResource(R.string.donate_to_thumbkey),
                        )
                    },
                    onClick = {
                        openLink(donateLink, ctx)
                    },
                )
                SettingsDivider()
                SettingsHeader(text = stringResource(R.string.social))
                SettingsMenuLink(
                    title = { Text(stringResource(R.string.join_c_thumbkey)) },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.thumb_key_icon),
                            modifier = Modifier.size(32.dp),
                            contentDescription = stringResource(R.string.join_c_thumbkey),
                        )
                    },
                    onClick = {
                        openLink(lemmyLink, ctx)
                    },
                )
                SettingsMenuLink(
                    title = { Text(stringResource(R.string.follow_me_mastodon)) },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.TravelExplore,
                            contentDescription = stringResource(R.string.follow_me_mastodon),
                        )
                    },
                    onClick = {
                        openLink(mastodonLink, ctx)
                    },
                )
                SettingsDivider()
                SettingsHeader(text = stringResource(R.string.open_source))
                SettingsMenuLink(
                    modifier = Modifier.padding(top = 20.dp),
                    title = { Text(stringResource(R.string.source_code)) },
                    subtitle = {
                        Text(stringResource(R.string.source_code_subtitle))
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Code,
                            contentDescription = stringResource(R.string.source_code),
                        )
                    },
                    onClick = {
                        openLink(githubUrl, ctx)
                    },
                )
            }
        },
    )
}

@Composable
fun SettingsDivider() {
    Divider(modifier = Modifier.padding(vertical = 10.dp))
}

@Composable
fun SettingsHeader(
    text: String,
    color: Color = MaterialTheme.colorScheme.primary,
) {
    Text(
        text,
        modifier = Modifier.padding(start = 64.dp),
        color = color,
    )
}

@Preview
@Composable
fun AboutPreview() {
    AboutActivity(navController = rememberNavController())
}
