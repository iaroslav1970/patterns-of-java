package prototype;

public class Tempera extends Painting{
    public Tempera(){
        type = "Темперна";
    }

    @Override
    public void draw() {
        System.out.println("Темперна живопис");
    }

}
