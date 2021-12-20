package decorator;

public class RedPaintingDecorator extends PaintingDecorator{
    public RedPaintingDecorator(Painting decoratedPainting) {
        super(decoratedPainting);
    }

    @Override
    public void draw() {
        decoratedPainting.draw();
        setRedBorder(decoratedPainting);
    }

    private void setRedBorder(Painting decoratedPainting){
        System.out.println("Рамка картина червона");
    }

}




