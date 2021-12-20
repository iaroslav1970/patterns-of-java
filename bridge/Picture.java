package bridge;

public class Picture extends Painting{
    private int length;
    private int width;
    public Picture(int length, int width,DrawAPI drawAPI) {
        super(drawAPI);
        this.length = length;
        this.width = width;
    }
    public void draw() {
        drawAPI.drawPicture(length, width);
    }

}


