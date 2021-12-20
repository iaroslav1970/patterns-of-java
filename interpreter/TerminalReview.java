package interpreter;

public class TerminalReview implements Review{
    private String information;

    public TerminalReview(String information) {
        this.information = information;
    }

    @Override
    public boolean explain(String context) {

        if(context.contains(information)){
            return true;
        }
        return false;
    }
}


