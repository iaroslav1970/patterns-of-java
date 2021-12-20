package visitor;

public class Backlight implements PannoPart{
    @Override
    public void accept(PannoPartVisitor pannoPartVisitor) {
        pannoPartVisitor.visit(this);
    }
}


