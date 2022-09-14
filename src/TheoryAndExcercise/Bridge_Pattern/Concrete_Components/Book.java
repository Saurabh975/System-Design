package TheoryAndExcercise.Bridge_Pattern.Concrete_Components;

public class Book {
    private final String name;
    private final String preface;
    private final String url;
    private final String image;

    public Book(String name, String preface, String url, String image) {
        assert name != null;
        assert preface != null;
        assert  url != null;
        assert image != null;

        this.name = name;
        this.preface = preface;
        this.url = url;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getPreface() {
        return preface;
    }

    public String getUrl() {
        return url;
    }

    public String getImage() {
        return image;
    }

}
