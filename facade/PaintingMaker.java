package facade;

public class PaintingMaker {
    private Painting oil;
    private Painting acrylic;
    private Painting tempera;

    public PaintingMaker() {
        oil=new Oil();
        acrylic=new Acrylic();
        tempera=new Tempera();
    }
    public void drawOil(){
        oil.draw();
    }
    public void drawAcrylic(){
        acrylic.draw();
    }
    public void drawTempera(){
        tempera.draw();
    }

}



