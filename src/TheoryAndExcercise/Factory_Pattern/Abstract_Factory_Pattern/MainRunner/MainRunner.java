package TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.MainRunner;

import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Concrete_Components.Factory.RoyalFurnituresDelhi;
import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Concrete_Components.Factory.RoyalFurnituresMumbai;
import TheoryAndExcercise.Factory_Pattern.Abstract_Factory_Pattern.Interface.Factory.RoyalFurnitures;

public class MainRunner {
    public static void main(String[] args) {
        RoyalFurnitures royalFurnituresDelhi = new RoyalFurnituresDelhi();
        RoyalFurnitures royalFurnituresMumbai = new RoyalFurnituresMumbai();

        for (int i = 0; i < 5; i++) {
            System.out.println(royalFurnituresDelhi.getFurnitureType().getDesc() +
                    royalFurnituresDelhi.getFurnitureMaterialType().getDesc());
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(royalFurnituresMumbai.getFurnitureType().getDesc() +
                    royalFurnituresMumbai.getFurnitureMaterialType().getDesc());
        }
    }
}
