package TheoryAndExcercise.Factory_Pattern.Simple_Factory_Pattern.MainRunner;

import TheoryAndExcercise.Factory_Pattern.Simple_Factory_Pattern.Concrete_Components.Factory.GetRandomAnimal;

public class MainRunner {
    public static void main(String[] args) {
        GetRandomAnimal getRandomAnimal = new GetRandomAnimal();

        for(int i=0;i<10;i++) System.out.println(getRandomAnimal.getRandomAnimal().getDesc());
    }
}
