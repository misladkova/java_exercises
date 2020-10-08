
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object compared){
        if (this==compared){
            return true;
        }
        if (compared==null || this.getClass()!=compared.getClass()){
            return false;
        }
        Item item = (Item) compared;
        if (this.name.equals(((Item) compared).name)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        if (this.name==null){
            return this.weight;
        }
        return name.hashCode();
    }


}
