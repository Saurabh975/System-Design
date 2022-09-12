package TheoryAndExcercise.Adapter_Pattern.Concrete_Components;

import TheoryAndExcercise.Adapter_Pattern.Interface.ToXML;

public class XMLConvertor implements ToXML {

    private String data;

    public XMLConvertor(String data){
        this.data = data;
    }

    @Override
    public void toXML() {
        System.out.println("Converted data to XML");
    }
}
