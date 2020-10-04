import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
        int zvysok = maximumWeight - item.getWeight();
        maximumWeight = zvysok;
        if (zvysok < 0) {
            maximumWeight = zvysok + item.getWeight();
            this.items.remove(item);
        }
    }

    public String toString() {
        int vaha = 0;
        for (Item item : items) {
            vaha += item.getWeight();
        }
        if (items.isEmpty()) {
            return "no items (" + vaha + " kg)";
        }
        if (items.size() == 1) {
            return "1 item (" + vaha + " kg)";
        }
        return this.items.size() + " items (" + vaha + " kg)";
    }

    public void printItems() {
        String print = "";
        int i = 0;
        for (Item item : items) {
            print = print + item.getName() + " (" + item.getWeight() + " kg)";
            if (i < items.size() - 1) {
                print = print + "\n";
            }
            i++;
        }
        System.out.println(print);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

}





