package mediator;

import java.util.Date;

public class GalleryRoom {
    public static void showReview(Picture picture, String review){
        System.out.println(new Date().toString() + " [" + picture.getName() + "] : " + review);
    }

}



