package Revision.Observer.Main;


import Revision.Observer.Components.Average7Day;
import Revision.Observer.Components.DisplayTempAndHumidity;
import Revision.Observer.Components.WeatherStation;

import java.util.Random;

public class MainRunner {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation weatherStation = new WeatherStation();

        DisplayTempAndHumidity displayTempAndHumidity = new DisplayTempAndHumidity(weatherStation);
        Average7Day average7Day = new Average7Day(weatherStation);

        for(int i=0;i<10;i++){
            double newTemp = getRandomValue(10, 40);
            double newHum = getRandomValue(0, 100);

            weatherStation.setTemp(newTemp);
            weatherStation.setHumidity(newHum);
            weatherStation.update();

            if(i == 5)weatherStation.remove(average7Day);

            Thread.sleep(1000);
        }
    }

    static double getRandomValue(double max, double min){
        return new Random().nextDouble() * (max - min) + min;
    }
}
