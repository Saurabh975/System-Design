package Strategy_Pattern.Abstract;
import Strategy_Pattern.Interface.FlyBehavior;
import Strategy_Pattern.Interface.QuackBehavior;

public abstract class Duck {
    public FlyBehavior fly;
    public QuackBehavior quack;

    public Duck() {}

    public abstract void display();

    public void performFly(){
        fly.fly();
    }
    public void performQuack(){
        quack.quack();
    }

    public void setFlyBehavior(FlyBehavior fb){
        fly = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quack = qb;
    }
}
