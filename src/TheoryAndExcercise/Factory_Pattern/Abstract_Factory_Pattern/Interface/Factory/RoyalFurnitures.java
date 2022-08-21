package TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Interface.Factory;

import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Interface.Product.FurnitureMaterialType;
import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Interface.Product.FurnitureType;

public interface RoyalFurnitures {
    FurnitureType getFurnitureType();
    FurnitureMaterialType getFurnitureMaterialType();
}
