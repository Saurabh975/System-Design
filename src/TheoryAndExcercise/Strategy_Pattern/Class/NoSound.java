package TheoryAndExcercise.Strategy_Pattern.Class;

import TheoryAndExcercise.Strategy_Pattern.Interface.QuackBehavior;

public class NoSound implements QuackBehavior {
    public void quack(){
        System.out.println("It does not make any sound");
    }
}
