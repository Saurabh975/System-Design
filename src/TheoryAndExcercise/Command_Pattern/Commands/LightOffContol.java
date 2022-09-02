package TheoryAndExcercise.Command_Pattern.Commands;

import TheoryAndExcercise.Command_Pattern.Concrete_Components.LightBulb;
import TheoryAndExcercise.Command_Pattern.Interface.Command;

public class LightOffContol implements Command {
    LightBulb lightBulb;
    public LightOffContol(LightBulb lb){
        lightBulb = lb;
    }

    @Override
    public void execute(){
        lightBulb.off();
    }

    @Override
    public void unExecute(){
        lightBulb.on();
    }
}
