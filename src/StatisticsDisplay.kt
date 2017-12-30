import java.util.Observable
import java.util.Observer

class StatisticsDisplay(
    weatherData: WeatherData,
    private var temp: Float = 0.0f,
    private var humidity: Float = 0.0f,
    private var pressure: Float = 0.0f
) : Observer, DisplayElement {

    init {
        weatherData.addObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherData) {
            temp = o.temp
            humidity = o.humidity
            pressure = o.pressure
            display()
        }
    }

    override fun display() {
        println(
            "Statistics Display: Temperature is $temp, Humidity is $humidity and Pressure is $pressure")
    }
}