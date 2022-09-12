package TheoryAndExcercise.Facade_Pattern.Concrete_Components;

import TheoryAndExcercise.Facade_Pattern.Interface.PowerOn;

public class Monitor implements PowerOn {

    @Override
    public void turnOnSequence(){
        System.out.println("Monitor found... Turning on");
    }
}
