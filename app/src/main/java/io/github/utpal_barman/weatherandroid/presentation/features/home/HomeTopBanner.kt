package io.github.utpal_barman.weatherandroid.presentation.features.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HomeTopBanner() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(color = Color(0xFFCBBEFC))
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text("Good morning!", style = MaterialTheme.typography.body1)
        Text("Dhaka, Bangladesh", style = MaterialTheme.typography.h5)
        Text("18°", style = MaterialTheme.typography.h1)

    }
}