package TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Concrete_Components.Product.Type;

import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Interface.Product.FurnitureType;

public class Table implements FurnitureType {
    @Override
    public String getDesc(){
        return "It's a Table.";
    }
}
