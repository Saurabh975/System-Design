package TheoryAndExcercise.Command_Pattern.Commands;

import TheoryAndExcercise.Command_Pattern.Concrete_Components.LightBulb;
import TheoryAndExcercise.Command_Pattern.Interface.Command;

public class LightOnControl implements Command {

    LightBulb lightBulb;
    public LightOnControl(LightBulb lb){
        lightBulb = lb;
    }

    @Override
    public void execute(){
        lightBulb.on();
    }

    @Override
    public void unExecute(){
        lightBulb.off();
    }
}
