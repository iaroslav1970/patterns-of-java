package chain;

public class ErrorOrder extends AbstractOrder{
    public ErrorOrder(int level){
        this.level = level;
    }

    @Override
    protected void write(String review) {
        System.out.println("Табло помилкових замовлень: " + review);
    }


}




