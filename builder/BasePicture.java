package builder;

public abstract class BasePicture implements Item{
    @Override
    public Drawing drawing() {
        return new Material();
    }

    @Override
    public abstract float price();

}


