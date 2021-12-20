package interpreter;

public class InterpreterPatternDemo {
    //Rule: Robert and John are male
    public static Review  getImpressionismReview(){
        Review  renoir = new TerminalReview("Ренуар");
        Review  impressionist = new TerminalReview("Імпресіоніст");
        return new OrReview(renoir, impressionist);
    }

    //Rule: Julie is a married women
    public static Review  getUkranianWomanReview(){
        Review  iablonska = new TerminalReview("Яблонська");
        Review  bilokour = new TerminalReview("Заміжня");
        return new AndReview(iablonska, bilokour);
    }

    public static void main(String[] args) {
        Review  isImpressionist = getImpressionismReview();
        Review  isUkrainWoman = getUkranianWomanReview();

        System.out.println("Художник Ренуар імпресіоніст? " + isImpressionist.explain("імпресіоніст Ренуар"));
        System.out.println("Художник Яблонська була заміжня? " + isUkrainWoman.explain("Заміжня Яблонська"));
    }

}


