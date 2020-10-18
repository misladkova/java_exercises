
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        Collections.sort(numbers);
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        int i=0;
        while(i<7){
            int drawnNumber = new Random().nextInt(40)+1;
            if(!(containsNumber(drawnNumber))){
                numbers.add(drawnNumber);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}



