package Decorator_Pattern.Class.Beverages;

import Decorator_Pattern.Abstract.Beverage;

public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    public double cost(){
        return 1.99;
    }
}
