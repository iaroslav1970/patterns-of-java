package visitor;

public class Mosaic implements PannoPart{
    @Override
    public void accept(PannoPartVisitor pannoPartVisitor) {
        pannoPartVisitor.visit(this);
    }
}



