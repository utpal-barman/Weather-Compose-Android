package io.github.utpal_barman.weatherandroid.data.services

import retrofit2.http.GET

interface WeatherService {
    @GET("/users")
    suspend fun getUsers(): List<User>
}

data class User(
    val name: String,
    val age: Int
)