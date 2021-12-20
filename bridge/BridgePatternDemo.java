package bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Painting oilPicture = new Picture(62,62,new OilPicture());
        Painting acrylicPicture = new Picture(100,100,new AcrylicPicture());

        oilPicture.draw();
        acrylicPicture.draw();
    }

}


