package TheoryAndExcercise.Composite_Pattern.Composite;

import TheoryAndExcercise.Composite_Pattern.Interface.File;

import java.util.LinkedList;
import java.util.List;

public class Directory implements File {
    String name;
    List<File> files = new LinkedList<>();
    public Directory(String name){
        this.name = name;
    }

    public void addFile(File obj){
        files.add(obj);
    }

    public String getPath(){
        StringBuilder path = new StringBuilder();
        for(File f : files)
            path.append(f.getPath()).append(" ");

        return name + " " + path;
    }
}
