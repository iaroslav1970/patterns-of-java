package prototype;

public class Oil extends Painting {
    public Oil(){
        type = "Масляна";
    }

    @Override
    public void draw() {
        System.out.println("Масляна живопис");
    }
}

