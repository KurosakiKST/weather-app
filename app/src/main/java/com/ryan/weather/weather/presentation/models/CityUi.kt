package com.ryan.weather.weather.presentation.models

data class CityUi(
    val id: Int,
    val name: String,
    val region: String,
    val country: String,
    val latitude: Double,
    val longitude: Double,
    val url: String
)