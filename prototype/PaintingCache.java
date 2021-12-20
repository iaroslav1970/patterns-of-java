package prototype;

import java.util.Hashtable;

public class PaintingCache {
    private static Hashtable<String, Painting> paintingMap  = new Hashtable<String, Painting>();

    public static Painting getPainting(String paintingId) {
        Painting cachedPainting = paintingMap.get(paintingId);
        return (Painting) cachedPainting.clone();
    }



    public static void loadCache() {
        Acrylic acrylic = new Acrylic();
        acrylic.setId("1");
        paintingMap.put(acrylic.getId(),acrylic);

        Tempera tempera = new Tempera();
        tempera.setId("2");
        paintingMap.put(tempera.getId(),tempera);

        Oil oil = new Oil();
        oil.setId("3");
        paintingMap.put(oil.getId(), oil);
    }

}
