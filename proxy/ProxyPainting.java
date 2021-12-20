package proxy;

public class ProxyPainting implements Painting{
    private RealPainting realPainting;
    private String fileName;

    public ProxyPainting(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void draw() {
        if(realPainting == null){
            realPainting = new RealPainting(fileName);
        }
        realPainting.draw();
    }

}



