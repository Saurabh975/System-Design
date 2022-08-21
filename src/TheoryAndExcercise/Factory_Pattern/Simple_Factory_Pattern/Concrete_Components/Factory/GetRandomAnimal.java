package TheoryAndExcercise.Factory_Pattern.Simple_Factory_Pattern.Concrete_Components.Factory;

import TheoryAndExcercise.Factory_Pattern.Simple_Factory_Pattern.Concrete_Components.Product.Cat;
import TheoryAndExcercise.Factory_Pattern.Simple_Factory_Pattern.Concrete_Components.Product.Cow;
import TheoryAndExcercise.Factory_Pattern.Simple_Factory_Pattern.Concrete_Components.Product.Dog;
import TheoryAndExcercise.Factory_Pattern.Simple_Factory_Pattern.Interface.Factory.AnimalFactory;
import TheoryAndExcercise.Factory_Pattern.Simple_Factory_Pattern.Interface.Product.Animal;

import java.util.Random;

public class GetRandomAnimal implements AnimalFactory {
    @Override
    public Animal getRandomAnimal() {
        int i = new Random().nextInt(3);
        Animal toReturn = null;
        switch(i){
            case 0: toReturn = new Dog();
            break;
            case 1: toReturn = new Cat();
            break;
            case 2: toReturn = new Cow();
        }
        return toReturn;
    }
}
