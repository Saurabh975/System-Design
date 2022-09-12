package TheoryAndExcercise.Adapter_Pattern.Concrete_Components;

import TheoryAndExcercise.Adapter_Pattern.Interface.ToJSON;

public class JSONConvertor implements ToJSON {
    private String data;

    public JSONConvertor(String data){
        this.data = data;
    }

    @Override
    public void toJSON() {
        System.out.println("Converted data to JSON");
    }
}
