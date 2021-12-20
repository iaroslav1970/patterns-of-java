package flyweight;

public class Picture implements Painting{
    private String technique;
    private int length;
    private int width;

    public Picture(String technique) {
        this.technique = technique;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Техніка виконання картини " + technique + ", довжина картини "+ length +" см, " + "ширина картини " + width+" см.");
    }

}



