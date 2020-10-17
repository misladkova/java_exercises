
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> numbers = new HashMap<>();

        numbers.add(1, "one");
        numbers.add(2, "two");
        numbers.add(3, "three");

        System.out.println(numbers.get(2));

        System.out.println(numbers.remove(1));
    }

}
