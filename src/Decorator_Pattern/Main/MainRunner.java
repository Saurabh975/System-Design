package Decorator_Pattern.Main;

import Decorator_Pattern.Abstract.Beverage;
import Decorator_Pattern.Class.Beverages.DarkRoast;
import Decorator_Pattern.Class.Condiments.Mocha;
import Decorator_Pattern.Class.Condiments.Soy;

public class MainRunner {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.description + " : " + beverage.cost());
        beverage.setSize(Beverage.Size.VENTI);

        //Double Mocha DarkRoast with Soy
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);

        System.out.println(beverage.getDescription() + " : " + beverage.cost());
    }
}
