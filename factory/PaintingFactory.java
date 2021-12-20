package factory;

public class PaintingFactory extends AbstractFactory{
    //use getShape method to get object of type shape
    public Painting getPainting(String paintingType){
        if(paintingType == null){
            return null;
        }
        if(paintingType.equalsIgnoreCase("Масляна")){
            return new Oil();

        } else if(paintingType.equalsIgnoreCase("Акрилова")){
            return new Acrylic();

        } else if(paintingType.equalsIgnoreCase("Темперна")){
            return new Tempera();
        }

        return null;
    }
}





