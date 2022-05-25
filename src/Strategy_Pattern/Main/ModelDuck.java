package Strategy_Pattern.Main;

import Strategy_Pattern.Abstract.Duck;
import Strategy_Pattern.Class.*;

public class ModelDuck extends Duck {

    public ModelDuck(){
        fly = new NotFly();
        quack = new NoSound();
    }
    @Override
    public void display(){
        System.out.println("This is a model duck");
    }
}
