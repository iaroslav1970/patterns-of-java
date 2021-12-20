package state;

public class StopDrawing implements Drawing{
    public void doAction(Context context) {
        System.out.println("Художник закінчує малювати");
        context.setDrawing(this);
    }

    public String toString(){
        return "Закінчення малювання";
    }
}


