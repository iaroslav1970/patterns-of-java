package singleton;

public class PaintingObject {
    //create an object of PaintingObject
    private static PaintingObject instance = new PaintingObject();

    //make the constructor private so that this class cannot be
    //instantiated
    private PaintingObject(){}

    //Get the only object available
    public static PaintingObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Ця картина створена за дивних обставин.");
    }
}


