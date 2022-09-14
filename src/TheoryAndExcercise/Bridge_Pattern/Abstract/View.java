package TheoryAndExcercise.Bridge_Pattern.Abstract;

import TheoryAndExcercise.Bridge_Pattern.Interface.Resource;

public abstract class View {
    protected Resource resource;

    public View(Resource resource){
        this.resource = resource;
    }
    public abstract void show();
}
