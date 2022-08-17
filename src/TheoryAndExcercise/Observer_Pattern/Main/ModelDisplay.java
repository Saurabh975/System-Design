package TheoryAndExcercise.Observer_Pattern.Main;

import TheoryAndExcercise.Observer_Pattern.Class.WeatherData;
import TheoryAndExcercise.Observer_Pattern.Class.WeatherDataSubject;
import TheoryAndExcercise.Observer_Pattern.Interface.Display;
import TheoryAndExcercise.Observer_Pattern.Interface.Observer;

public class ModelDisplay implements Display, Observer {
    private WeatherData weatherData;
    private WeatherDataSubject weatherDataSubject;
    ModelDisplay(WeatherDataSubject obj){
        weatherDataSubject = obj;
        weatherDataSubject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println();
        System.out.println("THIS IS A MODEL DISPLAY");
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
