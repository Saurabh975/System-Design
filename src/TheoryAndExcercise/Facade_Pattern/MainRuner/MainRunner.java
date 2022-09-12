package TheoryAndExcercise.Facade_Pattern.MainRuner;

import TheoryAndExcercise.Facade_Pattern.Concrete_Components.PowerButton;

public class MainRunner {
    public static void main(String[] args) {
        PowerButton powerButton = new PowerButton();
        powerButton.pressed();
    }
}
