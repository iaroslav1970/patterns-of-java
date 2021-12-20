package mvc;

public class MVCPatternDemo {
    public static void main(String[] args) {


        Painting model  = retrivePaintingFromDatabase();

        //Create a view : to write student details on console
        PaintingView view = new PaintingView();

        PaintingController controller = new PaintingController(model, view);

        controller.updateView();


        controller.setPaintingName("Акрилова живопис");

        controller.updateView();
    }

    private static Painting retrivePaintingFromDatabase(){
        Painting painting = new Painting();
        painting.setName("Масляна живопис");
        painting.setGenre("Портрет");
        return painting;
    }

}
