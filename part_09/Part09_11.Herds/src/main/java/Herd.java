import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public String toString() {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < herd.size(); i++) {
            a.append(herd.get(i).toString());
            if (i < herd.size() - 1) {
                a.append("\n");
            }
        }
        return a.toString();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism : herd) {
            organism.move(dx, dy);
        }
    }
}
