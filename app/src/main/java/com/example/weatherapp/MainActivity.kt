package com.example.weatherapp

import com.example.weatherapp.ui.WeatherAppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppNavigation()
        }
    }
}