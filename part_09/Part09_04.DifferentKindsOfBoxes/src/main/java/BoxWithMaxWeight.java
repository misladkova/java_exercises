import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Item item){
        items.add(item);
        int zvysok = capacity-item.getWeight();
        capacity = zvysok;
        if (zvysok<0){
            items.remove(item);
            capacity+=item.getWeight();
        }
    }

    public boolean isInBox(Item item){
        for (Item value : items) {
            if (value.equals(item)) {
                return true;
            }
        }
        return false;
    }

}
