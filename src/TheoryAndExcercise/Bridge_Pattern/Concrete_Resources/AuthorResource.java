package TheoryAndExcercise.Bridge_Pattern.Concrete_Resources;

import TheoryAndExcercise.Bridge_Pattern.Concrete_Components.Author;
import TheoryAndExcercise.Bridge_Pattern.Interface.Resource;

public class AuthorResource implements Resource {

    private final Author author;

    public AuthorResource(Author author){
        this.author = author;
    }

    @Override
    public void getTitle() {
        System.out.println(this.author.getName());
    }

    @Override
    public void getImage() {
        System.out.println(this.author.getImage());
    }

    @Override
    public void getText() {
        System.out.println(this.author.getBio());
    }

    @Override
    public void getUrl() {
        System.out.println(this.author.getUrl());
    }
}
