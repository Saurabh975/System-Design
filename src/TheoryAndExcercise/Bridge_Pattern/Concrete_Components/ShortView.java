package TheoryAndExcercise.Bridge_Pattern.Concrete_Components;

import TheoryAndExcercise.Bridge_Pattern.Abstract.View;
import TheoryAndExcercise.Bridge_Pattern.Interface.Resource;

public class ShortView extends View {

    public ShortView(Resource resource){
        super(resource);
    }

    @Override
    public void show(){
        System.out.println("This is short view");
        this.resource.getTitle();
        this.resource.getImage();
    }
}
