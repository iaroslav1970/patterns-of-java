package visitor;

public class PannoPartDisplayVisitor implements PannoPartVisitor{
    @Override
    public void visit(Panno panno) {
        System.out.println("Демонстрація панно.");
    }

    @Override
    public void visit(Sculpture sculpture) {
        System.out.println("Демонстрація скульптури.");
    }

    @Override
    public void visit(Backlight backlight) {
        System.out.println("Демонстрація підсвічування.");
    }

    @Override
    public void visit(Mosaic mosaic) {
        System.out.println("Демонстрація мозаїки.");
    }

}


