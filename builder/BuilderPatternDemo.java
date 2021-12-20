package builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        PaintingBuilder paintingBuilder = new PaintingBuilder();

        Painting oilPainting = paintingBuilder.prepareOilPainting();
        System.out.println("Масляна живопис");
        oilPainting.showItems();
        System.out.println("Загальна вартість: " + oilPainting.getCost());

        Painting temperaPainting = paintingBuilder.prepareTemperaPainting();
        System.out.println("\n\nТемперна живопис");
        temperaPainting.showItems();
        System.out.println("Загальна вартість: " + temperaPainting.getCost());

    }
}


