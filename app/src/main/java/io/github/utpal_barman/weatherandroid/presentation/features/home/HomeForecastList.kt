import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


val forecast = listOf(
    Forecast("Monday", "25 degree"),
    Forecast("Tuesday", "27 degree"),
    Forecast("Wednesday", "30 degree"),
    Forecast("Thursday", "28 degree"),
    Forecast("Friday", "29 degree"),
    Forecast("Saturday", "32 degree"),
    Forecast("Sunday", "34 degree"),
    Forecast("Monday", "35 degree"),
    Forecast("Tuesday", "33 degree"),
    Forecast("Wednesday", "30 degree")
)

data class Forecast(val day: String, val temp: String)

@Composable
fun HomeForecastList() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(all = 16.dp)
    ) {
        forecast.map {
            WeatherCard(dayName = it.day, dayTemperature = it.temp, onClick = {})
        }

    }
}





