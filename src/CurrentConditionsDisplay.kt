import java.util.Observable
import java.util.Observer

class CurrentConditionsDisplay(
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
            humidity = o.humidity
            display()
        }
    }

//    override fun update(temp: Float, humidity: Float, pressure: Float) {
//    }

    override fun display() {
        println("Current Conditions display: Temperature is $temp and Humidity is : $humidity")
    }
}