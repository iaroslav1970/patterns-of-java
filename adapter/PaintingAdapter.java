package adapter;

public class PaintingAdapter implements PaintingPicture {
    ReadyPaintingPicture readyPaintingPicture;
    public PaintingAdapter(String audioType){
        if(.equalsIgnoreCase("олія")){
            readyPaintingPicture = new OilDraw();

        }else if (.equalsIgnoreCase("акрил")){
            readyPaintingPicture = new AcrylicDraw();
        }
    }
    @Override
    public void draw(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("олія")){
            readyPaintingPicture.drawOil(fileName);
        }
        else if(audioType.equalsIgnoreCase("акрил")){
            readyPaintingPicture.drawAcrylic(fileName);
        }
    }
}





