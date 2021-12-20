package decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Painting tempera = new Tempera();

        Painting redTempera = new RedPaintingDecorator(new Tempera());

        Painting redOil = new RedPaintingDecorator(new Oil());
        System.out.println("Папір звичайний для акрилового живопису");
        tempera.draw();

        System.out.println("\nПапір червоний для акрилового живопису");
        redTempera.draw();

        System.out.println("\nХолст червоний для масляного живопису");
        redOil.draw();
    }

}

