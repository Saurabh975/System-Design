package Strategy_Pattern.Main;

import Strategy_Pattern.Abstract.Duck;
import Strategy_Pattern.Class.FlyWithWings;
import Strategy_Pattern.Class.Quack;

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
