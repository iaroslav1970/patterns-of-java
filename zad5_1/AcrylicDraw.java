package zad5_1;

public class AcrylicDraw implements ReadyPaintingPicture {
    @Override
    public void drawOil(String fileName) {
        //do nothing
    }

    @Override
    public void drawAcrylic(String fileName) {
        System.out.println("Картина в акриловій техніці має таку назву: "+ fileName);
    }
}





