package TheoryAndExcercise.Facade_Pattern.Concrete_Components;

import TheoryAndExcercise.Facade_Pattern.Interface.PowerOn;

public class CPU implements PowerOn {

    @Override
    public void turnOnSequence(){
        System.out.println("TURNING ON CPU");
    }
}
