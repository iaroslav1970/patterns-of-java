package command;

public class Picture {
    private String name = "Зима";
    private int quantity = 10;

    public void like(){
        System.out.println("Картина під назвою "+name+", кількість позитивних відгуків - "+quantity);
    }
    public void dislike(){
        System.out.println("Картина під назвою "+name+", кількість негативних відгуків - "+quantity);
    }

}



