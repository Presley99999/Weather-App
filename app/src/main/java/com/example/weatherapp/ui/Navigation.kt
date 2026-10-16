package com.example.weatherapp.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.Icon
import com.example.weatherapp.R
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weatherapp.ui.screens.CurrentWeatherScreen
import com.example.weatherapp.ui.screens.ForecastScreen

@Composable
fun WeatherAppNavigation() {
    val navController = rememberNavController()


    Scaffold(
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("current") },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.sunny),
                            contentDescription = "Current Weather"
                        )
                    }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("forecast") },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.forecast),
                            contentDescription = "Forecast"
                        )
                    }
                )
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "current",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("current") {
                CurrentWeatherScreen()
            }

            composable("forecast") {
                ForecastScreen()
            }
        }
    }
}
