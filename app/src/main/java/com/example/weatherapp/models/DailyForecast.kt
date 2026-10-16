package com.example.weatherapp.models



data class DailyForecast(
    val day: String,
    val temperature: String,
    val resourceId: Int
)