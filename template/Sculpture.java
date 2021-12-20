package template;

public class Sculpture extends Art{
    @Override
    void endCreate() {
        System.out.println("Ліплення скульптури завершено!");
    }

    @Override
    void initialize() {
        System.out.println("Ліплення скульптури є ініціализованим! Конкурс почався!");
    }

    @Override
    void startCreate() {
        System.out.println("Ліплення скульптури почато!");
    }
}




