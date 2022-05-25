package Strategy_Pattern.Class;
import Strategy_Pattern.Interface.FlyBehavior;

public class FlyRocektPowerd implements FlyBehavior {
    public void fly(){
        System.out.println("It flies with rocket");
    }
}
