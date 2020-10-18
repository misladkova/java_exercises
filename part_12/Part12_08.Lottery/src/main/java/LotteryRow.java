
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        for(int i=0; i<7; i++){
            int drawnNumber = new Random().nextInt(40)+1;
            if (!(numbers.contains(drawnNumber))){
                numbers.add(drawnNumber);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return numbers.contains(number);
    }
}


//    the constructor LotteryRow creates a new LotteryRow object that contains new randomized numbers.
//        the method numbers returns the drawn lottery numbers of this lottery row
//        the method containsNumber tells whether the given number is included in the drawn numbers
//        the method randomizeNumbers randomizes new numbers for the lottery row.
//
