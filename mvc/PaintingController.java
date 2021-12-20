package mvc;

public class PaintingController {
    private Painting model;
    private PaintingView view;

    public PaintingController(Painting model, PaintingView view) {
        this.model = model;
        this.view = view;
    }

    public void setPaintingName(String name){
        model.setName(name);
    }

    public String getPaintingSName(){
        return model.getName();
    }

    public void setPaintingGenre(String genre){
        model.setGenre(genre);
    }

    public String getPaintingGenre(){
        return model.getGenre();
    }


    public void updateView(){
        view.printPaintingDetails(model.getName(), model.getGenre());
    }

}
