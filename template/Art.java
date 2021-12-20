package template;

public abstract class Art {
    abstract void initialize();
    abstract void startCreate();
    abstract void endCreate();

    //template method
    public final void create(){

        //initialize the game
        initialize();

        //start game
        startCreate();

        //end game
        endCreate();
    }

}



