package iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameGallery namesGallery = new NameGallery();

        for(Iterator iter = namesGallery.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Картина художника Глущенко: " + name);
        }
    }

}



