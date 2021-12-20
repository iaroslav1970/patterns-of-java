package observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Picture picture = new Picture();

        new ItalianObserver(picture);
        new GermanObserver(picture);
        new UkranianObserver(picture);

        System.out.println("Перший раунд аукціону: 10");
        picture.setState(20);
        System.out.println("Другий раунд аукціону: 50");
        picture.setState(50);

    }
}


