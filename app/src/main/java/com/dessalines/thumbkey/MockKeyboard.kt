package com.dessalines.thumbkey

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MockKeyboard() {
    Column(
        Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color.Gray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(color = Color.Black, text = "This should resemble a keyboard")
        Button(modifier = Modifier.width(250.dp), onClick = { }) {
            Text(text = "A Button")
        }
        Text(color = Color.Black, text = "Example for Linear Progress Indicator")
        Spacer(modifier = Modifier.height(16.dp))
        LinearProgressIndicator()
    }
}
