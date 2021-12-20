package visitor;

public interface PannoPartVisitor {
    public void visit(Panno panno);
    public void visit(Sculpture sculpture);
    public void visit(Backlight backlight);
    public void visit(Mosaic mosaic);

}



