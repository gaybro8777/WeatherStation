import java.util.Observable
import java.util.Observer

class ForecastDisplay(
    weatherData: WeatherData,
    private var temp: Float = 0.0f,
    private var humidity: Float = 0.0f,
    private var pressure: Float = 0.0f
) : Observer,
    DisplayElement {

    init {
        weatherData.addObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherData) {
            temp = o.temp
            humidity = o.temp
            pressure = o.pressure
            display()
        }
    }


//    override fun update(temp: Float, humidity: Float, pressure: Float) {
//    }

    override fun display() {
        println(
            "Forecast Display: Temperature is $temp and Humidity is : $humidity and Pressure is $pressure")
    }
}