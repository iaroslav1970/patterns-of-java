package abstract_factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("живопис")){
            return new PaintingFactory();

        }else if(choice.equalsIgnoreCase("матеріал для живопису")){
            return new BaseFactory();
        }

        return null;
    }

}



