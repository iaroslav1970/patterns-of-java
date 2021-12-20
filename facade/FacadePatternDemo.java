package facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        PaintingMaker paintingMaker = new PaintingMaker();

        paintingMaker.drawOil();
        paintingMaker.drawAcrylic();
        paintingMaker.drawTempera();

    }
}



