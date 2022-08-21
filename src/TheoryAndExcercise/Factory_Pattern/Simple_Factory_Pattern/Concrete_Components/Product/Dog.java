package TheoryAndExcercise.Factory_Pattern.Simple_Factory_Pattern.Concrete_Components.Product;

import TheoryAndExcercise.Factory_Pattern.Simple_Factory_Pattern.Interface.Product.Animal;

public class Dog implements Animal {
    @Override
    public String getDesc(){
        return "It's a Dog";
    }
}
