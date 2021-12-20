package template;

public class TemplatePatternDemo {
    public static void main(String[] args) {

        Art art = new Painting();
        art.create();
        System.out.println();
        art = new Sculpture();
        art.create();
    }

}



