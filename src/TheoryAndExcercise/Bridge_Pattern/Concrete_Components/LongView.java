package TheoryAndExcercise.Bridge_Pattern.Concrete_Components;

import TheoryAndExcercise.Bridge_Pattern.Abstract.View;
import TheoryAndExcercise.Bridge_Pattern.Interface.Resource;

public class LongView extends View {

    public LongView(Resource resource) {
        super(resource);
    }

    @Override
    public void show(){
        System.out.println("This is long view");
        this.resource.getUrl();
        this.resource.getTitle();
        this.resource.getImage();
        this.resource.getText();
    }
}
