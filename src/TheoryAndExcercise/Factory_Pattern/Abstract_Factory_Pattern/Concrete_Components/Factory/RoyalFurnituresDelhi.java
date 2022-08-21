package TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Concrete_Components.Factory;

import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Concrete_Components.Product.Material.Plastic;
import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Concrete_Components.Product.Material.Wood;
import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Concrete_Components.Product.Type.Chair;
import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Concrete_Components.Product.Type.Table;
import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Interface.Factory.RoyalFurnitures;
import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Interface.Product.FurnitureMaterialType;
import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Interface.Product.FurnitureType;

import java.util.Random;

public class RoyalFurnituresDelhi implements RoyalFurnitures {
    @Override
    public FurnitureType getFurnitureType(){
        FurnitureType furnitureType = null;

        switch(new Random().nextInt(2)){
            case 0: furnitureType = new Chair();
            break;
            case 1: furnitureType = new Table();
        }

        return furnitureType;
    }

    @Override
    public FurnitureMaterialType getFurnitureMaterialType(){
        FurnitureMaterialType furnitureMaterialType = null;

        switch(new Random().nextInt(2)){
            case 0: furnitureMaterialType = new Wood();
            break;
            case 1: furnitureMaterialType = new Plastic();
        }

        return furnitureMaterialType;
    }
}
