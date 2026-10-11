package com.example.weatherapp.ui.screens

@Composable
fun ForecastScreen() {
    val forecast = listOf(
        "Monday - Rain - 10°C",
        "Tuesday - Cloudy - 8°C",
        "Wednesday - Sunny - 12°C",
        "Thursday - Windy - 9°C",
        "Friday - Snow - -1°C"
    )

    Column(modifier = Modifier.padding(16.dp)) {
        Text("7-Day Forecast", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(16.dp))

        forecast.forEach { day ->
            Text(day, fontSize = 20.sp, modifier = Modifier.padding(8.dp))
        }
    }
}
