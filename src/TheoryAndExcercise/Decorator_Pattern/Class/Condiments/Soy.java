package TheoryAndExcercise.Decorator_Pattern.Class.Condiments;

import TheoryAndExcercise.Decorator_Pattern.Abstract.Beverage;
import TheoryAndExcercise.Decorator_Pattern.Abstract.CondimentsDecorator;

public class Soy extends CondimentsDecorator {

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
