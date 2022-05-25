package Observer_Pattern.Main;

import Observer_Pattern.Class.WeatherData;
import Observer_Pattern.Class.WeatherDataSubject;
import Observer_Pattern.Interface.Display;
import Observer_Pattern.Interface.Observer;

public class Display2 implements Display, Observer {
    private WeatherData weatherData;
    private WeatherDataSubject weatherDataSubject;
    Display2(WeatherDataSubject obj){
        weatherDataSubject = obj;
        weatherDataSubject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println();
        System.out.println("THIS IS DISPLAY_2");
        System.out.println(weatherData.temp + "is the temperature");
        System.out.println(weatherData.humidity + "is the humidity");
        System.out.println();
    }

    @Override
    public void update(WeatherData o) {
        weatherData = new WeatherData(o);
        display();
    }
}
