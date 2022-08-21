package Revision.Observer.Components;

import Revision.Observer.Interface.Observer;
import Revision.Observer.Interface.Subject;

public class DisplayTempAndHumidity implements Observer {
    double temp, humidity;
    public DisplayTempAndHumidity(Subject register){
        temp = 0;
        humidity = 0;
        register.register(this);
    }
    @Override
    public void update(double temp, double humidity){
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("\nTemperature : " + temp +", Humidity : " + humidity +"\n");
    }
}
