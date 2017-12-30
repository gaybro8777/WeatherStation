fun main(args: Array<String>) {
    val weatherData = WeatherData()

    CurrentConditionsDisplay(weatherData)

    weatherData.setValues(123f, 23f, 90f)
    println("Changed values once")

    ForecastDisplay(weatherData)

    weatherData.setValues(99f, 120893f, 98234f)
    println("Changed values twice")

    StatisticsDisplay(weatherData)

    weatherData.setValues(1f, 2f, 3f)
    println("Changed values thrice")
}