package builder;

public class PaintingBuilder {
    public Painting prepareOilPainting (){
        Painting painting = new Painting();
        painting.addItem(new OilPicture());
        painting.addItem(new Canvas());
        return painting;
    }

    public Painting prepareTemperaPainting (){
        Painting painting = new Painting();
        painting.addItem(new TemperaPicture());
        painting.addItem(new Paper());
        return painting;
    }

}







