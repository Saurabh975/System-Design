package TheoryAndExcercise.AdapterPattern.Concrete_Components;

import TheoryAndExcercise.AdapterPattern.Interface.ToJSON;

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
