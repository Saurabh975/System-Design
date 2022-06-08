package Decorator_Pattern.Class.Beverages;

import Decorator_Pattern.Abstract.Beverage;

public class houseBlend extends Beverage {

    public houseBlend(){
        description = "House Blend";
    }

    public double cost(){
        return 0.89;
    }
}
