package visitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        PannoPart computer = new Panno();
        computer.accept(new PannoPartDisplayVisitor());

    }
}





