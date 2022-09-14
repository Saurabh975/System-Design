package TheoryAndExcercise.Bridge_Pattern.Concrete_Components;

public class Author {
    private String name;
    private String age;
    private String bio;
    private String url;
    private String image;

    public Author(String name, String age, String bio, String url, String image) {
        this.name = name;
        this.age = age;
        this.bio = bio;
        this.url = url;
        this.image = image;
    }

    public String getName() {
        return name;
    }


    public String getBio() {
        return bio;
    }


    public String getUrl() {
        return url;
    }


    public String getImage() {
        return image;
    }

}
