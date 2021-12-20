package composite;

import java.util.ArrayList;
import java.util.List;

public class Painting {
    private String name;
    private String technique;
    private int number;
    private List<Painting> catalog;

    // constructor
    public Painting(String name,String technique, int number) {
        this.name = name;
        this.technique = technique;
        this.number = number;
        catalog = new ArrayList<Painting>();
    }

    public void add(Painting e) {
        catalog.add(e);
    }

    public void remove(Painting e) {
        catalog.remove(e);
    }

    public List<Painting> getCatalog(){
        return catalog;
    }

    public String toString(){
        return ("Каталог :[ Назва картини - " + name + ", техніка живопису - " + technique + ", номер в каталозі - " + number+" ]");
    }

}


