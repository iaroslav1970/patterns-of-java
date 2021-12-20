package command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Picture abcPicture = new Picture();

        LikePicture likePictureEvaluation = new LikePicture(abcPicture);
        DislikePicture dislikePictureEvaluation = new DislikePicture(abcPicture);

        Curator broker = new Curator();
        broker.takeEvaluation(likePictureEvaluation);
        broker.takeEvaluation(dislikePictureEvaluation);

        broker.placeEvaluations();

    }
}
