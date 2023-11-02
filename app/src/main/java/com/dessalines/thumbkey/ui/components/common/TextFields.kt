package com.dessalines.thumbkey.ui.components.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.dessalines.thumbkey.R

@Composable
fun TestOutTextField() {
    var text by remember { mutableStateOf("") }
    TextField(
        modifier =
            Modifier
                .fillMaxWidth(),
        value = text,
        onValueChange = { text = it },
        placeholder = { Text(stringResource(R.string.test_out_thumbkey)) },
        colors =
            TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
    )
}
