package abstract_factory;

public class PaintingFactory extends AbstractFactory {
    @Override
    Base getBase(String base) {
        return null;
    }

    @Override
    public Painting getPainting(String paintingType) {
        if (paintingType == null) {
            return null;
        }
        if (paintingType.equalsIgnoreCase("Масляна")) {
            return new Oil();

        } else if (paintingType.equalsIgnoreCase("Акрилова")) {
            return new Acrylic();

        } else if (paintingType.equalsIgnoreCase("Темперна")) {
            return new Tempera();
        }

        return null;
    }
}
