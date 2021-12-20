package abstract_factory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        AbstractFactory paintingFactory = FactoryProducer.getFactory("живопис");

        Painting painting1 = paintingFactory.getPainting("Акрилова");

        painting1.draw();

        Painting painting2 = paintingFactory.getPainting("Масляна");

        painting2.draw();

        Painting painting3 = paintingFactory.getPainting("Темперна");

        painting3.draw();

        AbstractFactory baseFactory = FactoryProducer.getFactory("матеріал для живопису");

        Base base1 = baseFactory.getBase("Холст");

        //call fill method of Red
        base1.fill();

        //get an object of Color Green
        Base base2 = baseFactory.getBase("Дошка");

        //call fill method of Green
        base2.fill();

        //get an object of Color Blue
        Base base3 = baseFactory.getBase("Папір");

        //call fill method of Color Blue
        base3.fill();
    }
    }
