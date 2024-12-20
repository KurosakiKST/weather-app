package com.ryan.weather.forecast.data.remote

import com.ryan.weather.core.presentation.components.NetWorkService
import com.ryan.weather.forecast.data.remote.dto.ForecastDto
import com.ryan.weather.forecast.data.remote.dto.WeatherDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPIService {

    @GET(NetWorkService.CURRENT_WEATHER)
    suspend fun getCurrentWeather(
        @Query("key") apiKey: String,
        @Query("q") city: String
    ) : Response<WeatherDto>

    @GET(NetWorkService.FORECAST_WEATHER)
    suspend fun getForeCastWeather(
        @Query("key") apiKey: String,
        @Query("q") city: String,
        @Query("days") days: Int,
    ): Response<ForecastDto>

}