package io.github.utpal_barman.weatherandroid.domain.usecase

import io.github.utpal_barman.weatherandroid.data.services.WeatherService
import javax.inject.Inject

class GetWeatherUseCase @Inject constructor(private val weatherService: WeatherService) {
//    suspend fun execute(): List<Int> {
//        return weatherService.getWeather()
//    }


}