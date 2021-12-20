package composite;

public class CompositePatternDemo {
    public static void main(String[] args) {

        Painting oil1 = new Painting("Зима","олія", 101);

        Painting acryl1 = new Painting("Весна","акрил", 102);

        Painting tempera1 = new Painting("Літо","темпера", 103);

        Painting acryl2 = new Painting("Осінь","акрил", 104);
        Painting acryl3 = new Painting("Ліс вранку","акрил", 105);

        Painting tempera2 = new Painting("Море","темпера", 106);
        Painting tempera3 = new Painting("Ріка","темпера", 107);

        oil1.add(acryl1);
        oil1.add(tempera1);

        acryl1.add(tempera2);
        acryl1.add(tempera3);

        tempera1.add(acryl2);
        tempera1.add(acryl3);

        //print all employees of the organization
        System.out.println(oil1);

        for (Painting headPainting : oil1.getCatalog()) {
            System.out.println(headPainting);

            for (Painting рainting : headPainting.getCatalog()) {
                System.out.println(рainting);
            }
        }
    }

}
