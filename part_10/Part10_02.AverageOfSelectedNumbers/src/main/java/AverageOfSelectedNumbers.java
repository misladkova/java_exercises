
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> allNumbers = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String number = scanner.nextLine();
            if (number.equals("end")){
                break;
            }
            allNumbers.add(number);
        }

        System.out.println();
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        if (input.equals("n")){
            double average = allNumbers.stream()
                .mapToInt(s->Integer.valueOf(s))
                .filter(number->number<0)
                .average()
                .getAsDouble();
            System.out.println("Average of the negative numbers: "+average);
        }
        if (input.equals("p")){
            double average = allNumbers.stream()
                .mapToInt(s->Integer.valueOf(s))
                .filter(number->number>=0)
                .average()
                .getAsDouble();
            System.out.println("Average of the positive numbers: "+average);
        }



    }
}
