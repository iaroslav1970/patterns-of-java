package builder;

public abstract class Picture implements Item{
    @Override
    public Drawing drawing() {
        return new Sketch();
    }

    @Override
    public float price() {
     return 0;
    }

}


