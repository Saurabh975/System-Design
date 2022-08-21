package TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Concrete_Components.Product.Type;

import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Interface.Product.FurnitureType;

public class KitchenCabinets implements FurnitureType {
    @Override
    public String getDesc() {
        return "This is a Kitchen Rack.";
    }
}
