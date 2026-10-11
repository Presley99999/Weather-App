package com.example.weatherapp.ui

@Composable
fun WeatherAppNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "current") {
        composable("current") {
            CurrentWeatherScreen(
                onNavigateToForecast = { navController.navigate("forecast") }
            )
        }
        composable("forecast") {
            ForecastScreen()
        }
    }
}
