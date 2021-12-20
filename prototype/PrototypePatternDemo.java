package prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        PaintingCache.loadCache();

        Painting clonedPainting1 = (Painting) PaintingCache.getPainting("1");
        System.out.println(clonedPainting1.getType()+" живопис на цьому панно.");

        Painting clonedPainting2 = (Painting) PaintingCache.getPainting("2");
        System.out.println(clonedPainting2.getType()+" живопис на цьому панно.");

        Painting clonedPainting3 = (Painting) PaintingCache.getPainting("3");
        System.out.println(clonedPainting3.getType()+" живопис на цьому панно");
    }

}
