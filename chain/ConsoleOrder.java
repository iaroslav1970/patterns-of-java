package chain;

public class ConsoleOrder extends AbstractOrder{
    public ConsoleOrder(int level){
        this.level = level;
    }

    @Override
    protected void write(String review) {
        System.out.println("Табло нормальних замовлень: " + review);
    }


}

