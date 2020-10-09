import java.util.ArrayList;

public class Box implements Packable{

    private double maximumCapacity;
    private ArrayList<Packable> box;

    public Box(double maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.box = new ArrayList<>();
    }

    public void add(Packable packable){
        double zvysok = 0.0;
        box.add(packable);
        zvysok = maximumCapacity-packable.weight();
        if (zvysok<0){
            box.remove(packable);
            maximumCapacity=zvysok+packable.weight();
        }
        maximumCapacity = zvysok;
    }

    @Override
    public double weight() {
        double totalWeight = 0.0;
        for (Packable packable: box){
            totalWeight+=packable.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString(){
        return "Box: "+box.size()+" items, total weight "+weight()+" kg";
    }
}
