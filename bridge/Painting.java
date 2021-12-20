package bridge;

public abstract class Painting {
    protected DrawAPI drawAPI;

    protected Painting(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();

}


