package Observer_Pattern.Main;

import Observer_Pattern.Class.WeatherData;
import Observer_Pattern.Class.WeatherDataSubject;

public class MainRunner {
    public static void main(String[] args) {
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
        WeatherData w = new WeatherData();

        Display1 display1 = new Display1(weatherDataSubject);
        Display2 display2 = new Display2(weatherDataSubject);
        ModelDisplay modelDisplay = new ModelDisplay(weatherDataSubject);

        w = new WeatherData(81.0, 770, 45);
        weatherDataSubject.setMeasurements(w);
        w = new WeatherData(82.0, 760, 67);
        weatherDataSubject.setMeasurements(w);
        w = new WeatherData(85, 790, 77);
        weatherDataSubject.setMeasurements(w);
    }
}
