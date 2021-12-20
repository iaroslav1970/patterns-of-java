package decorator;

public abstract class PaintingDecorator implements Painting{
    protected Painting decoratedPainting;

    public PaintingDecorator(Painting decoratedPainting){
        this.decoratedPainting = decoratedPainting;
    }

    public void draw(){
        decoratedPainting.draw();
    }

}



