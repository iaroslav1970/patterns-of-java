package chain;

public class FileOrder extends AbstractOrder{
    public FileOrder(int level){
        this.level = level;
    }

    @Override
    protected void write(String review) {
        System.out.println("Файл замовлень: " + review);
    }

}


