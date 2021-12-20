package visitor;

public class Sculpture implements PannoPart{
    @Override
    public void accept(PannoPartVisitor pannoPartVisitor) {
        pannoPartVisitor.visit(this);
    }
}



