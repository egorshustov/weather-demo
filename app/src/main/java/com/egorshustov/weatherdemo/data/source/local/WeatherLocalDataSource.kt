package com.egorshustov.weatherdemo.data.source.local

import com.egorshustov.weatherdemo.data.CurrentWeather
import com.egorshustov.weatherdemo.data.DailyWeather
import kotlinx.coroutines.flow.Flow

interface WeatherLocalDataSource {

    fun getDailyWeatherList(): Flow<List<DailyWeather>>

    suspend fun saveCurrentWeather(currentWeather: CurrentWeather)

    suspend fun saveCurrentWeatherList(currentWeatherList: List<CurrentWeather>)

    suspend fun saveDailyWeatherList(cityId: Long, dailyWeatherList: List<DailyWeather>)
}