package state;

public class Context {

    private Drawing drawing;

    public Context(){
        drawing = null;
    }

    public void setDrawing(Drawing drawing){
        this.drawing = drawing;
    }

    public Drawing getDrawing(){
        return drawing;
    }

}


