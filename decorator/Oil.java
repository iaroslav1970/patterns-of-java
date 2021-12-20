package decorator;

public class Oil implements Painting{
    @Override
    public void draw() {
        System.out.println("Холст для масляного живопису");
    }

}



