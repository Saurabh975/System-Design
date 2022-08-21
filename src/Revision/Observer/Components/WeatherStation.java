package Revision.Observer.Components;

import Revision.Observer.Interface.Observer;
import Revision.Observer.Interface.Subject;

import java.util.HashSet;
import java.util.Random;

public class WeatherStation implements Subject {
    HashSet<Observer> subList;
    double temp, humidity;

    public WeatherStation(){
        subList = new HashSet<>();
        temp = new Random().nextDouble();
        humidity = new Random().nextDouble();
    }
    @Override
    public void register(Observer o) {
        subList.add(o);
    }

    @Override
    public void remove(Observer o) {
        subList.remove(o);
    }

    @Override
    public void update() {
        for(Observer o : subList)o.update(temp, humidity);
    }

    public void setTemp(double temp){
        this.temp = temp;
    }

    public void setHumidity(double humidity){
        this.humidity = humidity;
    }
}
