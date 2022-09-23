package TheoryAndExcercise.Composite_Pattern.MainRunner;

import TheoryAndExcercise.Composite_Pattern.Composite.Directory;
import TheoryAndExcercise.Composite_Pattern.Leaf.ImageFile;
import TheoryAndExcercise.Composite_Pattern.Leaf.TextFile;

public class MainRunner {
    public static void main(String[] args) {
        TextFile textFile = new TextFile("hello.txt");
        TextFile textFile1 = new TextFile("hi.txt");

        ImageFile imageFile = new ImageFile("naruto.png");
        ImageFile imageFile1 = new ImageFile("sauske.jpeg");

        Directory root = new Directory("root");
        Directory documents = new Directory("Documents");
        documents.addFile(textFile);
        documents.addFile(textFile1);

        Directory image = new Directory("Image");
        image.addFile(imageFile);
        image.addFile(imageFile1);

        root.addFile(documents);
        root.addFile(image);

        System.out.println(root.getPath());
    }
}
