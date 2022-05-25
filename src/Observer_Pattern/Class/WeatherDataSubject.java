package Observer_Pattern.Class;

import Observer_Pattern.Interface.Observer;
import Observer_Pattern.Interface.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements Subject {

    private List<Observer> observers;
    public WeatherData weatherData;

    public WeatherDataSubject(){
        observers = new ArrayList<>();
        weatherData = new WeatherData();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers)
            o.update(weatherData);
    }

    public void setMeasurements(WeatherData o){
        this.weatherData = new WeatherData(o);
        notifyObservers(); // since measurements changed
    }
}
