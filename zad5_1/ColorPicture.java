package zad5_1;

public class ColorPicture implements PaintingPicture {
    PaintingAdapter paintingAdapter;

    @Override
    public void draw(String audioType, String fileName) {


        if(audioType.equalsIgnoreCase("темпера")){
            System.out.println("Картина в темперній техніці має таку назву: " + fileName);
        }


        else if(audioType.equalsIgnoreCase("олія") || audioType.equalsIgnoreCase("акрил")){
            paintingAdapter = new PaintingAdapter(audioType);
            paintingAdapter.draw(audioType, fileName);
        }

        else{
            System.out.println("Картини в техніці " + audioType + " у музеї немає.");
        }
    }
}


