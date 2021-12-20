package factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("Живопис")){
            return new PaintingFactory();

        }else if(choice.equalsIgnoreCase("Основа для живопису")){
            return new BaseFactory();
        }

        return null;
    }

}
