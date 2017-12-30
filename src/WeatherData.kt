import java.util.Observable

class WeatherData : Observable() {
    //  private val observers: MutableList<Observer> = mutableListOf()
    var temp: Float = 0.0f
    var humidity: Float = 0.0f
    var pressure: Float = 0.0f

//  override fun registerObserver(observer: Observer) {
//    observers.add(observer)
//    println("Subscribers count is now ${observers.size}")
//  }

//  override fun removeObserver(observer: Observer) {
//    observers.remove(observer)
//  }

//  override fun notifyObservers() {
//    observers.forEach {
//      it.update(temp, humidity, pressure)
//    }
//  }

    fun setValues(temp: Float, humidity: Float, pressure: Float) {
        this@WeatherData.temp = temp
        this@WeatherData.humidity = humidity
        this@WeatherData.pressure = pressure

        measurementsChanged()
    }

    private fun measurementsChanged() {
        setChanged()
        notifyObservers()
    }
}