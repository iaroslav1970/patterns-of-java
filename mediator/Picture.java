package mediator;

public class Picture {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Picture(String name) {
        this.name = name;
    }
    public void sendReview(String review){
        GalleryRoom.showReview(this,review);
    }

}



