package TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Concrete_Components.Product.Material;

import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Interface.Product.FurnitureMaterialType;

public class Wood implements FurnitureMaterialType {
    @Override
    public String getDesc(){
        return "Material Type : Wood";
    }
}
