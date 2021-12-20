package zad5_1;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        ColorPicture colorPicture = new ColorPicture();

        colorPicture.draw("темпера", "'Зима'(Темпера).");
        colorPicture.draw("акрил", "'Весна'(Акрил).");
        colorPicture.draw("олія", "'Літо'(Олія).");
        colorPicture.draw("акварель", "'Осінь'(Акварель).");
    }
}








