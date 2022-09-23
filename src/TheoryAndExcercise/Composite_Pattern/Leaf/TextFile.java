package TheoryAndExcercise.Composite_Pattern.Leaf;

import TheoryAndExcercise.Composite_Pattern.Interface.File;

import java.awt.*;

public class TextFile implements File {
    String name;
    public TextFile(String name){
        this.name = name;
    }

    public String getPath(){
        return name;
    }
}
