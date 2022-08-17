package TheoryAndExcercise.Strategy_Pattern.Class;

import TheoryAndExcercise.Strategy_Pattern.Interface.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack(){
        System.out.println("It makes a Quacking sound");
    }
}
