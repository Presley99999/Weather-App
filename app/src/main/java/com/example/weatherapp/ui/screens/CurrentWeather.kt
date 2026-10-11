package com.example.weatherapp.ui.screens

@Composable
fun CurrentWeatherScreen(onNavigateToForecast: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Halifax", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(16.dp))

        Icon(
            painter = painterResource(id = R.drawable.ic_sunny),
            contentDescription = "Sunny",
            tint = Color.Yellow,
            modifier = Modifier.size(120.dp)
        )

        Spacer(Modifier.height(16.dp))
        Text("12°C", fontSize = 48.sp, fontWeight = FontWeight.Bold)
        Text("Sunny", fontSize = 24.sp)

        Spacer(Modifier.height(32.dp))

        Button(onClick = onNavigateToForecast) {
            Text("View 7-Day Forecast")
        }
    }
}
