package bridge;

public class OilPicture implements DrawAPI{
    @Override
    public void drawPicture(int length, int width) {
        System.out.println("Картина з масляними фарбами з довжиною " + length + " см та шириною " + width + " см.");
    }

}


