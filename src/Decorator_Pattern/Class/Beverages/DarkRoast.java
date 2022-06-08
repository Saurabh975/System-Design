package Decorator_Pattern.Class.Beverages;

import Decorator_Pattern.Abstract.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast";
    }

    public double cost(){
        return 0.99;
    }
}
