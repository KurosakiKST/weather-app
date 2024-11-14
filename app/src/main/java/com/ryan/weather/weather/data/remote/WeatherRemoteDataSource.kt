package com.ryan.weather.weather.data.remote

import com.ryan.weather.core.data.networking.safeCall
import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.weather.data.datasource.WeatherDataSource
import com.ryan.weather.weather.data.local.database.entity.weather.CurrentWeatherEntity
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastDayEntity
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastWeatherEntity
import com.ryan.weather.weather.data.local.database.entity.weather.LocationWeatherEntity
import com.ryan.weather.weather.domain.model.Forecast
import com.ryan.weather.weather.domain.model.Weather
import com.ryan.weather.core.domain.utils.Result
import com.ryan.weather.weather.data.mappers.toDomain
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class WeatherRemoteDataSource @Inject constructor(
    private val weatherAPIService: WeatherAPIService
) : WeatherDataSource {

    override suspend fun getCurrentWeather(
        apiKey: String,
        city: String
    ): Result<Weather, NetworkError> {
        return withContext(Dispatchers.IO) {
            safeCall(
                apiCall = { weatherAPIService.getCurrentWeather(apiKey, city) },
                onSuccess = { responseBody -> responseBody.toDomain() }
            )
        }
    }

    override suspend fun getForecastWeather(
        apiKey: String,
        city: String,
        days: Int
    ): Result<Forecast, NetworkError> {
        return withContext(Dispatchers.IO) {
            safeCall(
                apiCall = { weatherAPIService.getForeCastWeather(apiKey, city, days) },
                onSuccess = { responseBody -> responseBody.toDomain() }
            )
        }
    }

    override suspend fun addCurrentWeather(weather: CurrentWeatherEntity) {
        // Implement database insertion logic
    }

    override suspend fun addForecastWeather(forecast: ForecastWeatherEntity) {
        // Implement database insertion logic
    }

    override suspend fun addLocationWeather(locationEntity: LocationWeatherEntity) {
        // Implement database insertion logic
    }

    override suspend fun addForecastDays(forecastDays: List<ForecastDayEntity>) {
        // Implement database insertion logic
    }
}
