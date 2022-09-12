package TheoryAndExcercise.AdapterPattern.Concrete_Components;

public class AdapterConvertor extends DefaultConvertor {

    private String data;
    private JSONConvertor jsonConvertor;
    private XMLConvertor xmlConvertor;
    public AdapterConvertor(String data){
        super(data);
        this.data = data;
        jsonConvertor = new JSONConvertor(data);
        xmlConvertor  = new XMLConvertor(data);
    }

    public void convertTo(String toType){
        if(toType.equalsIgnoreCase("CSV"))toCSV();
        else if(toType.equalsIgnoreCase("JSON"))jsonConvertor.toJSON();
        else if(toType.equalsIgnoreCase("XML"))xmlConvertor.toXML();
        else System.out.println("Wrong conversion type");
    }

}
