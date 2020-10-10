
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();
            if (input.equals("-1")){
                break;
            }
            numbers.add(input);
        }

        numbers.stream()
                .mapToInt(s->Integer.valueOf(s))
                .filter(s->s>=1&&s<=5)
                .forEach(System.out::println);

    }
}
