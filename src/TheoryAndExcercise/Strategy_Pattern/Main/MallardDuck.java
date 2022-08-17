package TheoryAndExcercise.Strategy_Pattern.Main;

import TheoryAndExcercise.Strategy_Pattern.Abstract.Duck;
import TheoryAndExcercise.Strategy_Pattern.Class.FlyWithWings;
import TheoryAndExcercise.Strategy_Pattern.Class.Quack;

class MallardDuck extends Duck {

    MallardDuck(){
        fly = new FlyWithWings();
        quack = new Quack();
    }

    @Override
    public void display() {
        System.out.println("It's a mallard duck");
    }
}
