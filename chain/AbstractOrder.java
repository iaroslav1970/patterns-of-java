package chain;

public abstract class AbstractOrder {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //next element in chain or responsibility
    protected AbstractOrder nextOrder;

    public void setNextLogger(AbstractOrder nextOrder){
        this.nextOrder = nextOrder;
    }

    public void logReview(int level, String review){
        if(this.level <= level){
            write(review);
        }
        if(nextOrder !=null){
            nextOrder.logReview(level, review);
        }
    }

    abstract protected void write(String review);

}




