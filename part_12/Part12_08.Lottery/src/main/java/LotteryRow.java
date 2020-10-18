
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        for(int i=0; i<7; i++){
            int drawnNumber = new Random().nextInt(40)+1;
            if(containsNumber(drawnNumber)){
                numbers.add(drawnNumber);
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}



