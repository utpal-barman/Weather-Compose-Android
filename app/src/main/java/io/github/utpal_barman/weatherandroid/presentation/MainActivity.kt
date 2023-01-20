package io.github.utpal_barman.weatherandroid.presentation

import HomeForecastList
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint
import io.github.utpal_barman.weatherandroid.presentation.home.HomeTopBanner

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}

@Composable
fun HomeScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        item {
            HomeTopBanner()
        }
        item {
            HomeForecastList()
        }


    }
}