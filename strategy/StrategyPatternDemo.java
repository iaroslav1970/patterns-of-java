package strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationOil());
        System.out.println("Коефіцієнт унікальної вартості для масляного живопису складає " + context.executeStrategy(10, 5));

        context = new Context(new OperationAcrylic());
        System.out.println("Коефіцієнт унікальної вартості для акрилового живопису складає " + context.executeStrategy(55, 5));

        context = new Context(new OperationTempera());
        System.out.println("Коефіцієнт унікальної вартості для темперного живопису складає " + context.executeStrategy(5, 2));

    }
}
