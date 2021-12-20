package command;

import java.util.ArrayList;
import java.util.List;

public class Curator {
    private List<Evaluation> evaluationList = new ArrayList<Evaluation>();

    public void takeEvaluation(Evaluation evaluation){
        evaluationList.add(evaluation);
    }

    public void placeEvaluations(){

        for (Evaluation evaluation : evaluationList) {
            evaluation.execute();
        }
        evaluationList.clear();
    }

}




