package proxy;

public class RealPainting implements Painting{
    private String fileName;

    public RealPainting(String fileName){
        this.fileName = fileName;
        copyPicture(fileName);
    }

    @Override
    public void draw() {
        System.out.println("Демонстрація оригіналу " + fileName);
    }

    private void copyPicture(String fileName){
        System.out.println("Демонстрація копії " + fileName);
    }

}
