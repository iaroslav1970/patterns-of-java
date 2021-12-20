package bridge;

public class AcrylicPicture implements DrawAPI{
    @Override
    public void drawPicture(int length, int width) {
        System.out.println("Картина з акриловими фарбами з довжиною " + length + " см та шириною " + width + " см.");
    }
}


