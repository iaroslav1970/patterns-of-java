package state;



public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        StartDrawing startDrawing = new StartDrawing();
        startDrawing.doAction(context);

        System.out.println(context.getDrawing().toString());

        StopDrawing stopDrawing = new StopDrawing();
        stopDrawing.doAction(context);




        System.out.println(context.getDrawing().toString());

    }
}

