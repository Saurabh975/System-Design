package TheoryAndExcercise.Composite_Pattern.Leaf;

import TheoryAndExcercise.Composite_Pattern.Interface.File;

public class ImageFile implements File {
    String name;
    public ImageFile(String name){
        this.name = name;
    }

    public String getPath(){
        return name;
    }
}
