package zad5_1;

public class OilDraw implements ReadyPaintingPicture {
    @Override
    public void drawOil(String fileName) {
        System.out.println("Картина в масляній техніці має таку назву: "+ fileName);
    }

    @Override
    public void drawAcrylic(String fileName) {
        //do nothing
    }
}



