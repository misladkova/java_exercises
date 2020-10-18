
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }
        this.square = new int[size][size];
    }

    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> rowsSum = new ArrayList();
        for (int r = 0; r < square.length; r++) {
            int sum = 0;
            for (int c = 0; c < square.length; c++) {
                sum += square[r][c];
            }
            rowsSum.add(sum);
        }
        return rowsSum;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> columnsSum = new ArrayList();
        for (int c = 0; c < square.length; c++) {
            int sum = 0;
            for (int r = 0; r < square.length; r++) {
                sum += square[r][c];
            }
            columnsSum.add(sum);
        }
        return columnsSum;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> diagonalsSum = new ArrayList<>();
        int sum1 = 0;
        for (int r = 0; r < square.length; r++) {
            for (int c = 0; c < square.length; c++) {
                if (r == c) {
                    sum1 += square[r][c];
                }
            }
        }
        diagonalsSum.add(sum1);

        int sum2 = 0;
        for (int r = 0; r < square.length; r++) {
            for (int c =0; c< square.length; c++) {
                if (c== square.length-r-1) {
                    sum2 += square[r][c];
                }
            }
        }
        diagonalsSum.add(sum2);

        return diagonalsSum;

    }

    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }
        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return -1;
        }
        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }
        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
