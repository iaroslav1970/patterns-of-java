package abstract_factory;

public abstract class AbstractFactory {
    abstract Base getBase(String base);
    abstract Painting getPainting(String painting);
}
