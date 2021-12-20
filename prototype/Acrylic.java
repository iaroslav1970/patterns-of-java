package prototype;

public class Acrylic extends Painting{
    public Acrylic(){
        type = "Акрилова";
    }

    @Override
    public void draw(){
        System.out.println("Акрилова живопис");
    }

}
