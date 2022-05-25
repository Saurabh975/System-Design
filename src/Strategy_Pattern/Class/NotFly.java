package Strategy_Pattern.Class;

import Strategy_Pattern.Interface.FlyBehavior;

public class NotFly implements FlyBehavior {
    public void fly(){
        System.out.println("It does not fly");
    }
}
