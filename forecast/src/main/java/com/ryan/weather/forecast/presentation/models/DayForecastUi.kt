package com.ryan.weather.forecast.presentation.models

data class DayForecastUi(
    val maxTempC: Double,
    val maxTempF: Double,
    val minTempC: Double,
    val minTempF: Double,
    val avgTempC: Double,
    val avgTempF: Double,
    val maxWindMph: Double,
    val maxWindKph: Double,
    val totalPrecipMm: Double,
    val totalPrecipIn: Double,
    val totalSnowCm: Double,
    val avgVisKm: Double,
    val avgVisMiles: Double,
    val avgHumidity: Int,
    val dailyWillItRain: Int,
    val dailyChanceOfRain: Int,
    val dailyWillItSnow: Int,
    val dailyChanceOfSnow: Int,
    val condition: ConditionUi,
    val uv: Double
)
