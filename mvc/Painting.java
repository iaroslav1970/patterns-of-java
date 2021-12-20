package mvc;

public class Painting {
    private String name;
    private String genre;

    public Painting(String genre, String name) {
        this.genre = genre;
        this.name = name;
    }

    public Painting() {

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
