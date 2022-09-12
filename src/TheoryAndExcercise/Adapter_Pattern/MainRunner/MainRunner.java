package TheoryAndExcercise.Adapter_Pattern.MainRunner;

import TheoryAndExcercise.Adapter_Pattern.Concrete_Components.AdapterConvertor;

public class MainRunner {
    public static void main(String[] args) {
        AdapterConvertor adapterConvertor = new AdapterConvertor("HELLO WORLD");
        adapterConvertor.convertTo("CSV");
    }
}
