package chain;

public class ChainPatternDemo {
    private static AbstractOrder getChainOfLoggers(){

        AbstractOrder errorOrder = new ErrorOrder(AbstractOrder.ERROR);
        AbstractOrder fileOrder = new FileOrder(AbstractOrder.DEBUG);
        AbstractOrder consoleOrder = new ConsoleOrder(AbstractOrder.INFO);

        errorOrder.setNextLogger(fileOrder);
        fileOrder.setNextLogger(consoleOrder);

        return errorOrder;
    }

    public static void main(String[] args) {
        AbstractOrder loggerChain = getChainOfLoggers();

        loggerChain.logReview(AbstractOrder.INFO,
                "Це є певна інформація.");

        loggerChain.logReview(AbstractOrder.DEBUG,
                "Це інформація про рівень налагодження.");

        loggerChain.logReview(AbstractOrder.ERROR,
                "Це є помилкова інформація.");

    }
}



