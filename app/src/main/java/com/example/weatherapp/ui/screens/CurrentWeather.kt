package com.example.weatherapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
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

@Composable
fun CurrentWeatherScreen(onNavigateToForecast: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF87CEEB)) // sky blue background
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Dartmouth", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(16.dp))

        Icon(
            painter = painterResource(id = R.drawable.sunny),
            contentDescription = "Sunny",
            tint = Color.Yellow,
            modifier = Modifier.size(120.dp)
        )

        Spacer(Modifier.height(16.dp))
        Text("12°C", fontSize = 48.sp, fontWeight = FontWeight.Bold)
        Text("Sunny", fontSize = 24.sp)

        Spacer(Modifier.height(32.dp))


    }
}
