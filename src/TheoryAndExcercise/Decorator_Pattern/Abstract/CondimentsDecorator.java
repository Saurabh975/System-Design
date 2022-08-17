package TheoryAndExcercise.Decorator_Pattern.Abstract;

public abstract class CondimentsDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();
}
