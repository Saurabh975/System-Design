package TheoryAndExcercise.AdapterPattern.MainRunner;

import TheoryAndExcercise.AdapterPattern.Concrete_Components.AdapterConvertor;

public class MainRunner {
    public static void main(String[] args) {
        AdapterConvertor adapterConvertor = new AdapterConvertor("HELLO WORLD");
        adapterConvertor.convertTo("CSV");
    }
}
