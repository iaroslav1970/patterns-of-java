package state;

public class StartDrawing implements Drawing{
    public void doAction(Context context) {
        System.out.println("Художник починає малювати");
        context.setDrawing(this);
    }

    public String toString(){
        return "Початок малювання";
    }

}


