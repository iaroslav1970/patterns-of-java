package abstract_factory;

public class BaseFactory extends AbstractFactory{
    @Override
    public Painting getPainting(String paintingType){
        return null;
    }

    @Override
    Base getBase(String base) {

        if(base == null){
            return null;
        }

        if(base.equalsIgnoreCase("Холст")){
            return new Canvas();

        }else if(base.equalsIgnoreCase("Дошка")){
            return new Board();

        }else if(base.equalsIgnoreCase("Папір")){
            return new Paper();
        }

        return null;
    }
}
