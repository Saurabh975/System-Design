package Strategy_Pattern.Class;

import Strategy_Pattern.Behaviors.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack(){
        System.out.println("It makes a Quacking sound");
    }
}
