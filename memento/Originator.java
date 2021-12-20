package memento;

public class Originator {
    private String layer;

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }
    public Memento saveLayerToMemento(){
        return new Memento(layer);
    }

    public void getLayerFromMemento(Memento Memento){
        layer = Memento.getLayer();
    }

}

