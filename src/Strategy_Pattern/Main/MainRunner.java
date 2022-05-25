package Strategy_Pattern.Main;

import Strategy_Pattern.Abstract.Duck;
import Strategy_Pattern.Class.*;

public class MainRunner {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();

        model.setFlyBehavior(new FlyRocektPowerd());
        model.setQuackBehavior(new Squeal());
        System.out.println();
        System.out.println();
        model.display();
        model.performFly();
        model.performQuack();
    }
}

