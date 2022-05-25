package Strategy_Pattern.Class;

import Strategy_Pattern.Interface.QuackBehavior;

public class Squeal implements QuackBehavior {
    public void quack(){
        System.out.println("It makes a squealing sound");
    }
}
