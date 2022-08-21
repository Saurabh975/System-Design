package TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Concrete_Components.Factory;

import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Concrete_Components.Product.Material.Iron;
import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Concrete_Components.Product.Material.Steel;
import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Concrete_Components.Product.Type.AlmiraRacks;
import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Concrete_Components.Product.Type.KitchenCabinets;
import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Interface.Factory.RoyalFurnitures;
import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Interface.Product.FurnitureMaterialType;
import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Interface.Product.FurnitureType;

import java.util.Random;

public class RoyalFurnituresMumbai implements RoyalFurnitures {
    @Override
    public FurnitureType getFurnitureType() {
        FurnitureType furnitureType = null;

        switch(new Random().nextInt(2)){
            case 0: furnitureType = new AlmiraRacks();
                break;
            case 1: furnitureType = new KitchenCabinets();
        }

        return furnitureType;
    }

    @Override
    public FurnitureMaterialType getFurnitureMaterialType() {
        FurnitureMaterialType furnitureMaterialType = null;

        switch(new Random().nextInt(2)){
            case 0: furnitureMaterialType = new Steel();
                break;
            case 1: furnitureMaterialType = new Iron();
        }

        return furnitureMaterialType;
    }
}
