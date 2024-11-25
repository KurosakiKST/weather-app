package com.ryan.weather.forecast.presentation.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.core.presentation.utils.ViewState
import com.ryan.weather.forecast.data.mappers.toUi
import com.ryan.weather.forecast.domain.usecase.LocationUseCase
import com.ryan.weather.forecast.presentation.models.CityUi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeVM @Inject constructor(
    private val locationUseCase: LocationUseCase
) : ViewModel() {
    private val _locationState = MutableStateFlow<ViewState<List<CityUi>>>(ViewState.NoData)
    val locationState: StateFlow<ViewState<List<CityUi>>> = _locationState

    fun getCities(city: String) {
        _locationState.value = ViewState.Loading
        viewModelScope.launch {
            when (val result = locationUseCase.getCities(city)) {
                is NetworkResult.Success -> {
                    Log.i("WeatherVM", "Success: ${result.data}")
                    _locationState.value = ViewState.Success(result.data.map {
                        it.toUi()
                    })
                }

                is NetworkResult.Error -> {
                    _locationState.value = ViewState.Error(result.error)
                    Log.e("WeatherVM", "Error: ${result.error}")
                }
            }
        }
    }
}