package observer;

public class UkranianObserver extends Observer{
    public UkranianObserver(Picture picture){
        this.picture = picture;
        this.picture.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Індекс зацікавленості українського покупця картини: " + Integer.toOctalString( picture.getState() +2) );
    }
}



