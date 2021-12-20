package observer;

public class GermanObserver extends Observer{
    public GermanObserver(Picture picture){
        this.picture = picture;
        this.picture.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Індекс зацікавленості німецького покупця картини: " + Integer.toOctalString( picture.getState() ) );
    }

}


