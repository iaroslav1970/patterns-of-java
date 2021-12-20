package builder;

import java.util.ArrayList;
import java.util.List;

public class Painting {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){

        for (Item item : items) {
            System.out.print("Тип змальованої картини: " + item.name());
            System.out.print(", тип фарб: " + item.drawing().draw());
            System.out.println(", Price : " + item.price());
        }
    }

}


