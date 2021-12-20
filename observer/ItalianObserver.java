package observer;

public class ItalianObserver extends Observer{
    public ItalianObserver(Picture picture){
        this.picture = picture;
        this.picture.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Індекс зацікавленості італійського покупця картини: " + Integer.toHexString( picture.getState() ) );
    }
}




