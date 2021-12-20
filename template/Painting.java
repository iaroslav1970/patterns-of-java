package template;

public class Painting extends Art{
    @Override
    void endCreate() {
        System.out.println("Малювання картини завершено!");
    }

    @Override
    void initialize() {
        System.out.println("Малювання картини є ініціализованим! Конкурс почався!");
    }

    @Override
    void startCreate() {
        System.out.println("Малювання картини почато!");
    }

}



