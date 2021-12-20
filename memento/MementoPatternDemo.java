package memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setLayer("шар картини номер 1");
        originator.setLayer("шар картини номер 2");
        careTaker.add(originator.saveLayerToMemento());

        originator.setLayer("шар картини номер 3");
        careTaker.add(originator.saveLayerToMemento());

        originator.setLayer("шар картини номер 4");
        System.out.println("поточний шар " + originator.getLayer());

        originator.getLayerFromMemento(careTaker.get(0));
        System.out.println("Перший затверджений шар картини: " + originator.getLayer());
        originator.getLayerFromMemento(careTaker.get(1));
        System.out.println("Другий затверджений шар картини: " + originator.getLayer());

    }
}
