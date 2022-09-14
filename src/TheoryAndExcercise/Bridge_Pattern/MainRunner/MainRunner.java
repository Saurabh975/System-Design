package TheoryAndExcercise.Bridge_Pattern.MainRunner;

import TheoryAndExcercise.Bridge_Pattern.Abstract.View;
import TheoryAndExcercise.Bridge_Pattern.Concrete_Components.Author;
import TheoryAndExcercise.Bridge_Pattern.Concrete_Components.Book;
import TheoryAndExcercise.Bridge_Pattern.Concrete_Components.LongView;
import TheoryAndExcercise.Bridge_Pattern.Concrete_Components.ShortView;
import TheoryAndExcercise.Bridge_Pattern.Concrete_Resources.AuthorResource;
import TheoryAndExcercise.Bridge_Pattern.Concrete_Resources.BookResource;
import TheoryAndExcercise.Bridge_Pattern.Interface.Resource;

public class MainRunner {
    public static void main(String[] args) {
        Resource author = new AuthorResource(new Author("abcd", "23", "tall", "xyz.com", "this is author image.png"));
        Resource book = new BookResource(new Book("gof", "this is preface", "book.com", "this is book image.jpeg"));
        View lView = new LongView(author);
        View sView = new ShortView(book);

        lView.show();
        System.out.println();
        sView.show();
    }
}
