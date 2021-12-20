package proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Painting painting = new ProxyPainting("картина 'Зима'");


        painting.draw();
        System.out.println("");


        painting.draw();
    }

}



