package Revision.Observer.Components;

import Revision.Observer.Interface.Observer;
import Revision.Observer.Interface.Subject;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Average7Day implements Observer {
    Deque<Double> temperature, humidity;

    public Average7Day(Subject sub) {
        temperature = new ArrayDeque<>();
        humidity = new ArrayDeque<>();
        sub.register(this);
    }

    @Override
    public void update(double temp, double humidity) {
        if (temperature.size() == 7) temperature.pop();
        if (this.humidity.size() == 7) this.humidity.pop();

        temperature.add(temp);
        this.humidity.add(humidity);
        display();
    }

    public void display(){
        double avgTemp = 0, avgHum = 0;
        for(double i : temperature)avgTemp += i;
        for(double i : humidity)avgHum += i;
        avgTemp /= temperature.size();
        avgHum /= humidity.size();
        System.out.println("\nAverage Temperature : " + avgTemp + " \nAverage Humidity : "+ avgHum +"\nLast 7 days temperature : " + temperature +"\nLast 7 days Humidity : " + humidity + "\n");
    }
}
