package com.example.weatherapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.R
import com.example.weatherapp.models.DailyForecast

@Composable
fun ForecastScreen() {

    val weekForecast = listOf(
        DailyForecast("Mon", "10°C", R.drawable.sunny),
        DailyForecast("Tue", "8°C", R.drawable.cloudy),
        DailyForecast("Wed", "6°C", R.drawable.rain),
        DailyForecast("Thu", "4°C", R.drawable.snow),
        DailyForecast("Fri", "12°C", R.drawable.partly_cloudy),
        DailyForecast("Sat", "14°C", R.drawable.sunny),
        DailyForecast("Sun", "9°C", R.drawable.wind)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF87CEEB)) // same background color
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("7‑Day Forecast", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(24.dp))

        weekForecast.forEach { day ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(day.day, fontSize = 20.sp)

                Icon(
                    painter = painterResource(id = day.iconRes),
                    contentDescription = day.day,
                    modifier = Modifier.size(40.dp)
                )

                Text(day.temperature, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}
