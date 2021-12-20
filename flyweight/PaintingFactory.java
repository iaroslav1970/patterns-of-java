package flyweight;

import java.util.HashMap;

public class PaintingFactory {
    private static final HashMap<String, Painting> pictureMap = new HashMap();

    public static Painting getPicture(String technique) {
        Picture picture = (Picture)pictureMap.get(technique);

        if(picture == null) {
            picture = new Picture(technique);
            pictureMap.put(technique, picture);
            System.out.println("Cтворення картини в заданих параметрах : " + technique);
        }
        return picture;
    }

}



