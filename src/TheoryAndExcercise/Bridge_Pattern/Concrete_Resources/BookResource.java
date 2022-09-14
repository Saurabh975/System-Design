package TheoryAndExcercise.Bridge_Pattern.Concrete_Resources;

import TheoryAndExcercise.Bridge_Pattern.Concrete_Components.Book;
import TheoryAndExcercise.Bridge_Pattern.Interface.Resource;

public class BookResource implements Resource {

    private final Book book;

    public BookResource(Book book) {
        this.book = book;
    }

    @Override
    public void getTitle() {
        System.out.println(this.book.getName());
    }

    @Override
    public void getImage() {
        System.out.println(this.book.getImage());
    }

    @Override
    public void getText() {
        System.out.println(this.book.getPreface());
    }

    @Override
    public void getUrl() {
        System.out.println(this.book.getUrl());
    }
}
