import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BirdsRegister {

    private ArrayList<Bird> birds;

    public BirdsRegister() {
        this.birds = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public void observation(String name) {
        int count = 0;
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not a bird!");
        }
    }

    public void printOneBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().contains(name)) {
                System.out.println(bird);
            }
        }
    }

    public void printBirds() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
}
