package abstract_factory;
public class Oil implements Painting {
    @Override
    public void draw() {
        System.out.println("Масляна живопис");
    }
}