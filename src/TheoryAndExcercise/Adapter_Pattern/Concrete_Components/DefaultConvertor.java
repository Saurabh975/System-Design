package TheoryAndExcercise.Adapter_Pattern.Concrete_Components;

import TheoryAndExcercise.Adapter_Pattern.Interface.ToCSV;

public class DefaultConvertor implements ToCSV {
    private String data;

    public DefaultConvertor(String d){
        this.data = d;
    }

    @Override
    public void toCSV(){
        System.out.println("Converted data to CSV");
    }
}
