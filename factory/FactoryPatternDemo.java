package factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        PaintingFactory paintingFactory = new PaintingFactory();

        //get an object of Oil and call its draw method.
        Painting painting1 = paintingFactory.getPainting("Масляна");

        //call draw method of Acrylic
        painting1.draw();

        //get an object of Acrylic and call its draw method.
        Painting painting2 = paintingFactory.getPainting("Акрилова");

        //call draw method of Acrylic
        painting2.draw();

        //get an object of Tempera and call its draw method.
        Painting painting3 = paintingFactory.getPainting("Темперна");

        //call draw method of Tempera
        painting3.draw();


    }
}
