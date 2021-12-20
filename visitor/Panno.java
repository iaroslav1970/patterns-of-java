package visitor;

public class Panno implements PannoPart{
    PannoPart[] parts;

    public Panno(){
        parts = new PannoPart[] {new Sculpture(), new Backlight(), new Mosaic()};
    }


    @Override
    public void accept(PannoPartVisitor pannoPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(pannoPartVisitor);
        }
        pannoPartVisitor.visit(this);
    }

}


