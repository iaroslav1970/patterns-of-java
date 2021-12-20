package command;

public class DislikePicture implements Evaluation{
    private Picture abcPicture;

    public DislikePicture(Picture abcPicture){
        this.abcPicture = abcPicture;
    }

    public void execute() {
        abcPicture.dislike();
    }

}



