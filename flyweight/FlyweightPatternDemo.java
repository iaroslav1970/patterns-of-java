package flyweight;

public class FlyweightPatternDemo {
    private static final String technics[] = { "Акрилова", "Масляна", "Темперна", "Акварельна", "Пастельна" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Picture picture = (Picture)PaintingFactory.getPicture(getRandomTechnique());
            picture.setLength(getRandomLength());
            picture.setWidth(getRandomWidth());

            picture.draw();
        }
    }
    private static String getRandomTechnique() {
        return technics[(int)(Math.random()*technics.length)];
    }
    private static int getRandomLength() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomWidth() {
        return (int)(Math.random()*100);
    }

}




