package mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        Picture robert = new Picture("Картина під назвою Ранок");
        Picture john = new Picture("Картина під назвою Зима");

        robert.sendReview("Зроблена купівля");
        john.sendReview("Заброньована для подальшої купівлі");
    }

}



