package command;

public class LikePicture implements Evaluation{
    private Picture abcPicture;

    public LikePicture(Picture abcPicture){
        this.abcPicture = abcPicture;
    }

    public void execute() {
        abcPicture.like();
    }

}




