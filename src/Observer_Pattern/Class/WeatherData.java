package Observer_Pattern.Class;

public class WeatherData {
    public double temp, pressure, humidity;

    public WeatherData() {
    }

    public WeatherData(WeatherData obj) {
        this.temp = obj.temp;
        this.pressure = obj.pressure;
        this.humidity = obj.humidity;
    }
    public WeatherData(double temp, double pressure, double humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
    }
}
