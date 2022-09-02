package TheoryAndExcercise.Command_Pattern.MainRunner;

import TheoryAndExcercise.Command_Pattern.Commands.LightOffContol;
import TheoryAndExcercise.Command_Pattern.Commands.LightOnControl;
import TheoryAndExcercise.Command_Pattern.Concrete_Components.LightBulb;
import TheoryAndExcercise.Command_Pattern.Interface.Command;

import java.util.Scanner;
import java.util.Stack;

public class RemoteContol {
    public static void main(String[] args) {
        LightBulb lb = new LightBulb();
        LightOffContol lightOffContol = new LightOffContol(lb);
        LightOnControl lightOnControl = new LightOnControl(lb);
        boolean flag = true;
        Stack<Command> queue = new Stack<>();
        while(flag){
            int i = new Scanner(System.in).nextInt();

            switch(i){
                case 0:
                    queue.add(lightOffContol);
                    lightOffContol.execute();
                    break;
                case 1:
                    queue.add(lightOnControl);
                    lightOnControl.execute();
                    break;
                case -1:
                    if(!queue.isEmpty()){
                        queue.pop().unExecute();
                    }
                    break;
                case 5:
                    System.out.println("System Shut Down");
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong Input !!");
            }
        }
    }
}
