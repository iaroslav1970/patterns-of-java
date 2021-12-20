package singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor PaintingObject() is not visible
        //PaintingObject object = new PaintingObject();

        //Get the only object available
        PaintingObject object = PaintingObject.getInstance();

        //show the message
        object.showMessage();

    }
}