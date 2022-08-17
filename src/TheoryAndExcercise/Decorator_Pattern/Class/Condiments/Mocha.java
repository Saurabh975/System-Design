package TheoryAndExcercise.Decorator_Pattern.Class.Condiments;

import TheoryAndExcercise.Decorator_Pattern.Abstract.Beverage;
import TheoryAndExcercise.Decorator_Pattern.Abstract.CondimentsDecorator;

public class Mocha extends CondimentsDecorator {
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        return beverage.cost() + 0.20;
    }
}
